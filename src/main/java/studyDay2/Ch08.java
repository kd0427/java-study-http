package studyDay2;

/*
    Ch08 람다와 스트림
 */
public class Ch08 {
    public static void main(String[] args) {
        Operator operator = Integer::sum;
        System.out.println("커밋");
    }
}

interface Operator {
    int apply(int a, int b);
}
