package phoneshop;

public class Device {
    private String model;

    public Device(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDeviceType() {
        return "Unknown";
    }
}
