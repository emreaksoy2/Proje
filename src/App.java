public class App {
    public static void main(String[] args) throws Exception {
           
       
    String ogrenci1 ="Engin";
        String ogrenci2 ="Derin";
        String ogrenci3 ="Ahmet";
        String ogrenci4 ="Salih";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------");

        String [] ogrenciler = new String[3];
        ogrenciler [0]="engin";
        ogrenciler [1]="derin";
        ogrenciler [2]="ahmet";

        for(int i=0 ; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
         
        System.out.println("--------------");
        for(String ogrenci :ogrenciler){

            System.out.println(ogrenci);
        }
        

        double[] mylist = {1.2,1.3,4.3,5.6};

        double total=0;
        double max =mylist [0];
        for (double number: mylist){
            if(max<number){
                max = number ;
            }
        total = total + number;
        System.out.println(number);
        }

        System.out.println("toplam =" +total );
        System.out.println("en büyük=" +total );


        String [] []sehirler  =new String[3][3];

        sehirler [0][0] ="Istanbul";
        sehirler [0][1] ="Bursa";
        sehirler [0][2] ="Bilecik";
        sehirler [1][0] ="Ankara";
        sehirler [1][1] ="Konya";
        sehirler [1][2] ="Kayseri";
        sehirler [2][0] ="Diyarbakir";
        sehirler [2][1] ="Sanliurfa";
        sehirler [2][2] ="Gaziantep";

        
        for(int i=0; i<=2;i++){

            System.out.println("------");
            for(int j=0;j<=2;j++){
                System.out.println(sehirler [i][j]);
            }
        
    }    
    }}