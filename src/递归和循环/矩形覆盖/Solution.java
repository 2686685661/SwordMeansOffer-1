package 递归和循环.矩形覆盖;

public class Solution {
	
	
	/**
	 * 链接：https://www.nowcoder.com/questionTerminal/72a5a919508a4251859fb2cfb987a0e6
来源：牛客网

依旧是斐波那契数列
2*n的大矩形，和n个2*1的小矩形
其中target*2为大矩阵的大小
有以下几种情形：
1⃣️target <= 0 大矩形为<= 2*0,直接return 1；
2⃣️target = 1大矩形为2*1，只有一种摆放方法，return1；
3⃣️target = 2 大矩形为2*2，有两种摆放方法，return2；
4⃣️target = n 分为两步考虑：
        第一次摆放一块 2*1 的小矩阵，则摆放方法总共为f(target - 1)
        第一次摆放一块1*2的小矩阵，则摆放方法总共为f(target-2)
		因为，摆放了一块1*2的小矩阵（用√√表示），对应下方的1*2（用××表示）摆放方法就确定了，所以为f(targte-2)
	 * @param target
	 * @return
	 */
    public int RectCover(int target) {
    	if(target <= 2) {
    		return target;
    	}
    	
    	return RectCover(target - 1) + RectCover(target - 2);
    }
}
