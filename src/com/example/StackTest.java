package com.example;

import java.util.*;

public class StackTest {
    void menu(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Stack Implementation");
            System.out.println("1. Static Stack");
            System.out.println("2. Dynamic Stack");
            System.out.println("3. End ");
            System.out.println("\n Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> myStaticStack();
                case 2 -> myDynamicStack();
                case 3 -> System.out.println("Thanks for working !! ");
                default -> System.out.println("Please enter the correct choice ");
            }
        }while(choice==3);

    }

    void myStaticStack(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array you want to create : ");
        int length =sc.nextInt();
        MyStaticStack myStack =new MyStaticStack(length);
        int choice;
        do{
            System.out.println("Static Stack");
            System.out.println("1. Push to stack");
            System.out.println("2. Pop from stack");
            System.out.println("3. Display Stack ");
            System.out.println("4. End ");
            System.out.println("\n Enter your choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1: {
                    System.out.println("Enter the number to be pushed into the stack : ");
                    int num = sc.nextInt();
                    myStack.push(num);
                    break;
                }
                case 2: System.out.println("Element poped out is : " + myStack.pop());
                        break;
                case 3: myStack.display();
                        break;
                case 4: break;
                default: System.out.println("Please enter the correct choice ");
            }

        }while(choice==4);

    }

    void myDynamicStack(){
        Scanner sc = new Scanner(System.in);
        MyDynamicStack myStack =new MyDynamicStack();
        int choice;
        do{
            System.out.println("Dynamic Stack");
            System.out.println("1. Push to stack");
            System.out.println("2. Pop from stack");
            System.out.println("3. Display Stack ");
            System.out.println("4. End ");
            System.out.println("\n Enter your choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1: {
                    System.out.println("Enter the number to be pushed into the stack : ");
                    int num = sc.nextInt();
                    myStack.push(num);
                    break;
                }
                case 2: System.out.println("Element poped out is : " + myStack.pop());
                        break;
                case 3: myStack.display();
                        break;
                case 4: break;
                default: System.out.println("Please enter the correct choice ");
            }

        }while(choice==4);
    }
}
