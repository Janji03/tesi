#pragma once
#include <antlr4-runtime.h>
#include <string>
#include <vector>

struct SyntaxError {
  size_t line = 0;
  size_t column = 0;
  std::string message;
};

class CollectingErrorListener : public antlr4::BaseErrorListener {
public:
  void syntaxError(antlr4::Recognizer* recognizer,
                   antlr4::Token* offendingSymbol,
                   size_t line,
                   size_t charPositionInLine,
                   const std::string& msg,
                   std::exception_ptr e) override;

  bool hasErrors() const { return !errors.empty(); }
  const std::vector<SyntaxError>& getErrors() const { return errors; }

private:
  std::vector<SyntaxError> errors;
};
