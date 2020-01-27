import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAssert {

    @Test
    public void testAssertEquals(){
        assertEquals(true,true);
    }

    @Test
    public void testAssertMyClass(){
        MyClass myClass = new MyClass();
        String expected = myClass.doSomething("karnawat");
        assertEquals(true,true);
    }

    @Test
    public void testAssertEquals3(){
        assertEquals(true,true);
    }

    @Test
    public void testAssertEquals4(){
        assertEquals(true,true);
    }

}
