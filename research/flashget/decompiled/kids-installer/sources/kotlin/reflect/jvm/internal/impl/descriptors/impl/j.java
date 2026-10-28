package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: DeclarationDescriptorImpl.java */
/* loaded from: classes6.dex */
public abstract class j extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.b implements kotlin.reflect.jvm.internal.impl.descriptors.m {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.f f24210p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(gVar);
        if (gVar == null) {
            Q(0);
        }
        if (fVar == null) {
            Q(1);
        }
        this.f24210p = fVar;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5 = (i5 == 2 || i5 == 3 || i5 == 5 || i5 == 6) ? ProtectedSandApp.s("聳") : ProtectedSandApp.s("聲");
        Object[] objArr = new Object[(i5 == 2 || i5 == 3 || i5 == 5 || i5 == 6) ? 2 : 3];
        String s6 = ProtectedSandApp.s("聴");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("職");
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = s6;
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("聶");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("聵");
                break;
        }
        String s7 = ProtectedSandApp.s("聸");
        if (i5 == 2) {
            objArr[1] = ProtectedSandApp.s("聺");
        } else if (i5 == 3) {
            objArr[1] = ProtectedSandApp.s("聹");
        } else if (i5 == 5 || i5 == 6) {
            objArr[1] = s7;
        } else {
            objArr[1] = s6;
        }
        if (i5 != 2 && i5 != 3) {
            if (i5 == 4) {
                objArr[2] = s7;
            } else if (i5 != 5 && i5 != 6) {
                objArr[2] = ProtectedSandApp.s("聻");
            }
        }
        String format = String.format(s5, objArr);
        if (i5 != 2 && i5 != 3 && i5 != 5 && i5 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @d5.d
    public static String S(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            Q(4);
        }
        try {
            String str = kotlin.reflect.jvm.internal.impl.renderer.c.f25819j.s(mVar) + ProtectedSandApp.s("聼") + mVar.getClass().getSimpleName() + ProtectedSandApp.s("聽") + Integer.toHexString(System.identityHashCode(mVar)) + ProtectedSandApp.s("聾");
            if (str == null) {
                Q(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = mVar.getClass().getSimpleName() + ProtectedSandApp.s("聿") + mVar.getName();
            if (str2 == null) {
                Q(6);
            }
            return str2;
        }
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.m a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f fVar = this.f24210p;
        if (fVar == null) {
            Q(2);
        }
        return fVar;
    }

    public String toString() {
        return S(this);
    }
}
