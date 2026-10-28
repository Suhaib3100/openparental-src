package com.annimon.stream.function;

/* compiled from: BooleanPredicate.java */
/* loaded from: classes3.dex */
public interface f {

    /* compiled from: BooleanPredicate.java */
    public static class a {

        /* compiled from: BooleanPredicate.java */
        /* renamed from: com.annimon.stream.function.f$a$a, reason: collision with other inner class name */
        static class C0698a implements f {
            C0698a() {
            }

            @Override // com.annimon.stream.function.f
            public boolean a(boolean z4) {
                return z4;
            }
        }

        /* compiled from: BooleanPredicate.java */
        static class b implements f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f41375a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f41376b;

            b(f fVar, f fVar2) {
                this.f41375a = fVar;
                this.f41376b = fVar2;
            }

            @Override // com.annimon.stream.function.f
            public boolean a(boolean z4) {
                return this.f41375a.a(z4) && this.f41376b.a(z4);
            }
        }

        /* compiled from: BooleanPredicate.java */
        static class c implements f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f41377a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f41378b;

            c(f fVar, f fVar2) {
                this.f41377a = fVar;
                this.f41378b = fVar2;
            }

            @Override // com.annimon.stream.function.f
            public boolean a(boolean z4) {
                return this.f41377a.a(z4) || this.f41378b.a(z4);
            }
        }

        /* compiled from: BooleanPredicate.java */
        static class d implements f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f41379a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f41380b;

            d(f fVar, f fVar2) {
                this.f41379a = fVar;
                this.f41380b = fVar2;
            }

            @Override // com.annimon.stream.function.f
            public boolean a(boolean z4) {
                return this.f41380b.a(z4) ^ this.f41379a.a(z4);
            }
        }

        /* compiled from: BooleanPredicate.java */
        static class e implements f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f41381a;

            e(f fVar) {
                this.f41381a = fVar;
            }

            @Override // com.annimon.stream.function.f
            public boolean a(boolean z4) {
                return !this.f41381a.a(z4);
            }
        }

        private a() {
        }

        public static f a(f fVar, f fVar2) {
            return new b(fVar, fVar2);
        }

        public static f b() {
            return new C0698a();
        }

        public static f c(f fVar) {
            return new e(fVar);
        }

        public static f d(f fVar, f fVar2) {
            return new c(fVar, fVar2);
        }

        public static f e(f fVar, f fVar2) {
            return new d(fVar, fVar2);
        }
    }

    boolean a(boolean z4);
}
