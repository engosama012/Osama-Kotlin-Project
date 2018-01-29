//used break only
/*fun main(args: Array<String>) {
    println("Welcome to Math class Today We Will Learn Table 1 to 12")
    print("Please Enter Your Name: ")
    var name: String = readLine().toString()//input name
    println("Welcome $name")
    println("are you ready for some multiplication")
    for (x in 1..1000000) {// repeat this loop many times
        do {
            println("                           Enter Table you want learn ")
            var num1: Int = readLine()!!.toInt()
            if (num1 in 1..12) {//times table from 1 to 12 and we can change up limit
                println("                         Well let's learn table:$num1")
                println("                         ===========================")
            } else {
                println("Please Enter Correct Number Between 1 to 12")
            }
            when (num1) {
                num1 -> {
                    for (num2 in 1..12) {
                        println("$num1*$num2=")
                        var num3: Int = readLine()!!.toInt()
                        if (num3 == num1 * num2) {
                            println("That is Correct")
                        } else {
                            println("That is wrong")
                        }
                    }
                }
            }
            println(message = "are you want continue with anther Table:Y/N")
            var c: String = readLine()!!.toString()
        } while (c == "y")//repeat this loop while c=y
        break
    }
    println(message =                       "Thank You For Your Time Good Bye")
}*/
//used continue and break@loop
/*fun main(args: Array<String>) {
    println("              Welcome to Math class Today We Will Learn Times Table ")//change 20 if you want change up limit
    println("              =============================================================")
    print("Please Enter Your Name: ")
    var name: String = readLine().toString()//input name
    println()
    println("                         Welcome $name")
    println("              are you ready for some multiplication")
    println("            =========================================")
    loop1@ for (x in 1..1000000) {// repeat this loop many times
        print("Please Enter Table you want learn: ")
        var num1: Int = readLine()!!.toInt()
        if (num1 in 1..20) {////change 20 if you want change up limit
            println()
            println("                         Well let's learn table:$num1")
            println("                         =========================")
        } else {
            println("Please Enter Correct Number Between 1 to 20")////change 20 if you want change up limit
        }
        when (num1) {
            num1 -> {
                for (num2 in 1..20) {////change 20 if you want change up limit
                    println("$num1*$num2=")
                    var num3: Int = readLine()!!.toInt()
                    if (num3 == num1 * num2) {
                        println("That is Correct")
                    } else {
                        loop2@for (num4 in 1..2) {
                            println("That is wrong")
                            println("Try Again")
                            println("$num1*$num2=")
                            var num3: Int = readLine()!!.toInt()
                            if (num3 == num1 * num2) {
                                println("That is Correct")
                                break@loop2
                            } else {
                                continue@loop2

                            }

                        }
                        println("The Correct answer")
                        println("$num1*$num2="+num1*num2)
                        println("Let us Continue with the table $num1")
                    }
                }
                println(message = "are you want continue with anther Table:Y/N")
                var c: String = readLine()!!.toString()
                if (c == "y") {
                    continue@loop1
                } else {
                    println(message = "Thank You For Your Time Good Bye")
                    break@loop1
                }

            }
        }
    }
}*/
/*fun main(args: Array<String>) {
    println("              Welcome to Math class Today We Will Learn Times Table")
    println("            ========================================================")
    print("Please Enter Your Name: ")
    var name: String = readLine().toString()//input name
    println()
    println("                         Welcome $name")
    println("              are you ready for some multiplication")
    println("            =========================================")
    loop1@ for (x in 1..1000000) {// repeat this loop many times
        print("Please Enter Table you want learn: ")
        var table: Int = readLine()!!.toInt()//enter table you want learn
        print("Please Enter Up Limit you want learn: ")
        var uplimit: Int = readLine()!!.toInt()//enter up limit you want
        if (table in 1..uplimit) {
            println()
            println("                         Well let's learn table:$table up Limit $uplimit")
            println("                         =========================")
        } else {
            println("Please Enter Correct Number Between 1 to 20")////change 20 if you want change up limit
        }
        when (table) {
            table -> {
                for (num2 in 1..uplimit) {////change 20 if you want change up limit
                    println("$table*$num2=")
                    var num3: Int = readLine()!!.toInt()
                    if (num3 == table * num2) {
                        println("That is Correct")
                    } else {
                        loop2@for (num4 in 1..2) {
                            println("That is wrong")
                            println("Try Again")
                            println("$table*$num2=")
                            var num3: Int = readLine()!!.toInt()
                            if (num3 == table * num2) {
                                println("That is Correct")
                                break@loop2
                            } else {
                                continue@loop2
                            }

                        }
                        println("The Correct answer")
                        println("$table*$num2="+table*num2)
                        println("Let us Continue with the table $table")
                    }
                }
                println(message = "are you want continue with anther Table:Y/N")
                var c: String = readLine()!!.toString()
                if (c == "y") {
                    continue@loop1
                } else {
                    println(message = "                        Thank You For Your Time Good Bye")
                    println(message = "                                   Good Bye")
                    println(message = "                        =================================")
                    break@loop1
                }

            }
        }
    }
}*/
fun main(args: Array<String>) {
    println("              Welcome to Math class Today We Will Learn Times Table")
    println("            ========================================================")
    print("Please Enter Your Name: ")
    val name: String = readLine().toString()//input name
    println()
    println("                         Welcome $name")
    println("              are you ready for some multiplication")
    println("            =========================================")
    loop1@ for (x in 1..1000000) {// repeat this loop many times
        print("Please Enter Table you want learn: ")
        var table: Int = readLine()!!.toInt()//enter table you want learn
        print("Please Enter Up Limit you want learn: ")
        var uplimit: Int = readLine()!!.toInt()//enter up limit you want
        if (table in 1..uplimit) {
            println()
            println("                         Well $name let's learn table:$table up Limit $uplimit")
            println("                         =========================")
        } else {
            println("$name Please Enter Correct Number Between 1 to $uplimit")////change 20 if you want change up limit
        }
        when (table) {
            table -> {
                for (num2 in 1..uplimit) {////change 20 if you want change up limit
                    println("$table*$num2=")
                    var num3: Int = readLine()!!.toInt()
                    if (num3 == table * num2) {
                        println("That is Correct $name")
                    } else {
                        loop2@for (num4 in 1..2) {
                            println("That is wrong")
                            println("Try Again $name")
                            println("$table*$num2=")
                            var num3: Int = readLine()!!.toInt()
                            if (num3 == table * num2) {
                                println("That is Correct")
                                break@loop2
                            } else {
                                continue@loop2
                            }

                        }
                        println("         Sorry That is Wrong $name")
                        println("          The Correct answer")
                        println("$table*$num2="+table*num2)
                        if(num2!=uplimit){
                            println("Let us Continue with the table $table")
                        }
                    }
                }
                println(message = "are you want continue with anther Table:Y/N")
                var c: String = readLine()!!.toString()
                if (c == "y") {
                    continue@loop1
                } else {
                    println(message = "                        Thank You For Your Time Good Bye")
                    println(message = "                                   Good Bye")
                    println(message = "                        =================================")
                    break@loop1
                }

            }
        }
    }
}







