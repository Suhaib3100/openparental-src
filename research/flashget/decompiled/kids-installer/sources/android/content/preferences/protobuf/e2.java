package android.content.preferences.protobuf;

/* compiled from: MapFieldSchemas.java */
/* loaded from: classes.dex */
final class e2 {

    /* renamed from: a, reason: collision with root package name */
    private static final c2 f7222a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final c2 f7223b = new d2();

    e2() {
    }

    static c2 a() {
        return f7222a;
    }

    static c2 b() {
        return f7223b;
    }

    private static c2 c() {
        try {
            return (c2) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
