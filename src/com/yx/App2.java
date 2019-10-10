package com.yx;

/**
 * @author :yanxin
 * @date :Created in 2019/10/9 18:52
 * @description:
 * @version:
 */
public class App2 {

    public static void main(String[] args) {
        /**
         * 题
         4=1+3
         4=2+2
         4=1+1+2
         4=1+1+1+1
         * 思路:													 c
         * 第一条这个比较简单一点，也就是在原基础上减去了将之变为f=(f-1)+1
         * 第二条f=2+的原基础不变。我才开始用的是for加if，
         * 但是使用后发现有局限性，随之改为for循环通过修改for循环条件，达到期望要求(f=(f-2)+2)。
         *
         * 			  c(注意此时的2也就是c，是因为外层循环的c--)
         * 第三条则为f=2+ 1+ 1 (此时的+1，是因为条件满足此时i为2。内层二循环时输出1，因为i此时为3)
         * 			c(此时的1也就是c)
         * 第四条为f=1+ 1+ 1+ 1 (根据i的值进行判断，满足为1+ ，不满足为1)
         * 其中第1,3,4为一个循环,第二条单独为一个循环
         */
        Integer f=4;
        int c = f - (f-1);
        while (c<f){
            int i = c;
            System.out.print(f + " = " + c + " + ");
            do {
                    if (i == (f - (f-c))) {
                        System.out.print(f-1);
                    }else{
                        System.out.print("1+ ");
                    }
                    i--;
            } while (i > (f-(f-1)));
            System.out.println();
            c++;
        }
        c = 2;
        while (c <= f / 2){
            System.out.print(f + " = " + c + " + ");
            int n = 0;
            for (int i = c; i < f; i++) {
                n += 1;
            }
            System.out.println(n);
            c++;
        }
    }
}