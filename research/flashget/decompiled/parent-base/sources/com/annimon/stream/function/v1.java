package com.annimon.stream.function;

/* compiled from: UnaryOperator.java */
/* loaded from: classes3.dex */
public interface v1<T> extends q<T, T> {

    /* compiled from: UnaryOperator.java */
    public static class a {

        /* compiled from: UnaryOperator.java */
        /* renamed from: com.annimon.stream.function.v1$a$a, reason: collision with other inner class name */
        static class C0722a implements v1<T> {
            C0722a() {
            }

            @Override // com.annimon.stream.function.q
            public T apply(T t4) {
                return t4;
            }
        }

        private a() {
        }

        public static <T> v1<T> a() {
            return new C0722a();
        }
    }
}
