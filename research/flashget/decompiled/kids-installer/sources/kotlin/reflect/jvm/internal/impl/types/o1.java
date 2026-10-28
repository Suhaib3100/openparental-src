package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes5.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final b f26511a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final o1 f26512b = new a();

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

        @d5.e
        public Void i(@d5.d h0 h0Var) {
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("坾"));
            return null;
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("坿");
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
        @d5.d
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("垀"));
            return o1.this.d(gVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o1
        @d5.e
        public l1 e(@d5.d h0 h0Var) {
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("垁"));
            return o1.this.e(h0Var);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o1
        public boolean f() {
            return o1.this.f();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o1
        @d5.d
        public h0 g(@d5.d h0 h0Var, @d5.d x1 x1Var) {
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("垂"));
            kotlin.jvm.internal.l0.p(x1Var, ProtectedSandApp.s("垃"));
            return o1.this.g(h0Var, x1Var);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    @d5.d
    public final q1 c() {
        q1 g5 = q1.g(this);
        kotlin.jvm.internal.l0.o(g5, ProtectedSandApp.s("䪪"));
        return g5;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("䪫"));
        return gVar;
    }

    @d5.e
    public abstract l1 e(@d5.d h0 h0Var);

    public boolean f() {
        return false;
    }

    @d5.d
    public h0 g(@d5.d h0 h0Var, @d5.d x1 x1Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("䪬"));
        kotlin.jvm.internal.l0.p(x1Var, ProtectedSandApp.s("䪭"));
        return h0Var;
    }

    @d5.d
    public final o1 h() {
        return new c();
    }
}
