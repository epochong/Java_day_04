package www.ishappy.java;

public class IsHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(20));
        System.out.println(isHappy(21));
    }
    public static boolean isHappy(int n) {
        int temp = n;
        while(true) {
            temp = getNext(temp);
            if(temp == 1) {
                return true;
            }else if(temp == 89) {//过程中有89即为非快乐数
                return false;
            }
        }
    }
    //返回下一个数
    public static int getNext(int n) {
        int result = 0;
        while(n > 0) {
            result += (n % 10) * (n % 10);
            n = n / 10;
        }
        return result;
    }
}
