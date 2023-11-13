package com.example.fabiomaster.sintaxis

fun main() {
    val name: String = "Fabio Muriel";
    val nota: Char = 'A';
    val edad: Int = 18;
    val numeroDocumento: Long = 1047335376;
    val dinero: Float = 30.500f;
    val ubicacion: Double = 10.000000220;
    val asistencia: Boolean = true;

    val sumatoria: Int = Sumar(4, 5);
    print(sumatoria);

    if((sumatoria > 5) || (sumatoria < 10)){
        print("Esta entre 5 y 10")
    }

    when(sumatoria){
        in 1..6 -> println("Primer Semestre");
        in 7..12 -> println("Segundo semestre");
        else -> print("Semestre no valido");
    }



}

fun Sumar(num1: Int, num2: Int): Int {
    return num1 + num2;
}