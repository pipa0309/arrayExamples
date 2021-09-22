public class Arrays {
    public static void main(String[] args) {

        initArray();
        createElementsOfArray();
        createArrayWithMathOperation();
        drawDiagonal();

        int len = 5;
        int initialValue = 5;
        arrLenAndValue(5, 5);

    }

    //Задан целочисленный массив, состоящий из элементов 0 и 1.
    //С помощью цикла и условия заменено 0 на 1, 1 на 0
    private static void initArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

    }

    //Задан пустой целочисленный массив длиной 100.
    //С помощью цикла заполнен значениями 1 2 3 4 5 6 7 8 … 100
    private static void createElementsOfArray() {
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    //Задан массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    //Проход по нему циклом, числа меньшие 6 умножены на 2
    private static void createArrayWithMathOperation() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    //Создан квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    //с помощью циклов заполнены его диагональные элементы единицами
    private static void drawDiagonal() {
        int sizeArr = 9;
        int[][] arr4 = new int[sizeArr][sizeArr];
        int counterUp = 0;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                counterUp++;
                if (i == j || ((i + j) % (arr4.length - 1) == 0)) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
                if (counterUp % sizeArr == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println();
    }

    //Написан метод, принимающий на вход два аргумента: len и initialValue,
    //возвращает одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
    private static void arrLenAndValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
}
