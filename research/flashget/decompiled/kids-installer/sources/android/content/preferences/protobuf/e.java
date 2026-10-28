package android.content.preferences.protobuf;

/* compiled from: Android.java */
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f7217a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f7218b;

    static {
        f7218b = a("org.robolectric.Robolectric") != null;
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
        return f7217a;
    }

    static boolean c() {
        return (f7217a == null || f7218b) ? false : true;
    }
}
