/* the next instruction... */
public class NextStep{
    public static void main(String[] args){
        int[] data = {35,10,35,32,103,114,101,97,116,33,32,110,111,119,32,103,111,32,116,97,107,101,32,97,32,115,116,101,112,32,98,97,99,107,32,105,110,116,111,32,116,104,101,32,84,48,48,32,100,105,114,101,99,116,111,114,121,10,35,32,97,110,100,32,101,110,116,101,114,32,116,104,101,32,109,97,122,101,92,50,92,49,92,51,32,100,105,114,101,99,116,111,114,121,10,35,10};
        StringBuilder s = new StringBuilder();
        for(int ascii_value: data){
            s.append( (char) ascii_value );
        }
        System.out.println(s);
    }
}