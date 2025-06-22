// Computer.java
public class Computer {
    // Required parameters
    private String cpu;
    private String ram;

    // Optional parameters
    private String storage;
    private String graphicsCard;
    private String motherboard;
    private boolean wifiEnabled;

    // Private constructor to enforce object creation through Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.motherboard = builder.motherboard;
        this.wifiEnabled = builder.wifiEnabled;
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private String cpu;
        private String ram;

        // Optional parameters
        private String storage;
        private String graphicsCard;
        private String motherboard;
        private boolean wifiEnabled;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder motherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Builder wifiEnabled(boolean wifiEnabled) {
            this.wifiEnabled = wifiEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer {" +
               "CPU='" + cpu + '\'' +
               ", RAM='" + ram + '\'' +
               ", Storage='" + storage + '\'' +
               ", GraphicsCard='" + graphicsCard + '\'' +
               ", Motherboard='" + motherboard + '\'' +
               ", WiFi Enabled=" + wifiEnabled +
               '}';
    }
}

