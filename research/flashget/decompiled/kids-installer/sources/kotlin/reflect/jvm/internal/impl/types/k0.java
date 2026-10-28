package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.Lambda;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes6.dex */
public final class k0 extends y1 {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.n f26488p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final q3.a<h0> f26489q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<h0> f26490r;

    /* compiled from: SpecialTypes.kt */
    static final class a extends Lambda implements q3.a<h0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.g f26491p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ k0 f26492q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.types.checker.g gVar, k0 k0Var) {
            super(0);
            this.f26491p = gVar;
            this.f26492q = k0Var;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 n() {
            return this.f26491p.a((h4.i) this.f26492q.f26489q.n());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d q3.a<? extends h0> aVar) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("襖"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("襗"));
        this.f26488p = nVar;
        this.f26489q = aVar;
        this.f26490r = nVar.d(aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y1
    @d5.d
    protected h0 Y0() {
        return this.f26490r.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y1
    public boolean Z0() {
        return this.f26490r.F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public k0 e1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("襘"));
        return new k0(this.f26488p, new a(gVar, this));
    }
}
