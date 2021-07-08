package kg.itacademy.lesson39.model;

public class Students {
    private Integer id;
    private String name;
    private String surname;
    private String patronymic;
    private Boolean has_scholarship;
    private Integer fk_group_id;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Boolean getHas_scholarship() {
        return has_scholarship;
    }

    public void setHas_scholarship(Boolean has_scholarship) {
        this.has_scholarship = has_scholarship;
    }

    public Integer getFk_group_id() {
        return fk_group_id;
    }

    public void setFk_group_id(Integer fk_group_id) {
        this.fk_group_id = fk_group_id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", has_scholarship=" + has_scholarship +
                ", fk_group_id=" + fk_group_id +
                '}';
    }
}
