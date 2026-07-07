package com.map;

import java.util.Hashtable;

/**
 * @author lanyangyang
 */
@SuppressWarnings({"all"})
public class HashTableExercise {
    static void main(String[] args) {

        Hashtable table = new Hashtable();

        table.put("jone",100);
        //table.put("jone",null);NullPointerException
        //table.put(null,100);NullPointerException
        table.put("lyy",10);
        table.put("lyy",20);
        System.out.println(table);

    }
}
