import java.util.Scanner;

public class Menu {

    public static void validation(String userU, String passwordU){
        Scanner sc = new Scanner(System.in);
        String user;
        String password;

        System.out.println(" $$$$$$\\  $$\\   $$\\ $$$$$$$\\  $$$$$$$$\\ $$$$$$$\\                       $$$$$$\\  $$$$$$$\\  \n" +
                "$$  __$$\\ $$ |  $$ |$$  __$$\\ $$  _____|$$  __$$\\                     $$  __$$\\ $$  ____| \n" +
                "$$ /  \\__|$$ |  $$ |$$ |  $$ |$$ |      $$ |  $$ |                    \\__/  $$ |$$ |      \n" +
                "\\$$$$$$\\  $$ |  $$ |$$$$$$$  |$$$$$\\    $$$$$$$  |      $$$$$$\\        $$$$$$  |$$$$$$$\\  \n" +
                " \\____$$\\ $$ |  $$ |$$  ____/ $$  __|   $$  __$$<       \\______|      $$  ____/ \\_____$$\\ \n" +
                "$$\\   $$ |$$ |  $$ |$$ |      $$ |      $$ |  $$ |                    $$ |      $$\\   $$ |\n" +
                "\\$$$$$$  |\\$$$$$$  |$$ |      $$$$$$$$\\ $$ |  $$ |                    $$$$$$$$\\ \\$$$$$$  |\n" +
                " \\______/  \\______/ \\__|      \\________|\\__|  \\__|                    \\________| \\______/");

        System.out.println(" ----------------------------- Bienvenido --------------------------------------- ");
        System.out.println("    Ingresa tu usuario");
        user = sc.nextLine();
        System.out.println("    Ingresa tu contraseña ");
        password = sc.nextLine();

        if (userU.equals(user) && passwordU.equals(password)){
            System.out.println("Usuario y contraseña correcta");
            showMenu();
        } else {
            System.out.println("Usuario o contraseña incorrecta");
            System.out.println("Vuelve a intentarlo");
            validation(userU, passwordU);
        }

    }

    public static void showMenu(){
        System.out.println(" MENU 2");
    }
}
