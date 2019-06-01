package pl.edu.agh.mwo.model;

public class Issue {
    private String date;
    private int hours;
    private String issueName;

    public int getYear() {
        String[] splitted = getDate().split("\\.");
        return Integer.parseInt(splitted[2]);
    }
    public int getMonth() {
        String[] splitted = getDate().split("\\.");
        return Integer.parseInt(splitted[1]);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }
}
