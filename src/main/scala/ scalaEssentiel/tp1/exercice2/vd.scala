package  scalaEssentiel.tp1.exercice2

object vd extends App {
  var i = 0
  println(s"L'escargot commence à la case $i")
  while (i<50) {
    i += 1 + scala.util.Random.nextInt(6)
    println(s"l'escargot est au niveau de la case $i")
  }
    println("l'escargot a terminé son parcours")


}
