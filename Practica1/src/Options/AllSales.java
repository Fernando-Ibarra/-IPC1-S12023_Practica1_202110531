package Options;

public class AllSales {
    Sale person;
    SalesProduct[] sale;

    public AllSales(Sale person, SalesProduct[] sale){
        this.person = person;
        this.sale = sale;
    }

    public Sale getPerson() {
        return person;
    }

    public void setPerson(Sale person) {
        this.person = person;
    }

    public SalesProduct[] getSale() {
        return sale;
    }

    public void setSale(SalesProduct[] sale) {
        this.sale = sale;
    }
}
