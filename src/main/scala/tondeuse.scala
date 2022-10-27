
class tondeuse ( val x : Int, val y : Int, val dir : String ){
 def X : Int = x
 def Y : Int = y
}

objet tondeuses extend apps{
val tondeuse1 = new tondeuse(x = 5, y = 5, dir = N )
//val tondeuse2 = new tondeuse(coordonnees = )

println("La position de la tondeuse 1 est :" )