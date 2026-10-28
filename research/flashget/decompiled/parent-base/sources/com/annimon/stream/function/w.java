package com.annimon.stream.function;

/* compiled from: IndexedDoubleUnaryOperator.java */
/* loaded from: classes3.dex */
public interface w {

    /* compiled from: IndexedDoubleUnaryOperator.java */
    public static class a {

        /* compiled from: IndexedDoubleUnaryOperator.java */
        /* renamed from: com.annimon.stream.function.w$a$a, reason: collision with other inner class name */
        static class C0723a implements w {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f41452a;

            C0723a(p pVar) {
                this.f41452a = pVar;
            }

            @Override // com.annimon.stream.function.w
            public double a(int i4, double d5) {
                return this.f41452a.applyAsDouble(d5);
            }
        }

        private a() {
        }

        public static w a(p pVar) {
            pVar.getClass();
            return new C0723a(pVar);
        }
    }

    double a(int i4, double d5);
}
