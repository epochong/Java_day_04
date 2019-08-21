package www.practice.four;
/*
      3.按如下要求编写Java程序：
        （1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。
        （2）定义接口B，里面包含抽象方法void setColor(String c)。
        （3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。
        （4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
        圆柱体的高height、颜色color。
        （5）创建主类来测试类Cylinder。
*/
interface A {
    double pai = 3.14;
    double area();
}
interface B {
    void setColor(String c);
}
interface C extends A, B {
    void volume();
}
class Cylinder implements  C {
    double radius;
    double height;
    String color;

    public void setRadius(double radius) {
        this.radius = radius;

    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return pai * radius * radius * 2 + 2 * pai * radius * height;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public void volume() {
        return ;
    }
}
public class PracticeThree {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5.0);
        cylinder.setHeight(6.6);
        System.out.println(cylinder.area());
    }
}
