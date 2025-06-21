// Main.java
public class Main {
    public static void main(String[] args) {

        // Basic computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println("Basic Configuration:");
        System.out.println(basicComputer);

        // Gaming computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();
        System.out.println("\nGaming Configuration:");
        System.out.println(gamingComputer);

        // Developer computer
        Computer devComputer = new Computer.Builder("AMD Ryzen 7", "16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Ubuntu 22.04")
                .build();
        System.out.println("\nDeveloper Configuration:");
        System.out.println(devComputer);
    }
}
