package method;

public class getScore {
    public static char getScore (int score){
        char result = '0';
        if (score>=90){
            return  'a';
        }else if (score>=80){
            return  'b';
        }else if (score>=70){
            return 'c';
        }else
            return 'd';
    }

    public static void main(String[] args) {
        System.out.println(getScore(20));
    }
}
