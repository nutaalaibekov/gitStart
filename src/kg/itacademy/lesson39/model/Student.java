package kg.itacademy.lesson39.model;

public class Student {
    private Integer id;
    private String fullName;
    private Integer fkGroupId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getFkGroupId() {
        return fkGroupId;
    }

    public void setFkGroupId(Integer fkGroupId) {
        this.fkGroupId = fkGroupId;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", fkGroupId=" + fkGroupId +
                '}';
    }
}
