package scala_exercises
package collatz
import scala.annotation.tailrec


object CollatzConjecture:
    def steps(n: Int): Option[Int] = 
        if n < 1 then
            None
        else
            Some(CollatzConjecture1(n))

    def CollatzConjecture1(act: Int) = {
        var steps = 0
        var i = act
        while (i != 1){
            if (i % 2 == 0){
                i=i/2
            }
            else i=3*i +1
            steps += 1
        }
        steps
    }