package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    //Jesus é maravilhoso!
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime agoraDaquiDoisAnos = LocalDateTime.now().plusYears(2);
        LocalTime tempoAgora = LocalTime.now();
        LocalTime tempoDaquiTresHoras = LocalTime.now().plusHours(3);

        Duration d1 = Duration.between(tempoAgora, tempoDaquiTresHoras);
        Duration d2 = Duration.between(agora, agoraDaquiDoisAnos);

        System.out.println(d1);
        System.out.println(d2);
    }
}
