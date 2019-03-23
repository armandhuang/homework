package com.box;

public class Box {
    float length;
    float width;
    float height;

    public Box(float length , float width , float height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, float height) {
        if(this.length >= length && this.width >= width && this.height >= height){
            return true;
        }else{
            return false;
        }
    }
}
