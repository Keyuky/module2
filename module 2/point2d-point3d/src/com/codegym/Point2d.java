package com.codegym;

public class Point2d {
    float x = 0.0f       ;
    float y = 0.0f;

    public Point2d(){
    }
    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] arr = {x, y};
        return arr;
    }
    @Override
    public String toString() {
        return "Point2d{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
