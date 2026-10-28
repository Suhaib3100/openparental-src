package com.annimon.stream.function;

/* compiled from: LongFunction.java */
/* loaded from: classes3.dex */
public interface q0<R> {

    /* compiled from: LongFunction.java */
    public static class a {

        /* compiled from: LongFunction.java */
        /* renamed from: com.annimon.stream.function.q0$a$a, reason: collision with other inner class name */
        static class C0713a implements q0<R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m1 f41429a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f41430b;

            C0713a(m1 m1Var, Object obj) {
                this.f41429a = m1Var;
                this.f41430b = obj;
            }

            @Override // com.annimon.stream.function.q0
            public R c(long j4) {
                try {
                    return (R) this.f41429a.c(j4);
                } catch (Throwable unused) {
                    return (R) this.f41430b;
                }
            }
        }

        private a() {
        }

        public static <R> q0<R> a(m1<? extends R, Throwable> m1Var) {
            return new C0713a(m1Var, null);
        }

        public static <R> q0<R> b(m1<? extends R, Throwable> m1Var, R r4) {
            return new C0713a(m1Var, r4);
        }
    }

    R c(long j4);
}
