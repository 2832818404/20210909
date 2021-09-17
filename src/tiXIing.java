import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * @author hongxiaozheng
 * @date 2021/9/9 15:44
 */
public class tiXIing {
    public static void main(String[] args) {

        System.out.println("请输入上底a");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("请输入下底b");
        Scanner scanner2 = new Scanner(System.in);
        double b = scanner.nextDouble();
        System.out.println("请输入高h");
        Scanner scanner3 = new Scanner(System.in);
        double h = scanner.nextDouble();
        System.out.println("(" + a + "+" + b + ")" + "*" + h + "/" + "2" + "=" + (a+b)*h/2);
        System.out.println("答：改梯形的面积为" + (a+b)*h/2);
    }
}
