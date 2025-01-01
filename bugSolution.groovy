```groovy
def myMethod(Closure closure) {
  println "Inside myMethod"
  try {
    closure() 
  } catch (ArithmeticException e) {
    println "Caught exception in myMethod: "+ e.message
  }
}

myMethod { 
  println "Inside closure"
  def x = 10/0
}
```