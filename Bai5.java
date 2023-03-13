package Lab2;

import java.util.Scanner;

public class bai5 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int tong=0;
		while(tong<100) {
		System.out.println("moi ban nhap vao mot so nguyen:  ");
		int sn=sc.nextInt();
		tong+=sn;
		}
		System.out.println(" tong cac so ban vua nhap la: "+tong);
	}
}