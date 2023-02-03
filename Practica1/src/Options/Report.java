package Options;

public class Report extends ProductUse {
    public Report(Product product, int quantity){
        super(product, quantity);
    }

    public static Report[] listProductReport = new Report[20];

    public static Report[] getListProductReport() {
        return listProductReport;
    }

    public static void setListProductReport(Report[] listProductReport) {
        Report.listProductReport = listProductReport;
    }
}
