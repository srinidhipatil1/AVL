import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        int int13 = aVLTree0.height();
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        int int22 = aVLTree16.height();
        org.example.AVLTree.Node node23 = aVLTree16.getRoot();
        aVLTree16.delete((int) (byte) 100);
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.delete((int) '4');
        int int31 = aVLTree26.height();
        org.example.AVLTree.Node node33 = aVLTree26.find((int) (byte) 0);
        org.example.AVLTree.Node node34 = aVLTree26.getRoot();
        org.example.AVLTree aVLTree35 = new org.example.AVLTree();
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree35.getBalance(node36);
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree35.getBalance(node38);
        aVLTree35.insert((int) (byte) 0);
        org.example.AVLTree.Node node42 = aVLTree35.getRoot();
        int int43 = aVLTree26.getBalance(node42);
        int int44 = aVLTree16.getBalance(node42);
        int int45 = aVLTree0.getBalance(node42);
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.insert(0);
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = aVLTree12.getRoot();
        org.example.AVLTree.Node node15 = aVLTree12.find((int) '#');
        org.example.AVLTree.Node node17 = aVLTree12.find((int) (byte) -1);
        org.example.AVLTree.Node node18 = aVLTree12.getRoot();
        org.example.AVLTree.Node node19 = aVLTree12.getRoot();
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = aVLTree20.getRoot();
        org.example.AVLTree.Node node23 = aVLTree20.find((int) '#');
        int int24 = aVLTree20.height();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree20.getBalance(node25);
        org.example.AVLTree aVLTree27 = new org.example.AVLTree();
        org.example.AVLTree.Node node28 = null;
        int int29 = aVLTree27.getBalance(node28);
        org.example.AVLTree.Node node30 = null;
        int int31 = aVLTree27.getBalance(node30);
        aVLTree27.insert((int) (byte) 0);
        org.example.AVLTree.Node node34 = aVLTree27.getRoot();
        int int35 = aVLTree20.getBalance(node34);
        int int36 = aVLTree12.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        org.example.AVLTree.Node node38 = aVLTree0.getRoot();
        int int39 = aVLTree0.height();
        aVLTree0.insert(2);
        int int42 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        int int13 = aVLTree0.height();
        int int14 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        int int9 = aVLTree0.height();
        int int10 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = null;
        int int3 = aVLTree0.getBalance(node2);
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) -1);
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (byte) 1);
        aVLTree0.delete((int) (short) 10);
        aVLTree0.delete((int) '#');
        org.example.AVLTree.Node node15 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        aVLTree8.delete((-1));
        aVLTree8.insert((int) 'a');
        aVLTree8.insert((int) (byte) 100);
        int int19 = aVLTree8.height();
        aVLTree8.insert((int) (short) 1);
        org.example.AVLTree.Node node22 = aVLTree8.getRoot();
        int int23 = aVLTree0.getBalance(node22);
        int int24 = aVLTree0.height();
        org.example.AVLTree.Node node26 = aVLTree0.find((int) 'a');
        int int27 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node15 = aVLTree0.getRoot();
        int int16 = aVLTree0.height();
        org.example.AVLTree.Node node18 = aVLTree0.find((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass15 = node14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        org.example.AVLTree.Node node17 = aVLTree12.getRoot();
        int int18 = aVLTree12.height();
        org.example.AVLTree.Node node19 = aVLTree12.getRoot();
        int int20 = aVLTree12.height();
        aVLTree12.insert(0);
        org.example.AVLTree.Node node23 = aVLTree12.getRoot();
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = aVLTree24.getRoot();
        org.example.AVLTree.Node node27 = aVLTree24.find((int) '#');
        org.example.AVLTree.Node node29 = aVLTree24.find((int) (byte) -1);
        org.example.AVLTree.Node node30 = aVLTree24.getRoot();
        org.example.AVLTree.Node node31 = aVLTree24.getRoot();
        org.example.AVLTree aVLTree32 = new org.example.AVLTree();
        org.example.AVLTree.Node node33 = aVLTree32.getRoot();
        org.example.AVLTree.Node node35 = aVLTree32.find((int) '#');
        int int36 = aVLTree32.height();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree32.getBalance(node37);
        org.example.AVLTree aVLTree39 = new org.example.AVLTree();
        org.example.AVLTree.Node node40 = null;
        int int41 = aVLTree39.getBalance(node40);
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree39.getBalance(node42);
        aVLTree39.insert((int) (byte) 0);
        org.example.AVLTree.Node node46 = aVLTree39.getRoot();
        int int47 = aVLTree32.getBalance(node46);
        int int48 = aVLTree24.getBalance(node46);
        int int49 = aVLTree12.getBalance(node46);
        int int50 = aVLTree0.getBalance(node46);
        int int51 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(0);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        org.example.AVLTree.Node node17 = aVLTree12.getRoot();
        int int18 = aVLTree12.height();
        org.example.AVLTree.Node node19 = aVLTree12.getRoot();
        aVLTree12.insert((int) (byte) 10);
        aVLTree12.insert((int) (short) 100);
        org.example.AVLTree.Node node25 = aVLTree12.find((int) (short) 100);
        int int26 = aVLTree0.getBalance(node25);
        org.example.AVLTree aVLTree27 = new org.example.AVLTree();
        org.example.AVLTree.Node node28 = null;
        int int29 = aVLTree27.getBalance(node28);
        aVLTree27.delete((int) '4');
        org.example.AVLTree.Node node32 = aVLTree27.getRoot();
        int int33 = aVLTree27.height();
        org.example.AVLTree.Node node34 = aVLTree27.getRoot();
        aVLTree27.delete((int) (byte) 100);
        int int37 = aVLTree27.height();
        int int38 = aVLTree27.height();
        org.example.AVLTree aVLTree39 = new org.example.AVLTree();
        org.example.AVLTree.Node node40 = null;
        int int41 = aVLTree39.getBalance(node40);
        aVLTree39.delete((int) '4');
        aVLTree39.delete((-1));
        aVLTree39.insert((int) 'a');
        aVLTree39.insert((int) (byte) 100);
        int int50 = aVLTree39.height();
        aVLTree39.insert((int) (short) 1);
        org.example.AVLTree.Node node53 = aVLTree39.getRoot();
        int int54 = aVLTree27.getBalance(node53);
        aVLTree27.insert((int) (byte) 10);
        int int57 = aVLTree27.height();
        org.example.AVLTree.Node node58 = aVLTree27.getRoot();
        int int59 = aVLTree0.getBalance(node58);
        org.example.AVLTree.Node node60 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (byte) -1);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 0);
        int int14 = aVLTree0.height();
        aVLTree0.insert((int) (short) 100);
        org.example.AVLTree.Node node17 = aVLTree0.getRoot();
        org.example.AVLTree.Node node19 = aVLTree0.find(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (short) -1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node4 = aVLTree0.find((-1));
        int int5 = aVLTree0.height();
        org.example.AVLTree aVLTree6 = new org.example.AVLTree();
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree6.getBalance(node7);
        aVLTree6.delete((int) '4');
        org.example.AVLTree.Node node11 = aVLTree6.getRoot();
        org.example.AVLTree.Node node13 = aVLTree6.find((int) (byte) 0);
        aVLTree6.insert((int) (byte) 1);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        int int21 = aVLTree16.height();
        aVLTree16.insert(100);
        aVLTree16.insert((int) ' ');
        aVLTree16.delete(0);
        aVLTree16.insert(1);
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        aVLTree30.delete((-1));
        aVLTree30.insert((int) 'a');
        aVLTree30.insert((int) (byte) 100);
        int int41 = aVLTree30.height();
        aVLTree30.insert((int) (short) 1);
        org.example.AVLTree.Node node44 = aVLTree30.getRoot();
        int int45 = aVLTree16.getBalance(node44);
        int int46 = aVLTree6.getBalance(node44);
        int int47 = aVLTree0.getBalance(node44);
        int int48 = aVLTree0.height();
        org.example.AVLTree.Node node50 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node52 = aVLTree0.find((int) (byte) 1);
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node52);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete(0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        org.example.AVLTree.Node node15 = aVLTree10.getRoot();
        aVLTree10.delete(10);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        int int23 = aVLTree18.height();
        aVLTree18.delete((int) (byte) 100);
        aVLTree18.delete(10);
        org.example.AVLTree.Node node28 = aVLTree18.getRoot();
        org.example.AVLTree aVLTree29 = new org.example.AVLTree();
        org.example.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.delete((int) '4');
        int int34 = aVLTree29.height();
        int int35 = aVLTree29.height();
        aVLTree29.delete((int) '#');
        org.example.AVLTree.Node node39 = aVLTree29.find((int) (byte) 0);
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.delete((int) '4');
        org.example.AVLTree.Node node45 = aVLTree40.getRoot();
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree40.getBalance(node46);
        org.example.AVLTree.Node node48 = aVLTree40.getRoot();
        org.example.AVLTree.Node node49 = aVLTree40.getRoot();
        int int50 = aVLTree40.height();
        int int51 = aVLTree40.height();
        org.example.AVLTree aVLTree52 = new org.example.AVLTree();
        org.example.AVLTree.Node node53 = null;
        int int54 = aVLTree52.getBalance(node53);
        org.example.AVLTree.Node node56 = aVLTree52.find(1);
        org.example.AVLTree.Node node58 = aVLTree52.find(10);
        int int59 = aVLTree52.height();
        aVLTree52.insert((int) (byte) 1);
        org.example.AVLTree.Node node62 = aVLTree52.getRoot();
        int int63 = aVLTree40.getBalance(node62);
        int int64 = aVLTree29.getBalance(node62);
        int int65 = aVLTree18.getBalance(node62);
        int int66 = aVLTree10.getBalance(node62);
        int int67 = aVLTree0.getBalance(node62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node9 = aVLTree0.find(0);
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node3 = aVLTree0.getRoot();
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        aVLTree0.insert(1);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        int int16 = aVLTree0.height();
        int int17 = aVLTree0.height();
        int int18 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (byte) 0);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        int int17 = aVLTree12.height();
        aVLTree12.delete((int) (byte) 100);
        org.example.AVLTree.Node node21 = aVLTree12.find((int) (short) 100);
        aVLTree12.delete(10);
        int int24 = aVLTree12.height();
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        org.example.AVLTree.Node node30 = aVLTree25.getRoot();
        org.example.AVLTree.Node node32 = aVLTree25.find((int) (byte) 0);
        aVLTree25.delete((int) (short) 100);
        org.example.AVLTree.Node node36 = aVLTree25.find((int) (byte) 0);
        int int37 = aVLTree25.height();
        org.example.AVLTree.Node node39 = aVLTree25.find((int) '4');
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = aVLTree40.getRoot();
        org.example.AVLTree.Node node43 = aVLTree40.find((int) '#');
        org.example.AVLTree.Node node45 = aVLTree40.find((int) (byte) -1);
        org.example.AVLTree.Node node46 = aVLTree40.getRoot();
        org.example.AVLTree.Node node47 = aVLTree40.getRoot();
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        aVLTree48.delete((int) '4');
        org.example.AVLTree.Node node53 = aVLTree48.getRoot();
        int int54 = aVLTree48.height();
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        org.example.AVLTree aVLTree56 = new org.example.AVLTree();
        org.example.AVLTree.Node node57 = null;
        int int58 = aVLTree56.getBalance(node57);
        aVLTree56.delete((int) '4');
        aVLTree56.delete((-1));
        aVLTree56.insert((int) 'a');
        aVLTree56.insert((int) (byte) 100);
        int int67 = aVLTree56.height();
        aVLTree56.insert((int) (short) 1);
        org.example.AVLTree.Node node70 = aVLTree56.getRoot();
        int int71 = aVLTree48.getBalance(node70);
        int int72 = aVLTree40.getBalance(node70);
        int int73 = aVLTree25.getBalance(node70);
        int int74 = aVLTree12.getBalance(node70);
        int int75 = aVLTree0.getBalance(node70);
        aVLTree0.insert(10);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete(0);
        org.example.AVLTree.Node node85 = aVLTree0.find((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(node85);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        int int13 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        aVLTree0.delete((-1));
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        org.example.AVLTree.Node node8 = aVLTree0.find((int) (byte) 10);
        aVLTree0.delete((int) (short) 10);
        aVLTree0.delete(10);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) (byte) 10);
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree0.getBalance(node16);
        aVLTree0.insert(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree9 = new org.example.AVLTree();
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree9.getBalance(node10);
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (byte) 0);
        org.example.AVLTree.Node node16 = aVLTree9.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        aVLTree0.delete((int) ' ');
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.delete((int) '4');
        org.example.AVLTree.Node node25 = aVLTree20.getRoot();
        int int26 = aVLTree20.height();
        org.example.AVLTree.Node node27 = aVLTree20.getRoot();
        int int28 = aVLTree20.height();
        aVLTree20.insert(0);
        aVLTree20.insert(100);
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.delete((int) '4');
        org.example.AVLTree.Node node38 = aVLTree33.getRoot();
        org.example.AVLTree.Node node40 = aVLTree33.find((int) (byte) 0);
        org.example.AVLTree.Node node41 = aVLTree33.getRoot();
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.delete((int) '4');
        int int47 = aVLTree42.height();
        org.example.AVLTree.Node node49 = aVLTree42.find((int) (byte) 0);
        org.example.AVLTree.Node node50 = aVLTree42.getRoot();
        org.example.AVLTree aVLTree51 = new org.example.AVLTree();
        org.example.AVLTree.Node node52 = null;
        int int53 = aVLTree51.getBalance(node52);
        org.example.AVLTree.Node node54 = null;
        int int55 = aVLTree51.getBalance(node54);
        aVLTree51.insert((int) (byte) 0);
        org.example.AVLTree.Node node58 = aVLTree51.getRoot();
        int int59 = aVLTree42.getBalance(node58);
        int int60 = aVLTree33.getBalance(node58);
        int int61 = aVLTree20.getBalance(node58);
        int int62 = aVLTree0.getBalance(node58);
        org.example.AVLTree.Node node63 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node63);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) -1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 1);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node16 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) '#');
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        aVLTree10.delete((-1));
        aVLTree10.insert((int) 'a');
        aVLTree10.insert((int) (byte) 100);
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        int int26 = aVLTree21.height();
        aVLTree21.insert(100);
        aVLTree21.insert((int) ' ');
        aVLTree21.delete(0);
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.delete((int) '4');
        org.example.AVLTree.Node node38 = aVLTree33.getRoot();
        int int39 = aVLTree33.height();
        org.example.AVLTree.Node node40 = aVLTree33.getRoot();
        aVLTree33.insert((int) (byte) 10);
        aVLTree33.insert((int) (short) 100);
        org.example.AVLTree.Node node46 = aVLTree33.find((int) (short) 100);
        int int47 = aVLTree21.getBalance(node46);
        int int48 = aVLTree10.getBalance(node46);
        org.example.AVLTree.Node node50 = aVLTree10.find((int) '#');
        org.example.AVLTree.Node node52 = aVLTree10.find(10);
        org.example.AVLTree.Node node53 = aVLTree10.getRoot();
        int int54 = aVLTree0.getBalance(node53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(0);
        aVLTree0.insert(1);
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        int int16 = aVLTree0.height();
        org.example.AVLTree.Node node18 = aVLTree0.find((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) (byte) 10);
        int int16 = aVLTree0.height();
        org.example.AVLTree aVLTree17 = new org.example.AVLTree();
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.delete((int) '4');
        int int22 = aVLTree17.height();
        org.example.AVLTree.Node node24 = aVLTree17.find((int) (byte) 0);
        aVLTree17.insert((int) (short) -1);
        aVLTree17.delete(0);
        org.example.AVLTree.Node node29 = aVLTree17.getRoot();
        int int30 = aVLTree0.getBalance(node29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.insert(0);
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = aVLTree12.getRoot();
        org.example.AVLTree.Node node15 = aVLTree12.find((int) '#');
        org.example.AVLTree.Node node17 = aVLTree12.find((int) (byte) -1);
        org.example.AVLTree.Node node18 = aVLTree12.getRoot();
        org.example.AVLTree.Node node19 = aVLTree12.getRoot();
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = aVLTree20.getRoot();
        org.example.AVLTree.Node node23 = aVLTree20.find((int) '#');
        int int24 = aVLTree20.height();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree20.getBalance(node25);
        org.example.AVLTree aVLTree27 = new org.example.AVLTree();
        org.example.AVLTree.Node node28 = null;
        int int29 = aVLTree27.getBalance(node28);
        org.example.AVLTree.Node node30 = null;
        int int31 = aVLTree27.getBalance(node30);
        aVLTree27.insert((int) (byte) 0);
        org.example.AVLTree.Node node34 = aVLTree27.getRoot();
        int int35 = aVLTree20.getBalance(node34);
        int int36 = aVLTree12.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        org.example.AVLTree.Node node38 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        aVLTree0.insert((int) '4');
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '4');
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        org.example.AVLTree.Node node14 = aVLTree10.find(1);
        aVLTree10.insert((int) (byte) 100);
        int int17 = aVLTree10.height();
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree10.getBalance(node18);
        org.example.AVLTree.Node node21 = aVLTree10.find(100);
        org.example.AVLTree aVLTree22 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.delete((int) '4');
        aVLTree22.delete((-1));
        aVLTree22.insert((int) 'a');
        aVLTree22.insert((int) (byte) 100);
        int int33 = aVLTree22.height();
        org.example.AVLTree aVLTree34 = new org.example.AVLTree();
        org.example.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.delete((int) '4');
        org.example.AVLTree.Node node39 = aVLTree34.getRoot();
        int int40 = aVLTree34.height();
        org.example.AVLTree.Node node41 = aVLTree34.getRoot();
        int int42 = aVLTree34.height();
        aVLTree34.insert(0);
        org.example.AVLTree.Node node45 = aVLTree34.getRoot();
        int int46 = aVLTree22.getBalance(node45);
        int int47 = aVLTree10.getBalance(node45);
        int int48 = aVLTree0.getBalance(node45);
        org.example.AVLTree aVLTree49 = new org.example.AVLTree();
        org.example.AVLTree.Node node50 = null;
        int int51 = aVLTree49.getBalance(node50);
        aVLTree49.delete((int) '4');
        int int54 = aVLTree49.height();
        aVLTree49.insert((int) (byte) 1);
        org.example.AVLTree.Node node58 = aVLTree49.find((-1));
        int int59 = aVLTree49.height();
        org.example.AVLTree.Node node61 = aVLTree49.find(0);
        int int62 = aVLTree49.height();
        int int63 = aVLTree49.height();
        int int64 = aVLTree49.height();
        org.example.AVLTree aVLTree65 = new org.example.AVLTree();
        org.example.AVLTree.Node node66 = null;
        int int67 = aVLTree65.getBalance(node66);
        aVLTree65.delete((int) '4');
        org.example.AVLTree.Node node70 = aVLTree65.getRoot();
        int int71 = aVLTree65.height();
        org.example.AVLTree.Node node72 = aVLTree65.getRoot();
        aVLTree65.delete((int) (byte) 100);
        org.example.AVLTree aVLTree75 = new org.example.AVLTree();
        org.example.AVLTree.Node node76 = null;
        int int77 = aVLTree75.getBalance(node76);
        aVLTree75.delete((int) '4');
        int int80 = aVLTree75.height();
        org.example.AVLTree.Node node82 = aVLTree75.find((int) (byte) 0);
        org.example.AVLTree.Node node83 = aVLTree75.getRoot();
        org.example.AVLTree aVLTree84 = new org.example.AVLTree();
        org.example.AVLTree.Node node85 = null;
        int int86 = aVLTree84.getBalance(node85);
        org.example.AVLTree.Node node87 = null;
        int int88 = aVLTree84.getBalance(node87);
        aVLTree84.insert((int) (byte) 0);
        org.example.AVLTree.Node node91 = aVLTree84.getRoot();
        int int92 = aVLTree75.getBalance(node91);
        int int93 = aVLTree65.getBalance(node91);
        int int94 = aVLTree49.getBalance(node91);
        org.example.AVLTree.Node node95 = aVLTree49.getRoot();
        int int96 = aVLTree0.getBalance(node95);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) 'a');
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = aVLTree13.find((int) (short) 0);
        org.example.AVLTree.Node node17 = aVLTree13.find((-1));
        aVLTree13.insert((-1));
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.delete((int) '4');
        org.example.AVLTree.Node node25 = aVLTree20.getRoot();
        org.example.AVLTree.Node node27 = aVLTree20.find((int) (byte) 0);
        org.example.AVLTree.Node node28 = aVLTree20.getRoot();
        org.example.AVLTree.Node node30 = aVLTree20.find((int) '4');
        aVLTree20.insert((int) '4');
        org.example.AVLTree.Node node33 = aVLTree20.getRoot();
        int int34 = aVLTree13.getBalance(node33);
        int int35 = aVLTree0.getBalance(node33);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node39 = aVLTree0.find((int) (short) 10);
        aVLTree0.delete(100);
        org.example.AVLTree.Node node42 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node42);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        org.example.AVLTree.Node node12 = aVLTree8.find(1);
        org.example.AVLTree.Node node14 = aVLTree8.find(10);
        int int15 = aVLTree8.height();
        aVLTree8.insert((int) (byte) 1);
        org.example.AVLTree.Node node18 = aVLTree8.getRoot();
        int int19 = aVLTree0.getBalance(node18);
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.delete((int) '4');
        aVLTree20.delete((-1));
        aVLTree20.insert((int) 'a');
        aVLTree20.insert((int) (byte) 100);
        int int31 = aVLTree20.height();
        org.example.AVLTree.Node node33 = aVLTree20.find((int) (short) 1);
        aVLTree20.delete((int) (byte) 100);
        org.example.AVLTree.Node node36 = aVLTree20.getRoot();
        int int37 = aVLTree0.getBalance(node36);
        org.example.AVLTree.Node node39 = aVLTree0.find((int) (short) 10);
        int int40 = aVLTree0.height();
        java.lang.Class<?> wildcardClass41 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(1);
        int int12 = aVLTree0.height();
        org.example.AVLTree.Node node14 = aVLTree0.find(10);
        aVLTree0.insert((int) 'a');
        org.example.AVLTree.Node node18 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (byte) 0);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        int int17 = aVLTree12.height();
        aVLTree12.delete((int) (byte) 100);
        org.example.AVLTree.Node node21 = aVLTree12.find((int) (short) 100);
        aVLTree12.delete(10);
        int int24 = aVLTree12.height();
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        org.example.AVLTree.Node node30 = aVLTree25.getRoot();
        org.example.AVLTree.Node node32 = aVLTree25.find((int) (byte) 0);
        aVLTree25.delete((int) (short) 100);
        org.example.AVLTree.Node node36 = aVLTree25.find((int) (byte) 0);
        int int37 = aVLTree25.height();
        org.example.AVLTree.Node node39 = aVLTree25.find((int) '4');
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = aVLTree40.getRoot();
        org.example.AVLTree.Node node43 = aVLTree40.find((int) '#');
        org.example.AVLTree.Node node45 = aVLTree40.find((int) (byte) -1);
        org.example.AVLTree.Node node46 = aVLTree40.getRoot();
        org.example.AVLTree.Node node47 = aVLTree40.getRoot();
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        aVLTree48.delete((int) '4');
        org.example.AVLTree.Node node53 = aVLTree48.getRoot();
        int int54 = aVLTree48.height();
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        org.example.AVLTree aVLTree56 = new org.example.AVLTree();
        org.example.AVLTree.Node node57 = null;
        int int58 = aVLTree56.getBalance(node57);
        aVLTree56.delete((int) '4');
        aVLTree56.delete((-1));
        aVLTree56.insert((int) 'a');
        aVLTree56.insert((int) (byte) 100);
        int int67 = aVLTree56.height();
        aVLTree56.insert((int) (short) 1);
        org.example.AVLTree.Node node70 = aVLTree56.getRoot();
        int int71 = aVLTree48.getBalance(node70);
        int int72 = aVLTree40.getBalance(node70);
        int int73 = aVLTree25.getBalance(node70);
        int int74 = aVLTree12.getBalance(node70);
        int int75 = aVLTree0.getBalance(node70);
        aVLTree0.delete(100);
        org.example.AVLTree.Node node79 = aVLTree0.find((int) (byte) 100);
        aVLTree0.insert((int) (byte) 0);
        int int82 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) (byte) 10);
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree0.getBalance(node16);
        int int18 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) -1);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        int int13 = aVLTree0.height();
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 0);
        int int17 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree9 = new org.example.AVLTree();
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree9.getBalance(node10);
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (byte) 0);
        org.example.AVLTree.Node node16 = aVLTree9.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        org.example.AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.insert((int) (short) 0);
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (short) 1);
        int int15 = aVLTree0.height();
        org.example.AVLTree.Node node17 = aVLTree0.find(100);
        aVLTree0.delete((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree9 = new org.example.AVLTree();
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree9.getBalance(node10);
        aVLTree9.delete((int) '4');
        int int14 = aVLTree9.height();
        org.example.AVLTree.Node node16 = aVLTree9.find((int) (byte) 0);
        org.example.AVLTree.Node node17 = aVLTree9.getRoot();
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree9.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        int int28 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert(10);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (byte) 10);
        aVLTree0.delete(10);
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (byte) 0);
        org.example.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) '#');
        aVLTree0.insert((int) ' ');
        java.lang.Class<?> wildcardClass22 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) 'a');
        aVLTree0.insert(0);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        int int21 = aVLTree16.height();
        aVLTree16.insert((int) (byte) 1);
        org.example.AVLTree.Node node25 = aVLTree16.find((-1));
        int int26 = aVLTree16.height();
        org.example.AVLTree.Node node28 = aVLTree16.find(0);
        org.example.AVLTree.Node node29 = aVLTree16.getRoot();
        org.example.AVLTree.Node node31 = aVLTree16.find(100);
        org.example.AVLTree.Node node32 = aVLTree16.getRoot();
        int int33 = aVLTree0.getBalance(node32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 0);
        org.example.AVLTree.Node node16 = aVLTree0.find(1);
        int int17 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete(0);
        aVLTree0.delete((int) (short) -1);
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        aVLTree11.delete((int) '4');
        org.example.AVLTree.Node node16 = aVLTree11.getRoot();
        org.example.AVLTree.Node node18 = aVLTree11.find((int) (byte) 0);
        org.example.AVLTree.Node node20 = aVLTree11.find((int) '#');
        int int21 = aVLTree11.height();
        org.example.AVLTree aVLTree22 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = aVLTree22.getRoot();
        org.example.AVLTree.Node node25 = aVLTree22.find((int) '#');
        int int26 = aVLTree22.height();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree22.getBalance(node27);
        org.example.AVLTree aVLTree29 = new org.example.AVLTree();
        org.example.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        org.example.AVLTree.Node node32 = null;
        int int33 = aVLTree29.getBalance(node32);
        aVLTree29.insert((int) (byte) 0);
        org.example.AVLTree.Node node36 = aVLTree29.getRoot();
        int int37 = aVLTree22.getBalance(node36);
        int int38 = aVLTree11.getBalance(node36);
        org.example.AVLTree.Node node40 = aVLTree11.find((int) (byte) 100);
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree41.getBalance(node42);
        aVLTree41.delete((int) '4');
        org.example.AVLTree.Node node46 = aVLTree41.getRoot();
        org.example.AVLTree.Node node48 = aVLTree41.find((int) (byte) 0);
        org.example.AVLTree.Node node50 = aVLTree41.find((int) '#');
        int int51 = aVLTree41.height();
        org.example.AVLTree aVLTree52 = new org.example.AVLTree();
        org.example.AVLTree.Node node53 = aVLTree52.getRoot();
        org.example.AVLTree.Node node55 = aVLTree52.find((int) '#');
        int int56 = aVLTree52.height();
        org.example.AVLTree.Node node57 = null;
        int int58 = aVLTree52.getBalance(node57);
        org.example.AVLTree aVLTree59 = new org.example.AVLTree();
        org.example.AVLTree.Node node60 = null;
        int int61 = aVLTree59.getBalance(node60);
        org.example.AVLTree.Node node62 = null;
        int int63 = aVLTree59.getBalance(node62);
        aVLTree59.insert((int) (byte) 0);
        org.example.AVLTree.Node node66 = aVLTree59.getRoot();
        int int67 = aVLTree52.getBalance(node66);
        int int68 = aVLTree41.getBalance(node66);
        org.example.AVLTree.Node node70 = aVLTree41.find((int) (byte) 100);
        aVLTree41.insert((int) (byte) 0);
        aVLTree41.insert((int) (byte) -1);
        org.example.AVLTree.Node node76 = aVLTree41.find((int) (byte) 0);
        org.example.AVLTree.Node node77 = aVLTree41.getRoot();
        org.example.AVLTree.Node node79 = aVLTree41.find((int) ' ');
        org.example.AVLTree.Node node80 = aVLTree41.getRoot();
        int int81 = aVLTree11.getBalance(node80);
        int int82 = aVLTree0.getBalance(node80);
        org.example.AVLTree.Node node84 = aVLTree0.find(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNull(node84);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        aVLTree0.insert(0);
        org.example.AVLTree aVLTree3 = new org.example.AVLTree();
        org.example.AVLTree.Node node4 = null;
        int int5 = aVLTree3.getBalance(node4);
        aVLTree3.delete((int) '4');
        aVLTree3.delete((-1));
        aVLTree3.insert((int) 'a');
        aVLTree3.insert((int) (byte) 100);
        int int14 = aVLTree3.height();
        aVLTree3.insert((int) (short) 1);
        org.example.AVLTree.Node node17 = aVLTree3.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        aVLTree0.delete((int) (short) 10);
        aVLTree0.delete(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(0);
        aVLTree0.insert(1);
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        aVLTree14.delete((-1));
        aVLTree14.insert((int) 'a');
        aVLTree14.insert((int) (byte) 100);
        int int25 = aVLTree14.height();
        aVLTree14.insert((int) (short) 1);
        org.example.AVLTree.Node node28 = aVLTree14.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        int int35 = aVLTree30.height();
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree30.getBalance(node36);
        int int38 = aVLTree30.height();
        aVLTree30.delete((int) (byte) 0);
        int int41 = aVLTree30.height();
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.delete((int) '4');
        aVLTree42.delete((-1));
        aVLTree42.insert((int) 'a');
        aVLTree42.insert((int) (byte) 100);
        org.example.AVLTree.Node node53 = aVLTree42.getRoot();
        int int54 = aVLTree30.getBalance(node53);
        int int55 = aVLTree0.getBalance(node53);
        org.example.AVLTree.Node node56 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        org.example.AVLTree.Node node59 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree60 = new org.example.AVLTree();
        org.example.AVLTree.Node node61 = aVLTree60.getRoot();
        org.example.AVLTree.Node node62 = null;
        int int63 = aVLTree60.getBalance(node62);
        org.example.AVLTree.Node node65 = aVLTree60.find((int) (byte) 10);
        org.example.AVLTree.Node node66 = aVLTree60.getRoot();
        org.example.AVLTree.Node node68 = aVLTree60.find((int) (short) -1);
        org.example.AVLTree aVLTree69 = new org.example.AVLTree();
        org.example.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.delete((int) '4');
        org.example.AVLTree.Node node74 = aVLTree69.getRoot();
        int int75 = aVLTree69.height();
        org.example.AVLTree.Node node76 = aVLTree69.getRoot();
        aVLTree69.insert((int) (byte) 1);
        aVLTree69.insert((int) (short) 0);
        org.example.AVLTree.Node node81 = aVLTree69.getRoot();
        int int82 = aVLTree60.getBalance(node81);
        int int83 = aVLTree0.getBalance(node81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        org.example.AVLTree.Node node10 = aVLTree0.find(0);
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        org.example.AVLTree.Node node15 = aVLTree11.find(1);
        aVLTree11.insert((int) (byte) 100);
        aVLTree11.insert((-1));
        org.example.AVLTree.Node node20 = aVLTree11.getRoot();
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        int int26 = aVLTree21.height();
        org.example.AVLTree.Node node28 = aVLTree21.find((int) (byte) 0);
        org.example.AVLTree.Node node29 = aVLTree21.getRoot();
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        org.example.AVLTree.Node node33 = null;
        int int34 = aVLTree30.getBalance(node33);
        aVLTree30.insert((int) (byte) 0);
        org.example.AVLTree.Node node37 = aVLTree30.getRoot();
        int int38 = aVLTree21.getBalance(node37);
        org.example.AVLTree aVLTree39 = new org.example.AVLTree();
        org.example.AVLTree.Node node40 = null;
        int int41 = aVLTree39.getBalance(node40);
        org.example.AVLTree.Node node43 = aVLTree39.find(1);
        org.example.AVLTree.Node node45 = aVLTree39.find(10);
        int int46 = aVLTree39.height();
        aVLTree39.insert((int) (byte) 1);
        org.example.AVLTree.Node node49 = aVLTree39.getRoot();
        int int50 = aVLTree21.getBalance(node49);
        int int51 = aVLTree11.getBalance(node49);
        int int52 = aVLTree0.getBalance(node49);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) (short) 1);
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        int int12 = aVLTree0.height();
        aVLTree0.delete(100);
        aVLTree0.insert(10);
        org.example.AVLTree.Node node17 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) (short) 10);
        aVLTree0.delete(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (short) -1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (byte) 10);
        aVLTree0.delete(2);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        aVLTree0.insert((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        int int2 = aVLTree0.height();
        org.example.AVLTree.Node node3 = aVLTree0.getRoot();
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        int int12 = aVLTree0.height();
        org.example.AVLTree.Node node14 = aVLTree0.find((int) '4');
        int int15 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (short) -1);
        int int20 = aVLTree0.height();
        org.example.AVLTree.Node node22 = aVLTree0.find(100);
        org.example.AVLTree.Node node24 = aVLTree0.find(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (byte) -1);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node15 = aVLTree0.find((int) (byte) 10);
        aVLTree0.insert((int) (byte) 10);
        org.example.AVLTree.Node node19 = aVLTree0.find(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.insert(0);
        aVLTree0.insert(100);
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.example.AVLTree.Node node15 = aVLTree0.find((int) (byte) 0);
        int int16 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        int int19 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 1);
        int int14 = aVLTree0.height();
        org.example.AVLTree.Node node16 = aVLTree0.find((int) '#');
        org.example.AVLTree aVLTree17 = new org.example.AVLTree();
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.delete((int) '4');
        int int22 = aVLTree17.height();
        aVLTree17.insert((int) (byte) 1);
        org.example.AVLTree.Node node26 = aVLTree17.find((-1));
        int int27 = aVLTree17.height();
        org.example.AVLTree.Node node29 = aVLTree17.find(0);
        org.example.AVLTree.Node node30 = aVLTree17.getRoot();
        org.example.AVLTree aVLTree31 = new org.example.AVLTree();
        org.example.AVLTree.Node node32 = aVLTree31.getRoot();
        org.example.AVLTree.Node node34 = aVLTree31.find(1);
        org.example.AVLTree aVLTree35 = new org.example.AVLTree();
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree35.getBalance(node36);
        aVLTree35.delete((int) '4');
        aVLTree35.delete((-1));
        aVLTree35.insert((int) 'a');
        aVLTree35.insert((int) (byte) 100);
        int int46 = aVLTree35.height();
        org.example.AVLTree aVLTree47 = new org.example.AVLTree();
        org.example.AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        aVLTree47.delete((int) '4');
        org.example.AVLTree.Node node52 = aVLTree47.getRoot();
        int int53 = aVLTree47.height();
        org.example.AVLTree.Node node54 = aVLTree47.getRoot();
        int int55 = aVLTree47.height();
        aVLTree47.insert(0);
        org.example.AVLTree.Node node58 = aVLTree47.getRoot();
        int int59 = aVLTree35.getBalance(node58);
        int int60 = aVLTree31.getBalance(node58);
        int int61 = aVLTree17.getBalance(node58);
        int int62 = aVLTree0.getBalance(node58);
        org.example.AVLTree.Node node64 = aVLTree0.find((int) '4');
        java.lang.Class<?> wildcardClass65 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node4 = aVLTree0.find((-1));
        aVLTree0.insert((-1));
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.delete((int) '4');
        org.example.AVLTree.Node node12 = aVLTree7.getRoot();
        int int13 = aVLTree7.height();
        org.example.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree7.height();
        aVLTree7.insert(0);
        org.example.AVLTree.Node node18 = aVLTree7.getRoot();
        int int19 = aVLTree0.getBalance(node18);
        aVLTree0.insert((int) (short) 100);
        org.example.AVLTree.Node node22 = aVLTree0.getRoot();
        org.example.AVLTree.Node node23 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        int int29 = aVLTree24.height();
        aVLTree24.insert(100);
        aVLTree24.insert((int) ' ');
        aVLTree24.delete(0);
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.delete((int) '4');
        org.example.AVLTree.Node node41 = aVLTree36.getRoot();
        int int42 = aVLTree36.height();
        org.example.AVLTree.Node node43 = aVLTree36.getRoot();
        aVLTree36.insert((int) (byte) 10);
        aVLTree36.insert((int) (short) 100);
        org.example.AVLTree.Node node49 = aVLTree36.find((int) (short) 100);
        int int50 = aVLTree24.getBalance(node49);
        int int51 = aVLTree24.height();
        org.example.AVLTree.Node node53 = aVLTree24.find((int) ' ');
        aVLTree24.delete(0);
        org.example.AVLTree.Node node56 = aVLTree24.getRoot();
        int int57 = aVLTree0.getBalance(node56);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        org.example.AVLTree.Node node13 = aVLTree8.getRoot();
        int int14 = aVLTree8.height();
        org.example.AVLTree.Node node15 = aVLTree8.getRoot();
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        aVLTree16.delete((-1));
        aVLTree16.insert((int) 'a');
        aVLTree16.insert((int) (byte) 100);
        int int27 = aVLTree16.height();
        aVLTree16.insert((int) (short) 1);
        org.example.AVLTree.Node node30 = aVLTree16.getRoot();
        int int31 = aVLTree8.getBalance(node30);
        int int32 = aVLTree0.getBalance(node30);
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree.Node node36 = aVLTree0.find(10);
        aVLTree0.delete(0);
        int int39 = aVLTree0.height();
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = aVLTree40.find((int) (short) 0);
        int int43 = aVLTree40.height();
        aVLTree40.delete((int) (byte) 0);
        org.example.AVLTree aVLTree46 = new org.example.AVLTree();
        org.example.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.delete((int) '4');
        int int51 = aVLTree46.height();
        org.example.AVLTree.Node node52 = null;
        int int53 = aVLTree46.getBalance(node52);
        int int54 = aVLTree46.height();
        aVLTree46.delete((int) (byte) 0);
        int int57 = aVLTree46.height();
        aVLTree46.insert((int) (byte) 100);
        org.example.AVLTree.Node node60 = aVLTree46.getRoot();
        int int61 = aVLTree40.getBalance(node60);
        int int62 = aVLTree0.getBalance(node60);
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        int int9 = aVLTree0.height();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node13 = aVLTree0.find(0);
        aVLTree0.insert(0);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree16.getBalance(node22);
        aVLTree16.insert((int) (short) -1);
        int int26 = aVLTree16.height();
        org.example.AVLTree.Node node27 = aVLTree16.getRoot();
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        org.example.AVLTree.Node node32 = aVLTree28.find(1);
        aVLTree28.insert((int) (byte) 100);
        aVLTree28.insert((-1));
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.delete((int) '4');
        int int47 = aVLTree42.height();
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree48.getBalance(node51);
        aVLTree48.insert((int) (byte) 0);
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        int int56 = aVLTree42.getBalance(node55);
        int int57 = aVLTree37.getBalance(node55);
        int int58 = aVLTree28.getBalance(node55);
        int int59 = aVLTree16.getBalance(node55);
        aVLTree16.insert(100);
        org.example.AVLTree.Node node62 = aVLTree16.getRoot();
        int int63 = aVLTree0.getBalance(node62);
        org.example.AVLTree aVLTree64 = new org.example.AVLTree();
        org.example.AVLTree.Node node65 = null;
        int int66 = aVLTree64.getBalance(node65);
        aVLTree64.delete((int) '4');
        aVLTree64.delete((-1));
        aVLTree64.insert((int) 'a');
        aVLTree64.insert((int) (byte) 100);
        int int75 = aVLTree64.height();
        org.example.AVLTree aVLTree76 = new org.example.AVLTree();
        org.example.AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.delete((int) '4');
        org.example.AVLTree.Node node81 = aVLTree76.getRoot();
        int int82 = aVLTree76.height();
        org.example.AVLTree.Node node83 = aVLTree76.getRoot();
        int int84 = aVLTree76.height();
        aVLTree76.insert(0);
        org.example.AVLTree.Node node87 = aVLTree76.getRoot();
        int int88 = aVLTree64.getBalance(node87);
        int int89 = aVLTree64.height();
        aVLTree64.delete((int) ' ');
        org.example.AVLTree.Node node92 = aVLTree64.getRoot();
        int int93 = aVLTree0.getBalance(node92);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        int int10 = aVLTree0.height();
        aVLTree0.insert((int) (short) 100);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) '4');
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        aVLTree15.insert(0);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        aVLTree18.delete((-1));
        aVLTree18.insert((int) 'a');
        aVLTree18.insert((int) (byte) 100);
        int int29 = aVLTree18.height();
        aVLTree18.insert((int) (short) 1);
        org.example.AVLTree.Node node32 = aVLTree18.getRoot();
        int int33 = aVLTree15.getBalance(node32);
        aVLTree15.delete((int) (short) 10);
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        org.example.AVLTree.Node node39 = null;
        int int40 = aVLTree36.getBalance(node39);
        aVLTree36.insert((int) (byte) 0);
        org.example.AVLTree.Node node43 = aVLTree36.getRoot();
        int int44 = aVLTree15.getBalance(node43);
        int int45 = aVLTree0.getBalance(node43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        org.example.AVLTree.Node node16 = aVLTree12.find(1);
        aVLTree12.insert((int) (byte) 100);
        int int19 = aVLTree12.height();
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        org.example.AVLTree.Node node23 = aVLTree12.find((int) (short) 10);
        aVLTree12.insert((int) (byte) 0);
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        aVLTree26.insert(0);
        org.example.AVLTree.Node node30 = aVLTree26.find(2);
        org.example.AVLTree aVLTree31 = new org.example.AVLTree();
        org.example.AVLTree.Node node32 = aVLTree31.getRoot();
        org.example.AVLTree.Node node34 = aVLTree31.find((int) '#');
        int int35 = aVLTree31.height();
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree31.getBalance(node36);
        org.example.AVLTree aVLTree38 = new org.example.AVLTree();
        org.example.AVLTree.Node node39 = null;
        int int40 = aVLTree38.getBalance(node39);
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree38.getBalance(node41);
        aVLTree38.insert((int) (byte) 0);
        org.example.AVLTree.Node node45 = aVLTree38.getRoot();
        int int46 = aVLTree31.getBalance(node45);
        aVLTree31.insert((-1));
        aVLTree31.insert((int) '4');
        aVLTree31.insert(100);
        org.example.AVLTree.Node node53 = aVLTree31.getRoot();
        org.example.AVLTree.Node node55 = aVLTree31.find((int) (short) 100);
        int int56 = aVLTree26.getBalance(node55);
        int int57 = aVLTree12.getBalance(node55);
        int int58 = aVLTree0.getBalance(node55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        int int14 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node17 = aVLTree0.find((int) (byte) 100);
        aVLTree0.insert((int) (short) 0);
        aVLTree0.delete((int) (byte) 10);
        org.example.AVLTree aVLTree22 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.delete((int) '4');
        aVLTree22.insert((int) 'a');
        org.example.AVLTree aVLTree29 = new org.example.AVLTree();
        org.example.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.delete((int) '4');
        int int34 = aVLTree29.height();
        aVLTree29.insert(100);
        aVLTree29.insert((int) ' ');
        aVLTree29.delete(0);
        aVLTree29.insert(1);
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        aVLTree43.delete((int) '4');
        org.example.AVLTree.Node node48 = aVLTree43.getRoot();
        int int49 = aVLTree43.height();
        org.example.AVLTree.Node node50 = aVLTree43.getRoot();
        org.example.AVLTree aVLTree51 = new org.example.AVLTree();
        org.example.AVLTree.Node node52 = null;
        int int53 = aVLTree51.getBalance(node52);
        aVLTree51.delete((int) '4');
        aVLTree51.delete((-1));
        aVLTree51.insert((int) 'a');
        aVLTree51.insert((int) (byte) 100);
        int int62 = aVLTree51.height();
        aVLTree51.insert((int) (short) 1);
        org.example.AVLTree.Node node65 = aVLTree51.getRoot();
        int int66 = aVLTree43.getBalance(node65);
        int int67 = aVLTree29.getBalance(node65);
        int int68 = aVLTree22.getBalance(node65);
        int int69 = aVLTree0.getBalance(node65);
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        int int33 = aVLTree28.height();
        aVLTree28.insert((int) (byte) 1);
        org.example.AVLTree.Node node37 = aVLTree28.find((-1));
        int int38 = aVLTree28.height();
        org.example.AVLTree.Node node40 = aVLTree28.find(0);
        org.example.AVLTree.Node node42 = aVLTree28.find((int) (short) 1);
        int int43 = aVLTree0.getBalance(node42);
        int int44 = aVLTree0.height();
        org.example.AVLTree aVLTree45 = new org.example.AVLTree();
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree45.getBalance(node46);
        aVLTree45.delete((int) '4');
        aVLTree45.delete((-1));
        aVLTree45.insert((int) 'a');
        aVLTree45.insert((int) (byte) 100);
        int int56 = aVLTree45.height();
        aVLTree45.insert((int) (short) 1);
        org.example.AVLTree.Node node59 = aVLTree45.getRoot();
        org.example.AVLTree.Node node60 = aVLTree45.getRoot();
        int int61 = aVLTree0.getBalance(node60);
        org.example.AVLTree.Node node62 = aVLTree0.getRoot();
        int int63 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(0);
        aVLTree0.insert(1);
        int int14 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) ' ');
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.delete((int) '4');
        int int12 = aVLTree7.height();
        aVLTree7.insert(100);
        aVLTree7.insert((int) ' ');
        aVLTree7.delete(0);
        aVLTree7.insert(1);
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        aVLTree21.delete((-1));
        aVLTree21.insert((int) 'a');
        aVLTree21.insert((int) (byte) 100);
        int int32 = aVLTree21.height();
        aVLTree21.insert((int) (short) 1);
        org.example.AVLTree.Node node35 = aVLTree21.getRoot();
        int int36 = aVLTree7.getBalance(node35);
        int int37 = aVLTree0.getBalance(node35);
        org.example.AVLTree.Node node38 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree39 = new org.example.AVLTree();
        org.example.AVLTree.Node node40 = null;
        int int41 = aVLTree39.getBalance(node40);
        aVLTree39.delete((int) '4');
        int int44 = aVLTree39.height();
        org.example.AVLTree aVLTree45 = new org.example.AVLTree();
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree45.getBalance(node46);
        org.example.AVLTree.Node node48 = null;
        int int49 = aVLTree45.getBalance(node48);
        aVLTree45.insert((int) (byte) 0);
        org.example.AVLTree.Node node52 = aVLTree45.getRoot();
        int int53 = aVLTree39.getBalance(node52);
        int int54 = aVLTree0.getBalance(node52);
        org.example.AVLTree.Node node56 = aVLTree0.find((int) (byte) -1);
        int int57 = aVLTree0.height();
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        org.example.AVLTree.Node node61 = null;
        int int62 = aVLTree58.getBalance(node61);
        aVLTree58.insert((int) (byte) 0);
        org.example.AVLTree.Node node65 = aVLTree58.getRoot();
        int int66 = aVLTree58.height();
        org.example.AVLTree.Node node67 = aVLTree58.getRoot();
        int int68 = aVLTree0.getBalance(node67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) ' ');
        int int8 = aVLTree0.height();
        org.example.AVLTree aVLTree9 = new org.example.AVLTree();
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree9.getBalance(node10);
        aVLTree9.delete((int) '4');
        org.example.AVLTree.Node node14 = aVLTree9.getRoot();
        int int15 = aVLTree9.height();
        org.example.AVLTree.Node node16 = aVLTree9.getRoot();
        aVLTree9.delete((int) (byte) 100);
        int int19 = aVLTree9.height();
        int int20 = aVLTree9.height();
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        aVLTree21.delete((-1));
        aVLTree21.insert((int) 'a');
        aVLTree21.insert((int) (byte) 100);
        int int32 = aVLTree21.height();
        aVLTree21.insert((int) (short) 1);
        org.example.AVLTree.Node node35 = aVLTree21.getRoot();
        int int36 = aVLTree9.getBalance(node35);
        org.example.AVLTree.Node node37 = aVLTree9.getRoot();
        aVLTree9.insert((int) (byte) 100);
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.delete((int) (short) 100);
        aVLTree40.insert((int) (short) 1);
        org.example.AVLTree aVLTree47 = new org.example.AVLTree();
        org.example.AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        org.example.AVLTree.Node node51 = aVLTree47.find(1);
        aVLTree47.insert((int) (byte) 100);
        aVLTree47.insert((-1));
        org.example.AVLTree.Node node56 = aVLTree47.getRoot();
        int int57 = aVLTree40.getBalance(node56);
        int int58 = aVLTree9.getBalance(node56);
        int int59 = aVLTree0.getBalance(node56);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (byte) 0);
        org.example.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(0);
        org.example.AVLTree.Node node21 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node22 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        int int30 = aVLTree25.height();
        aVLTree25.delete((int) (byte) 100);
        aVLTree25.delete(10);
        org.example.AVLTree.Node node36 = aVLTree25.find((int) (short) 1);
        org.example.AVLTree.Node node38 = aVLTree25.find((int) '#');
        org.example.AVLTree.Node node39 = aVLTree25.getRoot();
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.delete((int) '4');
        org.example.AVLTree.Node node45 = aVLTree40.getRoot();
        int int46 = aVLTree40.height();
        org.example.AVLTree.Node node47 = aVLTree40.getRoot();
        aVLTree40.insert((int) (byte) 1);
        org.example.AVLTree aVLTree50 = new org.example.AVLTree();
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree50.getBalance(node51);
        org.example.AVLTree.Node node54 = aVLTree50.find(1);
        aVLTree50.insert((int) (byte) 100);
        int int57 = aVLTree50.height();
        org.example.AVLTree.Node node58 = null;
        int int59 = aVLTree50.getBalance(node58);
        aVLTree50.insert((int) (byte) -1);
        int int62 = aVLTree50.height();
        org.example.AVLTree.Node node63 = aVLTree50.getRoot();
        org.example.AVLTree.Node node64 = aVLTree50.getRoot();
        int int65 = aVLTree40.getBalance(node64);
        aVLTree40.delete((int) (byte) 100);
        org.example.AVLTree.Node node68 = aVLTree40.getRoot();
        int int69 = aVLTree25.getBalance(node68);
        int int70 = aVLTree0.getBalance(node68);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.find(0);
        aVLTree0.insert((int) ' ');
        org.example.AVLTree.Node node13 = aVLTree0.find(0);
        aVLTree0.insert(10);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        org.example.AVLTree.Node node23 = aVLTree16.find(0);
        org.example.AVLTree.Node node25 = aVLTree16.find((int) (short) -1);
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.delete((int) '4');
        int int31 = aVLTree26.height();
        aVLTree26.insert((int) (byte) 1);
        aVLTree26.insert((int) '#');
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.delete((int) '4');
        aVLTree36.delete((-1));
        aVLTree36.insert((int) 'a');
        aVLTree36.insert((int) (byte) 100);
        org.example.AVLTree aVLTree47 = new org.example.AVLTree();
        org.example.AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        aVLTree47.delete((int) '4');
        int int52 = aVLTree47.height();
        org.example.AVLTree aVLTree53 = new org.example.AVLTree();
        org.example.AVLTree.Node node54 = null;
        int int55 = aVLTree53.getBalance(node54);
        org.example.AVLTree.Node node56 = null;
        int int57 = aVLTree53.getBalance(node56);
        aVLTree53.insert((int) (byte) 0);
        org.example.AVLTree.Node node60 = aVLTree53.getRoot();
        int int61 = aVLTree47.getBalance(node60);
        int int62 = aVLTree36.getBalance(node60);
        int int63 = aVLTree26.getBalance(node60);
        int int64 = aVLTree16.getBalance(node60);
        org.example.AVLTree aVLTree65 = new org.example.AVLTree();
        org.example.AVLTree.Node node66 = null;
        int int67 = aVLTree65.getBalance(node66);
        aVLTree65.delete((int) '4');
        aVLTree65.delete((-1));
        aVLTree65.insert((int) 'a');
        aVLTree65.insert((int) (byte) 100);
        int int76 = aVLTree65.height();
        aVLTree65.insert((int) (short) 1);
        org.example.AVLTree.Node node79 = aVLTree65.getRoot();
        org.example.AVLTree.Node node80 = aVLTree65.getRoot();
        int int81 = aVLTree16.getBalance(node80);
        int int82 = aVLTree0.getBalance(node80);
        org.example.AVLTree.Node node83 = aVLTree0.getRoot();
        int int84 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree aVLTree5 = new org.example.AVLTree();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.delete((int) '4');
        org.example.AVLTree.Node node10 = aVLTree5.getRoot();
        int int11 = aVLTree5.height();
        org.example.AVLTree.Node node12 = aVLTree5.getRoot();
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.delete((int) '4');
        aVLTree13.delete((-1));
        aVLTree13.insert((int) 'a');
        aVLTree13.insert((int) (byte) 100);
        int int24 = aVLTree13.height();
        aVLTree13.insert((int) (short) 1);
        org.example.AVLTree.Node node27 = aVLTree13.getRoot();
        int int28 = aVLTree5.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        org.example.AVLTree.Node node34 = aVLTree30.find(1);
        aVLTree30.insert((int) (byte) 100);
        aVLTree30.insert((-1));
        org.example.AVLTree aVLTree39 = new org.example.AVLTree();
        org.example.AVLTree.Node node40 = null;
        int int41 = aVLTree39.getBalance(node40);
        aVLTree39.delete((int) '4');
        org.example.AVLTree aVLTree44 = new org.example.AVLTree();
        org.example.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        aVLTree44.delete((int) '4');
        int int49 = aVLTree44.height();
        org.example.AVLTree aVLTree50 = new org.example.AVLTree();
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree50.getBalance(node51);
        org.example.AVLTree.Node node53 = null;
        int int54 = aVLTree50.getBalance(node53);
        aVLTree50.insert((int) (byte) 0);
        org.example.AVLTree.Node node57 = aVLTree50.getRoot();
        int int58 = aVLTree44.getBalance(node57);
        int int59 = aVLTree39.getBalance(node57);
        int int60 = aVLTree30.getBalance(node57);
        int int61 = aVLTree0.getBalance(node57);
        org.example.AVLTree.Node node63 = aVLTree0.find((int) (short) 100);
        org.example.AVLTree.Node node64 = aVLTree0.getRoot();
        org.example.AVLTree.Node node66 = aVLTree0.find((int) (short) -1);
        org.example.AVLTree.Node node67 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree68 = new org.example.AVLTree();
        org.example.AVLTree.Node node69 = null;
        int int70 = aVLTree68.getBalance(node69);
        aVLTree68.delete((int) '4');
        int int73 = aVLTree68.height();
        aVLTree68.insert(100);
        aVLTree68.insert((int) ' ');
        aVLTree68.delete((-1));
        int int80 = aVLTree68.height();
        org.example.AVLTree.Node node81 = aVLTree68.getRoot();
        org.example.AVLTree.Node node82 = aVLTree68.getRoot();
        int int83 = aVLTree0.getBalance(node82);
        org.example.AVLTree.Node node84 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNull(node84);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (byte) 0);
        org.example.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) '#');
        int int20 = aVLTree0.height();
        aVLTree0.insert((int) '4');
        int int23 = aVLTree0.height();
        org.example.AVLTree.Node node24 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        int int9 = aVLTree0.height();
        org.example.AVLTree.Node node11 = aVLTree0.find(1);
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        int int12 = aVLTree0.height();
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.delete((int) '4');
        aVLTree13.insert((int) 'a');
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = aVLTree20.getRoot();
        org.example.AVLTree.Node node23 = aVLTree20.find((int) '#');
        org.example.AVLTree.Node node24 = aVLTree20.getRoot();
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = aVLTree25.getRoot();
        org.example.AVLTree.Node node28 = aVLTree25.find((int) '#');
        org.example.AVLTree.Node node30 = aVLTree25.find((int) (byte) -1);
        org.example.AVLTree.Node node31 = aVLTree25.getRoot();
        org.example.AVLTree.Node node32 = aVLTree25.getRoot();
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = aVLTree33.getRoot();
        org.example.AVLTree.Node node36 = aVLTree33.find((int) '#');
        int int37 = aVLTree33.height();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree33.getBalance(node38);
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree40.getBalance(node43);
        aVLTree40.insert((int) (byte) 0);
        org.example.AVLTree.Node node47 = aVLTree40.getRoot();
        int int48 = aVLTree33.getBalance(node47);
        int int49 = aVLTree25.getBalance(node47);
        int int50 = aVLTree20.getBalance(node47);
        int int51 = aVLTree13.getBalance(node47);
        org.example.AVLTree.Node node52 = aVLTree13.getRoot();
        int int53 = aVLTree0.getBalance(node52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(1);
        aVLTree0.insert(0);
        aVLTree0.insert((int) 'a');
        int int16 = aVLTree0.height();
        org.example.AVLTree.Node node17 = aVLTree0.getRoot();
        org.example.AVLTree.Node node19 = aVLTree0.find((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        org.example.AVLTree.Node node13 = aVLTree8.getRoot();
        int int14 = aVLTree8.height();
        org.example.AVLTree.Node node15 = aVLTree8.getRoot();
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        aVLTree16.delete((-1));
        aVLTree16.insert((int) 'a');
        aVLTree16.insert((int) (byte) 100);
        int int27 = aVLTree16.height();
        aVLTree16.insert((int) (short) 1);
        org.example.AVLTree.Node node30 = aVLTree16.getRoot();
        int int31 = aVLTree8.getBalance(node30);
        int int32 = aVLTree0.getBalance(node30);
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree.Node node36 = aVLTree0.find(10);
        org.example.AVLTree.Node node38 = aVLTree0.find((int) (byte) 1);
        int int39 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.find((int) ' ');
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.delete((int) '4');
        aVLTree13.delete((-1));
        aVLTree13.insert((int) 'a');
        aVLTree13.insert((int) (byte) 100);
        int int24 = aVLTree13.height();
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        org.example.AVLTree.Node node30 = aVLTree25.getRoot();
        int int31 = aVLTree25.height();
        org.example.AVLTree.Node node32 = aVLTree25.getRoot();
        aVLTree25.delete((int) (byte) 100);
        int int35 = aVLTree25.height();
        int int36 = aVLTree25.height();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        aVLTree37.delete((-1));
        aVLTree37.insert((int) 'a');
        aVLTree37.insert((int) (byte) 100);
        int int48 = aVLTree37.height();
        aVLTree37.insert((int) (short) 1);
        org.example.AVLTree.Node node51 = aVLTree37.getRoot();
        int int52 = aVLTree25.getBalance(node51);
        int int53 = aVLTree13.getBalance(node51);
        int int54 = aVLTree0.getBalance(node51);
        org.example.AVLTree aVLTree55 = new org.example.AVLTree();
        org.example.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        aVLTree55.delete((int) '4');
        org.example.AVLTree.Node node60 = aVLTree55.getRoot();
        int int61 = aVLTree55.height();
        org.example.AVLTree.Node node62 = aVLTree55.getRoot();
        aVLTree55.delete((int) (byte) 100);
        int int65 = aVLTree55.height();
        int int66 = aVLTree55.height();
        aVLTree55.insert((int) (byte) 0);
        org.example.AVLTree.Node node69 = aVLTree55.getRoot();
        int int70 = aVLTree0.getBalance(node69);
        org.example.AVLTree.Node node71 = aVLTree0.getRoot();
        org.example.AVLTree.Node node72 = aVLTree0.getRoot();
        int int73 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        int int11 = aVLTree0.height();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        aVLTree12.insert(0);
        org.example.AVLTree.Node node16 = aVLTree12.find(2);
        org.example.AVLTree.Node node18 = aVLTree12.find((int) (byte) -1);
        org.example.AVLTree.Node node19 = aVLTree12.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        java.lang.Class<?> wildcardClass21 = node19.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree aVLTree9 = new org.example.AVLTree();
        org.example.AVLTree.Node node10 = aVLTree9.getRoot();
        org.example.AVLTree.Node node12 = aVLTree9.find((int) '#');
        org.example.AVLTree.Node node14 = aVLTree9.find((int) (byte) -1);
        org.example.AVLTree.Node node15 = aVLTree9.getRoot();
        org.example.AVLTree.Node node16 = aVLTree9.getRoot();
        org.example.AVLTree aVLTree17 = new org.example.AVLTree();
        org.example.AVLTree.Node node18 = aVLTree17.getRoot();
        org.example.AVLTree.Node node20 = aVLTree17.find((int) '#');
        int int21 = aVLTree17.height();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree17.getBalance(node22);
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree24.getBalance(node27);
        aVLTree24.insert((int) (byte) 0);
        org.example.AVLTree.Node node31 = aVLTree24.getRoot();
        int int32 = aVLTree17.getBalance(node31);
        int int33 = aVLTree9.getBalance(node31);
        int int34 = aVLTree0.getBalance(node31);
        aVLTree0.insert(1);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        int int33 = aVLTree28.height();
        aVLTree28.insert((int) (byte) 1);
        org.example.AVLTree.Node node37 = aVLTree28.find((-1));
        int int38 = aVLTree28.height();
        org.example.AVLTree.Node node40 = aVLTree28.find(0);
        org.example.AVLTree.Node node42 = aVLTree28.find((int) (short) 1);
        int int43 = aVLTree0.getBalance(node42);
        int int44 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        org.example.AVLTree.Node node47 = null;
        int int48 = aVLTree0.getBalance(node47);
        org.example.AVLTree aVLTree49 = new org.example.AVLTree();
        org.example.AVLTree.Node node50 = aVLTree49.getRoot();
        org.example.AVLTree.Node node52 = aVLTree49.find((int) '#');
        org.example.AVLTree.Node node54 = aVLTree49.find((int) (byte) -1);
        org.example.AVLTree aVLTree55 = new org.example.AVLTree();
        org.example.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        org.example.AVLTree.Node node59 = aVLTree55.find(1);
        org.example.AVLTree.Node node61 = aVLTree55.find(10);
        int int62 = aVLTree55.height();
        org.example.AVLTree.Node node63 = null;
        int int64 = aVLTree55.getBalance(node63);
        org.example.AVLTree.Node node66 = aVLTree55.find(100);
        int int67 = aVLTree55.height();
        org.example.AVLTree.Node node68 = aVLTree55.getRoot();
        aVLTree55.insert((-1));
        org.example.AVLTree aVLTree71 = new org.example.AVLTree();
        org.example.AVLTree.Node node72 = null;
        int int73 = aVLTree71.getBalance(node72);
        aVLTree71.delete((int) '4');
        int int76 = aVLTree71.height();
        org.example.AVLTree.Node node78 = aVLTree71.find((int) (byte) 0);
        aVLTree71.insert((int) (short) -1);
        aVLTree71.delete(0);
        org.example.AVLTree.Node node84 = aVLTree71.find((int) 'a');
        int int85 = aVLTree71.height();
        org.example.AVLTree.Node node87 = aVLTree71.find((int) 'a');
        org.example.AVLTree.Node node88 = aVLTree71.getRoot();
        int int89 = aVLTree55.getBalance(node88);
        org.example.AVLTree.Node node91 = aVLTree55.find(100);
        aVLTree55.insert(0);
        aVLTree55.insert((int) (byte) 1);
        org.example.AVLTree.Node node97 = aVLTree55.find((int) (short) 0);
        int int98 = aVLTree49.getBalance(node97);
        int int99 = aVLTree0.getBalance(node97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNull(node91);
        org.junit.Assert.assertNotNull(node97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete(10);
        aVLTree0.delete(1);
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.delete((int) '4');
        int int18 = aVLTree13.height();
        aVLTree13.insert((int) (byte) 1);
        org.example.AVLTree.Node node22 = aVLTree13.find((-1));
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree13.getBalance(node23);
        int int25 = aVLTree13.height();
        aVLTree13.delete((int) (short) -1);
        aVLTree13.delete((int) '4');
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        int int35 = aVLTree30.height();
        aVLTree30.insert((int) (byte) 1);
        org.example.AVLTree.Node node39 = aVLTree30.find((-1));
        int int40 = aVLTree30.height();
        org.example.AVLTree.Node node42 = aVLTree30.find(0);
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        aVLTree43.delete((int) '4');
        aVLTree43.delete((-1));
        aVLTree43.insert((int) 'a');
        aVLTree43.insert((int) (byte) 100);
        int int54 = aVLTree43.height();
        org.example.AVLTree aVLTree55 = new org.example.AVLTree();
        org.example.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        aVLTree55.delete((int) '4');
        org.example.AVLTree.Node node60 = aVLTree55.getRoot();
        int int61 = aVLTree55.height();
        org.example.AVLTree.Node node62 = aVLTree55.getRoot();
        aVLTree55.delete((int) (byte) 100);
        int int65 = aVLTree55.height();
        int int66 = aVLTree55.height();
        org.example.AVLTree aVLTree67 = new org.example.AVLTree();
        org.example.AVLTree.Node node68 = null;
        int int69 = aVLTree67.getBalance(node68);
        aVLTree67.delete((int) '4');
        aVLTree67.delete((-1));
        aVLTree67.insert((int) 'a');
        aVLTree67.insert((int) (byte) 100);
        int int78 = aVLTree67.height();
        aVLTree67.insert((int) (short) 1);
        org.example.AVLTree.Node node81 = aVLTree67.getRoot();
        int int82 = aVLTree55.getBalance(node81);
        int int83 = aVLTree43.getBalance(node81);
        int int84 = aVLTree30.getBalance(node81);
        int int85 = aVLTree13.getBalance(node81);
        int int86 = aVLTree0.getBalance(node81);
        int int87 = aVLTree0.height();
        java.lang.Class<?> wildcardClass88 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        org.example.AVLTree.Node node15 = aVLTree11.find(1);
        aVLTree11.insert((int) (byte) 100);
        aVLTree11.insert((-1));
        org.example.AVLTree.Node node20 = aVLTree11.getRoot();
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = aVLTree21.getRoot();
        org.example.AVLTree.Node node24 = aVLTree21.find((int) '#');
        org.example.AVLTree.Node node26 = aVLTree21.find((int) (byte) -1);
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree21.getBalance(node27);
        org.example.AVLTree aVLTree29 = new org.example.AVLTree();
        org.example.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.delete((int) '4');
        aVLTree29.delete((-1));
        org.example.AVLTree.Node node36 = aVLTree29.getRoot();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        org.example.AVLTree.Node node42 = aVLTree37.getRoot();
        org.example.AVLTree.Node node44 = aVLTree37.find((int) (byte) 0);
        org.example.AVLTree.Node node46 = aVLTree37.find((int) '#');
        int int47 = aVLTree37.height();
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = aVLTree48.getRoot();
        org.example.AVLTree.Node node51 = aVLTree48.find((int) '#');
        int int52 = aVLTree48.height();
        org.example.AVLTree.Node node53 = null;
        int int54 = aVLTree48.getBalance(node53);
        org.example.AVLTree aVLTree55 = new org.example.AVLTree();
        org.example.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        org.example.AVLTree.Node node58 = null;
        int int59 = aVLTree55.getBalance(node58);
        aVLTree55.insert((int) (byte) 0);
        org.example.AVLTree.Node node62 = aVLTree55.getRoot();
        int int63 = aVLTree48.getBalance(node62);
        int int64 = aVLTree37.getBalance(node62);
        org.example.AVLTree aVLTree65 = new org.example.AVLTree();
        org.example.AVLTree.Node node66 = null;
        int int67 = aVLTree65.getBalance(node66);
        aVLTree65.delete((int) '4');
        int int70 = aVLTree65.height();
        aVLTree65.insert((int) (byte) 1);
        org.example.AVLTree.Node node74 = aVLTree65.find((-1));
        int int75 = aVLTree65.height();
        org.example.AVLTree.Node node77 = aVLTree65.find(0);
        org.example.AVLTree.Node node79 = aVLTree65.find((int) (short) 1);
        int int80 = aVLTree37.getBalance(node79);
        int int81 = aVLTree29.getBalance(node79);
        int int82 = aVLTree21.getBalance(node79);
        int int83 = aVLTree11.getBalance(node79);
        int int84 = aVLTree11.height();
        aVLTree11.delete((int) ' ');
        org.example.AVLTree.Node node88 = aVLTree11.find((int) (byte) -1);
        int int89 = aVLTree0.getBalance(node88);
        org.example.AVLTree.Node node90 = aVLTree0.getRoot();
        org.example.AVLTree.Node node92 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertNull(node92);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        aVLTree0.insert(2);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (short) -1);
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.delete((int) ' ');
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert((int) '4');
        aVLTree0.insert((int) ' ');
        aVLTree0.insert((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        org.example.AVLTree.Node node36 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        int int42 = aVLTree37.height();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree37.getBalance(node43);
        int int45 = aVLTree37.height();
        aVLTree37.delete((int) (byte) 0);
        int int48 = aVLTree37.height();
        org.example.AVLTree aVLTree49 = new org.example.AVLTree();
        org.example.AVLTree.Node node50 = null;
        int int51 = aVLTree49.getBalance(node50);
        aVLTree49.delete((int) '4');
        aVLTree49.delete((-1));
        aVLTree49.insert((int) 'a');
        aVLTree49.insert((int) (byte) 100);
        org.example.AVLTree.Node node60 = aVLTree49.getRoot();
        int int61 = aVLTree37.getBalance(node60);
        int int62 = aVLTree0.getBalance(node60);
        java.lang.Class<?> wildcardClass63 = node60.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree7.find(1);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((-1));
        org.example.AVLTree.Node node16 = aVLTree7.getRoot();
        org.example.AVLTree.Node node18 = aVLTree7.find((int) 'a');
        aVLTree7.delete((int) (short) -1);
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = aVLTree21.find((int) (short) 0);
        int int24 = aVLTree21.height();
        org.example.AVLTree.Node node26 = aVLTree21.find((int) (short) 0);
        aVLTree21.insert((int) (short) 1);
        org.example.AVLTree.Node node29 = aVLTree21.getRoot();
        int int30 = aVLTree7.getBalance(node29);
        org.example.AVLTree.Node node31 = aVLTree7.getRoot();
        org.example.AVLTree.Node node32 = aVLTree7.getRoot();
        int int33 = aVLTree0.getBalance(node32);
        org.example.AVLTree.Node node34 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert((int) '4');
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) ' ');
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        org.example.AVLTree.Node node13 = aVLTree8.getRoot();
        int int14 = aVLTree8.height();
        org.example.AVLTree.Node node15 = aVLTree8.getRoot();
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        aVLTree16.delete((-1));
        aVLTree16.insert((int) 'a');
        aVLTree16.insert((int) (byte) 100);
        int int27 = aVLTree16.height();
        aVLTree16.insert((int) (short) 1);
        org.example.AVLTree.Node node30 = aVLTree16.getRoot();
        int int31 = aVLTree8.getBalance(node30);
        int int32 = aVLTree0.getBalance(node30);
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree.Node node36 = aVLTree0.find(10);
        aVLTree0.delete(0);
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.insert((int) ' ');
        org.example.AVLTree.Node node43 = aVLTree0.getRoot();
        int int44 = aVLTree0.height();
        java.lang.Class<?> wildcardClass45 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        aVLTree12.delete((-1));
        aVLTree12.insert((int) 'a');
        aVLTree12.insert((int) (byte) 100);
        int int23 = aVLTree12.height();
        aVLTree12.insert((int) (short) 1);
        org.example.AVLTree.Node node26 = aVLTree12.getRoot();
        int int27 = aVLTree0.getBalance(node26);
        aVLTree0.insert((int) (byte) 10);
        int int30 = aVLTree0.height();
        org.example.AVLTree.Node node31 = aVLTree0.getRoot();
        aVLTree0.delete(10);
        aVLTree0.delete((-1));
        aVLTree0.delete((int) (short) 10);
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        int int16 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (byte) -1);
        int int11 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (byte) 1);
        org.example.AVLTree.Node node15 = aVLTree0.find(10);
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        aVLTree0.insert(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        int int11 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        int int15 = aVLTree10.height();
        int int16 = aVLTree10.height();
        aVLTree10.delete((int) '#');
        org.example.AVLTree.Node node20 = aVLTree10.find((int) (byte) 0);
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        org.example.AVLTree.Node node26 = aVLTree21.getRoot();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree21.getBalance(node27);
        org.example.AVLTree.Node node29 = aVLTree21.getRoot();
        org.example.AVLTree.Node node30 = aVLTree21.getRoot();
        int int31 = aVLTree21.height();
        int int32 = aVLTree21.height();
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        org.example.AVLTree.Node node37 = aVLTree33.find(1);
        org.example.AVLTree.Node node39 = aVLTree33.find(10);
        int int40 = aVLTree33.height();
        aVLTree33.insert((int) (byte) 1);
        org.example.AVLTree.Node node43 = aVLTree33.getRoot();
        int int44 = aVLTree21.getBalance(node43);
        int int45 = aVLTree10.getBalance(node43);
        int int46 = aVLTree0.getBalance(node43);
        int int47 = aVLTree0.height();
        org.example.AVLTree.Node node48 = aVLTree0.getRoot();
        int int49 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        int int15 = aVLTree10.height();
        org.example.AVLTree.Node node17 = aVLTree10.find((int) (byte) 0);
        org.example.AVLTree.Node node18 = aVLTree10.getRoot();
        org.example.AVLTree aVLTree19 = new org.example.AVLTree();
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree19.getBalance(node20);
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree19.getBalance(node22);
        aVLTree19.insert((int) (byte) 0);
        org.example.AVLTree.Node node26 = aVLTree19.getRoot();
        int int27 = aVLTree10.getBalance(node26);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        org.example.AVLTree.Node node32 = aVLTree28.find(1);
        org.example.AVLTree.Node node34 = aVLTree28.find(10);
        int int35 = aVLTree28.height();
        aVLTree28.insert((int) (byte) 1);
        org.example.AVLTree.Node node38 = aVLTree28.getRoot();
        int int39 = aVLTree10.getBalance(node38);
        int int40 = aVLTree0.getBalance(node38);
        int int41 = aVLTree0.height();
        org.example.AVLTree.Node node42 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        aVLTree0.insert((int) (byte) 10);
        int int9 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        org.example.AVLTree.Node node16 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        org.example.AVLTree.Node node11 = aVLTree0.find(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        aVLTree0.insert(10);
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        org.example.AVLTree.Node node15 = aVLTree10.getRoot();
        org.example.AVLTree.Node node17 = aVLTree10.find((int) (byte) 0);
        aVLTree10.delete((int) (short) 100);
        org.example.AVLTree.Node node21 = aVLTree10.find(1);
        org.example.AVLTree.Node node22 = aVLTree10.getRoot();
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        org.example.AVLTree.Node node27 = aVLTree23.find(1);
        org.example.AVLTree.Node node29 = aVLTree23.find(10);
        int int30 = aVLTree23.height();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree23.getBalance(node31);
        org.example.AVLTree.Node node34 = aVLTree23.find(100);
        org.example.AVLTree.Node node36 = aVLTree23.find((-1));
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = aVLTree37.getRoot();
        org.example.AVLTree.Node node40 = aVLTree37.find((int) '#');
        int int41 = aVLTree37.height();
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree37.getBalance(node42);
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree37.getBalance(node44);
        int int46 = aVLTree37.height();
        org.example.AVLTree.Node node48 = aVLTree37.find((int) (byte) 10);
        org.example.AVLTree.Node node50 = aVLTree37.find(0);
        org.example.AVLTree aVLTree51 = new org.example.AVLTree();
        org.example.AVLTree.Node node52 = aVLTree51.getRoot();
        org.example.AVLTree.Node node54 = aVLTree51.find((int) '#');
        org.example.AVLTree.Node node56 = aVLTree51.find((int) (byte) -1);
        org.example.AVLTree.Node node57 = aVLTree51.getRoot();
        org.example.AVLTree.Node node58 = aVLTree51.getRoot();
        org.example.AVLTree aVLTree59 = new org.example.AVLTree();
        org.example.AVLTree.Node node60 = aVLTree59.getRoot();
        org.example.AVLTree.Node node62 = aVLTree59.find((int) '#');
        int int63 = aVLTree59.height();
        org.example.AVLTree.Node node64 = null;
        int int65 = aVLTree59.getBalance(node64);
        org.example.AVLTree aVLTree66 = new org.example.AVLTree();
        org.example.AVLTree.Node node67 = null;
        int int68 = aVLTree66.getBalance(node67);
        org.example.AVLTree.Node node69 = null;
        int int70 = aVLTree66.getBalance(node69);
        aVLTree66.insert((int) (byte) 0);
        org.example.AVLTree.Node node73 = aVLTree66.getRoot();
        int int74 = aVLTree59.getBalance(node73);
        int int75 = aVLTree51.getBalance(node73);
        int int76 = aVLTree37.getBalance(node73);
        int int77 = aVLTree23.getBalance(node73);
        int int78 = aVLTree10.getBalance(node73);
        int int79 = aVLTree0.getBalance(node73);
        java.lang.Class<?> wildcardClass80 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete(0);
        aVLTree0.insert((int) '#');
        org.example.AVLTree.Node node15 = aVLTree0.getRoot();
        org.example.AVLTree.Node node17 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        int int12 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (short) 1);
        org.example.AVLTree.Node node16 = aVLTree0.find(100);
        org.example.AVLTree.Node node17 = aVLTree0.getRoot();
        aVLTree0.delete(2);
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.example.AVLTree.Node node15 = aVLTree0.find(100);
        aVLTree0.delete(0);
        org.example.AVLTree.Node node19 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.insert((int) '#');
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        aVLTree10.delete((-1));
        aVLTree10.insert((int) 'a');
        aVLTree10.insert((int) (byte) 100);
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        int int26 = aVLTree21.height();
        org.example.AVLTree aVLTree27 = new org.example.AVLTree();
        org.example.AVLTree.Node node28 = null;
        int int29 = aVLTree27.getBalance(node28);
        org.example.AVLTree.Node node30 = null;
        int int31 = aVLTree27.getBalance(node30);
        aVLTree27.insert((int) (byte) 0);
        org.example.AVLTree.Node node34 = aVLTree27.getRoot();
        int int35 = aVLTree21.getBalance(node34);
        int int36 = aVLTree10.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((int) (short) 0);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(10);
        org.example.AVLTree.Node node9 = aVLTree0.find(1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        org.example.AVLTree.Node node10 = aVLTree0.find(0);
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        org.example.AVLTree.Node node15 = aVLTree11.find(1);
        aVLTree11.insert((int) (byte) 100);
        aVLTree11.insert((-1));
        org.example.AVLTree.Node node20 = aVLTree11.getRoot();
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        int int26 = aVLTree21.height();
        org.example.AVLTree.Node node28 = aVLTree21.find((int) (byte) 0);
        org.example.AVLTree.Node node29 = aVLTree21.getRoot();
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        org.example.AVLTree.Node node33 = null;
        int int34 = aVLTree30.getBalance(node33);
        aVLTree30.insert((int) (byte) 0);
        org.example.AVLTree.Node node37 = aVLTree30.getRoot();
        int int38 = aVLTree21.getBalance(node37);
        org.example.AVLTree aVLTree39 = new org.example.AVLTree();
        org.example.AVLTree.Node node40 = null;
        int int41 = aVLTree39.getBalance(node40);
        org.example.AVLTree.Node node43 = aVLTree39.find(1);
        org.example.AVLTree.Node node45 = aVLTree39.find(10);
        int int46 = aVLTree39.height();
        aVLTree39.insert((int) (byte) 1);
        org.example.AVLTree.Node node49 = aVLTree39.getRoot();
        int int50 = aVLTree21.getBalance(node49);
        int int51 = aVLTree11.getBalance(node49);
        int int52 = aVLTree0.getBalance(node49);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) (short) 1);
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (byte) 0);
        org.example.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        org.example.AVLTree.Node node17 = aVLTree0.find((int) (short) 1);
        org.example.AVLTree.Node node18 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree19 = new org.example.AVLTree();
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree19.getBalance(node20);
        aVLTree19.delete((int) '4');
        int int24 = aVLTree19.height();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree19.getBalance(node25);
        int int27 = aVLTree19.height();
        aVLTree19.delete((int) (byte) 0);
        int int30 = aVLTree19.height();
        org.example.AVLTree aVLTree31 = new org.example.AVLTree();
        org.example.AVLTree.Node node32 = null;
        int int33 = aVLTree31.getBalance(node32);
        aVLTree31.delete((int) '4');
        aVLTree31.delete((-1));
        aVLTree31.insert((int) 'a');
        aVLTree31.insert((int) (byte) 100);
        org.example.AVLTree.Node node42 = aVLTree31.getRoot();
        int int43 = aVLTree19.getBalance(node42);
        int int44 = aVLTree0.getBalance(node42);
        org.example.AVLTree.Node node46 = aVLTree0.find(0);
        int int47 = aVLTree0.height();
        java.lang.Class<?> wildcardClass48 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.find(0);
        aVLTree0.insert((int) ' ');
        org.example.AVLTree.Node node13 = aVLTree0.find(0);
        aVLTree0.insert(10);
        int int16 = aVLTree0.height();
        int int17 = aVLTree0.height();
        org.example.AVLTree.Node node18 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        aVLTree8.delete((-1));
        org.example.AVLTree.Node node15 = aVLTree8.getRoot();
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        org.example.AVLTree.Node node23 = aVLTree16.find((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree16.find((int) '#');
        int int26 = aVLTree16.height();
        org.example.AVLTree aVLTree27 = new org.example.AVLTree();
        org.example.AVLTree.Node node28 = aVLTree27.getRoot();
        org.example.AVLTree.Node node30 = aVLTree27.find((int) '#');
        int int31 = aVLTree27.height();
        org.example.AVLTree.Node node32 = null;
        int int33 = aVLTree27.getBalance(node32);
        org.example.AVLTree aVLTree34 = new org.example.AVLTree();
        org.example.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree34.getBalance(node37);
        aVLTree34.insert((int) (byte) 0);
        org.example.AVLTree.Node node41 = aVLTree34.getRoot();
        int int42 = aVLTree27.getBalance(node41);
        int int43 = aVLTree16.getBalance(node41);
        org.example.AVLTree aVLTree44 = new org.example.AVLTree();
        org.example.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        aVLTree44.delete((int) '4');
        int int49 = aVLTree44.height();
        aVLTree44.insert((int) (byte) 1);
        org.example.AVLTree.Node node53 = aVLTree44.find((-1));
        int int54 = aVLTree44.height();
        org.example.AVLTree.Node node56 = aVLTree44.find(0);
        org.example.AVLTree.Node node58 = aVLTree44.find((int) (short) 1);
        int int59 = aVLTree16.getBalance(node58);
        int int60 = aVLTree8.getBalance(node58);
        int int61 = aVLTree0.getBalance(node58);
        org.example.AVLTree.Node node62 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass63 = node62.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(node62);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        aVLTree0.insert((int) (byte) -1);
        int int12 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 1);
        aVLTree0.delete((int) (short) 10);
        org.example.AVLTree.Node node18 = aVLTree0.getRoot();
        org.example.AVLTree.Node node20 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        int int12 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        aVLTree0.insert((int) '#');
        aVLTree0.delete((int) '#');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) '4');
        aVLTree0.delete((int) (byte) 10);
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        org.example.AVLTree.Node node24 = aVLTree20.find(1);
        aVLTree20.insert((int) (byte) 100);
        int int27 = aVLTree20.height();
        org.example.AVLTree.Node node28 = null;
        int int29 = aVLTree20.getBalance(node28);
        org.example.AVLTree.Node node31 = aVLTree20.find(1);
        aVLTree20.delete((int) (short) 100);
        aVLTree20.insert((int) (short) -1);
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.delete((int) '4');
        org.example.AVLTree.Node node41 = aVLTree36.getRoot();
        int int42 = aVLTree36.height();
        org.example.AVLTree.Node node43 = aVLTree36.getRoot();
        aVLTree36.insert((int) (byte) 10);
        org.example.AVLTree.Node node46 = aVLTree36.getRoot();
        int int47 = aVLTree20.getBalance(node46);
        int int48 = aVLTree0.getBalance(node46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        int int9 = aVLTree0.height();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node13 = aVLTree0.find(0);
        aVLTree0.insert(0);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree16.getBalance(node22);
        aVLTree16.insert((int) (short) -1);
        int int26 = aVLTree16.height();
        org.example.AVLTree.Node node27 = aVLTree16.getRoot();
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        org.example.AVLTree.Node node32 = aVLTree28.find(1);
        aVLTree28.insert((int) (byte) 100);
        aVLTree28.insert((-1));
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.delete((int) '4');
        int int47 = aVLTree42.height();
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree48.getBalance(node51);
        aVLTree48.insert((int) (byte) 0);
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        int int56 = aVLTree42.getBalance(node55);
        int int57 = aVLTree37.getBalance(node55);
        int int58 = aVLTree28.getBalance(node55);
        int int59 = aVLTree16.getBalance(node55);
        aVLTree16.insert(100);
        org.example.AVLTree.Node node62 = aVLTree16.getRoot();
        int int63 = aVLTree0.getBalance(node62);
        org.example.AVLTree.Node node65 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(node65);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
        int int12 = aVLTree0.height();
        int int13 = aVLTree0.height();
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        aVLTree0.insert(10);
        org.example.AVLTree.Node node19 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        org.example.AVLTree.Node node19 = aVLTree14.getRoot();
        org.example.AVLTree.Node node21 = aVLTree14.find((int) ' ');
        int int22 = aVLTree14.height();
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.delete((int) '4');
        org.example.AVLTree.Node node28 = aVLTree23.getRoot();
        int int29 = aVLTree23.height();
        org.example.AVLTree.Node node30 = aVLTree23.getRoot();
        aVLTree23.delete((int) (byte) 100);
        int int33 = aVLTree23.height();
        int int34 = aVLTree23.height();
        org.example.AVLTree aVLTree35 = new org.example.AVLTree();
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree35.getBalance(node36);
        aVLTree35.delete((int) '4');
        aVLTree35.delete((-1));
        aVLTree35.insert((int) 'a');
        aVLTree35.insert((int) (byte) 100);
        int int46 = aVLTree35.height();
        aVLTree35.insert((int) (short) 1);
        org.example.AVLTree.Node node49 = aVLTree35.getRoot();
        int int50 = aVLTree23.getBalance(node49);
        org.example.AVLTree.Node node51 = aVLTree23.getRoot();
        aVLTree23.insert((int) (byte) 100);
        org.example.AVLTree aVLTree54 = new org.example.AVLTree();
        org.example.AVLTree.Node node55 = null;
        int int56 = aVLTree54.getBalance(node55);
        aVLTree54.delete((int) (short) 100);
        aVLTree54.insert((int) (short) 1);
        org.example.AVLTree aVLTree61 = new org.example.AVLTree();
        org.example.AVLTree.Node node62 = null;
        int int63 = aVLTree61.getBalance(node62);
        org.example.AVLTree.Node node65 = aVLTree61.find(1);
        aVLTree61.insert((int) (byte) 100);
        aVLTree61.insert((-1));
        org.example.AVLTree.Node node70 = aVLTree61.getRoot();
        int int71 = aVLTree54.getBalance(node70);
        int int72 = aVLTree23.getBalance(node70);
        int int73 = aVLTree14.getBalance(node70);
        int int74 = aVLTree0.getBalance(node70);
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.insert(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        org.example.AVLTree.Node node14 = aVLTree10.find(1);
        aVLTree10.insert((int) (byte) 100);
        int int17 = aVLTree10.height();
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree10.getBalance(node18);
        org.example.AVLTree.Node node21 = aVLTree10.find(1);
        aVLTree10.insert(0);
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        int int29 = aVLTree24.height();
        aVLTree24.insert((int) (byte) 1);
        org.example.AVLTree.Node node33 = aVLTree24.find((-1));
        int int34 = aVLTree24.height();
        org.example.AVLTree.Node node36 = aVLTree24.find(0);
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        aVLTree37.delete((-1));
        aVLTree37.insert((int) 'a');
        aVLTree37.insert((int) (byte) 100);
        int int48 = aVLTree37.height();
        org.example.AVLTree aVLTree49 = new org.example.AVLTree();
        org.example.AVLTree.Node node50 = null;
        int int51 = aVLTree49.getBalance(node50);
        aVLTree49.delete((int) '4');
        org.example.AVLTree.Node node54 = aVLTree49.getRoot();
        int int55 = aVLTree49.height();
        org.example.AVLTree.Node node56 = aVLTree49.getRoot();
        aVLTree49.delete((int) (byte) 100);
        int int59 = aVLTree49.height();
        int int60 = aVLTree49.height();
        org.example.AVLTree aVLTree61 = new org.example.AVLTree();
        org.example.AVLTree.Node node62 = null;
        int int63 = aVLTree61.getBalance(node62);
        aVLTree61.delete((int) '4');
        aVLTree61.delete((-1));
        aVLTree61.insert((int) 'a');
        aVLTree61.insert((int) (byte) 100);
        int int72 = aVLTree61.height();
        aVLTree61.insert((int) (short) 1);
        org.example.AVLTree.Node node75 = aVLTree61.getRoot();
        int int76 = aVLTree49.getBalance(node75);
        int int77 = aVLTree37.getBalance(node75);
        int int78 = aVLTree24.getBalance(node75);
        org.example.AVLTree.Node node79 = aVLTree24.getRoot();
        int int80 = aVLTree10.getBalance(node79);
        int int81 = aVLTree0.getBalance(node79);
        java.lang.Class<?> wildcardClass82 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) (short) 0);
        aVLTree0.delete((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        int int10 = aVLTree0.height();
        aVLTree0.insert(0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        aVLTree0.insert((int) '#');
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (byte) -1);
        org.example.AVLTree.Node node17 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 1);
        org.example.AVLTree.Node node22 = aVLTree0.find(1);
        int int23 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete(10);
        aVLTree0.insert((int) (short) 0);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(1);
        int int12 = aVLTree0.height();
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (short) 10);
        int int15 = aVLTree0.height();
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        org.example.AVLTree.Node node20 = aVLTree16.find(1);
        aVLTree16.insert((int) (byte) 100);
        int int23 = aVLTree16.height();
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        int int29 = aVLTree24.height();
        aVLTree24.insert((int) (byte) 1);
        org.example.AVLTree.Node node33 = aVLTree24.find((-1));
        int int34 = aVLTree24.height();
        org.example.AVLTree.Node node36 = aVLTree24.find(0);
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        aVLTree37.delete((-1));
        aVLTree37.insert((int) 'a');
        aVLTree37.insert((int) (byte) 100);
        int int48 = aVLTree37.height();
        org.example.AVLTree aVLTree49 = new org.example.AVLTree();
        org.example.AVLTree.Node node50 = null;
        int int51 = aVLTree49.getBalance(node50);
        aVLTree49.delete((int) '4');
        org.example.AVLTree.Node node54 = aVLTree49.getRoot();
        int int55 = aVLTree49.height();
        org.example.AVLTree.Node node56 = aVLTree49.getRoot();
        aVLTree49.delete((int) (byte) 100);
        int int59 = aVLTree49.height();
        int int60 = aVLTree49.height();
        org.example.AVLTree aVLTree61 = new org.example.AVLTree();
        org.example.AVLTree.Node node62 = null;
        int int63 = aVLTree61.getBalance(node62);
        aVLTree61.delete((int) '4');
        aVLTree61.delete((-1));
        aVLTree61.insert((int) 'a');
        aVLTree61.insert((int) (byte) 100);
        int int72 = aVLTree61.height();
        aVLTree61.insert((int) (short) 1);
        org.example.AVLTree.Node node75 = aVLTree61.getRoot();
        int int76 = aVLTree49.getBalance(node75);
        int int77 = aVLTree37.getBalance(node75);
        int int78 = aVLTree24.getBalance(node75);
        org.example.AVLTree aVLTree79 = new org.example.AVLTree();
        org.example.AVLTree.Node node80 = null;
        int int81 = aVLTree79.getBalance(node80);
        aVLTree79.delete((int) '4');
        org.example.AVLTree.Node node84 = aVLTree79.getRoot();
        int int85 = aVLTree79.height();
        org.example.AVLTree.Node node86 = aVLTree79.getRoot();
        aVLTree79.delete((int) (byte) 100);
        int int89 = aVLTree79.height();
        int int90 = aVLTree79.height();
        aVLTree79.insert((int) (byte) 0);
        org.example.AVLTree.Node node93 = aVLTree79.getRoot();
        int int94 = aVLTree24.getBalance(node93);
        org.example.AVLTree.Node node95 = aVLTree24.getRoot();
        int int96 = aVLTree16.getBalance(node95);
        int int97 = aVLTree0.getBalance(node95);
        org.example.AVLTree.Node node99 = aVLTree0.find((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNull(node99);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert((int) '4');
        aVLTree0.insert((int) ' ');
        java.lang.Class<?> wildcardClass32 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree5 = new org.example.AVLTree();
        org.example.AVLTree.Node node6 = aVLTree5.getRoot();
        org.example.AVLTree.Node node8 = aVLTree5.find((int) '#');
        org.example.AVLTree.Node node10 = aVLTree5.find((int) (byte) -1);
        org.example.AVLTree.Node node11 = aVLTree5.getRoot();
        org.example.AVLTree.Node node12 = aVLTree5.getRoot();
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = aVLTree13.getRoot();
        org.example.AVLTree.Node node16 = aVLTree13.find((int) '#');
        int int17 = aVLTree13.height();
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree13.getBalance(node18);
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree20.getBalance(node23);
        aVLTree20.insert((int) (byte) 0);
        org.example.AVLTree.Node node27 = aVLTree20.getRoot();
        int int28 = aVLTree13.getBalance(node27);
        int int29 = aVLTree5.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        aVLTree0.insert((int) (byte) 10);
        java.lang.Class<?> wildcardClass33 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) 'a');
        org.example.AVLTree.Node node17 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete(1);
        org.example.AVLTree.Node node21 = aVLTree0.find(10);
        org.example.AVLTree aVLTree22 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.delete((int) '4');
        aVLTree22.delete((-1));
        aVLTree22.insert((int) 'a');
        aVLTree22.insert((int) (byte) 100);
        int int33 = aVLTree22.height();
        aVLTree22.insert((int) (short) 1);
        org.example.AVLTree.Node node36 = aVLTree22.getRoot();
        int int37 = aVLTree22.height();
        aVLTree22.insert((int) (short) -1);
        org.example.AVLTree.Node node40 = aVLTree22.getRoot();
        int int41 = aVLTree0.getBalance(node40);
        org.example.AVLTree.Node node43 = aVLTree0.find(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        aVLTree11.insert((int) '4');
        org.example.AVLTree.Node node18 = aVLTree11.find((int) (byte) 10);
        org.example.AVLTree.Node node19 = aVLTree11.getRoot();
        org.example.AVLTree.Node node20 = aVLTree11.getRoot();
        org.example.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (byte) -1);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        int int13 = aVLTree0.height();
        org.example.AVLTree.Node node15 = aVLTree0.find(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = node15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        int int10 = aVLTree0.height();
        aVLTree0.insert((int) (short) 100);
        int int13 = aVLTree0.height();
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        int int13 = aVLTree0.height();
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = aVLTree16.getRoot();
        org.example.AVLTree.Node node19 = aVLTree16.find(1);
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.delete((int) '4');
        aVLTree20.delete((-1));
        aVLTree20.insert((int) 'a');
        aVLTree20.insert((int) (byte) 100);
        int int31 = aVLTree20.height();
        org.example.AVLTree aVLTree32 = new org.example.AVLTree();
        org.example.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.delete((int) '4');
        org.example.AVLTree.Node node37 = aVLTree32.getRoot();
        int int38 = aVLTree32.height();
        org.example.AVLTree.Node node39 = aVLTree32.getRoot();
        int int40 = aVLTree32.height();
        aVLTree32.insert(0);
        org.example.AVLTree.Node node43 = aVLTree32.getRoot();
        int int44 = aVLTree20.getBalance(node43);
        int int45 = aVLTree16.getBalance(node43);
        int int46 = aVLTree0.getBalance(node43);
        org.example.AVLTree aVLTree47 = new org.example.AVLTree();
        org.example.AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        aVLTree47.delete((int) '4');
        aVLTree47.delete((-1));
        aVLTree47.insert((int) 'a');
        aVLTree47.insert((int) (byte) 100);
        int int58 = aVLTree47.height();
        aVLTree47.insert((int) (short) 1);
        aVLTree47.insert((int) (byte) 10);
        org.example.AVLTree.Node node63 = aVLTree47.getRoot();
        int int64 = aVLTree0.getBalance(node63);
        java.lang.Class<?> wildcardClass65 = node63.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find(1);
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        int int13 = aVLTree0.height();
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        org.example.AVLTree.Node node17 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node21 = aVLTree0.find((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete((int) 'a');
        org.example.AVLTree.Node node12 = aVLTree0.find(2);
        org.example.AVLTree.Node node14 = aVLTree0.find(2);
        aVLTree0.delete((int) (byte) 10);
        org.example.AVLTree.Node node17 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        org.example.AVLTree.Node node20 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert(0);
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '#');
        int int11 = aVLTree0.height();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) (short) 100);
        aVLTree12.insert((int) (short) 100);
        org.example.AVLTree aVLTree19 = new org.example.AVLTree();
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree19.getBalance(node20);
        aVLTree19.delete((int) '4');
        int int24 = aVLTree19.height();
        aVLTree19.insert(100);
        aVLTree19.insert((int) ' ');
        aVLTree19.delete((-1));
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree19.getBalance(node31);
        org.example.AVLTree.Node node34 = aVLTree19.find((int) ' ');
        int int35 = aVLTree19.height();
        int int36 = aVLTree19.height();
        org.example.AVLTree.Node node37 = aVLTree19.getRoot();
        org.example.AVLTree aVLTree38 = new org.example.AVLTree();
        org.example.AVLTree.Node node39 = null;
        int int40 = aVLTree38.getBalance(node39);
        aVLTree38.delete((int) '4');
        int int43 = aVLTree38.height();
        aVLTree38.insert((int) (byte) 1);
        org.example.AVLTree.Node node47 = aVLTree38.find((-1));
        int int48 = aVLTree38.height();
        org.example.AVLTree.Node node50 = aVLTree38.find(0);
        int int51 = aVLTree38.height();
        int int52 = aVLTree38.height();
        int int53 = aVLTree38.height();
        org.example.AVLTree aVLTree54 = new org.example.AVLTree();
        org.example.AVLTree.Node node55 = aVLTree54.getRoot();
        org.example.AVLTree.Node node57 = aVLTree54.find(1);
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        aVLTree58.delete((int) '4');
        aVLTree58.delete((-1));
        aVLTree58.insert((int) 'a');
        aVLTree58.insert((int) (byte) 100);
        int int69 = aVLTree58.height();
        org.example.AVLTree aVLTree70 = new org.example.AVLTree();
        org.example.AVLTree.Node node71 = null;
        int int72 = aVLTree70.getBalance(node71);
        aVLTree70.delete((int) '4');
        org.example.AVLTree.Node node75 = aVLTree70.getRoot();
        int int76 = aVLTree70.height();
        org.example.AVLTree.Node node77 = aVLTree70.getRoot();
        int int78 = aVLTree70.height();
        aVLTree70.insert(0);
        org.example.AVLTree.Node node81 = aVLTree70.getRoot();
        int int82 = aVLTree58.getBalance(node81);
        int int83 = aVLTree54.getBalance(node81);
        int int84 = aVLTree38.getBalance(node81);
        int int85 = aVLTree19.getBalance(node81);
        int int86 = aVLTree12.getBalance(node81);
        int int87 = aVLTree0.getBalance(node81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete(10);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        aVLTree0.delete(1);
        org.example.AVLTree.Node node17 = aVLTree0.find(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node17 = aVLTree0.find((int) (short) 10);
        aVLTree0.delete((int) (short) 100);
        int int20 = aVLTree0.height();
        int int21 = aVLTree0.height();
        java.lang.Class<?> wildcardClass22 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((-1));
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree0.getBalance(node12);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(10);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        aVLTree0.delete(0);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) 'a');
        int int13 = aVLTree0.height();
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        aVLTree15.delete((int) '4');
        org.example.AVLTree.Node node20 = aVLTree15.getRoot();
        org.example.AVLTree.Node node22 = aVLTree15.find((int) (byte) 0);
        org.example.AVLTree.Node node24 = aVLTree15.find((int) '#');
        int int25 = aVLTree15.height();
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = aVLTree26.getRoot();
        org.example.AVLTree.Node node29 = aVLTree26.find((int) '#');
        int int30 = aVLTree26.height();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree26.getBalance(node31);
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree33.getBalance(node36);
        aVLTree33.insert((int) (byte) 0);
        org.example.AVLTree.Node node40 = aVLTree33.getRoot();
        int int41 = aVLTree26.getBalance(node40);
        int int42 = aVLTree15.getBalance(node40);
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        aVLTree43.delete((int) '4');
        int int48 = aVLTree43.height();
        aVLTree43.insert((int) (byte) 1);
        org.example.AVLTree.Node node52 = aVLTree43.find((-1));
        int int53 = aVLTree43.height();
        org.example.AVLTree.Node node55 = aVLTree43.find(0);
        org.example.AVLTree.Node node57 = aVLTree43.find((int) (short) 1);
        int int58 = aVLTree15.getBalance(node57);
        int int59 = aVLTree0.getBalance(node57);
        org.example.AVLTree aVLTree60 = new org.example.AVLTree();
        org.example.AVLTree.Node node61 = null;
        int int62 = aVLTree60.getBalance(node61);
        aVLTree60.delete((int) '4');
        aVLTree60.delete((-1));
        aVLTree60.insert((int) 'a');
        aVLTree60.insert((int) (byte) 100);
        int int71 = aVLTree60.height();
        aVLTree60.insert((int) (short) 1);
        org.example.AVLTree.Node node74 = aVLTree60.getRoot();
        org.example.AVLTree aVLTree75 = new org.example.AVLTree();
        org.example.AVLTree.Node node76 = null;
        int int77 = aVLTree75.getBalance(node76);
        aVLTree75.delete((int) '4');
        int int80 = aVLTree75.height();
        org.example.AVLTree.Node node82 = aVLTree75.find((int) (byte) 0);
        aVLTree75.insert((int) (short) -1);
        aVLTree75.delete(0);
        org.example.AVLTree.Node node87 = aVLTree75.getRoot();
        int int88 = aVLTree60.getBalance(node87);
        int int89 = aVLTree0.getBalance(node87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (byte) 0);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        int int17 = aVLTree12.height();
        aVLTree12.delete((int) (byte) 100);
        org.example.AVLTree.Node node21 = aVLTree12.find((int) (short) 100);
        aVLTree12.delete(10);
        int int24 = aVLTree12.height();
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        org.example.AVLTree.Node node30 = aVLTree25.getRoot();
        org.example.AVLTree.Node node32 = aVLTree25.find((int) (byte) 0);
        aVLTree25.delete((int) (short) 100);
        org.example.AVLTree.Node node36 = aVLTree25.find((int) (byte) 0);
        int int37 = aVLTree25.height();
        org.example.AVLTree.Node node39 = aVLTree25.find((int) '4');
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = aVLTree40.getRoot();
        org.example.AVLTree.Node node43 = aVLTree40.find((int) '#');
        org.example.AVLTree.Node node45 = aVLTree40.find((int) (byte) -1);
        org.example.AVLTree.Node node46 = aVLTree40.getRoot();
        org.example.AVLTree.Node node47 = aVLTree40.getRoot();
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        aVLTree48.delete((int) '4');
        org.example.AVLTree.Node node53 = aVLTree48.getRoot();
        int int54 = aVLTree48.height();
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        org.example.AVLTree aVLTree56 = new org.example.AVLTree();
        org.example.AVLTree.Node node57 = null;
        int int58 = aVLTree56.getBalance(node57);
        aVLTree56.delete((int) '4');
        aVLTree56.delete((-1));
        aVLTree56.insert((int) 'a');
        aVLTree56.insert((int) (byte) 100);
        int int67 = aVLTree56.height();
        aVLTree56.insert((int) (short) 1);
        org.example.AVLTree.Node node70 = aVLTree56.getRoot();
        int int71 = aVLTree48.getBalance(node70);
        int int72 = aVLTree40.getBalance(node70);
        int int73 = aVLTree25.getBalance(node70);
        int int74 = aVLTree12.getBalance(node70);
        int int75 = aVLTree0.getBalance(node70);
        org.example.AVLTree.Node node77 = aVLTree0.find((int) (short) 10);
        org.example.AVLTree.Node node79 = aVLTree0.find(0);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node82 = aVLTree0.getRoot();
        org.example.AVLTree.Node node84 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNull(node84);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(0);
        aVLTree0.insert(1);
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        aVLTree14.delete((-1));
        aVLTree14.insert((int) 'a');
        aVLTree14.insert((int) (byte) 100);
        int int25 = aVLTree14.height();
        aVLTree14.insert((int) (short) 1);
        org.example.AVLTree.Node node28 = aVLTree14.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        int int35 = aVLTree30.height();
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree30.getBalance(node36);
        int int38 = aVLTree30.height();
        aVLTree30.delete((int) (byte) 0);
        int int41 = aVLTree30.height();
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.delete((int) '4');
        aVLTree42.delete((-1));
        aVLTree42.insert((int) 'a');
        aVLTree42.insert((int) (byte) 100);
        org.example.AVLTree.Node node53 = aVLTree42.getRoot();
        int int54 = aVLTree30.getBalance(node53);
        int int55 = aVLTree0.getBalance(node53);
        org.example.AVLTree aVLTree56 = new org.example.AVLTree();
        org.example.AVLTree.Node node57 = null;
        int int58 = aVLTree56.getBalance(node57);
        aVLTree56.delete((int) '4');
        org.example.AVLTree aVLTree61 = new org.example.AVLTree();
        org.example.AVLTree.Node node62 = null;
        int int63 = aVLTree61.getBalance(node62);
        aVLTree61.delete((int) '4');
        int int66 = aVLTree61.height();
        org.example.AVLTree aVLTree67 = new org.example.AVLTree();
        org.example.AVLTree.Node node68 = null;
        int int69 = aVLTree67.getBalance(node68);
        org.example.AVLTree.Node node70 = null;
        int int71 = aVLTree67.getBalance(node70);
        aVLTree67.insert((int) (byte) 0);
        org.example.AVLTree.Node node74 = aVLTree67.getRoot();
        int int75 = aVLTree61.getBalance(node74);
        int int76 = aVLTree56.getBalance(node74);
        int int77 = aVLTree0.getBalance(node74);
        org.example.AVLTree.Node node78 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node78);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) -1);
        int int13 = aVLTree0.height();
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        aVLTree14.delete((-1));
        aVLTree14.insert((int) 'a');
        aVLTree14.delete((int) '4');
        aVLTree14.delete((int) (byte) 0);
        org.example.AVLTree aVLTree27 = new org.example.AVLTree();
        org.example.AVLTree.Node node28 = null;
        int int29 = aVLTree27.getBalance(node28);
        aVLTree27.delete((int) '4');
        int int32 = aVLTree27.height();
        aVLTree27.insert(100);
        aVLTree27.insert((int) ' ');
        aVLTree27.delete(0);
        aVLTree27.insert(1);
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree41.getBalance(node42);
        aVLTree41.delete((int) '4');
        org.example.AVLTree.Node node46 = aVLTree41.getRoot();
        int int47 = aVLTree41.height();
        org.example.AVLTree.Node node48 = aVLTree41.getRoot();
        org.example.AVLTree aVLTree49 = new org.example.AVLTree();
        org.example.AVLTree.Node node50 = null;
        int int51 = aVLTree49.getBalance(node50);
        aVLTree49.delete((int) '4');
        aVLTree49.delete((-1));
        aVLTree49.insert((int) 'a');
        aVLTree49.insert((int) (byte) 100);
        int int60 = aVLTree49.height();
        aVLTree49.insert((int) (short) 1);
        org.example.AVLTree.Node node63 = aVLTree49.getRoot();
        int int64 = aVLTree41.getBalance(node63);
        int int65 = aVLTree27.getBalance(node63);
        int int66 = aVLTree14.getBalance(node63);
        int int67 = aVLTree0.getBalance(node63);
        java.lang.Class<?> wildcardClass68 = node63.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (short) -1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (byte) 10);
        int int15 = aVLTree0.height();
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        aVLTree16.delete((-1));
        aVLTree16.insert((int) 'a');
        aVLTree16.insert(10);
        aVLTree16.insert((int) (short) -1);
        org.example.AVLTree aVLTree29 = new org.example.AVLTree();
        org.example.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.delete((int) '4');
        org.example.AVLTree.Node node34 = aVLTree29.getRoot();
        org.example.AVLTree.Node node36 = aVLTree29.find(0);
        org.example.AVLTree.Node node38 = aVLTree29.find((int) (short) -1);
        org.example.AVLTree aVLTree39 = new org.example.AVLTree();
        org.example.AVLTree.Node node40 = null;
        int int41 = aVLTree39.getBalance(node40);
        aVLTree39.delete((int) '4');
        int int44 = aVLTree39.height();
        aVLTree39.insert((int) (byte) 1);
        aVLTree39.insert((int) '#');
        org.example.AVLTree aVLTree49 = new org.example.AVLTree();
        org.example.AVLTree.Node node50 = null;
        int int51 = aVLTree49.getBalance(node50);
        aVLTree49.delete((int) '4');
        aVLTree49.delete((-1));
        aVLTree49.insert((int) 'a');
        aVLTree49.insert((int) (byte) 100);
        org.example.AVLTree aVLTree60 = new org.example.AVLTree();
        org.example.AVLTree.Node node61 = null;
        int int62 = aVLTree60.getBalance(node61);
        aVLTree60.delete((int) '4');
        int int65 = aVLTree60.height();
        org.example.AVLTree aVLTree66 = new org.example.AVLTree();
        org.example.AVLTree.Node node67 = null;
        int int68 = aVLTree66.getBalance(node67);
        org.example.AVLTree.Node node69 = null;
        int int70 = aVLTree66.getBalance(node69);
        aVLTree66.insert((int) (byte) 0);
        org.example.AVLTree.Node node73 = aVLTree66.getRoot();
        int int74 = aVLTree60.getBalance(node73);
        int int75 = aVLTree49.getBalance(node73);
        int int76 = aVLTree39.getBalance(node73);
        int int77 = aVLTree29.getBalance(node73);
        int int78 = aVLTree16.getBalance(node73);
        int int79 = aVLTree0.getBalance(node73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.example.AVLTree.Node node15 = aVLTree0.getRoot();
        org.example.AVLTree.Node node17 = aVLTree0.find((int) (short) 1);
        org.example.AVLTree.Node node18 = aVLTree0.getRoot();
        org.example.AVLTree.Node node19 = aVLTree0.getRoot();
        org.example.AVLTree.Node node21 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        int int33 = aVLTree28.height();
        aVLTree28.insert((int) (byte) 1);
        org.example.AVLTree.Node node37 = aVLTree28.find((-1));
        int int38 = aVLTree28.height();
        org.example.AVLTree.Node node40 = aVLTree28.find(0);
        org.example.AVLTree.Node node42 = aVLTree28.find((int) (short) 1);
        int int43 = aVLTree0.getBalance(node42);
        int int44 = aVLTree0.height();
        aVLTree0.insert(10);
        org.example.AVLTree.Node node47 = aVLTree0.getRoot();
        int int48 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.insert((int) (byte) -1);
        int int12 = aVLTree0.height();
        org.example.AVLTree.Node node14 = aVLTree0.find((int) ' ');
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree0.getBalance(node15);
        java.lang.Class<?> wildcardClass17 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        aVLTree14.delete((-1));
        aVLTree14.insert((int) 'a');
        aVLTree14.insert((int) (byte) 100);
        org.example.AVLTree.Node node25 = aVLTree14.getRoot();
        int int26 = aVLTree0.getBalance(node25);
        org.example.AVLTree.Node node28 = aVLTree0.find(0);
        aVLTree0.insert((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        org.example.AVLTree.Node node10 = aVLTree0.find(0);
        int int11 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.find((int) '#');
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        aVLTree0.insert((int) (byte) -1);
        int int12 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        aVLTree15.delete((int) '4');
        int int20 = aVLTree15.height();
        org.example.AVLTree.Node node22 = aVLTree15.find((int) (byte) 0);
        aVLTree15.insert((int) (short) -1);
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        int int30 = aVLTree25.height();
        int int31 = aVLTree25.height();
        aVLTree25.delete((int) '#');
        org.example.AVLTree.Node node35 = aVLTree25.find((int) (byte) 0);
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.delete((int) '4');
        org.example.AVLTree.Node node41 = aVLTree36.getRoot();
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree36.getBalance(node42);
        org.example.AVLTree.Node node44 = aVLTree36.getRoot();
        org.example.AVLTree.Node node45 = aVLTree36.getRoot();
        int int46 = aVLTree36.height();
        int int47 = aVLTree36.height();
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        org.example.AVLTree.Node node52 = aVLTree48.find(1);
        org.example.AVLTree.Node node54 = aVLTree48.find(10);
        int int55 = aVLTree48.height();
        aVLTree48.insert((int) (byte) 1);
        org.example.AVLTree.Node node58 = aVLTree48.getRoot();
        int int59 = aVLTree36.getBalance(node58);
        int int60 = aVLTree25.getBalance(node58);
        int int61 = aVLTree15.getBalance(node58);
        int int62 = aVLTree0.getBalance(node58);
        org.example.AVLTree.Node node63 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.delete((int) '4');
        aVLTree13.delete((-1));
        aVLTree13.insert((int) 'a');
        aVLTree13.insert((int) (byte) 100);
        int int24 = aVLTree13.height();
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        org.example.AVLTree.Node node30 = aVLTree25.getRoot();
        int int31 = aVLTree25.height();
        org.example.AVLTree.Node node32 = aVLTree25.getRoot();
        aVLTree25.delete((int) (byte) 100);
        int int35 = aVLTree25.height();
        int int36 = aVLTree25.height();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        aVLTree37.delete((-1));
        aVLTree37.insert((int) 'a');
        aVLTree37.insert((int) (byte) 100);
        int int48 = aVLTree37.height();
        aVLTree37.insert((int) (short) 1);
        org.example.AVLTree.Node node51 = aVLTree37.getRoot();
        int int52 = aVLTree25.getBalance(node51);
        int int53 = aVLTree13.getBalance(node51);
        int int54 = aVLTree0.getBalance(node51);
        org.example.AVLTree.Node node55 = aVLTree0.getRoot();
        org.example.AVLTree.Node node57 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node57);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        int int33 = aVLTree28.height();
        aVLTree28.insert((int) (byte) 1);
        org.example.AVLTree.Node node37 = aVLTree28.find((-1));
        int int38 = aVLTree28.height();
        org.example.AVLTree.Node node40 = aVLTree28.find(0);
        org.example.AVLTree.Node node42 = aVLTree28.find((int) (short) 1);
        int int43 = aVLTree0.getBalance(node42);
        int int44 = aVLTree0.height();
        org.example.AVLTree aVLTree45 = new org.example.AVLTree();
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree45.getBalance(node46);
        aVLTree45.delete((int) '4');
        aVLTree45.delete((-1));
        aVLTree45.insert((int) 'a');
        aVLTree45.insert((int) (byte) 100);
        int int56 = aVLTree45.height();
        aVLTree45.insert((int) (short) 1);
        org.example.AVLTree.Node node59 = aVLTree45.getRoot();
        org.example.AVLTree.Node node60 = aVLTree45.getRoot();
        int int61 = aVLTree0.getBalance(node60);
        java.lang.Class<?> wildcardClass62 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.delete(0);
        int int11 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (byte) 1);
        org.example.AVLTree.Node node15 = aVLTree0.find((int) (byte) 100);
        org.example.AVLTree.Node node16 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        int int9 = aVLTree0.height();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node13 = aVLTree0.find(0);
        int int14 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        org.example.AVLTree.Node node18 = aVLTree0.find((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        org.example.AVLTree.Node node12 = aVLTree8.find(1);
        org.example.AVLTree.Node node14 = aVLTree8.find(10);
        int int15 = aVLTree8.height();
        aVLTree8.insert((int) (byte) 1);
        org.example.AVLTree.Node node18 = aVLTree8.getRoot();
        int int19 = aVLTree0.getBalance(node18);
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.delete((int) '4');
        aVLTree20.delete((-1));
        aVLTree20.insert((int) 'a');
        aVLTree20.insert((int) (byte) 100);
        int int31 = aVLTree20.height();
        org.example.AVLTree.Node node33 = aVLTree20.find((int) (short) 1);
        aVLTree20.delete((int) (byte) 100);
        org.example.AVLTree.Node node36 = aVLTree20.getRoot();
        int int37 = aVLTree0.getBalance(node36);
        org.example.AVLTree.Node node38 = aVLTree0.getRoot();
        org.example.AVLTree.Node node39 = aVLTree0.getRoot();
        org.example.AVLTree.Node node41 = aVLTree0.find((int) (short) -1);
        int int42 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass12 = node11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert((int) '4');
        aVLTree0.insert((int) ' ');
        aVLTree0.insert((int) (short) -1);
        org.example.AVLTree.Node node34 = aVLTree0.getRoot();
        int int35 = aVLTree0.height();
        aVLTree0.delete(2);
        org.example.AVLTree.Node node38 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (short) -1);
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        org.example.AVLTree.Node node16 = aVLTree12.find(1);
        aVLTree12.insert((int) (byte) 100);
        aVLTree12.insert((-1));
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.delete((int) '4');
        int int31 = aVLTree26.height();
        org.example.AVLTree aVLTree32 = new org.example.AVLTree();
        org.example.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        org.example.AVLTree.Node node35 = null;
        int int36 = aVLTree32.getBalance(node35);
        aVLTree32.insert((int) (byte) 0);
        org.example.AVLTree.Node node39 = aVLTree32.getRoot();
        int int40 = aVLTree26.getBalance(node39);
        int int41 = aVLTree21.getBalance(node39);
        int int42 = aVLTree12.getBalance(node39);
        int int43 = aVLTree0.getBalance(node39);
        aVLTree0.insert(100);
        aVLTree0.delete(100);
        java.lang.Class<?> wildcardClass48 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.delete(0);
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.delete((int) '#');
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree0.getBalance(node11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        org.example.AVLTree.Node node10 = aVLTree0.find(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree9 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = aVLTree9.find((int) (short) 0);
        int int12 = aVLTree9.height();
        org.example.AVLTree.Node node14 = aVLTree9.find((int) (short) 0);
        aVLTree9.insert((int) (short) 1);
        org.example.AVLTree aVLTree17 = new org.example.AVLTree();
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.delete((int) '4');
        int int22 = aVLTree17.height();
        org.example.AVLTree.Node node24 = aVLTree17.find((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree17.getRoot();
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree26.getBalance(node29);
        aVLTree26.insert((int) (byte) 0);
        org.example.AVLTree.Node node33 = aVLTree26.getRoot();
        int int34 = aVLTree17.getBalance(node33);
        org.example.AVLTree aVLTree35 = new org.example.AVLTree();
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree35.getBalance(node36);
        org.example.AVLTree.Node node39 = aVLTree35.find(1);
        org.example.AVLTree.Node node41 = aVLTree35.find(10);
        int int42 = aVLTree35.height();
        aVLTree35.insert((int) (byte) 1);
        org.example.AVLTree.Node node45 = aVLTree35.getRoot();
        int int46 = aVLTree17.getBalance(node45);
        int int47 = aVLTree9.getBalance(node45);
        int int48 = aVLTree0.getBalance(node45);
        java.lang.Class<?> wildcardClass49 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        aVLTree0.insert((int) '#');
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (byte) -1);
        org.example.AVLTree.Node node17 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 1);
        int int21 = aVLTree0.height();
        org.example.AVLTree.Node node22 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass23 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) ' ');
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        aVLTree12.delete((-1));
        aVLTree12.insert((int) 'a');
        aVLTree12.insert((int) (byte) 100);
        int int23 = aVLTree12.height();
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        org.example.AVLTree.Node node29 = aVLTree24.getRoot();
        int int30 = aVLTree24.height();
        org.example.AVLTree.Node node31 = aVLTree24.getRoot();
        aVLTree24.delete((int) (byte) 100);
        int int34 = aVLTree24.height();
        int int35 = aVLTree24.height();
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.delete((int) '4');
        aVLTree36.delete((-1));
        aVLTree36.insert((int) 'a');
        aVLTree36.insert((int) (byte) 100);
        int int47 = aVLTree36.height();
        aVLTree36.insert((int) (short) 1);
        org.example.AVLTree.Node node50 = aVLTree36.getRoot();
        int int51 = aVLTree24.getBalance(node50);
        int int52 = aVLTree12.getBalance(node50);
        int int53 = aVLTree0.getBalance(node50);
        org.example.AVLTree.Node node54 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node54);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = aVLTree16.getRoot();
        org.example.AVLTree.Node node19 = aVLTree16.find((int) '#');
        org.example.AVLTree.Node node21 = aVLTree16.find((int) (byte) -1);
        org.example.AVLTree.Node node22 = aVLTree16.getRoot();
        org.example.AVLTree.Node node23 = aVLTree16.getRoot();
        org.example.AVLTree.Node node25 = aVLTree16.find(0);
        aVLTree16.insert((int) ' ');
        org.example.AVLTree.Node node29 = aVLTree16.find(0);
        aVLTree16.insert(10);
        int int32 = aVLTree16.height();
        org.example.AVLTree.Node node33 = aVLTree16.getRoot();
        int int34 = aVLTree0.getBalance(node33);
        int int35 = aVLTree0.height();
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        int int9 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        int int11 = aVLTree0.height();
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        aVLTree0.insert(2);
        aVLTree0.insert(0);
        int int15 = aVLTree0.height();
        int int16 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = aVLTree7.find((int) (short) 0);
        int int10 = aVLTree7.height();
        org.example.AVLTree.Node node12 = aVLTree7.find((int) (short) 0);
        aVLTree7.insert((int) (short) 1);
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        aVLTree15.delete((int) '4');
        int int20 = aVLTree15.height();
        org.example.AVLTree.Node node22 = aVLTree15.find((int) (byte) 0);
        org.example.AVLTree.Node node23 = aVLTree15.getRoot();
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree24.getBalance(node27);
        aVLTree24.insert((int) (byte) 0);
        org.example.AVLTree.Node node31 = aVLTree24.getRoot();
        int int32 = aVLTree15.getBalance(node31);
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        org.example.AVLTree.Node node37 = aVLTree33.find(1);
        org.example.AVLTree.Node node39 = aVLTree33.find(10);
        int int40 = aVLTree33.height();
        aVLTree33.insert((int) (byte) 1);
        org.example.AVLTree.Node node43 = aVLTree33.getRoot();
        int int44 = aVLTree15.getBalance(node43);
        int int45 = aVLTree7.getBalance(node43);
        int int46 = aVLTree0.getBalance(node43);
        org.example.AVLTree.Node node48 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node49 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (byte) -1);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 0);
        int int14 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) (short) 0);
        int int12 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        org.example.AVLTree.Node node12 = aVLTree0.find(10);
        aVLTree0.delete(2);
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        aVLTree15.delete((int) '4');
        int int20 = aVLTree15.height();
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree15.getBalance(node21);
        int int23 = aVLTree15.height();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree15.getBalance(node24);
        org.example.AVLTree.Node node27 = aVLTree15.find((int) (byte) 10);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        int int33 = aVLTree28.height();
        aVLTree28.insert(100);
        aVLTree28.insert((int) ' ');
        aVLTree28.delete(0);
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.delete((int) '4');
        org.example.AVLTree.Node node45 = aVLTree40.getRoot();
        int int46 = aVLTree40.height();
        org.example.AVLTree.Node node47 = aVLTree40.getRoot();
        aVLTree40.insert((int) (byte) 10);
        aVLTree40.insert((int) (short) 100);
        org.example.AVLTree.Node node53 = aVLTree40.find((int) (short) 100);
        int int54 = aVLTree28.getBalance(node53);
        int int55 = aVLTree28.height();
        org.example.AVLTree.Node node57 = aVLTree28.find((int) ' ');
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        aVLTree58.delete((int) '4');
        int int63 = aVLTree58.height();
        aVLTree58.insert((int) (byte) 1);
        org.example.AVLTree.Node node67 = aVLTree58.find((-1));
        int int68 = aVLTree58.height();
        org.example.AVLTree.Node node70 = aVLTree58.find(0);
        org.example.AVLTree.Node node71 = aVLTree58.getRoot();
        int int72 = aVLTree28.getBalance(node71);
        int int73 = aVLTree15.getBalance(node71);
        int int74 = aVLTree0.getBalance(node71);
        int int75 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.example.AVLTree.Node node15 = aVLTree0.find(100);
        aVLTree0.delete(0);
        org.example.AVLTree.Node node19 = aVLTree0.find(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (byte) -1);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete(10);
        int int16 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert((int) '4');
        aVLTree0.insert((int) ' ');
        aVLTree0.insert((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        org.example.AVLTree.Node node36 = aVLTree0.getRoot();
        org.example.AVLTree.Node node37 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (byte) -1);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree16.getBalance(node22);
        aVLTree16.insert((int) (short) -1);
        org.example.AVLTree.Node node26 = aVLTree16.getRoot();
        int int27 = aVLTree0.getBalance(node26);
        org.example.AVLTree.Node node28 = aVLTree0.getRoot();
        int int29 = aVLTree0.height();
        org.example.AVLTree.Node node30 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree aVLTree6 = new org.example.AVLTree();
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree6.getBalance(node7);
        aVLTree6.delete((int) '4');
        org.example.AVLTree.Node node11 = aVLTree6.getRoot();
        org.example.AVLTree.Node node13 = aVLTree6.find((int) (byte) 0);
        org.example.AVLTree.Node node15 = aVLTree6.find((int) '#');
        int int16 = aVLTree6.height();
        org.example.AVLTree aVLTree17 = new org.example.AVLTree();
        org.example.AVLTree.Node node18 = aVLTree17.getRoot();
        org.example.AVLTree.Node node20 = aVLTree17.find((int) '#');
        int int21 = aVLTree17.height();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree17.getBalance(node22);
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree24.getBalance(node27);
        aVLTree24.insert((int) (byte) 0);
        org.example.AVLTree.Node node31 = aVLTree24.getRoot();
        int int32 = aVLTree17.getBalance(node31);
        int int33 = aVLTree6.getBalance(node31);
        aVLTree6.insert((int) '4');
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.delete((int) '4');
        int int41 = aVLTree36.height();
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        org.example.AVLTree.Node node45 = null;
        int int46 = aVLTree42.getBalance(node45);
        aVLTree42.insert((int) (byte) 0);
        org.example.AVLTree.Node node49 = aVLTree42.getRoot();
        int int50 = aVLTree36.getBalance(node49);
        int int51 = aVLTree6.getBalance(node49);
        aVLTree6.insert((int) '#');
        aVLTree6.delete((int) (byte) -1);
        org.example.AVLTree.Node node56 = aVLTree6.getRoot();
        int int57 = aVLTree0.getBalance(node56);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.find(0);
        aVLTree0.insert((int) ' ');
        org.example.AVLTree.Node node13 = aVLTree0.find(0);
        aVLTree0.insert(10);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree16.getBalance(node22);
        org.example.AVLTree.Node node24 = aVLTree16.getRoot();
        org.example.AVLTree.Node node25 = aVLTree16.getRoot();
        org.example.AVLTree.Node node26 = aVLTree16.getRoot();
        org.example.AVLTree aVLTree27 = new org.example.AVLTree();
        org.example.AVLTree.Node node28 = null;
        int int29 = aVLTree27.getBalance(node28);
        aVLTree27.delete((int) '4');
        aVLTree27.insert((int) 'a');
        org.example.AVLTree.Node node34 = aVLTree27.getRoot();
        int int35 = aVLTree16.getBalance(node34);
        int int36 = aVLTree0.getBalance(node34);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree aVLTree5 = new org.example.AVLTree();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.delete((int) '4');
        org.example.AVLTree.Node node10 = aVLTree5.getRoot();
        int int11 = aVLTree5.height();
        org.example.AVLTree.Node node12 = aVLTree5.getRoot();
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.delete((int) '4');
        aVLTree13.delete((-1));
        aVLTree13.insert((int) 'a');
        aVLTree13.insert((int) (byte) 100);
        int int24 = aVLTree13.height();
        aVLTree13.insert((int) (short) 1);
        org.example.AVLTree.Node node27 = aVLTree13.getRoot();
        int int28 = aVLTree5.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        org.example.AVLTree.Node node34 = aVLTree30.find(1);
        aVLTree30.insert((int) (byte) 100);
        aVLTree30.insert((-1));
        org.example.AVLTree aVLTree39 = new org.example.AVLTree();
        org.example.AVLTree.Node node40 = null;
        int int41 = aVLTree39.getBalance(node40);
        aVLTree39.delete((int) '4');
        org.example.AVLTree aVLTree44 = new org.example.AVLTree();
        org.example.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        aVLTree44.delete((int) '4');
        int int49 = aVLTree44.height();
        org.example.AVLTree aVLTree50 = new org.example.AVLTree();
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree50.getBalance(node51);
        org.example.AVLTree.Node node53 = null;
        int int54 = aVLTree50.getBalance(node53);
        aVLTree50.insert((int) (byte) 0);
        org.example.AVLTree.Node node57 = aVLTree50.getRoot();
        int int58 = aVLTree44.getBalance(node57);
        int int59 = aVLTree39.getBalance(node57);
        int int60 = aVLTree30.getBalance(node57);
        int int61 = aVLTree0.getBalance(node57);
        int int62 = aVLTree0.height();
        org.example.AVLTree.Node node63 = aVLTree0.getRoot();
        aVLTree0.delete(2);
        org.example.AVLTree.Node node66 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(node66);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.insert(0);
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        int int12 = aVLTree0.height();
        org.example.AVLTree.Node node14 = aVLTree0.find((int) '4');
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = aVLTree15.getRoot();
        org.example.AVLTree.Node node18 = aVLTree15.find((int) '#');
        org.example.AVLTree.Node node20 = aVLTree15.find((int) (byte) -1);
        org.example.AVLTree.Node node21 = aVLTree15.getRoot();
        org.example.AVLTree.Node node22 = aVLTree15.getRoot();
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.delete((int) '4');
        org.example.AVLTree.Node node28 = aVLTree23.getRoot();
        int int29 = aVLTree23.height();
        org.example.AVLTree.Node node30 = aVLTree23.getRoot();
        org.example.AVLTree aVLTree31 = new org.example.AVLTree();
        org.example.AVLTree.Node node32 = null;
        int int33 = aVLTree31.getBalance(node32);
        aVLTree31.delete((int) '4');
        aVLTree31.delete((-1));
        aVLTree31.insert((int) 'a');
        aVLTree31.insert((int) (byte) 100);
        int int42 = aVLTree31.height();
        aVLTree31.insert((int) (short) 1);
        org.example.AVLTree.Node node45 = aVLTree31.getRoot();
        int int46 = aVLTree23.getBalance(node45);
        int int47 = aVLTree15.getBalance(node45);
        int int48 = aVLTree0.getBalance(node45);
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        aVLTree0.delete(1);
        org.example.AVLTree.Node node10 = aVLTree0.find(0);
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        aVLTree11.delete((int) '4');
        org.example.AVLTree.Node node16 = aVLTree11.getRoot();
        int int17 = aVLTree11.height();
        org.example.AVLTree.Node node18 = aVLTree11.getRoot();
        int int19 = aVLTree11.height();
        aVLTree11.delete(0);
        int int22 = aVLTree11.height();
        org.example.AVLTree.Node node24 = aVLTree11.find((int) (byte) 1);
        org.example.AVLTree.Node node26 = aVLTree11.find((int) (byte) 100);
        int int27 = aVLTree11.height();
        org.example.AVLTree.Node node29 = aVLTree11.find((int) (short) 10);
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        org.example.AVLTree.Node node37 = aVLTree30.find(0);
        org.example.AVLTree.Node node39 = aVLTree30.find((int) (short) -1);
        org.example.AVLTree.Node node40 = aVLTree30.getRoot();
        aVLTree30.delete((int) (short) 1);
        aVLTree30.insert((-1));
        org.example.AVLTree.Node node46 = aVLTree30.find((int) '4');
        org.example.AVLTree aVLTree47 = new org.example.AVLTree();
        org.example.AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        org.example.AVLTree.Node node51 = aVLTree47.find(1);
        org.example.AVLTree.Node node53 = aVLTree47.find(10);
        int int54 = aVLTree47.height();
        org.example.AVLTree.Node node55 = null;
        int int56 = aVLTree47.getBalance(node55);
        org.example.AVLTree aVLTree57 = new org.example.AVLTree();
        org.example.AVLTree.Node node58 = null;
        int int59 = aVLTree57.getBalance(node58);
        aVLTree57.delete((int) '4');
        int int62 = aVLTree57.height();
        int int63 = aVLTree57.height();
        aVLTree57.delete((int) '#');
        org.example.AVLTree.Node node67 = aVLTree57.find((int) (byte) 0);
        org.example.AVLTree aVLTree68 = new org.example.AVLTree();
        org.example.AVLTree.Node node69 = null;
        int int70 = aVLTree68.getBalance(node69);
        aVLTree68.delete((int) '4');
        org.example.AVLTree.Node node73 = aVLTree68.getRoot();
        org.example.AVLTree.Node node74 = null;
        int int75 = aVLTree68.getBalance(node74);
        org.example.AVLTree.Node node76 = aVLTree68.getRoot();
        org.example.AVLTree.Node node77 = aVLTree68.getRoot();
        int int78 = aVLTree68.height();
        int int79 = aVLTree68.height();
        org.example.AVLTree aVLTree80 = new org.example.AVLTree();
        org.example.AVLTree.Node node81 = null;
        int int82 = aVLTree80.getBalance(node81);
        org.example.AVLTree.Node node84 = aVLTree80.find(1);
        org.example.AVLTree.Node node86 = aVLTree80.find(10);
        int int87 = aVLTree80.height();
        aVLTree80.insert((int) (byte) 1);
        org.example.AVLTree.Node node90 = aVLTree80.getRoot();
        int int91 = aVLTree68.getBalance(node90);
        int int92 = aVLTree57.getBalance(node90);
        int int93 = aVLTree47.getBalance(node90);
        aVLTree47.insert((-1));
        org.example.AVLTree.Node node96 = aVLTree47.getRoot();
        int int97 = aVLTree30.getBalance(node96);
        int int98 = aVLTree11.getBalance(node96);
        int int99 = aVLTree0.getBalance(node96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 1);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.example.AVLTree.Node node16 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node17 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node21 = aVLTree0.find(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        int int12 = aVLTree0.height();
        int int13 = aVLTree0.height();
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        int int19 = aVLTree14.height();
        aVLTree14.delete((int) (byte) 100);
        aVLTree14.delete(10);
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        int int29 = aVLTree24.height();
        aVLTree24.insert(100);
        aVLTree24.insert((int) ' ');
        aVLTree24.delete(0);
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.delete((int) '4');
        org.example.AVLTree.Node node41 = aVLTree36.getRoot();
        int int42 = aVLTree36.height();
        org.example.AVLTree.Node node43 = aVLTree36.getRoot();
        aVLTree36.insert((int) (byte) 10);
        aVLTree36.insert((int) (short) 100);
        org.example.AVLTree.Node node49 = aVLTree36.find((int) (short) 100);
        int int50 = aVLTree24.getBalance(node49);
        org.example.AVLTree aVLTree51 = new org.example.AVLTree();
        org.example.AVLTree.Node node52 = null;
        int int53 = aVLTree51.getBalance(node52);
        aVLTree51.delete((int) '4');
        org.example.AVLTree.Node node56 = aVLTree51.getRoot();
        int int57 = aVLTree51.height();
        org.example.AVLTree.Node node58 = aVLTree51.getRoot();
        aVLTree51.delete((int) (byte) 100);
        int int61 = aVLTree51.height();
        int int62 = aVLTree51.height();
        org.example.AVLTree aVLTree63 = new org.example.AVLTree();
        org.example.AVLTree.Node node64 = null;
        int int65 = aVLTree63.getBalance(node64);
        aVLTree63.delete((int) '4');
        aVLTree63.delete((-1));
        aVLTree63.insert((int) 'a');
        aVLTree63.insert((int) (byte) 100);
        int int74 = aVLTree63.height();
        aVLTree63.insert((int) (short) 1);
        org.example.AVLTree.Node node77 = aVLTree63.getRoot();
        int int78 = aVLTree51.getBalance(node77);
        aVLTree51.insert((int) (byte) 10);
        int int81 = aVLTree51.height();
        org.example.AVLTree.Node node82 = aVLTree51.getRoot();
        int int83 = aVLTree24.getBalance(node82);
        int int84 = aVLTree14.getBalance(node82);
        int int85 = aVLTree0.getBalance(node82);
        java.lang.Class<?> wildcardClass86 = node82.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert((int) '4');
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        int int35 = aVLTree30.height();
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        org.example.AVLTree.Node node39 = null;
        int int40 = aVLTree36.getBalance(node39);
        aVLTree36.insert((int) (byte) 0);
        org.example.AVLTree.Node node43 = aVLTree36.getRoot();
        int int44 = aVLTree30.getBalance(node43);
        int int45 = aVLTree0.getBalance(node43);
        org.example.AVLTree.Node node46 = aVLTree0.getRoot();
        int int47 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        org.example.AVLTree.Node node8 = aVLTree0.find((-1));
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) (short) 100);
        org.example.AVLTree aVLTree17 = new org.example.AVLTree();
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.delete((int) '4');
        org.example.AVLTree.Node node22 = aVLTree17.getRoot();
        int int23 = aVLTree17.height();
        org.example.AVLTree.Node node24 = aVLTree17.getRoot();
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        aVLTree25.delete((-1));
        aVLTree25.insert((int) 'a');
        aVLTree25.insert((int) (byte) 100);
        int int36 = aVLTree25.height();
        aVLTree25.insert((int) (short) 1);
        org.example.AVLTree.Node node39 = aVLTree25.getRoot();
        int int40 = aVLTree17.getBalance(node39);
        int int41 = aVLTree12.getBalance(node39);
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        org.example.AVLTree.Node node46 = aVLTree42.find(1);
        aVLTree42.insert((int) (byte) 100);
        aVLTree42.insert((-1));
        org.example.AVLTree aVLTree51 = new org.example.AVLTree();
        org.example.AVLTree.Node node52 = null;
        int int53 = aVLTree51.getBalance(node52);
        aVLTree51.delete((int) '4');
        org.example.AVLTree aVLTree56 = new org.example.AVLTree();
        org.example.AVLTree.Node node57 = null;
        int int58 = aVLTree56.getBalance(node57);
        aVLTree56.delete((int) '4');
        int int61 = aVLTree56.height();
        org.example.AVLTree aVLTree62 = new org.example.AVLTree();
        org.example.AVLTree.Node node63 = null;
        int int64 = aVLTree62.getBalance(node63);
        org.example.AVLTree.Node node65 = null;
        int int66 = aVLTree62.getBalance(node65);
        aVLTree62.insert((int) (byte) 0);
        org.example.AVLTree.Node node69 = aVLTree62.getRoot();
        int int70 = aVLTree56.getBalance(node69);
        int int71 = aVLTree51.getBalance(node69);
        int int72 = aVLTree42.getBalance(node69);
        int int73 = aVLTree12.getBalance(node69);
        org.example.AVLTree.Node node75 = aVLTree12.find((int) (short) 100);
        org.example.AVLTree.Node node76 = aVLTree12.getRoot();
        org.example.AVLTree.Node node78 = aVLTree12.find((int) (short) -1);
        org.example.AVLTree.Node node79 = aVLTree12.getRoot();
        org.example.AVLTree aVLTree80 = new org.example.AVLTree();
        org.example.AVLTree.Node node81 = null;
        int int82 = aVLTree80.getBalance(node81);
        aVLTree80.delete((int) '4');
        int int85 = aVLTree80.height();
        aVLTree80.insert(100);
        aVLTree80.insert((int) ' ');
        aVLTree80.delete((-1));
        int int92 = aVLTree80.height();
        org.example.AVLTree.Node node93 = aVLTree80.getRoot();
        org.example.AVLTree.Node node94 = aVLTree80.getRoot();
        int int95 = aVLTree12.getBalance(node94);
        int int96 = aVLTree0.getBalance(node94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert(10);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.example.AVLTree.Node node16 = aVLTree0.find((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = node16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree aVLTree5 = new org.example.AVLTree();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.delete((int) '4');
        org.example.AVLTree.Node node10 = aVLTree5.getRoot();
        int int11 = aVLTree5.height();
        org.example.AVLTree.Node node12 = aVLTree5.getRoot();
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.delete((int) '4');
        aVLTree13.delete((-1));
        aVLTree13.insert((int) 'a');
        aVLTree13.insert((int) (byte) 100);
        int int24 = aVLTree13.height();
        aVLTree13.insert((int) (short) 1);
        org.example.AVLTree.Node node27 = aVLTree13.getRoot();
        int int28 = aVLTree5.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        org.example.AVLTree.Node node34 = aVLTree30.find(1);
        aVLTree30.insert((int) (byte) 100);
        aVLTree30.insert((-1));
        org.example.AVLTree aVLTree39 = new org.example.AVLTree();
        org.example.AVLTree.Node node40 = null;
        int int41 = aVLTree39.getBalance(node40);
        aVLTree39.delete((int) '4');
        org.example.AVLTree aVLTree44 = new org.example.AVLTree();
        org.example.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        aVLTree44.delete((int) '4');
        int int49 = aVLTree44.height();
        org.example.AVLTree aVLTree50 = new org.example.AVLTree();
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree50.getBalance(node51);
        org.example.AVLTree.Node node53 = null;
        int int54 = aVLTree50.getBalance(node53);
        aVLTree50.insert((int) (byte) 0);
        org.example.AVLTree.Node node57 = aVLTree50.getRoot();
        int int58 = aVLTree44.getBalance(node57);
        int int59 = aVLTree39.getBalance(node57);
        int int60 = aVLTree30.getBalance(node57);
        int int61 = aVLTree0.getBalance(node57);
        int int62 = aVLTree0.height();
        int int63 = aVLTree0.height();
        aVLTree0.insert(1);
        org.example.AVLTree aVLTree66 = new org.example.AVLTree();
        org.example.AVLTree.Node node67 = null;
        int int68 = aVLTree66.getBalance(node67);
        aVLTree66.delete((int) '4');
        int int71 = aVLTree66.height();
        org.example.AVLTree.Node node72 = null;
        int int73 = aVLTree66.getBalance(node72);
        int int74 = aVLTree66.height();
        org.example.AVLTree.Node node75 = null;
        int int76 = aVLTree66.getBalance(node75);
        aVLTree66.insert((int) '4');
        int int79 = aVLTree66.height();
        org.example.AVLTree.Node node80 = aVLTree66.getRoot();
        int int81 = aVLTree0.getBalance(node80);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        int int12 = aVLTree0.height();
        org.example.AVLTree.Node node14 = aVLTree0.find((int) '4');
        int int15 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        org.example.AVLTree.Node node23 = aVLTree18.getRoot();
        int int24 = aVLTree18.height();
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        aVLTree18.insert((int) (byte) 1);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree28.getBalance(node31);
        aVLTree28.insert((int) (byte) 0);
        org.example.AVLTree aVLTree35 = new org.example.AVLTree();
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree35.getBalance(node36);
        aVLTree35.delete((int) '4');
        int int40 = aVLTree35.height();
        aVLTree35.insert(100);
        aVLTree35.insert((int) ' ');
        aVLTree35.delete(0);
        aVLTree35.insert(1);
        org.example.AVLTree aVLTree49 = new org.example.AVLTree();
        org.example.AVLTree.Node node50 = null;
        int int51 = aVLTree49.getBalance(node50);
        aVLTree49.delete((int) '4');
        aVLTree49.delete((-1));
        aVLTree49.insert((int) 'a');
        aVLTree49.insert((int) (byte) 100);
        int int60 = aVLTree49.height();
        aVLTree49.insert((int) (short) 1);
        org.example.AVLTree.Node node63 = aVLTree49.getRoot();
        int int64 = aVLTree35.getBalance(node63);
        int int65 = aVLTree28.getBalance(node63);
        org.example.AVLTree.Node node66 = aVLTree28.getRoot();
        org.example.AVLTree aVLTree67 = new org.example.AVLTree();
        org.example.AVLTree.Node node68 = null;
        int int69 = aVLTree67.getBalance(node68);
        aVLTree67.delete((int) '4');
        int int72 = aVLTree67.height();
        org.example.AVLTree aVLTree73 = new org.example.AVLTree();
        org.example.AVLTree.Node node74 = null;
        int int75 = aVLTree73.getBalance(node74);
        org.example.AVLTree.Node node76 = null;
        int int77 = aVLTree73.getBalance(node76);
        aVLTree73.insert((int) (byte) 0);
        org.example.AVLTree.Node node80 = aVLTree73.getRoot();
        int int81 = aVLTree67.getBalance(node80);
        int int82 = aVLTree28.getBalance(node80);
        int int83 = aVLTree18.getBalance(node80);
        int int84 = aVLTree0.getBalance(node80);
        org.example.AVLTree.Node node86 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNull(node86);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete(1);
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        aVLTree15.delete((int) '4');
        int int20 = aVLTree15.height();
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree21.getBalance(node24);
        aVLTree21.insert((int) (byte) 0);
        org.example.AVLTree.Node node28 = aVLTree21.getRoot();
        int int29 = aVLTree15.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) (byte) 0);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        org.example.AVLTree.Node node16 = aVLTree12.find(1);
        aVLTree12.insert((int) (byte) 100);
        int int19 = aVLTree12.height();
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        org.example.AVLTree.Node node23 = aVLTree12.find(1);
        aVLTree12.insert(0);
        aVLTree12.insert((int) (short) 10);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        int int33 = aVLTree28.height();
        aVLTree28.insert((int) (byte) 1);
        org.example.AVLTree.Node node37 = aVLTree28.find((-1));
        int int38 = aVLTree28.height();
        org.example.AVLTree.Node node40 = aVLTree28.find(0);
        org.example.AVLTree.Node node41 = aVLTree28.getRoot();
        int int42 = aVLTree12.getBalance(node41);
        int int43 = aVLTree0.getBalance(node41);
        org.example.AVLTree.Node node45 = aVLTree0.find(0);
        int int46 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) (byte) 0);
        int int16 = aVLTree0.height();
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (byte) 0);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        int int17 = aVLTree12.height();
        aVLTree12.delete((int) (byte) 100);
        org.example.AVLTree.Node node21 = aVLTree12.find((int) (short) 100);
        aVLTree12.delete(10);
        int int24 = aVLTree12.height();
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        org.example.AVLTree.Node node30 = aVLTree25.getRoot();
        org.example.AVLTree.Node node32 = aVLTree25.find((int) (byte) 0);
        aVLTree25.delete((int) (short) 100);
        org.example.AVLTree.Node node36 = aVLTree25.find((int) (byte) 0);
        int int37 = aVLTree25.height();
        org.example.AVLTree.Node node39 = aVLTree25.find((int) '4');
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = aVLTree40.getRoot();
        org.example.AVLTree.Node node43 = aVLTree40.find((int) '#');
        org.example.AVLTree.Node node45 = aVLTree40.find((int) (byte) -1);
        org.example.AVLTree.Node node46 = aVLTree40.getRoot();
        org.example.AVLTree.Node node47 = aVLTree40.getRoot();
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        aVLTree48.delete((int) '4');
        org.example.AVLTree.Node node53 = aVLTree48.getRoot();
        int int54 = aVLTree48.height();
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        org.example.AVLTree aVLTree56 = new org.example.AVLTree();
        org.example.AVLTree.Node node57 = null;
        int int58 = aVLTree56.getBalance(node57);
        aVLTree56.delete((int) '4');
        aVLTree56.delete((-1));
        aVLTree56.insert((int) 'a');
        aVLTree56.insert((int) (byte) 100);
        int int67 = aVLTree56.height();
        aVLTree56.insert((int) (short) 1);
        org.example.AVLTree.Node node70 = aVLTree56.getRoot();
        int int71 = aVLTree48.getBalance(node70);
        int int72 = aVLTree40.getBalance(node70);
        int int73 = aVLTree25.getBalance(node70);
        int int74 = aVLTree12.getBalance(node70);
        int int75 = aVLTree0.getBalance(node70);
        aVLTree0.insert(10);
        org.example.AVLTree.Node node78 = aVLTree0.getRoot();
        org.example.AVLTree.Node node80 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node81 = aVLTree0.getRoot();
        org.example.AVLTree.Node node83 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node83);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) ' ');
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        int int13 = aVLTree8.height();
        aVLTree8.insert((int) (byte) 1);
        org.example.AVLTree.Node node17 = aVLTree8.find((-1));
        int int18 = aVLTree8.height();
        org.example.AVLTree.Node node20 = aVLTree8.find(0);
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        aVLTree21.delete((-1));
        aVLTree21.insert((int) 'a');
        aVLTree21.insert((int) (byte) 100);
        int int32 = aVLTree21.height();
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.delete((int) '4');
        org.example.AVLTree.Node node38 = aVLTree33.getRoot();
        int int39 = aVLTree33.height();
        org.example.AVLTree.Node node40 = aVLTree33.getRoot();
        aVLTree33.delete((int) (byte) 100);
        int int43 = aVLTree33.height();
        int int44 = aVLTree33.height();
        org.example.AVLTree aVLTree45 = new org.example.AVLTree();
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree45.getBalance(node46);
        aVLTree45.delete((int) '4');
        aVLTree45.delete((-1));
        aVLTree45.insert((int) 'a');
        aVLTree45.insert((int) (byte) 100);
        int int56 = aVLTree45.height();
        aVLTree45.insert((int) (short) 1);
        org.example.AVLTree.Node node59 = aVLTree45.getRoot();
        int int60 = aVLTree33.getBalance(node59);
        int int61 = aVLTree21.getBalance(node59);
        int int62 = aVLTree8.getBalance(node59);
        org.example.AVLTree aVLTree63 = new org.example.AVLTree();
        org.example.AVLTree.Node node64 = null;
        int int65 = aVLTree63.getBalance(node64);
        aVLTree63.delete((int) '4');
        org.example.AVLTree.Node node68 = aVLTree63.getRoot();
        int int69 = aVLTree63.height();
        org.example.AVLTree.Node node70 = aVLTree63.getRoot();
        aVLTree63.delete((int) (byte) 100);
        int int73 = aVLTree63.height();
        int int74 = aVLTree63.height();
        aVLTree63.insert((int) (byte) 0);
        org.example.AVLTree.Node node77 = aVLTree63.getRoot();
        int int78 = aVLTree8.getBalance(node77);
        org.example.AVLTree.Node node79 = aVLTree8.getRoot();
        int int80 = aVLTree0.getBalance(node79);
        aVLTree0.insert(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) -1);
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.delete((int) '4');
        aVLTree13.delete((-1));
        aVLTree13.insert((int) 'a');
        aVLTree13.insert((int) (byte) 100);
        int int24 = aVLTree13.height();
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        org.example.AVLTree.Node node30 = aVLTree25.getRoot();
        int int31 = aVLTree25.height();
        org.example.AVLTree.Node node32 = aVLTree25.getRoot();
        aVLTree25.delete((int) (byte) 100);
        int int35 = aVLTree25.height();
        int int36 = aVLTree25.height();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        aVLTree37.delete((-1));
        aVLTree37.insert((int) 'a');
        aVLTree37.insert((int) (byte) 100);
        int int48 = aVLTree37.height();
        aVLTree37.insert((int) (short) 1);
        org.example.AVLTree.Node node51 = aVLTree37.getRoot();
        int int52 = aVLTree25.getBalance(node51);
        int int53 = aVLTree13.getBalance(node51);
        int int54 = aVLTree0.getBalance(node51);
        aVLTree0.delete((int) (byte) 1);
        org.example.AVLTree.Node node58 = aVLTree0.find(100);
        org.example.AVLTree.Node node59 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(node59);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert((int) '4');
        aVLTree0.insert((int) ' ');
        aVLTree0.insert((int) (short) -1);
        org.example.AVLTree.Node node34 = aVLTree0.getRoot();
        aVLTree0.insert((int) 'a');
        java.lang.Class<?> wildcardClass37 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) -1);
        int int13 = aVLTree0.height();
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(1);
        aVLTree0.delete((int) (short) 100);
        int int14 = aVLTree0.height();
        aVLTree0.delete(10);
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        org.example.AVLTree.Node node12 = aVLTree8.find(1);
        org.example.AVLTree.Node node14 = aVLTree8.find(10);
        int int15 = aVLTree8.height();
        aVLTree8.insert((int) (byte) 1);
        org.example.AVLTree.Node node18 = aVLTree8.getRoot();
        int int19 = aVLTree0.getBalance(node18);
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) 'a');
        int int13 = aVLTree0.height();
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        int int3 = aVLTree0.height();
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node7 = aVLTree0.find((int) '4');
        int int8 = aVLTree0.height();
        aVLTree0.delete(0);
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        aVLTree0.insert(10);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (short) 100);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) (byte) 10);
        org.example.AVLTree.Node node17 = aVLTree0.find((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        org.example.AVLTree.Node node21 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        aVLTree0.insert((int) '4');
        int int13 = aVLTree0.height();
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = aVLTree14.getRoot();
        org.example.AVLTree.Node node17 = aVLTree14.find((int) '#');
        int int18 = aVLTree14.height();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree14.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree14.getBalance(node21);
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.delete((int) '4');
        org.example.AVLTree.Node node28 = aVLTree23.getRoot();
        org.example.AVLTree.Node node30 = aVLTree23.find(0);
        org.example.AVLTree.Node node32 = aVLTree23.find((int) (short) -1);
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.delete((int) '4');
        org.example.AVLTree.Node node38 = aVLTree33.getRoot();
        org.example.AVLTree.Node node40 = aVLTree33.find((int) (byte) 0);
        org.example.AVLTree.Node node42 = aVLTree33.find((int) '#');
        org.example.AVLTree.Node node43 = aVLTree33.getRoot();
        aVLTree33.insert((int) (short) -1);
        org.example.AVLTree aVLTree46 = new org.example.AVLTree();
        org.example.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.delete((int) '4');
        aVLTree46.delete((-1));
        aVLTree46.insert((int) 'a');
        aVLTree46.insert((int) (byte) 100);
        int int57 = aVLTree46.height();
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        aVLTree58.delete((int) '4');
        org.example.AVLTree.Node node63 = aVLTree58.getRoot();
        int int64 = aVLTree58.height();
        org.example.AVLTree.Node node65 = aVLTree58.getRoot();
        aVLTree58.delete((int) (byte) 100);
        int int68 = aVLTree58.height();
        int int69 = aVLTree58.height();
        org.example.AVLTree aVLTree70 = new org.example.AVLTree();
        org.example.AVLTree.Node node71 = null;
        int int72 = aVLTree70.getBalance(node71);
        aVLTree70.delete((int) '4');
        aVLTree70.delete((-1));
        aVLTree70.insert((int) 'a');
        aVLTree70.insert((int) (byte) 100);
        int int81 = aVLTree70.height();
        aVLTree70.insert((int) (short) 1);
        org.example.AVLTree.Node node84 = aVLTree70.getRoot();
        int int85 = aVLTree58.getBalance(node84);
        int int86 = aVLTree46.getBalance(node84);
        int int87 = aVLTree33.getBalance(node84);
        int int88 = aVLTree23.getBalance(node84);
        int int89 = aVLTree14.getBalance(node84);
        int int90 = aVLTree0.getBalance(node84);
        aVLTree0.delete((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = aVLTree11.getRoot();
        org.example.AVLTree.Node node14 = aVLTree11.find((int) '#');
        int int15 = aVLTree11.height();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree11.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (byte) 0);
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert((int) '4');
        aVLTree0.insert((int) ' ');
        aVLTree0.insert((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        org.example.AVLTree.Node node36 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        int int42 = aVLTree37.height();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree37.getBalance(node43);
        int int45 = aVLTree37.height();
        aVLTree37.delete((int) (byte) 0);
        int int48 = aVLTree37.height();
        org.example.AVLTree aVLTree49 = new org.example.AVLTree();
        org.example.AVLTree.Node node50 = null;
        int int51 = aVLTree49.getBalance(node50);
        aVLTree49.delete((int) '4');
        aVLTree49.delete((-1));
        aVLTree49.insert((int) 'a');
        aVLTree49.insert((int) (byte) 100);
        org.example.AVLTree.Node node60 = aVLTree49.getRoot();
        int int61 = aVLTree37.getBalance(node60);
        int int62 = aVLTree0.getBalance(node60);
        org.example.AVLTree.Node node64 = aVLTree0.find(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNull(node64);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = null;
        int int3 = aVLTree0.getBalance(node2);
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) -1);
        aVLTree0.insert(10);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        aVLTree0.insert((int) (short) 100);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        int int17 = aVLTree12.height();
        aVLTree12.insert((int) (byte) 1);
        org.example.AVLTree.Node node21 = aVLTree12.find((-1));
        int int22 = aVLTree12.height();
        org.example.AVLTree.Node node24 = aVLTree12.find(0);
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        aVLTree25.delete((-1));
        aVLTree25.insert((int) 'a');
        aVLTree25.insert((int) (byte) 100);
        int int36 = aVLTree25.height();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        org.example.AVLTree.Node node42 = aVLTree37.getRoot();
        int int43 = aVLTree37.height();
        org.example.AVLTree.Node node44 = aVLTree37.getRoot();
        aVLTree37.delete((int) (byte) 100);
        int int47 = aVLTree37.height();
        int int48 = aVLTree37.height();
        org.example.AVLTree aVLTree49 = new org.example.AVLTree();
        org.example.AVLTree.Node node50 = null;
        int int51 = aVLTree49.getBalance(node50);
        aVLTree49.delete((int) '4');
        aVLTree49.delete((-1));
        aVLTree49.insert((int) 'a');
        aVLTree49.insert((int) (byte) 100);
        int int60 = aVLTree49.height();
        aVLTree49.insert((int) (short) 1);
        org.example.AVLTree.Node node63 = aVLTree49.getRoot();
        int int64 = aVLTree37.getBalance(node63);
        int int65 = aVLTree25.getBalance(node63);
        int int66 = aVLTree12.getBalance(node63);
        org.example.AVLTree aVLTree67 = new org.example.AVLTree();
        org.example.AVLTree.Node node68 = null;
        int int69 = aVLTree67.getBalance(node68);
        aVLTree67.delete((int) '4');
        org.example.AVLTree.Node node72 = aVLTree67.getRoot();
        int int73 = aVLTree67.height();
        org.example.AVLTree.Node node74 = aVLTree67.getRoot();
        aVLTree67.delete((int) (byte) 100);
        int int77 = aVLTree67.height();
        int int78 = aVLTree67.height();
        aVLTree67.insert((int) (byte) 0);
        org.example.AVLTree.Node node81 = aVLTree67.getRoot();
        int int82 = aVLTree12.getBalance(node81);
        int int83 = aVLTree0.getBalance(node81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        aVLTree8.delete((-1));
        aVLTree8.insert((int) 'a');
        aVLTree8.insert((int) (byte) 100);
        int int19 = aVLTree8.height();
        aVLTree8.insert((int) (short) 1);
        org.example.AVLTree.Node node22 = aVLTree8.getRoot();
        int int23 = aVLTree0.getBalance(node22);
        aVLTree0.delete(1);
        org.example.AVLTree.Node node26 = aVLTree0.getRoot();
        org.example.AVLTree.Node node28 = aVLTree0.find(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        aVLTree0.insert((int) (byte) -1);
        int int12 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree0.getBalance(node14);
        org.example.AVLTree.Node node17 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = aVLTree18.getRoot();
        org.example.AVLTree.Node node21 = aVLTree18.find((int) '#');
        org.example.AVLTree.Node node23 = aVLTree18.find((int) (byte) -1);
        org.example.AVLTree.Node node24 = aVLTree18.getRoot();
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        org.example.AVLTree.Node node27 = aVLTree18.find(0);
        aVLTree18.insert((int) ' ');
        org.example.AVLTree.Node node31 = aVLTree18.find(0);
        aVLTree18.insert(10);
        int int34 = aVLTree18.height();
        org.example.AVLTree.Node node35 = aVLTree18.getRoot();
        org.example.AVLTree.Node node36 = aVLTree18.getRoot();
        int int37 = aVLTree0.getBalance(node36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree9 = new org.example.AVLTree();
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree9.getBalance(node10);
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (byte) 0);
        org.example.AVLTree.Node node16 = aVLTree9.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        org.example.AVLTree.Node node22 = aVLTree18.find(1);
        org.example.AVLTree.Node node24 = aVLTree18.find(10);
        int int25 = aVLTree18.height();
        aVLTree18.insert((int) (byte) 1);
        org.example.AVLTree.Node node28 = aVLTree18.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        int int30 = aVLTree0.height();
        int int31 = aVLTree0.height();
        org.example.AVLTree.Node node32 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        aVLTree0.insert((int) '#');
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 1);
        org.example.AVLTree.Node node15 = aVLTree0.find((int) (short) 100);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        int int21 = aVLTree16.height();
        aVLTree16.delete((int) (byte) 100);
        org.example.AVLTree.Node node25 = aVLTree16.find((int) (short) 100);
        aVLTree16.delete(10);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        org.example.AVLTree.Node node33 = aVLTree28.getRoot();
        org.example.AVLTree.Node node35 = aVLTree28.find((int) (byte) 0);
        aVLTree28.insert((int) (byte) 1);
        org.example.AVLTree aVLTree38 = new org.example.AVLTree();
        org.example.AVLTree.Node node39 = null;
        int int40 = aVLTree38.getBalance(node39);
        aVLTree38.delete((int) '4');
        int int43 = aVLTree38.height();
        aVLTree38.insert(100);
        aVLTree38.insert((int) ' ');
        aVLTree38.delete(0);
        aVLTree38.insert(1);
        org.example.AVLTree aVLTree52 = new org.example.AVLTree();
        org.example.AVLTree.Node node53 = null;
        int int54 = aVLTree52.getBalance(node53);
        aVLTree52.delete((int) '4');
        aVLTree52.delete((-1));
        aVLTree52.insert((int) 'a');
        aVLTree52.insert((int) (byte) 100);
        int int63 = aVLTree52.height();
        aVLTree52.insert((int) (short) 1);
        org.example.AVLTree.Node node66 = aVLTree52.getRoot();
        int int67 = aVLTree38.getBalance(node66);
        int int68 = aVLTree28.getBalance(node66);
        int int69 = aVLTree16.getBalance(node66);
        aVLTree16.insert((int) '#');
        org.example.AVLTree.Node node72 = aVLTree16.getRoot();
        int int73 = aVLTree0.getBalance(node72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = null;
        int int3 = aVLTree0.getBalance(node2);
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) -1);
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (byte) 1);
        int int11 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((-1));
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree0.getBalance(node12);
        org.example.AVLTree.Node node15 = aVLTree0.find((int) ' ');
        int int16 = aVLTree0.height();
        int int17 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(1);
        aVLTree0.insert(0);
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        int int19 = aVLTree14.height();
        aVLTree14.insert((int) (byte) 1);
        org.example.AVLTree.Node node23 = aVLTree14.find((-1));
        int int24 = aVLTree14.height();
        org.example.AVLTree.Node node26 = aVLTree14.find(0);
        org.example.AVLTree aVLTree27 = new org.example.AVLTree();
        org.example.AVLTree.Node node28 = null;
        int int29 = aVLTree27.getBalance(node28);
        aVLTree27.delete((int) '4');
        aVLTree27.delete((-1));
        aVLTree27.insert((int) 'a');
        aVLTree27.insert((int) (byte) 100);
        int int38 = aVLTree27.height();
        org.example.AVLTree aVLTree39 = new org.example.AVLTree();
        org.example.AVLTree.Node node40 = null;
        int int41 = aVLTree39.getBalance(node40);
        aVLTree39.delete((int) '4');
        org.example.AVLTree.Node node44 = aVLTree39.getRoot();
        int int45 = aVLTree39.height();
        org.example.AVLTree.Node node46 = aVLTree39.getRoot();
        aVLTree39.delete((int) (byte) 100);
        int int49 = aVLTree39.height();
        int int50 = aVLTree39.height();
        org.example.AVLTree aVLTree51 = new org.example.AVLTree();
        org.example.AVLTree.Node node52 = null;
        int int53 = aVLTree51.getBalance(node52);
        aVLTree51.delete((int) '4');
        aVLTree51.delete((-1));
        aVLTree51.insert((int) 'a');
        aVLTree51.insert((int) (byte) 100);
        int int62 = aVLTree51.height();
        aVLTree51.insert((int) (short) 1);
        org.example.AVLTree.Node node65 = aVLTree51.getRoot();
        int int66 = aVLTree39.getBalance(node65);
        int int67 = aVLTree27.getBalance(node65);
        int int68 = aVLTree14.getBalance(node65);
        org.example.AVLTree.Node node69 = aVLTree14.getRoot();
        int int70 = aVLTree0.getBalance(node69);
        org.example.AVLTree aVLTree71 = new org.example.AVLTree();
        org.example.AVLTree.Node node72 = null;
        int int73 = aVLTree71.getBalance(node72);
        aVLTree71.delete((int) '4');
        aVLTree71.delete((-1));
        aVLTree71.insert((int) 'a');
        aVLTree71.insert((int) (byte) 100);
        int int82 = aVLTree71.height();
        org.example.AVLTree aVLTree83 = new org.example.AVLTree();
        org.example.AVLTree.Node node84 = null;
        int int85 = aVLTree83.getBalance(node84);
        aVLTree83.delete((int) '4');
        org.example.AVLTree.Node node88 = aVLTree83.getRoot();
        int int89 = aVLTree83.height();
        org.example.AVLTree.Node node90 = aVLTree83.getRoot();
        int int91 = aVLTree83.height();
        aVLTree83.insert(0);
        org.example.AVLTree.Node node94 = aVLTree83.getRoot();
        int int95 = aVLTree71.getBalance(node94);
        int int96 = aVLTree0.getBalance(node94);
        org.example.AVLTree.Node node97 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(node97);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        aVLTree0.delete((int) (short) 0);
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.delete((int) '4');
        org.example.AVLTree.Node node18 = aVLTree13.getRoot();
        org.example.AVLTree.Node node20 = aVLTree13.find((int) (byte) 0);
        aVLTree13.delete((int) (short) 100);
        org.example.AVLTree.Node node24 = aVLTree13.find((int) (byte) 0);
        aVLTree13.insert((int) (short) 0);
        org.example.AVLTree aVLTree27 = new org.example.AVLTree();
        org.example.AVLTree.Node node28 = aVLTree27.getRoot();
        org.example.AVLTree.Node node30 = aVLTree27.find((int) '#');
        org.example.AVLTree.Node node32 = aVLTree27.find((int) (byte) -1);
        org.example.AVLTree.Node node33 = aVLTree27.getRoot();
        org.example.AVLTree aVLTree34 = new org.example.AVLTree();
        org.example.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.delete((int) '4');
        int int39 = aVLTree34.height();
        org.example.AVLTree.Node node41 = aVLTree34.find((int) '#');
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.delete((int) '4');
        aVLTree42.delete((-1));
        aVLTree42.insert((int) 'a');
        aVLTree42.insert((int) (byte) 100);
        org.example.AVLTree.Node node53 = aVLTree42.getRoot();
        int int54 = aVLTree34.getBalance(node53);
        int int55 = aVLTree27.getBalance(node53);
        org.example.AVLTree aVLTree56 = new org.example.AVLTree();
        org.example.AVLTree.Node node57 = aVLTree56.getRoot();
        org.example.AVLTree.Node node59 = aVLTree56.find((int) '#');
        org.example.AVLTree.Node node61 = aVLTree56.find((int) (byte) -1);
        org.example.AVLTree.Node node62 = aVLTree56.getRoot();
        org.example.AVLTree.Node node63 = aVLTree56.getRoot();
        org.example.AVLTree aVLTree64 = new org.example.AVLTree();
        org.example.AVLTree.Node node65 = null;
        int int66 = aVLTree64.getBalance(node65);
        aVLTree64.delete((int) '4');
        org.example.AVLTree.Node node69 = aVLTree64.getRoot();
        int int70 = aVLTree64.height();
        org.example.AVLTree.Node node71 = aVLTree64.getRoot();
        org.example.AVLTree aVLTree72 = new org.example.AVLTree();
        org.example.AVLTree.Node node73 = null;
        int int74 = aVLTree72.getBalance(node73);
        aVLTree72.delete((int) '4');
        aVLTree72.delete((-1));
        aVLTree72.insert((int) 'a');
        aVLTree72.insert((int) (byte) 100);
        int int83 = aVLTree72.height();
        aVLTree72.insert((int) (short) 1);
        org.example.AVLTree.Node node86 = aVLTree72.getRoot();
        int int87 = aVLTree64.getBalance(node86);
        int int88 = aVLTree56.getBalance(node86);
        int int89 = aVLTree27.getBalance(node86);
        int int90 = aVLTree13.getBalance(node86);
        int int91 = aVLTree0.getBalance(node86);
        int int92 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.insert((int) ' ');
        org.example.AVLTree.Node node14 = aVLTree0.find((-1));
        org.example.AVLTree.Node node16 = aVLTree0.find((int) '4');
        int int17 = aVLTree0.height();
        int int18 = aVLTree0.height();
        org.example.AVLTree.Node node20 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        int int21 = aVLTree16.height();
        aVLTree16.insert((int) (byte) 1);
        org.example.AVLTree.Node node25 = aVLTree16.find((-1));
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree16.getBalance(node26);
        org.example.AVLTree.Node node28 = aVLTree16.getRoot();
        org.example.AVLTree.Node node29 = aVLTree16.getRoot();
        int int30 = aVLTree0.getBalance(node29);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"left\" because \"current\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.insert((int) '#');
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        aVLTree10.delete((-1));
        aVLTree10.insert((int) 'a');
        aVLTree10.insert((int) (byte) 100);
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        int int26 = aVLTree21.height();
        org.example.AVLTree aVLTree27 = new org.example.AVLTree();
        org.example.AVLTree.Node node28 = null;
        int int29 = aVLTree27.getBalance(node28);
        org.example.AVLTree.Node node30 = null;
        int int31 = aVLTree27.getBalance(node30);
        aVLTree27.insert((int) (byte) 0);
        org.example.AVLTree.Node node34 = aVLTree27.getRoot();
        int int35 = aVLTree21.getBalance(node34);
        int int36 = aVLTree10.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        org.example.AVLTree.Node node38 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        aVLTree12.delete((-1));
        aVLTree12.insert((int) 'a');
        aVLTree12.insert((int) (byte) 100);
        int int23 = aVLTree12.height();
        aVLTree12.insert((int) (short) 1);
        org.example.AVLTree.Node node26 = aVLTree12.getRoot();
        int int27 = aVLTree0.getBalance(node26);
        aVLTree0.insert(0);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete(100);
        aVLTree0.insert((int) '4');
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        aVLTree36.insert(0);
        org.example.AVLTree aVLTree39 = new org.example.AVLTree();
        org.example.AVLTree.Node node40 = null;
        int int41 = aVLTree39.getBalance(node40);
        aVLTree39.delete((int) '4');
        aVLTree39.delete((-1));
        aVLTree39.insert((int) 'a');
        aVLTree39.insert((int) (byte) 100);
        int int50 = aVLTree39.height();
        aVLTree39.insert((int) (short) 1);
        org.example.AVLTree.Node node53 = aVLTree39.getRoot();
        int int54 = aVLTree36.getBalance(node53);
        aVLTree36.delete((int) (short) 10);
        org.example.AVLTree aVLTree57 = new org.example.AVLTree();
        org.example.AVLTree.Node node58 = null;
        int int59 = aVLTree57.getBalance(node58);
        org.example.AVLTree.Node node60 = null;
        int int61 = aVLTree57.getBalance(node60);
        aVLTree57.insert((int) (byte) 0);
        org.example.AVLTree.Node node64 = aVLTree57.getRoot();
        int int65 = aVLTree36.getBalance(node64);
        int int66 = aVLTree0.getBalance(node64);
        java.lang.Class<?> wildcardClass67 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find((int) (byte) 1);
        aVLTree0.insert((int) '#');
        int int7 = aVLTree0.height();
        aVLTree0.insert(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.insert((int) (byte) -1);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = aVLTree12.getRoot();
        org.example.AVLTree.Node node15 = aVLTree12.find((int) '#');
        aVLTree12.insert((int) '4');
        org.example.AVLTree.Node node19 = aVLTree12.find((int) (byte) 10);
        org.example.AVLTree.Node node20 = aVLTree12.getRoot();
        int int21 = aVLTree0.getBalance(node20);
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree0.getBalance(node22);
        int int24 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = null;
        int int3 = aVLTree0.getBalance(node2);
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 10);
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node8 = aVLTree0.find(0);
        int int9 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) ' ');
        int int14 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }
}

