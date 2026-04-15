public class TestAuction {
    public static void main(String[] args) {
        AuctionService service = new AuctionService();

        service.placeBid("A", 100);
        service.placeBid("B", 200);

        if (!service.getHighestBid().bidderName.equals("B")) {
            System.out.println("Test Failed");
        } else {
            System.out.println("Test Passed");
        }
    }
}
