package LBWNB;

import java.util.ArrayList;
import java.util.Collections;

public class Dou {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String colors[] = {"♥","♠","♦","♣" };
        String numbers[] ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (String color : colors){
            for (String num :numbers){
                arrayList.add(color+num);
            }
        }
        arrayList.add("小王");
        arrayList.add("大王");
        Collections.shuffle(arrayList);//洗牌
    }
}
