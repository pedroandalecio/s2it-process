package br.com.s2it.process;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BinaryTree {

    private int valor;

    private BinaryTree left;

    private BinaryTree right;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
    
    

}
