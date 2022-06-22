package com.nazeem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Customer customer1 = new Customer("Noman", 45);
        Customer customer2 = new Customer("Noman", 45);

        //System.out.println(customer1);
        System.out.println(customer1.hashCode());

        //System.out.println(customer2);
        System.out.println(customer2.hashCode());

        //---- equals ----//
        //System.out.println(customer1 == customer2);
        System.out.println(customer1.equals(customer2));

        String str1 = "Java Apple";
        String str2 = "Java Apple";
        //System.out.println("String equals="+ (str1==str2));
        //System.out.println("String equals2="+(str1.equals(str2)));
        //System.out.println("hashcode->"+str1.hashCode()+", "+str2.hashCode());
        //System.out.println(customer1);


        //------ has code ------//
        Set<Customer> customerSet = new HashSet<>();
        customerSet.add(customer1);
        customerSet.add(customer2);

        for(Customer customer: customerSet){
            System.out.println(customer);
        }

        //System.out.println(customer1.toString());

        //System.out.println(customer1 == customer2);

    }
}
