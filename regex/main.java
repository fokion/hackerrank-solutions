import java.util.Scanner;

class RegexSolution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    public String pattern = "^(0[0-9]{0,2}|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.(0[0-9]{0,2}|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.(0[0-9]{0,2}|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.(0[0-9]{0,2}|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
}