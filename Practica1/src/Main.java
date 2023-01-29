public class Main {
    public static  void main(String[] args){
        User myUser = new User("cajero_202110531", "ipc1_202110531");
        Menu.validation(myUser.getUser(), myUser.getPassword());
    }
}
