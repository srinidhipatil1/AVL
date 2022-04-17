package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.example.AVLTree aVLTree0 = new com.example.AVLTree();
        com.example.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.example.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        com.example.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(10);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.example.AVLTree aVLTree0 = new com.example.AVLTree();
        com.example.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        com.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.insert(0);
        com.example.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.example.AVLTree aVLTree0 = new com.example.AVLTree();
        com.example.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.example.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        com.example.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete((int) (byte) 0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.example.AVLTree aVLTree0 = new com.example.AVLTree();
        com.example.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        com.example.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        aVLTree0.delete(1);
        com.example.AVLTree.Node node16 = aVLTree0.getRoot();
        int int17 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        aVLTree0.insert(1);
        aVLTree0.delete(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(10);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.example.AVLTree aVLTree0 = new com.example.AVLTree();
        com.example.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.example.AVLTree.Node node3 = aVLTree0.getRoot();
        com.example.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        com.example.AVLTree.Node node9 = aVLTree0.find(10);
        aVLTree0.insert((int) '#');
        com.example.AVLTree.Node node13 = aVLTree0.find((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(100);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.example.AVLTree aVLTree0 = new com.example.AVLTree();
        com.example.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.example.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        com.example.AVLTree.Node node10 = aVLTree0.find(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete((int) (short) 100);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        com.example.AVLTree aVLTree0 = new com.example.AVLTree();
        com.example.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        com.example.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert(1);
        com.example.AVLTree.Node node9 = aVLTree0.getRoot();
        com.example.AVLTree.Node node11 = aVLTree0.find((-1));
        com.example.AVLTree.Node node12 = aVLTree0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(100);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        com.example.AVLTree aVLTree0 = new com.example.AVLTree();
        com.example.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.example.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.example.AVLTree.Node node5 = aVLTree0.getRoot();
        com.example.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 100);
        aVLTree0.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete((int) (short) 100);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        com.example.AVLTree aVLTree0 = new com.example.AVLTree();
        com.example.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        com.example.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert(1);
        com.example.AVLTree.Node node9 = aVLTree0.getRoot();
        com.example.AVLTree.Node node11 = aVLTree0.find((int) '#');
        com.example.AVLTree aVLTree12 = new com.example.AVLTree();
        com.example.AVLTree.Node node14 = aVLTree12.find((int) '4');
        com.example.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        aVLTree12.insert((int) (short) -1);
        com.example.AVLTree aVLTree19 = new com.example.AVLTree();
        com.example.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.insert((int) (short) 0);
        com.example.AVLTree.Node node25 = aVLTree19.find(100);
        com.example.AVLTree aVLTree26 = new com.example.AVLTree();
        com.example.AVLTree.Node node28 = aVLTree26.find((int) '4');
        com.example.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        com.example.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree12.getBalance(node34);
        int int37 = aVLTree12.height();
        com.example.AVLTree.Node node39 = aVLTree12.find((int) '4');
        com.example.AVLTree.Node node40 = aVLTree12.getRoot();
        int int41 = aVLTree0.getBalance(node40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(100);
    }
}

