package dgtic.unam.juego
import kotlin.random.Random
import kotlin.random.Random.Default.nextLong

fun main() {
    //version uno
    funcionlambda(3,4,{regresa ->
        println(regresa)
    })
    //version dos
    funcionlambda(3,4){regresa ->
        println(regresa)
    }
}

fun funcionlambda(a:Int,b:Int,callback:(result:Int)->Unit) {
    callback(a+b)
}

//HILOS
/*


fun main() {
 println(hilo(4,5))
}
fun hilo(a:Int,b:Int):Int{
 var result=0
 thread {
 Thread.sleep(Random.nextLong(1000,3000))
 result=a+b
 }
 //Thread.sleep(4000)
 return result
}

 */

//LAMBDA +HILOS =MULTITARES
/*
fun main() {
 hilolambda(4,7){
 println(it)
 }
}
fun hilolambda(a:Int,b:Int,callback:(result:Int)->Unit){
 var result=0
 thread {
 Thread.sleep(Random.nextLong(1000,3000))
 result=a+b
 callback(result)
 }
 println(
 */


//CORROUTINES
/*
fun main() {
 coroutines()
}
fun coroutines() {
    runBlocking {
        (1..1000000).forEach {
            launch {
                delay(1000)
                print("0")
            }
        }
    }
}
 */


//GLOBAL SCOPE SIGNIFICA QUE SE EJECUTARÁ LA COROUTINA SIEMPRE QUE LA APLICACION ESTÁ VIVA
/*
fun main() {
 coroutines()
}
fun coroutines() {
 GlobalScope.launch {
 while(true){
 println("Código de la coroutina ${Thread.currentThread().name} ejecutando")
 }
 }
 Thread.sleep(2000)
}
 */

//CONSTRUCTOR COROUTINE RUNBLOKING DONDE SOLO SE EJECUTA SU BLOQUE Y SE TERMINA
/*
fun main() {
    bloque()
}
fun bloque() {
    runBlocking {
        println("inicia ${Thread.currentThread().name}")
        delay(2000)
        println("Ejecución de código")
        println("termina ${Thread.currentThread().name}")
    }
}
 */
// CONSTRUCTOR COROUTINE LAUNCH DONDE SE EJECUTA DENTRO DE OTRA COROUTINA O FUNCION SUSPENDIDA,
// SE CIOUPA CUANDO IMPORTA QUE REGRESE UN RESULTADO

/*
fun main() {
    launch()
}
fun launch() {
    runBlocking {
        launch {
            println("inicia ${Thread.currentThread().name}")
            delay(1000)
            println("Ejecución de código 1")
            println("termina ${Thread.currentThread().name}")
        }
        launch {
             println("inicia ${Thread.currentThread().name}")
             delay(3000)
             println("Ejecución de código 2")
             println("termina ${Thread.currentThread().name}")
        }
        println("inicia ${Thread.currentThread().name}")
        delay(2000)
        println("Ejecución de código 3")
        println("termina ${Thread.currentThread().name}")
    }
}

 */

// CONSTRUCTOR COROUTINE ASYNC
/*

 */