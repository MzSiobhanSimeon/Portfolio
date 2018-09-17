/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals;

/**
 *
 * @author ASUS
 */
public class Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Age, boy, girl;
       Age = 20;
       boy = 18;
       girl = 16;
       
        if (Age == 18 && boy != 25 && girl == 16) {
            System.out.println("Sorry, you are not qualified");
        } else if (Age != 20 || boy == 15 || girl == 30) {
             System.out.println("Yes, you are qualified");
        }
        else {
        System.out.println("Congrats, you are now qualified");
    }
        
        String fruit;
        fruit = "banana";
         switch (fruit){
             case "bag": System.out.println("you are not edible");
             break;
             case "shoe": System.out.println("you are not edible enough");
             break;
             case "banana": System.out.println("you are edible");
         }
    }
    
}
