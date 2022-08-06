import java.util.*;

@SuppressWarnings("ResultOfMethodCallIgnored")
public class Main {
    public static void main(String[] args) {
//        String st;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter smth:");
//        st = sc.next();
//        char[] ch = new char[st.length()];
//        for (int i = 0; i < st.length(); i++) {
//            ch[i] = st.charAt(i);
//        }
//        for (int i = ch.length-1; i >= 0; i--) {
//            System.out.print(ch[i]);
//        }
//        System.out.println("");
        printUpperCon("lol", " daun");
        printConson(new StringBuilder("ya lol kek"));
    }

    static void printUpperCon(String x, String y){
        String z = x.toUpperCase(Locale.ROOT);
        String c = y.toUpperCase(Locale.ROOT);
        System.out.println(z + c);
    }

    static void printConson(StringBuilder x){
        char[] v = new char[]{'a', 'o', 'i', 'y', 'e', 'u'};
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < v.length; j++) {
                if (x.charAt(i) == v[j]){
                    x.delete(i, i);
                }
            }
        }
    }
}
