cmake_minimum_required(VERSION 3.20)
project(toy_choreo LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# ---- vcpkg / antlr4-runtime ----
find_package(antlr4-runtime CONFIG REQUIRED)

# ---- paths ----
set(GRAMMAR_DIR   "${CMAKE_SOURCE_DIR}/grammar")
set(GENERATED_DIR "${CMAKE_SOURCE_DIR}/generated")

# Path al jar di ANTLR (impostalo da CMakePresets o da riga comando)
set(ANTLR_JAR "" CACHE FILEPATH "Path to antlr-4.x-complete.jar")

if(NOT EXISTS "${ANTLR_JAR}")
  message(FATAL_ERROR "ANTLR_JAR not set or not found. Set -DANTLR_JAR=.../antlr-4.13.2-complete.jar")
endif()

# Nome grammatica (senza estensione)
set(GRAMMAR_NAME "ToyChoreo")
set(GRAMMAR_FILE "${GRAMMAR_DIR}/${GRAMMAR_NAME}.g4")

# ---- ANTLR code generation ----
file(MAKE_DIRECTORY "${GENERATED_DIR}")

# Qui elenchiamo i file che ANTLR genererà (così CMake capisce le dipendenze)
set(GENERATED_SOURCES
  "${GENERATED_DIR}/${GRAMMAR_NAME}Lexer.cpp"
  "${GENERATED_DIR}/${GRAMMAR_NAME}Parser.cpp"
  "${GENERATED_DIR}/${GRAMMAR_NAME}BaseVisitor.cpp"
  "${GENERATED_DIR}/${GRAMMAR_NAME}Visitor.cpp"
)

set(GENERATED_HEADERS
  "${GENERATED_DIR}/${GRAMMAR_NAME}Lexer.h"
  "${GENERATED_DIR}/${GRAMMAR_NAME}Parser.h"
  "${GENERATED_DIR}/${GRAMMAR_NAME}BaseVisitor.h"
  "${GENERATED_DIR}/${GRAMMAR_NAME}Visitor.h"
)

add_custom_command(
  OUTPUT ${GENERATED_SOURCES} ${GENERATED_HEADERS}
  COMMAND java -jar "${ANTLR_JAR}"
          -Dlanguage=Cpp
          -visitor
          -no-listener
          -o "${GENERATED_DIR}"
          "${GRAMMAR_FILE}"
  DEPENDS "${GRAMMAR_FILE}"
  COMMENT "Generating ANTLR4 C++ parser/lexer from ${GRAMMAR_NAME}.g4"
  VERBATIM
)

add_custom_target(antlr_generate DEPENDS ${GENERATED_SOURCES} ${GENERATED_HEADERS})

# ---- executable ----
add_executable(toy_choreo
  src/main.cpp
  src/ErrorListener.cpp
  src/AstPrinter.cpp
  src/AstBuilderVisitor.cpp
  ${GENERATED_SOURCES}
)

include(CTest)
enable_testing()

add_test(NAME ok_01
  COMMAND toy_choreo parse "${CMAKE_SOURCE_DIR}/tests/ok_01.toy"
)

add_test(NAME ok_02
  COMMAND toy_choreo parse "${CMAKE_SOURCE_DIR}/tests/ok_02.toy"
)

add_test(NAME err_01
  COMMAND toy_choreo parse "${CMAKE_SOURCE_DIR}/tests/err_01.toy"
)

set_tests_properties(err_01 PROPERTIES WILL_FAIL TRUE)




add_dependencies(toy_choreo antlr_generate)

target_include_directories(toy_choreo PRIVATE
  "${GENERATED_DIR}"
  "${CMAKE_SOURCE_DIR}/src"
)

target_link_libraries(toy_choreo PRIVATE antlr4_shared)

# MSVC nice-to-have
if(MSVC)
  target_compile_options(toy_choreo PRIVATE /W4)
endif()
