package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes7.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final b f78520a = new b();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final o1 f78521b = new a();

    /* compiled from: TypeSubstitution.kt */
    public static final class a extends o1 {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o1
        public /* bridge */ /* synthetic */ l1 e(h0 h0Var) {
            return (l1) i(h0Var);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o1
        public boolean f() {
            return true;
        }

        @fg.m
        public Void i(@fg.l h0 h0Var) {
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("羶\u0001"));
            return null;
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("羷\u0001");
        }
    }

    /* compiled from: TypeSubstitution.kt */
    public static final class b {
        private b() {
        }

        public b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: TypeSubstitution.kt */
    public static final class c extends o1 {
        c() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o1
        public boolean a() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o1
        public boolean b() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o1
        @fg.l
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("羸\u0001"));
            return o1.this.d(gVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o1
        @fg.m
        public l1 e(@fg.l h0 h0Var) {
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("羹\u0001"));
            return o1.this.e(h0Var);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o1
        public boolean f() {
            return o1.this.f();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o1
        @fg.l
        public h0 g(@fg.l h0 h0Var, @fg.l x1 x1Var) {
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("羺\u0001"));
            kotlin.jvm.internal.l0.p(x1Var, ProtectedSandApp.s("羻\u0001"));
            return o1.this.g(h0Var, x1Var);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    @fg.l
    public final q1 c() {
        q1 g4 = q1.g(this);
        kotlin.jvm.internal.l0.o(g4, ProtectedSandApp.s("爳\u0001"));
        return g4;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("爴\u0001"));
        return gVar;
    }

    @fg.m
    public abstract l1 e(@fg.l h0 h0Var);

    public boolean f() {
        return false;
    }

    @fg.l
    public h0 g(@fg.l h0 h0Var, @fg.l x1 x1Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("爵\u0001"));
        kotlin.jvm.internal.l0.p(x1Var, ProtectedSandApp.s("父\u0001"));
        return h0Var;
    }

    @fg.l
    public final o1 h() {
        return new c();
    }
}
