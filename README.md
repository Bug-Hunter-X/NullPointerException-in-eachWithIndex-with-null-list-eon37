# Groovy NullPointerException in eachWithIndex with null List

This example demonstrates a common error in Groovy when using the `eachWithIndex` method with a potentially null list.

The `myMethod` function iterates over a list of strings, printing the index and value of each item.  However, if a `null` list is passed, a `NullPointerException` occurs because `null` doesn't have an `eachWithIndex` method.

The solution shows how to handle this situation gracefully by checking for `null` before proceeding with the iteration.