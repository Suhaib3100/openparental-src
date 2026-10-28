package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;

/* compiled from: ClassDescriptorBase.java */
/* loaded from: classes6.dex */
public abstract class g extends a {

    /* renamed from: u, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.m f24200u;

    /* renamed from: v, reason: collision with root package name */
    private final a1 f24201v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f24202w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected g(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d a1 a1Var, boolean z5) {
        super(nVar, fVar);
        if (nVar == null) {
            H0(0);
        }
        if (mVar == null) {
            H0(1);
        }
        if (fVar == null) {
            H0(2);
        }
        if (a1Var == null) {
            H0(3);
        }
        this.f24200u = mVar;
        this.f24201v = a1Var;
        this.f24202w = z5;
    }

    private static /* synthetic */ void H0(int i5) {
        String s5 = (i5 == 4 || i5 == 5) ? ProtectedSandApp.s("舝") : ProtectedSandApp.s("舜");
        Object[] objArr = new Object[(i5 == 4 || i5 == 5) ? 2 : 3];
        String s6 = ProtectedSandApp.s("舞");
        if (i5 == 1) {
            objArr[0] = ProtectedSandApp.s("舢");
        } else if (i5 == 2) {
            objArr[0] = ProtectedSandApp.s("舡");
        } else if (i5 == 3) {
            objArr[0] = ProtectedSandApp.s("舠");
        } else if (i5 == 4 || i5 == 5) {
            objArr[0] = s6;
        } else {
            objArr[0] = ProtectedSandApp.s("舟");
        }
        if (i5 == 4) {
            objArr[1] = ProtectedSandApp.s("舤");
        } else if (i5 != 5) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("舣");
        }
        if (i5 != 4 && i5 != 5) {
            objArr[2] = ProtectedSandApp.s("舥");
        }
        String format = String.format(s5, objArr);
        if (i5 != 4 && i5 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.m b() {
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar = this.f24200u;
        if (mVar == null) {
            H0(4);
        }
        return mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @d5.d
    public a1 k() {
        a1 a1Var = this.f24201v;
        if (a1Var == null) {
            H0(5);
        }
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean q() {
        return this.f24202w;
    }
}
