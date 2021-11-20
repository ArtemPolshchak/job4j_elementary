package ru.job4j.lambda;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * @author User on 10.10.2021.
 * @project job4j_elementary_1
 */
public class MethodReferenceTest {
    @Test
    public void whenByClass() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        MethodReference.applyByClass();
        Assert.assertEquals("From class: Hello", buffer.toString());
        System.setOut(before);
    }

    @Test
    public void whenByInstance() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        new MethodReference().applyByInstance();
        Assert.assertEquals("From instance: Hello", buffer.toString());
        System.setOut(before);
    }

}