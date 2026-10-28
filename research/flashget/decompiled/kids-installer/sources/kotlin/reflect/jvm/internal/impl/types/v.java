package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* loaded from: classes5.dex */
public final class v extends o1 {

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    public static final a f26551e = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final o1 f26552c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final o1 f26553d;

    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        @p3.n
        public final o1 a(@d5.d o1 o1Var, @d5.d o1 o1Var2) {
            kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("塈"));
            kotlin.jvm.internal.l0.p(o1Var2, ProtectedSandApp.s("塉"));
            return o1Var.f() ? o1Var2 : o1Var2.f() ? o1Var : new v(o1Var, o1Var2, null);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ v(o1 o1Var, o1 o1Var2, kotlin.jvm.internal.w wVar) {
        this(o1Var, o1Var2);
    }

    @d5.d
    @p3.n
    public static final o1 i(@d5.d o1 o1Var, @d5.d o1 o1Var2) {
        return f26551e.a(o1Var, o1Var2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean a() {
        return this.f26552c.a() || this.f26553d.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean b() {
        return this.f26552c.b() || this.f26553d.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("塑"));
        return this.f26553d.d(this.f26552c.d(gVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @d5.e
    public l1 e(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("塒"));
        l1 e6 = this.f26552c.e(h0Var);
        return e6 == null ? this.f26553d.e(h0Var) : e6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean f() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @d5.d
    public h0 g(@d5.d h0 h0Var, @d5.d x1 x1Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("塓"));
        kotlin.jvm.internal.l0.p(x1Var, ProtectedSandApp.s("塔"));
        return this.f26553d.g(this.f26552c.g(h0Var, x1Var), x1Var);
    }

    private v(o1 o1Var, o1 o1Var2) {
        this.f26552c = o1Var;
        this.f26553d = o1Var2;
    }
}
