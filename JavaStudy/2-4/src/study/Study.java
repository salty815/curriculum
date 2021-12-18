package study;

//①FruitsConstants.javaをインポートしなさい。
import constants.FruitsConstants;
//②Fruits.javaをインポートしなさい。
import fruits.Fruits;

/**
 * 本課題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
 *
 * 問①〜問③まであります。
 * 全て回答し、課題にある画像と同じ表示になるようにしてください。
 *
 */
public class Study {

    public static void main(String[] args) {

        /* ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
         *     また、課題の画像と同じ表示になるように
         *     printFruitsの引数にはFruitsConstantsに指定されている定数を設定してください。
         */
//    	解1: インスタンスを新たに生成して呼び出す
//    	Fruits fruits = new Fruits();
//    	FruitsConstants fruitsConstants = new FruitsConstants();
//    	fruits.printFruits(fruitsConstants.FRUITS_LEMON_04, fruitsConstants.FRUITS_COUNT_20);
    	
//    	解2: 静的メソッドをそのまま呼び出す
    	Fruits.printFruits(FruitsConstants.FRUITS_LEMON_04, FruitsConstants.FRUITS_COUNT_20);

    }
}