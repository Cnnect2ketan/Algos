import java.util.Arrays;

public class UniqueString {

    //Problem Statement: To find the if the string in unique or not without using any other DS

    //Solution1: Checking out strings one by one
    // O(n^2) complexity
    public boolean solution1(String str){
        for(int i=0;i<str.length()-1;i++){
            for (int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    //Solution 2: Sorting the String and Checking the adjacent character if equal
    // Using
    public boolean solution2(String str){
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        for(int x=0;x<ch.length-1;x++){
            if(ch[x]==ch[x+1])
                return false;
        }
        return true;
    }

    //Solution 3: Taking a new array and using 256 character to test if there is a duplicate or not
    public boolean solution3(String str){
        boolean ch[]= new boolean[256];
        for( int i=0; i<str.length();i++){
            int ascii = str.charAt(i);
            if(ch[ascii]== true)
                return false;
        }
        return true;
    }


}
