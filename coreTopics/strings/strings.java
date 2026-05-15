import java.util.*;

public class strings {

    public static boolean isPalinDrome(String str) {
        int n = str.length()/2;
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
         int x = 0;
         int y =0;
         for(int i =0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if(dir == 'N') {
                y++;
            } else if(dir == 'S') {
                y--;
            } else if(dir == 'E') {
                x++;
            } else if(dir == 'W') {
                x--;
            }
         }
         int x2 = x*x; 
         int y2 = y*y;
         return (float) Math.sqrt(x2 + y2);
    }


    //find largest string in an array of strings
    public static String getlargestString(String fruits[]){
        String Largest = fruits[0];
        for(int i = 1; i < fruits.length; i++) {
            if(Largest.compareTo(fruits[i]) < 0) {
                Largest = fruits[i];
            }
        }
        return Largest;
    }

    //convert frist letter of each word in a string to uppercase
    public static void toUpperCase(String str) {
        StringBuilder sb = new StringBuilder(' ');
        char ch =  Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length() - 1) {

                sb.append(' ');
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    } 

    // String compression
    public static String Compress(String str) {
        String newStr =  "";

        for(int i =0 ; i < str.length(); i++) {
            Integer count = 1;
             while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
             newStr += str.charAt(i);
            if(count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    // vowel count in a string
    public static int countVowels(String str) {
        int count = 0;
        for(int i =0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        String str1 = "racecar";
        System.out.println(isPalinDrome(str1));
        
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
        
        String fruits[] = {"apple", "mango", "banana", "grapes"};
        System.out.println(getlargestString(fruits));
        
        toUpperCase("hello world");

        String str3 = "aaabbccdee";
        System.out.println(Compress(str3));

            String str2 = "hello world";
            System.out.println(countVowels(str2));
    }
}