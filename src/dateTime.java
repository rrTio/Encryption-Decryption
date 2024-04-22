import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class dateTime {
    public static void main(String args[]) throws InterruptedException {

        while (true){
            DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String currentTime = time.format(now);
            String currentDate = date.format(now);
            System.out.println(currentDate);
            System.out.println(currentTime);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
