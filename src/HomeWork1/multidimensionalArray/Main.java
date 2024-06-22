package HomeWork1.multidimensionalArray;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        int[][] arr = {
                {10, -2, 3,4},
                {-4, 5, 6, 6},
                {-7, 8, -9,7}
        };

        System.out.println(task11(arr));

    }

    /**Пусть n = m (массив - квадратный). Вычислить наибольшую сумму элементов,
     *  стоящих в подстроках верхнего треугольника двумерного массива (над главной диагональю).**/
    public int task1(int[][] arr){
       int n=arr.length;
       int sumMax=0;
       for(int r=0;r<n;r++){
           for(int c=r;c<n;c++){
               int sum=0;
               for(int d=0;d<=c;d++){
                   sum+=arr[r][d];
                   System.out.println();
               }
               if (sum>sumMax){
                   sumMax=sum;
               }
           }

       }
       return sumMax;
    }


    /**Пусть n и m - четные числа.
     *  Вычислить наименьшую сумму модулей элементов «подстолбцов» первой четверти двумерного массива
     *  (четверти двумерного массива нумеруются по часовой стрелке).**/
    public int task2(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int sumMin=Integer.MAX_VALUE;
        for(int c=0;c<m/2;c++){
          int sum=0;
          for(int r=0;r<n/2;r++){
              sum+=Math.abs(arr[r][c]);
          }
          sumMin=Math.min(sumMin,sum);
      }
      return sumMin;
    }

    /**Определить максимальную сумму только положительных элементов столбцов двумерного массива.**/
    public int task3(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int sumMax=0;
        for(int c=0;c<m;c++){
            int sum=0;
            for(int r=0;r<n;r++){
                if(arr[r][c]>0){
                    sum+=arr[r][c];
                }
                sumMax=Math.max(sumMax,sum);
            }
        }
        return sumMax;

    }


    /**Пусть n = m (массив - квадратный). Вычислить наименьшую сумму элементов,
     * стоящих в подстроках нижнего треугольника двумерного массива (под главной диагональю).**/

    public int task4(int[][] arr){
       int n=arr.length;
       int minSum=Integer.MAX_VALUE;
       for(int r=0;r<n;r++){
           int sum=0;
           for(int c=0;c<r;c++){
               sum+=arr[r][c];
           }
           minSum=Math.min(minSum,sum);
       }
       return minSum;
    }

    /**Выбрать строку с минимальной суммой модулей элементов двумерного массива.**/
    public int task5(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int minSum=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            int sum=0;
            for(int c=0;c<m;c++){
                sum+=Math.abs(arr[r][c]);
            }
            if(sum<minSum){
                minSum=sum;
            }
        }
        return minSum;
    }


    /**Пусть n и m - четные числа. Вычислить наибольшее среднегеометрическое значение элементов
     * подстрок второй четверти двумерного массива (четверти двумерного массива нумеруются по часовой стрелке).**/
    public double task6(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        double maxMean =Double.NEGATIVE_INFINITY;
        for(int r=0;r<n/2;r++){
            for(int c=m/2;c<m;c++){
                double product=1.0;
                int count=0;
                for (int j = c; j < m; j++) {
                    product *= arr[r][j];
                    count++;
                }
                double mean= Math.pow(product,1.0/count);
                maxMean=Math.max(maxMean,mean);
            }

        }
        return maxMean;
    }



    /**Определить максимальную сумму только положительных элементов строк двумерного массива.**/
    public int task7(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int maxSum=Integer.MIN_VALUE;
        for(int r=0;r<n;r++){
            int sum=0;
            for(int c=0;c<m;c++){
                if(arr[r][c]>0){
                    sum+=arr[r][c];
                }

            }
            maxSum=Math.max(maxSum,sum);
        }
        if (maxSum==Integer.MIN_VALUE){
            return 0;
        }
        return maxSum;
    }



    /**Пусть n = m (массив - квадратный). Вычислить наибольшую сумму элементов,
     * стоящих в «подстолбцах» верхнего треугольника двумерного массива (над главной диагональю)**/
    public int task8(int [][] arr){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        for (int c=0;c<n;c++){
            int sum=0;
            for (int r=0;r<n;r++){
                if (c>=r){
                    sum+=arr[r][c];
                }
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }


    /**Определить количество столбцов сумма модулей элементов, которых больших заданного числа s.**/
    public int task9(int [][]arr, int s){
        int count=0;
        for (int c=0;c<arr[0].length;c++){
            boolean found=false;

            for (int r=0;r<arr.length;r++){
                if (Math.abs(arr[r][c])>s){
                    found=true;
                    break;

                }
            }
            if (found){
                count++;
            }
        }
        return count;

    }

    /**Пусть n и m - четные числа. Вычислить наибольшую сумму модулей элементов «подстолбцов»
     *  третьей четверти двумерного массива (четверти двумерного массива нумеруются по часовой стрелке).**/
    public int task10(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int maxSum=Integer.MIN_VALUE;
        for (int c = 0; c < m/2; c++) {
            int sum = 0;
            for (int r = n/2; r < n; r++) {
                sum += Math.abs(arr[r][c]);
            }
            maxSum = Math.max(maxSum, sum);

       }
       return maxSum;
    }


    /**Определить максимальную сумму только элементов среди четных столбцов двумерного массива.**/
    public int task11(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int maxSum=Integer.MIN_VALUE;
        for (int c=0;c<m;c+=2){
                int sum=0;
                for (int r=0;r<n;r++){
                        sum+=arr[r][c];

                }
                maxSum=Math.max(maxSum,sum);
            }

                return maxSum;

        }



    /**Пусть n = m (массив - квадратный). Вычислить наименьшую сумму элементов,
     *  стоящих в «подстолбцах» нижнего треугольника двумерного массива (под главной диагональю).**/
    public int task12(int [][]arr){
        int n=arr.length;
        int minSum=Integer.MAX_VALUE;
        for (int r=0;r<n;r++){
            for (int c=0;c<n;c++){
                if (c<=r){
                    minSum+=arr[r][c];
                }
            }
        }
        return minSum;
    }


    /**Определить количество строк сумма модулей элементов, которых больших заданного числа s.**/
    public int task13(int [][]arr, int s){
        int count=0;
        for (int r=0;r<arr.length;r++){
            boolean found=false;
            for (int c=0;c<arr[0].length;c++){
                if (Math.abs(arr[r][c])>s){
                    found=true;
                    break;
                }

            }
            if (found){
                count++;
            }
        }
        return count;
    }


    /**Пусть n и m - четные числа. Вычислить наименьшее среднегеометрическое
     * значение элементов подстрок четвертой четверти двумерного массива
     * (четверти двумерного массива нумеруются по часовой стрелке).**/
    public double task14(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        double minMean=Double.MAX_VALUE;
        // Проходим по каждому элементу в четвертой четверти массива
        for (int i = n / 2; i < n; i++) {
            for (int j = m / 2; j < m; j++) {
                double product = 1.0;
                int count = 0;

                for (int k = j; k < m; k++) {
                    if (arr[i][k] != 0) {
                        product *= arr[i][k];
                        count++;
                    }
                }


                if (count > 0) {
                    double geometricMean = Math.pow(Math.abs(product), 1.0 / count);
                    minMean = Math.min(minMean, geometricMean);
                }
            }
        }

        return minMean;

    }
    /**Выбрать столбец с минимальной суммой модулей элементов двумерного массива.**/
    public int task15(int [][]arr){
        int minSum=Integer.MAX_VALUE;
        for (int c=0;c<arr[0].length;c++){
            int sum=0;
            for (int r=0;r<arr.length;r++){
                sum+=Math.abs(arr[r][c]);
            }
            minSum=Math.min(minSum,sum);
        }
        return minSum;
    }
    /**Пусть n = m (массив - квадратный).
     * Вычислить наибольшее скалярное произведение столбца на симметричную относительно главной диагонали строку**/
    public int task16(int [][]arr){
        int n=arr.length;
        int maxScalarPrduct=Integer.MIN_VALUE;
        for (int c=0;c<n;c++){
            for (int r=0;r<n;r++){
                int scalar=0;
                for (int d=0;d<n;d++){
                    scalar+=arr[d][c]*arr[r][d];
                }
                maxScalarPrduct=Math.max(maxScalarPrduct,scalar);
            }
        }
        return maxScalarPrduct;
    }

    public void chvertThree(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        for (int r=n/2;r<n;r++){
            for (int c=m;c<m/2;c++){
                System.out.println("");
            }
        }
    }


    public void chvertFour(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        for (int r=n/2;r<n;r++){
            for (int c=m/2;c<m;c++){
                System.out.println("");
            }
        }
    }
    public void chvertTwo(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        for (int r=0;r<n/2;r++){
            for (int c=m/2;c<m;c++){}
        }
    }

    /**Пусть n = m (массив - квадратный).
     *  Вычислить наименьшее скалярное произведение столбца на симметричную относительно побочной диагонали строку**/

    public int task17(int arr[][]){
        int n=arr.length;
        int minScalarPrduct=Integer.MAX_VALUE;
        for (int c=0;c<n;c++){
            for (int r=0;r<n;r++){
                int scalar=0;
                for (int d=0;d<n;d++){
                    scalar+=arr[d][c]*arr[r][d];
                }
                minScalarPrduct=Math.min(minScalarPrduct,scalar);
            }
        }
        return minScalarPrduct;
    }


    /**Определить максимальное число нулевых элементов в столбцах.**/
    public int task18(int [][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int maxCount=0;
        for (int c=0;c<n;c++){
            int count=0;
            for (int r=0;r<m;r++){
                if (arr[r][c]==0){
                    count++;
                }
            maxCount=Math.max(maxCount,count);
            }
        }
        return maxCount;
    }



    /**Определить количество локальных максимумов среднегеометрических значений столбцов
     * (сумма модулей столбца считается локальным минимумом, когда суммы модулей соседних столбцов больше текущего).**/
    public double task19(int [][] arr){
        int n=arr.length;
        int m=arr[0].length;
        double maxMean=Integer.MIN_VALUE;
        for (int c=0;c<m;c++){
            for (int r=0;r<n;r++){
                double mean=0;
                int count=0;
                for (int d=0;d<n;d++){
                    if (arr[r][c] != 0) {
                        mean *= arr[c][d];
                        count++;
                    }
                }
                if (count > 0) {
                    double geometricMean = Math.pow(Math.abs(mean), 1.0 / count);
                    maxMean = Math.min(maxMean, geometricMean);
                }
            }

        }
        return maxMean;
    }


    /**Пусть n и m - четные числа. Определить максимальное число отрицательных элементов
     *  в «подстолбцах» третьей четверти двумерного массива
     * (четверти двумерного массива нумеруются по часовой стрелке).**/
    public int task20(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int maxValue=Integer.MIN_VALUE;
        for (int r=n/2;r<n;r++){
            int count=0;
            for (int c=m;c<m/2;c++){
                if(arr[r][c]<0){
                    count++;
                }
            }
            maxValue=Math.max(maxValue,count);
        }
        return maxValue;

    }


    /**Определить количество локальных минимумов сумм модулей строк
     * (сумма модулей столбца считается локальным минимумом, когда суммы модулей соседних столбцов больше текущего).**/
    public int task21(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int count=0;
        for (int r=0;r<n;r++){
            int sum=0;
            for (int c=0;c<m;c++){
                sum+=Math.abs(arr[r][c]);
            }
            if(r>0&&r<n-1){
                int prevRowSum=0;
                int nextRowSum=0;
                for (int c=0;c<m;c++){
                    prevRowSum+=Math.abs(arr[r-1][c]);
                }
                for (int c=0;c<m;c++){
                    nextRowSum+=Math.abs(arr[r+1][c]);
                }
                if (sum<prevRowSum&&sum<nextRowSum){
                    count++;
                }
            }
        }
        return count;
    }


    /**Определить максимальную сумму только положительных элементов среди четных строк двумерного массива.**/
    public int task22(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int maxSum=Integer.MIN_VALUE;
        for (int r=0;r<n;r+=2){
            int sum=0;
            for (int c=0;c<m;c++){
                if(arr[r][c]>0){
                    sum+=arr[r][c];
                }
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public int task23(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int maxCount=0;
        for (int c=0;c<m;c++){
            int count=0;
            for (int r=0;r<n;r++){
                if (arr[r][c]>0){
                   count++;
                }
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }


    /**Пусть n и m - четные числа. Определить максимальное число нулевых элементов
     *  в «подстолбцах» первой четверти двумерного массива
     *  (четверти двумерного массива нумеруются по часовой стрелке).**/
    public int task24(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int maxCount=0;
        for (int c=0;c<m/2;c++){
            int count=0;
            for (int r=0;r<n/2;r++){
                if (arr[r][c]==0){
                    count++;
                }
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }


    /**Пусть n = m (массив - квадратный). Найти скалярное произведение главной и побочной диагонали**/
    public double task25(int [][]arr){
        int n=arr.length;
        double mainScalarProduct=1;
        double secondScalarProduct=1;

        for (int r=0;r<n;r++){
            mainScalarProduct*=arr[r][r];
        }
        for (int r=0;r<n;r++){
            secondScalarProduct*=arr[r][n-1-r];
        }
        return mainScalarProduct*secondScalarProduct;
    }


    /**Определить минимальное число нулевых элементов в строках**/
    public int task26(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int minCount=m;
        for (int r=0;r<n;r++){
            int count=0;
            for (int c=0;c<m;c++){
                if (arr[r][c]==0){
                    count++;
                }
            }
            minCount=Math.min(minCount,count);
        }
        return minCount;
    }

    /**Определить количество локальных максимумов среднегеометрических значений строк
     *  (сумма модулей столбца считается локальным минимумом,
     *  когда суммы модулей соседних столбцов больше текущего).**/

    public int task27(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int maxCount=0;
        for (int r=0;r<n;r++){
            boolean isLocalMaxima=true;
            for (int c=0;c<m;c++){
                double currentElement=arr[r][c];
                double sum=0;
                for (int d=0;d<n;d++){
                    if (c<arr[d].length){
                        sum+=Math.abs(arr[d][c]);
                    }
                }
                if (sum>Math.abs(currentElement)*n){
                    isLocalMaxima=false;
                    break;
                }
            }
            if (isLocalMaxima){
                maxCount++;
            }
        }
        return maxCount;
    }


    /**Пусть n и m - четные числа.
     *  Определить минимальное число положительных элементов в подстроках второй четверти двумерного массива
     *  (четверти двумерного массива нумеруются по часовой стрелке).**/
    public int task28(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int minCount=m;
        for (int c=m/2;c<m;c++){
            int count=0;
            for (int r=0;r<m/2;r++){
                if (arr[r][c]>0){
                    count++;
                }
            }
            minCount=Math.min(minCount,count);
        }
            return minCount;
    }


    /**Пусть n и m - четные числа.
     *  Определить минимальное число положительных элементов в подстроках второй четверти двумерного массива
     *  (четверти двумерного массива нумеруются по часовой стрелке).**/
    public int task29(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int minCount=m;
        for(int r=0;r<n;r++){
            int count=0;
            for(int c=0;c<m;c++){
                if (arr[r][c]<0){
                    count++;
                }
            }
            minCount=Math.min(minCount,count);
        }
        return minCount;
    }


    /**Определить количество локальных минимумов сумм модулей столбцов (сумма модулей столбца считается локальным
     25
     минимумом, когда суммы модулей соседних столбцов больше текущего).**/
    public int task30(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int localMinCount=0;
        for(int c=0;c<m;c++){
            if (c>0&&c<m-1){
                int currentColumnSum = 0;
                int prevColumnSum = 0;
                int nextColumnSum = 0;
                for (int r=0;r<n;r++){
                    currentColumnSum+=Math.abs(arr[r][c]);
                    prevColumnSum+=arr[r][c-1];
                    nextColumnSum+=arr[r][c+1];
                }
                if (currentColumnSum<prevColumnSum&&currentColumnSum<nextColumnSum){
                    localMinCount++;
                }
            }
        }
        return localMinCount;
    }

    /**Пусть n и m - четные числа. Определить минимальное число элементов больше заданного
     *  s в подстроках четвертой четверти двумерного массива
     *  (четверти двумерного массива нумеруются по часовой стрелке).**/
    public int task31(int [][]arr, int s){
        int n=arr.length;
        int m=arr[0].length;
        int count=0;
        for (int r=n/2;r<n;r++){

            for (int c=m/2;c<m;c++){
                if (arr[r][c]>s){
                    count++;
                }
            }
        }
        return count;
    }


}
