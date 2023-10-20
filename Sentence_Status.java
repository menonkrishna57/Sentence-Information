
/**
 * This Program on execution will print the number of words, sentences
 * @author menonkrishna57
 * @version 1
 */
import java.util.Scanner;
public class Sentence_Status
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please type in your text.");
        String text=sc.nextLine();
        sc.close();

        text=text.trim();//this statement removes unnecessary spaces in the start and end of the string
        int words=1;//this statement counts the number of words in the string
        int sentences=0;//this statement counts the number of sentences in the string
        
        if(text.charAt(text.length()-1)!='.')
        {
            text=text+".";
        }
        for(int lp=0;lp<text.length();lp++)//to run a loop that counts from 1 to the length of the string
        {
            char check_text=text.charAt(lp);
            if(check_text==' ')
            {words++;//this counts the number of words in the text
            }
            if(check_text=='.')
            {
                sentences++;//this counts the number of sentences in the text
            }
        }

        String plural_Checker="";//this just types word when there is a single word and words where there are more than one word

        if(words>=2)plural_Checker="s";

        System.out.println("\n**Text Information**\nWord"+plural_Checker+"-"+words);

        if(words>=1)
        {
            plural_Checker="s";
        }
        else {plural_Checker="";}
        System.out.println("Sentence"+plural_Checker+"-"+sentences);
    }
}
