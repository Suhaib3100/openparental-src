package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;

/* compiled from: PropertyGetterDescriptorImpl.java */
/* loaded from: classes7.dex */
public class d0 extends b0 implements v0 {

    /* renamed from: o, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.types.h0 f75999o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private final v0 f76000p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(@fg.l u0 u0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar, boolean z4, boolean z5, boolean z6, @fg.l b.a aVar, @fg.m v0 v0Var, @fg.l a1 a1Var) {
        super(e0Var, uVar, u0Var, gVar, kotlin.reflect.jvm.internal.impl.name.f.i(ProtectedSandApp.s("氾\u0001") + u0Var.getName() + ProtectedSandApp.s("氿\u0001")), z4, z5, z6, aVar, a1Var);
        d0 d0Var;
        d0 d0Var2;
        if (u0Var == null) {
            j0(0);
        }
        if (gVar == null) {
            j0(1);
        }
        if (e0Var == null) {
            j0(2);
        }
        if (uVar == null) {
            j0(3);
        }
        if (aVar == null) {
            j0(4);
        }
        if (a1Var == null) {
            j0(5);
        }
        if (v0Var != 0) {
            d0Var2 = this;
            d0Var = v0Var;
        } else {
            d0Var = this;
            d0Var2 = d0Var;
        }
        d0Var2.f76000p = d0Var;
    }

    private static /* synthetic */ void j0(int i4) {
        String s4 = (i4 == 6 || i4 == 7 || i4 == 8) ? ProtectedSandApp.s("汁\u0001") : ProtectedSandApp.s("汀\u0001");
        Object[] objArr = new Object[(i4 == 6 || i4 == 7 || i4 == 8) ? 2 : 3];
        String s5 = ProtectedSandApp.s("求\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("汈\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("汇\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("汆\u0001");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("汅\u0001");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("汄\u0001");
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = s5;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("汃\u0001");
                break;
        }
        if (i4 == 6) {
            objArr[1] = ProtectedSandApp.s("汋\u0001");
        } else if (i4 == 7) {
            objArr[1] = ProtectedSandApp.s("汊\u0001");
        } else if (i4 != 8) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("汉\u0001");
        }
        if (i4 != 6 && i4 != 7 && i4 != 8) {
            objArr[2] = ProtectedSandApp.s("汌\u0001");
        }
        String format = String.format(s4, objArr);
        if (i4 != 6 && i4 != 7 && i4 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        return oVar.g(this, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b0, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public v0 a() {
        v0 v0Var = this.f76000p;
        if (v0Var == null) {
            j0(8);
        }
        return v0Var;
    }

    public void R0(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            h0Var = Y().getType();
        }
        this.f75999o = h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public Collection<? extends v0> e() {
        Collection<t0> M0 = super.M0(true);
        if (M0 == null) {
            j0(6);
        }
        return M0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public kotlin.reflect.jvm.internal.impl.types.h0 getReturnType() {
        return this.f75999o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<j1> i() {
        List<j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            j0(7);
        }
        return emptyList;
    }
}
