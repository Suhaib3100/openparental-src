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
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: PropertySetterDescriptorImpl.java */
/* loaded from: classes7.dex */
public class e0 extends b0 implements w0 {

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f76015q = false;

    /* renamed from: o, reason: collision with root package name */
    private j1 f76016o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private final w0 f76017p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(@fg.l u0 u0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar, boolean z4, boolean z5, boolean z6, @fg.l b.a aVar, @fg.m w0 w0Var, @fg.l a1 a1Var) {
        super(e0Var, uVar, u0Var, gVar, kotlin.reflect.jvm.internal.impl.name.f.i(ProtectedSandApp.s("汭\u0001") + u0Var.getName() + ProtectedSandApp.s("汮\u0001")), z4, z5, z6, aVar, a1Var);
        e0 e0Var2;
        e0 e0Var3;
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
        if (w0Var != 0) {
            e0Var3 = this;
            e0Var2 = w0Var;
        } else {
            e0Var2 = this;
            e0Var3 = e0Var2;
        }
        e0Var3.f76017p = e0Var2;
    }

    public static l0 Q0(@fg.l w0 w0Var, @fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (w0Var == null) {
            j0(7);
        }
        if (h0Var == null) {
            j0(8);
        }
        if (gVar == null) {
            j0(9);
        }
        return new l0(w0Var, null, 0, gVar, kotlin.reflect.jvm.internal.impl.name.h.f77601n, h0Var, false, false, false, null, a1.f75900a);
    }

    private static /* synthetic */ void j0(int i4) {
        String s4;
        int i5;
        switch (i4) {
            case 10:
            case 11:
            case 12:
            case 13:
                s4 = ProtectedSandApp.s("汰\u0001");
                break;
            default:
                s4 = ProtectedSandApp.s("汯\u0001");
                break;
        }
        switch (i4) {
            case 10:
            case 11:
            case 12:
            case 13:
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("汱\u0001");
        switch (i4) {
            case 1:
            case 9:
                objArr[0] = ProtectedSandApp.s("決\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("汹\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("汸\u0001");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("汷\u0001");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("汶\u0001");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("汵\u0001");
                break;
            case 7:
                objArr[0] = ProtectedSandApp.s("汴\u0001");
                break;
            case 8:
                objArr[0] = ProtectedSandApp.s("汳\u0001");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = s5;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("汲\u0001");
                break;
        }
        switch (i4) {
            case 10:
                objArr[1] = ProtectedSandApp.s("汾\u0001");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("汽\u0001");
                break;
            case 12:
                objArr[1] = ProtectedSandApp.s("汼\u0001");
                break;
            case 13:
                objArr[1] = ProtectedSandApp.s("汻\u0001");
                break;
            default:
                objArr[1] = s5;
                break;
        }
        switch (i4) {
            case 6:
                objArr[2] = ProtectedSandApp.s("沁\u0001");
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = ProtectedSandApp.s("沀\u0001");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = ProtectedSandApp.s("汿\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        return oVar.e(this, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b0, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    /* renamed from: R0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public w0 a() {
        w0 w0Var = this.f76017p;
        if (w0Var == null) {
            j0(13);
        }
        return w0Var;
    }

    public void S0(@fg.l j1 j1Var) {
        if (j1Var == null) {
            j0(6);
        }
        this.f76016o = j1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public Collection<? extends w0> e() {
        Collection<t0> M0 = super.M0(false);
        if (M0 == null) {
            j0(10);
        }
        return M0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.types.h0 getReturnType() {
        p0 Z = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(this).Z();
        if (Z == null) {
            j0(12);
        }
        return Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<j1> i() {
        j1 j1Var = this.f76016o;
        if (j1Var == null) {
            throw new IllegalStateException();
        }
        List<j1> singletonList = Collections.singletonList(j1Var);
        if (singletonList == null) {
            j0(11);
        }
        return singletonList;
    }
}
