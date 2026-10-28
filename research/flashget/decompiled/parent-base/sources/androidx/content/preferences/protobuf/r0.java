package androidx.content.preferences.protobuf;

/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes3.dex */
final class r0 {

    /* renamed from: a, reason: collision with root package name */
    static final String f28931a = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    /* renamed from: b, reason: collision with root package name */
    static final Class<?> f28932b = e();

    r0() {
    }

    public static s0 a() {
        if (f28932b != null) {
            try {
                return c("newInstance");
            } catch (Exception unused) {
            }
        }
        return new s0();
    }

    public static s0 b() {
        if (f28932b != null) {
            try {
                return c("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return s0.f28943g;
    }

    private static final s0 c(String str) throws Exception {
        return (s0) f28932b.getDeclaredMethod(str, null).invoke(null, null);
    }

    static boolean d(s0 s0Var) {
        Class<?> cls = f28932b;
        return cls != null && cls.isAssignableFrom(s0Var.getClass());
    }

    static Class<?> e() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
