package kg.itacademy.lesson42.model;

public class City {
    private Integer id;
    private String name;
    private Integer fkCountryId;
    private Integer fkMajorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFkCountryId() {
        return fkCountryId;
    }

    public void setFkCountryId(Integer fkCountryId) {
        this.fkCountryId = fkCountryId;
    }

    public Integer getFkMajorId() {
        return fkMajorId;
    }

    public void setFkMajorId(Integer fkMajorId) {
        this.fkMajorId = fkMajorId;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fkCountryId=" + fkCountryId +
                ", fkMajorId=" + fkMajorId +
                '}';
    }
}
