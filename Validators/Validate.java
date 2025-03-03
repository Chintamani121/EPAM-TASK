package jml2.Task1.Validators;
import jml2.Task1.Annotations.AlwaysPositive;
import jml2.Task1.Annotations.NotBlank;
import jml2.Task1.Annotations.NotNull;
import java.lang.reflect.Field;

public class Validate{
    public static void validate(Object obj) {
        Class<?> clazz = obj.getClass();
        while (clazz != null && clazz != Object.class) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                try {
                    Object value = field.get(obj);
                    if (value == null) {
                        NotNull annotation = field.getAnnotation(NotNull.class);
                        throw new IllegalArgumentException(annotation.message() + " - " + field.getName());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Failed to access field: " + field.getName(), e);
                }
            } else if (field.isAnnotationPresent(AlwaysPositive.class)) {
                field.setAccessible(true);
                try {
                    double value = (double) field.get(obj);
                    if (value < 0) {
                        AlwaysPositive annotation = field.getAnnotation(AlwaysPositive.class);
                        throw new IllegalArgumentException(annotation.message() + " - " + field.getName());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Failed to access field: " + field.getName(), e);
                }
            } else if (field.isAnnotationPresent(NotBlank.class)) {
                field.setAccessible(true);
                try {
                    String value = (String) field.get(obj);
                    if (value.isBlank()) {
                        NotBlank annotation = field.getAnnotation(NotBlank.class);
                        throw new IllegalArgumentException(annotation.message() + " - " + field.getName());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Failed to access field: " + field.getName(), e);
                }
            }
            if(clazz!=null) clazz=clazz.getSuperclass();
        }
        }
    }
}
