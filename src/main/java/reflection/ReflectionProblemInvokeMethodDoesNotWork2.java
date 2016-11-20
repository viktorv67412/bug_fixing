package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionProblemInvokeMethodDoesNotWork2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException, ClassNotFoundException {

        Class userClass = Class.forName(User.class.getName());

        User user = (User) userClass.newInstance();

        Field field = userClass.getDeclaredField("veryImportantField");
        field.setAccessible(true);
        field.set(user, "newValueForVeryImportantField");

        System.out.println("after changes --->>>> " + user.getVeryImportantField());

        Method method = userClass.getDeclaredMethod("verySecurityMethod");
        method.setAccessible(true);
        method.invoke(user);
    }
}
