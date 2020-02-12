package com.ziac.myapplication;

public class Drinks1 {

    private String name1;
    private String desc1;
    private int imageID1;

    public static final Drinks1[] drinks1={


            new Drinks1("Karnataka","This is Description for Karnataka",R.drawable.k),
            new Drinks1("Andhra","This is a Description for andhra",R.drawable.andhra),
            new Drinks1("Tamilnadu","This is a Desription for tamilnadu",R.drawable.t)
    };

    public Drinks1(String name1, String desc1, int imageID1) {
        this.name1 = name1;
        this.desc1 = desc1;
        this.imageID1 = imageID1;
    }

    public String getName1() {
        return name1;
    }

    public String getDesc1() {
        return desc1;
    }

    public int getImageID1() {
        return imageID1;
    }
    public String toString(){
        return this.name1;
    }
}
