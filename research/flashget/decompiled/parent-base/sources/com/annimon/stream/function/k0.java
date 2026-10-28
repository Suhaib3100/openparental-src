package com.annimon.stream.function;

/* compiled from: IntSupplier.java */
/* loaded from: classes3.dex */
public interface k0 {

    /* compiled from: IntSupplier.java */
    public static class a {

        /* compiled from: IntSupplier.java */
        /* renamed from: com.annimon.stream.function.k0$a$a, reason: collision with other inner class name */
        static class C0706a implements k0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k1 f41408a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f41409b;

            C0706a(k1 k1Var, int i4) {
                this.f41408a = k1Var;
                this.f41409b = i4;
            }

            @Override // com.annimon.stream.function.k0
            public int a() {
                try {
                    return this.f41408a.a();
                } catch (Throwable unused) {
                    return this.f41409b;
                }
            }
        }

        private a() {
        }

        public static k0 a(k1<Throwable> k1Var) {
            return new C0706a(k1Var, 0);
        }

        public static k0 b(k1<Throwable> k1Var, int i4) {
            return new C0706a(k1Var, i4);
        }
    }

    int a();
}
