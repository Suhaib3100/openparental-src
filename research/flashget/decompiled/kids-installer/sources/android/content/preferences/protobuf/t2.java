package android.content.preferences.protobuf;

/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes.dex */
final class t2 {

    /* renamed from: a, reason: collision with root package name */
    private static final r2 f7527a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final r2 f7528b = new s2();

    t2() {
    }

    static r2 a() {
        return f7527a;
    }

    static r2 b() {
        return f7528b;
    }

    private static r2 c() {
        try {
            return (r2) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
