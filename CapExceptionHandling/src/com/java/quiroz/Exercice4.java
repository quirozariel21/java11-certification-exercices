package com.java.quiroz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;











public class Exercice4 {

    public void a() throws Exception {
        throw new NullPointerException("");
    }

    public static void main(String... args) {

        MyGenericClass gc = new MyGenericClass();
        System.out.println(gc.transform(1)); //1
        System.out.println(gc.transform("hello")); //2
        MyGenericClass<String> gcStr = new MyGenericClass<String>();
        System.out.println(gcStr.transform(1.1)); //3


        Comparator<Integer> cin = (i1, i2) -> i1 - i2;

        try {
            new Exercice4().a();

        } catch (RuntimeException r){

        }catch (Exception e) {
            throw new RuntimeException(e);
        }


        B b = new B();
        b.m();
    }
}


class A {
    public static void m() {
        System.out.println("==>> PARENT");
    }
}

class B extends A {

    public static void m() {
 //       super.m();

        System.out.println("==>> CHILD");
    }
}

class MyGenericClass<T>{
    public <T> String transform(T t){
        return t.toString()+"-"+t.hashCode();
    }
}