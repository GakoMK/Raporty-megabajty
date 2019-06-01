package pl.edu.agh.mwo.model;

public class Issue {
    private String date;
    private int hours;
    private String issueName;
    private int year = getYear();
    private int month = getMonth();

    private int getYear() {
        assert this.date != null;
        String year = this.date.substring(6, 10);
        return Integer.parseInt(year);
    }
    private int getMonth() {
        assert this.date != null;
        String month = this.date.substring(3, 5);
        return Integer.parseInt(month);
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
