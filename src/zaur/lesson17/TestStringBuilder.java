package zaur.lesson17;

public class TestStringBuilder {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        boolean result=true;
        if(sb1.length()==sb2.length()){
            for(int i=0; i<sb1.length(); i++){
                if(sb1.charAt(i)!=sb2.charAt(i));
                result=false;
                break;
            }

        }
        else{
            result=false;
        }
        return result;
    }


}

class Lesson17Test{
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("abc");
        StringBuilder sb3=sb1;
        StringBuilder sb2=new StringBuilder("abc");

        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb3));
    }
}
