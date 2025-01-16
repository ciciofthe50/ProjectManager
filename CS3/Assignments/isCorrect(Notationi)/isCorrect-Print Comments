
import java.util.Scanner;
import java.util.Stack;

public class isCorrect{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter data set");
        String dataset = scan.nextLine();
        String Stringy = dataset;
        Stack<String> s = new Stack<String>();
        
        String ClSt = ")}]>";
        String OpSt = "({[<";
        for(int i = 0;i<dataset.length();i++) {
            String Curr = Stringy.substring(i,i+1);
            System.out.println(Curr + " what the");
            if (Curr.equals("{") || Curr.equals("(") || Curr.equals("<") || Curr.equals("[")) {
                s.add(Curr);
                System.out.println(s + " add whatthe");
            } 
            if (s.size() == 0 && ClSt.contains(Curr)) {
                s.add("breakers");
                break;
            }
            for (int e=0;e<ClSt.length();e++) {
                if (Curr.equals(ClSt.substring(e,e+1)) && s.peek().equals(OpSt.substring(e,e+1))) {
                    s.pop();
                    System.out.println(s + " remove "+ ClSt.substring(e,e+1)+OpSt.substring(e,e+1));
                } 
            }
            System.out.println(s+" aftermath");
        }
        if(s.size() == 0) {
            System.out.println(dataset + "is correct");
        } else {
            System.out.println(dataset+ " is wrong");
        }

    }
}
