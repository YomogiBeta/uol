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
        return null;
    };

    private static final BiFunction<List, DataManager, Boolean> aPrintln = (List anArguments, DataManager aDatamanager) -> {
        aPrint.apply(anArguments, aDatamanager);
        System.out.println();
        return null;
    };

    /**
     *  仮想マシン上でのObjectを自作言語上でのインス働き方ランスの特徴に合わせてパーズする私的静的メソッド
     * @param anObject オブジェクト
     * @return
     */
    private static Object parseObject(Object anObject) {
        if (anObject instanceof InstanceContent anInstance) {
            if (anInstance.getParentClassName().equals("Number")) {
                return anInstance.getMembers().get("aPrimitiveValue").getValue();
            }
        }
        return anObject;
    }

    /**
     * 自作言語のIOクラスが持つprintメソッドの実装を応答するメソッド
     * @return メソッド
     */
    public static BiFunction<List, DataManager, Boolean> getPrint() {
        return aPrint;
    }

    /**
     * 自作言語のIOクラスが持つprintlnメソッドの実装を応答するメソッド
     * @return メソッド
     */
    public static BiFunction<List, DataManager, Boolean> getPrintln() {
        return aPrintln;
    }
}
