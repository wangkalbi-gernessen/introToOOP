package miniProjectII;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @author Kazunobu Someya
 */
public class Driver {
    public static void main(String[] args) {


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
                InputCollector.displayContactList();
            }else if(optionNum.equals("2")){
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
                Contact addInfo = new Contact(username, mobile);
//                System.out.println(addInfo);
                ArrayList<Contact> contacts = new ArrayList<>();
//                contacts.add(addInfo);
                ContactList contactLists = new ContactList(contacts);
                if(contactLists.addContact(addInfo)){
                    System.out.println("Successfully added a new contact!");
                }
                for(int i = 0; i <= contacts.size() - 1; i++){
                    System.out.println(contacts.get(i));
                }
            }else if(optionNum == "3"){
                InputCollector.removeContact();
            }else if(optionNum == "4"){
                InputCollector.updateContact();
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
