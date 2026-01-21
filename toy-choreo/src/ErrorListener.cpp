#include "ErrorListener.h"

void CollectingErrorListener::syntaxError(antlr4::Recognizer*,
                                          antlr4::Token*,
                                          size_t line,
                                          size_t charPositionInLine,
                                          const std::string& msg,
                                          std::exception_ptr) {
  errors.push_back(SyntaxError{line, charPositionInLine, msg});
}
