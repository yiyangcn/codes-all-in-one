package developtools.apachecommon.beanutils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.converters.ArrayConverter;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * org.apache.commons.beanutils – 核心包，定义一组Utils类和需要用到的接口规范
 *
 * org.apache.commons.beanutils.converters – 转换String到需要类型的类，实现Converter接口
 *
 * org.apache.commons.beanutils.locale –beanutils的locale敏感版本
 *
 * org.apache.commons.beanutils.locale.converters– converters的locale敏感版本
 *
 * org.apache.commons.collections – beanutils使用到的Collection类
 *
 * https://mvnrepository.com/artifact/org.apache.commons
 * https://commons.apache.org/
 */
public class BeanUtilsDemo {

    public static void main(String[] args) {
        copyTeacher();
    }


    /**
     * copyProperty
     */
    private static void copyTeacher() {
        TeacherVO teacherVO = new TeacherVO();
        teacherVO.setGender("female");
        teacherVO.setName("Alice");
        teacherVO.setWorkCode("IT0001");
        TeacherDO teacherDO = new TeacherDO();

        try {
            BeanUtils.copyProperties(teacherDO, teacherVO);
            System.out.println(teacherDO.getGender());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
