package 第七讲递归的高级应用;

import java.util.Iterator;

public class HanoiTower {
	/**
	 * 移动盘子
	 * topN:移动的盘子数
	 * from:起始塔座
	 * inter:中间塔座
	 * to:目标塔座
	 */
	public static int i = 1;
	public static int j = 2;
	public static void doTower(int topN, char from, char inter , char to) {
		
		if(topN == 1) {
			System.out.println("盘子1,从"+ from + "塔座到" + to + "塔座"+" "+"i:"+i++);
		}else {
			doTower(topN-1, from, to , inter);
			System.out.println("盘子"+topN+"从"+from+"塔座到" + to + "塔座"+" "+"j:"+j++);
			doTower(topN-1, inter, from, to);
			
		}
//		System.out.println("i+j-1=执行的总次数");
		
	}
	
}
