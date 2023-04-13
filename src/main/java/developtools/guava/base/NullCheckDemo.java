package developtools.guava.base;



import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NullCheckDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // List 有可能为空 使用optional可以迫使我们积极思考 任何可能返回为空值的数据
        Optional<List<String>> possible = Optional.of(list);
        // 如果null or empty 出现 返回true
        System.out.println(possible.isPresent());
        // empty to null
        System.out.println(Strings.emptyToNull(""));
        //

    }


}
