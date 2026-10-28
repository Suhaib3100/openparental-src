package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StubTypes.kt */
/* loaded from: classes6.dex */
public abstract class f extends p0 {

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    public static final a f26411s = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.types.checker.n f26412p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f26413q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f26414r;

    /* compiled from: StubTypes.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public f(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.n nVar, boolean z5) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("褸"));
        this.f26412p = nVar;
        this.f26413q = z5;
        this.f26414r = kotlin.reflect.jvm.internal.impl.types.error.k.b(kotlin.reflect.jvm.internal.impl.types.error.g.STUB_TYPE_SCOPE, nVar.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        return this.f26414r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public List<l1> S0() {
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public d1 T0() {
        d1.f26381p.getClass();
        return d1.f26382q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean V0() {
        return this.f26413q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    public p0 b1(boolean z5) {
        return z5 == V0() ? this : e1(z5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: c1 */
    public p0 a1(@d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("褹"));
        return this;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.types.checker.n d1() {
        return this.f26412p;
    }

    @d5.d
    public abstract f e1(boolean z5);

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public f e1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("褺"));
        return this;
    }
}
