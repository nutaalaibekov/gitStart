package kg.itacademy.exam3.task4;

public enum Language {
    RUSSIAN("RU"),
    KYRGYZ("KY"),
    ENGLISH("EN");

    private String code;

    Language(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
