package abstrackinterfaces;

public class hesapmakinesi {
    int sayi=0;
    public class Topla {
        public int topla(int i,int j){
            return i+j;
        }
    }
    class Cikar{
        public int cikar(int i,int j){
            return i-j;
        }
    }
    class Carpma{
        public int carpma(int i,int j){
            return i*j;
        }
    }
    class Bolme{
        public String bolme(int i, int j){
            if(j==0){
                System.out.println("bölen 0 olmaz");
                return "";
            }else{
                int sonuc=i/j;
                return String.valueOf(sonuc);
            }
        }

    }
}
