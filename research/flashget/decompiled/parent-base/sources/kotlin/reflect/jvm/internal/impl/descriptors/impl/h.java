package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: ClassDescriptorImpl.java */
/* loaded from: classes7.dex */
public class h extends g {

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f76024q = false;

    /* renamed from: k, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e0 f76025k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.f f76026l;

    /* renamed from: m, reason: collision with root package name */
    private final h1 f76027m;

    /* renamed from: n, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.h f76028n;

    /* renamed from: o, reason: collision with root package name */
    private Set<kotlin.reflect.jvm.internal.impl.descriptors.d> f76029o;

    /* renamed from: p, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.d f76030p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.f fVar2, @fg.l Collection<kotlin.reflect.jvm.internal.impl.types.h0> collection, @fg.l a1 a1Var, boolean z4, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(nVar, mVar, fVar, a1Var, z4);
        if (mVar == null) {
            G0(0);
        }
        if (fVar == null) {
            G0(1);
        }
        if (e0Var == null) {
            G0(2);
        }
        if (fVar2 == null) {
            G0(3);
        }
        if (collection == null) {
            G0(4);
        }
        if (a1Var == null) {
            G0(5);
        }
        if (nVar == null) {
            G0(6);
        }
        this.f76025k = e0Var;
        this.f76026l = fVar2;
        this.f76027m = new kotlin.reflect.jvm.internal.impl.types.m(this, Collections.emptyList(), collection, nVar);
    }

    private static /* synthetic */ void G0(int i4) {
        String s4;
        int i5;
        switch (i4) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                s4 = ProtectedSandApp.s("況\u0001");
                break;
            case 12:
            default:
                s4 = ProtectedSandApp.s("泀\u0001");
                break;
        }
        switch (i4) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i5 = 2;
                break;
            case 12:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("泂\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("泌\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("泋\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("泊\u0001");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("泉\u0001");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("泈\u0001");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("泇\u0001");
                break;
            case 7:
                objArr[0] = ProtectedSandApp.s("泆\u0001");
                break;
            case 8:
                objArr[0] = ProtectedSandApp.s("泅\u0001");
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = s5;
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("泄\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("泃\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("泍\u0001");
        switch (i4) {
            case 9:
                objArr[1] = ProtectedSandApp.s("泖\u0001");
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("法\u0001");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("泔\u0001");
                break;
            case 12:
            default:
                objArr[1] = s5;
                break;
            case 13:
                objArr[1] = s6;
                break;
            case 14:
                objArr[1] = ProtectedSandApp.s("泓\u0001");
                break;
            case 15:
                objArr[1] = ProtectedSandApp.s("泒\u0001");
                break;
            case 16:
                objArr[1] = ProtectedSandApp.s("泑\u0001");
                break;
            case 17:
                objArr[1] = ProtectedSandApp.s("泐\u0001");
                break;
            case 18:
                objArr[1] = ProtectedSandApp.s("泏\u0001");
                break;
            case 19:
                objArr[1] = ProtectedSandApp.s("泎\u0001");
                break;
        }
        switch (i4) {
            case 7:
            case 8:
                objArr[2] = ProtectedSandApp.s("泘\u0001");
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = s6;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("泗\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean C() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d H() {
        return this.f76030p;
    }

    public final void L0(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, @fg.l Set<kotlin.reflect.jvm.internal.impl.descriptors.d> set, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (hVar == null) {
            G0(7);
        }
        if (set == null) {
            G0(8);
        }
        this.f76028n = hVar;
        this.f76029o = set;
        this.f76030p = dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h1<p0> X() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean a0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.f b() {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = this.f76026l;
        if (fVar == null) {
            G0(15);
        }
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b5 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b();
        if (b5 == null) {
            G0(9);
        }
        return b5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f76290e;
        if (uVar == null) {
            G0(17);
        }
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> h() {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.d> set = this.f76029o;
        if (set == null) {
            G0(11);
        }
        return set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public h1 j() {
        h1 h1Var = this.f76027m;
        if (h1Var == null) {
            G0(10);
        }
        return h1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean k() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h l0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            G0(12);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = this.f76028n;
        if (hVar == null) {
            G0(13);
        }
        return hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> m() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            G0(19);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean m0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean n() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h o0() {
        h.c cVar = h.c.f78002b;
        if (cVar == null) {
            G0(14);
        }
        return cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.e p0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @fg.l
    public List<f1> s() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            G0(18);
        }
        return emptyList;
    }

    public String toString() {
        return ProtectedSandApp.s("泙\u0001") + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 u() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = this.f76025k;
        if (e0Var == null) {
            G0(16);
        }
        return e0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean v() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean w() {
        return false;
    }
}
