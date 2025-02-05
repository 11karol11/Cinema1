import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("świt świt", "bocheńska");

        Room room12 = new Room("5", 45);

        cinema.addRoom(room12);

        Movie movie = new Movie("strachy", 90);
        Repertory repertory = new Repertory(movie, LocalDateTime.now().plusDays(5),true, false);
        room12.addRepertory(repertory);

        Customer customer = new Customer("Czesław Wielki");
        Ticket ticket = repertory.addSeat(customer);
        if (ticket != null) {
            customer.addTicket(ticket);
            System.out.println("Ticket have bought for movie: " + ticket.getRepertory().getMovie().name);
            System.out.println("Name and surname: " + customer);
        } else {
            System.out.println("Seats are not available");
        }


    }
}