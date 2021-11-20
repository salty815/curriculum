package study;

public class MaxNumberIteration {
    public static void main(String[] args) {
        //  Question 整数Aが書かれたカードを持っています。
        //  　　　　　1~Aの中で2で割れる回数が、一番多い数値を出力しなさい。
        //  　　　　　例）A=12
        //           A/2 =6, 6/2=3, 二回
        int A=68;
        int maxDividedNumber = 1; // 2で割り切れた回数が最も多い数値
        int maxDividedCount = 0; // 2で割り切れた回数が最も多い数値
        for(int dividedNumber = 2; dividedNumber <= A; dividedNumber++) { //1~A
            int testNumber = dividedNumber;
            int divedCount = 0;
            while(testNumber != 1 && testNumber%2 == 0) { // 2で割り切れるかどうか検証
                divedCount++;
                testNumber = testNumber /2;
            }
            if(maxDividedCount < divedCount) { // 2で割り切れた回数の比較
                maxDividedNumber = dividedNumber;
                maxDividedCount = divedCount;
            }
        }
        System.out.println(maxDividedNumber + "が" + maxDividedCount + "回でもっとも2で割り切れる");
    }
}