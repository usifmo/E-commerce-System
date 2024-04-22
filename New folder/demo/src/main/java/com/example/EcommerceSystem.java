package com.example;

import java.util.Scanner;

public class EcommerceSystem {
    
    public static void main(String[] args) { 
        Cart cart = new Cart();
        ElectronicProduct EP = new ElectronicProduct(1, "smartphone", 599.99f, "Samsung", 1);
        Clothingproduct CP = new Clothingproduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
        Bookproduct BP = new Bookproduct(3, "OOP", 39.99f, "O'Reilly", "X Publications");
        Customer customer = new Customer();
        
        Scanner input = new Scanner(System.in);
       
        
        System.out.println("Welcome to the E-Commerce System!");
        customer = SetCustomer(customer);
        cart = setCart(cart,customer);
        
        int c;
        for (int i = 0; i < cart.getnProducts(); i++) {
            System.out.println("Which product would you like to add ?"
                    + " 1- " + EP.getName() + " 2- " + CP.getName() + " 3- " + BP.getName());
            while (true) {                
                try {
                    c = input.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("invaild input");
                }
            }
            switch(c){
                case 1:
                    cart.addProduct(EP);
                    break;
                
                case 2:
                    cart.addProduct(CP);
                    break;
                
                case 3:
                    cart.addProduct(BP);
                    break;
                
                default:
                    System.out.println("invaild input");
                    break;
            }
        }
        System.out.println("Your total is $" + cart.calculatePrice() + 
                ". Would you like to place the order? 1- Yes 2- No");
        while (true) {            
            try {
                c = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("invaild input");
            }
        }
        switch(c){
            case 1:
                Order order = cart.placeOrder();
                order.printOrderInfo();
            case 2:
                System.out.println("\nThanks");;
                break;
                     
        }
        
        
        
        
    }
  
    static Customer SetCustomer(Customer customer){
        while (true) {            
             try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter your ID");
                customer.setId(input.nextInt());
                System.out.println("Please enter your Name");
                customer.setName(input.next());
                System.out.println("Please enter you Address");
                customer.setAddress(input.next());
            break;
            } catch (Exception e) {
                System.out.println("invaild input");
            }
        }
        return customer;
    }
    
    static Cart setCart(Cart cart,Customer customer){
        Scanner input = new Scanner(System.in);
        cart.setCustomerId(customer.getId());
        while (true) {            
            try {
                System.out.println("How many prodects you want to add to your cart?");
                cart.setnProducts(input.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("invaild input");
            }
        }
        return cart;
    }
    
}
