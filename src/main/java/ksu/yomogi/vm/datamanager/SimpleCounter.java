package ksu.yomogi.vm.datamanager;

import java.util.Objects;

public class SimpleCounter extends Object {

    private Integer aCounter;

    public SimpleCounter() {
        this.aCounter = 0;
    }

    public Integer getCount() {
        return this.aCounter;
    }

    public void increment() {
        this.aCounter++;
    }

    public void decrement() {
        this.aCounter--;
    }

    public void reset() {
        this.aCounter = 0;
    }

    public String toString() {
        return Integer.toString(this.aCounter);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SimpleCounter anOther) {
            return Objects.equals(this.aCounter, anOther.getCount());
        }
        return false;
    }

    public int hashCode() {
        return this.aCounter;
    }
}
