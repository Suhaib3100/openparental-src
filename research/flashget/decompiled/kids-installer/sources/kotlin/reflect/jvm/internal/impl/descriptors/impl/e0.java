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
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: PropertySetterDescriptorImpl.java */
/* loaded from: classes6.dex */
public class e0 extends b0 implements w0 {
    static final /* synthetic */ boolean D = false;
    private j1 B;

    @d5.d
    private final w0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(@d5.d u0 u0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar, boolean z5, boolean z6, boolean z7, @d5.d b.a aVar, @d5.e w0 w0Var, @d5.d a1 a1Var) {
        super(e0Var, uVar, u0Var, gVar, kotlin.reflect.jvm.internal.impl.name.f.s(ProtectedSandApp.s("臝") + u0Var.getName() + ProtectedSandApp.s("臞")), z5, z6, z7, aVar, a1Var);
        e0 e0Var2;
        e0 e0Var3;
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
        if (w0Var != 0) {
            e0Var3 = this;
            e0Var2 = w0Var;
        } else {
            e0Var2 = this;
            e0Var3 = e0Var2;
        }
        e0Var3.C = e0Var2;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5;
        int i6;
        switch (i5) {
            case 10:
            case 11:
            case 12:
            case 13:
                s5 = ProtectedSandApp.s("臠");
                break;
            default:
                s5 = ProtectedSandApp.s("臟");
                break;
        }
        switch (i5) {
            case 10:
            case 11:
            case 12:
            case 13:
                i6 = 2;
                break;
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("臡");
        switch (i5) {
            case 1:
            case 9:
                objArr[0] = ProtectedSandApp.s("自");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("臩");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("臨");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("臧");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("臦");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("臥");
                break;
            case 7:
                objArr[0] = ProtectedSandApp.s("臤");
                break;
            case 8:
                objArr[0] = ProtectedSandApp.s("臣");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = s6;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("臢");
                break;
        }
        switch (i5) {
            case 10:
                objArr[1] = ProtectedSandApp.s("臮");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("臭");
                break;
            case 12:
                objArr[1] = ProtectedSandApp.s("臬");
                break;
            case 13:
                objArr[1] = ProtectedSandApp.s("臫");
                break;
            default:
                objArr[1] = s6;
                break;
        }
        switch (i5) {
            case 6:
                objArr[2] = ProtectedSandApp.s("臱");
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = ProtectedSandApp.s("臰");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = ProtectedSandApp.s("臯");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static l0 W0(@d5.d w0 w0Var, @d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (w0Var == null) {
            Q(7);
        }
        if (h0Var == null) {
            Q(8);
        }
        if (gVar == null) {
            Q(9);
        }
        return new l0(w0Var, null, 0, gVar, kotlin.reflect.jvm.internal.impl.name.h.f25619o, h0Var, false, false, false, null, a1.f24103a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        return oVar.i(this, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b0, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    /* renamed from: X0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public w0 a() {
        w0 w0Var = this.C;
        if (w0Var == null) {
            Q(13);
        }
        return w0Var;
    }

    public void Y0(@d5.d j1 j1Var) {
        if (j1Var == null) {
            Q(6);
        }
        this.B = j1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public Collection<? extends w0> g() {
        Collection<t0> S0 = super.S0(false);
        if (S0 == null) {
            Q(10);
        }
        return S0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.h0 i() {
        p0 Z = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(this).Z();
        if (Z == null) {
            Q(12);
        }
        return Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<j1> n() {
        j1 j1Var = this.B;
        if (j1Var == null) {
            throw new IllegalStateException();
        }
        List<j1> singletonList = Collections.singletonList(j1Var);
        if (singletonList == null) {
            Q(11);
        }
        return singletonList;
    }
}
