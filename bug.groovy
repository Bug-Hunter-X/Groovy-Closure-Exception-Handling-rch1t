```groovy
def myMethod(Closure closure) {
  println "Inside myMethod"
  closure() 
}

myMethod { 
  println "Inside closure"
  def x = 10/0
}
```