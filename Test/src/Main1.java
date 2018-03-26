
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by zwl on 2018/3/22.
 * May god bless me
 */
public class Main1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replace("!","").replace(".","").replace(",","")
                .replace("、","");
        String[] words = str.split(" ");
        char[] chars = str.toUpperCase().replace(" ","").toCharArray();
        HashMap<Character,Integer> countWord= new HashMap<>();
        for (char aChar : chars) {
            countWord.put(aChar,countWord.getOrDefault(aChar,0)+1);
        }
        int diffCount = 0;
        for (Map.Entry<Character, Integer> characterIntegerEntry : countWord.entrySet()) {
            System.out.println(characterIntegerEntry.getKey()+" "+characterIntegerEntry.getValue());
           if( characterIntegerEntry.getValue()==2){
               diffCount++;
           }
        }
        System.out.println("有"+words.length+"个英文单词 :"+str);
        System.out.println("有"+diffCount+"个不同的英语单词");

    }
}
