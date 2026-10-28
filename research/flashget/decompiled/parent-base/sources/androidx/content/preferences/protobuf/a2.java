package androidx.content.preferences.protobuf;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes3.dex */
final class a2 implements n3 {

    /* renamed from: b, reason: collision with root package name */
    private static final h2 f28625b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final h2 f28626a;

    /* compiled from: ManifestSchemaFactory.java */
    static class a implements h2 {
        a() {
        }

        @Override // androidx.content.preferences.protobuf.h2
        public g2 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.content.preferences.protobuf.h2
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    private static class b implements h2 {

        /* renamed from: a, reason: collision with root package name */
        private h2[] f28627a;

        b(h2... h2VarArr) {
            this.f28627a = h2VarArr;
        }

        @Override // androidx.content.preferences.protobuf.h2
        public g2 a(Class<?> cls) {
            for (h2 h2Var : this.f28627a) {
                if (h2Var.b(cls)) {
                    return h2Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // androidx.content.preferences.protobuf.h2
        public boolean b(Class<?> cls) {
            for (h2 h2Var : this.f28627a) {
                if (h2Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public a2() {
        this(b());
    }

    private static h2 b() {
        return new b(h1.c(), c());
    }

    private static h2 c() {
        try {
            return (h2) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f28625b;
        }
    }

    private static boolean d(g2 g2Var) {
        return g2Var.g() == e3.PROTO2;
    }

    private static <T> m3<T> e(Class<T> cls, g2 g2Var) {
        return i1.class.isAssignableFrom(cls) ? d(g2Var) ? n2.S(cls, g2Var, w2.b(), w1.b(), o3.S(), v0.b(), f2.b()) : n2.S(cls, g2Var, w2.b(), w1.b(), o3.S(), null, f2.b()) : d(g2Var) ? n2.S(cls, g2Var, w2.a(), w1.a(), o3.K(), v0.a(), f2.a()) : n2.S(cls, g2Var, w2.a(), w1.a(), o3.L(), null, f2.a());
    }

    @Override // androidx.content.preferences.protobuf.n3
    public <T> m3<T> a(Class<T> cls) {
        o3.M(cls);
        g2 a5 = this.f28626a.a(cls);
        return a5.a() ? i1.class.isAssignableFrom(cls) ? o2.m(o3.S(), v0.b(), a5.b()) : o2.m(o3.K(), v0.a(), a5.b()) : e(cls, a5);
    }

    private a2(h2 h2Var) {
        this.f28626a = (h2) p1.e(h2Var, "messageInfoFactory");
    }
}
