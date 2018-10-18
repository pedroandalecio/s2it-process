package br.com.s2it.process;

import org.junit.Assert;
import org.junit.Test;

import br.com.s2it.process.Algebra;
import br.com.s2it.process.BinaryTree;

public class Questao_9 {

    @Test(expected = NullPointerException.class)
    public void binaryTreeNullMustReturnNullPointerException() {

        // Init
        BinaryTree binaryTree = null;

        // Act
        Algebra algebra = new Algebra(binaryTree);

    }


    @Test
    public void sumOfARootMustReturnCorrectValue() {

        // Init
        int expected = 2;
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setValor(expected);

        // Act
        Algebra algebra = new Algebra(binaryTree);

        // Check
        Assert.assertEquals(expected, algebra.sum());

    }


    @Test
    public void sumBalancedBinaryTreeMustReturnCorrectValue() {

        //Init
        int expected = 6;
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setValor(2);

        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.setValor(2);

        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.setValor(2);

        binaryTree.setLeft(binaryTree1);
        binaryTree.setRight(binaryTree2);

        // Act
        Algebra algebra = new Algebra(binaryTree);

        // Check
        Assert.assertEquals(expected, algebra.sum());

    }


    @Test
    public void sumUnBalancedBinaryTreeMustReturnCorrectValue() {

        //Init
        int expected = 34;
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setValor(15);

        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.setValor(18);

        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.setValor(1);

        binaryTree.setLeft(binaryTree1);

        binaryTree1.setLeft(binaryTree2);

        // Act
        Algebra algebra = new Algebra(binaryTree);

        // Check
        Assert.assertEquals(expected, algebra.sum());

    }


}
