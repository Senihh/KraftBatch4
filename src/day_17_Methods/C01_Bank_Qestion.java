package day_17_Methods;

import java.util.Scanner;

public class C01_Bank_Qestion {
    public static void main(String[] args) {
        double money=2000;
        Scanner scan=new Scanner(System.in);
        outerloop:while (true){
            System.out.println("1:Psra ekle 2:Para çek 3:Bakiye 4:Çıkış");
            System.out.println("yapmak istediğiniz işlemi seçiniz: ");
          int tercih= scan.nextInt();
          switch (tercih){
              case 1:
                  while (true){
                      System.out.println("eklemek istediğiniz tutarı giriniz");
                      double para=scan.nextDouble();
                      money+=para;
                      System.out.println("bir üst meü için 1'e basınız, işleme devam etmek için 2'ye basınız");
                      int tercih2=scan.nextInt();
                      if(tercih2==1){
                          break;
                      } else if (tercih2==2) {
                          continue;

                      }else {
                          System.out.println("Hatalı işlem yapıldığı için kart iade ediliyor");
                          break outerloop;
                      }
                  }
                  break;
              case 2:
                  while (true){
                      System.out.print("çekmek istediğiniz tutarı giriniz");
                      double para=scan.nextDouble();
                      if(para>money){
                          System.out.println("Hesabınızda yeterli bakiye yoktur");
                          continue outerloop;
                      }
                      money-=para;
                      System.out.println("bir üst meü için 1'e basınız, işleme devam etmek için 2'ye basınız");
                      int tercih2=scan.nextInt();
                      if(tercih2==1){
                          break;
                      } else if (tercih2==2) {
                          continue;

                      }else {
                          System.out.println("Hatalı işlem yapıldığı için kart iade ediliyor");
                          break outerloop;
                      }
                  }
                  break;
              case 3:

                      System.out.print("Bakiyeniz: "+money);

                  break;
              case 4:
                  break outerloop;
              default:
                  System.out.println("Hatalı işlem, tekrar deneyiniz");
          }
        }
    }
}
