package scala_exercises
package bst

import scala.math.Ordering.Implicits._

case class Bst[T: Ordering](
    value: T,
    lhs: Option[Bst[T]] = None,
    rhs: Option[Bst[T]] = None
):

    def insert(n: T): Bst[T] = ???

    override def toString(): String =
        "(" + lhs.toString() + ", " + value.toString() + ", " + rhs
            .toString() + ")"

object Bst:
    def fromList[T: Ordering](list: List[T]): Bst[T] = ???

    def toList[T: Ordering](bst: Bst[T]): List[T] = ???
