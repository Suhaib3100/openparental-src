package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes7.dex */
public final class v0 extends m1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.f1 f78563a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.b0 f78564b;

    /* compiled from: StarProjectionImpl.kt */
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<h0> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return w0.b(v0.this.f78563a);
        }
    }

    public v0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var) {
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("聽\u0001"));
        this.f78563a = f1Var;
        this.f78564b = kotlin.c0.b(kotlin.f0.PUBLICATION, new a());
    }

    private final h0 e() {
        return (h0) this.f78564b.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @fg.l
    public l1 a(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("聾\u0001"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    public boolean b() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @fg.l
    public x1 c() {
        return x1.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @fg.l
    public h0 getType() {
        return e();
    }
}
