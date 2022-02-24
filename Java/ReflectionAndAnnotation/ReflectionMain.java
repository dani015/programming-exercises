import pr0304Barracks.models.units.Archer;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class ReflectionMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        Archer archer = new Archer();
        String name = archer.getClass().getName();
        String simpleName = archer.getClass().getSimpleName();

        Class clazz = Class.forName(name);
        System.out.println(clazz);

        System.out.println(clazz.getSuperclass());
        Arrays.stream(clazz.getInterfaces()).forEach(System.out::println);

        Constructor constructor = clazz.getConstructors()[0];

        Archer archer1 = (Archer) constructor.newInstance();

        System.out.println(archer1.getAttackDamage());

        Class reflectionClazz = Class.forName("ReflectionTest");
        System.out.println(reflectionClazz);
        Arrays.stream(reflectionClazz.getTypeParameters()).forEach(System.out::println);

        Method[] declaredMethods = reflectionClazz.getDeclaredMethods();

        TreeSet<Method> getterMethods = new TreeSet<>(Comparator.comparing(Method::getName));
        TreeSet<Method> setterMethods = new TreeSet<>(Comparator.comparing(Method::getName));

        for (Method method : declaredMethods) {
            if(method.getName().startsWith("get")) {
                if (method.getParameterCount() == 0) {
                    getterMethods.add(method);
                }
            } else if(method.getName().startsWith("set")) {
                if(method.getParameterCount() == 1){
                    if(void.class.equals(method.getReturnType())) {
                        setterMethods.add(method);
                    }
                }
            }
        }

        getterMethods.forEach(m -> System.out.println(m.getModifiers() + " " + m));
        setterMethods.forEach(System.out::println);

        getterMethods
                .stream()
                .filter(m -> !Modifier.isPublic(m.getModifiers()))
                .forEach(m ->
                        System.out.println(m.getName() + " have to be public"));

        setterMethods
                .stream()
                .filter(m -> !Modifier.isPrivate(m.getModifiers()))
                .forEach(m ->
                        System.out.println(m.getName() + " have to be private"));

        Arrays.stream(reflectionClazz.getDeclaredFields())
               .filter(f -> !Modifier.isPrivate(f.getModifiers()))
               .forEach(m ->
                       System.out.println(m.getName() + " have to be private"));

        @SuppressWarnings("unchecked")
        Method getName = reflectionClazz.getDeclaredMethod("getName");

        Annotation[] declaredAnnotations = getName.getDeclaredAnnotations();

        for (Annotation annotation : declaredAnnotations) {
            System.out.println(annotation);
        }

        Author author = getName.getAnnotation(Author.class);

        System.out.println(author.name());
    }
}
