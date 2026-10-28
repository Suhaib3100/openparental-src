package com.annimon.stream.function;

/* compiled from: IntConsumer.java */
/* loaded from: classes3.dex */
public interface h0 {

    /* compiled from: IntConsumer.java */
    public static class a {

        /* compiled from: IntConsumer.java */
        /* renamed from: com.annimon.stream.function.h0$a$a, reason: collision with other inner class name */
        static class C0701a implements h0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f41387b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h0 f41388c;

            C0701a(h0 h0Var, h0 h0Var2) {
                this.f41387b = h0Var;
                this.f41388c = h0Var2;
            }

            @Override // com.annimon.stream.function.h0
            public void f(int i4) {
                this.f41387b.f(i4);
                this.f41388c.f(i4);
            }
        }

        /* compiled from: IntConsumer.java */
        static class b implements h0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h1 f41389b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h0 f41390c;

            b(h1 h1Var, h0 h0Var) {
                this.f41389b = h1Var;
                this.f41390c = h0Var;
            }

            @Override // com.annimon.stream.function.h0
            public void f(int i4) {
                try {
                    this.f41389b.f(i4);
                } catch (Throwable unused) {
                    h0 h0Var = this.f41390c;
                    if (h0Var != null) {
                        h0Var.f(i4);
                    }
                }
            }
        }

        private a() {
        }

        public static h0 a(h0 h0Var, h0 h0Var2) {
            return new C0701a(h0Var, h0Var2);
        }

        public static h0 b(h1<Throwable> h1Var) {
            return new b(h1Var, null);
        }

        public static h0 c(h1<Throwable> h1Var, h0 h0Var) {
            return new b(h1Var, h0Var);
        }
    }

    void f(int i4);
}
