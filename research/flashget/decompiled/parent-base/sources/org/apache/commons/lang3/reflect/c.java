package org.apache.commons.lang3.reflect;

/* compiled from: InheritanceUtils.java */
/* loaded from: classes6.dex */
public class c {
    public static int a(Class<?> cls, Class<?> cls2) {
        if (cls == null || cls2 == null) {
            return -1;
        }
        if (cls.equals(cls2)) {
            return 0;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        boolean equals = cls2.equals(superclass);
        if (equals) {
            return equals ? 1 : 0;
        }
        int a5 = a(superclass, cls2) + (equals ? 1 : 0);
        if (a5 > 0) {
            return a5 + 1;
        }
        return -1;
    }
}
