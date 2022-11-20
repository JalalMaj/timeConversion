import java.text.DateFormat
import java.text.SimpleDateFormat

fun timeConversion(s: String): String {
    // Write your code here

    // Replace with kk:mmpm if you want 12hr interval
    var  twelveTF:DateFormat = SimpleDateFormat("hh:mm:ssa");
    // Replace with kk:mm if you want 1-24 interval
    var twentyFourTF:DateFormat = SimpleDateFormat("HH:mm:ss");

    return (twentyFourTF.format(twelveTF.parse(s)))
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}