#include "PrettyPrintVisitor.h"
#include <iostream>

void PrettyPrintVisitor::printLine(const std::string& s) {
  std::cout << pad() << s << "\n";
}

std::string PrettyPrintVisitor::pad() const {
  return std::string(indent * 2, ' ');
}

antlrcpp::Any PrettyPrintVisitor::visitProgram(ToyChoreoParser::ProgramContext* ctx) {
  // visita tutti gli stmt figli
  for (auto* s : ctx->stmt()) {
    visit(s);
  }
  return nullptr;
}

antlrcpp::Any PrettyPrintVisitor::visitLetStmt(ToyChoreoParser::LetStmtContext* ctx) {
  // let ID = ID ;
  const auto var = ctx->ID(0)->getText();
  const auto rhs = ctx->ID(1)->getText();
  printLine("LET " + var + " = " + rhs);
  return nullptr;
}

antlrcpp::Any PrettyPrintVisitor::visitSendStmt(ToyChoreoParser::SendStmtContext* ctx) {
  // send ID -> ID : ID ;
  const auto from = ctx->ID(0)->getText();
  const auto to   = ctx->ID(1)->getText();
  const auto msg  = ctx->ID(2)->getText();
  printLine("SEND " + from + " -> " + to + " : " + msg);
  return nullptr;
}

antlrcpp::Any PrettyPrintVisitor::visitIfStmt(ToyChoreoParser::IfStmtContext* ctx) {
  const auto cond = ctx->ID()->getText();
  printLine("IF " + cond);

  indent++;
  visit(ctx->block(0)); // then
  indent--;
  printLine("ELSE");
  indent++;
  visit(ctx->block(1)); // else
  indent--;

  return nullptr;
}

antlrcpp::Any PrettyPrintVisitor::visitRaceStmt(ToyChoreoParser::RaceStmtContext* ctx) {
  const auto rid = ctx->ID()->getText();
  printLine("RACE " + rid);

  indent++;
  visit(ctx->block(0)); // left
  visit(ctx->block(1)); // right
  indent--;

  return nullptr;
}

antlrcpp::Any PrettyPrintVisitor::visitBlock(ToyChoreoParser::BlockContext* ctx) {
  for (auto* s : ctx->stmt()) {
    visit(s);
  }
  return nullptr;
}
