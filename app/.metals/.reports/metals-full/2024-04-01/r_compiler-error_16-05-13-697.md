file://<WORKSPACE>/src/test/scala/taller2/InsertionSortTest.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.1/scala3-library_3-3.3.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.10/scala-library-2.13.10.jar [exists ]
Options:



action parameters:
offset: 1469
uri: file://<WORKSPACE>/src/test/scala/taller2/InsertionSortTest.scala
text:
```scala
/*
 * This Scala Testsuite was generated by the Gradle 'init' task.
 */
package taller2

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner
import scala.util.Random

@RunWith(classOf[JUnitRunner])
class InsertionSortTest extends AnyFunSuite {
  val objInsertionSort = new InsertionSort()
  
  test("Caso 1 Enteros comprobar ordenamiento listas tamaño 100") {
    val cmp = (a:Int, b:Int) => a < b
    val lst = (1 to 100).map(_ => Random.nextInt(10000)).toList.sortWith(cmp)
    assert(objInsertionSort.sort[Int](cmp)(lst)._1 === lst.sortWith((cmp)))
  }

  test("Caso 2 Enteros comprobar ordenamiento listas tamaño 500") {
    
    val cmp = (a:Int, b:Int) => a < b
    val lst = (1 to 500).map(_ => Random.nextInt(10000)).toList.sortWith(cmp)
    assert(objInsertionSort.sort[Int](cmp)(lst)._1 === lst.sortWith((cmp)))
  }

  test("Caso 3 Enteros comprobar ordenamiento listas tamaño 1000") {
    
    val cmp = (a:Int, b:Int) => a < b
    val lst = (1 to 1000).map(_ => Random.nextInt(10000)).toList.sortWith(cmp)
    assert(objInsertionSort.sort[Int](cmp)(lst)._1 === lst.sortWith((cmp)))
  }

  test("Caso 1 con String 500 aleatorios de tamaño entre 1 y 20") {

    val cmp: (a:String, b:String) = a.compareTo(b) == -1 
    val sizeString:Int = Random.nextInt(20)+1
    val lst = (1 to 500).map(_ => Random.nextString(sizeString)).toList.sortWith(cmp)
    assert(objInsertionSort.sort[String](cmp)(@@))
  }

  test("Caso 1 funcion insert") {

  } 

}

```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:131)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.countParams(Signatures.scala:501)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:186)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:94)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:63)
	scala.meta.internal.pc.MetalsSignatures$.signatures(MetalsSignatures.scala:17)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:51)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:398)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 0