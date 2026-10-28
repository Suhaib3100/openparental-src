package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;

/* compiled from: ClassDescriptorBase.java */
/* loaded from: classes7.dex */
public abstract class g extends a {

    /* renamed from: h, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.m f76021h;

    /* renamed from: i, reason: collision with root package name */
    private final a1 f76022i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f76023j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected g(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l a1 a1Var, boolean z4) {
        super(nVar, fVar);
        if (nVar == null) {
            G0(0);
        }
        if (mVar == null) {
            G0(1);
        }
        if (fVar == null) {
            G0(2);
        }
        if (a1Var == null) {
            G0(3);
        }
        this.f76021h = mVar;
        this.f76022i = a1Var;
        this.f76023j = z4;
    }

    private static /* synthetic */ void G0(int i4) {
        String s4 = (i4 == 4 || i4 == 5) ? ProtectedSandApp.s("沮\u0001") : ProtectedSandApp.s("沭\u0001");
        Object[] objArr = new Object[(i4 == 4 || i4 == 5) ? 2 : 3];
        String s5 = ProtectedSandApp.s("沯\u0001");
        if (i4 == 1) {
            objArr[0] = ProtectedSandApp.s("河\u0001");
        } else if (i4 == 2) {
            objArr[0] = ProtectedSandApp.s("沲\u0001");
        } else if (i4 == 3) {
            objArr[0] = ProtectedSandApp.s("沱\u0001");
        } else if (i4 == 4 || i4 == 5) {
            objArr[0] = s5;
        } else {
            objArr[0] = ProtectedSandApp.s("沰\u0001");
        }
        if (i4 == 4) {
            objArr[1] = ProtectedSandApp.s("沵\u0001");
        } else if (i4 != 5) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("沴\u0001");
        }
        if (i4 != 4 && i4 != 5) {
            objArr[2] = ProtectedSandApp.s("沶\u0001");
        }
        String format = String.format(s4, objArr);
        if (i4 != 4 && i4 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.m c() {
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar = this.f76021h;
        if (mVar == null) {
            G0(4);
        }
        return mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @fg.l
    public a1 f() {
        a1 a1Var = this.f76022i;
        if (a1Var == null) {
            G0(5);
        }
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean t() {
        return this.f76023j;
    }
}
