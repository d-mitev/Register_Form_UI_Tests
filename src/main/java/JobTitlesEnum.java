public enum JobTitlesEnum {

    QA("QA"),
    DEVELOPER("Developer"),
    AUTOMATIONQA("Automation QA"),
    UIUXDESIGNER("UI/UX Desing");

    private final String jobTitle;

    JobTitlesEnum(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
