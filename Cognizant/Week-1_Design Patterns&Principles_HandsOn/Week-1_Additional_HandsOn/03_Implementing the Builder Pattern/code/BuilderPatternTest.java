// BuilderPatternTest.java
public class BuilderPatternTest {
    public static void main(String[] args) {
        // Basic configuration
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                                  .build();

        // Full configuration
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", "32GB")
                                  .storage("1TB SSD")
                                  .graphicsCard("NVIDIA RTX 4070")
                                  .motherboard("MSI B550")
                                  .wifiEnabled(true)
                                  .build();

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}

