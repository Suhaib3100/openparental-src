package com.annimon.stream.function;

/* compiled from: IndexedLongPredicate.java */
/* loaded from: classes3.dex */
public interface d0 {

    /* compiled from: IndexedLongPredicate.java */
    public static class a {

        /* compiled from: IndexedLongPredicate.java */
        /* renamed from: com.annimon.stream.function.d0$a$a, reason: collision with other inner class name */
        static class C0696a implements d0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r0 f41373a;

            C0696a(r0 r0Var) {
                this.f41373a = r0Var;
            }

            @Override // com.annimon.stream.function.d0
            public boolean a(int i4, long j4) {
                return this.f41373a.d(j4);
            }
        }

        private a() {
        }

        public static d0 a(r0 r0Var) {
            r0Var.getClass();
            return new C0696a(r0Var);
        }
    }

    boolean a(int i4, long j4);
}
