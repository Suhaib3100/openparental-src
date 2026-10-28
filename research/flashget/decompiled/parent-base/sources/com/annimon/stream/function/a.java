package com.annimon.stream.function;

/* compiled from: BiConsumer.java */
/* loaded from: classes3.dex */
public interface a<T, U> {

    /* compiled from: BiConsumer.java */
    /* renamed from: com.annimon.stream.function.a$a, reason: collision with other inner class name */
    public static class C0686a {

        /* compiled from: BiConsumer.java */
        /* renamed from: com.annimon.stream.function.a$a$a, reason: collision with other inner class name */
        static class C0687a implements a<T, U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f41356a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f41357b;

            C0687a(a aVar, a aVar2) {
                this.f41356a = aVar;
                this.f41357b = aVar2;
            }

            @Override // com.annimon.stream.function.a
            public void accept(T t4, U u4) {
                this.f41356a.accept(t4, u4);
                this.f41357b.accept(t4, u4);
            }
        }

        private C0686a() {
        }

        public static <T, U> a<T, U> a(a<? super T, ? super U> aVar, a<? super T, ? super U> aVar2) {
            return new C0687a(aVar, aVar2);
        }
    }

    void accept(T t4, U u4);
}
