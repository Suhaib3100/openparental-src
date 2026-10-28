package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.collections.j0;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.r;
import kotlin.reflect.jvm.internal.impl.storage.j;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: JavaPropertyDescriptor.java */
/* loaded from: classes7.dex */
public class f extends c0 implements a {
    private final boolean F;

    @m
    private final q0<a.InterfaceC1077a<?>, ?> G;
    private h0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @l e0 e0Var, @l u uVar, boolean z4, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l a1 a1Var, @m u0 u0Var, @l b.a aVar, boolean z5, @m q0<a.InterfaceC1077a<?>, ?> q0Var) {
        super(mVar, u0Var, gVar, e0Var, uVar, z4, fVar, aVar, a1Var, false, false, false, false, false, false);
        if (mVar == null) {
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
        if (fVar == null) {
            j0(4);
        }
        if (a1Var == null) {
            j0(5);
        }
        if (aVar == null) {
            j0(6);
        }
        this.H = null;
        this.F = z5;
        this.G = q0Var;
    }

    @l
    public static f h1(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @l e0 e0Var, @l u uVar, boolean z4, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l a1 a1Var, boolean z5) {
        if (mVar == null) {
            j0(7);
        }
        if (gVar == null) {
            j0(8);
        }
        if (e0Var == null) {
            j0(9);
        }
        if (uVar == null) {
            j0(10);
        }
        if (fVar == null) {
            j0(11);
        }
        if (a1Var == null) {
            j0(12);
        }
        return new f(mVar, gVar, e0Var, uVar, z4, fVar, a1Var, null, b.a.DECLARATION, z5, null);
    }

    private static /* synthetic */ void j0(int i4) {
        String s4 = i4 != 21 ? ProtectedSandApp.s("灑\u0001") : ProtectedSandApp.s("灒\u0001");
        Object[] objArr = new Object[i4 != 21 ? 3 : 2];
        String s5 = ProtectedSandApp.s("灓\u0001");
        switch (i4) {
            case 1:
            case 8:
                objArr[0] = ProtectedSandApp.s("灡\u0001");
                break;
            case 2:
            case 9:
                objArr[0] = ProtectedSandApp.s("灠\u0001");
                break;
            case 3:
            case 10:
                objArr[0] = ProtectedSandApp.s("灟\u0001");
                break;
            case 4:
            case 11:
                objArr[0] = ProtectedSandApp.s("灞\u0001");
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = ProtectedSandApp.s("灝\u0001");
                break;
            case 6:
            case 16:
                objArr[0] = ProtectedSandApp.s("灜\u0001");
                break;
            case 7:
            default:
                objArr[0] = ProtectedSandApp.s("灔\u0001");
                break;
            case 13:
                objArr[0] = ProtectedSandApp.s("灛\u0001");
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("灚\u0001");
                break;
            case 15:
                objArr[0] = ProtectedSandApp.s("灙\u0001");
                break;
            case 17:
                objArr[0] = ProtectedSandApp.s("灘\u0001");
                break;
            case 19:
                objArr[0] = ProtectedSandApp.s("灗\u0001");
                break;
            case 20:
                objArr[0] = ProtectedSandApp.s("灖\u0001");
                break;
            case 21:
                objArr[0] = s5;
                break;
            case 22:
                objArr[0] = ProtectedSandApp.s("灕\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("灢\u0001");
        if (i4 != 21) {
            objArr[1] = s5;
        } else {
            objArr[1] = s6;
        }
        switch (i4) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = ProtectedSandApp.s("灦\u0001");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = ProtectedSandApp.s("灥\u0001");
                break;
            case 19:
            case 20:
                objArr[2] = s6;
                break;
            case 21:
                break;
            case 22:
                objArr[2] = ProtectedSandApp.s("灤\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("灣\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 == 21) {
            throw new IllegalStateException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0
    @l
    protected c0 R0(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @l e0 e0Var, @l u uVar, @m u0 u0Var, @l b.a aVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l a1 a1Var) {
        if (mVar == null) {
            j0(13);
        }
        if (e0Var == null) {
            j0(14);
        }
        if (uVar == null) {
            j0(15);
        }
        if (aVar == null) {
            j0(16);
        }
        if (fVar == null) {
            j0(17);
        }
        if (a1Var == null) {
            j0(18);
        }
        return new f(mVar, getAnnotations(), e0Var, uVar, Q(), fVar, a1Var, u0Var, aVar, this.F, this.G);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0
    public void b1(@l h0 h0Var) {
        if (h0Var == null) {
            j0(22);
        }
        this.H = h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @l
    public a d0(@m h0 h0Var, @l List<h0> list, @l h0 h0Var2, @m q0<a.InterfaceC1077a<?>, ?> q0Var) {
        d0 d0Var;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 e0Var;
        if (list == null) {
            j0(19);
        }
        if (h0Var2 == null) {
            j0(20);
        }
        u0 a5 = a() == this ? null : a();
        f fVar = new f(c(), getAnnotations(), u(), getVisibility(), Q(), getName(), f(), a5, b(), this.F, q0Var);
        d0 getter = getGetter();
        if (getter != null) {
            d0Var = r15;
            d0 d0Var2 = new d0(fVar, getter.getAnnotations(), getter.u(), getter.getVisibility(), getter.J(), getter.t(), getter.k(), b(), a5 == null ? null : a5.getGetter(), getter.f());
            d0Var.O0(getter.u0());
            d0Var.R0(h0Var2);
        } else {
            d0Var = null;
        }
        w0 setter = getSetter();
        if (setter != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 e0Var2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.e0(fVar, setter.getAnnotations(), setter.u(), setter.getVisibility(), setter.J(), setter.t(), setter.k(), b(), a5 == null ? null : a5.getSetter(), setter.f());
            e0Var2.O0(e0Var2.u0());
            e0Var2.S0(setter.i().get(0));
            e0Var = e0Var2;
        } else {
            e0Var = null;
        }
        fVar.X0(d0Var, e0Var, y0(), T());
        fVar.c1(Y0());
        ld.a<j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar = this.f76075j;
        if (aVar != null) {
            fVar.M0(this.f76074i, aVar);
        }
        fVar.F0(e());
        fVar.d1(h0Var2, getTypeParameters(), O(), h0Var == null ? null : kotlin.reflect.jvm.internal.impl.resolve.e.i(this, h0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b()), j0.f74919b);
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean i0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0, kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean isConst() {
        h0 type = getType();
        return this.F && kotlin.reflect.jvm.internal.impl.descriptors.j.a(type) && (!r.i(type) || kotlin.reflect.jvm.internal.impl.builtins.h.v0(type));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0, kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m
    public <V> V w0(a.InterfaceC1077a<V> interfaceC1077a) {
        q0<a.InterfaceC1077a<?>, ?> q0Var = this.G;
        if (q0Var == null || !q0Var.e().equals(interfaceC1077a)) {
            return null;
        }
        return (V) this.G.f();
    }
}
