package HomeWork1.oneDimensionalArray;

import java.util.Arrays;
import java.util.Random;

public class Start {
    public static void main(String[] args) {
        Start start = new Start();
        start.run();
    }
    public void run() {

        int [] a = {1,3,2,5,4,6,7,8,9};
        System.out.println(Arrays.toString(task15(a)));

    }
    /**Знаходження максимального числа та кількість повторювань макс числа**/
    public int maxNum(int[] a) {
        int max=a[0];
        for (int i : a) {
            if (i>max) max=i;
        }
        int count=0;
        for (int i : a) {
            if (i==max) count++;
        }
        return count;
    }

    /**Выяснить сколько из значений массива превышает число z.**/
    public int seachValueZ(int[] a, int z) {

        int count=0;
        for (int i : a) {
            if (i>z)count++;
        }
        return count;
    }

    /**Найти максимальную сумму двух соседних чисел в массиве.**/
    public int maxSum(int[] a) {
        int sumMax=Integer.MIN_VALUE;
        for (int i=0;i<a.length-1;i++) {
            int sum=a[i]+a[i+1];
            if (sum>sumMax){
                sumMax=sum;
            }
        }
        return sumMax;
    }

    /**Найти количество значений массива, которые меньше своего левого
     соседа.**/
    public int searchValue(int[] a) {

        int count=0;
        for (int i : a) {
            if(i<i-1) count++;
        }
        return count;
    }


