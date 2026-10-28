package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class h extends g {
    static final /* synthetic */ boolean D = false;
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.h A;
    private Set<kotlin.reflect.jvm.internal.impl.descriptors.d> B;
    private kotlin.reflect.jvm.internal.impl.descriptors.d C;

    /* renamed from: x, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e0 f24203x;

    /* renamed from: y, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.f f24204y;

    /* renamed from: z, reason: collision with root package name */
    private final h1 f24205z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.f fVar2, @d5.d Collection<kotlin.reflect.jvm.internal.impl.types.h0> collection, @d5.d a1 a1Var, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(nVar, mVar, fVar, a1Var, z5);
        if (mVar == null) {
            H0(0);
        }
        if (fVar == null) {
            H0(1);
        }
        if (e0Var == null) {
            H0(2);
        }
        if (fVar2 == null) {
            H0(3);
        }
        if (collection == null) {
            H0(4);
        }
        if (a1Var == null) {
            H0(5);
        }
        if (nVar == null) {
            H0(6);
        }
        this.f24203x = e0Var;
        this.f24204y = fVar2;
        this.f24205z = new kotlin.reflect.jvm.internal.impl.types.m(this, Collections.emptyList(), collection, nVar);
    }

    private static /* synthetic */ void H0(int i5) {
        String s5;
        int i6;
        switch (i5) {
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
                s5 = ProtectedSandApp.s("舰");
                break;
            case 12:
            default:
                s5 = ProtectedSandApp.s("舯");
                break;
        }
        switch (i5) {
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
                i6 = 2;
                break;
            case 12:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("舱");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("舻");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("舺");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("船");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("舸");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("舷");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("舶");
                break;
            case 7:
                objArr[0] = ProtectedSandApp.s("舵");
                break;
            case 8:
                objArr[0] = ProtectedSandApp.s("舴");
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
                objArr[0] = s6;
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("舳");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("舲");
                break;
        }
        String s7 = ProtectedSandApp.s("舼");
        switch (i5) {
            case 9:
                objArr[1] = ProtectedSandApp.s("艅");
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("艄");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("艃");
                break;
            case 12:
            default:
                objArr[1] = s6;
                break;
            case 13:
                objArr[1] = s7;
                break;
            case 14:
                objArr[1] = ProtectedSandApp.s("艂");
                break;
            case 15:
                objArr[1] = ProtectedSandApp.s("艁");
                break;
            case 16:
                objArr[1] = ProtectedSandApp.s("艀");
                break;
            case 17:
                objArr[1] = ProtectedSandApp.s("舿");
                break;
            case 18:
                objArr[1] = ProtectedSandApp.s("舾");
                break;
            case 19:
                objArr[1] = ProtectedSandApp.s("舽");
                break;
        }
        switch (i5) {
            case 7:
            case 8:
                objArr[2] = ProtectedSandApp.s("艇");
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
                objArr[2] = s7;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("艆");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @d5.d
    public List<f1> G() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            H0(18);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h1<p0> G0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean I() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean L() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean L0() {
        return false;
    }

    public final void R0(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, @d5.d Set<kotlin.reflect.jvm.internal.impl.descriptors.d> set, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (hVar == null) {
            H0(7);
        }
        if (set == null) {
            H0(8);
        }
        this.A = hVar;
        this.B = set;
        this.C = dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h S(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            H0(12);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = this.A;
        if (hVar == null) {
            H0(13);
        }
        return hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d Y() {
        return this.C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z() {
        h.c cVar = h.c.f26018b;
        if (cVar == null) {
            H0(14);
        }
        return cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e b0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.u c() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f24440e;
        if (uVar == null) {
            H0(17);
        }
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b6 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b();
        if (b6 == null) {
            H0(9);
        }
        return b6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.f j() {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = this.f24204y;
        if (fVar == null) {
            H0(15);
        }
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> l() {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.d> set = this.B;
        if (set == null) {
            H0(11);
        }
        return set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public h1 m() {
        h1 h1Var = this.f24205z;
        if (h1Var == null) {
            H0(10);
        }
        return h1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean p() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 r() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = this.f24203x;
        if (e0Var == null) {
            H0(16);
        }
        return e0Var;
    }

    public String toString() {
        return ProtectedSandApp.s("艈") + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean u() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> w() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            H0(19);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean x() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean y() {
        return false;
    }
}
