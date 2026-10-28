package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes7.dex */
public abstract class b0 extends k implements t0 {

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ boolean f75952n = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f75953f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f75954g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e0 f75955h;

    /* renamed from: i, reason: collision with root package name */
    private final u0 f75956i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f75957j;

    /* renamed from: k, reason: collision with root package name */
    private final b.a f75958k;

    /* renamed from: l, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.u f75959l;

    /* renamed from: m, reason: collision with root package name */
    @fg.m
    private kotlin.reflect.jvm.internal.impl.descriptors.z f75960m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @fg.l u0 u0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z4, boolean z5, boolean z6, b.a aVar, @fg.l a1 a1Var) {
        super(u0Var.c(), gVar, fVar, a1Var);
        if (e0Var == null) {
            j0(0);
        }
        if (uVar == null) {
            j0(1);
        }
        if (u0Var == null) {
            j0(2);
        }
        if (gVar == null) {
            j0(3);
        }
        if (fVar == null) {
            j0(4);
        }
        if (a1Var == null) {
            j0(5);
        }
        this.f75960m = null;
        this.f75955h = e0Var;
        this.f75959l = uVar;
        this.f75956i = u0Var;
        this.f75953f = z4;
        this.f75954g = z5;
        this.f75957j = z6;
        this.f75958k = aVar;
    }

    private static /* synthetic */ void j0(int i4) {
        String s4;
        int i5;
        switch (i4) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                s4 = ProtectedSandApp.s("殘\u0001");
                break;
            case 7:
            default:
                s4 = ProtectedSandApp.s("殗\u0001");
                break;
        }
        switch (i4) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i5 = 2;
                break;
            case 7:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("殙\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("殡\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("殠\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("殟\u0001");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("殞\u0001");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("殝\u0001");
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
                objArr[0] = s5;
                break;
            case 7:
                objArr[0] = ProtectedSandApp.s("殜\u0001");
                break;
            case 16:
                objArr[0] = ProtectedSandApp.s("殛\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("殚\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("殢\u0001");
        switch (i4) {
            case 6:
                objArr[1] = ProtectedSandApp.s("殪\u0001");
                break;
            case 7:
            default:
                objArr[1] = s5;
                break;
            case 8:
                objArr[1] = s6;
                break;
            case 9:
                objArr[1] = ProtectedSandApp.s("殩\u0001");
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("殨\u0001");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("殧\u0001");
                break;
            case 12:
                objArr[1] = ProtectedSandApp.s("殦\u0001");
                break;
            case 13:
                objArr[1] = ProtectedSandApp.s("殥\u0001");
                break;
            case 14:
                objArr[1] = ProtectedSandApp.s("殤\u0001");
                break;
            case 15:
                objArr[1] = ProtectedSandApp.s("殣\u0001");
                break;
        }
        switch (i4) {
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
                objArr[2] = s6;
                break;
            case 16:
                objArr[2] = ProtectedSandApp.s("殬\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("殫\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
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
    @fg.l
    public z.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> A() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("殭\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean B() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public void F0(@fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == null) {
            j0(16);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean H0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @fg.l
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public t0 R(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("殭\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    public boolean J() {
        return this.f75953f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    /* renamed from: L0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract t0 a();

    @fg.l
    protected Collection<t0> M0(boolean z4) {
        ArrayList arrayList = new ArrayList(0);
        for (u0 u0Var : Y().e()) {
            kotlin.reflect.jvm.internal.impl.descriptors.m getter = z4 ? u0Var.getGetter() : u0Var.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    public void N0(boolean z4) {
        this.f75953f = z4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public x0 O() {
        return Y().O();
    }

    public void O0(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        this.f75960m = zVar;
    }

    public void P0(kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        this.f75959l = uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public x0 S() {
        return Y().S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    @fg.l
    public u0 Y() {
        u0 u0Var = this.f75956i;
        if (u0Var == null) {
            j0(13);
        }
        return u0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean a0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @fg.l
    public b.a b() {
        b.a aVar = this.f75958k;
        if (aVar == null) {
            j0(6);
        }
        return aVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.z d(@fg.l q1 q1Var) {
        if (q1Var == null) {
            j0(7);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<f1> getTypeParameters() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            j0(9);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = this.f75959l;
        if (uVar == null) {
            j0(11);
        }
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean i0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean k() {
        return this.f75957j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean m0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean t() {
        return this.f75954g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 u() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = this.f75955h;
        if (e0Var == null) {
            j0(10);
        }
        return e0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.z u0() {
        return this.f75960m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public <V> V w0(a.InterfaceC1077a<V> interfaceC1077a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean x() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<x0> z0() {
        List<x0> z02 = Y().z0();
        if (z02 == null) {
            j0(14);
        }
        return z02;
    }
}
