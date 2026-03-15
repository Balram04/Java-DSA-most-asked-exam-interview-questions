// Method 1️⃣ Using Loop (Most Expected in Exams)
import java.util.*;

class RemoveVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
               ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'){
                System.out.print(ch);
            }
        }
    }
}

// Method 2️⃣ Using Replace Method
import java.util.*;
class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String removedVowels = str.replaceAll("[aeiouAEIOU]", ""); // remove all vowels from the string
        System.out.println("Original string: '" + str + "'");
        System.out.println("Removed vowels string: '" + removedVowels + "'");
    }
}

// Method 3️⃣ Using StringBuilder
import java.util.*;
class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
          String vowels = "aeiouAEIOU";         // String containing all vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) == -1) {       // Check if the character is not a vowel
                result.append(ch);
            }
        }
        System.out.println("Original string: '" + str + "'");
        System.out.println("Removed vowels string: '" + result.toString() + "'");
    }
}