package com.annimon.stream.function;

/* compiled from: IntUnaryOperator.java */
/* loaded from: classes3.dex */
public interface n0 {

    /* compiled from: IntUnaryOperator.java */
    public static class a {

        /* compiled from: IntUnaryOperator.java */
        /* renamed from: com.annimon.stream.function.n0$a$a, reason: collision with other inner class name */
        static class C0709a implements n0 {
            C0709a() {
            }

            @Override // com.annimon.stream.function.n0
            public int c(int i4) {
                return i4;
            }
        }

        private a() {
        }

        public static n0 a() {
            return new C0709a();
        }
    }

    int c(int i4);
}
