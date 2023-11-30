import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для переворота:");
        String str = scanner.next();

        String reversedString = reverseString(str);

        System.out.println("Перевернутая строка: " + reversedString);
    }


        private static String reverseString(String str) {
            char[] charArray = str.toCharArray();
            int left = 0;
            int right = charArray.length - 1;

            while (left < right) {
                // Обмен символами
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            return new String(charArray);
        }
    }


