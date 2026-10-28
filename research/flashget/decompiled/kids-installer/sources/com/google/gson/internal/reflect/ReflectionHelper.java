package com.google.gson.internal.reflect;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes5.dex */
public class ReflectionHelper {
    private ReflectionHelper() {
    }

    private static String constructorToString(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        sb.append('#');
        sb.append(constructor.getDeclaringClass().getSimpleName());
        sb.append('(');
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        for (int i5 = 0; i5 < parameterTypes.length; i5++) {
            if (i5 > 0) {
                sb.append(ProtectedSandApp.s("㒦"));
            }
            sb.append(parameterTypes[i5].getSimpleName());
        }
        sb.append(')');
        return sb.toString();
    }

    public static void makeAccessible(Field field) throws JsonIOException {
        try {
            field.setAccessible(true);
        } catch (Exception e6) {
            throw new JsonIOException(ProtectedSandApp.s("㒧") + field.getDeclaringClass().getName() + ProtectedSandApp.s("㒨") + field.getName() + ProtectedSandApp.s("㒩"), e6);
        }
    }

    public static String tryMakeAccessible(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e6) {
            return ProtectedSandApp.s("㒪") + constructorToString(constructor) + ProtectedSandApp.s("㒫") + e6.getMessage();
        }
    }
}
