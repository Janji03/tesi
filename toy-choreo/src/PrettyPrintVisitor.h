#pragma once
#include <string>
#include <antlr4-runtime.h>

#include "ToyChoreoBaseVisitor.h"
#include "ToyChoreoParser.h"

class PrettyPrintVisitor : public ToyChoreoBaseVisitor {
public:
  antlrcpp::Any visitProgram(ToyChoreoParser::ProgramContext* ctx) override;
  antlrcpp::Any visitLetStmt(ToyChoreoParser::LetStmtContext* ctx) override;
  antlrcpp::Any visitSendStmt(ToyChoreoParser::SendStmtContext* ctx) override;
  antlrcpp::Any visitIfStmt(ToyChoreoParser::IfStmtContext* ctx) override;
  antlrcpp::Any visitRaceStmt(ToyChoreoParser::RaceStmtContext* ctx) override;
  antlrcpp::Any visitBlock(ToyChoreoParser::BlockContext* ctx) override;

private:
  int indent = 0;
  void printLine(const std::string& s);
  std::string pad() const;
};
