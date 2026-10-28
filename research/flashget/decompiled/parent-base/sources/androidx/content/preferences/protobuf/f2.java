package androidx.content.preferences.protobuf;

/* compiled from: MapFieldSchemas.java */
/* loaded from: classes3.dex */
final class f2 {

    /* renamed from: a, reason: collision with root package name */
    private static final d2 f28681a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final d2 f28682b = new e2();

    f2() {
    }

    static d2 a() {
        return f28681a;
    }

    static d2 b() {
        return f28682b;
    }

    private static d2 c() {
        try {
            return (d2) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
