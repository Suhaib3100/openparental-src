package com.annimon.stream.function;

/* compiled from: IndexedDoublePredicate.java */
/* loaded from: classes3.dex */
public interface v {

    /* compiled from: IndexedDoublePredicate.java */
    public static class a {

        /* compiled from: IndexedDoublePredicate.java */
        /* renamed from: com.annimon.stream.function.v$a$a, reason: collision with other inner class name */
        static class C0720a implements v {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f41451a;

            C0720a(l lVar) {
                this.f41451a = lVar;
            }

            @Override // com.annimon.stream.function.v
            public boolean a(int i4, double d5) {
                return this.f41451a.d(d5);
            }
        }

        private a() {
        }

        public static v a(l lVar) {
            lVar.getClass();
            return new C0720a(lVar);
        }
    }

    boolean a(int i4, double d5);
}
