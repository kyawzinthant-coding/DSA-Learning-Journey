package Hashing;

import java.util.HashMap;

public class Counting {
    public static void main(String[] args) {
        String[] names = {"alice", "brad", "collin", "brad", "dylan", "kim"};
        HashMap<String , Integer> hashMap = new HashMap<>();


        for ( String name : names) {
            hashMap.put(name,  hashMap.getOrDefault( name , 0 ) +1);
        }

        System.out.println(hashMap);


    }
}
