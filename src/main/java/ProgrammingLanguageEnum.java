public enum ProgrammingLanguageEnum {

    CSHARP("C#"),
    JAVA("Java"),
    PYTHON("Python"),
    JAVASCRIPT("JavaScript");

    private final String languageName;

    ProgrammingLanguageEnum(String languageName) {
        this.languageName = languageName;
    }

    public String getLanguageName() {
        return languageName;
    }
}
