package com.annimon.stream.function;

/* compiled from: DoubleUnaryOperator.java */
/* loaded from: classes3.dex */
public interface p {

    /* compiled from: DoubleUnaryOperator.java */
    public static class a {

        /* compiled from: DoubleUnaryOperator.java */
        /* renamed from: com.annimon.stream.function.p$a$a, reason: collision with other inner class name */
        static class C0710a implements p {
            C0710a() {
            }

            @Override // com.annimon.stream.function.p
            public double applyAsDouble(double d5) {
                return d5;
            }
        }

        private a() {
        }

        public static p a() {
            return new C0710a();
        }
    }

    double applyAsDouble(double d5);
}
