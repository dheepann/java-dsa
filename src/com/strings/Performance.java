package com.strings;
//important concept

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i); //new string object is created everytime and so much memory wasted ie., a, ab,abc,abcd,etc will have no ref variable and wastage of space
            // this has a time complexity of O(N^2). to solve these problems we have StringBuilder where we can directly insert into string w/o craeting new object everytime like in arrays

//            System.out.println(ch); //prints a to z

            series = series + ch; // a, ab, abc, abcd and so on..
        }
        System.out.println(series);
    }
}
