package com.example;

public class MyStaticStack extends MyStack{
    private int s[ ];
    private int pos;

    MyStaticStack(int size)
    {
        s=new int[size];
        pos=-1;
    }

    @Override
    void push(int item) {
        if(pos==s.length-1)
        {
            System.out.println("Stack Overflows");
            int t[ ]=new int[s.length * 2];
            for(int i=0;i<s.length;i++)
                t[i]=s[i];
            s=t;
            s[++pos]=item;
        }
        else
            s[++pos]=item;
    }

    @Override
    int pop() {
        if(pos<0)
        {
            System.out.println("Stack Underflows");
            return 0;
        }
        else
            return s[pos--];
    }

    @Override
    void display() {
        System.out.print("Current Stack is : ");
        for(int i=0;i<s.length;i++){
         System.out.print(s[i] + " ");
        }
    }


}
