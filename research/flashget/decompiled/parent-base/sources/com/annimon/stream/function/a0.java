package com.annimon.stream.function;

/* compiled from: IndexedIntPredicate.java */
/* loaded from: classes3.dex */
public interface a0 {

    /* compiled from: IndexedIntPredicate.java */
    public static class a {

        /* compiled from: IndexedIntPredicate.java */
        /* renamed from: com.annimon.stream.function.a0$a$a, reason: collision with other inner class name */
        static class C0688a implements a0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f41358a;

            C0688a(j0 j0Var) {
                this.f41358a = j0Var;
            }

            @Override // com.annimon.stream.function.a0
            public boolean a(int i4, int i5) {
                return this.f41358a.test(i5);
            }
        }

        private a() {
        }

        public static a0 a(j0 j0Var) {
            j0Var.getClass();
            return new C0688a(j0Var);
        }
    }

    boolean a(int i4, int i5);
}
