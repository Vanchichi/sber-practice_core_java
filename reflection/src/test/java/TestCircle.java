import org.testng.annotations.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class TestCircle {
    private static final Circle CIRCLE = new Circle(3.0,"Black","Small circle");
    private static final Class<?> TEST_CLASS =CIRCLE.getClass();
    @Test
    public void firstTest() throws IllegalAccessException, NoSuchFieldException{
        Field privateField = TEST_CLASS.getDeclaredField("nameCircle");
        privateField.setAccessible(true);
        privateField.setDouble(CIRCLE, 3.1);
        System.out.println(privateField.getDouble(CIRCLE));
        System.out.println(TEST_CLASS.getDeclaredField("radius").getName());
        System.out.println(TEST_CLASS.getDeclaredField("color").getType());
    }
    @Test
    public void secondTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method privateMethod=TEST_CLASS.getDeclaredMethod("area");
        privateMethod.setAccessible(true);
        System.out.println(privateMethod.invoke(CIRCLE));
        for (Method m : TEST_CLASS.getSuperclass().getDeclaredMethods()) {
            System.out.println("Method " + m.getName());
        }
        Class[] exceptions = privateMethod.getExceptionTypes();
        for (Class e : exceptions) {
            System.out.println("Exception " + e.getSimpleName());
        }
    }
    @Test
    public void thirdTest() throws Exception {
        Constructor<Circle> publicConstructor = Circle.class.getDeclaredConstructor(String.class, String.class, double.class);
        System.out.println(publicConstructor);

        Constructor<Circle> privateConstructor = Circle.class.getDeclaredConstructor(String.class, double.class);
        privateConstructor.setAccessible(true);
        Circle circle = privateConstructor.newInstance("Pink", 0.9);

        Class[] types = publicConstructor.getParameterTypes();
        for (Class t : types) {
            System.out.println("radius"+ t.getName());
        }
    }
}
