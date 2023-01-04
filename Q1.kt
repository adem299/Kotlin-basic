fun main() {
    
	/* 1st Question */
    println("1st Question:")
    println("Hello my name is, Ade Mulyana")
    println("I'm from Education University of Indonesia")
    println()
	
    
    /* 2nd Question */
    println("2nd Question:")
    val nilai = 77
    val grade = when(nilai) {
        in 80..100 -> "Grade : A"
        in 75..79 -> "Grade : B"
        in 65..74 -> "Grade : C"
        in 50..64 -> "Grade : D"
        else -> "Grade : E"
    }
    println("Nilai : $nilai")
    println(grade)
    println()
    
    
    /* 3rd Question */
    println("3rd Question:")
    val arr: Array<String> = arrayOf("Learn", "Basic", "Development", "App", "Android", "With", "Kotlin")
	println("Result from Looping:")
    for(i in arr) {
        if (i.length <= 8) {
			println("$i")
        } else {
            println("This String is greater than 8")
        }
    }
}