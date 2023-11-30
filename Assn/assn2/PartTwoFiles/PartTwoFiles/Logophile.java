
public class Logophile{

    private String[] w;
    private int age;
    private String name;

    public Logophile(String name, int aga, String[] w) {
        this.name = name;
        this.age = age;
        this.w = w;
    }
    public boolean isFav(String fav){
        for(String f : w){
            if(f == fav)
                return true;
        }
        return false;
    }
}

    public static int numWithFav( int favWord, Logophile[] people){
        int count = 0;
        for(Logophile p : people){
            if(p.isFav(favWord)
                count++;
        }
        return count;
}

public static String hasMostFavs( Logophile[] people){
    String n1 = "";
    int count = 0;
    for(Logophile p: people){
        if(p.w.size() > count) {
            n1 = p.name;
            count = p.w.size();
        }
    }
    return n1;
}

public static String[] bigWords(String[] words, int cutoff){
    int count = 0;
    for(int i = 0; i<words.length(); i++){
        if(words[i].size() > cutoff)
            count++;
    }
    String[] sOUT = new String[count];
    int iter = 0;
    for(int i = 0; i<words.length(); i++){
        if(words[i].size() > cutoff){
            sOut[iter] = words[i];
            iter++;
        }
    }
    return  sOut;
}