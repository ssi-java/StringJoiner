package stringjoinerexamples;

import java.util.StringJoiner;

public class StringJoinerExamples {

    public static void main(String[] args) {

        System.out.println("Checking one arg constructor==>>");
        StringJoiner sj1=new StringJoiner("-");
        sj1.add("java");
        sj1.add("oracle");
        sj1.add("php");
        System.out.println(sj1);
        System.out.println("Checking three arg constructor==>>");
        StringJoiner sj2=new StringJoiner("-","[","]");
        sj2.add("java");
        sj2.add("oracle");
        sj2.add("php");
        System.out.println(sj2);
    }
    
}
