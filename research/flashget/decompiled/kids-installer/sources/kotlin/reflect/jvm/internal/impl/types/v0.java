package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;

/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes6.dex */
public final class v0 extends m1 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.f1 f26554a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Lazy f26555b;

    /* compiled from: StarProjectionImpl.kt */
    static final class a extends Lambda implements q3.a<h0> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 n() {
            return w0.b(v0.this.f26554a);
        }
    }

    public v0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var) {
        Lazy b6;
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("覧"));
        this.f26554a = f1Var;
        b6 = kotlin.d0.b(LazyThreadSafetyMode.PUBLICATION, new a());
        this.f26555b = b6;
    }

    private final h0 e() {
        return (h0) this.f26555b.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @d5.d
    public l1 a(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("覨"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @d5.d
    public x1 b() {
        return x1.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    public boolean c() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @d5.d
    public h0 getType() {
        return e();
    }
}
