public class Ticket {
    private Customer customer;
    private Repertory repertory;

    public Ticket(Customer customer, Repertory repertory){
        this.customer = customer;
        this.repertory = repertory;
    }
    public Repertory getRepertory(){
    return repertory;
    }
}
