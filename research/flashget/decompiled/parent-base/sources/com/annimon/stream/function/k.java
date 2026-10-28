package com.annimon.stream.function;

/* compiled from: DoubleFunction.java */
/* loaded from: classes3.dex */
public interface k<R> {

    /* compiled from: DoubleFunction.java */
    public static class a {

        /* compiled from: DoubleFunction.java */
        /* renamed from: com.annimon.stream.function.k$a$a, reason: collision with other inner class name */
        static class C0705a implements k<R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d1 f41406a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f41407b;

            C0705a(d1 d1Var, Object obj) {
                this.f41406a = d1Var;
                this.f41407b = obj;
            }

            @Override // com.annimon.stream.function.k
            public R c(double d5) {
                try {
                    return (R) this.f41406a.c(d5);
                } catch (Throwable unused) {
                    return (R) this.f41407b;
                }
            }
        }

        private a() {
        }

        public static <R> k<R> a(d1<? extends R, Throwable> d1Var) {
            return new C0705a(d1Var, null);
        }

        public static <R> k<R> b(d1<? extends R, Throwable> d1Var, R r4) {
            return new C0705a(d1Var, r4);
        }
    }

    R c(double d5);
}
