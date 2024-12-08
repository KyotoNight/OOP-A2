public class Visitor extends Person {
    private String ticketType;
    private boolean isVIP;
    
    public Visitor() {
        super();
        this.ticketType = "";
        this.isVIP = false;
    }
    
    public Visitor(String name, int age, String id, String ticketType, boolean isVIP) {
        super(name, age, id);
        this.ticketType = ticketType;
        this.isVIP = isVIP;
    }
    
    // Getters and setters
    public String getTicketType() {
        return ticketType;
    }
    
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    
    public boolean isVIP() {
        return isVIP;
    }
    
    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }
} 