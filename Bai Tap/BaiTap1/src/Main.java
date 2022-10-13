import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 dãy kí tự : ");
        String text = sc.nextLine();
        LinkedList<Character> charMax = new LinkedList<>();
        for (int i = 0; i < text.length(); i++) {
            LinkedList<Character> diskText = new LinkedList<>();
            diskText.add(text.charAt(i));

            for (int j = i+1; j < text.length() ; j++) {
                if(text.charAt(j)> diskText.getLast()){
                    diskText.add(text.charAt(j));
                }
            }
            if(diskText.size()>charMax.size()){
                charMax.clear();
                charMax.addAll(diskText);
            }
        }
        for (Character charText: charMax){
            System.out.print(charMax);
        }
    }
}