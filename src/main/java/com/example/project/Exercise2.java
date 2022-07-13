package com.example.project;

public class Exercise2 {

  public static void main(String[] args) {
    Exercise2 obj = new Exercise2();

    BST<Integer> tree1 = new BST<Integer>();
    BST<Integer> tree2 = new BST<Integer>();

    Integer array [] = {1, 2,3, 4, 5};

    for(Integer value : array){
      tree1.insert(value);
      tree2.insert(value);
    }

    System.out.println("probamos");
    System.out.print(obj.bstIguales(tree1, tree2));

  }


  public <T extends Comparable<T>> boolean bstIguales(BST<T> a1, BST<T> a2){
    if(a1.root == null && a2.root ==null)return true;
    
    return isIgual(a1.root,a2.root);
  }
  public <E extends Comparable<E>> boolean isIgual(Node<E> n1,Node<E> n2){
    boolean verificador = true;
    if(n1.left!=null&&n2.left!=null){
      if(n1.data.compareTo(n2.data)!=0)return false;
      verificador =isIgual(n1.left,n2.left);

    }else if(n1.left==null&&n2.left==null){
      if(n1.data.compareTo(n2.data)!=0)return false;
      if(n1.right!=null&&n2.right!=null){
      verificador = isIgual(n1.right,n2.right);
      }
    }else{
      return false;
    }
    return verificador;
  }
}
