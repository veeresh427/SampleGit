package com.ziac.myapplication;

public class Drinks {

    private String name;
    private String desc;
    private int imageID;


    public static final Drinks[] drinks={


            new Drinks("Latte","This is Description for Latte",R.drawable.latte),
            new Drinks("Green Tea","This is a Description for Green Tea",R.drawable.green),
            new Drinks("Coffee","This is a Desription for Coffee",R.drawable.coffee)
    };


    public Drinks(String name, String desc, int imageID) {
        this.name = name;
        this.desc = desc;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImageID() {
        return imageID;
    }
    public String toString(){
        return this.name;
    }
}
