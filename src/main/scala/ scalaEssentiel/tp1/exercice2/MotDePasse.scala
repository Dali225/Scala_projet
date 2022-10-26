package  scalaEssentiel.tp1.exercice2

import scala.io.StdIn

object MotDePasse extends App {
  println("Règles à respecter:")
  println("La longueur du mot de passe doit être comprise entre 6 et 10 caractères inclus")
  println("Le premier et le dernier caractère du mot de passe doivent être des chiffres, dont la somme vaut 10.")
  println("Le deuxième caractère du mot de passe doit être une lettre")
  println("Le mot de passe ne doit pas contenir de caractère espace ' '")
  println("L’avant dernier caractère doit être une lettre minuscule")
  println("Entrez un mot de passe")
  val password = StdIn.readLine
  val validite =
    if (password.length >= 6 && password.length <= 10)
      if (password.reverse.charAt(0).asDigit + password.charAt(0).asDigit == 10)
        if (password.charAt(1).isLetter)
          if (!password.contains(' '))
            if (password.reverse.charAt(2).isLower)
              true
            else false
          else false
        else false
      else false
    else false
  println(s"La valeur de validite est : $validite")
}
