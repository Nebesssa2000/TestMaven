package Test3;


import lombok.*;
import lombok.experimental.FieldDefaults;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Author(name = "Victor", dateOfCreation = 2022)
public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class personClass = Person.class;
        Class personClass2 = person.getClass();
        Class personClass3 = Class.forName("Test3.Person");

//        Method[] methods = personClass.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName());
//            System.out.println(method.getReturnType());
//            System.out.println(Arrays.toString(method.getParameterTypes()));
//        }

//        Field[] fields = personClass2.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName() + ", " + field.getType());
//        }

        Annotation[] annotations = personClass3.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) {
                System.out.println("Yes");
            }
        }
    }


}
