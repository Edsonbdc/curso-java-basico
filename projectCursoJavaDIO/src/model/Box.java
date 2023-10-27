package model;

public class Box {
    private double dayEntryValue, dayDepartureValue;

    public Box(double dayEntryValue, double dayDepartureValue) {
        this.dayEntryValue = dayEntryValue;
        this.dayDepartureValue = dayDepartureValue;
    }

    public double getDayEntryValue() {
        return dayEntryValue;
    }

    public void setDayEntryValue(double dayEntryValue) {
        this.dayEntryValue = dayEntryValue;
    }

    public double getDayDepartureValue() {
        return dayDepartureValue;
    }

    public void setDayDepartureValue(double dayDepartureValue) {
        this.dayDepartureValue = dayDepartureValue;
    }

      // está faltando implemantar os codigos
    public double weekCashValue(double value) {
        return 0;
    }

    public double monthlyCashValue(double value) {
        return 0;
    }

}
