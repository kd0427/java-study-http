package studyDay2;

import java.util.ArrayList;
import java.util.List;

public class Ch09 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("한양아이클래스");
        arr.add("김도윤");
        arr.add("서채영");
        arr.stream().map(str->"LOVE").forEach(a-> System.out.println(a));
    }
}
