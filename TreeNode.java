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
public class TreeNode<T>{
    T nodeValue;
    TreeNode<T> leftNode;
    TreeNode<T> rightNode;
    
    TreeNode(T object){
        this(object, null,null);
    }
    
    TreeNode(T object, TreeNode<T> left, TreeNode<T> right){
        nodeValue = object;
        leftNode = left;
        rightNode = right;
    }
    
    T getNodeValue(){
        return nodeValue;
    }
    
    TreeNode<T> getLeftNode(){
        return leftNode;
    }
    
    TreeNode<T> getRightNode(){
        return rightNode;
    }
}
