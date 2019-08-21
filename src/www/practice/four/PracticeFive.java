package www.practice.four;

public class PracticeFive {
    public static void main(String[] args) {
        for(int i = 1;i < 1000; i++) {
            if(isWanShu(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean isWanShu(int num) {
        int result = 0;
        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                result += i;
            }
        }
        return result == num;
    }
}
