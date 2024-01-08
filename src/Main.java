public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        boolean sonuc0 = shouldWakeUp(true, 1);
        System.out.println("Uyanmalı mıyız? : " + sonuc0);

        boolean sonuc11 = shouldWakeUp(false, 2);
        System.out.println("Uyanmalı mıyız? : " + sonuc11);

        boolean sonuc12 = shouldWakeUp(true, 8);
        System.out.println("Uyanmalı mıyız? : " + sonuc12);

        boolean sonuc13 = shouldWakeUp(true, -1);
        System.out.println("Uyanmalı mıyız? : " + sonuc13);

        boolean sonuc1 = hasTeen(9, 99, 19);
        System.out.println("Yaş Tespiti Sonuç 1: " + sonuc1);

        boolean sonuc2 = hasTeen(23, 15, 42);
        System.out.println("Yaş Tespiti Sonuç 2: " + sonuc2);

        boolean sonuc3 = hasTeen(22, 23, 34);
        System.out.println("Yaş Tespiti Sonuç 3: " + sonuc3);


        boolean sonuc4 = isCatPlaying(true, 10);
        System.out.println("Kedi Oynuyor mu Sonuç : " + sonuc4);

        boolean sonuc5 = isCatPlaying(false, 36);
        System.out.println("Kedi Oynuyor mu Sonuç : " + sonuc5);

        boolean sonuc14 = isCatPlaying(false, 35);
        System.out.println("Kedi Oynuyor mu Sonuç : " + sonuc14);

        double sonuc6 = area(4.0, 5.0);
        System.out.println("Bunun Alanı : " + sonuc6);


        double sonuc8 = area(-1.0, 4.0);
        System.out.println("Bunun Alanı : " + sonuc8);

        double sonuc9 = area(5.0);
        System.out.println("Dairenin Alanı : " + sonuc9);

        double sonuc10 = area(-5.0);
        System.out.println("Dairenin Alanı : " + sonuc10);
    }

    public static boolean shouldWakeUp(boolean havliyor, int saat){
        if(saat < 0 || saat > 23){
            return false;
        } if(havliyor) {
            return (saat < 8 || saat >= 20);
        }
        return false;
    }


    //public static boolean hasTeen(int yas1, int yas2, int yas3){
    //    return (yas1 >= 13 && yas1 <= 19) || (yas2 >= 13 && yas2 <= 19) || (yas3 >= 13 && yas3 <= 19);
    //}

    public static boolean hasTeen(int... ages){
        if (ages.length != 3){
           return false;
        }
        for(int age : ages){
            if(age>=13 && age<=19){
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean yazMi, int sicaklik) {
        int ustLimit = (yazMi) ? 45 : 35;
        return (sicaklik >= 25 && sicaklik <= ustLimit);
    }

    public static double area(double double1, double double2) {
        if(double1 <0 || double2 < 0) {
            return -1;
        } else { return double1 * double2;
    }
}

    public static double area(double radius){
        if(radius < 0 ){
            return -1;
        } else { return radius * radius * Math.PI;
    }
}}