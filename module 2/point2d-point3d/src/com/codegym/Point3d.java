package com.codegym;

public class Point3d extends Point2d {
    float z = 0.0f;

    public Point3d() {
    }
    public Point3d(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ() {
        float[] arr1 = {x ,y ,z};
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
