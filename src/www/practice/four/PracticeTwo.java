package www.practice.four;

interface  Compute {
    int computer(int n, int m);
}
class AddImpl implements Compute {
    public int computer(int n, int m) {
        return n + m;
    }
}
class SubImpl implements Compute {
    public int computer(int n, int m) {
        return n - m;
    }
}
class MulImpl implements Compute {
    public int computer(int n, int m) {
        return n * m;
    }
}
/*class AddException extends RuntimException {
    public AddException() {
        super("除数不能为零!");
    }
}*/
class DivImpl implements Compute {
    public int computer(int n, int m) {
        if(m == 0) {
            //throw new AddException();
            return 0;
        }else {
            return n / m;
        }
    }
}
class UseCom {
    public void useCom(Compute com, int one, int two) {
        System.out.println(com.computer(one,two));
    }
}
/**
 *
 * 2.编程题:
 * 利用接口做参数，写个计算器，能完成加减乘除运算。
 * （1）定义一个接口Compute含有一个方法int computer(int n, int m)。
 * （2）设计四个类分别实现此接口，完成加减乘除运算。
 * （3）设计一个类UseCompute，
 * 类中含有方法：public void useCom(Compute com, int one, int two)，
 * 此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
 * （4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。
 */
public class PracticeTwo {
    public static void main(String[] args) {
        AddImpl add = new AddImpl();
        SubImpl sub = new SubImpl();
        MulImpl mul = new MulImpl();
        DivImpl div = new DivImpl();
        UseCom  usecom = new UseCom();
        usecom.useCom(add,5,6);
        usecom.useCom(sub,7,8);
        usecom.useCom(mul,9,10);
        usecom.useCom(div,10,5);

    }

}

