package com.java.quiroz.annotation;

import java.lang.annotation.Documented;

enum Color {GREY, BROWN}
@Documented public @interface Dirt {
    boolean wet();
    String type = "test";
    public Color color();
    //private static final int slippery = 5; //Modifier private is not allowed
}
