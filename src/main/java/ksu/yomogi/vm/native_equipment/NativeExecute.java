package ksu.yomogi.vm.native_equipment;

import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.native_equipment.features.NativeIO;
import ksu.yomogi.vm.native_equipment.features.NativeYou;

import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;

public class NativeExecute {

    private static final HashMap<String, BiFunction> aFunctionMap = new HashMap<String, BiFunction>(){
        {
            put("IO-print", NativeIO.getPrint());
            put("You-execute", NativeYou.getExecute());
        }
    };

    public static Object execute(String aClassName, String aMethodName, List<Object> anArguments, DataManager aDataManager) {
        BiFunction aFunction = aFunctionMap.get(aClassName + "-" + aMethodName);
        if (aFunction != null) {
            return aFunction.apply(anArguments, aDataManager);
        }
        return null;
    }
}
