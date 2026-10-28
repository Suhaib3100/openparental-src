package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DeclarationDescriptorImpl.java */
/* loaded from: classes7.dex */
public abstract class j extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.b implements kotlin.reflect.jvm.internal.impl.descriptors.m {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.f f76035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(gVar);
        if (gVar == null) {
            j0(0);
        }
        if (fVar == null) {
            j0(1);
        }
        this.f76035c = fVar;
    }

    private static /* synthetic */ void j0(int i4) {
        String s4 = (i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6) ? ProtectedSandApp.s("梁\u0001") : ProtectedSandApp.s("梀\u0001");
        Object[] objArr = new Object[(i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6) ? 2 : 3];
        String s5 = ProtectedSandApp.s("梂\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("梅\u0001");
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = s5;
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("梄\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("梃\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("梆\u0001");
        if (i4 == 2) {
            objArr[1] = ProtectedSandApp.s("梈\u0001");
        } else if (i4 == 3) {
            objArr[1] = ProtectedSandApp.s("梇\u0001");
        } else if (i4 == 5 || i4 == 6) {
            objArr[1] = s6;
        } else {
            objArr[1] = s5;
        }
        if (i4 != 2 && i4 != 3) {
            if (i4 == 4) {
                objArr[2] = s6;
            } else if (i4 != 5 && i4 != 6) {
                objArr[2] = ProtectedSandApp.s("梉\u0001");
            }
        }
        String format = String.format(s4, objArr);
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @fg.l
    public static String l0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            j0(4);
        }
        try {
            String str = kotlin.reflect.jvm.internal.impl.renderer.c.f77801j.s(mVar) + ProtectedSandApp.s("梊\u0001") + mVar.getClass().getSimpleName() + ProtectedSandApp.s("梋\u0001") + Integer.toHexString(System.identityHashCode(mVar)) + ProtectedSandApp.s("梌\u0001");
            if (str == null) {
                j0(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = mVar.getClass().getSimpleName() + ProtectedSandApp.s("梍\u0001") + mVar.getName();
            if (str2 == null) {
                j0(6);
            }
            return str2;
        }
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.m a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f fVar = this.f76035c;
        if (fVar == null) {
            j0(2);
        }
        return fVar;
    }

    public String toString() {
        return l0(this);
    }
}
