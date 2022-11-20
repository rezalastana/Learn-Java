package aronsoft.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    //buat atribut
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        var result = calculator.add(10,20);
        assertEquals(30, result); //expected nya harusnya keluar 20, kalau result benar. succes

//        MANUAL TEST TANPA ASSERT
//        if (result != 20){
//            throw new RuntimeException("Test Gagal");
//        }
    }

    @Test
    public void testDivide(){
        var result = calculator.divide(100,0);
        assertEquals(10, result);
    }
}
