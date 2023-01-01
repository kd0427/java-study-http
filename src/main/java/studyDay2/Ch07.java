package studyDay2;

import java.util.Set;
import java.util.TreeSet;

/*
    Ch07 - 예외처리

 */
public class Ch07 {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }

        Set<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(1);

        for(Integer i : set){
            System.out.println(i);
        }

    }
}
