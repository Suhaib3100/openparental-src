package com.annimon.stream.function;

/* compiled from: LongUnaryOperator.java */
/* loaded from: classes3.dex */
public interface v0 {

    /* compiled from: LongUnaryOperator.java */
    public static class a {

        /* compiled from: LongUnaryOperator.java */
        /* renamed from: com.annimon.stream.function.v0$a$a, reason: collision with other inner class name */
        static class C0721a implements v0 {
            C0721a() {
            }

            @Override // com.annimon.stream.function.v0
            public long c(long j4) {
                return j4;
            }
        }

        private a() {
        }

        public static v0 a() {
            return new C0721a();
        }
    }

    long c(long j4);
}
