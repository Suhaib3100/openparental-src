package com.annimon.stream.function;

/* compiled from: IndexedIntConsumer.java */
/* loaded from: classes3.dex */
public interface y {

    /* compiled from: IndexedIntConsumer.java */
    public static class a {

        /* compiled from: IndexedIntConsumer.java */
        /* renamed from: com.annimon.stream.function.y$a$a, reason: collision with other inner class name */
        static class C0725a implements y {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f41454a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f41455b;

            C0725a(y yVar, y yVar2) {
                this.f41454a = yVar;
                this.f41455b = yVar2;
            }

            @Override // com.annimon.stream.function.y
            public void a(int i4, int i5) {
                this.f41454a.a(i4, i5);
                this.f41455b.a(i4, i5);
            }
        }

        /* compiled from: IndexedIntConsumer.java */
        static class b implements y {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f41456a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f41457b;

            b(h0 h0Var, h0 h0Var2) {
                this.f41456a = h0Var;
                this.f41457b = h0Var2;
            }

            @Override // com.annimon.stream.function.y
            public void a(int i4, int i5) {
                h0 h0Var = this.f41456a;
                if (h0Var != null) {
                    h0Var.f(i4);
                }
                h0 h0Var2 = this.f41457b;
                if (h0Var2 != null) {
                    h0Var2.f(i5);
                }
            }
        }

        private a() {
        }

        public static y a(h0 h0Var, h0 h0Var2) {
            return new b(h0Var, h0Var2);
        }

        public static y b(y yVar, y yVar2) {
            return new C0725a(yVar, yVar2);
        }
    }

    void a(int i4, int i5);
}
