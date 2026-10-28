package com.annimon.stream.function;

/* compiled from: IndexedLongConsumer.java */
/* loaded from: classes3.dex */
public interface b0 {

    /* compiled from: IndexedLongConsumer.java */
    public static class a {

        /* compiled from: IndexedLongConsumer.java */
        /* renamed from: com.annimon.stream.function.b0$a$a, reason: collision with other inner class name */
        static class C0692a implements b0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f41364a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f41365b;

            C0692a(b0 b0Var, b0 b0Var2) {
                this.f41364a = b0Var;
                this.f41365b = b0Var2;
            }

            @Override // com.annimon.stream.function.b0
            public void a(int i4, long j4) {
                this.f41364a.a(i4, j4);
                this.f41365b.a(i4, j4);
            }
        }

        /* compiled from: IndexedLongConsumer.java */
        static class b implements b0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f41366a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f41367b;

            b(h0 h0Var, p0 p0Var) {
                this.f41366a = h0Var;
                this.f41367b = p0Var;
            }

            @Override // com.annimon.stream.function.b0
            public void a(int i4, long j4) {
                h0 h0Var = this.f41366a;
                if (h0Var != null) {
                    h0Var.f(i4);
                }
                p0 p0Var = this.f41367b;
                if (p0Var != null) {
                    p0Var.h(j4);
                }
            }
        }

        private a() {
        }

        public static b0 a(h0 h0Var, p0 p0Var) {
            return new b(h0Var, p0Var);
        }

        public static b0 b(b0 b0Var, b0 b0Var2) {
            return new C0692a(b0Var, b0Var2);
        }
    }

    void a(int i4, long j4);
}
