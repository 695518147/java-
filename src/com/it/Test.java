package com.it;

import java.util.*;

public class Test {


    public static void main(String[] args) {

        Student student = new Student("zpy1", "zhangpeiyu1");
        Student student1 = new Student("zpy2", "zhangpeiyu2");
        Student student2 = new Student("zpy0", "zhangpeiyu0");

        List<Student> list = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        list.add(student);
        list.add(student1);
        list.add(student2);

        Student student4 = new Student("zpy4","zhangpeiyu4");
        Student student5 = new Student("zpy5","zhangpeiyu5");

        list2.add(student4);
        list2.add(student5);

        Collections.copy(list,list2);

        System.out.println(list);
    }
}
