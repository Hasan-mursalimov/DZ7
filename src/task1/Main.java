package task1;

import java.io.*;
import java.util.*;


public class Main {

    static String data = "Мы шли через реку голопом";
    ///преобразую строку в массив , для дальнейшего добавления в list
    static String[] strArr = data.split(" ");
    ///массив для добавления в метод output
    static byte[] dataByte;
    //создаю ArrayList для более удобной сортировки

    public static void main(String[] args) throws UnsupportedEncodingException {

        output("Мы шли через Шли реку голопом", "Hello.txt");
        input("Hello.txt");

    }

    public static void input(String fileName) {
        System.out.println("Содиржимое файла: ");
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int tmp = -1;
            while ((tmp = fileInputStream.read()) != -1) {
                System.out.println((char) tmp);
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static void output(String data, String fileName) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            // преобразую массив String в коллекцию
            Set<String> set = new HashSet<>(Arrays.asList(strArr));

            List list=new ArrayList(set);
            //сортирую коллекцию
            Collections.sort(list);

            String str = String.join(" ", list);


            dataByte = str.getBytes();

            fileOutputStream.write(dataByte);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





