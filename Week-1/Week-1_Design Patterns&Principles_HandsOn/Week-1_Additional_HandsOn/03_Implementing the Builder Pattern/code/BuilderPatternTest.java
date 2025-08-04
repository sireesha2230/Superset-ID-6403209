// Testing the builder setup with different types of computers
public class BuilderPatternTest {
    public static void main(String[] args) {
        
        // Just a basic machine setup with CPU and RAM only
        Computer officePC = new Computer.Builder("Intel i5", "8GB")
                              .build();

        // This one is a full power-packed gaming machine
        Computer gamingPC = new Computer.Builder("Ryzen 9", "32GB")
                              .disk("1TB SSD")
                              .gpu("RTX 4070")
                              .board("MSI B550")
                              .wifiSupport(true)
                              .build();

        // Output both configurations to check what we got
        System.out.println("Office PC: " + officePC);
        System.out.println("Gaming PC: " + gamingPC);
    }
}
