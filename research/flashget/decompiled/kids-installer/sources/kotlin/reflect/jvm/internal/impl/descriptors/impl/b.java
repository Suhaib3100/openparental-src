package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: AbstractLazyTypeParameterDescriptor.java */
/* loaded from: classes6.dex */
public abstract class b extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d x1 x1Var, boolean z5, int i5, @d5.d a1 a1Var, @d5.d d1 d1Var) {
        super(nVar, mVar, gVar, fVar, x1Var, z5, i5, a1Var, d1Var);
        if (nVar == null) {
            Q(0);
        }
        if (mVar == null) {
            Q(1);
        }
        if (gVar == null) {
            Q(2);
        }
        if (fVar == null) {
            Q(3);
        }
        if (x1Var == null) {
            Q(4);
        }
        if (a1Var == null) {
            Q(5);
        }
        if (d1Var == null) {
            Q(6);
        }
    }

    private static /* synthetic */ void Q(int i5) {
        Object[] objArr = new Object[3];
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("腐");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("腏");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("腎");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("腍");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("腌");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("腋");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("腊");
                break;
        }
        objArr[1] = ProtectedSandApp.s("腑");
        objArr[2] = ProtectedSandApp.s("腒");
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("腓"), objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = v() ? ProtectedSandApp.s("腔") : "";
        if (z() != x1.INVARIANT) {
            str = z() + ProtectedSandApp.s("腕");
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format(ProtectedSandApp.s("腖"), objArr);
    }
}
