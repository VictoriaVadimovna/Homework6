package com.alevel.homework06;

public class Main {
    public static void main(String[] args) {
        Phone iphone1 = new Phone();
        iphone1.model = "12 Pro Max";
        iphone1.number = 8501834l;
        iphone1.weight = 135;
        iphone1.introduce();

        Phone iphone2 = new Phone();
        iphone2.model = "11";
        iphone2.number = 539093l;
        iphone2.weight = 184;
        iphone2.introduce();

        Phone iphone3 = new Phone();
        iphone3.model = "7 plus";
        iphone3.number = 1553l;
        iphone3.weight = 188;
        iphone3.introduce();

        //г)
        iphone1.receiveCall("Masha");
        iphone1.getNumber();
        iphone2.receiveCall("Valera");
        iphone2.getNumber();
        iphone3.receiveCall("anonymous number");
        iphone3.getNumber();

        //д)
Phone notIphone1 = new Phone(859486l, "Xiaomi Mi 6");
Phone notIphone2 = new Phone(469846l, "Samsung 10 S");
    }
}
