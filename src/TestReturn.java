import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

class TestReturn {

    public static void main(String[] args)
    {
        String test = "Hello,World,Testing,String,To,Array";
        String encryptedData = Main.encrypt(test);

        System.out.println("Encrypted Data: " + encryptedData);

        String decryptedData = Main.decrypt(encryptedData);

        System.out.println("Decrypted Data: " + decryptedData);

        String[] arrayTest = decryptedData.split(",");
        System.out.println("Array Length: " + arrayTest.length);

        int i = 0;
        while (true){
            DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String currentTime = time.format(now);
            String currentDate = date.format(now);

            try {
                System.out.println(currentDate + " " + currentTime + " Array Index " + i + ": " + arrayTest[i]);
                i++;
                TimeUnit.SECONDS.sleep(1);
            }catch (Exception e){
                System.out.println("Get Array Ended. End Result:");
                System.out.println(java.util.Arrays.toString(arrayTest));
                break;
            }
        }

    }
} 