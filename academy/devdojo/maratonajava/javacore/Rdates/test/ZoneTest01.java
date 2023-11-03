package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Map;

public class ZoneTest01 {
    //Jesus é o melhor!
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId zonaParis = ZoneId.of("Europe/Paris");
        System.out.println(zonaParis);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(now.atZone(zonaParis));
    }
}
