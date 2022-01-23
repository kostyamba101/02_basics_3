const val userRegularDiscount = 1

fun main(args: Array<String>) {
    val totalPrice = 100
    val userRegular = false

    discount(totalPrice, userRegular)

}
fun discount (totalPrice: Int, userRegular: Boolean){
    if (totalPrice <= 1000) {
        val resultUserRegularDiscount: Int = (totalPrice * userRegularDiscount) / 100
        val result: Int = if (userRegular) totalPrice - resultUserRegularDiscount else totalPrice
        println(result)
    }
    else if (totalPrice <= 10000) {
        val defaultDiscount = 100
        val resultUserRegularDiscount: Int = (totalPrice * userRegularDiscount) / 100
        val result: Int = if (userRegular) (totalPrice - defaultDiscount) - resultUserRegularDiscount else totalPrice - defaultDiscount
        println(result)
    }
    else {
        val defaultDiscount = 5
        val resultDefaultDiscount = totalPrice * defaultDiscount / 100
        val resultUserRegularDiscount: Int = (totalPrice * userRegularDiscount) / 100
        val result: Int = if (userRegular) (totalPrice - resultDefaultDiscount) - resultUserRegularDiscount else totalPrice - resultDefaultDiscount
        println(result)
    }
}

