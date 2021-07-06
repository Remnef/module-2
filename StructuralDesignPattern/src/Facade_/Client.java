package Facade_;

import java.util.Scanner;

public class Client {
    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twiter(),new Facebook(),new LinkedIn());
        socialMediaFacade.share(message);
    }

    public static void main(String[] args) {
        String mess;
        Client client = new Client();
        Scanner input = new Scanner(System.in);
        System.out.print("Input message: ");
        mess = input.nextLine();
        client.share(mess);
    }
}
