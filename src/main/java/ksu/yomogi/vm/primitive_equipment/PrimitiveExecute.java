package ksu.yomogi.vm.primitive_equipment;

import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.primitive_equipment.features.PrimitiveIO;

import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;

final public class PrimitiveExecute {

    private static final HashMap<String, BiFunction> aFunctionMap = new HashMap<String, BiFunction>(){
        {
            put("IO-print", PrimitiveIO.getPrint());
            put("IO-println", PrimitiveIO.getPrintln());
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
