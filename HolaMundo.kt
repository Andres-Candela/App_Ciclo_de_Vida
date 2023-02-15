//condicional simple

// fun main(args: Array<String>) {
//     var prom = 0.0
//     println("Ingrese el nombre del estudiante: ")
//     var nombre:String? = readLine()

//     println("Ingrese el nombre de la materia")
//     var materia:String? = readLine()

//     println("Ingrese la nota 1")
//     var n1 = readLine()!!.toDouble()

//     println("ingrese la nota 2")
//     var n2 = readLine()!!.toDouble()

//     println("ingrese la nota 3")
//     var n3 = readLine()!!.toDouble()
    
//     prom = (n1+n2+n3) /3

//     println("El promedio de las 3 notas es: $prom")

//         if(prom >= 3.0){
//             println("El estudiante gano la materia $materia")
//         }else{
//             println("El estudiante perdio la materia $materia")    
//         }
// }


//condicional doble

// fun main(){
//     println("Ingrese un numero: ")
//     val num = readLine()!!.toInt()

//     if( num > 0){
//         println("El numero es positivo")
//     }else{
//         println("El numero es negativo")
//     }    

//     println("el numero es: $num")
// }



//condicional aninado

// fun main() {
//     println("Ingrese su edad: ")
//     val edad = readLine()!!.toInt()

//     if(edad >= 18){
//         println("La persona es mayor de edad")
//         if(edad == 25) {
//             println("La persona es tiene 25 años")
//         }
//     }else{
//         println("La persona es menor de edad")
//     }
// }


//condicionales multiples con when

// fun main() {
//     println("Ingrese un dia de la semana: ")
//     var dayNum = readLine()!!.toInt()

//     when (dayNum) { 
//         1 -> println("Lunes")
//         2 -> println("Martes")
//         3 -> println("Miercoles")
//         4 -> println("Jueves")
//         5 -> println("Viernes")
//         6 -> println("Sabado")
//         7 -> println("Domingo")
//         else -> println("Dia invalido")
//     }
// }


//condicional do-while

// fun main() {
//     print("Ingrese la cantidad de personas que desea saludar: ")
//     val cantidadPersonas = readLine()!!.toInt()
//     var contador = 1
//     do{
//         print("Ingrese el nombre de la persona $contador: ")
//         val nombre = readLine()!!
//         println("Hola $nombre, ¡Bienvenido!")
//         contador++    
//     }while (contador <= cantidadPersonas)
// }


//condicional con while

// fun main() {
//     print("ingrese un numero: ")
//     val n = readLine()!!.toInt()
//     var i = 1
//     while (i <= n){
//         if (i % 2 == 0) {
//             println(i)
//         }
//         i++
//     }
// }



//condicional con for

// fun main() {
//     print("ingrese la cantidad de numeros a procesar: ")
//     val cantidad = readLine()!!.toInt()
   
//    for (i in 1..cantidad) {
//     print("ingrese un numero: ")
//     val numero = readLine()!!.toInt()

//     if (numero % 11 == 0) {
//         println("El numero $numero es divisible entre 11")
//     }else{
//         println("El numero $numero no es divisible entre 11")
//     }
//    }
// }
