#pragma once
#include "Ast.h"

#include "ToyChoreoBaseVisitor.h"
#include "ToyChoreoParser.h"

class AstBuilderVisitor : public ToyChoreoBaseVisitor {
public:
  ast::Program build(ToyChoreoParser::ProgramContext* ctx);

  antlrcpp::Any visitProgram(ToyChoreoParser::ProgramContext* ctx) override;
  antlrcpp::Any visitLetStmt(ToyChoreoParser::LetStmtContext* ctx) override;
  antlrcpp::Any visitSendStmt(ToyChoreoParser::SendStmtContext* ctx) override;
  antlrcpp::Any visitIfStmt(ToyChoreoParser::IfStmtContext* ctx) override;
  antlrcpp::Any visitRaceStmt(ToyChoreoParser::RaceStmtContext* ctx) override;
  antlrcpp::Any visitBlock(ToyChoreoParser::BlockContext* ctx) override;

private:
  // utility: visita una lista di stmt parse tree e la converte in vector<ast::Stmt>
  std::vector<ast::Stmt> buildStmtList(const std::vector<ToyChoreoParser::StmtContext*>& stmts);
};
