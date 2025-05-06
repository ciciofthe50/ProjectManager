import java.io.*;

public class Kassie {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("Kassie.dat"));
        
        String lines = br.readLine();
        for(int i = 0; i<Integer.parseInt(lines); i++) {
            String[] lineArr = br.readLine().split(" ");
            int n1 = Integer.parseInt(lineArr[0]);
            int n2 = Integer.parseInt(lineArr[2]);
            String symbol = lineArr[1];


            if(symbol.equals("+")) {
                System.out.println(n1+n2);
            } else if(symbol.equals("-")) {
                System.out.println(n1-n2);
            } else if(symbol.equals("/")) {
                System.out.println(n1 / n2);
            } else if(symbol.equals("*")) {
                System.out.println(n1*n2);
            }
        }
    }
}