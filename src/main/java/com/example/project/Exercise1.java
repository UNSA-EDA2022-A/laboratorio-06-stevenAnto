package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {};

        for(Integer value : array){
	  System.out.println("ingre");
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){
      if((a1.root==null&&a2.root==null))return true;
      return isSame(a1.root,a2.root);
    }
    public<E extends Comparable<E>> boolean isSame(Node<E> n1,Node<E> n2){
      boolean verificador=true;
      if((n1==null&&n2==null)||(n1!=null&&n2!=null)){
	if(n1.left!=null&&n2.left!=null){
	  verificador = isSame(n1.left,n2.left);
	}
	else if(n1.right!=null&&n2.right!=null){
	  verificador = isSame(n1.right,n2.right);
	}
      }
      else{
	verificador =false;
      }
      return verificador;

    }
}
