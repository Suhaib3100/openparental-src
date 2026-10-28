package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;

/* compiled from: VariableDescriptorWithInitializerImpl.java */
/* loaded from: classes7.dex */
public abstract class n0 extends m0 {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f76072k = false;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f76073h;

    /* renamed from: i, reason: collision with root package name */
    protected kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f76074i;

    /* renamed from: j, reason: collision with root package name */
    protected ld.a<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> f76075j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.m kotlin.reflect.jvm.internal.impl.types.h0 h0Var, boolean z4, @fg.l a1 a1Var) {
        super(mVar, gVar, fVar, h0Var, a1Var);
        if (mVar == null) {
            j0(0);
        }
        if (gVar == null) {
            j0(1);
        }
        if (fVar == null) {
            j0(2);
        }
        if (a1Var == null) {
            j0(3);
        }
        this.f76073h = z4;
    }

    private static /* synthetic */ void j0(int i4) {
        Object[] objArr = new Object[3];
        if (i4 == 1) {
            objArr[0] = ProtectedSandApp.s("毸\u0001");
        } else if (i4 == 2) {
            objArr[0] = ProtectedSandApp.s("毷\u0001");
        } else if (i4 == 3) {
            objArr[0] = ProtectedSandApp.s("毶\u0001");
        } else if (i4 == 4 || i4 == 5) {
            objArr[0] = ProtectedSandApp.s("毵\u0001");
        } else {
            objArr[0] = ProtectedSandApp.s("毴\u0001");
        }
        objArr[1] = ProtectedSandApp.s("毹\u0001");
        if (i4 == 4) {
            objArr[2] = ProtectedSandApp.s("毼\u0001");
        } else if (i4 != 5) {
            objArr[2] = ProtectedSandApp.s("毺\u0001");
        } else {
            objArr[2] = ProtectedSandApp.s("毻\u0001");
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("毽\u0001"), objArr));
    }

    public void M0(@fg.m kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> jVar, @fg.l ld.a<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar) {
        if (aVar == null) {
            j0(5);
        }
        this.f76075j = aVar;
        if (jVar == null) {
            jVar = aVar.invoke();
        }
        this.f76074i = jVar;
    }

    public void N0(@fg.l ld.a<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar) {
        if (aVar == null) {
            j0(4);
        }
        M0(null, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean Q() {
        return this.f76073h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    @fg.m
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> q0() {
        kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> jVar = this.f76074i;
        if (jVar != null) {
            return jVar.invoke();
        }
        return null;
    }
}
