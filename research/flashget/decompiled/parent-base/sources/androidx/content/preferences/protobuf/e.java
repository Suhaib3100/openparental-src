package androidx.content.preferences.protobuf;

/* compiled from: Android.java */
/* loaded from: classes3.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f28672a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f28673b;

    static {
        f28673b = a("org.robolectric.Robolectric") != null;
    }

    e() {
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f28672a;
    }

    static boolean c() {
        return (f28672a == null || f28673b) ? false : true;
    }
}
