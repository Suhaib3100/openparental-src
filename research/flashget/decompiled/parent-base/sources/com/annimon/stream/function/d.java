package com.annimon.stream.function;

/* compiled from: BooleanConsumer.java */
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: BooleanConsumer.java */
    public static class a {

        /* compiled from: BooleanConsumer.java */
        /* renamed from: com.annimon.stream.function.d$a$a, reason: collision with other inner class name */
        static class C0695a implements d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f41371a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f41372b;

            C0695a(d dVar, d dVar2) {
                this.f41371a = dVar;
                this.f41372b = dVar2;
            }

            @Override // com.annimon.stream.function.d
            public void a(boolean z4) {
                this.f41371a.a(z4);
                this.f41372b.a(z4);
            }
        }

        private a() {
        }

        public static d a(d dVar, d dVar2) {
            return new C0695a(dVar, dVar2);
        }
    }

    void a(boolean z4);
}
