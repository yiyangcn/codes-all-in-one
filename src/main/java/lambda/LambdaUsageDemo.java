package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaUsageDemo {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("1");
        strList.add("2");
        strList.add("3");
        // 输出
        strList.forEach( n -> System.out.println(n));
        strList.forEach(System.out::println);



        // 使用惰性求值获得链 再使用及早求值获得集合
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person();
        person1.setName("Alice");
        person1.setGender("female");
        Person person2 = new Person();
        person2.setName("Tom");
        person2.setGender("male");
        personList.add(person1);
        personList.add(person2);
        // 获取name为”Tom“的集合
        List<Person> filterPersonList = personList.stream().filter(f -> f.getName().equals("Tom")).collect(Collectors.toList());
        filterPersonList.forEach(person -> System.out.println("name:" + person.getName()));
        // 顺序执行
        personList.stream().collect(Collectors.toList());
        // 并行 不同线程一起执行
        personList.stream().parallel().collect(Collectors.toList());
        // 将集合类元素进行转换
        personList.stream().map( p-> new Person()).collect(Collectors.toList()).forEach(person -> System.out.println("name:" + person.getName()));

    }
}
