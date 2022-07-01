package ru.vsu.cs.vvp2021.g82.mitrofanov_m_d.Nask9v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int findMax(List<Integer> list){
        int max = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

    /**




     */

    public static int findMin(List<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int j = 0; j < list.size(); j++){
            if(list.get(j) < min){
                min = list.get(j);
            }
        }
        return min;
    }

    /**




     */

    public static int firstIndexOf(List<Integer> list, int value){
        int firstIndex = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == value){
                firstIndex = i;
                break;
            }
        }
        return firstIndex;
    }


    /**


    */

    public static int lastIndexOf(List<Integer> list, int value){
        int lastIndex = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == value){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    /**


     */

    public static void process3(List<Integer> list){
        int firstMax = firstIndexOf(list, findMax(list));
        int lastMin = lastIndexOf(list, findMin(list));
        int j = 1;
        for(int i = firstMax + 1; i < (lastMin - firstMax) / 2 + firstMax + 1; i++){
            int tmp = list.get(i);
            list.set(i, list.get(lastMin - j ));
            list.set(lastMin - j , tmp);
            j+=1;
        }
    }

    



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 54,1, 32, 13, 45, 12, 53, 1, 54, 14);
        System.out.println(list);
        process3(list);
        System.out.println(list);


    }
}
