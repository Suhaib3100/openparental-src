package com.annimon.stream.function;

/* compiled from: DoubleSupplier.java */
/* loaded from: classes3.dex */
public interface m {

    /* compiled from: DoubleSupplier.java */
    public static class a {

        /* compiled from: DoubleSupplier.java */
        /* renamed from: com.annimon.stream.function.m$a$a, reason: collision with other inner class name */
        static class C0708a implements m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f1 f41419a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ double f41420b;

            C0708a(f1 f1Var, double d5) {
                this.f41419a = f1Var;
                this.f41420b = d5;
            }

            @Override // com.annimon.stream.function.m
            public double a() {
                try {
                    return this.f41419a.a();
                } catch (Throwable unused) {
                    return this.f41420b;
                }
            }
        }

        private a() {
        }

        public static m a(f1<Throwable> f1Var) {
            return new C0708a(f1Var, com.google.firebase.remoteconfig.p.f60679p);
        }

        public static m b(f1<Throwable> f1Var, double d5) {
            return new C0708a(f1Var, d5);
        }
    }

    double a();
}
