package miniProjectII;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @author Kazunobu Someya
 */
public class Driver {
    public static void main(String[] args) {
        Contact r1 = new Contact(0,"Benedikt", "090-999-2834", "footballer", "788-777-9999", "Hamburg");
        Contact r2 = new Contact(1,"Juan", "678-172-6384", "Navy", "277-283-2993", "Quito");
        Contact r3 = new Contact(2,"Kai", "178-472-6624", "Dancer", "470-263-2291", "Osaka");
        ArrayList<Contact> contacts = new ArrayList<>();
        ContactList contactLists = new ContactList(contacts);
        contactLists.addContact(r1);
        contactLists.addContact(r2);
        contactLists.addContact(r3);

        // https://stackoverflow.com/questions/33036087/how-would-i-use-a-while-loop-to-keep-requesting-user-input
        while(true){
            // Display main menu
            System.out.println("+===   Contact App   ===+");
            System.out.println("| 1. List all Contacts  |");
            System.out.println("| 2. Add new Contacts   |");
            System.out.println("| 3. Remove Contact     |");
            System.out.println("| 4. Update Contact     |");
            System.out.println("| 5. Quit               |");
            System.out.println("+=======================+");
            String optionNum = InputCollector.getUserInput("Enter your option: ");
            if(optionNum.equals("1")){
                for(int i = 0; i <= contacts.size() - 1; i++){
                    System.out.println(contacts.get(i));
                }
                break;
            }else if(optionNum.equals("2")){
                int index = contacts.size();
                String username;
                while(true) {
                    username = InputCollector.getUsername("Enter name: ");
                    // https://stackoverflow.com/questions/26428538/java-regex-to-find-whitespaces-or-upper-case-characters
                    if (!username.matches("[A-z\\s]+")) {
                        System.out.println("Invalid Input. Enter alphabet A-z");
                    } else if (username.equals("")) {
                        System.out.println("You must enter this field.");
                    }else{
                        break;
                    }
                }

                String mobile;
                while(true){
                    mobile = InputCollector.getMobileNumber("Enter mobile: ");
                    Pattern p = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
                    if(!p.matcher(mobile).find()){
                        System.out.println("Invalid Input. Enter phone number in format of XXX-XXX-XXXX");
                    }else if(mobile.equals("")){
                        System.out.println("You must enter this field.");
                    }else{
                        break;
                    }
                }

                String work;
                while(true) {
                    work = InputCollector.getUsername("Enter work: ");
                    // https://stackoverflow.com/questions/26428538/java-regex-to-find-whitespaces-or-upper-case-characters
                    if (!work.matches("[A-z\\s]+")) {
                        System.out.println("Invalid Input. Enter alphabet A-z");
                    } else if (work.equals("")) {
                        System.out.println("You must enter this field.");
                    }else{
                        break;
                    }
                }

                String home;
                while(true){
                    home = InputCollector.getMobileNumber("Enter home: ");
                    Pattern p = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
                    if(!p.matcher(home).find()){
                        System.out.println("Invalid Input. Enter home number in format of XXX-XXX-XXXX");
                    }else if(home.equals("")){
                        System.out.println("You must enter this field.");
                    }else{
                        break;
                    }
                }

                String city;
                while(true) {
                    city = InputCollector.getUsername("Enter city: ");
                    // https://stackoverflow.com/questions/26428538/java-regex-to-find-whitespaces-or-upper-case-characters
                    if (!city.matches("[A-z\\s]+")) {
                        System.out.println("Invalid Input. Enter alphabet A-z");
                    } else if (city.equals("")) {
                        System.out.println("You must enter this field.");
                    }else{
                        break;
                    }
                }

                Contact addInfo = new Contact(index, username, mobile, work, home, city);
//                System.out.println(addInfo);
                ArrayList<Contact> contacts2 = new ArrayList<>();
//                contacts.add(addInfo);
                ContactList contactLists2 = new ContactList(contacts);
                if(contactLists.addContact(addInfo)){
                    System.out.println("Successfully added a new contact!");
                }
                for(Contact elem : contacts){
                    System.out.println(elem);
                }
                break;
            }else if(optionNum == "3"){
                while(true){
                    for(int i = 0; i <= contacts.size() - 1; i++){
                        System.out.println(contacts.get(i));
                    }
                    System.out.println("Enter the index of contact to remove: ");
                    String removedNum = InputCollector.getUserInput("Enter your option: ");
                    if(removedNum == "0"){
                        contacts.remove(0);
                    }else if(removedNum == "1"){
                        contacts.remove(1);
                    }else{
                        contacts.remove(2);
                    }
                    System.out.println(contacts);
                    break;
                }
            }else if(optionNum == "4"){
//                while(true){
//                    for(int i = 0; i <= contacts.size() - 1; i++){
//                        System.out.println(contacts.get(i));
//                    }
//                    System.out.println("Enter the index of contact to update: ");
//                    String removedNum = InputCollector.getUserInput("Enter your option: ");
//                    if(removedNum == "0"){
//                        contacts.remove(0);
//                    }else if(removedNum == "1"){
//                        contacts.remove(1);
//                    }else{
//                        contacts.remove(2);
//                    }
//                    System.out.println(contacts);
//                    break;
//                }
                break;
            // https://stackoverflow.com/questions/26499063/how-do-i-fix-my-java-code-so-that-it-ends-when-a-user-types-quit
            }else if(optionNum.equals("5")){
                System.out.println("Bye!");
                System.exit(0);
                break;
            }else{
                System.out.println("Invalid Input. Enter number between 1 and 5.");
            }
        }
    }
}