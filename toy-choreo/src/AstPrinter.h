#pragma once
#include "Ast.h"
#include <ostream>

namespace ast {

class Printer {
public:
  explicit Printer(std::ostream& out) : out(out) {}
  void print(const Program& p);

private:
  std::ostream& out;
  int indent = 0;

  void line(const std::string& s);
  std::string pad() const;

  void printStmt(const Stmt& s);
  void printLet(const Let& s);
  void printSend(const Send& s);
  void printIf(const std::shared_ptr<If>& s);
  void printRace(const std::shared_ptr<Race>& s);
};

} // namespace ast
