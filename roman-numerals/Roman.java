import java.util.Scanner;

public class Roman {
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            String token = String.valueOf(s.charAt(i));
            boolean changed = false;
            // System.out.println("current token : "+token);
            // System.out.println("current i : "+i);
            if ((i + 1) < (s.length())) {
                String nextToken = String.valueOf(s.charAt(i + 1));
                // System.out.println("next token : "+nextToken);
                if (token.equals("I")) {
                    if (nextToken.equals("V")) {
                        // System.out.println("has IV next so adding 4");
                        sum += 4;
                        changed = true;
                    } else if (nextToken.equals("X")) {
                        // System.out.println("has IX next so adding 9");
                        sum += 9;
                        changed = true;
                    }
                } else if (token.equals("X")) {
                    if (nextToken.equals("L")) {
                        // System.out.println("has XL next so adding 40");
                        sum += 40;
                        changed = true;
                    } else if (nextToken.equals("C")) {
                        // System.out.println("has XC next so adding 90");
                        sum += 90;
                        changed = true;
                    }
                } else if (token.equals("C")) {
                    if (nextToken.equals("D")) {
                        // System.out.println("has CD next so adding 400");
                        sum += 400;
                        changed = true;
                    } else if (nextToken.equals("M")) {
                        // System.out.println("has CM next so adding 900");
                        sum += 900;
                        changed = true;
                    }
                }
            }
            if (changed) {
                // System.out.println("skipping one so next i = "+(i+2));
                i = i + 2;
            } else {
                sum += getValueForRoman(token);
                i++;
            }
            // System.out.println("sum so far "+(sum));
        }
        return sum;
    }

    public int getValueForRoman(String romanNumber) {
        if (romanNumber.equals("M")) {
            return 1000;
        } else if (romanNumber.equals("D")) {
            return 500;
        } else if (romanNumber.equals("C")) {
            return 100;
        } else if (romanNumber.equals("L")) {
            return 50;
        } else if (romanNumber.equals("X")) {
            return 10;
        } else if (romanNumber.equals("V")) {
            return 5;
        }
        return 1;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Roman roman = new Roman();
            while (in.hasNext()) {
                System.out.println(roman.romanToInt(in.next()));
            }
        } catch (Exception e) {
            System.exit(-1);
        }

    }
}