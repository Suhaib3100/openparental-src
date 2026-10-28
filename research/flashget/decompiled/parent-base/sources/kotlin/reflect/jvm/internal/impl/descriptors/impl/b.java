package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: AbstractLazyTypeParameterDescriptor.java */
/* loaded from: classes7.dex */
public abstract class b extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l x1 x1Var, boolean z4, int i4, @fg.l a1 a1Var, @fg.l d1 d1Var) {
        super(nVar, mVar, gVar, fVar, x1Var, z4, i4, a1Var, d1Var);
        if (nVar == null) {
            j0(0);
        }
        if (mVar == null) {
            j0(1);
        }
        if (gVar == null) {
            j0(2);
        }
        if (fVar == null) {
            j0(3);
        }
        if (x1Var == null) {
            j0(4);
        }
        if (a1Var == null) {
            j0(5);
        }
        if (d1Var == null) {
            j0(6);
        }
    }

    private static /* synthetic */ void j0(int i4) {
        Object[] objArr = new Object[3];
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("毇\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("毆\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("毅\u0001");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("毄\u0001");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("毃\u0001");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("毂\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("毁\u0001");
                break;
        }
        objArr[1] = ProtectedSandApp.s("毈\u0001");
        objArr[2] = ProtectedSandApp.s("毉\u0001");
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("毊\u0001"), objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    public String toString() {
        String str = "";
        String s4 = l() ? ProtectedSandApp.s("毋\u0001") : "";
        if (o() != x1.INVARIANT) {
            str = o() + ProtectedSandApp.s("毌\u0001");
        }
        return String.format(ProtectedSandApp.s("母\u0001"), s4, str, getName());
    }
}
