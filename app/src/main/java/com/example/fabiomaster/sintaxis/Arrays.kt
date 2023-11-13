package com.example.fabiomaster.sintaxis

fun main() {
    mutableList();
}

fun mutableList() {
    val weekdays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
    weekdays.add(0, "FabioDay")
    println(weekdays);
}

fun inmutableList() {
    var readonly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves");
    readonly.filter { it.contains("a")}
    readonly.forEach{day -> println(day) }

}

fun arrays() {
    val dayOfWeek =
        arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
    for (position in dayOfWeek) {
        println(position);
    }
}