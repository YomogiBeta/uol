package ksu.yomogi.vm.primitive_equipment.features;

import ksu.yomogi.vm.InstanceContent;
import ksu.yomogi.vm.datamanager.DataManager;

import java.util.List;
import java.util.function.BiFunction;

final public class PrimitiveIO {

    private static final BiFunction<List, DataManager, Boolean> aPrint = (List anArguments, DataManager _) -> {
        StringBuilder aStringBuilder = new StringBuilder();
        for (Object anArgument : anArguments) {
            aStringBuilder.append(PrimitiveIO.parseObject(anArgument));
        }
        System.out.print(aStringBuilder.toString());
        return true;
    };

    private static final BiFunction<List, DataManager, Boolean> aPrintln = (List anArguments, DataManager aDatamanager) -> {
        aPrint.apply(anArguments, aDatamanager);
        System.out.println();
        return true;
    };

    private static Object parseObject(Object anObject) {
        if (anObject instanceof InstanceContent anInstance) {
            if (anInstance.getParentClassName().equals("Number")) {
                return anInstance.getMembers().get("aPrimitiveValue").getValue();
            }
        }
        return anObject;
    }

    public static BiFunction<List, DataManager, Boolean> getPrint() {
        return aPrint;
    }
    public static BiFunction<List, DataManager, Boolean> getPrintln() {
        return aPrintln;
    }
}
