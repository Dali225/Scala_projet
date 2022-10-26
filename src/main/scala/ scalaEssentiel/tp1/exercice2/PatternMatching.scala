package  scalaEssentiel.tp1.exercice2

import scala.io.StdIn

object PatternMatching extends App {
  println("Veuillez saisir une expression arithmétique de la forme de opérateur chiffre chiffre :")
  val operation = StdIn.readLine
  try {
    val operateur = operation.charAt(0)
    val firstNumber = operation.charAt(1).asDigit
    val secondNumber = operation.charAt(2).asDigit
    operateur match {
      case '+' => println(s"La somme de l'opération est de : ${firstNumber + secondNumber}")
      case '-' => println(s"La soustration de l'opération est de : ${firstNumber - secondNumber}")
      case '*' => println(s"La multiplication de l'opération est de : ${firstNumber * secondNumber}")
      case '/' => println(s"La division de l'opération est de : ${
        firstNumber /
          secondNumber.toDouble
      }")
      case _ => println(s"$operateur => ceci n'est pas un opérateur")
    }
  } catch {
    case _: StringIndexOutOfBoundsException => println("Exemple de saisi : +11")
    case exception: Exception => println(exception.getMessage)
  }

}
