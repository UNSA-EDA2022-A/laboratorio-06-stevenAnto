package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
      if(a.root==null)return false;
      return isBi(a.root);
    }
    public <E extends Comparable<E>> boolean isBi(Node<E> n){
      boolean verificador=true;
      if((n.left==null&&n.right==null)||(n.left!=null&&n.right!=null)){
	if(n.left!=null){
	  verificador = isBi(n.left);
	}
	if(n.right!=null){
	  verificador = isBi(n.right);
	}
      }
      else{
	return false;
      }
      return verificador;
    }
}
