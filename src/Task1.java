import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку с повторяющимися символами:");
        String str = scanner.nextLine();

        char[] result = removeDuplicates(str);


        System.out.print("Массив без повторяющихся символов: ");
        for (char c : result) {
            System.out.print(c);
        }
    }


        private static char[] removeDuplicates(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    charArray[j] = ' ';
                }
            }
        }
        return charArray;
    }
}
