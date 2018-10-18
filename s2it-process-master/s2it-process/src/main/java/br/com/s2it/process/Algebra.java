package br.com.s2it.process;

import java.util.Objects;

public class Algebra {

    private BinaryTree binaryTree;

    public Algebra(BinaryTree binaryTree) {
        Objects.requireNonNull(binaryTree, "Não pode ser nula");
        this.binaryTree = binaryTree;
    }

    public int sum() {
        return sum(binaryTree);
    }

    private int sum(BinaryTree binaryTree) {

        if (binaryTree == null) {
            return 0;
        }

        return binaryTree.getValor() + sum(binaryTree.getLeft()) + sum(binaryTree.getRight());
    }
}
