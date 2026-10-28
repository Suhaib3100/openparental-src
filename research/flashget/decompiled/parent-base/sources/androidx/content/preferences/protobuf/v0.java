package androidx.content.preferences.protobuf;

/* compiled from: ExtensionSchemas.java */
/* loaded from: classes3.dex */
final class v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final t0<?> f28991a = new u0();

    /* renamed from: b, reason: collision with root package name */
    private static final t0<?> f28992b = c();

    v0() {
    }

    static t0<?> a() {
        t0<?> t0Var = f28992b;
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static t0<?> b() {
        return f28991a;
    }

    private static t0<?> c() {
        try {
            return (t0) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
