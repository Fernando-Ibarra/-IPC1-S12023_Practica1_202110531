package Options;

public class Ticket {
    String name;
    int value;

    public Ticket(String name, int value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }

    static Ticket[] listTickest = new Ticket[20];

    public static Ticket[] getListTickest() {
        return listTickest;
    }

    public static void setListTickest(Ticket[] listTickest) {
        Ticket.listTickest = listTickest;
    }

    public static void addTicketToArray(Ticket myTicket){
        for (int i=0; i<= listTickest.length;  i++){
            if (listTickest[i] != null){
                break;
            }
            if (listTickest[i] == null){
                listTickest[i] = myTicket;
                break;
            }
        }
    }

}
