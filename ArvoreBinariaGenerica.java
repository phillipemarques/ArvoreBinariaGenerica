/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinariagenerica;

import java.util.Date;

/**
 *
 * @author Phillipe
 */
public class ArvoreBinariaGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree minhaArvoreBinaria = new Tree(0);
        TreeNode root = minhaArvoreBinaria.getRoot();
       
        minhaArvoreBinaria.insertValue(root, 2);
        minhaArvoreBinaria.insertValue(root, 2.45);
        minhaArvoreBinaria.insertValue(root, 4);
        minhaArvoreBinaria.insertValue(root, 6);
        minhaArvoreBinaria.insertValue(root, "Minas Gerais");
        minhaArvoreBinaria.insertValue(root, 1);
        minhaArvoreBinaria.insertValue(root, Integer.MAX_VALUE);
        minhaArvoreBinaria.insertValue(root, Float.MAX_VALUE);
        minhaArvoreBinaria.insertValue(root, Double.MIN_VALUE);
        minhaArvoreBinaria.insertValue(root, "Acre");
        minhaArvoreBinaria.insertValue(root, new Date());
        minhaArvoreBinaria.insertValue(root, "São Paulo");
        minhaArvoreBinaria.insertValue(root, -2);
        minhaArvoreBinaria.insertValue(root, -2.78978);
        minhaArvoreBinaria.insertValue(root, "Rio Grande do Sul");
        minhaArvoreBinaria.insertValue(root, "Amapá");
        
        minhaArvoreBinaria.printInOrder(root);
    }
    
}
