package calc;

import org.junit.jupiter.api.*;

class LifeCycleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("This is called ONCE before tests");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("This is called before EACH test");
    }
    @Test
    void test1() {
        System.out.println("1");
    }
    @Test
    void test2() {
        System.out.println("2");
    }
    @Test
    void test3() {
        System.out.println("3");
    }
    @Test
    void test4() {
        System.out.println("4");
    }
    @AfterEach
    void afterEach() {
        System.out.println("This is called after EACH test");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("This is called ONCE after all tests");
    }




    private final Calculator calculator = new Calculator();

    @Test
    void testSum() {
        Assertions.assertEquals(4, calculator.sum (2, 2));
    }
    @Test
    void testSum1() {
        Assertions.assertEquals(4, calculator.sum (2, 2));
    }

    @Test
    void testSum2() {
        Assertions.assertEquals(4, calculator.sum (2, 2));
    }
}
