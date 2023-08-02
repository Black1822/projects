package abstrackinterfaces;

public class main {
    public static void main(String[] args) {
        hesapmakinesi hm=new hesapmakinesi();
        hesapmakinesi.Topla toplayici=hm.new Topla();
        int toplam = toplayici.topla(34,52);
        System.out.println("Toplam : "+toplam);

        hesapmakinesi.Cikar cikarici=hm.new Cikar();
        int fark = cikarici.cikar(67,33);
        System.out.println("Fark :"+fark);

        hesapmakinesi.Carpma carpici=hm.new Carpma();
        int carpma = carpici.carpma(8,9);
        System.out.println("Çarpım :"+carpma);

        hesapmakinesi.Bolme bolucu=hm.new Bolme();
        int bolme = Integer.parseInt(bolucu.bolme(24,2));
        System.out.println("Bölüm :"+bolme);

    }
}
