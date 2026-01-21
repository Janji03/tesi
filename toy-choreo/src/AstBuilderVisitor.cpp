#include "AstBuilderVisitor.h"
#include <any>
#include <stdexcept>

ast::Program AstBuilderVisitor::build(ToyChoreoParser::ProgramContext* ctx) {
  auto anyProg = visitProgram(ctx); // std::any
  try {
    return std::any_cast<ast::Program>(anyProg);
  } catch (const std::bad_any_cast&) {
    throw std::runtime_error("AstBuilderVisitor: bad_any_cast while building Program");
  }
}

std::vector<ast::Stmt> AstBuilderVisitor::buildStmtList(const std::vector<ToyChoreoParser::StmtContext*>& stmts) {
  std::vector<ast::Stmt> out;
  out.reserve(stmts.size());

  for (auto* s : stmts) {
    auto anyStmt = visit(s); // std::any
    try {
      out.push_back(std::any_cast<ast::Stmt>(anyStmt));
    } catch (const std::bad_any_cast&) {
      throw std::runtime_error("AstBuilderVisitor: bad_any_cast while building Stmt");
    }
  }

  return out;
}

antlrcpp::Any AstBuilderVisitor::visitProgram(ToyChoreoParser::ProgramContext* ctx) {
  ast::Program p;
  p.stmts = buildStmtList(ctx->stmt());
  return p;
}

antlrcpp::Any AstBuilderVisitor::visitLetStmt(ToyChoreoParser::LetStmtContext* ctx) {
  ast::Let s;
  s.var = ctx->ID(0)->getText();
  s.rhs = ctx->ID(1)->getText();
  return ast::Stmt{s};
}

antlrcpp::Any AstBuilderVisitor::visitSendStmt(ToyChoreoParser::SendStmtContext* ctx) {
  ast::Send s;
  s.from = ctx->ID(0)->getText();
  s.to   = ctx->ID(1)->getText();
  s.msg  = ctx->ID(2)->getText();
  return ast::Stmt{s};
}

antlrcpp::Any AstBuilderVisitor::visitBlock(ToyChoreoParser::BlockContext* ctx) {
  // Un block è una lista di stmt
  return buildStmtList(ctx->stmt());
}

antlrcpp::Any AstBuilderVisitor::visitIfStmt(ToyChoreoParser::IfStmtContext* ctx) {
  auto node = std::make_shared<ast::If>();
  node->cond = ctx->ID()->getText();

  auto anyThen = visit(ctx->block(0));
  auto anyElse = visit(ctx->block(1));

  try {
    node->thenBranch = std::any_cast<std::vector<ast::Stmt>>(anyThen);
    node->elseBranch = std::any_cast<std::vector<ast::Stmt>>(anyElse);
  } catch (const std::bad_any_cast&) {
    throw std::runtime_error("AstBuilderVisitor: bad_any_cast while building If branches");
  }

  return ast::Stmt{node};
}

antlrcpp::Any AstBuilderVisitor::visitRaceStmt(ToyChoreoParser::RaceStmtContext* ctx) {
  auto node = std::make_shared<ast::Race>();
  node->raceId = ctx->ID()->getText();

  auto anyLeft  = visit(ctx->block(0));
  auto anyRight = visit(ctx->block(1));

  try {
    node->left  = std::any_cast<std::vector<ast::Stmt>>(anyLeft);
    node->right = std::any_cast<std::vector<ast::Stmt>>(anyRight);
  } catch (const std::bad_any_cast&) {
    throw std::runtime_error("AstBuilderVisitor: bad_any_cast while building Race branches");
  }

  return ast::Stmt{node};
}
