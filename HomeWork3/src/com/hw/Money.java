package com.hw;

public class Money {
    private long hryvnias;
    private byte kopecks;

    public Money(long hryvnias, byte kopecks) {
        this.hryvnias = hryvnias;
        this.kopecks = kopecks;
    }

    public long getHryvnias() {
        return hryvnias;
    }

    public byte getKopecks() {
        return kopecks;
    }

    public Money addMoney(Money moneyInput) {

        long hryvniasAddition = hryvnias + moneyInput.getHryvnias();
        byte kopecksAddition = (byte) (kopecks + moneyInput.getKopecks());

        if (kopecksAddition > 99) {
            hryvniasAddition++;
            kopecksAddition = (byte) (kopecksAddition - 100);
        }

        if (kopecksAddition < 0) {
            hryvniasAddition--;
            kopecksAddition = (byte) (kopecksAddition + 100);
        }

        return new Money(hryvniasAddition, kopecksAddition);
    }

    public Money subtractionMoney(Money moneyInput) {
        long hryvniasSubtraction = hryvnias - moneyInput.getHryvnias();
        byte kopecksSubtraction = (byte) (kopecks - moneyInput.getKopecks());
        if (kopecksSubtraction > 99) {
            hryvniasSubtraction++;
            kopecksSubtraction = (byte) (kopecksSubtraction - 100);
        }

        if (kopecksSubtraction < 0) {
            hryvniasSubtraction--;
            kopecksSubtraction = (byte) (kopecksSubtraction + 100);
        }

        return new Money(hryvniasSubtraction, kopecksSubtraction);
    }

    public double divisionOfSums(Money moneyInput) {
        double hryvniasInKopecks1 = hryvnias * 100 + kopecks;
        double hryvniasInKopecks2 = moneyInput.getHryvnias() * 100 + moneyInput.getKopecks();
        return hryvniasInKopecks1 / hryvniasInKopecks2;
    }

    public Money divisionByFractionalNumber(double fractionalNumber) {
        double sumInKopecks = hryvnias * 100 + kopecks;
        double result = sumInKopecks / fractionalNumber;
        return new Money((long) result / 100, (byte) (result % 100));
    }

    public Money multiplyByFractionalNumber(double fractionalNumber) {
        double sumInKopecks = hryvnias * 100 + kopecks;
        double result = sumInKopecks * fractionalNumber;
        return new Money((long) result / 100, (byte) (result % 100));
    }

    public boolean isLess(Money moneyInput) {
        double sumInKopecks1 = hryvnias * 100 + kopecks;
        double sumInKopecks2 = moneyInput.getHryvnias() * 100 + moneyInput.getKopecks();
        if (sumInKopecks1 >= sumInKopecks2) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return hryvnias == money.hryvnias && kopecks == money.kopecks;
    }

    @Override
    public String toString() {
        if (kopecks > 9) {
            return hryvnias + "," + kopecks;
        } else {
            return hryvnias + ",0" + kopecks;
        }
    }
}
