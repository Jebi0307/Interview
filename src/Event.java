import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Event {
    private String eventId;
    private int capacity;
    private LocalDateTime eventDate;
    private List<String> registeredUsers;
    private Map<String, RegistrationStatus> userRegistrations;

    public Event(String eventId, int capacity, LocalDateTime eventDate) {
        this.eventId = eventId;
        this.capacity = capacity;
        this.eventDate = eventDate;
        this.registeredUsers = new ArrayList<>();
        this.userRegistrations = new HashMap<>();
    }

    public RegistrationResult registerUser(String userId) {
        if (userRegistrations.containsKey(userId)) {
            return new RegistrationResult(false, "Already registered");
        }

//        if (registeredUsers.size() < capacity) {   // If users greater than capacity then it should be WAITLIST
        if (registeredUsers.size() >= capacity) {
            userRegistrations.put(userId, RegistrationStatus.WAITLIST);
            registeredUsers.add(userId); // Add Waitlist also into registeredUsers
            return new RegistrationResult(false, "Event is full");
        }

        registeredUsers.add(userId);
        userRegistrations.put(userId, RegistrationStatus.CONFIRMED);

        return new RegistrationResult(true, "Registration successful");
    }

    public boolean cancelRegistration(String userId) {
//        if (userRegistrations.get(userId) == RegistrationStatus.CONFIRMED ) { // Once the user confirmed they cant cancel
        if (userRegistrations.get(userId) == RegistrationStatus.WAITLIST ) {
            userRegistrations.remove(userId);
            registeredUsers.remove(userId); // Once cancel remove from the registeredUsers List
            return true;
        }
        return false;
    }

    public void processWaitlist() {
        for (Map.Entry<String, RegistrationStatus> entry : userRegistrations.entrySet()) {
            if (entry.getValue() == RegistrationStatus.WAITLIST) {
                entry.setValue(RegistrationStatus.CONFIRMED);
            }
        }
    }

    public List<String> getRegisteredUsers() {
        return registeredUsers;
    }
}