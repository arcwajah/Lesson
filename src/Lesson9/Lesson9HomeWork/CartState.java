package Lesson9.Lesson9HomeWork;

public enum CartState {
    EXCELLENT(3),
    GOOD(2),
    BAD(1);

    CartState(int rate) {
        this.rate = rate;

    }

    private int rate;

    public int getRate() {
        return rate;
    }
}
