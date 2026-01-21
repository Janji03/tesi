#include "AstPrinter.h"
#include <iostream>

namespace ast {

std::string Printer::pad() const {
  return std::string(indent * 2, ' ');
}

void Printer::line(const std::string& s) {
  out << pad() << s << "\n";
}

void Printer::print(const Program& p) {
  for (const auto& s : p.stmts) {
    printStmt(s);
  }
}

void Printer::printStmt(const Stmt& s) {
  std::visit([this](auto&& node) {
    using T = std::decay_t<decltype(node)>;
    if constexpr (std::is_same_v<T, Let>) {
      printLet(node);
    } else if constexpr (std::is_same_v<T, Send>) {
      printSend(node);
    } else if constexpr (std::is_same_v<T, std::shared_ptr<If>>) {
      printIf(node);
    } else if constexpr (std::is_same_v<T, std::shared_ptr<Race>>) {
      printRace(node);
    }
  }, s);
}

void Printer::printLet(const Let& s) {
  line("LET " + s.var + " = " + s.rhs);
}

void Printer::printSend(const Send& s) {
  line("SEND " + s.from + " -> " + s.to + " : " + s.msg);
}

void Printer::printIf(const std::shared_ptr<If>& s) {
  line("IF " + s->cond);
  indent++;
  for (const auto& st : s->thenBranch) printStmt(st);
  indent--;
  line("ELSE");
  indent++;
  for (const auto& st : s->elseBranch) printStmt(st);
  indent--;
}

void Printer::printRace(const std::shared_ptr<Race>& s) {
  line("RACE " + s->raceId);
  indent++;
  for (const auto& st : s->left) printStmt(st);
  for (const auto& st : s->right) printStmt(st);
  indent--;
}

} // namespace ast
