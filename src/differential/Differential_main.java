package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of a> ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input value of h> ");
		double h = Double.parseDouble(scan.next());
		
		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ����鐔�l������"+dlib.getDx());
		System.out.println("�����W���Ɛ��l�����̑��Ό덷��"+(100 * Math.abs(dlib.getRx()-dlib.getDx())) / dlib.getRx());
	}
// 8.274037099909037E-6 6.07747097092215E-7 5.054390328496083E-6
//    0.000000001          0.00000001         0.0000001
}