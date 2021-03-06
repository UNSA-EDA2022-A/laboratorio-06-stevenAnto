package com.example.project;

public class Exercise2 {

  public static void main(String[] args) {
    Exercise2 obj = new Exercise2();

    BST<Integer> tree1 = new BST<Integer>();
    BST<Integer> tree2 = new BST<Integer>();

    Integer array [] = { 10, 12, 3, 6, 15, 14, 9, 1};

    for(Integer value :array ){
     	tree1.insert(value);
        if(value < 12){
          tree2.insert(value);
        } 
    }
    System.out.println(tree1.preOrder());
    System.out.println(tree2.preOrder());

    System.out.println("probamos");
    System.out.print(obj.bstIguales(tree1, tree2));

  }


  public <T extends Comparable<T>> boolean bstIguales(BST<T> a1, BST<T> a2){
    if(a1.root == null && a2.root ==null)return true;
    return isIgual(a1.root,a2.root);
  }
  public <E extends Comparable<E>> boolean isIgual(Node<E> n1,Node<E> n2){
    boolean verificador=true;
    System.out.println("entroNodes "+n1.data+","+n2.data);
    //if(n1==null&&n2==null);
    //if((n1==null&&n2!=null)||(n1!=null&&n2==null))return false;
    if(n1.data.compareTo(n2.data)==0){
      System.out.println("entro1.2");
      if(n1.left!=null&&n2.left!=null){
	System.out.println("entro 1.2.1");
	verificador= isIgual(n1.left,n2.left);
      }
      if((n1.left==null&&n2.left!=null)||(n1.left!=null&&n2.left==null)){
	verificador = false;
      }
      if(n1.right!=null&&n2.right!=null){
	System.out.println("entro 1.2.3");
	verificador= isIgual(n1.right,n2.right);
      }
      if((n1.right==null&&n2.right!=null)||(n1.right!=null&&n2.right==null)){
	verificador = false;
      }
    }
    else{
      return false;
    } 
    return verificador;
  }
}
/*boolean verificador = true;
  if(n1.left!=null&&n2.left!=null){
  if(n1.data.compareTo(n2.data)!=0)return false;
  verificador =isIgual(n1.left,n2.left);

  }else if(n1.left==null&&n2.left==null){
  if(n1.data.compareTo(n2.data)!=0)return false;
  if(n1.right!=null&&n2.right!=null){
  verificador = isIgual(n1.right,n2.right);
  }
  }else{
  verificador = false;
  }
  return verificador;*/
