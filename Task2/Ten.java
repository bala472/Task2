public class Ten {
    public static void main(String[] args) {
       System.out.println(reverse("i love india")); 
    }
    public static String reverse(String str){
        if(!str.contains(" ")){
            return str;
        }
        return str.substring(str.lastIndexOf(" ")+1)+" "+reverse(str.substring(0,str.lastIndexOf(" ")));
    }

}
