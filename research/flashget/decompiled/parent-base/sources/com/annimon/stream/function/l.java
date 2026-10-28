package com.annimon.stream.function;

/* compiled from: DoublePredicate.java */
/* loaded from: classes3.dex */
public interface l {

    /* compiled from: DoublePredicate.java */
    public static class a {

        /* compiled from: DoublePredicate.java */
        /* renamed from: com.annimon.stream.function.l$a$a, reason: collision with other inner class name */
        static class C0707a implements l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f41410a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f41411b;

            C0707a(l lVar, l lVar2) {
                this.f41410a = lVar;
                this.f41411b = lVar2;
            }

            @Override // com.annimon.stream.function.l
            public boolean d(double d5) {
                return this.f41410a.d(d5) && this.f41411b.d(d5);
            }
        }

        /* compiled from: DoublePredicate.java */
        static class b implements l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f41412a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f41413b;

            b(l lVar, l lVar2) {
                this.f41412a = lVar;
                this.f41413b = lVar2;
            }

            @Override // com.annimon.stream.function.l
            public boolean d(double d5) {
                return this.f41412a.d(d5) || this.f41413b.d(d5);
            }
        }

        /* compiled from: DoublePredicate.java */
        static class c implements l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f41414a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f41415b;

            c(l lVar, l lVar2) {
                this.f41414a = lVar;
                this.f41415b = lVar2;
            }

            @Override // com.annimon.stream.function.l
            public boolean d(double d5) {
                return this.f41415b.d(d5) ^ this.f41414a.d(d5);
            }
        }

        /* compiled from: DoublePredicate.java */
        static class d implements l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f41416a;

            d(l lVar) {
                this.f41416a = lVar;
            }

            @Override // com.annimon.stream.function.l
            public boolean d(double d5) {
                return !this.f41416a.d(d5);
            }
        }

        /* compiled from: DoublePredicate.java */
        static class e implements l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e1 f41417a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f41418b;

            e(e1 e1Var, boolean z4) {
                this.f41417a = e1Var;
                this.f41418b = z4;
            }

            @Override // com.annimon.stream.function.l
            public boolean d(double d5) {
                try {
                    return this.f41417a.d(d5);
                } catch (Throwable unused) {
                    return this.f41418b;
                }
            }
        }

        private a() {
        }

        public static l a(l lVar, l lVar2) {
            return new C0707a(lVar, lVar2);
        }

        public static l b(l lVar) {
            return new d(lVar);
        }

        public static l c(l lVar, l lVar2) {
            return new b(lVar, lVar2);
        }

        public static l d(e1<Throwable> e1Var) {
            return new e(e1Var, false);
        }

        public static l e(e1<Throwable> e1Var, boolean z4) {
            return new e(e1Var, z4);
        }

        public static l f(l lVar, l lVar2) {
            return new c(lVar, lVar2);
        }
    }

    boolean d(double d5);
}
