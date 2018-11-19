package org.andestech.learning.rfb18.g2;

import org.junit.*;
import org.junit.experimental.categories.Category;

public class App2Test {

    public App2Test(){
        System.out.println("ctor++" + this);

    }

    @Test
    @Category({IFastMethod.class})
    public void testMeth1Fast()
    {
        System.out.println( Thread.currentThread().getStackTrace()[1].getMethodName()  );
        Assert.assertTrue(true);

    }

    @Test
    public void testMeth2()
    {
        System.out.println( Thread.currentThread().getStackTrace()[1].getMethodName()  );
        Assert.assertTrue(true);

    }

    @Test
    @Category({ISlowMethod.class})
    public void testMeth3Slow()
    {
        System.out.println( Thread.currentThread().getStackTrace()[1].getMethodName()  );
        Assert.assertTrue(true);

    }

    @Test
    @Category({IFastMethod.class})
    public void testMeth4Fast()
    {
        System.out.println( Thread.currentThread().getStackTrace()[1].getMethodName()  );
        Assert.assertTrue(true);

    }


    @Before
    public void initMethod(){
        //...
        ///System.out.println();
        System.out.println( "before: " + Thread.currentThread().getStackTrace()[1].getMethodName()  );
    }


    @After
    public void afterMethod(){
        //...
        ///System.out.println();
        System.out.println( "after: " + Thread.currentThread().getStackTrace()[1].getMethodName()  );
    }


    @BeforeClass
    public static void initClassTest(){
        //...
        ///System.out.println();
        System.out.println( "before: " + Thread.currentThread().getStackTrace()[1].getMethodName()  );
    }


    @AfterClass
    public static void afterClassTest(){
        //...
        ///System.out.println();
        System.out.println( "after: " + Thread.currentThread().getStackTrace()[1].getMethodName()  );
    }

    @Override
    protected void finalize() throws Throwable {
        //super.finalize();
        System.out.println("dtor--" + this);
    }
}
