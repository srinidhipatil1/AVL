import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        java.lang.Class<?> wildcardClass1 = aVLTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        aVLTree0.insert((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) 'a');
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = node11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.insert((int) '#');
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree0.getBalance(node11);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = null;
        int int3 = aVLTree0.getBalance(node2);
        java.lang.Class<?> wildcardClass4 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        int int8 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        int int10 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete(10);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = node11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
        java.lang.Class<?> wildcardClass12 = node11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) '4');
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
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
        int int24 = aVLTree0.getBalance(node23);
        java.lang.Class<?> wildcardClass25 = node23.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        aVLTree0.insert((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        java.lang.Class<?> wildcardClass28 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        org.example.AVLTree.Node node13 = aVLTree8.getRoot();
        org.example.AVLTree.Node node15 = aVLTree8.find((int) (byte) 0);
        org.example.AVLTree.Node node17 = aVLTree8.find((int) '#');
        int int18 = aVLTree8.height();
        org.example.AVLTree aVLTree19 = new org.example.AVLTree();
        org.example.AVLTree.Node node20 = aVLTree19.getRoot();
        org.example.AVLTree.Node node22 = aVLTree19.find((int) '#');
        int int23 = aVLTree19.height();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree19.getBalance(node24);
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree26.getBalance(node29);
        aVLTree26.insert((int) (byte) 0);
        org.example.AVLTree.Node node33 = aVLTree26.getRoot();
        int int34 = aVLTree19.getBalance(node33);
        int int35 = aVLTree8.getBalance(node33);
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.delete((int) '4');
        int int41 = aVLTree36.height();
        aVLTree36.insert((int) (byte) 1);
        org.example.AVLTree.Node node45 = aVLTree36.find((-1));
        int int46 = aVLTree36.height();
        org.example.AVLTree.Node node48 = aVLTree36.find(0);
        org.example.AVLTree.Node node50 = aVLTree36.find((int) (short) 1);
        int int51 = aVLTree8.getBalance(node50);
        int int52 = aVLTree0.getBalance(node50);
        java.lang.Class<?> wildcardClass53 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node8 = aVLTree0.find((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
        org.example.AVLTree.Node node13 = aVLTree0.find((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        java.lang.Class<?> wildcardClass28 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        int int3 = aVLTree0.height();
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        java.lang.Class<?> wildcardClass30 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        aVLTree12.delete((-1));
        aVLTree12.insert((int) 'a');
        aVLTree12.insert((int) (byte) 100);
        org.example.AVLTree.Node node23 = aVLTree12.getRoot();
        int int24 = aVLTree0.getBalance(node23);
        java.lang.Class<?> wildcardClass25 = node23.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int8 = aVLTree0.height();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        int int11 = aVLTree0.height();
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = node3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.insert((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        java.lang.Class<?> wildcardClass47 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(0);
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.insert((int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        org.example.AVLTree.Node node17 = aVLTree12.getRoot();
        int int18 = aVLTree12.height();
        org.example.AVLTree.Node node19 = aVLTree12.getRoot();
        aVLTree12.delete((int) (byte) 100);
        int int22 = aVLTree12.height();
        int int23 = aVLTree12.height();
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        aVLTree24.delete((-1));
        aVLTree24.insert((int) 'a');
        aVLTree24.insert((int) (byte) 100);
        int int35 = aVLTree24.height();
        aVLTree24.insert((int) (short) 1);
        org.example.AVLTree.Node node38 = aVLTree24.getRoot();
        int int39 = aVLTree12.getBalance(node38);
        int int40 = aVLTree0.getBalance(node38);
        java.lang.Class<?> wildcardClass41 = node38.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.find(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        org.example.AVLTree.Node node17 = aVLTree12.getRoot();
        int int18 = aVLTree12.height();
        org.example.AVLTree.Node node19 = aVLTree12.getRoot();
        aVLTree12.delete((int) (byte) 100);
        int int22 = aVLTree12.height();
        int int23 = aVLTree12.height();
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        aVLTree24.delete((-1));
        aVLTree24.insert((int) 'a');
        aVLTree24.insert((int) (byte) 100);
        int int35 = aVLTree24.height();
        aVLTree24.insert((int) (short) 1);
        org.example.AVLTree.Node node38 = aVLTree24.getRoot();
        int int39 = aVLTree12.getBalance(node38);
        int int40 = aVLTree0.getBalance(node38);
        java.lang.Class<?> wildcardClass41 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) '4');
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(10);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        java.lang.Class<?> wildcardClass24 = node22.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree aVLTree6 = new org.example.AVLTree();
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree6.getBalance(node7);
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (byte) 0);
        org.example.AVLTree.Node node13 = aVLTree6.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        aVLTree0.delete((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node4 = aVLTree0.find((-1));
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        aVLTree0.insert(100);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = node14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        org.example.AVLTree.Node node15 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree aVLTree9 = new org.example.AVLTree();
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree9.getBalance(node10);
        aVLTree9.delete((int) '4');
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        int int19 = aVLTree14.height();
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree20.getBalance(node23);
        aVLTree20.insert((int) (byte) 0);
        org.example.AVLTree.Node node27 = aVLTree20.getRoot();
        int int28 = aVLTree14.getBalance(node27);
        int int29 = aVLTree9.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        java.lang.Class<?> wildcardClass31 = node27.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node8 = aVLTree0.find((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        int int8 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        org.example.AVLTree.Node node20 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = node2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.insert((int) (short) 100);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = aVLTree10.getRoot();
        org.example.AVLTree.Node node13 = aVLTree10.find((int) '#');
        org.example.AVLTree.Node node15 = aVLTree10.find((int) (byte) -1);
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree10.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        aVLTree18.delete((-1));
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.delete((int) '4');
        org.example.AVLTree.Node node31 = aVLTree26.getRoot();
        org.example.AVLTree.Node node33 = aVLTree26.find((int) (byte) 0);
        org.example.AVLTree.Node node35 = aVLTree26.find((int) '#');
        int int36 = aVLTree26.height();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = aVLTree37.getRoot();
        org.example.AVLTree.Node node40 = aVLTree37.find((int) '#');
        int int41 = aVLTree37.height();
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree37.getBalance(node42);
        org.example.AVLTree aVLTree44 = new org.example.AVLTree();
        org.example.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        org.example.AVLTree.Node node47 = null;
        int int48 = aVLTree44.getBalance(node47);
        aVLTree44.insert((int) (byte) 0);
        org.example.AVLTree.Node node51 = aVLTree44.getRoot();
        int int52 = aVLTree37.getBalance(node51);
        int int53 = aVLTree26.getBalance(node51);
        org.example.AVLTree aVLTree54 = new org.example.AVLTree();
        org.example.AVLTree.Node node55 = null;
        int int56 = aVLTree54.getBalance(node55);
        aVLTree54.delete((int) '4');
        int int59 = aVLTree54.height();
        aVLTree54.insert((int) (byte) 1);
        org.example.AVLTree.Node node63 = aVLTree54.find((-1));
        int int64 = aVLTree54.height();
        org.example.AVLTree.Node node66 = aVLTree54.find(0);
        org.example.AVLTree.Node node68 = aVLTree54.find((int) (short) 1);
        int int69 = aVLTree26.getBalance(node68);
        int int70 = aVLTree18.getBalance(node68);
        int int71 = aVLTree10.getBalance(node68);
        int int72 = aVLTree0.getBalance(node68);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
        aVLTree0.delete(1);
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
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        java.lang.Class<?> wildcardClass46 = node42.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (byte) 0);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        java.lang.Class<?> wildcardClass71 = node69.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        java.lang.Class<?> wildcardClass15 = node14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        int int3 = aVLTree0.height();
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        aVLTree0.insert((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree aVLTree5 = new org.example.AVLTree();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.delete((int) '4');
        int int10 = aVLTree5.height();
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (byte) 0);
        org.example.AVLTree.Node node18 = aVLTree11.getRoot();
        int int19 = aVLTree5.getBalance(node18);
        int int20 = aVLTree0.getBalance(node18);
        java.lang.Class<?> wildcardClass21 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        java.lang.Class<?> wildcardClass55 = node51.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        int int13 = aVLTree8.height();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree8.getBalance(node14);
        int int16 = aVLTree8.height();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree8.getBalance(node17);
        org.example.AVLTree aVLTree19 = new org.example.AVLTree();
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree19.getBalance(node20);
        aVLTree19.delete((int) '4');
        int int24 = aVLTree19.height();
        aVLTree19.insert(100);
        aVLTree19.insert((int) ' ');
        aVLTree19.delete(0);
        aVLTree19.insert(1);
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.delete((int) '4');
        aVLTree33.delete((-1));
        aVLTree33.insert((int) 'a');
        aVLTree33.insert((int) (byte) 100);
        int int44 = aVLTree33.height();
        aVLTree33.insert((int) (short) 1);
        org.example.AVLTree.Node node47 = aVLTree33.getRoot();
        int int48 = aVLTree19.getBalance(node47);
        int int49 = aVLTree8.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        java.lang.Class<?> wildcardClass51 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 10);
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = aVLTree14.getRoot();
        org.example.AVLTree.Node node17 = aVLTree14.find((int) '#');
        org.example.AVLTree.Node node18 = aVLTree14.getRoot();
        org.example.AVLTree aVLTree19 = new org.example.AVLTree();
        org.example.AVLTree.Node node20 = aVLTree19.getRoot();
        org.example.AVLTree.Node node22 = aVLTree19.find((int) '#');
        org.example.AVLTree.Node node24 = aVLTree19.find((int) (byte) -1);
        org.example.AVLTree.Node node25 = aVLTree19.getRoot();
        org.example.AVLTree.Node node26 = aVLTree19.getRoot();
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
        int int43 = aVLTree19.getBalance(node41);
        int int44 = aVLTree14.getBalance(node41);
        int int45 = aVLTree0.getBalance(node41);
        java.lang.Class<?> wildcardClass46 = node41.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        int int12 = aVLTree0.height();
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.insert((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        aVLTree11.delete((int) '4');
        org.example.AVLTree.Node node16 = aVLTree11.getRoot();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree11.getBalance(node17);
        org.example.AVLTree.Node node19 = aVLTree11.getRoot();
        org.example.AVLTree.Node node20 = aVLTree11.getRoot();
        int int21 = aVLTree11.height();
        int int22 = aVLTree11.height();
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        org.example.AVLTree.Node node27 = aVLTree23.find(1);
        org.example.AVLTree.Node node29 = aVLTree23.find(10);
        int int30 = aVLTree23.height();
        aVLTree23.insert((int) (byte) 1);
        org.example.AVLTree.Node node33 = aVLTree23.getRoot();
        int int34 = aVLTree11.getBalance(node33);
        int int35 = aVLTree0.getBalance(node33);
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        org.example.AVLTree.Node node39 = null;
        int int40 = aVLTree36.getBalance(node39);
        aVLTree36.insert((int) (byte) 0);
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        aVLTree43.delete((int) '4');
        int int48 = aVLTree43.height();
        aVLTree43.insert(100);
        aVLTree43.insert((int) ' ');
        aVLTree43.delete(0);
        aVLTree43.insert(1);
        org.example.AVLTree aVLTree57 = new org.example.AVLTree();
        org.example.AVLTree.Node node58 = null;
        int int59 = aVLTree57.getBalance(node58);
        aVLTree57.delete((int) '4');
        aVLTree57.delete((-1));
        aVLTree57.insert((int) 'a');
        aVLTree57.insert((int) (byte) 100);
        int int68 = aVLTree57.height();
        aVLTree57.insert((int) (short) 1);
        org.example.AVLTree.Node node71 = aVLTree57.getRoot();
        int int72 = aVLTree43.getBalance(node71);
        int int73 = aVLTree36.getBalance(node71);
        org.example.AVLTree.Node node74 = aVLTree36.getRoot();
        int int75 = aVLTree0.getBalance(node74);
        int int76 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        java.lang.Class<?> wildcardClass62 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) ' ');
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        aVLTree0.insert(10);
        aVLTree0.delete((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node3 = aVLTree0.getRoot();
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        org.example.AVLTree.Node node19 = aVLTree14.getRoot();
        int int20 = aVLTree14.height();
        org.example.AVLTree.Node node21 = aVLTree14.getRoot();
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
        int int37 = aVLTree14.getBalance(node36);
        int int38 = aVLTree0.getBalance(node36);
        java.lang.Class<?> wildcardClass39 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.insert((int) (short) 100);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = node13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        org.example.AVLTree.Node node19 = aVLTree14.getRoot();
        int int20 = aVLTree14.height();
        org.example.AVLTree.Node node21 = aVLTree14.getRoot();
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
        int int37 = aVLTree14.getBalance(node36);
        int int38 = aVLTree0.getBalance(node36);
        java.lang.Class<?> wildcardClass39 = node36.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        org.example.AVLTree.Node node31 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 1);
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
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.insert((int) '4');
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = node4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        aVLTree11.delete((int) '4');
        int int16 = aVLTree11.height();
        aVLTree11.insert(100);
        aVLTree11.insert((int) ' ');
        aVLTree11.delete(0);
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.delete((int) '4');
        org.example.AVLTree.Node node28 = aVLTree23.getRoot();
        int int29 = aVLTree23.height();
        org.example.AVLTree.Node node30 = aVLTree23.getRoot();
        aVLTree23.insert((int) (byte) 10);
        aVLTree23.insert((int) (short) 100);
        org.example.AVLTree.Node node36 = aVLTree23.find((int) (short) 100);
        int int37 = aVLTree11.getBalance(node36);
        int int38 = aVLTree0.getBalance(node36);
        java.lang.Class<?> wildcardClass39 = node36.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        java.lang.Class<?> wildcardClass20 = node18.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        aVLTree0.insert((int) '#');
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        int int48 = aVLTree0.height();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        java.lang.Class<?> wildcardClass35 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) '#');
        int int15 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = null;
        int int3 = aVLTree0.getBalance(node2);
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (byte) 0);
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        int int19 = aVLTree14.height();
        aVLTree14.insert(100);
        aVLTree14.insert((int) ' ');
        aVLTree14.delete(0);
        aVLTree14.insert(1);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        aVLTree28.delete((-1));
        aVLTree28.insert((int) 'a');
        aVLTree28.insert((int) (byte) 100);
        int int39 = aVLTree28.height();
        aVLTree28.insert((int) (short) 1);
        org.example.AVLTree.Node node42 = aVLTree28.getRoot();
        int int43 = aVLTree14.getBalance(node42);
        int int44 = aVLTree7.getBalance(node42);
        org.example.AVLTree.Node node45 = aVLTree7.getRoot();
        org.example.AVLTree aVLTree46 = new org.example.AVLTree();
        org.example.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.delete((int) '4');
        int int51 = aVLTree46.height();
        org.example.AVLTree aVLTree52 = new org.example.AVLTree();
        org.example.AVLTree.Node node53 = null;
        int int54 = aVLTree52.getBalance(node53);
        org.example.AVLTree.Node node55 = null;
        int int56 = aVLTree52.getBalance(node55);
        aVLTree52.insert((int) (byte) 0);
        org.example.AVLTree.Node node59 = aVLTree52.getRoot();
        int int60 = aVLTree46.getBalance(node59);
        int int61 = aVLTree7.getBalance(node59);
        int int62 = aVLTree0.getBalance(node59);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        aVLTree0.insert(10);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(0);
        aVLTree0.insert((int) (byte) 10);
        org.example.AVLTree.Node node15 = aVLTree0.find((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert(10);
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        aVLTree0.delete(0);
        int int15 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        aVLTree0.delete((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.find(0);
        aVLTree0.insert((int) ' ');
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        aVLTree0.insert((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = node26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        aVLTree0.insert(10);
        java.lang.Class<?> wildcardClass64 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree aVLTree5 = new org.example.AVLTree();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.delete((int) '4');
        int int10 = aVLTree5.height();
        aVLTree5.insert((int) (byte) 1);
        org.example.AVLTree.Node node14 = aVLTree5.find((-1));
        int int15 = aVLTree5.height();
        org.example.AVLTree.Node node17 = aVLTree5.find(0);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        aVLTree18.delete((-1));
        aVLTree18.insert((int) 'a');
        aVLTree18.insert((int) (byte) 100);
        int int29 = aVLTree18.height();
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        int int36 = aVLTree30.height();
        org.example.AVLTree.Node node37 = aVLTree30.getRoot();
        aVLTree30.delete((int) (byte) 100);
        int int40 = aVLTree30.height();
        int int41 = aVLTree30.height();
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.delete((int) '4');
        aVLTree42.delete((-1));
        aVLTree42.insert((int) 'a');
        aVLTree42.insert((int) (byte) 100);
        int int53 = aVLTree42.height();
        aVLTree42.insert((int) (short) 1);
        org.example.AVLTree.Node node56 = aVLTree42.getRoot();
        int int57 = aVLTree30.getBalance(node56);
        int int58 = aVLTree18.getBalance(node56);
        int int59 = aVLTree5.getBalance(node56);
        int int60 = aVLTree0.getBalance(node56);
        org.example.AVLTree aVLTree61 = new org.example.AVLTree();
        org.example.AVLTree.Node node62 = null;
        int int63 = aVLTree61.getBalance(node62);
        aVLTree61.delete((int) '4');
        int int66 = aVLTree61.height();
        org.example.AVLTree.Node node67 = null;
        int int68 = aVLTree61.getBalance(node67);
        int int69 = aVLTree61.height();
        org.example.AVLTree.Node node70 = null;
        int int71 = aVLTree61.getBalance(node70);
        aVLTree61.insert((int) '4');
        org.example.AVLTree.Node node74 = aVLTree61.getRoot();
        int int75 = aVLTree0.getBalance(node74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        int int10 = aVLTree0.height();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        int int36 = aVLTree0.height();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        int int35 = aVLTree30.height();
        aVLTree30.delete((int) (byte) 100);
        org.example.AVLTree.Node node39 = aVLTree30.find((int) (short) 100);
        aVLTree30.delete(10);
        int int42 = aVLTree30.height();
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        aVLTree43.delete((int) '4');
        org.example.AVLTree.Node node48 = aVLTree43.getRoot();
        org.example.AVLTree.Node node50 = aVLTree43.find((int) (byte) 0);
        aVLTree43.delete((int) (short) 100);
        org.example.AVLTree.Node node54 = aVLTree43.find((int) (byte) 0);
        int int55 = aVLTree43.height();
        org.example.AVLTree.Node node57 = aVLTree43.find((int) '4');
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = aVLTree58.getRoot();
        org.example.AVLTree.Node node61 = aVLTree58.find((int) '#');
        org.example.AVLTree.Node node63 = aVLTree58.find((int) (byte) -1);
        org.example.AVLTree.Node node64 = aVLTree58.getRoot();
        org.example.AVLTree.Node node65 = aVLTree58.getRoot();
        org.example.AVLTree aVLTree66 = new org.example.AVLTree();
        org.example.AVLTree.Node node67 = null;
        int int68 = aVLTree66.getBalance(node67);
        aVLTree66.delete((int) '4');
        org.example.AVLTree.Node node71 = aVLTree66.getRoot();
        int int72 = aVLTree66.height();
        org.example.AVLTree.Node node73 = aVLTree66.getRoot();
        org.example.AVLTree aVLTree74 = new org.example.AVLTree();
        org.example.AVLTree.Node node75 = null;
        int int76 = aVLTree74.getBalance(node75);
        aVLTree74.delete((int) '4');
        aVLTree74.delete((-1));
        aVLTree74.insert((int) 'a');
        aVLTree74.insert((int) (byte) 100);
        int int85 = aVLTree74.height();
        aVLTree74.insert((int) (short) 1);
        org.example.AVLTree.Node node88 = aVLTree74.getRoot();
        int int89 = aVLTree66.getBalance(node88);
        int int90 = aVLTree58.getBalance(node88);
        int int91 = aVLTree43.getBalance(node88);
        int int92 = aVLTree30.getBalance(node88);
        int int93 = aVLTree0.getBalance(node88);
        org.example.AVLTree.Node node94 = aVLTree0.getRoot();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(node94);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        org.example.AVLTree.Node node29 = aVLTree0.find((int) (byte) 100);
        java.lang.Class<?> wildcardClass30 = aVLTree0.getClass();
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
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (byte) 0);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = null;
        int int3 = aVLTree0.getBalance(node2);
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        java.lang.Class<?> wildcardClass27 = node25.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        int int14 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) '4');
        int int13 = aVLTree0.height();
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        int int19 = aVLTree14.height();
        aVLTree14.delete((int) (byte) 100);
        aVLTree14.delete(10);
        org.example.AVLTree.Node node25 = aVLTree14.find((int) (short) 1);
        aVLTree14.delete((int) (short) -1);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        aVLTree28.delete((-1));
        aVLTree28.insert((int) 'a');
        aVLTree28.insert((int) (byte) 100);
        org.example.AVLTree.Node node39 = aVLTree28.getRoot();
        int int40 = aVLTree14.getBalance(node39);
        int int41 = aVLTree0.getBalance(node39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) -1);
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        org.example.AVLTree.Node node15 = aVLTree10.getRoot();
        org.example.AVLTree.Node node17 = aVLTree10.find((int) (byte) 0);
        org.example.AVLTree.Node node19 = aVLTree10.find((int) '#');
        org.example.AVLTree.Node node20 = aVLTree10.getRoot();
        aVLTree10.insert((int) (short) -1);
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.delete((int) '4');
        aVLTree23.delete((-1));
        aVLTree23.insert((int) 'a');
        aVLTree23.insert((int) (byte) 100);
        int int34 = aVLTree23.height();
        org.example.AVLTree aVLTree35 = new org.example.AVLTree();
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree35.getBalance(node36);
        aVLTree35.delete((int) '4');
        org.example.AVLTree.Node node40 = aVLTree35.getRoot();
        int int41 = aVLTree35.height();
        org.example.AVLTree.Node node42 = aVLTree35.getRoot();
        aVLTree35.delete((int) (byte) 100);
        int int45 = aVLTree35.height();
        int int46 = aVLTree35.height();
        org.example.AVLTree aVLTree47 = new org.example.AVLTree();
        org.example.AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        aVLTree47.delete((int) '4');
        aVLTree47.delete((-1));
        aVLTree47.insert((int) 'a');
        aVLTree47.insert((int) (byte) 100);
        int int58 = aVLTree47.height();
        aVLTree47.insert((int) (short) 1);
        org.example.AVLTree.Node node61 = aVLTree47.getRoot();
        int int62 = aVLTree35.getBalance(node61);
        int int63 = aVLTree23.getBalance(node61);
        int int64 = aVLTree10.getBalance(node61);
        int int65 = aVLTree0.getBalance(node61);
        java.lang.Class<?> wildcardClass66 = node61.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        java.lang.Class<?> wildcardClass32 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) '#');
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        aVLTree8.delete((-1));
        aVLTree8.insert((int) 'a');
        aVLTree8.insert((int) (byte) 100);
        org.example.AVLTree.Node node19 = aVLTree8.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        org.example.AVLTree.Node node22 = aVLTree0.find(10);
        org.example.AVLTree.Node node23 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass24 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        int int15 = aVLTree10.height();
        aVLTree10.insert(100);
        aVLTree10.insert((int) ' ');
        aVLTree10.delete(0);
        aVLTree10.insert(1);
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        aVLTree24.delete((-1));
        aVLTree24.insert((int) 'a');
        aVLTree24.insert((int) (byte) 100);
        int int35 = aVLTree24.height();
        aVLTree24.insert((int) (short) 1);
        org.example.AVLTree.Node node38 = aVLTree24.getRoot();
        int int39 = aVLTree10.getBalance(node38);
        int int40 = aVLTree0.getBalance(node38);
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree41.getBalance(node42);
        aVLTree41.delete((int) '4');
        int int46 = aVLTree41.height();
        aVLTree41.insert((int) (byte) 1);
        org.example.AVLTree.Node node50 = aVLTree41.find((-1));
        org.example.AVLTree.Node node52 = aVLTree41.find((int) ' ');
        org.example.AVLTree aVLTree53 = new org.example.AVLTree();
        org.example.AVLTree.Node node54 = null;
        int int55 = aVLTree53.getBalance(node54);
        aVLTree53.delete((int) '4');
        org.example.AVLTree.Node node58 = aVLTree53.getRoot();
        int int59 = aVLTree53.height();
        org.example.AVLTree.Node node60 = aVLTree53.getRoot();
        int int61 = aVLTree53.height();
        aVLTree53.insert(0);
        org.example.AVLTree.Node node64 = aVLTree53.getRoot();
        org.example.AVLTree aVLTree65 = new org.example.AVLTree();
        org.example.AVLTree.Node node66 = aVLTree65.getRoot();
        org.example.AVLTree.Node node68 = aVLTree65.find((int) '#');
        org.example.AVLTree.Node node70 = aVLTree65.find((int) (byte) -1);
        org.example.AVLTree.Node node71 = aVLTree65.getRoot();
        org.example.AVLTree.Node node72 = aVLTree65.getRoot();
        org.example.AVLTree aVLTree73 = new org.example.AVLTree();
        org.example.AVLTree.Node node74 = aVLTree73.getRoot();
        org.example.AVLTree.Node node76 = aVLTree73.find((int) '#');
        int int77 = aVLTree73.height();
        org.example.AVLTree.Node node78 = null;
        int int79 = aVLTree73.getBalance(node78);
        org.example.AVLTree aVLTree80 = new org.example.AVLTree();
        org.example.AVLTree.Node node81 = null;
        int int82 = aVLTree80.getBalance(node81);
        org.example.AVLTree.Node node83 = null;
        int int84 = aVLTree80.getBalance(node83);
        aVLTree80.insert((int) (byte) 0);
        org.example.AVLTree.Node node87 = aVLTree80.getRoot();
        int int88 = aVLTree73.getBalance(node87);
        int int89 = aVLTree65.getBalance(node87);
        int int90 = aVLTree53.getBalance(node87);
        int int91 = aVLTree41.getBalance(node87);
        int int92 = aVLTree0.getBalance(node87);
        org.example.AVLTree.Node node93 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(node93);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        int int13 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        int int3 = aVLTree0.height();
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (short) 1);
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        int int13 = aVLTree8.height();
        org.example.AVLTree.Node node15 = aVLTree8.find((int) (byte) 0);
        org.example.AVLTree.Node node16 = aVLTree8.getRoot();
        org.example.AVLTree aVLTree17 = new org.example.AVLTree();
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (byte) 0);
        org.example.AVLTree.Node node24 = aVLTree17.getRoot();
        int int25 = aVLTree8.getBalance(node24);
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        org.example.AVLTree.Node node30 = aVLTree26.find(1);
        org.example.AVLTree.Node node32 = aVLTree26.find(10);
        int int33 = aVLTree26.height();
        aVLTree26.insert((int) (byte) 1);
        org.example.AVLTree.Node node36 = aVLTree26.getRoot();
        int int37 = aVLTree8.getBalance(node36);
        int int38 = aVLTree0.getBalance(node36);
        java.lang.Class<?> wildcardClass39 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        int int55 = aVLTree0.height();
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Class<?> wildcardClass28 = node25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        org.example.AVLTree.Node node14 = aVLTree0.find(1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = node14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass3 = aVLTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        aVLTree0.delete((int) (short) 1);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        aVLTree0.insert((int) '#');
        aVLTree0.delete((int) '#');
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        org.example.AVLTree.Node node47 = aVLTree0.find((int) (byte) 100);
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
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree16.getBalance(node22);
        aVLTree16.insert((int) ' ');
        org.example.AVLTree.Node node27 = aVLTree16.find((int) (byte) 0);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        aVLTree28.delete((-1));
        aVLTree28.insert((int) 'a');
        aVLTree28.insert((int) (byte) 100);
        int int39 = aVLTree28.height();
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.delete((int) '4');
        org.example.AVLTree.Node node45 = aVLTree40.getRoot();
        int int46 = aVLTree40.height();
        org.example.AVLTree.Node node47 = aVLTree40.getRoot();
        aVLTree40.delete((int) (byte) 100);
        int int50 = aVLTree40.height();
        int int51 = aVLTree40.height();
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
        int int67 = aVLTree40.getBalance(node66);
        int int68 = aVLTree28.getBalance(node66);
        int int69 = aVLTree16.getBalance(node66);
        int int70 = aVLTree0.getBalance(node66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node15 = aVLTree0.find(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = node15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree aVLTree6 = new org.example.AVLTree();
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree6.getBalance(node7);
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (byte) 0);
        org.example.AVLTree.Node node13 = aVLTree6.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
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
        int int24 = aVLTree0.getBalance(node23);
        java.lang.Class<?> wildcardClass25 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        java.lang.Class<?> wildcardClass55 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (short) 10);
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.delete((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        org.example.AVLTree.Node node13 = aVLTree8.getRoot();
        org.example.AVLTree.Node node15 = aVLTree8.find(0);
        org.example.AVLTree.Node node17 = aVLTree8.find((int) (short) -1);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        org.example.AVLTree.Node node23 = aVLTree18.getRoot();
        org.example.AVLTree.Node node25 = aVLTree18.find((int) (byte) 0);
        org.example.AVLTree.Node node27 = aVLTree18.find((int) '#');
        org.example.AVLTree.Node node28 = aVLTree18.getRoot();
        aVLTree18.insert((int) (short) -1);
        org.example.AVLTree aVLTree31 = new org.example.AVLTree();
        org.example.AVLTree.Node node32 = null;
        int int33 = aVLTree31.getBalance(node32);
        aVLTree31.delete((int) '4');
        aVLTree31.delete((-1));
        aVLTree31.insert((int) 'a');
        aVLTree31.insert((int) (byte) 100);
        int int42 = aVLTree31.height();
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        aVLTree43.delete((int) '4');
        org.example.AVLTree.Node node48 = aVLTree43.getRoot();
        int int49 = aVLTree43.height();
        org.example.AVLTree.Node node50 = aVLTree43.getRoot();
        aVLTree43.delete((int) (byte) 100);
        int int53 = aVLTree43.height();
        int int54 = aVLTree43.height();
        org.example.AVLTree aVLTree55 = new org.example.AVLTree();
        org.example.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        aVLTree55.delete((int) '4');
        aVLTree55.delete((-1));
        aVLTree55.insert((int) 'a');
        aVLTree55.insert((int) (byte) 100);
        int int66 = aVLTree55.height();
        aVLTree55.insert((int) (short) 1);
        org.example.AVLTree.Node node69 = aVLTree55.getRoot();
        int int70 = aVLTree43.getBalance(node69);
        int int71 = aVLTree31.getBalance(node69);
        int int72 = aVLTree18.getBalance(node69);
        int int73 = aVLTree8.getBalance(node69);
        int int74 = aVLTree0.getBalance(node69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        aVLTree11.delete((int) '4');
        int int16 = aVLTree11.height();
        aVLTree11.insert(100);
        aVLTree11.insert((int) ' ');
        aVLTree11.delete(0);
        aVLTree11.insert(1);
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
        int int40 = aVLTree11.getBalance(node39);
        int int41 = aVLTree0.getBalance(node39);
        aVLTree0.insert(100);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert(10);
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.example.AVLTree.Node node16 = aVLTree0.find((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete(10);
        int int12 = aVLTree0.height();
        int int13 = aVLTree0.height();
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree12.getBalance(node15);
        aVLTree12.insert((int) (byte) 0);
        org.example.AVLTree aVLTree19 = new org.example.AVLTree();
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree19.getBalance(node20);
        aVLTree19.delete((int) '4');
        int int24 = aVLTree19.height();
        aVLTree19.insert(100);
        aVLTree19.insert((int) ' ');
        aVLTree19.delete(0);
        aVLTree19.insert(1);
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.delete((int) '4');
        aVLTree33.delete((-1));
        aVLTree33.insert((int) 'a');
        aVLTree33.insert((int) (byte) 100);
        int int44 = aVLTree33.height();
        aVLTree33.insert((int) (short) 1);
        org.example.AVLTree.Node node47 = aVLTree33.getRoot();
        int int48 = aVLTree19.getBalance(node47);
        int int49 = aVLTree12.getBalance(node47);
        org.example.AVLTree.Node node50 = aVLTree12.getRoot();
        org.example.AVLTree aVLTree51 = new org.example.AVLTree();
        org.example.AVLTree.Node node52 = null;
        int int53 = aVLTree51.getBalance(node52);
        aVLTree51.delete((int) '4');
        int int56 = aVLTree51.height();
        org.example.AVLTree aVLTree57 = new org.example.AVLTree();
        org.example.AVLTree.Node node58 = null;
        int int59 = aVLTree57.getBalance(node58);
        org.example.AVLTree.Node node60 = null;
        int int61 = aVLTree57.getBalance(node60);
        aVLTree57.insert((int) (byte) 0);
        org.example.AVLTree.Node node64 = aVLTree57.getRoot();
        int int65 = aVLTree51.getBalance(node64);
        int int66 = aVLTree12.getBalance(node64);
        int int67 = aVLTree0.getBalance(node64);
        java.lang.Class<?> wildcardClass68 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        java.lang.Class<?> wildcardClass41 = node38.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        aVLTree0.insert((int) (short) 1);
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        org.example.AVLTree.Node node37 = aVLTree30.find((int) (byte) 0);
        org.example.AVLTree.Node node39 = aVLTree30.find((int) '#');
        int int40 = aVLTree30.height();
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = aVLTree41.getRoot();
        org.example.AVLTree.Node node44 = aVLTree41.find((int) '#');
        int int45 = aVLTree41.height();
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree41.getBalance(node46);
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree48.getBalance(node51);
        aVLTree48.insert((int) (byte) 0);
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        int int56 = aVLTree41.getBalance(node55);
        int int57 = aVLTree30.getBalance(node55);
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        aVLTree58.delete((int) '4');
        int int63 = aVLTree58.height();
        aVLTree58.insert((int) (byte) 1);
        org.example.AVLTree.Node node67 = aVLTree58.find((-1));
        int int68 = aVLTree58.height();
        org.example.AVLTree.Node node70 = aVLTree58.find(0);
        org.example.AVLTree.Node node72 = aVLTree58.find((int) (short) 1);
        int int73 = aVLTree30.getBalance(node72);
        int int74 = aVLTree30.height();
        org.example.AVLTree aVLTree75 = new org.example.AVLTree();
        org.example.AVLTree.Node node76 = null;
        int int77 = aVLTree75.getBalance(node76);
        aVLTree75.delete((int) '4');
        aVLTree75.delete((-1));
        aVLTree75.insert((int) 'a');
        aVLTree75.insert((int) (byte) 100);
        int int86 = aVLTree75.height();
        aVLTree75.insert((int) (short) 1);
        org.example.AVLTree.Node node89 = aVLTree75.getRoot();
        org.example.AVLTree.Node node90 = aVLTree75.getRoot();
        int int91 = aVLTree30.getBalance(node90);
        int int92 = aVLTree0.getBalance(node90);
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
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node8 = aVLTree0.find(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        int int14 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        org.example.AVLTree aVLTree20 = new org.example.AVLTree();
        org.example.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.delete((int) '4');
        int int25 = aVLTree20.height();
        aVLTree20.delete((int) (byte) 100);
        org.example.AVLTree.Node node29 = aVLTree20.find((int) (short) 100);
        aVLTree20.delete(10);
        int int32 = aVLTree20.height();
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.delete((int) '4');
        org.example.AVLTree.Node node38 = aVLTree33.getRoot();
        org.example.AVLTree.Node node40 = aVLTree33.find((int) (byte) 0);
        aVLTree33.delete((int) (short) 100);
        org.example.AVLTree.Node node44 = aVLTree33.find((int) (byte) 0);
        int int45 = aVLTree33.height();
        org.example.AVLTree.Node node47 = aVLTree33.find((int) '4');
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = aVLTree48.getRoot();
        org.example.AVLTree.Node node51 = aVLTree48.find((int) '#');
        org.example.AVLTree.Node node53 = aVLTree48.find((int) (byte) -1);
        org.example.AVLTree.Node node54 = aVLTree48.getRoot();
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        org.example.AVLTree aVLTree56 = new org.example.AVLTree();
        org.example.AVLTree.Node node57 = null;
        int int58 = aVLTree56.getBalance(node57);
        aVLTree56.delete((int) '4');
        org.example.AVLTree.Node node61 = aVLTree56.getRoot();
        int int62 = aVLTree56.height();
        org.example.AVLTree.Node node63 = aVLTree56.getRoot();
        org.example.AVLTree aVLTree64 = new org.example.AVLTree();
        org.example.AVLTree.Node node65 = null;
        int int66 = aVLTree64.getBalance(node65);
        aVLTree64.delete((int) '4');
        aVLTree64.delete((-1));
        aVLTree64.insert((int) 'a');
        aVLTree64.insert((int) (byte) 100);
        int int75 = aVLTree64.height();
        aVLTree64.insert((int) (short) 1);
        org.example.AVLTree.Node node78 = aVLTree64.getRoot();
        int int79 = aVLTree56.getBalance(node78);
        int int80 = aVLTree48.getBalance(node78);
        int int81 = aVLTree33.getBalance(node78);
        int int82 = aVLTree20.getBalance(node78);
        int int83 = aVLTree0.getBalance(node78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree3 = new org.example.AVLTree();
        org.example.AVLTree.Node node4 = null;
        int int5 = aVLTree3.getBalance(node4);
        aVLTree3.delete((int) '4');
        int int8 = aVLTree3.height();
        aVLTree3.insert(100);
        aVLTree3.insert((int) ' ');
        aVLTree3.delete(10);
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = aVLTree15.getRoot();
        org.example.AVLTree.Node node18 = aVLTree15.find((int) '#');
        org.example.AVLTree.Node node20 = aVLTree15.find((int) (byte) -1);
        org.example.AVLTree.Node node21 = aVLTree15.getRoot();
        org.example.AVLTree.Node node22 = aVLTree15.getRoot();
        org.example.AVLTree.Node node23 = aVLTree15.getRoot();
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = aVLTree24.find((int) (short) 0);
        int int27 = aVLTree24.height();
        org.example.AVLTree.Node node29 = aVLTree24.find((int) (short) 0);
        aVLTree24.insert((int) (short) 1);
        org.example.AVLTree aVLTree32 = new org.example.AVLTree();
        org.example.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.delete((int) '4');
        int int37 = aVLTree32.height();
        org.example.AVLTree.Node node39 = aVLTree32.find((int) (byte) 0);
        org.example.AVLTree.Node node40 = aVLTree32.getRoot();
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree41.getBalance(node42);
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree41.getBalance(node44);
        aVLTree41.insert((int) (byte) 0);
        org.example.AVLTree.Node node48 = aVLTree41.getRoot();
        int int49 = aVLTree32.getBalance(node48);
        org.example.AVLTree aVLTree50 = new org.example.AVLTree();
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree50.getBalance(node51);
        org.example.AVLTree.Node node54 = aVLTree50.find(1);
        org.example.AVLTree.Node node56 = aVLTree50.find(10);
        int int57 = aVLTree50.height();
        aVLTree50.insert((int) (byte) 1);
        org.example.AVLTree.Node node60 = aVLTree50.getRoot();
        int int61 = aVLTree32.getBalance(node60);
        int int62 = aVLTree24.getBalance(node60);
        int int63 = aVLTree15.getBalance(node60);
        int int64 = aVLTree3.getBalance(node60);
        int int65 = aVLTree0.getBalance(node60);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        aVLTree0.insert((int) (short) 1);
        java.lang.Class<?> wildcardClass22 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        org.example.AVLTree.Node node15 = aVLTree10.getRoot();
        aVLTree10.delete(100);
        aVLTree10.delete((int) (byte) 0);
        org.example.AVLTree.Node node21 = aVLTree10.find((int) (short) 10);
        org.example.AVLTree aVLTree22 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        org.example.AVLTree.Node node26 = aVLTree22.find(1);
        aVLTree22.insert((int) (byte) 100);
        int int29 = aVLTree22.height();
        org.example.AVLTree.Node node30 = null;
        int int31 = aVLTree22.getBalance(node30);
        org.example.AVLTree.Node node32 = aVLTree22.getRoot();
        int int33 = aVLTree10.getBalance(node32);
        int int34 = aVLTree0.getBalance(node32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) 'a');
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = aVLTree7.getRoot();
        org.example.AVLTree.Node node10 = aVLTree7.find((int) '#');
        org.example.AVLTree.Node node11 = aVLTree7.getRoot();
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
        int int37 = aVLTree7.getBalance(node34);
        int int38 = aVLTree0.getBalance(node34);
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (short) 0);
        int int10 = aVLTree0.height();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        java.lang.Class<?> wildcardClass56 = node55.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (byte) 0);
        int int10 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        aVLTree0.insert((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (byte) 1);
        org.example.AVLTree aVLTree5 = new org.example.AVLTree();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.delete((int) '4');
        int int10 = aVLTree5.height();
        aVLTree5.insert((int) (byte) 1);
        org.example.AVLTree.Node node14 = aVLTree5.find((-1));
        int int15 = aVLTree5.height();
        org.example.AVLTree.Node node17 = aVLTree5.find(0);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        aVLTree18.delete((-1));
        aVLTree18.insert((int) 'a');
        aVLTree18.insert((int) (byte) 100);
        int int29 = aVLTree18.height();
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        int int36 = aVLTree30.height();
        org.example.AVLTree.Node node37 = aVLTree30.getRoot();
        aVLTree30.delete((int) (byte) 100);
        int int40 = aVLTree30.height();
        int int41 = aVLTree30.height();
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.delete((int) '4');
        aVLTree42.delete((-1));
        aVLTree42.insert((int) 'a');
        aVLTree42.insert((int) (byte) 100);
        int int53 = aVLTree42.height();
        aVLTree42.insert((int) (short) 1);
        org.example.AVLTree.Node node56 = aVLTree42.getRoot();
        int int57 = aVLTree30.getBalance(node56);
        int int58 = aVLTree18.getBalance(node56);
        int int59 = aVLTree5.getBalance(node56);
        org.example.AVLTree.Node node60 = aVLTree5.getRoot();
        int int61 = aVLTree0.getBalance(node60);
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert(10);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        org.example.AVLTree.Node node14 = aVLTree0.find(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(0);
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        aVLTree16.insert((int) 'a');
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.delete((int) '4');
        int int28 = aVLTree23.height();
        aVLTree23.insert(100);
        aVLTree23.insert((int) ' ');
        aVLTree23.delete(0);
        aVLTree23.insert(1);
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        org.example.AVLTree.Node node42 = aVLTree37.getRoot();
        int int43 = aVLTree37.height();
        org.example.AVLTree.Node node44 = aVLTree37.getRoot();
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
        int int60 = aVLTree37.getBalance(node59);
        int int61 = aVLTree23.getBalance(node59);
        int int62 = aVLTree16.getBalance(node59);
        int int63 = aVLTree0.getBalance(node59);
        aVLTree0.delete((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = aVLTree14.getRoot();
        org.example.AVLTree.Node node17 = aVLTree14.find(1);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        aVLTree18.delete((-1));
        aVLTree18.insert((int) 'a');
        aVLTree18.insert((int) (byte) 100);
        int int29 = aVLTree18.height();
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        int int36 = aVLTree30.height();
        org.example.AVLTree.Node node37 = aVLTree30.getRoot();
        int int38 = aVLTree30.height();
        aVLTree30.insert(0);
        org.example.AVLTree.Node node41 = aVLTree30.getRoot();
        int int42 = aVLTree18.getBalance(node41);
        int int43 = aVLTree14.getBalance(node41);
        int int44 = aVLTree0.getBalance(node41);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) -1);
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        int int14 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) ' ');
        org.example.AVLTree.Node node13 = aVLTree0.find(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        org.example.AVLTree.Node node51 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
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
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node8 = aVLTree0.find((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 1);
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete((int) (short) -1);
        int int14 = aVLTree0.height();
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        org.example.AVLTree.Node node10 = aVLTree0.find(0);
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        aVLTree11.delete((int) '4');
        int int16 = aVLTree11.height();
        aVLTree11.insert(100);
        aVLTree11.insert((int) ' ');
        aVLTree11.delete(0);
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.delete((int) '4');
        org.example.AVLTree.Node node28 = aVLTree23.getRoot();
        int int29 = aVLTree23.height();
        org.example.AVLTree.Node node30 = aVLTree23.getRoot();
        aVLTree23.insert((int) (byte) 10);
        aVLTree23.insert((int) (short) 100);
        org.example.AVLTree.Node node36 = aVLTree23.find((int) (short) 100);
        int int37 = aVLTree11.getBalance(node36);
        int int38 = aVLTree0.getBalance(node36);
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        aVLTree0.insert((int) '#');
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (byte) 0);
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        java.lang.Class<?> wildcardClass39 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        aVLTree0.insert((int) '#');
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (byte) 10);
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        java.lang.Class<?> wildcardClass38 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        org.example.AVLTree.Node node34 = aVLTree0.getRoot();
        aVLTree0.insert(0);
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
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        java.lang.Class<?> wildcardClass15 = node14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (byte) 1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node4 = aVLTree0.find((-1));
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node8 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        org.example.AVLTree.Node node19 = aVLTree0.find((int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = node19.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        aVLTree0.delete(0);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        aVLTree0.insert((int) '#');
        aVLTree0.delete((int) '#');
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        org.example.AVLTree.Node node46 = aVLTree0.getRoot();
        int int47 = aVLTree0.height();
        aVLTree0.delete((int) ' ');
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
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        java.lang.Class<?> wildcardClass15 = node14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = null;
        int int3 = aVLTree0.getBalance(node2);
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 10);
        aVLTree0.delete((-1));
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        java.lang.Class<?> wildcardClass62 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        aVLTree0.insert((int) 'a');
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
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete(0);
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        org.example.AVLTree.Node node82 = aVLTree0.find((-1));
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
        org.junit.Assert.assertNull(node82);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        org.example.AVLTree.Node node19 = aVLTree0.find(1);
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.example.AVLTree.Node node15 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        aVLTree0.insert(10);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree aVLTree5 = new org.example.AVLTree();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.delete((int) '4');
        int int10 = aVLTree5.height();
        aVLTree5.insert((int) (byte) 1);
        org.example.AVLTree.Node node14 = aVLTree5.find((-1));
        int int15 = aVLTree5.height();
        org.example.AVLTree.Node node17 = aVLTree5.find(0);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        aVLTree18.delete((-1));
        aVLTree18.insert((int) 'a');
        aVLTree18.insert((int) (byte) 100);
        int int29 = aVLTree18.height();
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        int int36 = aVLTree30.height();
        org.example.AVLTree.Node node37 = aVLTree30.getRoot();
        aVLTree30.delete((int) (byte) 100);
        int int40 = aVLTree30.height();
        int int41 = aVLTree30.height();
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.delete((int) '4');
        aVLTree42.delete((-1));
        aVLTree42.insert((int) 'a');
        aVLTree42.insert((int) (byte) 100);
        int int53 = aVLTree42.height();
        aVLTree42.insert((int) (short) 1);
        org.example.AVLTree.Node node56 = aVLTree42.getRoot();
        int int57 = aVLTree30.getBalance(node56);
        int int58 = aVLTree18.getBalance(node56);
        int int59 = aVLTree5.getBalance(node56);
        int int60 = aVLTree0.getBalance(node56);
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node64 = aVLTree0.find((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(node64);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = aVLTree8.getRoot();
        org.example.AVLTree.Node node11 = aVLTree8.find((int) '#');
        int int12 = aVLTree8.height();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree8.getBalance(node13);
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree15.getBalance(node18);
        aVLTree15.insert((int) (byte) 0);
        org.example.AVLTree.Node node22 = aVLTree15.getRoot();
        int int23 = aVLTree8.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        java.lang.Class<?> wildcardClass25 = node22.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        aVLTree15.delete((int) '4');
        int int20 = aVLTree15.height();
        aVLTree15.insert((int) (byte) 1);
        org.example.AVLTree.Node node24 = aVLTree15.find((-1));
        int int25 = aVLTree15.height();
        org.example.AVLTree.Node node27 = aVLTree15.find(0);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        aVLTree28.delete((-1));
        aVLTree28.insert((int) 'a');
        aVLTree28.insert((int) (byte) 100);
        int int39 = aVLTree28.height();
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.delete((int) '4');
        org.example.AVLTree.Node node45 = aVLTree40.getRoot();
        int int46 = aVLTree40.height();
        org.example.AVLTree.Node node47 = aVLTree40.getRoot();
        aVLTree40.delete((int) (byte) 100);
        int int50 = aVLTree40.height();
        int int51 = aVLTree40.height();
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
        int int67 = aVLTree40.getBalance(node66);
        int int68 = aVLTree28.getBalance(node66);
        int int69 = aVLTree15.getBalance(node66);
        org.example.AVLTree aVLTree70 = new org.example.AVLTree();
        org.example.AVLTree.Node node71 = null;
        int int72 = aVLTree70.getBalance(node71);
        aVLTree70.delete((int) '4');
        org.example.AVLTree.Node node75 = aVLTree70.getRoot();
        int int76 = aVLTree70.height();
        org.example.AVLTree.Node node77 = aVLTree70.getRoot();
        aVLTree70.delete((int) (byte) 100);
        int int80 = aVLTree70.height();
        int int81 = aVLTree70.height();
        aVLTree70.insert((int) (byte) 0);
        org.example.AVLTree.Node node84 = aVLTree70.getRoot();
        int int85 = aVLTree15.getBalance(node84);
        org.example.AVLTree.Node node86 = aVLTree15.getRoot();
        int int87 = aVLTree0.getBalance(node86);
        int int88 = aVLTree0.height();
        org.example.AVLTree.Node node89 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNull(node89);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        int int15 = aVLTree10.height();
        aVLTree10.insert(100);
        aVLTree10.insert((int) ' ');
        aVLTree10.delete(0);
        aVLTree10.insert(1);
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        aVLTree24.delete((-1));
        aVLTree24.insert((int) 'a');
        aVLTree24.insert((int) (byte) 100);
        int int35 = aVLTree24.height();
        aVLTree24.insert((int) (short) 1);
        org.example.AVLTree.Node node38 = aVLTree24.getRoot();
        int int39 = aVLTree10.getBalance(node38);
        int int40 = aVLTree0.getBalance(node38);
        org.example.AVLTree.Node node42 = aVLTree0.find((int) (short) 100);
        aVLTree0.insert(100);
        aVLTree0.insert((int) '#');
        java.lang.Class<?> wildcardClass47 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        org.example.AVLTree.Node node19 = aVLTree15.find(1);
        org.example.AVLTree.Node node21 = aVLTree15.find(10);
        int int22 = aVLTree15.height();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        org.example.AVLTree.Node node26 = aVLTree15.find(100);
        aVLTree15.delete((-1));
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
        int int65 = aVLTree15.getBalance(node62);
        int int66 = aVLTree0.getBalance(node62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node26);
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
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert(10);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        org.example.AVLTree.Node node14 = aVLTree10.find(1);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((-1));
        org.example.AVLTree.Node node19 = aVLTree10.getRoot();
        org.example.AVLTree.Node node21 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) -1);
        aVLTree10.insert(1);
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.delete((int) '4');
        org.example.AVLTree.Node node31 = aVLTree26.getRoot();
        int int32 = aVLTree26.height();
        org.example.AVLTree.Node node33 = aVLTree26.getRoot();
        int int34 = aVLTree26.height();
        aVLTree26.insert(0);
        org.example.AVLTree.Node node37 = aVLTree26.getRoot();
        org.example.AVLTree aVLTree38 = new org.example.AVLTree();
        org.example.AVLTree.Node node39 = aVLTree38.getRoot();
        org.example.AVLTree.Node node41 = aVLTree38.find((int) '#');
        org.example.AVLTree.Node node43 = aVLTree38.find((int) (byte) -1);
        org.example.AVLTree.Node node44 = aVLTree38.getRoot();
        org.example.AVLTree.Node node45 = aVLTree38.getRoot();
        org.example.AVLTree aVLTree46 = new org.example.AVLTree();
        org.example.AVLTree.Node node47 = aVLTree46.getRoot();
        org.example.AVLTree.Node node49 = aVLTree46.find((int) '#');
        int int50 = aVLTree46.height();
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree46.getBalance(node51);
        org.example.AVLTree aVLTree53 = new org.example.AVLTree();
        org.example.AVLTree.Node node54 = null;
        int int55 = aVLTree53.getBalance(node54);
        org.example.AVLTree.Node node56 = null;
        int int57 = aVLTree53.getBalance(node56);
        aVLTree53.insert((int) (byte) 0);
        org.example.AVLTree.Node node60 = aVLTree53.getRoot();
        int int61 = aVLTree46.getBalance(node60);
        int int62 = aVLTree38.getBalance(node60);
        int int63 = aVLTree26.getBalance(node60);
        int int64 = aVLTree10.getBalance(node60);
        int int65 = aVLTree0.getBalance(node60);
        org.example.AVLTree.Node node67 = aVLTree0.find(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(node67);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert((int) (byte) 10);
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        int int19 = aVLTree14.height();
        aVLTree14.delete((int) (byte) 100);
        org.example.AVLTree.Node node23 = aVLTree14.find((int) (short) 100);
        aVLTree14.delete(10);
        int int26 = aVLTree14.height();
        org.example.AVLTree aVLTree27 = new org.example.AVLTree();
        org.example.AVLTree.Node node28 = null;
        int int29 = aVLTree27.getBalance(node28);
        aVLTree27.delete((int) '4');
        org.example.AVLTree.Node node32 = aVLTree27.getRoot();
        org.example.AVLTree.Node node34 = aVLTree27.find((int) (byte) 0);
        aVLTree27.delete((int) (short) 100);
        org.example.AVLTree.Node node38 = aVLTree27.find((int) (byte) 0);
        int int39 = aVLTree27.height();
        org.example.AVLTree.Node node41 = aVLTree27.find((int) '4');
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = aVLTree42.getRoot();
        org.example.AVLTree.Node node45 = aVLTree42.find((int) '#');
        org.example.AVLTree.Node node47 = aVLTree42.find((int) (byte) -1);
        org.example.AVLTree.Node node48 = aVLTree42.getRoot();
        org.example.AVLTree.Node node49 = aVLTree42.getRoot();
        org.example.AVLTree aVLTree50 = new org.example.AVLTree();
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree50.getBalance(node51);
        aVLTree50.delete((int) '4');
        org.example.AVLTree.Node node55 = aVLTree50.getRoot();
        int int56 = aVLTree50.height();
        org.example.AVLTree.Node node57 = aVLTree50.getRoot();
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        aVLTree58.delete((int) '4');
        aVLTree58.delete((-1));
        aVLTree58.insert((int) 'a');
        aVLTree58.insert((int) (byte) 100);
        int int69 = aVLTree58.height();
        aVLTree58.insert((int) (short) 1);
        org.example.AVLTree.Node node72 = aVLTree58.getRoot();
        int int73 = aVLTree50.getBalance(node72);
        int int74 = aVLTree42.getBalance(node72);
        int int75 = aVLTree27.getBalance(node72);
        int int76 = aVLTree14.getBalance(node72);
        int int77 = aVLTree0.getBalance(node72);
        org.example.AVLTree.Node node79 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node79);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = aVLTree14.getRoot();
        org.example.AVLTree.Node node17 = aVLTree14.find((int) '#');
        org.example.AVLTree.Node node19 = aVLTree14.find((int) (byte) -1);
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree14.getBalance(node20);
        org.example.AVLTree aVLTree22 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.delete((int) '4');
        aVLTree22.delete((-1));
        org.example.AVLTree.Node node29 = aVLTree22.getRoot();
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        org.example.AVLTree.Node node37 = aVLTree30.find((int) (byte) 0);
        org.example.AVLTree.Node node39 = aVLTree30.find((int) '#');
        int int40 = aVLTree30.height();
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = aVLTree41.getRoot();
        org.example.AVLTree.Node node44 = aVLTree41.find((int) '#');
        int int45 = aVLTree41.height();
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree41.getBalance(node46);
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree48.getBalance(node51);
        aVLTree48.insert((int) (byte) 0);
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        int int56 = aVLTree41.getBalance(node55);
        int int57 = aVLTree30.getBalance(node55);
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        aVLTree58.delete((int) '4');
        int int63 = aVLTree58.height();
        aVLTree58.insert((int) (byte) 1);
        org.example.AVLTree.Node node67 = aVLTree58.find((-1));
        int int68 = aVLTree58.height();
        org.example.AVLTree.Node node70 = aVLTree58.find(0);
        org.example.AVLTree.Node node72 = aVLTree58.find((int) (short) 1);
        int int73 = aVLTree30.getBalance(node72);
        int int74 = aVLTree22.getBalance(node72);
        int int75 = aVLTree14.getBalance(node72);
        int int76 = aVLTree0.getBalance(node72);
        org.example.AVLTree.Node node77 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(node77);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        org.example.AVLTree.Node node17 = aVLTree0.find((int) '4');
        int int18 = aVLTree0.height();
        org.example.AVLTree.Node node20 = aVLTree0.find((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        int int3 = aVLTree0.height();
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (short) 1);
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        int int13 = aVLTree8.height();
        org.example.AVLTree.Node node15 = aVLTree8.find((int) (byte) 0);
        org.example.AVLTree.Node node16 = aVLTree8.getRoot();
        org.example.AVLTree aVLTree17 = new org.example.AVLTree();
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (byte) 0);
        org.example.AVLTree.Node node24 = aVLTree17.getRoot();
        int int25 = aVLTree8.getBalance(node24);
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        org.example.AVLTree.Node node30 = aVLTree26.find(1);
        org.example.AVLTree.Node node32 = aVLTree26.find(10);
        int int33 = aVLTree26.height();
        aVLTree26.insert((int) (byte) 1);
        org.example.AVLTree.Node node36 = aVLTree26.getRoot();
        int int37 = aVLTree8.getBalance(node36);
        int int38 = aVLTree0.getBalance(node36);
        org.example.AVLTree.Node node40 = aVLTree0.find((int) (short) 10);
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node4 = aVLTree0.find((-1));
        int int5 = aVLTree0.height();
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        java.lang.Class<?> wildcardClass78 = node74.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) (short) 0);
        aVLTree0.delete((int) (byte) 10);
        org.example.AVLTree.Node node15 = aVLTree0.find((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) -1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
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
        aVLTree11.insert((int) '4');
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree41.getBalance(node42);
        aVLTree41.delete((int) '4');
        int int46 = aVLTree41.height();
        org.example.AVLTree aVLTree47 = new org.example.AVLTree();
        org.example.AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        org.example.AVLTree.Node node50 = null;
        int int51 = aVLTree47.getBalance(node50);
        aVLTree47.insert((int) (byte) 0);
        org.example.AVLTree.Node node54 = aVLTree47.getRoot();
        int int55 = aVLTree41.getBalance(node54);
        int int56 = aVLTree11.getBalance(node54);
        int int57 = aVLTree0.getBalance(node54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        aVLTree12.delete((int) '4');
        org.example.AVLTree.Node node17 = aVLTree12.getRoot();
        org.example.AVLTree.Node node19 = aVLTree12.find(0);
        org.example.AVLTree.Node node21 = aVLTree12.find((int) '#');
        org.example.AVLTree aVLTree22 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.delete((int) '4');
        int int27 = aVLTree22.height();
        aVLTree22.insert((int) (byte) 1);
        org.example.AVLTree.Node node31 = aVLTree22.find((-1));
        int int32 = aVLTree22.height();
        org.example.AVLTree.Node node34 = aVLTree22.find(0);
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
        aVLTree47.delete((int) (byte) 100);
        int int57 = aVLTree47.height();
        int int58 = aVLTree47.height();
        org.example.AVLTree aVLTree59 = new org.example.AVLTree();
        org.example.AVLTree.Node node60 = null;
        int int61 = aVLTree59.getBalance(node60);
        aVLTree59.delete((int) '4');
        aVLTree59.delete((-1));
        aVLTree59.insert((int) 'a');
        aVLTree59.insert((int) (byte) 100);
        int int70 = aVLTree59.height();
        aVLTree59.insert((int) (short) 1);
        org.example.AVLTree.Node node73 = aVLTree59.getRoot();
        int int74 = aVLTree47.getBalance(node73);
        int int75 = aVLTree35.getBalance(node73);
        int int76 = aVLTree22.getBalance(node73);
        org.example.AVLTree aVLTree77 = new org.example.AVLTree();
        org.example.AVLTree.Node node78 = null;
        int int79 = aVLTree77.getBalance(node78);
        aVLTree77.delete((int) '4');
        org.example.AVLTree.Node node82 = aVLTree77.getRoot();
        int int83 = aVLTree77.height();
        org.example.AVLTree.Node node84 = aVLTree77.getRoot();
        aVLTree77.delete((int) (byte) 100);
        int int87 = aVLTree77.height();
        int int88 = aVLTree77.height();
        aVLTree77.insert((int) (byte) 0);
        org.example.AVLTree.Node node91 = aVLTree77.getRoot();
        int int92 = aVLTree22.getBalance(node91);
        int int93 = aVLTree12.getBalance(node91);
        int int94 = aVLTree0.getBalance(node91);
        java.lang.Class<?> wildcardClass95 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree aVLTree9 = new org.example.AVLTree();
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree9.getBalance(node10);
        aVLTree9.delete((int) '4');
        int int14 = aVLTree9.height();
        aVLTree9.insert((int) (byte) 1);
        org.example.AVLTree.Node node18 = aVLTree9.find((-1));
        int int19 = aVLTree9.height();
        org.example.AVLTree.Node node21 = aVLTree9.find(0);
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
        aVLTree34.delete((int) (byte) 100);
        int int44 = aVLTree34.height();
        int int45 = aVLTree34.height();
        org.example.AVLTree aVLTree46 = new org.example.AVLTree();
        org.example.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.delete((int) '4');
        aVLTree46.delete((-1));
        aVLTree46.insert((int) 'a');
        aVLTree46.insert((int) (byte) 100);
        int int57 = aVLTree46.height();
        aVLTree46.insert((int) (short) 1);
        org.example.AVLTree.Node node60 = aVLTree46.getRoot();
        int int61 = aVLTree34.getBalance(node60);
        int int62 = aVLTree22.getBalance(node60);
        int int63 = aVLTree9.getBalance(node60);
        int int64 = aVLTree0.getBalance(node60);
        aVLTree0.insert(100);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
        org.example.AVLTree.Node node13 = aVLTree0.find((-1));
        aVLTree0.insert(0);
        int int16 = aVLTree0.height();
        aVLTree0.insert((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete(10);
        int int12 = aVLTree0.height();
        int int13 = aVLTree0.height();
        aVLTree0.insert((int) (short) 0);
        aVLTree0.delete(2);
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        int int13 = aVLTree8.height();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree8.getBalance(node14);
        int int16 = aVLTree8.height();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree8.getBalance(node17);
        org.example.AVLTree aVLTree19 = new org.example.AVLTree();
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree19.getBalance(node20);
        aVLTree19.delete((int) '4');
        int int24 = aVLTree19.height();
        aVLTree19.insert(100);
        aVLTree19.insert((int) ' ');
        aVLTree19.delete(0);
        aVLTree19.insert(1);
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.delete((int) '4');
        aVLTree33.delete((-1));
        aVLTree33.insert((int) 'a');
        aVLTree33.insert((int) (byte) 100);
        int int44 = aVLTree33.height();
        aVLTree33.insert((int) (short) 1);
        org.example.AVLTree.Node node47 = aVLTree33.getRoot();
        int int48 = aVLTree19.getBalance(node47);
        int int49 = aVLTree8.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        java.lang.Class<?> wildcardClass51 = node47.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (byte) -1);
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = aVLTree14.getRoot();
        org.example.AVLTree.Node node17 = aVLTree14.find((int) '#');
        org.example.AVLTree.Node node19 = aVLTree14.find((int) (byte) -1);
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree14.getBalance(node20);
        org.example.AVLTree aVLTree22 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.delete((int) '4');
        aVLTree22.delete((-1));
        org.example.AVLTree.Node node29 = aVLTree22.getRoot();
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        org.example.AVLTree.Node node37 = aVLTree30.find((int) (byte) 0);
        org.example.AVLTree.Node node39 = aVLTree30.find((int) '#');
        int int40 = aVLTree30.height();
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = aVLTree41.getRoot();
        org.example.AVLTree.Node node44 = aVLTree41.find((int) '#');
        int int45 = aVLTree41.height();
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree41.getBalance(node46);
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree48.getBalance(node51);
        aVLTree48.insert((int) (byte) 0);
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        int int56 = aVLTree41.getBalance(node55);
        int int57 = aVLTree30.getBalance(node55);
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        aVLTree58.delete((int) '4');
        int int63 = aVLTree58.height();
        aVLTree58.insert((int) (byte) 1);
        org.example.AVLTree.Node node67 = aVLTree58.find((-1));
        int int68 = aVLTree58.height();
        org.example.AVLTree.Node node70 = aVLTree58.find(0);
        org.example.AVLTree.Node node72 = aVLTree58.find((int) (short) 1);
        int int73 = aVLTree30.getBalance(node72);
        int int74 = aVLTree22.getBalance(node72);
        int int75 = aVLTree14.getBalance(node72);
        int int76 = aVLTree0.getBalance(node72);
        org.example.AVLTree.Node node77 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(node77);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        aVLTree0.insert((int) 'a');
        org.example.AVLTree.Node node38 = aVLTree0.find((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        org.example.AVLTree.Node node28 = aVLTree0.getRoot();
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
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert(10);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        java.lang.Class<?> wildcardClass19 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) (short) 1);
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (byte) 1);
        org.example.AVLTree.Node node14 = aVLTree0.find((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        int int9 = aVLTree0.height();
        int int10 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.insert((int) (short) 100);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 100);
        int int14 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (byte) 0);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        org.example.AVLTree.Node node17 = aVLTree12.getRoot();
        org.example.AVLTree.Node node19 = aVLTree12.find(0);
        org.example.AVLTree.Node node21 = aVLTree12.find((int) (short) -1);
        org.example.AVLTree aVLTree22 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.delete((int) '4');
        org.example.AVLTree.Node node27 = aVLTree22.getRoot();
        org.example.AVLTree.Node node29 = aVLTree22.find((int) (byte) 0);
        org.example.AVLTree.Node node31 = aVLTree22.find((int) '#');
        org.example.AVLTree.Node node32 = aVLTree22.getRoot();
        aVLTree22.insert((int) (short) -1);
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
        aVLTree47.delete((int) (byte) 100);
        int int57 = aVLTree47.height();
        int int58 = aVLTree47.height();
        org.example.AVLTree aVLTree59 = new org.example.AVLTree();
        org.example.AVLTree.Node node60 = null;
        int int61 = aVLTree59.getBalance(node60);
        aVLTree59.delete((int) '4');
        aVLTree59.delete((-1));
        aVLTree59.insert((int) 'a');
        aVLTree59.insert((int) (byte) 100);
        int int70 = aVLTree59.height();
        aVLTree59.insert((int) (short) 1);
        org.example.AVLTree.Node node73 = aVLTree59.getRoot();
        int int74 = aVLTree47.getBalance(node73);
        int int75 = aVLTree35.getBalance(node73);
        int int76 = aVLTree22.getBalance(node73);
        int int77 = aVLTree12.getBalance(node73);
        int int78 = aVLTree0.getBalance(node73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        org.example.AVLTree.Node node10 = aVLTree0.find(0);
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.delete((int) '4');
        int int12 = aVLTree7.height();
        aVLTree7.insert((int) (byte) 1);
        org.example.AVLTree.Node node16 = aVLTree7.find((-1));
        int int17 = aVLTree7.height();
        org.example.AVLTree.Node node18 = aVLTree7.getRoot();
        org.example.AVLTree.Node node20 = aVLTree7.find((int) (short) 1);
        int int21 = aVLTree0.getBalance(node20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        org.example.AVLTree aVLTree31 = new org.example.AVLTree();
        org.example.AVLTree.Node node32 = null;
        int int33 = aVLTree31.getBalance(node32);
        aVLTree31.delete((int) '4');
        int int36 = aVLTree31.height();
        aVLTree31.insert(100);
        aVLTree31.insert((int) ' ');
        aVLTree31.delete(0);
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        aVLTree43.delete((int) '4');
        org.example.AVLTree.Node node48 = aVLTree43.getRoot();
        int int49 = aVLTree43.height();
        org.example.AVLTree.Node node50 = aVLTree43.getRoot();
        aVLTree43.insert((int) (byte) 10);
        aVLTree43.insert((int) (short) 100);
        org.example.AVLTree.Node node56 = aVLTree43.find((int) (short) 100);
        int int57 = aVLTree31.getBalance(node56);
        int int58 = aVLTree0.getBalance(node56);
        aVLTree0.insert(10);
        java.lang.Class<?> wildcardClass61 = aVLTree0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        aVLTree0.delete((int) (short) 0);
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
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        java.lang.Class<?> wildcardClass17 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        org.example.AVLTree.Node node18 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        org.example.AVLTree.Node node91 = aVLTree0.getRoot();
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
        org.junit.Assert.assertNotNull(node91);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find(1);
        org.example.AVLTree aVLTree4 = new org.example.AVLTree();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree4.getBalance(node5);
        aVLTree4.delete((int) '4');
        aVLTree4.delete((-1));
        aVLTree4.insert((int) 'a');
        aVLTree4.insert((int) (byte) 100);
        int int15 = aVLTree4.height();
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        int int22 = aVLTree16.height();
        org.example.AVLTree.Node node23 = aVLTree16.getRoot();
        int int24 = aVLTree16.height();
        aVLTree16.insert(0);
        org.example.AVLTree.Node node27 = aVLTree16.getRoot();
        int int28 = aVLTree4.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        org.example.AVLTree.Node node30 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass31 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) ' ');
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = node12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        java.lang.Class<?> wildcardClass21 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        org.example.AVLTree.Node node14 = aVLTree0.find(1);
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) (short) 0);
        int int7 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.delete((int) (short) 1);
        org.example.AVLTree.Node node11 = aVLTree0.find(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = aVLTree14.getRoot();
        org.example.AVLTree.Node node17 = aVLTree14.find((int) '#');
        org.example.AVLTree.Node node19 = aVLTree14.find((int) (byte) -1);
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree14.getBalance(node20);
        org.example.AVLTree aVLTree22 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.delete((int) '4');
        aVLTree22.delete((-1));
        org.example.AVLTree.Node node29 = aVLTree22.getRoot();
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        org.example.AVLTree.Node node37 = aVLTree30.find((int) (byte) 0);
        org.example.AVLTree.Node node39 = aVLTree30.find((int) '#');
        int int40 = aVLTree30.height();
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = aVLTree41.getRoot();
        org.example.AVLTree.Node node44 = aVLTree41.find((int) '#');
        int int45 = aVLTree41.height();
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree41.getBalance(node46);
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree48.getBalance(node51);
        aVLTree48.insert((int) (byte) 0);
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        int int56 = aVLTree41.getBalance(node55);
        int int57 = aVLTree30.getBalance(node55);
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        aVLTree58.delete((int) '4');
        int int63 = aVLTree58.height();
        aVLTree58.insert((int) (byte) 1);
        org.example.AVLTree.Node node67 = aVLTree58.find((-1));
        int int68 = aVLTree58.height();
        org.example.AVLTree.Node node70 = aVLTree58.find(0);
        org.example.AVLTree.Node node72 = aVLTree58.find((int) (short) 1);
        int int73 = aVLTree30.getBalance(node72);
        int int74 = aVLTree22.getBalance(node72);
        int int75 = aVLTree14.getBalance(node72);
        int int76 = aVLTree0.getBalance(node72);
        java.lang.Class<?> wildcardClass77 = node72.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        org.example.AVLTree.Node node21 = aVLTree0.find((int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        org.example.AVLTree.Node node63 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (short) -1);
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
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        aVLTree0.insert((int) (byte) -1);
        org.example.AVLTree.Node node36 = aVLTree0.find(0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert(10);
        org.example.AVLTree.Node node12 = aVLTree0.find(0);
        int int13 = aVLTree0.height();
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        int int15 = aVLTree10.height();
        aVLTree10.insert((int) (byte) 1);
        org.example.AVLTree.Node node19 = aVLTree10.find((-1));
        int int20 = aVLTree10.height();
        org.example.AVLTree.Node node22 = aVLTree10.find(0);
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.delete((int) '4');
        aVLTree23.delete((-1));
        aVLTree23.insert((int) 'a');
        aVLTree23.insert((int) (byte) 100);
        int int34 = aVLTree23.height();
        org.example.AVLTree aVLTree35 = new org.example.AVLTree();
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree35.getBalance(node36);
        aVLTree35.delete((int) '4');
        org.example.AVLTree.Node node40 = aVLTree35.getRoot();
        int int41 = aVLTree35.height();
        org.example.AVLTree.Node node42 = aVLTree35.getRoot();
        aVLTree35.delete((int) (byte) 100);
        int int45 = aVLTree35.height();
        int int46 = aVLTree35.height();
        org.example.AVLTree aVLTree47 = new org.example.AVLTree();
        org.example.AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        aVLTree47.delete((int) '4');
        aVLTree47.delete((-1));
        aVLTree47.insert((int) 'a');
        aVLTree47.insert((int) (byte) 100);
        int int58 = aVLTree47.height();
        aVLTree47.insert((int) (short) 1);
        org.example.AVLTree.Node node61 = aVLTree47.getRoot();
        int int62 = aVLTree35.getBalance(node61);
        int int63 = aVLTree23.getBalance(node61);
        int int64 = aVLTree10.getBalance(node61);
        org.example.AVLTree aVLTree65 = new org.example.AVLTree();
        org.example.AVLTree.Node node66 = null;
        int int67 = aVLTree65.getBalance(node66);
        aVLTree65.delete((int) '4');
        org.example.AVLTree.Node node70 = aVLTree65.getRoot();
        int int71 = aVLTree65.height();
        org.example.AVLTree.Node node72 = aVLTree65.getRoot();
        aVLTree65.delete((int) (byte) 100);
        int int75 = aVLTree65.height();
        int int76 = aVLTree65.height();
        aVLTree65.insert((int) (byte) 0);
        org.example.AVLTree.Node node79 = aVLTree65.getRoot();
        int int80 = aVLTree10.getBalance(node79);
        int int81 = aVLTree0.getBalance(node79);
        org.example.AVLTree.Node node82 = aVLTree0.getRoot();
        org.example.AVLTree.Node node84 = aVLTree0.find((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass85 = node84.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNull(node84);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) 'a');
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree0.getBalance(node11);
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = aVLTree8.getRoot();
        org.example.AVLTree.Node node11 = aVLTree8.find((int) '#');
        int int12 = aVLTree8.height();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree8.getBalance(node13);
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree15.getBalance(node18);
        aVLTree15.insert((int) (byte) 0);
        org.example.AVLTree.Node node22 = aVLTree15.getRoot();
        int int23 = aVLTree8.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        org.example.AVLTree.Node node25 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.delete((int) '4');
        org.example.AVLTree.Node node31 = aVLTree26.getRoot();
        org.example.AVLTree.Node node32 = null;
        int int33 = aVLTree26.getBalance(node32);
        org.example.AVLTree aVLTree34 = new org.example.AVLTree();
        org.example.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.delete((int) '4');
        aVLTree34.insert((int) 'a');
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = aVLTree41.getRoot();
        org.example.AVLTree.Node node44 = aVLTree41.find((int) '#');
        org.example.AVLTree.Node node45 = aVLTree41.getRoot();
        org.example.AVLTree aVLTree46 = new org.example.AVLTree();
        org.example.AVLTree.Node node47 = aVLTree46.getRoot();
        org.example.AVLTree.Node node49 = aVLTree46.find((int) '#');
        org.example.AVLTree.Node node51 = aVLTree46.find((int) (byte) -1);
        org.example.AVLTree.Node node52 = aVLTree46.getRoot();
        org.example.AVLTree.Node node53 = aVLTree46.getRoot();
        org.example.AVLTree aVLTree54 = new org.example.AVLTree();
        org.example.AVLTree.Node node55 = aVLTree54.getRoot();
        org.example.AVLTree.Node node57 = aVLTree54.find((int) '#');
        int int58 = aVLTree54.height();
        org.example.AVLTree.Node node59 = null;
        int int60 = aVLTree54.getBalance(node59);
        org.example.AVLTree aVLTree61 = new org.example.AVLTree();
        org.example.AVLTree.Node node62 = null;
        int int63 = aVLTree61.getBalance(node62);
        org.example.AVLTree.Node node64 = null;
        int int65 = aVLTree61.getBalance(node64);
        aVLTree61.insert((int) (byte) 0);
        org.example.AVLTree.Node node68 = aVLTree61.getRoot();
        int int69 = aVLTree54.getBalance(node68);
        int int70 = aVLTree46.getBalance(node68);
        int int71 = aVLTree41.getBalance(node68);
        int int72 = aVLTree34.getBalance(node68);
        org.example.AVLTree.Node node73 = aVLTree34.getRoot();
        int int74 = aVLTree26.getBalance(node73);
        int int75 = aVLTree0.getBalance(node73);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        org.example.AVLTree.Node node17 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = aVLTree12.getRoot();
        org.example.AVLTree.Node node15 = aVLTree12.find((int) '#');
        org.example.AVLTree.Node node17 = aVLTree12.find((int) (byte) -1);
        org.example.AVLTree.Node node18 = aVLTree12.getRoot();
        org.example.AVLTree.Node node20 = aVLTree12.find((int) (byte) -1);
        int int21 = aVLTree12.height();
        org.example.AVLTree aVLTree22 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.delete((int) '4');
        org.example.AVLTree.Node node27 = aVLTree22.getRoot();
        int int28 = aVLTree22.height();
        org.example.AVLTree.Node node29 = aVLTree22.getRoot();
        aVLTree22.delete((int) (byte) 100);
        int int32 = aVLTree22.height();
        int int33 = aVLTree22.height();
        org.example.AVLTree aVLTree34 = new org.example.AVLTree();
        org.example.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        org.example.AVLTree.Node node37 = null;
        int int38 = aVLTree34.getBalance(node37);
        aVLTree34.insert((int) (byte) 0);
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree41.getBalance(node42);
        aVLTree41.delete((int) '4');
        int int46 = aVLTree41.height();
        aVLTree41.insert(100);
        aVLTree41.insert((int) ' ');
        aVLTree41.delete(0);
        aVLTree41.insert(1);
        org.example.AVLTree aVLTree55 = new org.example.AVLTree();
        org.example.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        aVLTree55.delete((int) '4');
        aVLTree55.delete((-1));
        aVLTree55.insert((int) 'a');
        aVLTree55.insert((int) (byte) 100);
        int int66 = aVLTree55.height();
        aVLTree55.insert((int) (short) 1);
        org.example.AVLTree.Node node69 = aVLTree55.getRoot();
        int int70 = aVLTree41.getBalance(node69);
        int int71 = aVLTree34.getBalance(node69);
        org.example.AVLTree.Node node72 = aVLTree34.getRoot();
        org.example.AVLTree aVLTree73 = new org.example.AVLTree();
        org.example.AVLTree.Node node74 = null;
        int int75 = aVLTree73.getBalance(node74);
        aVLTree73.delete((int) '4');
        int int78 = aVLTree73.height();
        org.example.AVLTree aVLTree79 = new org.example.AVLTree();
        org.example.AVLTree.Node node80 = null;
        int int81 = aVLTree79.getBalance(node80);
        org.example.AVLTree.Node node82 = null;
        int int83 = aVLTree79.getBalance(node82);
        aVLTree79.insert((int) (byte) 0);
        org.example.AVLTree.Node node86 = aVLTree79.getRoot();
        int int87 = aVLTree73.getBalance(node86);
        int int88 = aVLTree34.getBalance(node86);
        int int89 = aVLTree22.getBalance(node86);
        int int90 = aVLTree12.getBalance(node86);
        int int91 = aVLTree0.getBalance(node86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.delete((int) ' ');
        int int13 = aVLTree0.height();
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        org.example.AVLTree.Node node15 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
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
        int int32 = aVLTree24.height();
        aVLTree24.insert(0);
        org.example.AVLTree.Node node35 = aVLTree24.getRoot();
        int int36 = aVLTree12.getBalance(node35);
        int int37 = aVLTree0.getBalance(node35);
        org.example.AVLTree aVLTree38 = new org.example.AVLTree();
        org.example.AVLTree.Node node39 = null;
        int int40 = aVLTree38.getBalance(node39);
        aVLTree38.delete((int) '4');
        aVLTree38.delete((-1));
        aVLTree38.insert((int) 'a');
        aVLTree38.insert(10);
        org.example.AVLTree.Node node50 = aVLTree38.find((int) (short) 10);
        org.example.AVLTree.Node node52 = aVLTree38.find((int) (byte) 10);
        int int53 = aVLTree0.getBalance(node52);
        org.example.AVLTree.Node node55 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(node55);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete(0);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        aVLTree0.insert((int) '4');
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        org.example.AVLTree.Node node14 = aVLTree10.find(1);
        aVLTree10.insert((int) (byte) 100);
        int int17 = aVLTree10.height();
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree10.getBalance(node18);
        aVLTree10.insert((int) (byte) -1);
        aVLTree10.insert((int) (byte) 10);
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        int int29 = aVLTree24.height();
        aVLTree24.delete((int) (byte) 100);
        org.example.AVLTree.Node node33 = aVLTree24.find((int) (short) 100);
        aVLTree24.delete(10);
        int int36 = aVLTree24.height();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        org.example.AVLTree.Node node42 = aVLTree37.getRoot();
        org.example.AVLTree.Node node44 = aVLTree37.find((int) (byte) 0);
        aVLTree37.delete((int) (short) 100);
        org.example.AVLTree.Node node48 = aVLTree37.find((int) (byte) 0);
        int int49 = aVLTree37.height();
        org.example.AVLTree.Node node51 = aVLTree37.find((int) '4');
        org.example.AVLTree aVLTree52 = new org.example.AVLTree();
        org.example.AVLTree.Node node53 = aVLTree52.getRoot();
        org.example.AVLTree.Node node55 = aVLTree52.find((int) '#');
        org.example.AVLTree.Node node57 = aVLTree52.find((int) (byte) -1);
        org.example.AVLTree.Node node58 = aVLTree52.getRoot();
        org.example.AVLTree.Node node59 = aVLTree52.getRoot();
        org.example.AVLTree aVLTree60 = new org.example.AVLTree();
        org.example.AVLTree.Node node61 = null;
        int int62 = aVLTree60.getBalance(node61);
        aVLTree60.delete((int) '4');
        org.example.AVLTree.Node node65 = aVLTree60.getRoot();
        int int66 = aVLTree60.height();
        org.example.AVLTree.Node node67 = aVLTree60.getRoot();
        org.example.AVLTree aVLTree68 = new org.example.AVLTree();
        org.example.AVLTree.Node node69 = null;
        int int70 = aVLTree68.getBalance(node69);
        aVLTree68.delete((int) '4');
        aVLTree68.delete((-1));
        aVLTree68.insert((int) 'a');
        aVLTree68.insert((int) (byte) 100);
        int int79 = aVLTree68.height();
        aVLTree68.insert((int) (short) 1);
        org.example.AVLTree.Node node82 = aVLTree68.getRoot();
        int int83 = aVLTree60.getBalance(node82);
        int int84 = aVLTree52.getBalance(node82);
        int int85 = aVLTree37.getBalance(node82);
        int int86 = aVLTree24.getBalance(node82);
        int int87 = aVLTree10.getBalance(node82);
        int int88 = aVLTree0.getBalance(node82);
        int int89 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '4');
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
        org.example.AVLTree.Node node13 = aVLTree0.find((-1));
        aVLTree0.insert(0);
        int int16 = aVLTree0.height();
        aVLTree0.delete(10);
        org.example.AVLTree.Node node19 = aVLTree0.getRoot();
        org.example.AVLTree.Node node21 = aVLTree0.find((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.insert((int) (byte) -1);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) '4');
        int int17 = aVLTree12.height();
        aVLTree12.insert(100);
        aVLTree12.insert((int) ' ');
        aVLTree12.delete(0);
        aVLTree12.insert(1);
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.delete((int) '4');
        aVLTree26.delete((-1));
        aVLTree26.insert((int) 'a');
        aVLTree26.insert((int) (byte) 100);
        int int37 = aVLTree26.height();
        aVLTree26.insert((int) (short) 1);
        org.example.AVLTree.Node node40 = aVLTree26.getRoot();
        int int41 = aVLTree12.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.lang.Class<?> wildcardClass62 = node58.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert(1);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        int int22 = aVLTree16.height();
        org.example.AVLTree.Node node23 = aVLTree16.getRoot();
        int int24 = aVLTree16.height();
        aVLTree16.insert(0);
        org.example.AVLTree.Node node27 = aVLTree16.getRoot();
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = aVLTree28.getRoot();
        org.example.AVLTree.Node node31 = aVLTree28.find((int) '#');
        org.example.AVLTree.Node node33 = aVLTree28.find((int) (byte) -1);
        org.example.AVLTree.Node node34 = aVLTree28.getRoot();
        org.example.AVLTree.Node node35 = aVLTree28.getRoot();
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = aVLTree36.getRoot();
        org.example.AVLTree.Node node39 = aVLTree36.find((int) '#');
        int int40 = aVLTree36.height();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree36.getBalance(node41);
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree43.getBalance(node46);
        aVLTree43.insert((int) (byte) 0);
        org.example.AVLTree.Node node50 = aVLTree43.getRoot();
        int int51 = aVLTree36.getBalance(node50);
        int int52 = aVLTree28.getBalance(node50);
        int int53 = aVLTree16.getBalance(node50);
        int int54 = aVLTree0.getBalance(node50);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        org.example.AVLTree.Node node47 = aVLTree0.getRoot();
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
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        org.example.AVLTree.Node node38 = aVLTree0.getRoot();
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
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        org.example.AVLTree.Node node33 = aVLTree0.find((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass34 = node33.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = node14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass12 = node11.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        org.example.AVLTree.Node node28 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = node28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        int int15 = aVLTree10.height();
        aVLTree10.insert(100);
        aVLTree10.insert((int) ' ');
        aVLTree10.delete(0);
        aVLTree10.insert(1);
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        aVLTree24.delete((-1));
        aVLTree24.insert((int) 'a');
        aVLTree24.insert((int) (byte) 100);
        int int35 = aVLTree24.height();
        aVLTree24.insert((int) (short) 1);
        org.example.AVLTree.Node node38 = aVLTree24.getRoot();
        int int39 = aVLTree10.getBalance(node38);
        int int40 = aVLTree0.getBalance(node38);
        java.lang.Class<?> wildcardClass41 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete((int) 'a');
        org.example.AVLTree.Node node12 = aVLTree0.find((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.lang.Class<?> wildcardClass46 = node43.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.example.AVLTree.Node node40 = aVLTree0.find((int) (byte) 10);
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
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        org.example.AVLTree.Node node30 = aVLTree0.getRoot();
        aVLTree0.delete((int) '#');
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
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.find(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        int int19 = aVLTree14.height();
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree14.getBalance(node20);
        int int22 = aVLTree14.height();
        org.example.AVLTree.Node node23 = null;
        int int24 = aVLTree14.getBalance(node23);
        aVLTree14.insert((int) '4');
        org.example.AVLTree.Node node27 = aVLTree14.getRoot();
        int int28 = aVLTree0.getBalance(node27);
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
        int int65 = aVLTree0.getBalance(node62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
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
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.Class<?> wildcardClass47 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        int int13 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node15 = aVLTree0.find(100);
        org.example.AVLTree.Node node17 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        int int23 = aVLTree18.height();
        aVLTree18.insert((int) (byte) 1);
        org.example.AVLTree.Node node27 = aVLTree18.find((-1));
        int int28 = aVLTree18.height();
        org.example.AVLTree.Node node29 = aVLTree18.getRoot();
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        int int36 = aVLTree30.height();
        org.example.AVLTree.Node node37 = aVLTree30.getRoot();
        int int38 = aVLTree30.height();
        aVLTree30.insert(0);
        org.example.AVLTree.Node node41 = aVLTree30.getRoot();
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = aVLTree42.getRoot();
        org.example.AVLTree.Node node45 = aVLTree42.find((int) '#');
        org.example.AVLTree.Node node47 = aVLTree42.find((int) (byte) -1);
        org.example.AVLTree.Node node48 = aVLTree42.getRoot();
        org.example.AVLTree.Node node49 = aVLTree42.getRoot();
        org.example.AVLTree aVLTree50 = new org.example.AVLTree();
        org.example.AVLTree.Node node51 = aVLTree50.getRoot();
        org.example.AVLTree.Node node53 = aVLTree50.find((int) '#');
        int int54 = aVLTree50.height();
        org.example.AVLTree.Node node55 = null;
        int int56 = aVLTree50.getBalance(node55);
        org.example.AVLTree aVLTree57 = new org.example.AVLTree();
        org.example.AVLTree.Node node58 = null;
        int int59 = aVLTree57.getBalance(node58);
        org.example.AVLTree.Node node60 = null;
        int int61 = aVLTree57.getBalance(node60);
        aVLTree57.insert((int) (byte) 0);
        org.example.AVLTree.Node node64 = aVLTree57.getRoot();
        int int65 = aVLTree50.getBalance(node64);
        int int66 = aVLTree42.getBalance(node64);
        int int67 = aVLTree30.getBalance(node64);
        int int68 = aVLTree18.getBalance(node64);
        int int69 = aVLTree0.getBalance(node64);
        org.example.AVLTree.Node node70 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(node70);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node3 = aVLTree0.getRoot();
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.find(2);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        org.example.AVLTree.Node node46 = aVLTree0.getRoot();
        aVLTree0.insert((int) '4');
        aVLTree0.delete((int) '4');
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
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        int int10 = aVLTree0.height();
        aVLTree0.delete(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        org.example.AVLTree.Node node71 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass72 = node71.getClass();
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
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        org.example.AVLTree.Node node29 = aVLTree0.find((int) (byte) 100);
        aVLTree0.insert((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"left\" because \"current\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        org.example.AVLTree.Node node39 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete(0);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) 'a');
        int int14 = aVLTree0.height();
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        int int11 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        int int19 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
        aVLTree0.delete((int) (short) -1);
        int int14 = aVLTree0.height();
        org.example.AVLTree.Node node15 = aVLTree0.getRoot();
        aVLTree0.delete((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.find(2);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        org.example.AVLTree.Node node16 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        aVLTree0.insert((int) (short) 1);
        org.example.AVLTree aVLTree17 = new org.example.AVLTree();
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.delete((int) '4');
        int int22 = aVLTree17.height();
        int int23 = aVLTree17.height();
        aVLTree17.delete((int) '#');
        org.example.AVLTree.Node node27 = aVLTree17.find((int) (byte) 0);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        org.example.AVLTree.Node node33 = aVLTree28.getRoot();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree28.getBalance(node34);
        org.example.AVLTree.Node node36 = aVLTree28.getRoot();
        org.example.AVLTree.Node node37 = aVLTree28.getRoot();
        int int38 = aVLTree28.height();
        int int39 = aVLTree28.height();
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        org.example.AVLTree.Node node44 = aVLTree40.find(1);
        org.example.AVLTree.Node node46 = aVLTree40.find(10);
        int int47 = aVLTree40.height();
        aVLTree40.insert((int) (byte) 1);
        org.example.AVLTree.Node node50 = aVLTree40.getRoot();
        int int51 = aVLTree28.getBalance(node50);
        int int52 = aVLTree17.getBalance(node50);
        org.example.AVLTree aVLTree53 = new org.example.AVLTree();
        org.example.AVLTree.Node node54 = null;
        int int55 = aVLTree53.getBalance(node54);
        org.example.AVLTree.Node node56 = null;
        int int57 = aVLTree53.getBalance(node56);
        aVLTree53.insert((int) (byte) 0);
        org.example.AVLTree aVLTree60 = new org.example.AVLTree();
        org.example.AVLTree.Node node61 = null;
        int int62 = aVLTree60.getBalance(node61);
        aVLTree60.delete((int) '4');
        int int65 = aVLTree60.height();
        aVLTree60.insert(100);
        aVLTree60.insert((int) ' ');
        aVLTree60.delete(0);
        aVLTree60.insert(1);
        org.example.AVLTree aVLTree74 = new org.example.AVLTree();
        org.example.AVLTree.Node node75 = null;
        int int76 = aVLTree74.getBalance(node75);
        aVLTree74.delete((int) '4');
        aVLTree74.delete((-1));
        aVLTree74.insert((int) 'a');
        aVLTree74.insert((int) (byte) 100);
        int int85 = aVLTree74.height();
        aVLTree74.insert((int) (short) 1);
        org.example.AVLTree.Node node88 = aVLTree74.getRoot();
        int int89 = aVLTree60.getBalance(node88);
        int int90 = aVLTree53.getBalance(node88);
        org.example.AVLTree.Node node91 = aVLTree53.getRoot();
        int int92 = aVLTree17.getBalance(node91);
        int int93 = aVLTree0.getBalance(node91);
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        org.example.AVLTree.Node node33 = aVLTree0.find((int) (short) 100);
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
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        org.example.AVLTree.Node node16 = aVLTree12.find(1);
        aVLTree12.insert((int) (byte) 100);
        int int19 = aVLTree12.height();
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        org.example.AVLTree.Node node22 = aVLTree12.getRoot();
        int int23 = aVLTree0.getBalance(node22);
        org.example.AVLTree.Node node25 = aVLTree0.find(0);
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = aVLTree10.getRoot();
        org.example.AVLTree.Node node13 = aVLTree10.find((int) '#');
        org.example.AVLTree.Node node15 = aVLTree10.find((int) (byte) -1);
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree10.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        aVLTree18.delete((-1));
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.delete((int) '4');
        org.example.AVLTree.Node node31 = aVLTree26.getRoot();
        org.example.AVLTree.Node node33 = aVLTree26.find((int) (byte) 0);
        org.example.AVLTree.Node node35 = aVLTree26.find((int) '#');
        int int36 = aVLTree26.height();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = aVLTree37.getRoot();
        org.example.AVLTree.Node node40 = aVLTree37.find((int) '#');
        int int41 = aVLTree37.height();
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree37.getBalance(node42);
        org.example.AVLTree aVLTree44 = new org.example.AVLTree();
        org.example.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        org.example.AVLTree.Node node47 = null;
        int int48 = aVLTree44.getBalance(node47);
        aVLTree44.insert((int) (byte) 0);
        org.example.AVLTree.Node node51 = aVLTree44.getRoot();
        int int52 = aVLTree37.getBalance(node51);
        int int53 = aVLTree26.getBalance(node51);
        org.example.AVLTree aVLTree54 = new org.example.AVLTree();
        org.example.AVLTree.Node node55 = null;
        int int56 = aVLTree54.getBalance(node55);
        aVLTree54.delete((int) '4');
        int int59 = aVLTree54.height();
        aVLTree54.insert((int) (byte) 1);
        org.example.AVLTree.Node node63 = aVLTree54.find((-1));
        int int64 = aVLTree54.height();
        org.example.AVLTree.Node node66 = aVLTree54.find(0);
        org.example.AVLTree.Node node68 = aVLTree54.find((int) (short) 1);
        int int69 = aVLTree26.getBalance(node68);
        int int70 = aVLTree18.getBalance(node68);
        int int71 = aVLTree10.getBalance(node68);
        int int72 = aVLTree0.getBalance(node68);
        java.lang.Class<?> wildcardClass73 = node68.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        org.example.AVLTree aVLTree55 = new org.example.AVLTree();
        org.example.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        aVLTree55.delete((int) '4');
        aVLTree55.delete((-1));
        aVLTree55.insert((int) 'a');
        aVLTree55.insert((int) (byte) 100);
        int int66 = aVLTree55.height();
        aVLTree55.insert((int) (short) 1);
        org.example.AVLTree.Node node69 = aVLTree55.getRoot();
        org.example.AVLTree.Node node70 = aVLTree55.getRoot();
        org.example.AVLTree.Node node72 = aVLTree55.find((int) '4');
        int int73 = aVLTree55.height();
        org.example.AVLTree aVLTree74 = new org.example.AVLTree();
        org.example.AVLTree.Node node76 = aVLTree74.find((int) (short) 0);
        org.example.AVLTree.Node node78 = aVLTree74.find((-1));
        aVLTree74.insert((-1));
        org.example.AVLTree aVLTree81 = new org.example.AVLTree();
        org.example.AVLTree.Node node82 = null;
        int int83 = aVLTree81.getBalance(node82);
        aVLTree81.delete((int) '4');
        org.example.AVLTree.Node node86 = aVLTree81.getRoot();
        int int87 = aVLTree81.height();
        org.example.AVLTree.Node node88 = aVLTree81.getRoot();
        int int89 = aVLTree81.height();
        aVLTree81.insert(0);
        org.example.AVLTree.Node node92 = aVLTree81.getRoot();
        int int93 = aVLTree74.getBalance(node92);
        aVLTree74.insert((int) (short) 100);
        org.example.AVLTree.Node node96 = aVLTree74.getRoot();
        int int97 = aVLTree55.getBalance(node96);
        int int98 = aVLTree0.getBalance(node96);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 1 + "'", int98 == 1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.Class<?> wildcardClass20 = node18.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (byte) -1);
        int int10 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = node11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.find(0);
        aVLTree0.insert((int) ' ');
        org.example.AVLTree.Node node13 = aVLTree0.find(0);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = aVLTree8.getRoot();
        org.example.AVLTree.Node node11 = aVLTree8.find((int) '#');
        int int12 = aVLTree8.height();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree8.getBalance(node13);
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree15.getBalance(node18);
        aVLTree15.insert((int) (byte) 0);
        org.example.AVLTree.Node node22 = aVLTree15.getRoot();
        int int23 = aVLTree8.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        int int25 = aVLTree0.height();
        org.example.AVLTree.Node node26 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        int int9 = aVLTree0.height();
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree21.getBalance(node24);
        aVLTree21.insert((int) (byte) 0);
        org.example.AVLTree.Node node28 = aVLTree21.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        java.lang.Class<?> wildcardClass30 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        int int55 = aVLTree0.height();
        org.example.AVLTree.Node node56 = aVLTree0.getRoot();
        org.example.AVLTree.Node node58 = aVLTree0.find(100);
        java.lang.Class<?> wildcardClass59 = aVLTree0.getClass();
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert(10);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        int int11 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        int int35 = aVLTree30.height();
        aVLTree30.delete((int) (byte) 100);
        org.example.AVLTree.Node node39 = aVLTree30.find((int) (short) 100);
        aVLTree30.delete(10);
        int int42 = aVLTree30.height();
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        aVLTree43.delete((int) '4');
        org.example.AVLTree.Node node48 = aVLTree43.getRoot();
        org.example.AVLTree.Node node50 = aVLTree43.find((int) (byte) 0);
        aVLTree43.delete((int) (short) 100);
        org.example.AVLTree.Node node54 = aVLTree43.find((int) (byte) 0);
        int int55 = aVLTree43.height();
        org.example.AVLTree.Node node57 = aVLTree43.find((int) '4');
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = aVLTree58.getRoot();
        org.example.AVLTree.Node node61 = aVLTree58.find((int) '#');
        org.example.AVLTree.Node node63 = aVLTree58.find((int) (byte) -1);
        org.example.AVLTree.Node node64 = aVLTree58.getRoot();
        org.example.AVLTree.Node node65 = aVLTree58.getRoot();
        org.example.AVLTree aVLTree66 = new org.example.AVLTree();
        org.example.AVLTree.Node node67 = null;
        int int68 = aVLTree66.getBalance(node67);
        aVLTree66.delete((int) '4');
        org.example.AVLTree.Node node71 = aVLTree66.getRoot();
        int int72 = aVLTree66.height();
        org.example.AVLTree.Node node73 = aVLTree66.getRoot();
        org.example.AVLTree aVLTree74 = new org.example.AVLTree();
        org.example.AVLTree.Node node75 = null;
        int int76 = aVLTree74.getBalance(node75);
        aVLTree74.delete((int) '4');
        aVLTree74.delete((-1));
        aVLTree74.insert((int) 'a');
        aVLTree74.insert((int) (byte) 100);
        int int85 = aVLTree74.height();
        aVLTree74.insert((int) (short) 1);
        org.example.AVLTree.Node node88 = aVLTree74.getRoot();
        int int89 = aVLTree66.getBalance(node88);
        int int90 = aVLTree58.getBalance(node88);
        int int91 = aVLTree43.getBalance(node88);
        int int92 = aVLTree30.getBalance(node88);
        int int93 = aVLTree0.getBalance(node88);
        aVLTree0.delete(100);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        aVLTree0.insert((int) (byte) -1);
        org.example.AVLTree.Node node36 = aVLTree0.find(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = node36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert(1);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        int int22 = aVLTree16.height();
        org.example.AVLTree.Node node23 = aVLTree16.getRoot();
        int int24 = aVLTree16.height();
        aVLTree16.insert(0);
        org.example.AVLTree.Node node27 = aVLTree16.getRoot();
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = aVLTree28.getRoot();
        org.example.AVLTree.Node node31 = aVLTree28.find((int) '#');
        org.example.AVLTree.Node node33 = aVLTree28.find((int) (byte) -1);
        org.example.AVLTree.Node node34 = aVLTree28.getRoot();
        org.example.AVLTree.Node node35 = aVLTree28.getRoot();
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = aVLTree36.getRoot();
        org.example.AVLTree.Node node39 = aVLTree36.find((int) '#');
        int int40 = aVLTree36.height();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree36.getBalance(node41);
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree43.getBalance(node46);
        aVLTree43.insert((int) (byte) 0);
        org.example.AVLTree.Node node50 = aVLTree43.getRoot();
        int int51 = aVLTree36.getBalance(node50);
        int int52 = aVLTree28.getBalance(node50);
        int int53 = aVLTree16.getBalance(node50);
        int int54 = aVLTree0.getBalance(node50);
        aVLTree0.insert(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = node11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
        org.example.AVLTree.Node node13 = aVLTree0.find((-1));
        aVLTree0.insert(0);
        int int16 = aVLTree0.height();
        aVLTree0.delete(10);
        java.lang.Class<?> wildcardClass19 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.find(0);
        int int10 = aVLTree0.height();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        aVLTree0.insert((-1));
        aVLTree0.insert((int) '4');
        org.example.AVLTree.Node node21 = aVLTree0.find((int) (byte) 0);
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        aVLTree0.delete((-1));
        org.example.AVLTree.Node node35 = aVLTree0.find((int) (short) 10);
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
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        aVLTree11.delete((int) '4');
        int int16 = aVLTree11.height();
        aVLTree11.insert(100);
        aVLTree11.insert((int) ' ');
        aVLTree11.delete(0);
        aVLTree11.insert(1);
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
        int int40 = aVLTree11.getBalance(node39);
        int int41 = aVLTree0.getBalance(node39);
        aVLTree0.insert(100);
        aVLTree0.delete((int) (byte) 1);
        java.lang.Class<?> wildcardClass46 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        org.example.AVLTree.Node node46 = aVLTree0.getRoot();
        org.example.AVLTree.Node node47 = aVLTree0.getRoot();
        org.example.AVLTree.Node node48 = aVLTree0.getRoot();
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
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert(1);
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        org.example.AVLTree.Node node21 = aVLTree16.getRoot();
        int int22 = aVLTree16.height();
        org.example.AVLTree.Node node23 = aVLTree16.getRoot();
        int int24 = aVLTree16.height();
        aVLTree16.insert(0);
        org.example.AVLTree.Node node27 = aVLTree16.getRoot();
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = aVLTree28.getRoot();
        org.example.AVLTree.Node node31 = aVLTree28.find((int) '#');
        org.example.AVLTree.Node node33 = aVLTree28.find((int) (byte) -1);
        org.example.AVLTree.Node node34 = aVLTree28.getRoot();
        org.example.AVLTree.Node node35 = aVLTree28.getRoot();
        org.example.AVLTree aVLTree36 = new org.example.AVLTree();
        org.example.AVLTree.Node node37 = aVLTree36.getRoot();
        org.example.AVLTree.Node node39 = aVLTree36.find((int) '#');
        int int40 = aVLTree36.height();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree36.getBalance(node41);
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree43.getBalance(node46);
        aVLTree43.insert((int) (byte) 0);
        org.example.AVLTree.Node node50 = aVLTree43.getRoot();
        int int51 = aVLTree36.getBalance(node50);
        int int52 = aVLTree28.getBalance(node50);
        int int53 = aVLTree16.getBalance(node50);
        int int54 = aVLTree0.getBalance(node50);
        java.lang.Class<?> wildcardClass55 = node50.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        org.example.AVLTree.Node node63 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree aVLTree64 = new org.example.AVLTree();
        org.example.AVLTree.Node node65 = null;
        int int66 = aVLTree64.getBalance(node65);
        aVLTree64.delete((int) '4');
        org.example.AVLTree.Node node69 = aVLTree64.getRoot();
        int int70 = aVLTree64.height();
        org.example.AVLTree.Node node71 = aVLTree64.getRoot();
        aVLTree64.delete((int) (byte) 100);
        int int74 = aVLTree64.height();
        int int75 = aVLTree64.height();
        org.example.AVLTree aVLTree76 = new org.example.AVLTree();
        org.example.AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.delete((int) '4');
        aVLTree76.delete((-1));
        aVLTree76.insert((int) 'a');
        aVLTree76.insert((int) (byte) 100);
        int int87 = aVLTree76.height();
        aVLTree76.insert((int) (short) 1);
        org.example.AVLTree.Node node90 = aVLTree76.getRoot();
        int int91 = aVLTree64.getBalance(node90);
        int int92 = aVLTree0.getBalance(node90);
        aVLTree0.insert((int) (short) 1);
        aVLTree0.delete((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.example.AVLTree.Node node21 = aVLTree0.find(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        aVLTree0.insert((int) ' ');
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        org.example.AVLTree.Node node21 = aVLTree17.find(1);
        org.example.AVLTree.Node node23 = aVLTree17.find(10);
        int int24 = aVLTree17.height();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        org.example.AVLTree.Node node28 = aVLTree17.find(100);
        int int29 = aVLTree17.height();
        org.example.AVLTree.Node node30 = aVLTree17.getRoot();
        aVLTree17.insert((-1));
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.delete((int) '4');
        int int38 = aVLTree33.height();
        org.example.AVLTree.Node node40 = aVLTree33.find((int) (byte) 0);
        aVLTree33.insert((int) (short) -1);
        aVLTree33.delete(0);
        org.example.AVLTree.Node node46 = aVLTree33.find((int) 'a');
        int int47 = aVLTree33.height();
        org.example.AVLTree.Node node49 = aVLTree33.find((int) 'a');
        org.example.AVLTree.Node node50 = aVLTree33.getRoot();
        int int51 = aVLTree17.getBalance(node50);
        org.example.AVLTree.Node node53 = aVLTree17.find(100);
        aVLTree17.insert(0);
        aVLTree17.insert((int) (byte) 1);
        org.example.AVLTree.Node node58 = aVLTree17.getRoot();
        int int59 = aVLTree0.getBalance(node58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert(10);
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        int int13 = aVLTree0.height();
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree14.getBalance(node17);
        aVLTree14.insert((int) (byte) 0);
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        int int26 = aVLTree21.height();
        aVLTree21.insert(100);
        aVLTree21.insert((int) ' ');
        aVLTree21.delete(0);
        aVLTree21.insert(1);
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
        int int50 = aVLTree21.getBalance(node49);
        int int51 = aVLTree14.getBalance(node49);
        org.example.AVLTree.Node node52 = aVLTree14.getRoot();
        int int53 = aVLTree0.getBalance(node52);
        org.example.AVLTree.Node node55 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(node55);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        aVLTree0.delete((-1));
        int int34 = aVLTree0.height();
        org.example.AVLTree aVLTree35 = new org.example.AVLTree();
        org.example.AVLTree.Node node36 = null;
        int int37 = aVLTree35.getBalance(node36);
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree35.getBalance(node38);
        aVLTree35.insert((int) (byte) 0);
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.delete((int) '4');
        int int47 = aVLTree42.height();
        aVLTree42.insert(100);
        aVLTree42.insert((int) ' ');
        aVLTree42.delete(0);
        aVLTree42.insert(1);
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
        int int71 = aVLTree42.getBalance(node70);
        int int72 = aVLTree35.getBalance(node70);
        org.example.AVLTree.Node node73 = aVLTree35.getRoot();
        int int74 = aVLTree0.getBalance(node73);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(10);
        org.example.AVLTree aVLTree12 = new org.example.AVLTree();
        org.example.AVLTree.Node node13 = aVLTree12.getRoot();
        org.example.AVLTree.Node node15 = aVLTree12.find((int) '#');
        org.example.AVLTree.Node node17 = aVLTree12.find((int) (byte) -1);
        org.example.AVLTree.Node node18 = aVLTree12.getRoot();
        org.example.AVLTree.Node node19 = aVLTree12.getRoot();
        org.example.AVLTree.Node node20 = aVLTree12.getRoot();
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node23 = aVLTree21.find((int) (short) 0);
        int int24 = aVLTree21.height();
        org.example.AVLTree.Node node26 = aVLTree21.find((int) (short) 0);
        aVLTree21.insert((int) (short) 1);
        org.example.AVLTree aVLTree29 = new org.example.AVLTree();
        org.example.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.delete((int) '4');
        int int34 = aVLTree29.height();
        org.example.AVLTree.Node node36 = aVLTree29.find((int) (byte) 0);
        org.example.AVLTree.Node node37 = aVLTree29.getRoot();
        org.example.AVLTree aVLTree38 = new org.example.AVLTree();
        org.example.AVLTree.Node node39 = null;
        int int40 = aVLTree38.getBalance(node39);
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree38.getBalance(node41);
        aVLTree38.insert((int) (byte) 0);
        org.example.AVLTree.Node node45 = aVLTree38.getRoot();
        int int46 = aVLTree29.getBalance(node45);
        org.example.AVLTree aVLTree47 = new org.example.AVLTree();
        org.example.AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        org.example.AVLTree.Node node51 = aVLTree47.find(1);
        org.example.AVLTree.Node node53 = aVLTree47.find(10);
        int int54 = aVLTree47.height();
        aVLTree47.insert((int) (byte) 1);
        org.example.AVLTree.Node node57 = aVLTree47.getRoot();
        int int58 = aVLTree29.getBalance(node57);
        int int59 = aVLTree21.getBalance(node57);
        int int60 = aVLTree12.getBalance(node57);
        int int61 = aVLTree0.getBalance(node57);
        java.lang.Class<?> wildcardClass62 = node57.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete((int) (short) -1);
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        int int2 = aVLTree0.height();
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) '#');
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) '4');
        aVLTree8.delete((-1));
        aVLTree8.insert((int) 'a');
        aVLTree8.insert((int) (byte) 100);
        org.example.AVLTree.Node node19 = aVLTree8.getRoot();
        int int20 = aVLTree0.getBalance(node19);
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
        int int36 = aVLTree0.getBalance(node34);
        java.lang.Class<?> wildcardClass37 = node34.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node10 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) (byte) 1);
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
        aVLTree0.delete((-1));
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.delete((int) '4');
        int int19 = aVLTree14.height();
        int int20 = aVLTree14.height();
        aVLTree14.delete((int) '#');
        org.example.AVLTree.Node node24 = aVLTree14.find((int) (byte) 0);
        org.example.AVLTree aVLTree25 = new org.example.AVLTree();
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.delete((int) '4');
        org.example.AVLTree.Node node30 = aVLTree25.getRoot();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree25.getBalance(node31);
        org.example.AVLTree.Node node33 = aVLTree25.getRoot();
        org.example.AVLTree.Node node34 = aVLTree25.getRoot();
        int int35 = aVLTree25.height();
        int int36 = aVLTree25.height();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        org.example.AVLTree.Node node41 = aVLTree37.find(1);
        org.example.AVLTree.Node node43 = aVLTree37.find(10);
        int int44 = aVLTree37.height();
        aVLTree37.insert((int) (byte) 1);
        org.example.AVLTree.Node node47 = aVLTree37.getRoot();
        int int48 = aVLTree25.getBalance(node47);
        int int49 = aVLTree14.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert(10);
        org.example.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        int int13 = aVLTree0.height();
        org.example.AVLTree aVLTree14 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree14.getBalance(node17);
        aVLTree14.insert((int) (byte) 0);
        org.example.AVLTree aVLTree21 = new org.example.AVLTree();
        org.example.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.delete((int) '4');
        int int26 = aVLTree21.height();
        aVLTree21.insert(100);
        aVLTree21.insert((int) ' ');
        aVLTree21.delete(0);
        aVLTree21.insert(1);
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
        int int50 = aVLTree21.getBalance(node49);
        int int51 = aVLTree14.getBalance(node49);
        org.example.AVLTree.Node node52 = aVLTree14.getRoot();
        int int53 = aVLTree0.getBalance(node52);
        int int54 = aVLTree0.height();
        org.example.AVLTree.Node node55 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        org.example.AVLTree aVLTree16 = new org.example.AVLTree();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.delete((int) '4');
        aVLTree16.insert((int) 'a');
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.delete((int) '4');
        int int28 = aVLTree23.height();
        aVLTree23.insert(100);
        aVLTree23.insert((int) ' ');
        aVLTree23.delete(0);
        aVLTree23.insert(1);
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) '4');
        org.example.AVLTree.Node node42 = aVLTree37.getRoot();
        int int43 = aVLTree37.height();
        org.example.AVLTree.Node node44 = aVLTree37.getRoot();
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
        int int60 = aVLTree37.getBalance(node59);
        int int61 = aVLTree23.getBalance(node59);
        int int62 = aVLTree16.getBalance(node59);
        int int63 = aVLTree0.getBalance(node59);
        org.example.AVLTree.Node node64 = aVLTree0.getRoot();
        aVLTree0.delete((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(node64);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        int int22 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node15 = aVLTree13.find((int) (short) 0);
        org.example.AVLTree.Node node16 = aVLTree13.getRoot();
        org.example.AVLTree.Node node17 = aVLTree13.getRoot();
        aVLTree13.insert(0);
        org.example.AVLTree.Node node20 = aVLTree13.getRoot();
        int int21 = aVLTree0.getBalance(node20);
        int int22 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        aVLTree0.delete((int) (byte) 0);
        java.lang.Class<?> wildcardClass62 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        java.lang.Class<?> wildcardClass47 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node8 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node10 = aVLTree0.find((-1));
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"left\" because \"current\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) (short) 1);
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        int int15 = aVLTree0.height();
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node4 = aVLTree0.find((-1));
        aVLTree0.insert((-1));
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.delete((int) '4');
        org.example.AVLTree.Node node12 = aVLTree7.getRoot();
        org.example.AVLTree.Node node14 = aVLTree7.find((int) (byte) 0);
        org.example.AVLTree.Node node15 = aVLTree7.getRoot();
        org.example.AVLTree.Node node17 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) '4');
        org.example.AVLTree.Node node20 = aVLTree7.getRoot();
        int int21 = aVLTree0.getBalance(node20);
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        int int16 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        int int27 = aVLTree0.height();
        org.example.AVLTree.Node node29 = aVLTree0.find((int) ' ');
        java.lang.Class<?> wildcardClass30 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        int int80 = aVLTree0.height();
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
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = aVLTree10.getRoot();
        org.example.AVLTree.Node node13 = aVLTree10.find((int) '#');
        org.example.AVLTree.Node node15 = aVLTree10.find((int) (byte) -1);
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree10.getBalance(node16);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        aVLTree18.delete((-1));
        org.example.AVLTree.Node node25 = aVLTree18.getRoot();
        org.example.AVLTree aVLTree26 = new org.example.AVLTree();
        org.example.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.delete((int) '4');
        org.example.AVLTree.Node node31 = aVLTree26.getRoot();
        org.example.AVLTree.Node node33 = aVLTree26.find((int) (byte) 0);
        org.example.AVLTree.Node node35 = aVLTree26.find((int) '#');
        int int36 = aVLTree26.height();
        org.example.AVLTree aVLTree37 = new org.example.AVLTree();
        org.example.AVLTree.Node node38 = aVLTree37.getRoot();
        org.example.AVLTree.Node node40 = aVLTree37.find((int) '#');
        int int41 = aVLTree37.height();
        org.example.AVLTree.Node node42 = null;
        int int43 = aVLTree37.getBalance(node42);
        org.example.AVLTree aVLTree44 = new org.example.AVLTree();
        org.example.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        org.example.AVLTree.Node node47 = null;
        int int48 = aVLTree44.getBalance(node47);
        aVLTree44.insert((int) (byte) 0);
        org.example.AVLTree.Node node51 = aVLTree44.getRoot();
        int int52 = aVLTree37.getBalance(node51);
        int int53 = aVLTree26.getBalance(node51);
        org.example.AVLTree aVLTree54 = new org.example.AVLTree();
        org.example.AVLTree.Node node55 = null;
        int int56 = aVLTree54.getBalance(node55);
        aVLTree54.delete((int) '4');
        int int59 = aVLTree54.height();
        aVLTree54.insert((int) (byte) 1);
        org.example.AVLTree.Node node63 = aVLTree54.find((-1));
        int int64 = aVLTree54.height();
        org.example.AVLTree.Node node66 = aVLTree54.find(0);
        org.example.AVLTree.Node node68 = aVLTree54.find((int) (short) 1);
        int int69 = aVLTree26.getBalance(node68);
        int int70 = aVLTree18.getBalance(node68);
        int int71 = aVLTree10.getBalance(node68);
        int int72 = aVLTree0.getBalance(node68);
        org.example.AVLTree aVLTree73 = new org.example.AVLTree();
        org.example.AVLTree.Node node74 = null;
        int int75 = aVLTree73.getBalance(node74);
        aVLTree73.delete((int) '4');
        org.example.AVLTree.Node node78 = aVLTree73.getRoot();
        int int79 = aVLTree73.height();
        org.example.AVLTree.Node node80 = aVLTree73.getRoot();
        aVLTree73.delete((int) (byte) 100);
        int int83 = aVLTree73.height();
        int int84 = aVLTree73.height();
        aVLTree73.insert((int) (byte) 0);
        org.example.AVLTree.Node node87 = aVLTree73.getRoot();
        int int88 = aVLTree0.getBalance(node87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.delete((int) (short) 1);
        org.example.AVLTree aVLTree10 = new org.example.AVLTree();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) '4');
        int int15 = aVLTree10.height();
        aVLTree10.insert(100);
        aVLTree10.insert((int) ' ');
        aVLTree10.delete(0);
        aVLTree10.insert(1);
        org.example.AVLTree aVLTree24 = new org.example.AVLTree();
        org.example.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) '4');
        aVLTree24.delete((-1));
        aVLTree24.insert((int) 'a');
        aVLTree24.insert((int) (byte) 100);
        int int35 = aVLTree24.height();
        aVLTree24.insert((int) (short) 1);
        org.example.AVLTree.Node node38 = aVLTree24.getRoot();
        int int39 = aVLTree10.getBalance(node38);
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.delete((int) '4');
        int int45 = aVLTree40.height();
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree40.getBalance(node46);
        int int48 = aVLTree40.height();
        aVLTree40.delete((int) (byte) 0);
        int int51 = aVLTree40.height();
        org.example.AVLTree aVLTree52 = new org.example.AVLTree();
        org.example.AVLTree.Node node53 = null;
        int int54 = aVLTree52.getBalance(node53);
        aVLTree52.delete((int) '4');
        aVLTree52.delete((-1));
        aVLTree52.insert((int) 'a');
        aVLTree52.insert((int) (byte) 100);
        org.example.AVLTree.Node node63 = aVLTree52.getRoot();
        int int64 = aVLTree40.getBalance(node63);
        int int65 = aVLTree10.getBalance(node63);
        org.example.AVLTree aVLTree66 = new org.example.AVLTree();
        org.example.AVLTree.Node node67 = null;
        int int68 = aVLTree66.getBalance(node67);
        aVLTree66.delete((int) '4');
        org.example.AVLTree aVLTree71 = new org.example.AVLTree();
        org.example.AVLTree.Node node72 = null;
        int int73 = aVLTree71.getBalance(node72);
        aVLTree71.delete((int) '4');
        int int76 = aVLTree71.height();
        org.example.AVLTree aVLTree77 = new org.example.AVLTree();
        org.example.AVLTree.Node node78 = null;
        int int79 = aVLTree77.getBalance(node78);
        org.example.AVLTree.Node node80 = null;
        int int81 = aVLTree77.getBalance(node80);
        aVLTree77.insert((int) (byte) 0);
        org.example.AVLTree.Node node84 = aVLTree77.getRoot();
        int int85 = aVLTree71.getBalance(node84);
        int int86 = aVLTree66.getBalance(node84);
        int int87 = aVLTree10.getBalance(node84);
        int int88 = aVLTree0.getBalance(node84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node8 = aVLTree0.find((int) (byte) -1);
        int int9 = aVLTree0.height();
        aVLTree0.delete((int) (short) 10);
        int int12 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) 'a');
        org.example.AVLTree aVLTree7 = new org.example.AVLTree();
        org.example.AVLTree.Node node8 = aVLTree7.getRoot();
        org.example.AVLTree.Node node10 = aVLTree7.find((int) '#');
        org.example.AVLTree.Node node11 = aVLTree7.getRoot();
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
        int int37 = aVLTree7.getBalance(node34);
        int int38 = aVLTree0.getBalance(node34);
        org.example.AVLTree.Node node40 = aVLTree0.find((int) (short) 10);
        org.example.AVLTree.Node node42 = aVLTree0.find((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node42);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        java.lang.Class<?> wildcardClass4 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = null;
        int int3 = aVLTree0.getBalance(node2);
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 10);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) -1);
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        int int20 = aVLTree12.height();
        aVLTree12.insert(0);
        org.example.AVLTree.Node node23 = aVLTree12.getRoot();
        int int24 = aVLTree0.getBalance(node23);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = aVLTree8.getRoot();
        org.example.AVLTree.Node node11 = aVLTree8.find((int) '#');
        int int12 = aVLTree8.height();
        org.example.AVLTree.Node node13 = null;
        int int14 = aVLTree8.getBalance(node13);
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        org.example.AVLTree.Node node18 = null;
        int int19 = aVLTree15.getBalance(node18);
        aVLTree15.insert((int) (byte) 0);
        org.example.AVLTree.Node node22 = aVLTree15.getRoot();
        int int23 = aVLTree8.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        aVLTree0.delete((int) '#');
        java.lang.Class<?> wildcardClass27 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.lang.Class<?> wildcardClass49 = node45.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
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
        int int32 = aVLTree24.height();
        aVLTree24.insert(0);
        org.example.AVLTree.Node node35 = aVLTree24.getRoot();
        int int36 = aVLTree12.getBalance(node35);
        int int37 = aVLTree0.getBalance(node35);
        java.lang.Class<?> wildcardClass38 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) 'a');
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        int int10 = aVLTree0.height();
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.find(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node3 = aVLTree0.getRoot();
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.example.AVLTree.Node node19 = aVLTree0.find((int) (byte) -1);
        aVLTree0.delete((int) (short) 10);
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        org.example.AVLTree aVLTree31 = new org.example.AVLTree();
        org.example.AVLTree.Node node32 = null;
        int int33 = aVLTree31.getBalance(node32);
        aVLTree31.delete((int) '4');
        int int36 = aVLTree31.height();
        aVLTree31.insert(100);
        aVLTree31.insert((int) ' ');
        aVLTree31.delete(0);
        org.example.AVLTree aVLTree43 = new org.example.AVLTree();
        org.example.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        aVLTree43.delete((int) '4');
        org.example.AVLTree.Node node48 = aVLTree43.getRoot();
        int int49 = aVLTree43.height();
        org.example.AVLTree.Node node50 = aVLTree43.getRoot();
        aVLTree43.insert((int) (byte) 10);
        aVLTree43.insert((int) (short) 100);
        org.example.AVLTree.Node node56 = aVLTree43.find((int) (short) 100);
        int int57 = aVLTree31.getBalance(node56);
        int int58 = aVLTree0.getBalance(node56);
        org.example.AVLTree.Node node60 = aVLTree0.find((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(node60);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        aVLTree0.delete(1);
        java.lang.Class<?> wildcardClass64 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 1);
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.delete((int) '4');
        org.example.AVLTree.Node node18 = aVLTree13.getRoot();
        int int19 = aVLTree13.height();
        org.example.AVLTree.Node node20 = aVLTree13.getRoot();
        aVLTree13.insert((int) (byte) 1);
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        org.example.AVLTree.Node node26 = null;
        int int27 = aVLTree23.getBalance(node26);
        aVLTree23.insert((int) (byte) 0);
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        int int35 = aVLTree30.height();
        aVLTree30.insert(100);
        aVLTree30.insert((int) ' ');
        aVLTree30.delete(0);
        aVLTree30.insert(1);
        org.example.AVLTree aVLTree44 = new org.example.AVLTree();
        org.example.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        aVLTree44.delete((int) '4');
        aVLTree44.delete((-1));
        aVLTree44.insert((int) 'a');
        aVLTree44.insert((int) (byte) 100);
        int int55 = aVLTree44.height();
        aVLTree44.insert((int) (short) 1);
        org.example.AVLTree.Node node58 = aVLTree44.getRoot();
        int int59 = aVLTree30.getBalance(node58);
        int int60 = aVLTree23.getBalance(node58);
        org.example.AVLTree.Node node61 = aVLTree23.getRoot();
        org.example.AVLTree aVLTree62 = new org.example.AVLTree();
        org.example.AVLTree.Node node63 = null;
        int int64 = aVLTree62.getBalance(node63);
        aVLTree62.delete((int) '4');
        int int67 = aVLTree62.height();
        org.example.AVLTree aVLTree68 = new org.example.AVLTree();
        org.example.AVLTree.Node node69 = null;
        int int70 = aVLTree68.getBalance(node69);
        org.example.AVLTree.Node node71 = null;
        int int72 = aVLTree68.getBalance(node71);
        aVLTree68.insert((int) (byte) 0);
        org.example.AVLTree.Node node75 = aVLTree68.getRoot();
        int int76 = aVLTree62.getBalance(node75);
        int int77 = aVLTree23.getBalance(node75);
        int int78 = aVLTree13.getBalance(node75);
        int int79 = aVLTree0.getBalance(node75);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node4 = aVLTree0.getRoot();
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        org.example.AVLTree aVLTree8 = new org.example.AVLTree();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.delete((int) (short) 100);
        org.example.AVLTree aVLTree13 = new org.example.AVLTree();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.delete((int) '4');
        org.example.AVLTree.Node node18 = aVLTree13.getRoot();
        int int19 = aVLTree13.height();
        org.example.AVLTree.Node node20 = aVLTree13.getRoot();
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
        int int36 = aVLTree13.getBalance(node35);
        int int37 = aVLTree8.getBalance(node35);
        org.example.AVLTree aVLTree38 = new org.example.AVLTree();
        org.example.AVLTree.Node node39 = null;
        int int40 = aVLTree38.getBalance(node39);
        org.example.AVLTree.Node node42 = aVLTree38.find(1);
        aVLTree38.insert((int) (byte) 100);
        aVLTree38.insert((-1));
        org.example.AVLTree aVLTree47 = new org.example.AVLTree();
        org.example.AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        aVLTree47.delete((int) '4');
        org.example.AVLTree aVLTree52 = new org.example.AVLTree();
        org.example.AVLTree.Node node53 = null;
        int int54 = aVLTree52.getBalance(node53);
        aVLTree52.delete((int) '4');
        int int57 = aVLTree52.height();
        org.example.AVLTree aVLTree58 = new org.example.AVLTree();
        org.example.AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        org.example.AVLTree.Node node61 = null;
        int int62 = aVLTree58.getBalance(node61);
        aVLTree58.insert((int) (byte) 0);
        org.example.AVLTree.Node node65 = aVLTree58.getRoot();
        int int66 = aVLTree52.getBalance(node65);
        int int67 = aVLTree47.getBalance(node65);
        int int68 = aVLTree38.getBalance(node65);
        int int69 = aVLTree8.getBalance(node65);
        int int70 = aVLTree8.height();
        int int71 = aVLTree8.height();
        aVLTree8.insert(1);
        org.example.AVLTree aVLTree74 = new org.example.AVLTree();
        org.example.AVLTree.Node node75 = null;
        int int76 = aVLTree74.getBalance(node75);
        aVLTree74.delete((int) '4');
        int int79 = aVLTree74.height();
        org.example.AVLTree.Node node80 = null;
        int int81 = aVLTree74.getBalance(node80);
        int int82 = aVLTree74.height();
        org.example.AVLTree.Node node83 = null;
        int int84 = aVLTree74.getBalance(node83);
        aVLTree74.insert((int) '4');
        int int87 = aVLTree74.height();
        org.example.AVLTree.Node node88 = aVLTree74.getRoot();
        int int89 = aVLTree8.getBalance(node88);
        int int90 = aVLTree0.getBalance(node88);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.example.AVLTree.Node node14 = aVLTree0.getRoot();
        org.example.AVLTree aVLTree15 = new org.example.AVLTree();
        org.example.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        aVLTree15.delete((int) '4');
        int int20 = aVLTree15.height();
        aVLTree15.insert((int) (byte) 1);
        org.example.AVLTree.Node node24 = aVLTree15.find((-1));
        int int25 = aVLTree15.height();
        org.example.AVLTree.Node node27 = aVLTree15.find(0);
        org.example.AVLTree aVLTree28 = new org.example.AVLTree();
        org.example.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.delete((int) '4');
        aVLTree28.delete((-1));
        aVLTree28.insert((int) 'a');
        aVLTree28.insert((int) (byte) 100);
        int int39 = aVLTree28.height();
        org.example.AVLTree aVLTree40 = new org.example.AVLTree();
        org.example.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.delete((int) '4');
        org.example.AVLTree.Node node45 = aVLTree40.getRoot();
        int int46 = aVLTree40.height();
        org.example.AVLTree.Node node47 = aVLTree40.getRoot();
        aVLTree40.delete((int) (byte) 100);
        int int50 = aVLTree40.height();
        int int51 = aVLTree40.height();
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
        int int67 = aVLTree40.getBalance(node66);
        int int68 = aVLTree28.getBalance(node66);
        int int69 = aVLTree15.getBalance(node66);
        org.example.AVLTree aVLTree70 = new org.example.AVLTree();
        org.example.AVLTree.Node node71 = null;
        int int72 = aVLTree70.getBalance(node71);
        aVLTree70.delete((int) '4');
        org.example.AVLTree.Node node75 = aVLTree70.getRoot();
        int int76 = aVLTree70.height();
        org.example.AVLTree.Node node77 = aVLTree70.getRoot();
        aVLTree70.delete((int) (byte) 100);
        int int80 = aVLTree70.height();
        int int81 = aVLTree70.height();
        aVLTree70.insert((int) (byte) 0);
        org.example.AVLTree.Node node84 = aVLTree70.getRoot();
        int int85 = aVLTree15.getBalance(node84);
        org.example.AVLTree.Node node86 = aVLTree15.getRoot();
        int int87 = aVLTree0.getBalance(node86);
        int int88 = aVLTree0.height();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) -1);
        org.example.AVLTree.Node node15 = aVLTree0.find(100);
        org.example.AVLTree.Node node17 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree aVLTree18 = new org.example.AVLTree();
        org.example.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.delete((int) '4');
        int int23 = aVLTree18.height();
        aVLTree18.insert((int) (byte) 1);
        org.example.AVLTree.Node node27 = aVLTree18.find((-1));
        int int28 = aVLTree18.height();
        org.example.AVLTree.Node node29 = aVLTree18.getRoot();
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        int int36 = aVLTree30.height();
        org.example.AVLTree.Node node37 = aVLTree30.getRoot();
        int int38 = aVLTree30.height();
        aVLTree30.insert(0);
        org.example.AVLTree.Node node41 = aVLTree30.getRoot();
        org.example.AVLTree aVLTree42 = new org.example.AVLTree();
        org.example.AVLTree.Node node43 = aVLTree42.getRoot();
        org.example.AVLTree.Node node45 = aVLTree42.find((int) '#');
        org.example.AVLTree.Node node47 = aVLTree42.find((int) (byte) -1);
        org.example.AVLTree.Node node48 = aVLTree42.getRoot();
        org.example.AVLTree.Node node49 = aVLTree42.getRoot();
        org.example.AVLTree aVLTree50 = new org.example.AVLTree();
        org.example.AVLTree.Node node51 = aVLTree50.getRoot();
        org.example.AVLTree.Node node53 = aVLTree50.find((int) '#');
        int int54 = aVLTree50.height();
        org.example.AVLTree.Node node55 = null;
        int int56 = aVLTree50.getBalance(node55);
        org.example.AVLTree aVLTree57 = new org.example.AVLTree();
        org.example.AVLTree.Node node58 = null;
        int int59 = aVLTree57.getBalance(node58);
        org.example.AVLTree.Node node60 = null;
        int int61 = aVLTree57.getBalance(node60);
        aVLTree57.insert((int) (byte) 0);
        org.example.AVLTree.Node node64 = aVLTree57.getRoot();
        int int65 = aVLTree50.getBalance(node64);
        int int66 = aVLTree42.getBalance(node64);
        int int67 = aVLTree30.getBalance(node64);
        int int68 = aVLTree18.getBalance(node64);
        int int69 = aVLTree0.getBalance(node64);
        org.example.AVLTree aVLTree70 = new org.example.AVLTree();
        org.example.AVLTree.Node node71 = aVLTree70.getRoot();
        org.example.AVLTree.Node node73 = aVLTree70.find((int) '#');
        int int74 = aVLTree70.height();
        org.example.AVLTree.Node node75 = null;
        int int76 = aVLTree70.getBalance(node75);
        org.example.AVLTree aVLTree77 = new org.example.AVLTree();
        org.example.AVLTree.Node node78 = null;
        int int79 = aVLTree77.getBalance(node78);
        org.example.AVLTree.Node node80 = null;
        int int81 = aVLTree77.getBalance(node80);
        aVLTree77.insert((int) (byte) 0);
        org.example.AVLTree.Node node84 = aVLTree77.getRoot();
        int int85 = aVLTree70.getBalance(node84);
        aVLTree70.insert((-1));
        aVLTree70.insert((int) '4');
        aVLTree70.insert(100);
        org.example.AVLTree.Node node92 = aVLTree70.getRoot();
        int int93 = aVLTree0.getBalance(node92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) ' ');
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        org.example.AVLTree aVLTree63 = new org.example.AVLTree();
        org.example.AVLTree.Node node65 = aVLTree63.find((int) (short) 0);
        org.example.AVLTree.Node node67 = aVLTree63.find((-1));
        aVLTree63.insert((-1));
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
        int int82 = aVLTree63.getBalance(node81);
        int int83 = aVLTree0.getBalance(node81);
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
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        org.example.AVLTree.Node node29 = aVLTree0.find((int) (byte) 100);
        org.example.AVLTree aVLTree30 = new org.example.AVLTree();
        org.example.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) '4');
        org.example.AVLTree.Node node35 = aVLTree30.getRoot();
        org.example.AVLTree.Node node37 = aVLTree30.find((int) (byte) 0);
        org.example.AVLTree.Node node39 = aVLTree30.find((int) '#');
        int int40 = aVLTree30.height();
        org.example.AVLTree aVLTree41 = new org.example.AVLTree();
        org.example.AVLTree.Node node42 = aVLTree41.getRoot();
        org.example.AVLTree.Node node44 = aVLTree41.find((int) '#');
        int int45 = aVLTree41.height();
        org.example.AVLTree.Node node46 = null;
        int int47 = aVLTree41.getBalance(node46);
        org.example.AVLTree aVLTree48 = new org.example.AVLTree();
        org.example.AVLTree.Node node49 = null;
        int int50 = aVLTree48.getBalance(node49);
        org.example.AVLTree.Node node51 = null;
        int int52 = aVLTree48.getBalance(node51);
        aVLTree48.insert((int) (byte) 0);
        org.example.AVLTree.Node node55 = aVLTree48.getRoot();
        int int56 = aVLTree41.getBalance(node55);
        int int57 = aVLTree30.getBalance(node55);
        org.example.AVLTree.Node node59 = aVLTree30.find((int) (byte) 100);
        aVLTree30.insert((int) (byte) 0);
        aVLTree30.insert((int) (byte) -1);
        org.example.AVLTree.Node node65 = aVLTree30.find((int) (byte) 0);
        org.example.AVLTree.Node node66 = aVLTree30.getRoot();
        org.example.AVLTree.Node node68 = aVLTree30.find((int) ' ');
        org.example.AVLTree.Node node69 = aVLTree30.getRoot();
        int int70 = aVLTree0.getBalance(node69);
        java.lang.Class<?> wildcardClass71 = aVLTree0.getClass();
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
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        aVLTree0.insert((int) (byte) 0);
        aVLTree0.delete((int) ' ');
        java.lang.Class<?> wildcardClass44 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        aVLTree0.insert(0);
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        int int27 = aVLTree0.height();
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        org.example.AVLTree.Node node8 = aVLTree0.find((-1));
        int int9 = aVLTree0.height();
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node3 = aVLTree0.getRoot();
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (short) 10);
        int int8 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        int int13 = aVLTree8.height();
        org.example.AVLTree.Node node14 = null;
        int int15 = aVLTree8.getBalance(node14);
        int int16 = aVLTree8.height();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree8.getBalance(node17);
        org.example.AVLTree aVLTree19 = new org.example.AVLTree();
        org.example.AVLTree.Node node20 = null;
        int int21 = aVLTree19.getBalance(node20);
        aVLTree19.delete((int) '4');
        int int24 = aVLTree19.height();
        aVLTree19.insert(100);
        aVLTree19.insert((int) ' ');
        aVLTree19.delete(0);
        aVLTree19.insert(1);
        org.example.AVLTree aVLTree33 = new org.example.AVLTree();
        org.example.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.delete((int) '4');
        aVLTree33.delete((-1));
        aVLTree33.insert((int) 'a');
        aVLTree33.insert((int) (byte) 100);
        int int44 = aVLTree33.height();
        aVLTree33.insert((int) (short) 1);
        org.example.AVLTree.Node node47 = aVLTree33.getRoot();
        int int48 = aVLTree19.getBalance(node47);
        int int49 = aVLTree8.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.delete((int) (byte) -1);
        org.example.AVLTree aVLTree53 = new org.example.AVLTree();
        org.example.AVLTree.Node node54 = null;
        int int55 = aVLTree53.getBalance(node54);
        aVLTree53.delete((int) '4');
        int int58 = aVLTree53.height();
        aVLTree53.insert(100);
        aVLTree53.insert((int) ' ');
        aVLTree53.delete(0);
        aVLTree53.insert(1);
        int int67 = aVLTree53.height();
        org.example.AVLTree.Node node68 = aVLTree53.getRoot();
        int int69 = aVLTree0.getBalance(node68);
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        org.example.AVLTree.Node node13 = aVLTree0.find(0);
        int int14 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((-1));
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        org.example.AVLTree.Node node11 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert(1);
        aVLTree0.insert((int) '4');
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        org.example.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree aVLTree11 = new org.example.AVLTree();
        org.example.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        aVLTree11.delete((int) '4');
        org.example.AVLTree.Node node16 = aVLTree11.getRoot();
        org.example.AVLTree.Node node17 = null;
        int int18 = aVLTree11.getBalance(node17);
        org.example.AVLTree.Node node19 = aVLTree11.getRoot();
        org.example.AVLTree.Node node20 = aVLTree11.getRoot();
        int int21 = aVLTree11.height();
        int int22 = aVLTree11.height();
        org.example.AVLTree aVLTree23 = new org.example.AVLTree();
        org.example.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        org.example.AVLTree.Node node27 = aVLTree23.find(1);
        org.example.AVLTree.Node node29 = aVLTree23.find(10);
        int int30 = aVLTree23.height();
        aVLTree23.insert((int) (byte) 1);
        org.example.AVLTree.Node node33 = aVLTree23.getRoot();
        int int34 = aVLTree11.getBalance(node33);
        int int35 = aVLTree0.getBalance(node33);
        int int36 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        org.example.AVLTree.Node node29 = aVLTree0.find((int) (byte) 100);
        aVLTree0.insert((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        org.example.AVLTree.Node node35 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node36 = aVLTree0.getRoot();
        org.example.AVLTree.Node node38 = aVLTree0.find((int) ' ');
        aVLTree0.insert(2);
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
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (byte) -1);
        int int10 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert(10);
        aVLTree0.insert((int) (short) -1);
        org.example.AVLTree.Node node13 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass14 = node13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

