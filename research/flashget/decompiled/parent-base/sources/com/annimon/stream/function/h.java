package com.annimon.stream.function;

/* compiled from: Consumer.java */
/* loaded from: classes3.dex */
public interface h<T> {

    /* compiled from: Consumer.java */
    public static class a {

        /* compiled from: Consumer.java */
        /* renamed from: com.annimon.stream.function.h$a$a, reason: collision with other inner class name */
        static class C0700a implements h<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f41383a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f41384b;

            C0700a(h hVar, h hVar2) {
                this.f41383a = hVar;
                this.f41384b = hVar2;
            }

            @Override // com.annimon.stream.function.h
            public void accept(T t4) {
                this.f41383a.accept(t4);
                this.f41384b.accept(t4);
            }
        }

        /* compiled from: Consumer.java */
        static class b implements h<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b1 f41385a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f41386b;

            b(b1 b1Var, h hVar) {
                this.f41385a = b1Var;
                this.f41386b = hVar;
            }

            @Override // com.annimon.stream.function.h
            public void accept(T t4) {
                this.f41385a.getClass();
                try {
                    this.f41385a.accept(t4);
                } catch (Throwable unused) {
                    h hVar = this.f41386b;
                    if (hVar != null) {
                        hVar.accept(t4);
                    }
                }
            }
        }

        private a() {
        }

        public static <T> h<T> a(h<? super T> hVar, h<? super T> hVar2) {
            return new C0700a(hVar, hVar2);
        }

        public static <T> h<T> b(b1<? super T, Throwable> b1Var) {
            return new b(b1Var, null);
        }

        public static <T> h<T> c(b1<? super T, Throwable> b1Var, h<? super T> hVar) {
            return new b(b1Var, hVar);
        }
    }

    void accept(T t4);
}
