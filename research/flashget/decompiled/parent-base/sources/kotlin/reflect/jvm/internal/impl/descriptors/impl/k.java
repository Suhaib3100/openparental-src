package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;

/* compiled from: DeclarationDescriptorNonRootImpl.java */
/* loaded from: classes7.dex */
public abstract class k extends j implements kotlin.reflect.jvm.internal.impl.descriptors.n {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.m f76038d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final a1 f76039e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected k(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l a1 a1Var) {
        super(gVar, fVar);
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
        this.f76038d = mVar;
        this.f76039e = a1Var;
    }

    private static /* synthetic */ void j0(int i4) {
        String s4 = (i4 == 4 || i4 == 5 || i4 == 6) ? ProtectedSandApp.s("梏\u0001") : ProtectedSandApp.s("梎\u0001");
        Object[] objArr = new Object[(i4 == 4 || i4 == 5 || i4 == 6) ? 2 : 3];
        String s5 = ProtectedSandApp.s("梐\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("梔\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("梓\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("梒\u0001");
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = s5;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("梑\u0001");
                break;
        }
        if (i4 == 4) {
            objArr[1] = ProtectedSandApp.s("梗\u0001");
        } else if (i4 == 5) {
            objArr[1] = ProtectedSandApp.s("梖\u0001");
        } else if (i4 != 6) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("梕\u0001");
        }
        if (i4 != 4 && i4 != 5 && i4 != 6) {
            objArr[2] = ProtectedSandApp.s("梘\u0001");
        }
        String format = String.format(s4, objArr);
        if (i4 != 4 && i4 != 5 && i4 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.p a() {
        return this;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.m c() {
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar = this.f76038d;
        if (mVar == null) {
            j0(5);
        }
        return mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @fg.l
    public a1 f() {
        a1 a1Var = this.f76039e;
        if (a1Var == null) {
            j0(6);
        }
        return a1Var;
    }
}
