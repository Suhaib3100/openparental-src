package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: StubTypes.kt */
/* loaded from: classes7.dex */
public abstract class f extends p0 {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    public static final a f78420f = new a();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.types.checker.n f78421c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f78422d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f78423e;

    /* compiled from: StubTypes.kt */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public f(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.n nVar, boolean z4) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("缩\u0001"));
        this.f78421c = nVar;
        this.f78422d = z4;
        this.f78423e = kotlin.reflect.jvm.internal.impl.types.error.k.b(kotlin.reflect.jvm.internal.impl.types.error.g.STUB_TYPE_SCOPE, nVar.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public List<l1> M0() {
        return kotlin.collections.j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public d1 N0() {
        d1.f78389c.getClass();
        return d1.f78390d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean P0() {
        return this.f78422d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    public p0 V0(boolean z4) {
        return z4 == P0() ? this : Y0(z4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: W0 */
    public p0 U0(@fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("缪\u0001"));
        return this;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.types.checker.n X0() {
        return this.f78421c;
    }

    @fg.l
    public abstract f Y0(boolean z4);

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public f Y0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("缫\u0001"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        return this.f78423e;
    }
}
