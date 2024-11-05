package ksu.yomogi.vm.native_equipment.features;

import ksu.yomogi.vm.InstanceContent;
import ksu.yomogi.vm.UolVisitor;
import ksu.yomogi.vm.datamanager.DataManager;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

final public class NativeYou {

    private static final BiFunction<List, DataManager, Object> aExecute = (List anArguments, DataManager aDatamanager) -> {
        String aKey = (String) anArguments.get(0);
        InstanceContent anInstance = (InstanceContent) aDatamanager.getBeforeStackTraceInstance();
        aDatamanager.removeDataMapContent(DataManager.ARGUMENT_LIST);
        return anInstance.execute(aKey, new ArrayList<>(), aDatamanager).getReturnValue();
    };

    public static BiFunction<List, DataManager, Object> getExecute() {
        return aExecute;
    }
}
