package androidx.content.preferences.protobuf;

/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes3.dex */
final class w2 {

    /* renamed from: a, reason: collision with root package name */
    private static final u2 f29025a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final u2 f29026b = new v2();

    w2() {
    }

    static u2 a() {
        return f29025a;
    }

    static u2 b() {
        return f29026b;
    }

    private static u2 c() {
        try {
            return (u2) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
