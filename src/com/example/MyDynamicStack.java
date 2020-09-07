package com.example;

import java.util.*;

public class MyDynamicStack extends MyStack{
    ArrayList<Integer> s = new ArrayList<>();

    @Override
    void push(int item) {
        s.add(item);
    }

    @Override
    int pop() {
        if(s.size()==0){
            System.out.println("Stack UnderFlow");
            return 0;
        }
        else{
            int lastElement=s.size()-1;
            return s.remove(lastElement);
        }
    }

    @Override
    void display() {
        System.out.print("Current Stack is : ");
        for(int i=0;i<s.size();i++){
            System.out.print(s.get(i) + " ");
        }
    }
}
