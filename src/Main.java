//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       RepeatLimitedString  repeatLimitedString = new RepeatLimitedString();
       //example 1:
       String s1 = "cczazcc";
       int repeatLimit1 = 3;
       //example 2:
        String s2 = "aababab";
        int repeatLimit2 = 2;

        System.out.println(repeatLimitedString.repeatLimitedString(s1,repeatLimit1));
        System.out.println(repeatLimitedString.repeatLimitedString(s2,repeatLimit2));
    }
}