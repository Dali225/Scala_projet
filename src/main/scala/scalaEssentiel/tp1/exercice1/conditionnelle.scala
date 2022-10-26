package scalaEssentiel.tp1.exercice1

object conditionnelle extends App {
  println(nbralea)
  val nbralea = scala.util.Random.nextInt

  if (nbralea % 2 == 0){
    println(s"$nbralea est un nombre pair")
  } else {
    println(s"$nbralea est un nombre impair")
  }
}
