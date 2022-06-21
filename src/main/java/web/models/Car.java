package web.models;

public class Car {

    private Long id;

    private String model;

    private Integer power;

    public Car() {
    }

    public Car(Long id, String model, Integer power) {
        this.id = id;
        this.model = model;
        this.power = power;
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

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return model + "  " + power + " l.s.";
    }
}
