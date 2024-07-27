import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName,password;
        System.out.println("Lütfen kullanıcı adınızı giriniz :");
        userName = scanner.nextLine();
        System.out.println("Lütfen şifreniizi giriniz :");
        password = scanner.nextLine();

        if(userName.equals("kahraman") && password.equals("patika"))
        {
            System.out.println("Giriş başarılı !!");
        }
        else
            System.out.println("Kullanıcı adı veya şifre hatalı");
    }
}