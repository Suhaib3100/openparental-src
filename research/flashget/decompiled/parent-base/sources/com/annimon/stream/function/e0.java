package com.annimon.stream.function;

/* compiled from: IndexedLongUnaryOperator.java */
/* loaded from: classes3.dex */
public interface e0 {

    /* compiled from: IndexedLongUnaryOperator.java */
    public static class a {

        /* compiled from: IndexedLongUnaryOperator.java */
        /* renamed from: com.annimon.stream.function.e0$a$a, reason: collision with other inner class name */
        static class C0697a implements e0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v0 f41374a;

            C0697a(v0 v0Var) {
                this.f41374a = v0Var;
            }

            @Override // com.annimon.stream.function.e0
            public long a(int i4, long j4) {
                return this.f41374a.c(j4);
            }
        }

        private a() {
        }

        public static e0 a(v0 v0Var) {
            v0Var.getClass();
            return new C0697a(v0Var);
        }
    }

    long a(int i4, long j4);
}
