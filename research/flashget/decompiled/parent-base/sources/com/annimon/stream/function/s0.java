package com.annimon.stream.function;

/* compiled from: LongSupplier.java */
/* loaded from: classes3.dex */
public interface s0 {

    /* compiled from: LongSupplier.java */
    public static class a {

        /* compiled from: LongSupplier.java */
        /* renamed from: com.annimon.stream.function.s0$a$a, reason: collision with other inner class name */
        static class C0717a implements s0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o1 f41444a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f41445b;

            C0717a(o1 o1Var, long j4) {
                this.f41444a = o1Var;
                this.f41445b = j4;
            }

            @Override // com.annimon.stream.function.s0
            public long a() {
                try {
                    return this.f41444a.a();
                } catch (Throwable unused) {
                    return this.f41445b;
                }
            }
        }

        private a() {
        }

        public static s0 a(o1<Throwable> o1Var) {
            return new C0717a(o1Var, 0L);
        }

        public static s0 b(o1<Throwable> o1Var, long j4) {
            return new C0717a(o1Var, j4);
        }
    }

    long a();
}
