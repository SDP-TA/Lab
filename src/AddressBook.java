import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> myBuddies = new ArrayList<>();

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null)
            myBuddies.add(buddy);
    }

    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < myBuddies.size())
            return myBuddies.remove(index);
        else
            return null;
    }
}
