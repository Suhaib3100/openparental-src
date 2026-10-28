package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: JavaClassConstructorDescriptor.java */
/* loaded from: classes6.dex */
public class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.f implements a {
    static final /* synthetic */ boolean W = false;
    private Boolean U;
    private Boolean V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.e b bVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, @d5.d b.a aVar, @d5.d a1 a1Var) {
        super(eVar, bVar, gVar, z5, aVar, a1Var);
        if (eVar == null) {
            Q(0);
        }
        if (gVar == null) {
            Q(1);
        }
        if (aVar == null) {
            Q(2);
        }
        if (a1Var == null) {
            Q(3);
        }
        this.U = null;
        this.V = null;
    }

    @d5.d
    public static b A1(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, @d5.d a1 a1Var) {
        if (eVar == null) {
            Q(4);
        }
        if (gVar == null) {
            Q(5);
        }
        if (a1Var == null) {
            Q(6);
        }
        return new b(eVar, null, gVar, z5, b.a.DECLARATION, a1Var);
    }

    private static /* synthetic */ void Q(int i5) {
        String s5 = (i5 == 11 || i5 == 18) ? ProtectedSandApp.s("萚") : ProtectedSandApp.s("萙");
        Object[] objArr = new Object[(i5 == 11 || i5 == 18) ? 2 : 3];
        String s6 = ProtectedSandApp.s("萛");
        switch (i5) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = ProtectedSandApp.s("萣");
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = ProtectedSandApp.s("萢");
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = ProtectedSandApp.s("萡");
                break;
            case 4:
            default:
                objArr[0] = ProtectedSandApp.s("萜");
                break;
            case 7:
            case 12:
                objArr[0] = ProtectedSandApp.s("萠");
                break;
            case 11:
            case 18:
                objArr[0] = s6;
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("萟");
                break;
            case 16:
                objArr[0] = ProtectedSandApp.s("萞");
                break;
            case 17:
                objArr[0] = ProtectedSandApp.s("萝");
                break;
        }
        String s7 = ProtectedSandApp.s("萤");
        String s8 = ProtectedSandApp.s("营");
        if (i5 == 11) {
            objArr[1] = s8;
        } else if (i5 != 18) {
            objArr[1] = s6;
        } else {
            objArr[1] = s7;
        }
        switch (i5) {
            case 4:
            case 5:
            case 6:
                objArr[2] = ProtectedSandApp.s("萨");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = s8;
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = ProtectedSandApp.s("萧");
                break;
            case 16:
            case 17:
                objArr[2] = s7;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("萦");
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 != 11 && i5 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.f
    @d5.d
    /* renamed from: B1, reason: merged with bridge method [inline-methods] */
    public b S0(@d5.d m mVar, @d5.e z zVar, @d5.d b.a aVar, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d a1 a1Var) {
        if (mVar == null) {
            Q(7);
        }
        if (aVar == null) {
            Q(8);
        }
        if (gVar == null) {
            Q(9);
        }
        if (a1Var == null) {
            Q(10);
        }
        if (aVar == b.a.DECLARATION || aVar == b.a.SYNTHESIZED) {
            b z12 = z1((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar, (b) zVar, aVar, a1Var, gVar);
            z12.f1(X0());
            z12.g1(P());
            return z12;
        }
        throw new IllegalStateException(ProtectedSandApp.s("萩") + this + ProtectedSandApp.s("萪") + mVar + ProtectedSandApp.s("萫") + aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @d5.d
    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    public b K(@d5.e h0 h0Var, @d5.d List<h0> list, @d5.d h0 h0Var2, @d5.e Pair<a.InterfaceC0274a<?>, ?> pair) {
        if (list == null) {
            Q(16);
        }
        if (h0Var2 == null) {
            Q(17);
        }
        b S0 = S0(b(), null, j(), null, getAnnotations(), k());
        S0.Y0(h0Var == null ? null : kotlin.reflect.jvm.internal.impl.resolve.d.i(S0, h0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b()), m0(), EmptyList.f23167o, getTypeParameters(), h.a(list, n(), S0), h0Var2, r(), c());
        if (pair != null) {
            S0.b1(pair.e(), pair.f());
        }
        return S0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean P() {
        return this.V.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    public boolean X0() {
        return this.U.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    public void f1(boolean z5) {
        this.U = Boolean.valueOf(z5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    public void g1(boolean z5) {
        this.V = Boolean.valueOf(z5);
    }

    @d5.d
    protected b z1(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.e b bVar, @d5.d b.a aVar, @d5.d a1 a1Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (eVar == null) {
            Q(12);
        }
        if (aVar == null) {
            Q(13);
        }
        if (a1Var == null) {
            Q(14);
        }
        if (gVar == null) {
            Q(15);
        }
        return new b(eVar, bVar, gVar, this.S, aVar, a1Var);
    }
}
