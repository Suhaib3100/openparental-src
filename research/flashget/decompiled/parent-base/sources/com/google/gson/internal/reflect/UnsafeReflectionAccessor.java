package com.google.gson.internal.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
final class UnsafeReflectionAccessor extends ReflectionAccessor {
    private static Class unsafeClass;
    private final Object theUnsafe = getUnsafeInstance();
    private final Field overrideField = getOverrideField();

    UnsafeReflectionAccessor() {
    }

    private static Field getOverrideField() {
        try {
            return AccessibleObject.class.getDeclaredField(ProtectedSandApp.s("ٙ\u0001"));
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object getUnsafeInstance() {
        try {
            Class<?> cls = Class.forName(ProtectedSandApp.s("ٚ\u0001"));
            unsafeClass = cls;
            Field declaredField = cls.getDeclaredField(ProtectedSandApp.s("ٛ\u0001"));
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.gson.internal.reflect.ReflectionAccessor
    public void makeAccessible(AccessibleObject accessibleObject) {
        if (makeAccessibleWithUnsafe(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e4) {
            throw new JsonIOException(ProtectedSandApp.s("ٜ\u0001") + accessibleObject + ProtectedSandApp.s("ٝ\u0001"), e4);
        }
    }

    boolean makeAccessibleWithUnsafe(AccessibleObject accessibleObject) {
        if (this.theUnsafe == null || this.overrideField == null) {
            return false;
        }
        try {
            Long l4 = (Long) unsafeClass.getMethod(ProtectedSandApp.s("ٞ\u0001"), Field.class).invoke(this.theUnsafe, this.overrideField);
            l4.longValue();
            unsafeClass.getMethod(ProtectedSandApp.s("ٟ\u0001"), Object.class, Long.TYPE, Boolean.TYPE).invoke(this.theUnsafe, accessibleObject, l4, Boolean.TRUE);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
