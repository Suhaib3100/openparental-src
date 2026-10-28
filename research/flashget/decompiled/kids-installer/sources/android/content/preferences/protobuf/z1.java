package android.content.preferences.protobuf;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes3.dex */
final class z1 implements k3 {

    /* renamed from: b, reason: collision with root package name */
    private static final g2 f7669b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final g2 f7670a;

    /* compiled from: ManifestSchemaFactory.java */
    static class a implements g2 {
        a() {
        }

        @Override // android.content.preferences.protobuf.g2
        public f2 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // android.content.preferences.protobuf.g2
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    private static class b implements g2 {

        /* renamed from: a, reason: collision with root package name */
        private g2[] f7671a;

        b(g2... g2VarArr) {
            this.f7671a = g2VarArr;
        }

        @Override // android.content.preferences.protobuf.g2
        public f2 a(Class<?> cls) {
            for (g2 g2Var : this.f7671a) {
                if (g2Var.b(cls)) {
                    return g2Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // android.content.preferences.protobuf.g2
        public boolean b(Class<?> cls) {
            for (g2 g2Var : this.f7671a) {
                if (g2Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public z1() {
        this(b());
    }

    private static g2 b() {
        return new b(h1.c(), c());
    }

    private static g2 c() {
        try {
            return (g2) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f7669b;
        }
    }

    private static boolean d(f2 f2Var) {
        return f2Var.e() == b3.PROTO2;
    }

    private static <T> j3<T> e(Class<T> cls, f2 f2Var) {
        return i1.class.isAssignableFrom(cls) ? d(f2Var) ? k2.S(cls, f2Var, t2.b(), v1.b(), l3.S(), v0.b(), e2.b()) : k2.S(cls, f2Var, t2.b(), v1.b(), l3.S(), null, e2.b()) : d(f2Var) ? k2.S(cls, f2Var, t2.a(), v1.a(), l3.K(), v0.a(), e2.a()) : k2.S(cls, f2Var, t2.a(), v1.a(), l3.L(), null, e2.a());
    }

    @Override // android.content.preferences.protobuf.k3
    public <T> j3<T> a(Class<T> cls) {
        l3.M(cls);
        f2 a6 = this.f7670a.a(cls);
        return a6.a() ? i1.class.isAssignableFrom(cls) ? l2.m(l3.S(), v0.b(), a6.b()) : l2.m(l3.K(), v0.a(), a6.b()) : e(cls, a6);
    }

    private z1(g2 g2Var) {
        this.f7670a = (g2) o1.e(g2Var, "messageInfoFactory");
    }
}
