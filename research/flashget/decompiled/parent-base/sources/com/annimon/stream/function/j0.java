package com.annimon.stream.function;

/* compiled from: IntPredicate.java */
/* loaded from: classes3.dex */
public interface j0 {

    /* compiled from: IntPredicate.java */
    public static class a {

        /* compiled from: IntPredicate.java */
        /* renamed from: com.annimon.stream.function.j0$a$a, reason: collision with other inner class name */
        static class C0704a implements j0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f41397a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f41398b;

            C0704a(j0 j0Var, j0 j0Var2) {
                this.f41397a = j0Var;
                this.f41398b = j0Var2;
            }

            @Override // com.annimon.stream.function.j0
            public boolean test(int i4) {
                return this.f41397a.test(i4) && this.f41398b.test(i4);
            }
        }

        /* compiled from: IntPredicate.java */
        static class b implements j0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f41399a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f41400b;

            b(j0 j0Var, j0 j0Var2) {
                this.f41399a = j0Var;
                this.f41400b = j0Var2;
            }

            @Override // com.annimon.stream.function.j0
            public boolean test(int i4) {
                return this.f41399a.test(i4) || this.f41400b.test(i4);
            }
        }

        /* compiled from: IntPredicate.java */
        static class c implements j0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f41401a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f41402b;

            c(j0 j0Var, j0 j0Var2) {
                this.f41401a = j0Var;
                this.f41402b = j0Var2;
            }

            @Override // com.annimon.stream.function.j0
            public boolean test(int i4) {
                return this.f41402b.test(i4) ^ this.f41401a.test(i4);
            }
        }

        /* compiled from: IntPredicate.java */
        static class d implements j0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f41403a;

            d(j0 j0Var) {
                this.f41403a = j0Var;
            }

            @Override // com.annimon.stream.function.j0
            public boolean test(int i4) {
                return !this.f41403a.test(i4);
            }
        }

        /* compiled from: IntPredicate.java */
        static class e implements j0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j1 f41404a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f41405b;

            e(j1 j1Var, boolean z4) {
                this.f41404a = j1Var;
                this.f41405b = z4;
            }

            @Override // com.annimon.stream.function.j0
            public boolean test(int i4) {
                try {
                    return this.f41404a.test(i4);
                } catch (Throwable unused) {
                    return this.f41405b;
                }
            }
        }

        private a() {
        }

        public static j0 a(j0 j0Var, j0 j0Var2) {
            return new C0704a(j0Var, j0Var2);
        }

        public static j0 b(j0 j0Var) {
            return new d(j0Var);
        }

        public static j0 c(j0 j0Var, j0 j0Var2) {
            return new b(j0Var, j0Var2);
        }

        public static j0 d(j1<Throwable> j1Var) {
            return new e(j1Var, false);
        }

        public static j0 e(j1<Throwable> j1Var, boolean z4) {
            return new e(j1Var, z4);
        }

        public static j0 f(j0 j0Var, j0 j0Var2) {
            return new c(j0Var, j0Var2);
        }
    }

    boolean test(int i4);
}
