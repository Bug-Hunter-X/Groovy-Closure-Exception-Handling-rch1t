# Groovy Closure Exception Handling

This example demonstrates a subtle issue related to exception handling within Groovy closures.  The exception (division by zero) occurs inside the closure, but it's not handled by the `myMethod`.  The `myMethod` needs to use a `try-catch` block, or the closure must handle exceptions directly.