package com.annimon.stream.function;

/* compiled from: LongPredicate.java */
/* loaded from: classes3.dex */
public interface r0 {

    /* compiled from: LongPredicate.java */
    public static class a {

        /* compiled from: LongPredicate.java */
        /* renamed from: com.annimon.stream.function.r0$a$a, reason: collision with other inner class name */
        static class C0715a implements r0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r0 f41432a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ r0 f41433b;

            C0715a(r0 r0Var, r0 r0Var2) {
                this.f41432a = r0Var;
                this.f41433b = r0Var2;
            }

            @Override // com.annimon.stream.function.r0
            public boolean d(long j4) {
                return this.f41432a.d(j4) && this.f41433b.d(j4);
            }
        }

        /* compiled from: LongPredicate.java */
        static class b implements r0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r0 f41434a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ r0 f41435b;

            b(r0 r0Var, r0 r0Var2) {
                this.f41434a = r0Var;
                this.f41435b = r0Var2;
            }

            @Override // com.annimon.stream.function.r0
            public boolean d(long j4) {
                return this.f41434a.d(j4) || this.f41435b.d(j4);
            }
        }

        /* compiled from: LongPredicate.java */
        static class c implements r0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r0 f41436a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ r0 f41437b;

            c(r0 r0Var, r0 r0Var2) {
                this.f41436a = r0Var;
                this.f41437b = r0Var2;
            }

            @Override // com.annimon.stream.function.r0
            public boolean d(long j4) {
                return this.f41437b.d(j4) ^ this.f41436a.d(j4);
            }
        }

        /* compiled from: LongPredicate.java */
        static class d implements r0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r0 f41438a;

            d(r0 r0Var) {
                this.f41438a = r0Var;
            }

            @Override // com.annimon.stream.function.r0
            public boolean d(long j4) {
                return !this.f41438a.d(j4);
            }
        }

        /* compiled from: LongPredicate.java */
        static class e implements r0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n1 f41439a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f41440b;

            e(n1 n1Var, boolean z4) {
                this.f41439a = n1Var;
                this.f41440b = z4;
            }

            @Override // com.annimon.stream.function.r0
            public boolean d(long j4) {
                try {
                    return this.f41439a.d(j4);
                } catch (Throwable unused) {
                    return this.f41440b;
                }
            }
        }

        private a() {
        }

        public static r0 a(r0 r0Var, r0 r0Var2) {
            return new C0715a(r0Var, r0Var2);
        }

        public static r0 b(r0 r0Var) {
            return new d(r0Var);
        }

        public static r0 c(r0 r0Var, r0 r0Var2) {
            return new b(r0Var, r0Var2);
        }

        public static r0 d(n1<Throwable> n1Var) {
            return new e(n1Var, false);
        }

        public static r0 e(n1<Throwable> n1Var, boolean z4) {
            return new e(n1Var, z4);
        }

        public static r0 f(r0 r0Var, r0 r0Var2) {
            return new c(r0Var, r0Var2);
        }
    }

    boolean d(long j4);
}
