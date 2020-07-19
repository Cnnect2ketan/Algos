import java.util.Arrays;

public class CheckPermutation {

    //Solution 1: sorting the array and checking if it is equal or not
    public boolean solution1(String str1, String str2){

        if(str1.length()!=str2.length())
            return false;
        char ch[] = str1.toCharArray();
        char ch2[]= str1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        for (int i=0;i<ch.length;i++ ){
            if(ch[i]!=ch2[i])
                return false;
        }
        return true;
    }

    // solution 2: Using an array to check if the count of all the character are same or not
    public boolean solution2(String str1, String str2){
        if(str1.length()!=str2.length())
            return false;
        int count[]= new int[256];
        for(int i=0;i<str1.length();i++){
            int ascii=str1.charAt(i);
            count[ascii]=count[ascii]++;
        }

        for(int i=0;i<str2.length();i++){
            int ascii=str1.charAt(i);
            count[ascii]=count[ascii]--;
            if(count[ascii]<0)
                return false;
        }
        return true;

    }
}
