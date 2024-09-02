package ksu.yomogi.vm.interfaces;

import ksu.yomogi.vm.UolVisitor;
import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.errors.MissingArgumentsError;

import java.util.ArrayList;

public interface Executable {

    public UolVisitor execute(DataManager aDataManager) throws MissingArgumentsError;
    public UolVisitor execute(ArrayList<Object> anArguments, DataManager aDataManager) throws MissingArgumentsError;
}
