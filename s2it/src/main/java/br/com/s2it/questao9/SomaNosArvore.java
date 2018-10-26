package br.com.s2it.questao9;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomaNosArvore {

	private static Logger logger = LoggerFactory.getLogger(SomaNosArvore.class);
	private BinaryTree binaryTree;

    public SomaNosArvore(BinaryTree binaryTree) {
        Objects.requireNonNull(binaryTree, "A árvore binária não pode ser nula");
        this.binaryTree = binaryTree;
    }

    public int soma() {
        return soma(binaryTree);
    }

    private int soma(BinaryTree binaryTree) {
    	logger.debug("soma");
        if (binaryTree == null) {
            return 0;
        }
        logger.debug("soma - valor:{}", binaryTree.getValor());
        return binaryTree.getValor() + soma(binaryTree.getLeft()) + soma(binaryTree.getRight());
    }
	
}
