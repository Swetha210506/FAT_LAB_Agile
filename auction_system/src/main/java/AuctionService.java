import java.util.*;

class Bid {
    String bidderName;
    double amount;

    public Bid(String bidderName, double amount) {
        this.bidderName = bidderName;
        this.amount = amount;
    }
}

public class AuctionService {
    private List<Bid> bids = new ArrayList<>();

    public void placeBid(String bidder, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid bid");
        }
        bids.add(new Bid(bidder, amount));
    }

    public Bid getHighestBid() {
        return Collections.max(bids, Comparator.comparingDouble(b -> b.amount));
    }

    public static void main(String[] args) {
        AuctionService service = new AuctionService();
        service.placeBid("Alice", 100);
        service.placeBid("Bob", 200);

        System.out.println("Highest Bidder: " + service.getHighestBid().bidderName);
    }
}
