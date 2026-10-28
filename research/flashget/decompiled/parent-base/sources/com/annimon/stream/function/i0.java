package com.annimon.stream.function;

/* compiled from: IntFunction.java */
/* loaded from: classes3.dex */
public interface i0<R> {

    /* compiled from: IntFunction.java */
    public static class a {

        /* compiled from: IntFunction.java */
        /* renamed from: com.annimon.stream.function.i0$a$a, reason: collision with other inner class name */
        static class C0702a implements i0<R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1 f41391a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f41392b;

            C0702a(i1 i1Var, Object obj) {
                this.f41391a = i1Var;
                this.f41392b = obj;
            }

            @Override // com.annimon.stream.function.i0
            public R c(int i4) {
                try {
                    return (R) this.f41391a.c(i4);
                } catch (Throwable unused) {
                    return (R) this.f41392b;
                }
            }
        }

        private a() {
        }

        public static <R> i0<R> a(i1<? extends R, Throwable> i1Var) {
            return new C0702a(i1Var, null);
        }

        public static <R> i0<R> b(i1<? extends R, Throwable> i1Var, R r4) {
            return new C0702a(i1Var, r4);
        }
    }

    R c(int i4);
}
