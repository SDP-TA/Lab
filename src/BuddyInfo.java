public class BuddyInfo {

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    private String name;
    private String address;
    private String phoneNumber;

    public static void main(String[] args) {
    }

    public String getName() {
        return name;
    }
}
