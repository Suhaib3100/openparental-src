package androidx.content.preferences.protobuf;

/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes3.dex */
class h1 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    private static final h1 f28689a = new h1();

    private h1() {
    }

    public static h1 c() {
        return f28689a;
    }

    @Override // androidx.content.preferences.protobuf.h2
    public g2 a(Class<?> cls) {
        if (!i1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (g2) i1.S1(cls.asSubclass(i1.class)).A1();
        } catch (Exception e4) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
        }
    }

    @Override // androidx.content.preferences.protobuf.h2
    public boolean b(Class<?> cls) {
        return i1.class.isAssignableFrom(cls);
    }
}
