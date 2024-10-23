import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Event event = new Event("1",2, LocalDateTime.now());

        String userId = "123";
        String userId2 = "124";
        String userId3 = "125";
        event.registerUser(userId);
        event.registerUser(userId2);
        event.registerUser(userId3);
        event.processWaitlist();
        event.cancelRegistration(userId3);


              System.out.println(event.getRegisteredUsers());




    }
}