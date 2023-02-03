package Options;

public class Ticket {
    String name;
    double value;

    public Ticket(String name, int value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public static Ticket[] listTickest = new Ticket[20];

    public static void addTicketToArray(Ticket myTicket){
        for (int i=0; i<= listTickest.length;  i++){
            if (listTickest[i] != null){
                break;
            }
            listTickest[i] = myTicket;
            break;
        }
    }

}
