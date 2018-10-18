package br.com.s2it.process;

import org.junit.Assert;
import org.junit.Test;

import br.com.s2it.process.Number;

public class Questao_8 {

    @Test
    public void mergedNumberMustBeEqualsMinusOne() {

        // Init
        Integer c = -1;
        Integer a = 10256;
        Integer b = 512;

        // Act
        Number number = new Number();


        // Check
        Assert.assertEquals(c, number.c(a, b));

    }


    @Test
    public void mergedNumberMustBeEquals() {

        // Init
        Integer c = 150122;
        Integer a = 102;
        Integer b = 512;

        // Act
        Number number = new Number();


        // Check
        Assert.assertEquals(c, number.c(a, b));

    }


}
