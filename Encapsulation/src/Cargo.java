public class Cargo {
    private final double dimensions; // кубический метр
    private final double weight; // кг
    private final String deliveryAddress;
    private final boolean overturn;
    private final String registrationNumber;
    private final boolean breakable;

    public Cargo(double dimensions, double weight, String deliveryAddress,
                 boolean overturn, String registrationNumber, boolean breakable) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.overturn = overturn;
        this.registrationNumber = registrationNumber;
        this.breakable = breakable;
    }

    public Cargo setDimensions(double dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress, overturn, registrationNumber, breakable);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, deliveryAddress, overturn, registrationNumber, breakable);
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress, overturn, registrationNumber, breakable);
    }

    public Cargo setOverturn(boolean overturn) {
        return new Cargo(dimensions, weight, deliveryAddress, overturn, registrationNumber, breakable);
    }

    public Cargo setRegistrationNumber(String registrationNumber) {
        return new Cargo(dimensions, weight, deliveryAddress, overturn, registrationNumber, breakable);
    }

    public Cargo setBreakable(boolean breakable) {
        return new Cargo(dimensions, weight, deliveryAddress, overturn, registrationNumber, breakable);
    }

    public double getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isOverturn() {
        return overturn;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isBreakable() {
        return breakable;
    }

    public String toString() {
        return "Габрариты: " + dimensions + "\n" +
                "Вес: " + weight + "\n" +
                "Адрес доставки: " + deliveryAddress + "\n" +
                "Можно ли переворачивать: " + overturn + "\n" +
                "Регистрационный номер: " + registrationNumber + "\n" +
                "Хрупкость: " + breakable + "\n";

    }
}

