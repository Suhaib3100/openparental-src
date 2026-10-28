package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: MutableClassDescriptor.java */
/* loaded from: classes6.dex */
public class y extends g {
    static final /* synthetic */ boolean F = false;
    private kotlin.reflect.jvm.internal.impl.descriptors.u A;
    private h1 B;
    private List<f1> C;
    private final Collection<kotlin.reflect.jvm.internal.impl.types.h0> D;
    private final kotlin.reflect.jvm.internal.impl.storage.n E;

    /* renamed from: x, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.f f24319x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f24320y;

    /* renamed from: z, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.e0 f24321z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.f fVar, boolean z5, boolean z6, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar2, @d5.d a1 a1Var, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(nVar, mVar, fVar2, a1Var, z6);
        if (mVar == null) {
            H0(0);
        }
        if (fVar == null) {
            H0(1);
        }
        if (fVar2 == null) {
            H0(2);
        }
        if (a1Var == null) {
            H0(3);
        }
        if (nVar == null) {
            H0(4);
        }
        this.D = new ArrayList();
        this.E = nVar;
        this.f24319x = fVar;
        this.f24320y = z5;
    }

    private static /* synthetic */ void H0(int i5) {
        String s5;
        int i6;
        switch (i5) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                s5 = ProtectedSandApp.s("茛");
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                s5 = ProtectedSandApp.s("茚");
                break;
        }
        switch (i5) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i6 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("茜");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("茦");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("茥");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("茤");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("茣");
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = s6;
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("茢");
                break;
            case 9:
                objArr[0] = ProtectedSandApp.s("茡");
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("茠");
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("茟");
                break;
            case 16:
                objArr[0] = ProtectedSandApp.s("茞");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("茝");
                break;
        }
        String s7 = ProtectedSandApp.s("茧");
        switch (i5) {
            case 5:
                objArr[1] = ProtectedSandApp.s("茰");
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = s6;
                break;
            case 7:
                objArr[1] = ProtectedSandApp.s("茯");
                break;
            case 8:
                objArr[1] = ProtectedSandApp.s("茮");
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("茭");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("茬");
                break;
            case 13:
                objArr[1] = ProtectedSandApp.s("茫");
                break;
            case 15:
                objArr[1] = ProtectedSandApp.s("茪");
                break;
            case 17:
                objArr[1] = s7;
                break;
            case 18:
                objArr[1] = ProtectedSandApp.s("茩");
                break;
            case 19:
                objArr[1] = ProtectedSandApp.s("茨");
                break;
        }
        switch (i5) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = ProtectedSandApp.s("茵");
                break;
            case 9:
                objArr[2] = ProtectedSandApp.s("茴");
                break;
            case 12:
                objArr[2] = ProtectedSandApp.s("茳");
                break;
            case 14:
                objArr[2] = ProtectedSandApp.s("茲");
                break;
            case 16:
                objArr[2] = s7;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("茱");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @d5.d
    public List<f1> G() {
        List<f1> list = this.C;
        if (list == null) {
            H0(15);
        }
        return list;
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

    public void R0() {
        this.B = new kotlin.reflect.jvm.internal.impl.types.m(this, this.C, this.D, this.E);
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.d> it = l().iterator();
        while (it.hasNext()) {
            ((f) it.next()).n1(E());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h S(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            H0(16);
        }
        h.c cVar = h.c.f26018b;
        if (cVar == null) {
            H0(17);
        }
        return cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.d> l() {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.d> emptySet = Collections.emptySet();
        if (emptySet == null) {
            H0(13);
        }
        return emptySet;
    }

    public void T0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var) {
        if (e0Var == null) {
            H0(6);
        }
        this.f24321z = e0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        return false;
    }

    public void U0(@d5.d List<f1> list) {
        if (list == null) {
            H0(14);
        }
        if (this.C == null) {
            this.C = new ArrayList(list);
        } else {
            throw new IllegalStateException(ProtectedSandApp.s("茶") + getName());
        }
    }

    public void V0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (uVar == null) {
            H0(9);
        }
        this.A = uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d Y() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z() {
        h.c cVar = h.c.f26018b;
        if (cVar == null) {
            H0(18);
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
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = this.A;
        if (uVar == null) {
            H0(10);
        }
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b6 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b();
        if (b6 == null) {
            H0(5);
        }
        return b6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.f j() {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = this.f24319x;
        if (fVar == null) {
            H0(8);
        }
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public h1 m() {
        h1 h1Var = this.B;
        if (h1Var == null) {
            H0(11);
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
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = this.f24321z;
        if (e0Var == null) {
            H0(7);
        }
        return e0Var;
    }

    public String toString() {
        return j.S(this);
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
        return this.f24320y;
    }
}
