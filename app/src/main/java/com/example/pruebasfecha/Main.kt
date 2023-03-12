package com.example.pruebasfecha

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
fun main() {

    val d1 = "09/01/2023"
    //val d2 = LocalDate.now()

    val sdf = SimpleDateFormat("dd/MM/yyyy")
    val fhoy = Date()
    val fechaHoy = sdf.format(Date())
    val firstDate: Date = sdf.parse(fechaHoy)
    val secondDate: Date = sdf.parse(d1)
    //val fechaActual: Date = sdf.parse(fechaHoy)
    //val secondDate: Date = sdf.parse(d2.toString())

    val cmp = secondDate.compareTo(firstDate)

    if(cmp == 0 || cmp >0 ){
        println("$firstDate mayor que $secondDate")
    }else{
        print("error")
    }

    /*when {
        cmp > 0 -> {
            System.out.printf("%s is after %s", fechaHoy, d1)
        }
        cmp < 0 -> {
            System.out.printf("%s is before %s", fechaHoy, d1)
        }
        else -> {
            print("Both dates are equal")
        }
    }*/
}