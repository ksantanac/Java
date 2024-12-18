package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1); // int -> Integer
        conjunto.add('x');
        
        System.out.println(conjunto.size());

        // Remover
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.size());
        
        // Contains
        System.out.println(conjunto.contains('x'));

        Set nums = new HashSet();
        
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        System.out.println(nums);
        System.out.println(conjunto);

        // União entre 2 conjuntos
        conjunto.addAll(nums);
        System.out.println(conjunto);

        // Interceção
        conjunto.retainAll(nums);
        System.out.println(conjunto);
        
        conjunto.clear();
        System.out.println(conjunto);
    }
}