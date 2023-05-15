
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        if (this.day < 30) {
            this.day = this.day + 1;
        } else {
            this.day = 1;
            this.month = this.month + 1;
        }
        if (this.month > 12) {
            this.month = 1;
            this.year = this.year + 1;
        }
    }
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate cloneDate = new SimpleDate(this.day, this.month, this.year);
        for (int i = 0; i < days; i++) {
            cloneDate.advance();
        }
        return cloneDate;
    }
    public void advance(int howManyDays) {

        if (this.day < 30) {
            this.day = this.day + howManyDays;
        }
        if (this.day >= 30) {
            int remainder = howManyDays;
            System.out.println(remainder);
            this.day = 0 + remainder;
            this.month = this.month + 1;
        }
        if (this.month > 12) {
            this.month = 1;
            this.year = this.year + 1;
        }
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
