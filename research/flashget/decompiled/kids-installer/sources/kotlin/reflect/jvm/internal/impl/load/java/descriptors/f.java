package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.r;
import kotlin.reflect.jvm.internal.impl.storage.j;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: JavaPropertyDescriptor.java */
/* loaded from: classes6.dex */
public class f extends c0 implements a {
    private final boolean S;

    @d5.e
    private final Pair<a.InterfaceC0274a<?>, ?> T;
    private h0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(@d5.d m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d e0 e0Var, @d5.d u uVar, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d a1 a1Var, @d5.e u0 u0Var, @d5.d b.a aVar, boolean z6, @d5.e Pair<a.InterfaceC0274a<?>, ?> pair) {
        super(mVar, u0Var, gVar, e0Var, uVar, z5, fVar, aVar, a1Var, false, false, false, false, false, false);
        if (mVar == null) {
            Q(0);
        }
        if (gVar == null) {
            Q(1);
        }
        if (e0Var == null) {
            Q(2);
        }
        if (uVar == null) {
            Q(3);
        }
        if (fVar == null) {
            Q(4);
        }
        if (a1Var == null) {
            Q(5);
        }
        if (aVar == null) {
            Q(6);
        }
        this.U = null;
        this.S = z6;
        this.T = pair;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5 = i5 != 21 ? ProtectedSandApp.s("萬") : ProtectedSandApp.s("萭");
        Object[] objArr = new Object[i5 != 21 ? 3 : 2];
        String s6 = ProtectedSandApp.s("萮");
        switch (i5) {
            case 1:
            case 8:
                objArr[0] = ProtectedSandApp.s("萼");
                break;
            case 2:
            case 9:
                objArr[0] = ProtectedSandApp.s("萻");
                break;
            case 3:
            case 10:
                objArr[0] = ProtectedSandApp.s("萺");
                break;
            case 4:
            case 11:
                objArr[0] = ProtectedSandApp.s("萹");
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = ProtectedSandApp.s("萸");
                break;
            case 6:
            case 16:
                objArr[0] = ProtectedSandApp.s("萷");
                break;
            case 7:
            default:
                objArr[0] = ProtectedSandApp.s("萯");
                break;
            case 13:
                objArr[0] = ProtectedSandApp.s("萶");
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("萵");
                break;
            case 15:
                objArr[0] = ProtectedSandApp.s("萴");
                break;
            case 17:
                objArr[0] = ProtectedSandApp.s("萳");
                break;
            case 19:
                objArr[0] = ProtectedSandApp.s("萲");
                break;
            case 20:
                objArr[0] = ProtectedSandApp.s("萱");
                break;
            case 21:
                objArr[0] = s6;
                break;
            case 22:
                objArr[0] = ProtectedSandApp.s("萰");
                break;
        }
        String s7 = ProtectedSandApp.s("落");
        if (i5 != 21) {
            objArr[1] = s6;
        } else {
            objArr[1] = s7;
        }
        switch (i5) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = ProtectedSandApp.s("葁");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = ProtectedSandApp.s("葀");
                break;
            case 19:
            case 20:
                objArr[2] = s7;
                break;
            case 21:
                break;
            case 22:
                objArr[2] = ProtectedSandApp.s("萿");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("萾");
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 == 21) {
            throw new IllegalStateException(format);
        }
    }

    @d5.d
    public static f n1(@d5.d m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d e0 e0Var, @d5.d u uVar, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d a1 a1Var, boolean z6) {
        if (mVar == null) {
            Q(7);
        }
        if (gVar == null) {
            Q(8);
        }
        if (e0Var == null) {
            Q(9);
        }
        if (uVar == null) {
            Q(10);
        }
        if (fVar == null) {
            Q(11);
        }
        if (a1Var == null) {
            Q(12);
        }
        return new f(mVar, gVar, e0Var, uVar, z5, fVar, a1Var, null, b.a.DECLARATION, z6, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @d5.d
    public a K(@d5.e h0 h0Var, @d5.d List<h0> list, @d5.d h0 h0Var2, @d5.e Pair<a.InterfaceC0274a<?>, ?> pair) {
        d0 d0Var;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 e0Var;
        if (list == null) {
            Q(19);
        }
        if (h0Var2 == null) {
            Q(20);
        }
        u0 a6 = a() == this ? null : a();
        f fVar = new f(b(), getAnnotations(), r(), c(), q0(), getName(), k(), a6, j(), this.S, pair);
        d0 e6 = e();
        if (e6 != null) {
            d0Var = r15;
            d0 d0Var2 = new d0(fVar, e6.getAnnotations(), e6.r(), e6.c(), e6.c0(), e6.q(), e6.p(), j(), a6 == null ? null : a6.e(), e6.k());
            d0Var.U0(e6.k0());
            d0Var.X0(h0Var2);
        } else {
            d0Var = null;
        }
        w0 h5 = h();
        if (h5 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 e0Var2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.e0(fVar, h5.getAnnotations(), h5.r(), h5.c(), h5.c0(), h5.q(), h5.p(), j(), a6 == null ? null : a6.h(), h5.k());
            e0Var2.U0(e0Var2.k0());
            e0Var2.Y0(h5.n().get(0));
            e0Var = e0Var2;
        } else {
            e0Var = null;
        }
        fVar.d1(d0Var, e0Var, x0(), u0());
        fVar.i1(e1());
        q3.a<j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar = this.f24245w;
        if (aVar != null) {
            fVar.S0(this.f24244v, aVar);
        }
        fVar.E0(g());
        fVar.j1(h0Var2, getTypeParameters(), m0(), h0Var == null ? null : kotlin.reflect.jvm.internal.impl.resolve.d.i(this, h0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b()), EmptyList.f23167o);
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean P() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0
    @d5.d
    protected c0 X0(@d5.d m mVar, @d5.d e0 e0Var, @d5.d u uVar, @d5.e u0 u0Var, @d5.d b.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d a1 a1Var) {
        if (mVar == null) {
            Q(13);
        }
        if (e0Var == null) {
            Q(14);
        }
        if (uVar == null) {
            Q(15);
        }
        if (aVar == null) {
            Q(16);
        }
        if (fVar == null) {
            Q(17);
        }
        if (a1Var == null) {
            Q(18);
        }
        return new f(mVar, getAnnotations(), e0Var, uVar, q0(), fVar, a1Var, u0Var, aVar, this.S, this.T);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0
    public void h1(@d5.d h0 h0Var) {
        if (h0Var == null) {
            Q(22);
        }
        this.U = h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0, kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public <V> V p0(a.InterfaceC0274a<V> interfaceC0274a) {
        Pair<a.InterfaceC0274a<?>, ?> pair = this.T;
        if (pair == null || !pair.e().equals(interfaceC0274a)) {
            return null;
        }
        return (V) this.T.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0, kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean s() {
        h0 type = getType();
        return this.S && kotlin.reflect.jvm.internal.impl.descriptors.j.a(type) && (!r.i(type) || kotlin.reflect.jvm.internal.impl.builtins.h.u0(type));
    }
}
