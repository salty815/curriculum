package check;

import constants.Constants;

public class Check {
    /*
     * 課題① 【Check.java】にてフィールド変数firstNameとlastNameを宣言し、 firstName → 自分の名字 lastName →
     * 自分の名前で初期化しなさい。 なお、変数のアクセス修飾子は「private」とする。
     */
    private String firstName = "七海";
    private String lastName = "真弥";

    /*
     * 課題② 【Check.java】にてfirstNameとlastNameを引数で受け取って、
     * 連結して表示させるメソッド「printName」を作成しなさい。 作成した関数のアクセス修飾子は「private」とする。
     */
    private void printName(String firstName, String lastName) {
        System.out.println(firstName + lastName);
    }

    public static void main(String[] args) {
        Check check = new Check();
        check.printName("printNameメソッド → " + check.firstName, check.lastName);

        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        pet.introduce();

        RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        robotPet.introduce();   
    }
}