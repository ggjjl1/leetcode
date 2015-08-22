import java.util.*;

/**
 * Created by gaojunliang on 7/1/15.
 */
public class Word_Break {
    public boolean wordBreak(String s, Set<String> wordDick){
        int strlen = s.length();
        /*for(String word: wordDick){
            if(s.indexOf())
        }*/
        return true;
    }

    public static void main(String[] args) {
        HashSet hashset = new HashSet();
        hashset.add("hello");
        hashset.add("world");
        Iterator it = hashset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        String str = "Hello World!";
        System.out.println(str.charAt(0));
        float x = 3.1415926f;
        float y = 1.67f;
        System.out.println(x + y);

        Gerbil geb1 = new Gerbil(11);
        Gerbil geb2 = new Gerbil(12);
        Gerbil geb3 = new Gerbil(13);
        Gerbil geb4 = new Gerbil(14);
        Gerbil geb5 = new Gerbil(15);
        List<Gerbil> list = new ArrayList<Gerbil>();
        list.add(geb1);
        list.add(geb2);
        list.add(geb3);
        list.add(geb4);
        list.add(geb5);
        for(Gerbil geb: list){
            geb.hop();
        }
    }
}

class Gerbil{
    int gerbilNumber;

    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }

    public void hop(){
        System.out.println("the gerbil is jumping, number is " + gerbilNumber);
    }
}
