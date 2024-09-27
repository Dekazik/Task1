import java.util.Scanner;

public class ShkibidiDekazik {
    public static void main(String[] args) {
        printTypesInfo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число (int): ");
        String intInput = scanner.nextLine();
        if (isInteger(intInput)) {
            int intValue = Integer.parseInt(intInput);
            System.out.println("Ви ввели ціле число: " + intValue);
        } else {
            System.out.println("Помилка! Будь ласка, введіть коректне ціле число.");
        }

        System.out.print("Введіть число з плаваючою крапкою (double): ");
        String doubleInput = scanner.nextLine();
        if (isDouble(doubleInput)) {
            double doubleValue = Double.parseDouble(doubleInput);
            System.out.println("Чудово, ви ввели число з плаваючою крапкою: " + doubleValue);
        } else {
            System.out.println("Помилка! Будь ласка, введіть коректне число з плаваючою крапкою.");
        }

        System.out.print("Введіть коротке число (short): ");
        String shortInput = scanner.nextLine();
        if (isShort(shortInput)) {
            short shortValue = Short.parseShort(shortInput);
            System.out.println("Ви ввели коротке число: " + shortValue);
        } else {
            System.out.println("Помилка! Неправильний формат для короткого числа.");
        }

        System.out.print("Введіть довге число (long): ");
        String longInput = scanner.nextLine();
        if (isLong(longInput)) {
            long longValue = Long.parseLong(longInput);
            System.out.println("Ви ввели довге число: " + longValue);
        } else {
            System.out.println("Помилка! Неправильний формат для довгого числа.");
        }

        System.out.print("Введіть число з плаваючою крапкою (float): ");
        String floatInput = scanner.nextLine();
        if (isFloat(floatInput)) {
            float floatValue = Float.parseFloat(floatInput);
            System.out.println("Чудово, ви ввели число з плаваючою крапкою: " + floatValue);
        } else {
            System.out.println("Помилка! Неправильний формат для числа з плаваючою крапкою.");
        }

        System.out.print("Введіть символ (char): ");
        String charInput = scanner.nextLine();
        if (charInput.length() == 1) {
            char charValue = charInput.charAt(0);
            System.out.println("Ви ввели символ: " + charValue);
        } else {
            System.out.println("Помилка! Будь ласка, введіть лише один символ.");
        }

        System.out.print("Введіть логічне значення (true/false): ");
        String booleanInput = scanner.nextLine();
        if (booleanInput.equalsIgnoreCase("true") || booleanInput.equalsIgnoreCase("false")) {
            boolean booleanValue = Boolean.parseBoolean(booleanInput);
            System.out.println("Ви ввели логічне значення: " + booleanValue);
        } else {
            System.out.println("Помилка! Неправильний ввід логічного значення.");
        }

        scanner.close();
    }

    public static void printTypesInfo() {
        System.out.println("Інформація про типи даних:");
        
        System.out.println("int: " + Integer.SIZE + " біт, мінімальне значення = " + Integer.MIN_VALUE + ", максимальне значення = " + Integer.MAX_VALUE);
        System.out.println("double: " + Double.SIZE + " біт, мінімальне значення = " + Double.MIN_VALUE + ", максимальне значення = " + Double.MAX_VALUE);
        System.out.println("short: " + Short.SIZE + " біт, мінімальне значення = " + Short.MIN_VALUE + ", максимальне значення = " + Short.MAX_VALUE);
        System.out.println("long: " + Long.SIZE + " біт, мінімальне значення = " + Long.MIN_VALUE + ", максимальне значення = " + Long.MAX_VALUE);
        System.out.println("float: " + Float.SIZE + " біт, мінімальне значення = " + Float.MIN_VALUE + ", максимальне значення = " + Float.MAX_VALUE);
        System.out.println("char: " + Character.SIZE + " біт, мінімальне значення = " + (int) Character.MIN_VALUE + ", максимальне значення = " + (int) Character.MAX_VALUE);
        System.out.println("boolean: true/false");
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isShort(String str) {
        try {
            Short.parseShort(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isLong(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
