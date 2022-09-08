import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void foo() {
        assertEquals(0, Main.foo());
    }

// Test Driven Development
    @org.junit.jupiter.api.Test
    void summation3() {
        assertEquals(6, Main.summation(3));
    }


    @org.junit.jupiter.api.Test
    void summation100() {
        assertEquals(5050, Main.summation(100));
    }


    @org.junit.jupiter.api.Test
    void summationG3() {
        assertEquals(6, Main.summationGauss(3));
    }

    @org.junit.jupiter.api.Test
    void summationG100 (){
        assertEquals(5050, Main.summationGauss(100));
    }
}