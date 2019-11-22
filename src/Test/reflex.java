package Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflex {
    public static void main(String[] args) throws Exception {
        System.out.println(getProperty(new Person1("zhangsan"),"name"));
        printStr();
    }
    //写一个方法，此方法可以获取obj对象中名为propertyName的属性的值
    public static Object getProperty(Object obj, String propertyName)throws Exception {
        Class c =obj.getClass();
        Field f =c.getDeclaredField(propertyName);
        f.setAccessible(true);
        Object fValue = f.get(obj);
        return fValue;
    }
    //  编写一个类，增加一个实例方法用于打印一条字符串。并使用反射手段创建该类的对象，
    //  并调用该对象中的方法。
    private static void printStr() throws Exception {
        Class c = Class.forName("Test.Person");
        Object p = c.newInstance();

        Method method = c.getMethod("print");

        method.invoke(p);
    }
}
class Person1{
    private String name = "小明";

    public void print(){
        System.out.println(this.name);
    }

    public Person1() {
    }

    public Person1(String name) {
        this.name = name;
    }
}
