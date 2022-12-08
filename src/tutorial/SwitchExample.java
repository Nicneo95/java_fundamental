package tutorial;

public class SwitchExample {
    
    public static void main(String[] args) {

        int role = 10;
        switch(role) {
            case 1:
            System.out.println("You are an admin");
            //  if you don't add break statement the code will fall through 
            break;
            case 2:
            System.out.println("You are a moderator");
            break;
            default: System.out.println("You are a guest");
        }
        
        String role1 = "admin";
        if(role1 == "admin") {
            System.out.println("You are an admin");
        } else if(role1 == "moderator") {
            System.out.println("You are a moderator");
        } else {
            System.out.println("You are a guest");
        }
    }
}