    /**Проверить образует ли массив возрастающую или убывающую
     последовательность.**/
    public String decreasingIncreasing(int[] a) {
        boolean isIncreasing=true;
        boolean isDecreasing=true;
        for (int i=1; i<a.length;i++){
            if (a[i]<a[i-1]){
               isIncreasing=false;
               break;
            }else if(a[i]>a[i+1]){
                isDecreasing=false;
                break;
            }
        }
        if (isIncreasing){
            return "Increasing";
        }else {
            return "Decreasing";
        }
    }
    /**
     * Инициализировать массивы a, b, c из n чисел случайными
     * значениями. Понимая, что a[i], b[i], c[i] обозначают длины
     * ребер кирпичей, определить кирпич с максимальным объемом.
     **/
    public void maxArray(int[] a, int[] b, int []c, int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(n)+1;
            b[i] = random.nextInt(n)+1;
            c[i] = random.nextInt(n)+1;
        }
        int max=Integer.MIN_VALUE;
        int maxBrickIndex=-1;
        for (int i=0;i<n;i++){
            int volume=a[i]*b[i]*c[i];
            if(volume>max){
                max=volume;
                maxBrickIndex=i;
            }
        }
        System.out.println(a[maxBrickIndex]);
        System.out.println(b[maxBrickIndex]);
        System.out.println(c[maxBrickIndex]);
        System.out.println(max);
    }

    /**Инициализировать массивы a, b из n чисел случайными
     значениями. Понимая, что a[i], b[i] обозначают длины сторон
     прямоугольников. Определить прямоугольник с минимальной
     площадью**/
    public int[] area(int[] a, int[] b, int n) {
        Random random = new Random();
        int minArea = Integer.MAX_VALUE;
        int[]minRentagle= new int[3];
        for(int i=0;i<n;i++){
            a[i]=random.nextInt(n)+1;
            b[i]=random.nextInt(n)+1;
            int area=a[i]*b[i];
            if(area<minArea){
                minArea=area;
                minRentagle[0]=a[i];
                minRentagle[1]=b[i];
                minRentagle[2]=area;
            }
        }
        return minRentagle;
    }

    /**Найти среднее арифметическое значение массива и вернуть в
     качестве возвращаемого значения количество элементов,
     превышающих среднее арифметическое.**/
    public int avg(int[] a) {
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        double avg= (double) sum /a.length;
        for(int i=0;i<a.length;i++){
            if (avg<a[i]){
                count++;
            }
        }
        return count;

    }

    public int catet(int [] a, int[]b, int n){
        Random random = new Random();
        for (int i=0;i<n;i++){
            a[i]=random.nextInt(n)+1;
            b[i]=random.nextInt(n)+1;
        }
        double maxHypotenuse = Double.MIN_VALUE;
        int maxTriangleIndex=-1;
        for (int i=0;i<n;i++){
            double hypotenuse= Math.sqrt(a[i]*a[i]+b[i]*b[i]);
            if (hypotenuse>maxHypotenuse){
                maxHypotenuse=hypotenuse;
                maxTriangleIndex=i;
            }
        }
        return maxTriangleIndex;
    }


    public int divValue(int[] a){

        int maxNum = a[0];
        int minNum = a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]>maxNum){
                maxNum=a[i];
            }
            if (a[i]<minNum) {
                minNum=a[i];
            }
        }
        return maxNum-minNum;
    }


    public double avgValue(int[] a){

        int maxNum = a[0];
        int minNum = a[0];

        // Знаходимо найбільше і найменше значення в масиві
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxNum) {
                maxNum = a[i];
            }
            if (a[i] < minNum) {
                minNum = a[i];
            }
        }

        // Обчислюємо середнє арифметичне між найбільшим і найменшим значеннями
        double avg = (double) (maxNum + minNum) / 2;
        return avg;

    }




    public int eventNum(int[] a){
        int event=1;
        for (int i=0;i<a.length;i++){
            if (a[i]%3==0&&a[i]%2!= 0){
                event*=a[i];
            }
        }
        return event;
    }

    /**Визначити в ньому суму елементів, що стоять на позиціях, чий номер більший за записане в них значення.**/
    public int sumElementIndex(int[] a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            if (a[i]<i){
                sum+=a[i];
            }
        }
        return sum;
    }

    /**Визначити у ньому добуток непарних значень елементів.**/
    public int notEvent(int []a){
        int num=1;
        for (int i=0;i<a.length;i++){
            if (a[i]%2 !=0){
                num*=a[i];
            }
        }
        return num;
    }

    /**Визначити в ньому кількість елементів, квадрат яких більший за введений a.**/
    public int sqd(int[] a){
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]*a[i]>a.length){
                count++;
            }
        }
        return count;
    }

    /**Визначити добуток елементів, які при розподілі на 2 дають такий же залишок, як і при розподілі на 3.**/
    public int event(int []a){
        int mult=1;
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0 && a[i]%3==0){
                mult*=a[i];
            }
        }
        return mult;
    }

    /**Определить в нем среднее геометрическое четных элементов.**/
    public double avgGeometric(int[]a){
        int count=0;
        double mult=1;
        for (int i : a) {
            if (i%2==0){
                mult*=i;
                count++;
            }
        }
        if (count==0){
            return 0;
        }
        return Math.pow(mult,1.0/count);
    }
    /**Определить в нем количество тех элементов, которые при делении на 3 дают остаток 2.**/
    public int task(int []a){
        int count=0;
        for (int i : a) {
            if (i%3==2){
                count++;
            }
        }
        return count;
    }

    /**Определить в нем среднее геометрическое тех элементов, которые при делении на 4 дают остаток 1 или 3.**/
    public double task2(int []a){
        int count=0;
        double product=1;
        for (int num : a) {
            if (num % 4 == 1 || num % 4 == 3) {
                product *= num;
                count++;
            }
        }
        if (count==0){
            return 0;
        }
        return Math.pow(product,1.0/count);

    }

    /**Определить количество тех элементов, которые без остатка делятся на собственный номер (индекс + 1).**/
    public int task3(int[] a){
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%(i+1)==0){
                count++;
            }
        }
        return count;
    }


    /**Определить количество тех элементов, стоящих на четных позициях, которые сами четны.**/
    public int task4(int[]a){
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0 && i%2==0){
                count++;
            }
        }
        return count;
    }

    public double task5(int[] a){
        int sum=0;
        int count=0;
        for (int i=0;i<a.length;i++){
            if (i%4==2){
                sum+=a[i]*a[i];
                count++;
            }
        }
        return (double)sum/count;
    }
    /**Определить с помощью метода в нем количество элементов кратных четырем.**/
    public int taks6(int[] a){
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%4==0){
                count++;
            }
        }
        return count;
    }

    /**Определить в нем произведение элементов, значения которых лежат вне диапазона [a; b].**/
    public int task7(int[] arr, int a, int b){
        int product=1;
        for (int i : arr) {
            if (i<a||i>b){
                product*=i;
            }

        }
        return product;
    }
    /**Определить в нем сумму остатков от деления на 4 тех элементов, которые не кратны 3.**/
    public int task8(int[] a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%3!=0){
                sum+=a[i]%4;
            }
        }
        return sum;
    }
    /**Определить в нем среднее геометрическое элементов, стоящих на четных позициях.**/
    public double task9(int[] a){
        double product=1.0;
        int count=0;
        for (int i=0;i<a.length;i+=2){
            product*=a[i];
            count++;
        }
        return Math.pow(product,1.0/count);
    }

    /**Определить среднее арифметическое элементов, стоящих на позициях кратных трем.**/
    public double task10(int[] a){
        double sum=0;
        int count=0;
        for (int i=0;i<a.length;i++){
            if (i%3==0){
                sum+=a[i];
                count++;
            }
        }
        return Math.pow(sum,1.0/count);
    }

    public int[] task11(int[] a){
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0){
                a[i]/=2;
            }
        }
        return a;
    }

    public int[] task12(int[] a){
        for (int i=0;i<a.length;i++){
            if (a[i]%4==2){
                a[i]++;
            }
        }
        return a;
    }

    /**Каждый элемент, чей модуль больше 7 обнулить.**/
    public void task13(int[] a){
        System.out.println(Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            if (Math.abs(a[i])>7){
                a[i]=0;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    /**Каждый четный элемент, в том случае, если он отрицателен, возвести в куб.**/
    public int[] task14(int[] a){
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0 && a[i]<0){
                a[i]=a[i]*a[i]*a[i];
            }
        }
        return a;
    }

    /**Каждый элемент с индексом кратным 3, в массиве заменить остатком от деления этого элемента на 5.**/
    public int[] task15(int[] a){
        for (int i=0;i<a.length;i++){
            if(i%3==0){
                a[i]%=5;
            }
        }
        return a;
    }
    /**Каждый элемент в массиве больший 5 умножить на результат целочисленного деления этого элемента на 5.**/
    public double[] task16(double[] a){
        for (int i=0;i<a.length;i++){
            if (a[i]>5){
                a[i]*=  a[i] /5;
            }
        }
        return a;
    }

    /**Каждый элемент в массиве чье значение лежит вне диапазона [−2; 6] увеличить на 12.**/
    public int []task17(int[] a){
        for (int i=0;i<a.length;i++){
            if (a[i]<-2 && a[i]>6){
                a[i]+=12;
            }
        }
        return a;
    }

    /**Каждый второй элемент в массиве, чье значение лежит в диапазоне [−3; 5] заменить 0.**/
    public int[] task18(int[] a){
        for (int i=1;i<a.length;i+=2){
            if (a[i]<=-3 && a[i]>=5){
                a[i]=0;
            }
        }
        return a;
    }

    /**Элементы массива, которые при делении нацело на собственный номер (индекс + 1) дают нечетное значение увеличить на 2.**/
    public int[] task19(int[] a){
        for (int i=0;i<a.length;i++){
            if (a[i]%(i+1)!=0){
                a[i]+=2;
            }
        }
        return a;
    }

    /**Найти произведение первых двух положительных элементов массива (предполагается, что они всегда существуют).
     *  Произведением заменить все нечетные элементы.**/
    public int[] task20(int[] a){
        int firstIndex=-1;
        int secondIndex=-1;

        for (int i=0;i<a.length;i++){
            if (a[i]>0){
                if (firstIndex==-1){
                    firstIndex=i;
                }else if (secondIndex==-1){
                    secondIndex=i;
                    break;
                }

            }
        }
        int product=a[firstIndex]*a[secondIndex];
        for (int i=0;i<a.length;i++){
            if (a[i]%2!=0){
                a[i]=product;
            }
        }
        return a;
    }
    /**Найти наименьший элемент массива среди тех, которые находятся на четных позициях.
     * На полученное значение уменьшить элементы с четными индексами массива.**/
    public int[] task21(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min && i % 2 == 0) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i += 2) {
            a[i] -= min;
        }
        return a;
    }


    /**Найти среднее арифметическое Sr максимума и минимума массива. Далее возвести в куб все элементы меньшие чем Sr.**/
    public double[] task22(double[] a){
        double min=Integer.MAX_VALUE;
        double max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            min=Math.min(a[i],min);
            max=Math.max(a[i],max);
        }
        double mean = (max+min)/2;
        for (int i=0;i<a.length;i++){
            if (a[i]<mean){
                a[i]=a[i]*a[i];
            }
        }
        return a;
    }

    /**Найти произведение элементов массива, принадлежащих интервалу [min/2, max/2].
     *  Значением этого произведения заменить второй и последний элементы массива.**/
    public int[] task23(int[] a){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            min=Math.min(a[i],min);
            max=Math.max(a[i],max);
        }
        int product=1;

        for (int i=0;i<a.length;i++){
            if (a[i]>=min/2 && a[i]<=max/2) {
                product*=a[i];
            }
        }

        a[1]=a[a.length-1]=product;

        return a;
    }

    /**Найти индекс первого положительного элемента массва. Все отрицательные элементы,
     *  следующие за первым положительным увеличить на модуль суммы отрицательных всего массива.**/
    public void task24(int[] a){
        int firstIndex=-1;
        int negativeSum=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>0 && firstIndex==-1){
                firstIndex=i;
            }
            if (a[i]<0 && firstIndex!=-1){
                negativeSum+=Math.abs(a[i]);
            }
        }
        if (firstIndex==-1){
            return;
        }
        for (int i=firstIndex+1;i<a.length;i++){
            if (a[i]<0){
                a[i]+=negativeSum;
            }
        }

    }
    /**Определить k – количество нечетных элементов массива в нем содержащихся.
     *  Далее максимальный элемент массива умножить на k и снова вывести.**/
    public int  task25(int[] a){
        int max = Integer.MIN_VALUE;
        int count=0;
        int product=1;
        for (int i=0;i<a.length;i++){
            if (a[i]%2!=0){
                count++;
            }
        }

        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];

            }
        }
        return max*count;
    }

    /**Определить максимальный или минимальный элемент в массиве встречается раньше.
     *  Если максимальный, то заменить минимумом второй элемент массива, если встречается раньше минимальный,
     *  то заменить максимумом предпоследний элемент массива.**/
    public int[] task26(int[] a){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        int minIndex=-1;
        for (int i=0;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
                minIndex=i;
            }
            if (a[i]>max){
                max=a[i];
                maxIndex=i;
            }
        }
        if (maxIndex<minIndex) {
            a[1]=min;
        }else {
            a[a.length-2]=max;
        }
        return a;
    }
    /**Определить упорядочены ли элементы массива по возрастанию. Если не упорядочены,
     *  то поменять в массиве второй и последний элементы массива, иначе эти элементы возвести в куб.**/
    public int[] task27(int[] a){
        boolean ordered = true;
        for (int i=0;i<a.length-1;i++){
            if (a[i+1]<a[i]){
                ordered=false;
                break;
            }
        }
        if (!ordered){
            int temp=a[a.length-1];
            a[a.length-1]=a[1];
            a[1]=temp;
        }else {
            a[a.length-1]=a[a.length-1]*a[a.length-1]*a[a.length-1];
            a[1]=a[1]*a[1]*a[1];
        }
        return a;
    }


    /**Определить упорядочены ли элементы массива по возрастанию. Если не упорядочены,
     *  то определить индекс первого элемента, нарушающего порядок,
     *  сам этот элемент увеличить на 2, иначе поменять местами максимум и минимум в массиве.**/
    public int[] task28(int[] a){
        boolean ordered = true;
        int minIndex=0;
        int maxIndex=0;
        int min=a[0];
        int max=a[0];
        for (int i=0;i<a.length-1;i++){
            if (a[i+1]<a[i]){
                ordered=false;
                minIndex=i;
                break;
            }
        }
       if (!ordered){
           a[minIndex]+=2;
       }else {
           for (int i=1;i<a.length;i++){
               if (a[i]<min){
                   min=a[i];
                   minIndex=i;
               }
               if (a[i]>max){
                   max=a[i];
                   maxIndex=i;
               }
           }
       }
       int temp=a[maxIndex];
       a[maxIndex]=a[minIndex];
       a[minIndex]=temp;
       return a;
    }



    /**Найти индекс FirstEvenIndex – первого четного значения элемента в массиве.
     *  Преобразовать последние FirstEvenIndex элементов массива путем их умножения на значение первого нечетного.**/
    public int[] task29(int[] a){
        int firstEvenIndex=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0){
                firstEvenIndex=i;
                break;
            }
        }
        if (firstEvenIndex!=-1){
            int oddMultiplier = 0;
            for (int i=0;i<a.length;i++){
                if (a[i]%2!=0){
                    oddMultiplier=a[i];
                    break;
                }
            }
            for (int i=a.length-1;i>=firstEvenIndex;i--){
                a[i]=oddMultiplier;
            }
        }


        return a;
    }

    /**Вычислить разность между суммой элементов массива, стоящих на четных местах,
     *  и суммой элементов, стоящих на нечетных местах. На полученную разность увеличить первую половину массива.**/
    public int task30(int[] a){
        int sumEvenNum=0;
        int sumOddNum=0;
        for (int i=0;i<a.length;i++){
            if (i%2==0){
                sumEvenNum+=a[i];
            }
            if (i%2!=0){
                sumOddNum+=a[i];
            }
        }
        int dif = sumEvenNum-sumOddNum;
        for (int i=0;i<a.length/2;i++){
            a[i]+=dif;
        }
        return dif;
    }

    /**Определить количество смен знака (NumSignChange) для элементов массива. Если NumSignChange > 0
     * , то все элементы после A[NumSignChange] заменить значением кубом разностей между первым
     * и минимальным элементами массива.**/
    public int[] task31(int[] a){
        int numSignChange=0;
        boolean positive=a[0]>=0;
        for (int i=1;i<a.length;i++){
            if ((a[i]>0 && !positive) || (a[i]<0 && positive)){
                numSignChange++;
                positive=!positive;
            }
        }
        if (numSignChange>0){
            int min=a[0];
            for (int i=1;i<a.length;i++){
                if (a[i]<min){
                    min=a[i];
                }
            }
            int diff=Math.abs(a[0]-min);
            int diffCube=diff*diff*diff;
            for (int i=numSignChange;i<a.length;i++){
                a[i]=diffCube;
            }
        }
        return a;
    }


    /**Найти максимум среди элементов первой половины массива и минимум среди второй половины массива,
     *  которые поменять местами.**/
    public int[] task32(int[] a){
        int min=a[0];
        int max=a[0];
        for (int i=1;i<a.length/2;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        for (int i=a.length/2;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            }
        }
        for (int i=0;i<a.length;i++){
            if (a[i]==max){
                a[i]=min;
            }else if (a[i]==min){
                a[i]=max;
            }

        }

        return a;
    }

    /**Выяснить, какое число в массиве встретится ранее – положительное или отрицательное (нули не рассматривать).
     *  Если положительное – найти в массиве максимальный элемент и возвести его в куб,
     *  если отрицательное – возвести в квадрат минимальный элемент.**/
    public int[] task33(int[] a){
        int firstNonZero = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]!=firstNonZero){
                firstNonZero=a[i];
                break;
            }
        }
        if (a[firstNonZero]>0){
            int max=a[firstNonZero];
            for (int i=firstNonZero+1;i<a.length;i++){
                if (a[i]>max){
                    max=a[i];
                }
            }
            int maxCube=max*max*max;
        } else if (a[firstNonZero]<0) {
            int min=a[firstNonZero];
            for (int i=firstNonZero+1;i<a.length;i++){
                if (a[i]<min){
                    min=a[i];
                }
            }
            int minSquare=min*min;
        }
        return a;
    }



    /**Найти минимум среди элементов первой половины массива и максимум среди второй половины.
     *  Вычислить сумму найденных значений и заменить им элемент,
     *  стоящий перед найденным минимальным элементом (предполагается,
     *  что нулевой элемент никогда не будет иметь нулевой индекс).**/
    public int[] task34(int[] a){
        int min=a[0];
        int max=a[a.length/2];
        for (int i=1;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            }
        }
        for (int i=a.length/2;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        int sum=max+min;
        int indexToReplaceMin=-1;
        for (int i=1;i<a.length;i++){
            if (a[i]==min){
                indexToReplaceMin=i-1;
                break;
            }
        }
        if (indexToReplaceMin!=-1){
            a[indexToReplaceMin]=sum;
        }
        return a;
    }


    /**Вычислить наибольшее и наименьшее значения разности между соседними элементами массива.
     *  Найденными значениями заменить, соответственно, второй и последний элементы массива.**/
    public int[] task35(int[] a){
        int maxDiff=Integer.MIN_VALUE;
        int minDiff=Integer.MAX_VALUE;
        for (int i=1;i<a.length;i++){
            int diff=Math.abs(a[i]-a[i-1]);
            if (diff>maxDiff){
                maxDiff=diff;
            }
            if (diff<minDiff){
                minDiff=diff;
            }
        }
        a[1]=minDiff;
        a[a.length-1]=maxDiff;
        return a;
    }

    /**Определить в нем произведение элементов, квадрат которых меньше 25.**/
    public int  task36(int [][]a){
        int n=a.length;
        int m=a[0].length;
        int product=1;
        for (int r=0;r<n;r++){
            for (int c=0;c<m;c++){
                int square=a[r][c]*a[r][c];
                if (square<25){
                    product*=a[r][c];
                }
            }
        }
        return product;
    }

    /**Определить в нем среднее арифметическое модулей отрицательных элементов.**/
    public int task37(int [][]a){
        int sum=0;
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]>0){
                    sum+=Math.abs(a[r][c]);
                    count++;
                }

            }
        }
        return sum/count;
    }

    /**Определить в нем среднее арифметическое модулей отрицательных элементов.**/
    public double task38(int[][] a){
        int sum=0;
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[0].length;c++){
                if (a[r][c]<0){
                    sum+=Math.abs(a[r][c]);
                    count++;
                }
            }
        }
        if (count==0){
            return 0;
        }
        return (double)sum/count;
    }

    /**Определить в нем среднее геометрическое элементов, у которых оба индекса четные.**/
    public double task39(int [][]a){
        int product=1;
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[0].length;c++){
                if (r%2==0 && c%2==0){
                    product*=a[r][c];
                    count++;
                }
            }
        }
        if (count==0){
            return 0;
        }
        return Math.pow(product,1.0/count);
    }

    /**Определить в нем среднее геометрическое квадратов четных элементов.**/
    public double task40(int [][]a){
        double product=1;
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[0].length;c++){
                if (a[r][c]%2==0){
                    double square=Math.pow(a[r][c],2);
                    product*=a[r][c];
                    count++;
                }
            }
        }
        if (count==0){
            return 0;
        }
        return Math.pow(product,1.0/count);
    }

    /**Определить в нем количество тех элементов, которые при делении на 4 дают остаток 2.**/
    public int task41(int [][]a){
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[0].length;c++){
                if (a[r][c]%4==2){
                    count++;
                }
            }
        }
        return count;
    }


    /**Определить в нем произведение тех элементов, чей модуль лежит в диапазоне [15; 50].**/
    public double task42(int [][]a){
        int firstDiapazon=15;
        int lastDiapazon=50;
        double product=1;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[0].length;c++){
                if (a[r][c]>=firstDiapazon && a[r][c]<=lastDiapazon){
                    product*=a[r][c];
                }
            }
        }
        return product;
    }


    /**Определить в нем количество тех элементов,
     * которые без остатка делятся на собственный номер (строки или столбца).
     * Номер – это индекс плюс единица.**/
    public double task43(int [][]a){
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[0].length;c++){
                if (a[r][c]%(r+1)==0 ){
                    count++;
                }
                if (a[r][c]%(c+1)==0){
                    count++;
                }
            }
        }
        return count;
    }


    /**Определить среднее арифметическое значение из
     * минимального значения с обоими четными индексами
     * и максимального значения с обоими нечетными индексами.**/
    public double task44(int [][]a){
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int count=0;
        for (int r=0;r<a.length;r+=2){
            for (int c=0;c<a[0].length;c+=2){
                    min=Math.min(min, a[r][c]);
            }
        }
        for (int r=1;r<a.length;r+=2){
            for (int c=1;c<a[0].length;c+=2){
                max=Math.max(max, a[r][c]);
            }
        }
        return (double) (min+max)/2;
    }


    /**Определить в нем среднее арифметическое элементов, значения которых лежат в диапазоне [2; 20].**/
    public double task45(int [][]a){
        int firstDiapazon=2;
        int lastDiapazon=20;
        int sum=0;
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[0].length;c++){
                if (a[r][c]>=firstDiapazon && a[r][c]<=lastDiapazon){
                    sum+=a[r][c];
                    count++;
                }
            }
        }
        if (count==0){
            return Double.NaN;
        }
        return (double) sum/count;
    }

    /**Определить в нем среднее арифметическое элементов, стоящих на позициях с нечетной суммой индексов.**/
    public double task46(int [][]a){
        int sum=0;
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[0].length;c++){
                if ((r+c)%2==1){
                    sum+=a[r][c];
                    count++;
                }
            }
        }
        if (count==0){
            return Double.NaN;
        }
        return (double) sum/count;
    }


    public int task47(int [][]a){
        int sum=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[0].length;c++){
                if (a[r][c]%2==0 && a[r][c]%3!=0){
                    sum+=a[r][c];
                }
            }
        }
        return sum;
    }

    public int task48(int [][]a){
        int sum=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]%3==0 && a[r][c]%2!=0){
                    sum+=a[r][c];
                }
            }
        }
        return sum;
    }

    public int task49(int [][]a){
        int sum=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (r+c>a[r][c]){
                    sum+=a[r][c];
                }
            }
        }
        return sum;
    }

    public int task50(int [][]a){
        int firstDiapazon=-10;
        int lastDiapazon=25;
        int product=1;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]>=firstDiapazon && a[r][c]<=lastDiapazon){
                    product*=a[r][c];
                }
            }
        }
        return product;
    }

    public int task51(int [][]a){
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c] * a[r][c]>16 ){
                    count++;
                }
            }
        }
        return count;
    }


    public int task52(int [][]a){
        int count=0;
        for(int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]%4==0){
                    count++;
                }
            }
        }
        return count;
    }

    public double task53(int [][]a){
        double product=1;
        for (int r=0; r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]%2!=0){
                    product*=a[r][c];
                }
            }
        }
        return product;
    }

    public int[] task54(int [][]a){
        int productIndex=1;
        int sum=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]>8){
                    productIndex*=r;
                    sum+=c;
                }
            }
        }
        return new int[]{productIndex,sum};
    }

    public int task55(int [][]a){
        int sumSquare =0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]%4==0){
                    sumSquare+=(r*r)+(c*c);
                }
            }
        }
        return sumSquare;
    }

    /**Определить сумму индексов всех (их может быть несколько) минимальных по величине элементов двумерного массива.**/
    public int task56(int [][]a){
        int sumRow=0;
        int sumCol=0;
        int min = Integer.MAX_VALUE;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]<min){
                    min=a[r][c];
                    sumCol=c;
                    sumRow=r;
                } else if (a[r][c]<min) {
                    sumRow+=r;
                    sumCol=c;
                }
            }
        }
        return sumCol+sumRow;
    }

    public int task57(int [][]a){
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if ((c+r)%2!=0 && a[r][c]%2==0){
                    count++;
                }
            }
        }
        return count;
    }
    /**Определить в нем сумму остатков от деления на 2 тех элементов, которые не кратны 2.**/
    public int task58(int [][]a){
        int sum=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]%2!=0){
                    sum+=a[r][c]%2;
                }
            }
        }
        return sum;
    }

    public double task59(int [][]a){
        double product=1;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]%4!=0){
                    product*=a[r][c]%4;
                }
            }
        }
        return product;
    }

    public double task60(int [][]a){
        double product=1;
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]%4==1 && a[r][c]%4==3){
                    product*=a[r][c];
                    count++;
                }
            }
        }
        if (count==0){
            return 0;
        }
        double geometricMean = Math.pow(product,1.0/count);
        return geometricMean;
    }

    public double task61(int [][]a){
        double product=1;
        int firstRange=15;
        int lastRange=25;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]>=firstRange && a[r][c]<=lastRange){
                    product*=a[r][c];
                }
            }
        }
        return product;
    }
    public int task62(int [][]a){
        int sum=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]%2!=0){
                    sum+=r+c;
                }
            }
        }
        return sum;
    }

    public double task63(int [][]a){
        double product=1;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]<0){
                    product*=Math.abs(a[r][c]);
                }
            }
        }
        return product;
    }

    public int task64(int [][]a){
        int sum=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]%2==a[r][c]%3){
                    sum+=a[r][c];
                }
            }
        }
        return sum;
    }

    public int task65(int [][]a){
        int sum=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (a[r][c]*3>a[r][c]*a[r][c]){
                    sum+=a[r][c];
                }
            }
        }
        return sum;
    }

    public double task66(int [][]a){
        double product=1;
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (r%2==0||c%2==0){
                    double square=Math.pow(a[r][c],2);
                    product*=square;
                    count++;
                }
            }
        }
        if (count==0){
            return 0;
        }
        double geometricMean = Math.pow(product,1.0/count);
        return geometricMean;
    }


    public double task67(int [][]a){
        double product=1;
        int count=0;
        for (int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                if (r%3==2||c%3==2){
                    double square=Math.pow(a[r][c],2);
                    product*=square;
                    count++;
                }
            }
        }
        if (count==0){
            return 0;
        }
        double geometricMean = Math.pow(product,1.0/count);
        return geometricMean;
    }


}
