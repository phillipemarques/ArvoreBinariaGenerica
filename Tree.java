/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinariagenerica;

/**
 *
 * @author Phillipe
 */
public class Tree<T>{
    private final TreeNode<T> root;
   
    public Tree(T object){
        root = new TreeNode(object);
    }    
   
    public TreeNode getRoot(){
        return root;
    }
    
    /**
     * it inserts a value into the tree
     * @param r
     * @param item
     * @return 
     */
    public TreeNode<T> insertValue(TreeNode<T> r, T item){
        if(r == null){
            r = new TreeNode(item,null,null);
        }else{
            if(item.toString().compareTo(r.nodeValue.toString()) > 0){
                r.rightNode = insertValue(r.getRightNode(),item);
            }else{
                r.leftNode = insertValue(r.getLeftNode(),item);
            }            
        }
        return r;
    }
    
    /**
     * print the tree (pre order - "lexicographic order" in this case)
     * @param r 
     */
    public void printInOrder(TreeNode<T> r){
        if(r != null){
            if(r.leftNode != null)
                printInOrder(r.leftNode);        
            
            System.out.println(r.nodeValue.toString());
            
            if(r.rightNode != null)
                printInOrder(r.rightNode);            
        }
    }
}
