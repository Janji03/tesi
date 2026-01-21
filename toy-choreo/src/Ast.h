#pragma once
#include <memory>
#include <string>
#include <utility>
#include <variant>
#include <vector>

namespace ast {

using Id = std::string;

struct Let {
  Id var;
  Id rhs;
};

struct Send {
  Id from;
  Id to;
  Id msg;
};

struct If;   // forward
struct Race; // forward

// Uno statement è uno tra questi
using Stmt = std::variant<Let, Send, std::shared_ptr<If>, std::shared_ptr<Race>>;

struct If {
  Id cond;
  std::vector<Stmt> thenBranch;
  std::vector<Stmt> elseBranch;
};

struct Race {
  Id raceId;
  std::vector<Stmt> left;
  std::vector<Stmt> right;
};

struct Program {
  std::vector<Stmt> stmts;
};

} // namespace ast
