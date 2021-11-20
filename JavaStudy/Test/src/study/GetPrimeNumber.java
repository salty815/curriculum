package study;

public class GetPrimeNumber {
    public static int array[] = {3,7,45,1,6,75,85,24,11,87};
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        //      Question 素数を抽出するプログラムを作成しましょう。パラメータはint型の配列で入力されます。
        //      要素数は10。
        for(int arrayIndex = 0; arrayIndex<array.length; arrayIndex++) {
            boolean primeFlag = true;
            if(array[arrayIndex] <= 1) { // 配列内数字が1以下なら素数でない
                primeFlag = false;
            } 
            for(int testNumber = 2; testNumber < array[arrayIndex]; testNumber++) { //配列内数字を2から順に割り切れるか検証する 
                if(array[arrayIndex] % testNumber == 0) { //割り切れるなら素数ではない
                    primeFlag = false;
                    break;
                }
            }
            if(primeFlag == true) {
                System.out.println(array[arrayIndex]+"は素数です");
            } else {
                System.out.println(array[arrayIndex]+"は素数ではない");
            }
        }
    }
}