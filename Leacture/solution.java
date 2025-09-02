import java.util.HashMap;

public class make_palindrome  {
    public static String getPalindrome(String str){
        HashMap<Character, 
        Integer> counting = new HashMap<>();
    for(char ch : str.toCharArray())
    {
        if (counting.containsKey(ch)) 
        {
            counting.put(ch, counting.get(ch) + 1);
        }
        else 
        {
            counting.put(ch, 1);
        }
    }
    
    
    int oddCount = 0;
    char oddChar = 0;
    
    for(Entry<Character, 
              Integer> itr : counting.entrySet())
    {
        if (itr.getValue() % 2 != 0)
        {
            oddCount++;
            oddChar = itr.getKey();
        }
    }
   
    if (oddCount > 1 || oddCount == 1 && 
        str.length() % 2 == 0)
    {
        return "NO PALINDROME";
    }
   
    String firstHalf = "", lastHalf = "";
    for(Entry<Character, Integer> itr : counting.entrySet())
    {
        
        String ss = "";
        for(int i = 0; i < itr.getValue() / 2; i++)
        {
            ss += itr.getKey();
        }
        
        firstHalf = firstHalf + ss;
        lastHalf = ss + lastHalf;
    }
    return (oddCount == 1) ? 
       (firstHalf + oddChar + lastHalf) : 
       (firstHalf + lastHalf);
}
public static void main(String[] args)
{
    String str = "mdaam";
    System.out.println(getPalindrome(str));
}
}