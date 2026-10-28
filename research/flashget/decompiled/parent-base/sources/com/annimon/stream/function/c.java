package com.annimon.stream.function;

import java.util.Comparator;

/* compiled from: BinaryOperator.java */
/* loaded from: classes3.dex */
public interface c<T> extends b<T, T, T> {

    /* compiled from: BinaryOperator.java */
    public static class a {

        /* compiled from: BinaryOperator.java */
        /* renamed from: com.annimon.stream.function.c$a$a, reason: collision with other inner class name */
        static class C0693a implements c<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Comparator f41368a;

            C0693a(Comparator comparator) {
                this.f41368a = comparator;
            }

            @Override // com.annimon.stream.function.b
            public T apply(T t4, T t5) {
                return this.f41368a.compare(t4, t5) <= 0 ? t4 : t5;
            }
        }

        /* compiled from: BinaryOperator.java */
        static class b implements c<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Comparator f41369a;

            b(Comparator comparator) {
                this.f41369a = comparator;
            }

            @Override // com.annimon.stream.function.b
            public T apply(T t4, T t5) {
                return this.f41369a.compare(t4, t5) >= 0 ? t4 : t5;
            }
        }

        private a() {
        }

        public static <T> c<T> a(Comparator<? super T> comparator) {
            comparator.getClass();
            return new b(comparator);
        }

        public static <T> c<T> b(Comparator<? super T> comparator) {
            comparator.getClass();
            return new C0693a(comparator);
        }
    }
}
