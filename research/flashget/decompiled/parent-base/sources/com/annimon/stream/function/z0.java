package com.annimon.stream.function;

import java.util.Arrays;

/* compiled from: Predicate.java */
/* loaded from: classes3.dex */
public interface z0<T> {

    /* compiled from: Predicate.java */
    public static class a {

        /* compiled from: Predicate.java */
        /* renamed from: com.annimon.stream.function.z0$a$a, reason: collision with other inner class name */
        static class C0727a implements z0<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z0 f41459a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z0 f41460b;

            C0727a(z0 z0Var, z0 z0Var2) {
                this.f41459a = z0Var;
                this.f41460b = z0Var2;
            }

            @Override // com.annimon.stream.function.z0
            public boolean test(T t4) {
                return this.f41459a.test(t4) && this.f41460b.test(t4);
            }
        }

        /* compiled from: Predicate.java */
        static class b implements z0<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z0 f41461a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z0 f41462b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z0[] f41463c;

            b(z0 z0Var, z0 z0Var2, z0[] z0VarArr) {
                this.f41461a = z0Var;
                this.f41462b = z0Var2;
                this.f41463c = z0VarArr;
            }

            @Override // com.annimon.stream.function.z0
            public boolean test(T t4) {
                if (!this.f41461a.test(t4) || !this.f41462b.test(t4)) {
                    return false;
                }
                for (z0 z0Var : this.f41463c) {
                    if (!z0Var.test(t4)) {
                        return false;
                    }
                }
                return true;
            }
        }

        /* compiled from: Predicate.java */
        static class c implements z0<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z0 f41464a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z0 f41465b;

            c(z0 z0Var, z0 z0Var2) {
                this.f41464a = z0Var;
                this.f41465b = z0Var2;
            }

            @Override // com.annimon.stream.function.z0
            public boolean test(T t4) {
                return this.f41464a.test(t4) || this.f41465b.test(t4);
            }
        }

        /* compiled from: Predicate.java */
        static class d implements z0<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z0 f41466a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z0 f41467b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z0[] f41468c;

            d(z0 z0Var, z0 z0Var2, z0[] z0VarArr) {
                this.f41466a = z0Var;
                this.f41467b = z0Var2;
                this.f41468c = z0VarArr;
            }

            @Override // com.annimon.stream.function.z0
            public boolean test(T t4) {
                if (this.f41466a.test(t4) || this.f41467b.test(t4)) {
                    return true;
                }
                for (z0 z0Var : this.f41468c) {
                    if (z0Var.test(t4)) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* compiled from: Predicate.java */
        static class e implements z0<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z0 f41469a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z0 f41470b;

            e(z0 z0Var, z0 z0Var2) {
                this.f41469a = z0Var;
                this.f41470b = z0Var2;
            }

            @Override // com.annimon.stream.function.z0
            public boolean test(T t4) {
                return this.f41470b.test(t4) ^ this.f41469a.test(t4);
            }
        }

        /* compiled from: Predicate.java */
        static class f implements z0<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z0 f41471a;

            f(z0 z0Var) {
                this.f41471a = z0Var;
            }

            @Override // com.annimon.stream.function.z0
            public boolean test(T t4) {
                return !this.f41471a.test(t4);
            }
        }

        /* compiled from: Predicate.java */
        static class g implements z0<T> {
            g() {
            }

            @Override // com.annimon.stream.function.z0
            public boolean test(T t4) {
                return t4 != null;
            }
        }

        /* compiled from: Predicate.java */
        static class h implements z0<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p1 f41472a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f41473b;

            h(p1 p1Var, boolean z4) {
                this.f41472a = p1Var;
                this.f41473b = z4;
            }

            @Override // com.annimon.stream.function.z0
            public boolean test(T t4) {
                try {
                    return this.f41472a.test(t4);
                } catch (Throwable unused) {
                    return this.f41473b;
                }
            }
        }

        private a() {
        }

        public static <T> z0<T> a(z0<? super T> z0Var, z0<? super T> z0Var2) {
            return new C0727a(z0Var, z0Var2);
        }

        public static <T> z0<T> b(z0<? super T> z0Var, z0<? super T> z0Var2, z0<? super T>... z0VarArr) {
            z0Var.getClass();
            z0Var2.getClass();
            z0VarArr.getClass();
            com.annimon.stream.i.m(Arrays.asList(z0VarArr));
            return new b(z0Var, z0Var2, z0VarArr);
        }

        public static <T> z0<T> c(z0<? super T> z0Var) {
            return new f(z0Var);
        }

        public static <T> z0<T> d() {
            return new g();
        }

        public static <T> z0<T> e(z0<? super T> z0Var, z0<? super T> z0Var2) {
            return new c(z0Var, z0Var2);
        }

        public static <T> z0<T> f(z0<? super T> z0Var, z0<? super T> z0Var2, z0<? super T>... z0VarArr) {
            z0Var.getClass();
            z0Var2.getClass();
            z0VarArr.getClass();
            com.annimon.stream.i.m(Arrays.asList(z0VarArr));
            return new d(z0Var, z0Var2, z0VarArr);
        }

        public static <T> z0<T> g(p1<? super T, Throwable> p1Var) {
            return new h(p1Var, false);
        }

        public static <T> z0<T> h(p1<? super T, Throwable> p1Var, boolean z4) {
            return new h(p1Var, z4);
        }

        public static <T> z0<T> i(z0<? super T> z0Var, z0<? super T> z0Var2) {
            return new e(z0Var, z0Var2);
        }
    }

    boolean test(T t4);
}
