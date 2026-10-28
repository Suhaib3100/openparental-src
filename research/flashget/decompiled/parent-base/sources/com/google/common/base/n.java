package com.google.common.base;

/* compiled from: Defaults.java */
@d9.c
@o
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Double f54970a = Double.valueOf(com.google.firebase.remoteconfig.p.f60679p);

    /* renamed from: b, reason: collision with root package name */
    private static final Float f54971b = Float.valueOf(0.0f);

    private n() {
    }

    @zc.a
    public static <T> T a(Class<T> cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return (T) (char) 0;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) f54971b;
        }
        if (cls == Double.TYPE) {
            return (T) f54970a;
        }
        return null;
    }
}
