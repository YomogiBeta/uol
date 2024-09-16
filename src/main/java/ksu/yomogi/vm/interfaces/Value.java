package ksu.yomogi.vm.interfaces;

import ksu.yomogi.vm.datamanager.DataManager;

public interface Value<T> {

    public T value(DataManager aDataManager);
}
