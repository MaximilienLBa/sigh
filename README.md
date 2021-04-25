# Sigh

> A tear is an intellectual thing, and a sigh is the Sword of an Angel King.

A language implementation demo, demonstrating the use of my parsing library [Autumn], my semantic
analysis library [Uranium], as well as [ASM] for bytecode generation.

[Autumn]: https://github.com/norswap/autumn
[Uranium]: https://github.com/norswap/uranium
[ASM]: https://asm.ow2.io/

Key files:
- [`SighGrammar`](/src/norswap/sigh/SighGrammar.java)
- [`SemanticAnalysis`](/src/norswap/sigh/SemanticAnalysis.java)
- [`Interpreter`](/src/norswap/sigh/interpreter/Interpreter.java)
- [`BytecodeCompiler`](/src/norswap/sigh/bytecode/BytecodeCompiler.java)

Tests:
- [`SemanticAnalysisTests`](/test/SemanticAnalysisTests.java)
- [`InterpreterTests`](/test/InterpreterTests.java)
- [`InterpreterTests`](/test/InterpreterTests.java)
- [`BytecodeTests`](/test/BytecodeTests.java)