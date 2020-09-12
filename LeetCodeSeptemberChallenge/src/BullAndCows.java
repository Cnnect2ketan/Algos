import java.util.HashMap;
import java.util.LinkedList;

public class BullAndCows {

    public String getHint(String secret, String guess) {
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
        int A=0,B=0;
        for(int i=0;i<secret.length();i++){
            Integer c = Integer.parseInt(secret.charAt(i)+"");
            Integer g = Integer.parseInt(guess.charAt(i)+"");
            if(c==g){
                A++;
                secret=secret.substring(0,i)+secret.substring(i+1);
                guess=guess.substring(0,i)+guess.substring(i+1);
                i--;
                continue;
            }
            if(map.get(c)==null){
                LinkedList<Integer> ll = new LinkedList<>();
                ll.add(i);
                map.put(c,ll);
            }else{
                LinkedList<Integer> ll = map.get(c);
                ll.add(i);
                map.put(c,ll);
            }
        }

        for(int j=0;j<guess.length();j++){
            Integer c = Integer.parseInt(guess.charAt(j)+"");
            if(map.get(c)!=null){
                B++;
                LinkedList<Integer> ll = map.get(c);
                ll.remove();
                if(ll.size()==0){
                    map.remove(c);
                }
            }
        }
        return A+"A"+B+"B";
    }

    public static void main(String[] args) {
        BullAndCows bullAndCows = new BullAndCows();
        System.out.println(bullAndCows.getHint("1123","0111"));
    }
}
