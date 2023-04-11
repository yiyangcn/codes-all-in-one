package jvm.asm;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 直接修改class直接修改指定类的内容
 * 参考：https://www.pdai.tech/md/java/jvm/java-jvm-class-enhancer.html
 */
public class AsmDemo {

    public static void main(String[] args) throws Exception {
        //读取
        ClassReader classReader = new ClassReader("jvm/asm/ModifiedClass");
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        //处理
        ClassVisitor classVisitor = new MyClassVisitor(classWriter);
        classReader.accept(classVisitor, ClassReader.SKIP_DEBUG);
        byte[] data = classWriter.toByteArray();
        //输出
        File f = new File("target/classes/jvm/asm/ModifiedClass.class");
        FileOutputStream fout = new FileOutputStream(f);
        fout.write(data);
        fout.close();
        System.out.println("now generator cc success!!!!!");
    }

}
