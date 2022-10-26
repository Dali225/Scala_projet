package scalaEssentiel.tp1.exercice2
class Vacances(paysDeVacances: String, moiDeLannee: String, private var
dureeDesVacances: Int) {
  def resteDesVacances: Unit = dureeDesVacances = dureeDesVacances - 1
  def jourRestant: Int = dureeDesVacances
}
object Run extends App {
  val vacance1 = new Vacances("Australie", "Avril", 14)
  val vacance2 = new Vacances("Italie", "Novembre", 13)
  vacance1.resteDesVacances
  if(vacance1.jourRestant > vacance2.jourRestant) {
    println("les premières vacances sont plus longues")
    //println(vacance1)
  } else if (vacance1.jourRestant == vacance2.jourRestant) {
    println("la durée des deux vacances est la même")
    //println(vacance1)
    //println(vacance2)
  } else {
    println("les deuxièmes vacances sont plus longues")
    //println(vacance2)
  }
}