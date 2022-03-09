class Calculadora {

    fun soma(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    fun soma(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun sub(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun sub(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    fun multi(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun multi(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    fun divi(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun divi(num1: Double, num2: Double): Double {
        return num1 / num2
    }

    fun verifyPar(num1: Int): Boolean {
        return if (num1 % 2 == 0) {
            return true
        } else false

    }fun verifyImpar(num1: Int): Boolean{
        return if(num1 % 2 !=0){
            return true
        }else false

    }
}

