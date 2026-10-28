package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: JavaTypeEnhancementState.kt */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    public static final b f24921d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final x f24922e = new x(v.b(null, 1, null), a.f24926x);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final z f24923a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<kotlin.reflect.jvm.internal.impl.name.c, g0> f24924b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24925c;

    /* compiled from: JavaTypeEnhancementState.kt */
    /* loaded from: classes6.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements q3.l<kotlin.reflect.jvm.internal.impl.name.c, g0> {

        /* renamed from: x, reason: collision with root package name */
        public static final a f24926x = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final g0 N(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            l0.p(cVar, ProtectedSandApp.s("藀"));
            return v.d(cVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("藁");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.h(v.class, ProtectedSandApp.s("藂"));
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("藃");
        }
    }

    /* compiled from: JavaTypeEnhancementState.kt */
    public static final class b {
        private b() {
        }

        @d5.d
        public final x a() {
            return x.f24922e;
        }

        public b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(@d5.d z zVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.c, ? extends g0> lVar) {
        l0.p(zVar, ProtectedSandApp.s("䭼"));
        l0.p(lVar, ProtectedSandApp.s("䭽"));
        this.f24923a = zVar;
        this.f24924b = lVar;
        this.f24925c = zVar.d() || lVar.N(v.e()) == g0.IGNORE;
    }

    public final boolean b() {
        return this.f24925c;
    }

    @d5.d
    public final q3.l<kotlin.reflect.jvm.internal.impl.name.c, g0> c() {
        return this.f24924b;
    }

    @d5.d
    public final z d() {
        return this.f24923a;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("䭾") + this.f24923a + ProtectedSandApp.s("䭿") + this.f24924b + ')';
    }
}
