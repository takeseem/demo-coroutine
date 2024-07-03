package org.example.demo

import kotlinx.coroutines.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() = runBlocking {
    doWorld()
//    doWorld()
    println("main end.")
}

private suspend fun doWorld() = coroutineScope {
    launch {
        delay(2000)
        println("World 2")
    }
    launch {
        delay(1000)
        println("World 1")
    }
    println("Hello")
}