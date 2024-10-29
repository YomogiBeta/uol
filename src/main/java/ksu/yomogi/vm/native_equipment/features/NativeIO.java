package ksu.yomogi.vm.native_equipment.features;

import ksu.yomogi.vm.InstanceContent;

import java.util.List;
import java.util.function.Function;

final public class NativeIO {

    private static final Function<List, Boolean> aPrint = (List anArguments) -> {
        StringBuilder aStringBuilder = new StringBuilder();
        for (Object anArgument : anArguments) {
            aStringBuilder.append(NativeIO.parseObject(anArgument));
        }
        System.out.print("uol: " + aStringBuilder.toString());
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

    public static Function<List, Boolean> getPrint() {
        return aPrint;
    }
}
