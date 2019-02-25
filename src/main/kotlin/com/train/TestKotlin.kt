package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var totaltickets = scanner.nextInt()
    if (totaltickets > 0){
        print("How many round-trip tickets: ")
        var roundtrip = scanner.nextInt()
        if (roundtrip >= 0 && roundtrip <= totaltickets){
            var ticket = Ticket(totaltickets, roundtrip)
            ticket.print()
        }
        else {
            print("Input error.  Please check your number of  round-trip tickets.")
            return
        }
    }
    else{
        print("Input error.  Please check your number of tickets.")
        return
    }
}

class Ticket(var totaltickets: Int, var roundtrip: Int){

    var total : Float = ((totaltickets - roundtrip) * 1000) + (roundtrip * 2000 * 0.9f)

    fun print(){
        println("Total tickets: $totaltickets")
        println("Round-trip:  $roundtrip")
        println("Total: $total")
    }
}