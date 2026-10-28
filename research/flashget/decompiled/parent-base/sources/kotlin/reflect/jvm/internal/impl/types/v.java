package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* loaded from: classes7.dex */
public final class v extends o1 {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    public static final a f78560e = new a();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final o1 f78561c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final o1 f78562d;

    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        @kd.n
        public final o1 a(@fg.l o1 o1Var, @fg.l o1 o1Var2) {
            kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("聻\u0001"));
            kotlin.jvm.internal.l0.p(o1Var2, ProtectedSandApp.s("聼\u0001"));
            return o1Var.f() ? o1Var2 : o1Var2.f() ? o1Var : new v(o1Var, o1Var2, null);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ v(o1 o1Var, o1 o1Var2, kotlin.jvm.internal.w wVar) {
        this(o1Var, o1Var2);
    }

    @fg.l
    @kd.n
    public static final o1 i(@fg.l o1 o1Var, @fg.l o1 o1Var2) {
        return f78560e.a(o1Var, o1Var2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean a() {
        return this.f78561c.a() || this.f78562d.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean b() {
        return this.f78561c.b() || this.f78562d.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("肂\u0001"));
        return this.f78562d.d(this.f78561c.d(gVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @fg.m
    public l1 e(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("肃\u0001"));
        l1 e4 = this.f78561c.e(h0Var);
        return e4 == null ? this.f78562d.e(h0Var) : e4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean f() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @fg.l
    public h0 g(@fg.l h0 h0Var, @fg.l x1 x1Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("肄\u0001"));
        kotlin.jvm.internal.l0.p(x1Var, ProtectedSandApp.s("肅\u0001"));
        return this.f78562d.g(this.f78561c.g(h0Var, x1Var), x1Var);
    }

    private v(o1 o1Var, o1 o1Var2) {
        this.f78561c = o1Var;
        this.f78562d = o1Var2;
    }
}
