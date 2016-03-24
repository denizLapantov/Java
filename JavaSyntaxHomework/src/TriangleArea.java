import java.util.Scanner;

/**
 * Created by deniz on 21.3.2016 г..
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int aX = console.nextInt();
        int aY = console.nextInt();
        int bX = console.nextInt();
        int bY = console.nextInt();
        int zX = console.nextInt();
        int zY = console.nextInt();

        //area	=Ax(By−Cy)+Bx(Cy−Ay)+Cx(Ay−By)2
        int result = (aX * (bY - zY) + bX*(zY - aY) + zX*(aY-bY))/2;
        System.out.println(Math.abs(result));
    }
}
