package Lambda.task1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Number {
    public static double initBoundaries(){
        Locale locale = new Locale.Builder().setLanguageTag("en").build();
        Scanner sc = new Scanner(System.in);
        sc.useLocale(locale);
        String str = sc.nextLine();
        if (str.indexOf(',')>=0 || str.indexOf('.')>=0){
            str = StringToNumber.doubleDlInvalid(str);
            return Double.parseDouble(str);
        }else {
            str =StringToNumber.intDlInvalid(str);
            return Integer.parseInt(str);
        }
    }
    public static <T extends Number> boolean isEqualsTypes(final T MIN, final T MAX){
        if (!MIN.getClass().getSimpleName().toString().equals(MAX.getClass().getSimpleName().toString())) {
            try{
                throw new Exception("Don`t equals");
            }catch (Exception e){
                System.out.println(e.getMessage());
                return false;
            }
        }
        return true;
    }

    public static <T extends Number> boolean isCorrectOrder(final T MIN, final T MAX){
        boolean correctOrder;
        if (MIN.toString().indexOf(',')>=0||MIN.toString().indexOf('.')>=0){
            correctOrder=Double.parseDouble(MIN.toString())<Double.parseDouble(MAX.toString());
        }else {
            correctOrder=Integer.parseInt(MIN.toString())<Integer.parseInt(MAX.toString());
        }
        if (!correctOrder) {
            try {
                throw new Exception("MAX<MIN");
            }catch (Exception e){
                System.out.println(e.getMessage());
                return false;
            }
        }
        return correctOrder;
    }
//
//    public static <T extends Number> Double valueRandom(T a, T b){
//        return Math.random()*(b.doublevalue()-a.doublevalue())+a.doublevalue();
//    }
//
//    public static <T extends Number> ArrayList generationArray(final T MIN, final T MAX, int n){
//        ArrayList list = new ArrayList();
//        if (MIN instanceof Double){
//            for (int i = 0; i < n; i++){
//                list.add(valueRandom(MIN,MAX));
//            }
//        }else if (MIN instanceof Integer){
//            for (int i = 0; i < n; i++){
//                list.add(valueRandom(MIN,MAX).intValue());
//            }
//        }
//        return list;
//    }

}
