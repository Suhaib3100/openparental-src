package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class d0 extends b0 implements v0 {
    private kotlin.reflect.jvm.internal.impl.types.h0 B;

    @d5.d
    private final v0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(@d5.d u0 u0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar, boolean z5, boolean z6, boolean z7, @d5.d b.a aVar, @d5.e v0 v0Var, @d5.d a1 a1Var) {
        super(e0Var, uVar, u0Var, gVar, kotlin.reflect.jvm.internal.impl.name.f.s(ProtectedSandApp.s("膰") + u0Var.getName() + ProtectedSandApp.s("膱")), z5, z6, z7, aVar, a1Var);
        d0 d0Var;
        d0 d0Var2;
        if (u0Var == null) {
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
        if (aVar == null) {
            Q(4);
        }
        if (a1Var == null) {
            Q(5);
        }
        if (v0Var != 0) {
            d0Var2 = this;
            d0Var = v0Var;
        } else {
            d0Var = this;
            d0Var2 = d0Var;
        }
        d0Var2.C = d0Var;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5 = (i5 == 6 || i5 == 7 || i5 == 8) ? ProtectedSandApp.s("膳") : ProtectedSandApp.s("膲");
        Object[] objArr = new Object[(i5 == 6 || i5 == 7 || i5 == 8) ? 2 : 3];
        String s6 = ProtectedSandApp.s("膴");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("膺");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("膹");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("膸");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("膷");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("膶");
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = s6;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("膵");
                break;
        }
        if (i5 == 6) {
            objArr[1] = ProtectedSandApp.s("膽");
        } else if (i5 == 7) {
            objArr[1] = ProtectedSandApp.s("膼");
        } else if (i5 != 8) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("膻");
        }
        if (i5 != 6 && i5 != 7 && i5 != 8) {
            objArr[2] = ProtectedSandApp.s("膾");
        }
        String format = String.format(s5, objArr);
        if (i5 != 6 && i5 != 7 && i5 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        return oVar.b(this, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b0, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    /* renamed from: W0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public v0 a() {
        v0 v0Var = this.C;
        if (v0Var == null) {
            Q(8);
        }
        return v0Var;
    }

    public void X0(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            h0Var = I0().getType();
        }
        this.B = h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public Collection<? extends v0> g() {
        Collection<t0> S0 = super.S0(true);
        if (S0 == null) {
            Q(6);
        }
        return S0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public kotlin.reflect.jvm.internal.impl.types.h0 i() {
        return this.B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<j1> n() {
        List<j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            Q(7);
        }
        return emptyList;
    }
}
