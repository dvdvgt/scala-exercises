import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import scala_exercises.collatz.CollatzConjecture.* 

class CollatzTest extends AnyFunSuite with Matchers:
    test("zero steps for one") {
        steps(1) should be (Some(0))
    }
    test("divide if even") {
        steps(16) should be (Some(4))
    }
    test("even and odd steps") {
        steps(12) should be (Some(9))
    }
    test("Large number of even and odd steps") {
        steps(1000000) should be (Some(152))
    }
    test("zero is an error") {
        steps(0) should be (None)
    }
    test("negative value is an error") {
        steps(-15) should be (None)
    }