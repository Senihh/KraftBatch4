package day_38_Constructors;

public class C04_StringArgsExample {
    //özel bir metod
    //args argumants kısaltılmış
    //String[] args
    public static void main(String[] args) {
        System.out.println(args.length);
        for (String arg : args) {
            System.out.print(arg+" ");

        }
        System.out.println();
        args[0]="isa";
        args[1]="musa";
        for (String arg : args) {
            System.out.print(arg+" ");

        }
    }
}
