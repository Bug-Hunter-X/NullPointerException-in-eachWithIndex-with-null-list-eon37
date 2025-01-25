```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.eachWithIndex { item, index ->
      println "Item $index: $item"
    }
  } else {
    println "List is null"
  }
}

myMethod(null)
myMethod(['a', 'b', 'c'])
```