package org.andestech.learning.rfb18.g2;

import org.junit.Assert;
import org.junit.Test;

public class App3Test {




    double a=1,b=2,c=3;

    @Test
    public void testMath(){

        Assert.assertEquals(c, a+b, 1e-15);
    }


    @Test
    public void testMyMath(){



        Assert.assertEquals(100, SimpleMath.mult(20,5), 1e-15);
    }
}
