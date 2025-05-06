
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class kassie2 {
    public void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("Kassie.dat"));
        
        int runs = Integer.parseInt(br.readLine());
        String lineTest = br.readLine();
        int ans =0;
        for(int i = runs; i > 0; i--) {

            String[] wasd = (lineTest.split(" "));
            
            int num1 = Integer.parseInt(wasd[0]);
            String symbol = wasd[1];
            int num2 = Integer.parseInt(wasd[2]);
            
            switch (symbol) {
                case "+":
                    ans = adding(num1,num2); break;
                case "-":
                    ans = subbing(num1,num2); break;
                case "*":
                    ans = multiing(num1, num2); break;
                case "/":
                    ans = diving(num1, num2); break;
                default:
                    break;
            }
            lineTest = br.readLine();
            System.out.println(ans);
        }

    }
    public int adding(int num1, int num2) {
        return num1 + num2;
    }
    public int subbing(int num1, int num2) {
        return num1 - num2;
    }
    public int multiing(int num1, int num2) {
        return num1 * num2;
    }
    public int diving(int num1, int num2) {
        return num1 / num2;
    }

}