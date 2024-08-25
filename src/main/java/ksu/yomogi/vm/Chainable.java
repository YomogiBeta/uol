package ksu.yomogi.vm;

import java.util.HashMap;

public interface Chainable<T> {

    public HashMap<String, T> getValuesMap();
}
