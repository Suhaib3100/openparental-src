package org.apache.commons.lang3;

/* compiled from: ClassPathUtils.java */
/* loaded from: classes6.dex */
public class p {
    public static String a(Class<?> cls, String str) {
        k1.b0(cls, "Parameter '%s' must not be null!", "context");
        k1.b0(str, "Parameter '%s' must not be null!", "resourceName");
        return b(cls.getPackage(), str);
    }

    public static String b(Package r22, String str) {
        k1.b0(r22, "Parameter '%s' must not be null!", "context");
        k1.b0(str, "Parameter '%s' must not be null!", "resourceName");
        return r22.getName() + "." + str;
    }

    public static String c(Class<?> cls, String str) {
        k1.b0(cls, "Parameter '%s' must not be null!", "context");
        k1.b0(str, "Parameter '%s' must not be null!", "resourceName");
        return d(cls.getPackage(), str);
    }

    public static String d(Package r32, String str) {
        k1.b0(r32, "Parameter '%s' must not be null!", "context");
        k1.b0(str, "Parameter '%s' must not be null!", "resourceName");
        return r32.getName().replace('.', '/') + "/" + str;
    }
}
