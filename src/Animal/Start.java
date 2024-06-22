package Animal;

import java.util.*;

public class Start {



    public static void main(String[] args) {
//        Start start = new Start();
//        start.run();
        int []a = {1,3,6,4,1,2};
        int []b={1, 2, 3};
        int []c={-1, -3};
        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));

    }

    private void run() {
        Animal animal1= new Animal() {
            @Override
            public void speek(char c) {
                System.out.println(" !"+c);
            }
        };
        Animal []animal= {new Dog(), new Cat(),animal1};
        for (Animal a : animal) {
            a.say("sound");
        }
    }


    //////Task Ваше завдання знайти перший елемент масиву, який не є послідовним.Якщо весь масив є послідовним, повертається null2.
    static Integer find(final int[] array) {
        // Перевіряємо, чи поточний елемент не є наступним за попереднім на одиницю
        for(int i=1;i<array.length;i++){
            if (array[i] !=array[i-1]+1){
                return array[i];
            }
        }
        return null;
    }

    /////Task Повернути число у від'ємному значені, якщо воно додатнє
    public static int makeNegative(final int x){
//        if (x<=0) {
//            return x;
//        }else {
//            return -x;
//        }
        return x<=0?x:-x;
    }

    ///Task Вам буде надано масив a і значення x.  потрібно  перевірити, чи наданий масив містить значення.
    public static boolean check(Object[] a, Object x){
        for (int i=0;i<a.length;i++){
            if (a[i]==x){
                return true;
            }
        }
        return false;
//        return Arrays.asList(a).contains(x);
//        return Arrays.stream(a)
//                .anyMatch(i -> x.equals(i));
    }

    //Task Страва повинна починатися і закінчуватися тими ж буквами, що і назва тварини.
    // Напишіть функцію feast, яка приймає назву тварини та блюдо як аргументи та повертає true або false, щоб вказати,
    // чи дозволено звірові приносити страву на бенкет.
    public static boolean feast(String beast, String dish){
        char firstLaterBeast = beast.charAt(0);
        char lastLaterBeast= beast.charAt(beast.length()-1);
        char firstLateDish= dish.charAt(0);
        char lastLaterDish=dish.charAt(dish.length()-1);
        if (firstLaterBeast==firstLateDish && lastLaterBeast==lastLaterDish){
            return true;
        }else {
            return false;
        }
        // return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);

    }
///////Task. Потрібно перевернути строку
//    public static String solution(String str){
//        return new StringBuilder(str).reverse().toString();
//    }
/////Task Вивести слова з масиву реченням
    public static String smash(String... words){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i < words.length - 1){
                result.append(" ");
            }
        }
        return result.toString();
    }

////////Task Порахувати суму чисел в масиві
    public static double sum(double[] numbers){
        if (numbers==null){
            return 0;
        }
        double sum=0;
        for (int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }
    /////Вивести скільки разів повторювалась буква в строці
    public static int duplicateCount(String text){
        HashMap<Character,Integer>  charCountMap=new HashMap<>();
        int duplicateCount = 0;
        text=text.toLowerCase();
        // Підраховуємо кількість кожного символу
        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        // Підраховуємо символи з дублікатами
        for (int count: charCountMap.values()){
            if (count>1){
                duplicateCount++;
            }
        }
        return duplicateCount;
    }


    //////Task.Знайти в строці найменше та найбільше числа
    public static String highAndLow(String numbers){
        // Розділити рядок на окремі числа
        String []num=numbers.split(" ");
        // Ініціалізувати максимальне і мінімальне значення
        long max= Long.MAX_VALUE;
        long min=Long.MIN_VALUE;
        for (String nums: num){
            long a= Long.parseLong(nums);
            max=Math.max(max, a);
            min=Math.min(min,a);
        }
        return max+" "+min;

    }
    ///Task/якщо задано число (ціле / десяткове / обидва залежно від мови), знайти його протилежність (адитивне зворотне).
    public static int opposite(int number){
        return -number;
    }

    ////Task. Повернути суму всіх одатніх чисел з масиву
    public static int sum(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                sum+=arr[i];
            }
        }
        return sum;
    }



    ///Taks.Напишіть функцію, яка приймає ціле число n і рядок s як параметри та повертає рядок s, повторений рівно n разів.
    public static String repeatStr(final int repeat, final String string){
        return string.repeat(repeat);
    }

    ///Task. Знайти суму чисел в квадраті з масиву
    public static int squareSum(int[] n){
        int sum=0;
        for (int i: n){
            sum+=i*i;
        }
        return sum;
    }

    ///Task.Визначити чи в речені є всі букви алфавіту
    public boolean check(String sentence){
        // Створення масиву для позначення того, чи зустрічена кожна літера алфавіту
        boolean[] alphabet=new boolean[26];
        sentence = sentence.toLowerCase();
        // Перебір усіх символів рядка
        for (char c: sentence.toCharArray()){
            // Ігнорувати символи, які не є літерами
            if (Character.isLetter(c)){
                // Позначення літери алфавіту як використаної
                alphabet[c-'a']=true;
            }
        }
        // Перевірка, чи зустрілися всі літери алфавіту хоча б один раз
        for (boolean letter: alphabet){
            if (!letter){
                return false;
            }
        }
        return true;
        ////return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;


//        return sentence.chars()
//                .filter(Character::isLetter)
//                .map(Character::toLowerCase)
//                .distinct()
//                .count() == 26;
    }

    public static int solution(int[] A) {
        Set<Integer> numbers = new HashSet<>();
        for (int i: A){
            if (i>0){
                numbers.add(i);
            }
        }
        int smallestPositiveNum =1;
        while (numbers.contains(smallestPositiveNum)){
            smallestPositiveNum++;
        }
        return smallestPositiveNum;
    }


    Map<Long, Long> count(Map<String, UserStats>... visits) {
        Map<Long, Long> userVisitsCount = new HashMap<>();
        if (visits == null){
            return userVisitsCount;
        }
        for (Map<String, UserStats> visitMap:visits){
            if (visitMap!=null){
                for (Map.Entry<String, UserStats> entry:visitMap.entrySet()){
                    String userId = entry.getKey();
                    UserStats userStats=entry.getValue();
                    if (userStats!=null&& isParseable(userId)){
                        Optional<Long> visitCount = userStats.getVisitCount();
                        visitCount.ifPresent(count -> userVisitsCount.merge(parseUserId(userId), count, Long::sum));
                    }
                }
            }
        }
        return userVisitsCount;
    }

    private boolean isParseable(String userId) {
        try {
            Long.parseLong(userId);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    private Long parseUserId(String userId) {
        try {
            return Long.parseLong(userId);
        }catch (NumberFormatException e){
            return null;
        }
    }


}


