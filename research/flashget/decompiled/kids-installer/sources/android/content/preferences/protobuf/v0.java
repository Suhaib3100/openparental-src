package android.content.preferences.protobuf;

/* compiled from: ExtensionSchemas.java */
/* loaded from: classes.dex */
final class v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final t0<?> f7533a = new u0();

    /* renamed from: b, reason: collision with root package name */
    private static final t0<?> f7534b = c();

    v0() {
    }

    static t0<?> a() {
        t0<?> t0Var = f7534b;
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static t0<?> b() {
        return f7533a;
    }

    private static t0<?> c() {
        try {
            return (t0) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
