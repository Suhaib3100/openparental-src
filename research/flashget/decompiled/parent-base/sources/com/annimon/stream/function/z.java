package com.annimon.stream.function;

/* compiled from: IndexedIntFunction.java */
/* loaded from: classes3.dex */
public interface z<R> {

    /* compiled from: IndexedIntFunction.java */
    public static class a {

        /* compiled from: IndexedIntFunction.java */
        /* renamed from: com.annimon.stream.function.z$a$a, reason: collision with other inner class name */
        static class C0726a implements z<R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i0 f41458a;

            C0726a(i0 i0Var) {
                this.f41458a = i0Var;
            }

            @Override // com.annimon.stream.function.z
            public R a(int i4, int i5) {
                return (R) this.f41458a.c(i5);
            }
        }

        private a() {
        }

        public static <R> z<R> a(i0<? extends R> i0Var) {
            i0Var.getClass();
            return new C0726a(i0Var);
        }
    }

    R a(int i4, int i5);
}
