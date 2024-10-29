package ksu.yomogi.vm.native_equipment;

import ksu.yomogi.vm.native_equipment.features.NativeIO;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class NativeExecute {

    private static final HashMap<String, Function> aFunctionMap = new HashMap<String, Function>(){
        {
            put("IO-print", NativeIO.getPrint());
        }
    };

    public static Object execute(String aClassName, String aMethodName, List<Object> anArguments) {
        Function aFunction = aFunctionMap.get(aClassName + "-" + aMethodName);
        if (aFunction != null) {
            return aFunction.apply(anArguments);
        }
        return null;
    }
}
