package day_21;

public class Car {

    String marka;
    int modelYil;
    String saseNo;
    boolean sSuv;
    boolean isManuel;
    int beygir;

    public void hizlan(){
        System.out.println("Araç hızlanıyor");
    }
    public String beygirKarsilastir(){

        if(beygir>100){
            return "güçlü araç";
        }
        return "zayıf araç";
    }

}
