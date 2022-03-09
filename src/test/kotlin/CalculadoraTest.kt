import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    val calc = Calculadora()

    @Test
    fun somaTest() {
        assertEquals(4,calc.soma(2, 2) )
    }

    @Test
    fun somaTestDouble() {
        assertEquals(4.0, calc.soma(2.0, 2.0))
    }

    @Test
    fun subTest(){
        assertEquals(4,calc.sub(6, 2))
    }

    @Test
    fun subTestDouble(){
        assertEquals(4.0,calc.sub(6.0, 2.0))
    }

    @Test
    fun multiTest(){
        assertEquals(6,calc.multi(2, 3))
    }

    @Test
    fun multiTestDouble(){
        assertEquals(5.0,calc.multi(2.5, 2.0))
    }

    @Test
    fun diviTest(){
        assertEquals(3,calc.divi(12, 4))
    }

    @Test
    fun diviTestDouble(){
        assertEquals(3.5,calc.divi(7.0, 2.0))
    }

    @Test
    fun verifyParTest(){
        assertTrue(calc.verifyPar(2))
    }

    @Test
    fun verifyParTestFalse(){
        assertFalse(calc.verifyPar(3))
    }

    @Test
    fun verifyImparTest(){
        assertTrue(calc.verifyImpar(3))
    }

    @Test
    fun verifyImarTestFaçse(){
        assertTrue(calc.verifyPar(2))
    }

}