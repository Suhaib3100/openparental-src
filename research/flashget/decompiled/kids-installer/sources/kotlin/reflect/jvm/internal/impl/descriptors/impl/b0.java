package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: PropertyAccessorDescriptorImpl.java */
/* loaded from: classes6.dex */
public abstract class b0 extends k implements t0 {
    static final /* synthetic */ boolean A = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f24154s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f24155t;

    /* renamed from: u, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e0 f24156u;

    /* renamed from: v, reason: collision with root package name */
    private final u0 f24157v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f24158w;

    /* renamed from: x, reason: collision with root package name */
    private final b.a f24159x;

    /* renamed from: y, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.u f24160y;

    /* renamed from: z, reason: collision with root package name */
    @d5.e
    private kotlin.reflect.jvm.internal.impl.descriptors.z f24161z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @d5.d u0 u0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z5, boolean z6, boolean z7, b.a aVar, @d5.d a1 a1Var) {
        super(u0Var.b(), gVar, fVar, a1Var);
        if (e0Var == null) {
            Q(0);
        }
        if (uVar == null) {
            Q(1);
        }
        if (u0Var == null) {
            Q(2);
        }
        if (gVar == null) {
            Q(3);
        }
        if (fVar == null) {
            Q(4);
        }
        if (a1Var == null) {
            Q(5);
        }
        this.f24161z = null;
        this.f24156u = e0Var;
        this.f24160y = uVar;
        this.f24157v = u0Var;
        this.f24154s = z5;
        this.f24155t = z6;
        this.f24158w = z7;
        this.f24159x = aVar;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5;
        int i6;
        switch (i5) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                s5 = ProtectedSandApp.s("脠");
                break;
            case 7:
            default:
                s5 = ProtectedSandApp.s("脟");
                break;
        }
        switch (i5) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i6 = 2;
                break;
            case 7:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("脡");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("脩");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("脨");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("脧");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("脦");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("脥");
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = s6;
                break;
            case 7:
                objArr[0] = ProtectedSandApp.s("脤");
                break;
            case 16:
                objArr[0] = ProtectedSandApp.s("脣");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("脢");
                break;
        }
        String s7 = ProtectedSandApp.s("脪");
        switch (i5) {
            case 6:
                objArr[1] = ProtectedSandApp.s("脲");
                break;
            case 7:
            default:
                objArr[1] = s6;
                break;
            case 8:
                objArr[1] = s7;
                break;
            case 9:
                objArr[1] = ProtectedSandApp.s("脱");
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("脰");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("脯");
                break;
            case 12:
                objArr[1] = ProtectedSandApp.s("脮");
                break;
            case 13:
                objArr[1] = ProtectedSandApp.s("脭");
                break;
            case 14:
                objArr[1] = ProtectedSandApp.s("脬");
                break;
            case 15:
                objArr[1] = ProtectedSandApp.s("脫");
                break;
        }
        switch (i5) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = s7;
                break;
            case 16:
                objArr[2] = ProtectedSandApp.s("脴");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("脳");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean B() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean D0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public void E0(@d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == null) {
            Q(16);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    @d5.d
    public z.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> F() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("脵"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean H() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    @d5.d
    public u0 I0() {
        u0 u0Var = this.f24157v;
        if (u0Var == null) {
            Q(13);
        }
        return u0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean J0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean L0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @d5.d
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public t0 r0(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("脶"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean P() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public abstract t0 a();

    @d5.d
    protected Collection<t0> S0(boolean z5) {
        ArrayList arrayList = new ArrayList(0);
        for (u0 u0Var : I0().g()) {
            kotlin.reflect.jvm.internal.impl.descriptors.m e6 = z5 ? u0Var.e() : u0Var.h();
            if (e6 != null) {
                arrayList.add(e6);
            }
        }
        return arrayList;
    }

    public void T0(boolean z5) {
        this.f24154s = z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        return false;
    }

    public void U0(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        this.f24161z = zVar;
    }

    public void V0(kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        this.f24160y = uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean X() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.u c() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = this.f24160y;
        if (uVar == null) {
            Q(11);
        }
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    public boolean c0() {
        return this.f24154s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.z d(@d5.d q1 q1Var) {
        if (q1Var == null) {
            Q(7);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<f1> getTypeParameters() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            Q(9);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @d5.d
    public b.a j() {
        b.a aVar = this.f24159x;
        if (aVar == null) {
            Q(6);
        }
        return aVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.z k0() {
        return this.f24161z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public x0 m0() {
        return I0().m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean o() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean p() {
        return this.f24158w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public <V> V p0(a.InterfaceC0274a<V> interfaceC0274a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean q() {
        return this.f24155t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 r() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = this.f24156u;
        if (e0Var == null) {
            Q(10);
        }
        return e0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public x0 t0() {
        return I0().t0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<x0> y0() {
        List<x0> y02 = I0().y0();
        if (y02 == null) {
            Q(14);
        }
        return y02;
    }
}
