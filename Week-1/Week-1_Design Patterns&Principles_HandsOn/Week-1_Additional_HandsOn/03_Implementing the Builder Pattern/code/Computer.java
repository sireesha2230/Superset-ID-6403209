// This class is for building a custom computer setup with both required and optional parts.
public class Computer {
    
    // Must-have parts
    private String processor;
    private String memory;

    // Optional parts
    private String disk;
    private String gpu;
    private String board;
    private boolean wifiSupport;

    // constructor is private so I can only build it through the builder
    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.memory = builder.memory;
        this.disk = builder.disk;
        this.gpu = builder.gpu;
        this.board = builder.board;
        this.wifiSupport = builder.wifiSupport;
    }

    // static nested class to help me build different types of computers
    public static class Builder {
        // need these two for sure
        private String processor;
        private String memory;

        // optional ones, user can skip or set
        private String disk;
        private String gpu;
        private String board;
        private boolean wifiSupport;

        // constructor with only required fields
        public Builder(String processor, String memory) {
            this.processor = processor;
            this.memory = memory;
        }

        // if I want to add storage
        public Builder disk(String disk) {
            this.disk = disk;
            return this;
        }

        // for GPU setup
        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        // motherboard setter
        public Builder board(String board) {
            this.board = board;
            return this;
        }

        // wifi yes or no
        public Builder wifiSupport(boolean wifiSupport) {
            this.wifiSupport = wifiSupport;
            return this;
        }

        // finally this returns the built object
        public Computer build() {
            return new Computer(this);
        }
    }

    // printing the details when I call System.out.println
    @Override
    public String toString() {
        return "Computer Config => " +
               "Processor: '" + processor + '\'' +
               ", RAM: '" + memory + '\'' +
               ", Storage: '" + disk + '\'' +
               ", Graphics: '" + gpu + '\'' +
               ", Motherboard: '" + board + '\'' +
               ", WiFi: " + wifiSupport;
    }
}
