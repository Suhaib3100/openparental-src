package android.content.preferences.protobuf;

/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes3.dex */
class h1 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    private static final h1 f7233a = new h1();

    private h1() {
    }

    public static h1 c() {
        return f7233a;
    }

    @Override // android.content.preferences.protobuf.g2
    public f2 a(Class<?> cls) {
        if (!i1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (f2) i1.V1(cls.asSubclass(i1.class)).G1();
        } catch (Exception e6) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
        }
    }

    @Override // android.content.preferences.protobuf.g2
    public boolean b(Class<?> cls) {
        return i1.class.isAssignableFrom(cls);
    }
}
