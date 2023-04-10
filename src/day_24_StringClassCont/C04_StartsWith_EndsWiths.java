package day_24_StringClassCont;

public class C04_StartsWith_EndsWiths {
    public static void main(String[] args) {
        String str="Java is cool";
        System.out.println(str.startsWith( "J"));
        System.out.println(str.startsWith("j"));
        System.out.println(str.startsWith("Jav"));
        System.out.println(str.startsWith(str));
        System.out.println(str.startsWith(""));
        System.out.println(str.startsWith(" "));

        System.out.println("..........................");

        System.out.println(str.endsWith("l"));
        System.out.println(str.endsWith("ool"));
        System.out.println(str.endsWith(str));




    }
}
