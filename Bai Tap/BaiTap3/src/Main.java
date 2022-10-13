import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 day ki tu :");
        String text = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < text.length(); i++) {

            if (list.size() > 1 && text.charAt(i) <= list.getLast() && list.contains(text.charAt(i))) {
                list.clear();
            }

            list.add(text.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }


        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }




}