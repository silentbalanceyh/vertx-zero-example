package io.zerows.ch01;

import org.jooq.meta.jdbc.JDBCDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lang : 2024-01-02
 */
public class ArraySize {

    public static void main(String[] args){
        final List<String> data = new ArrayList<>();
        data.add("A");
        data.add("B");
        // 迭代1
        for(int idx = 0; idx < data.size(); idx++ ){
            final String name = "Name " + idx;
            System.out.println(name);
        }
        // 迭代2
        final int size = data.size();
        for(int idx = 0; idx < size; idx++ ){
            final String name = "Name " + idx;
            System.out.println(name);
        }
    }
}
