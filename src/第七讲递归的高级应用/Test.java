package 第七讲递归的高级应用;

import java.util.Scanner;



public class Test {
		
	

	public static void main(String[] args) {
		HanoiTower.doTower(8, 'A','B','C');
		System.out.println("-----------");
		System.out.println("请输入i和j的值查看总执行次数");
		
		System.out.println("请输入i的值:");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println("请输入j的值:");
		Scanner scanner1 = new Scanner(System.in);
		int j = scanner.nextInt();
		System.out.print("结果为：");
		System.out.println(i+j-1);
		
	}

}
