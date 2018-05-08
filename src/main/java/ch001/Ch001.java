package ch001;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 问题描述: 一个存有10000个数的list对list中的每一个数+1.如何实现
 */
public class Ch001 {

    public static final int SIZE = 10;

    public static void main(String[] args) {

        Ch001 ch001 = new Ch001();

        ch001.implIfLinkedList();

        ch001.implIfArrayList();

    }


    public void implIfArrayList() {

        List<Integer> list = new ArrayList(SIZE);


        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }

        for (Integer i: list) {
            System.out.println(""+i);
        }

        System.out.println("---------");

        for (ListIterator<Integer> li = list.listIterator();li.hasNext();){
            int old = li.next();
            li.remove();
            li.add(old+1);
        }

        for (Integer i: list) {
            System.out.println(""+i);
        }
    }

    public void implIfLinkedList(){

        List<Integer> list = new LinkedList();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }

        for (Integer i: list) {
            System.out.println(""+i);
        }

        System.out.println("---------");

        for (ListIterator<Integer> li = list.listIterator();li.hasNext();){
            int old = li.next();
            li.remove();
            li.add(old+1);
        }

        for (Integer i: list) {
            System.out.println(""+i);
        }
    }


}
