//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val pila1 = Pila("Numeros enteros", 1, null, 5, null, 77, 89)

    val pila2 = Pila("Cajón desastre", listOf("123", 1, null, "hola", 10.0, 'c', 44), "^[a-z]+$")

    for (i in 1..pila1.size()){
        println(pila1.pop())
    }

    println(pila1)
    println(pila2)

  // SI HAY POP YA NO HAY STOP LIFO


}
