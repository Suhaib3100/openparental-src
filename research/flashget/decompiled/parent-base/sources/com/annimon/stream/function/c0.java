package com.annimon.stream.function;

/* compiled from: IndexedLongFunction.java */
/* loaded from: classes3.dex */
public interface c0<R> {

    /* compiled from: IndexedLongFunction.java */
    public static class a {

        /* compiled from: IndexedLongFunction.java */
        /* renamed from: com.annimon.stream.function.c0$a$a, reason: collision with other inner class name */
        static class C0694a implements c0<R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q0 f41370a;

            C0694a(q0 q0Var) {
                this.f41370a = q0Var;
            }

            @Override // com.annimon.stream.function.c0
            public R a(int i4, long j4) {
                return (R) this.f41370a.c(j4);
            }
        }

        private a() {
        }

        public static <R> c0<R> a(q0<? extends R> q0Var) {
            q0Var.getClass();
            return new C0694a(q0Var);
        }
    }

    R a(int i4, long j4);
}
