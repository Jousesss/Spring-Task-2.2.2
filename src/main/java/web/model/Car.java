package web.model;

public class Car {
    private static Long counter = 0l;
    private Long id;
    private String model;
    private String plate;

    public Car(String model, String plate) {
        this.id = counter++;
        this.model = model;
        this.plate = plate;
    }

    public Car() {
        this.id = counter++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
