package android.content.preferences.protobuf;

/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes.dex */
final class r0 {

    /* renamed from: a, reason: collision with root package name */
    static final String f7494a = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    /* renamed from: b, reason: collision with root package name */
    static final Class<?> f7495b = e();

    r0() {
    }

    public static s0 a() {
        if (f7495b != null) {
            try {
                return c("newInstance");
            } catch (Exception unused) {
            }
        }
        return new s0();
    }

    public static s0 b() {
        if (f7495b != null) {
            try {
                return c("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return s0.f7505g;
    }

    private static final s0 c(String str) throws Exception {
        return (s0) f7495b.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    static boolean d(s0 s0Var) {
        Class<?> cls = f7495b;
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
