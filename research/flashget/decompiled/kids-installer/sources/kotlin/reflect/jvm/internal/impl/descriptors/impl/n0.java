package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;

/* compiled from: VariableDescriptorWithInitializerImpl.java */
/* loaded from: classes6.dex */
public abstract class n0 extends m0 {

    /* renamed from: x, reason: collision with root package name */
    static final /* synthetic */ boolean f24242x = false;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f24243u;

    /* renamed from: v, reason: collision with root package name */
    protected kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f24244v;

    /* renamed from: w, reason: collision with root package name */
    protected q3.a<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> f24245w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.e kotlin.reflect.jvm.internal.impl.types.h0 h0Var, boolean z5, @d5.d a1 a1Var) {
        super(mVar, gVar, fVar, h0Var, a1Var);
        if (mVar == null) {
            Q(0);
        }
        if (gVar == null) {
            Q(1);
        }
        if (fVar == null) {
            Q(2);
        }
        if (a1Var == null) {
            Q(3);
        }
        this.f24243u = z5;
    }

    private static /* synthetic */ void Q(int i5) {
        Object[] objArr = new Object[3];
        if (i5 == 1) {
            objArr[0] = ProtectedSandApp.s("腪");
        } else if (i5 == 2) {
            objArr[0] = ProtectedSandApp.s("腩");
        } else if (i5 == 3) {
            objArr[0] = ProtectedSandApp.s("腨");
        } else if (i5 == 4 || i5 == 5) {
            objArr[0] = ProtectedSandApp.s("腧");
        } else {
            objArr[0] = ProtectedSandApp.s("腦");
        }
        objArr[1] = ProtectedSandApp.s("腫");
        if (i5 == 4) {
            objArr[2] = ProtectedSandApp.s("腮");
        } else if (i5 != 5) {
            objArr[2] = ProtectedSandApp.s("腬");
        } else {
            objArr[2] = ProtectedSandApp.s("腭");
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("腯"), objArr));
    }

    public void S0(@d5.e kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> jVar, @d5.d q3.a<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar) {
        if (aVar == null) {
            Q(5);
        }
        this.f24245w = aVar;
        if (jVar == null) {
            jVar = aVar.n();
        }
        this.f24244v = jVar;
    }

    public void T0(@d5.d q3.a<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar) {
        if (aVar == null) {
            Q(4);
        }
        S0(null, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    @d5.e
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> e0() {
        kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> jVar = this.f24244v;
        if (jVar != null) {
            return jVar.n();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean q0() {
        return this.f24243u;
    }
}
