package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes7.dex */
public class y extends g {

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ boolean f76163s = false;

    /* renamed from: k, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.f f76164k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f76165l;

    /* renamed from: m, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.e0 f76166m;

    /* renamed from: n, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.u f76167n;

    /* renamed from: o, reason: collision with root package name */
    private h1 f76168o;

    /* renamed from: p, reason: collision with root package name */
    private List<f1> f76169p;

    /* renamed from: q, reason: collision with root package name */
    private final Collection<kotlin.reflect.jvm.internal.impl.types.h0> f76170q;

    /* renamed from: r, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.n f76171r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.f fVar, boolean z4, boolean z5, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar2, @fg.l a1 a1Var, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(nVar, mVar, fVar2, a1Var, z5);
        if (mVar == null) {
            G0(0);
        }
        if (fVar == null) {
            G0(1);
        }
        if (fVar2 == null) {
            G0(2);
        }
        if (a1Var == null) {
            G0(3);
        }
        if (nVar == null) {
            G0(4);
        }
        this.f76170q = new ArrayList();
        this.f76171r = nVar;
        this.f76164k = fVar;
        this.f76165l = z4;
    }

    private static /* synthetic */ void G0(int i4) {
        String s4;
        int i5;
        switch (i4) {
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
                s4 = ProtectedSandApp.s("淭\u0001");
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                s4 = ProtectedSandApp.s("淬\u0001");
                break;
        }
        switch (i4) {
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
                i5 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("淮\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("淸\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("混\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("淶\u0001");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("淵\u0001");
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
                objArr[0] = s5;
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("淴\u0001");
                break;
            case 9:
                objArr[0] = ProtectedSandApp.s("淳\u0001");
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("淲\u0001");
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("深\u0001");
                break;
            case 16:
                objArr[0] = ProtectedSandApp.s("淰\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("淯\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("淹\u0001");
        switch (i4) {
            case 5:
                objArr[1] = ProtectedSandApp.s("渂\u0001");
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = s5;
                break;
            case 7:
                objArr[1] = ProtectedSandApp.s("渁\u0001");
                break;
            case 8:
                objArr[1] = ProtectedSandApp.s("渀\u0001");
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("淿\u0001");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("淾\u0001");
                break;
            case 13:
                objArr[1] = ProtectedSandApp.s("淽\u0001");
                break;
            case 15:
                objArr[1] = ProtectedSandApp.s("淼\u0001");
                break;
            case 17:
                objArr[1] = s6;
                break;
            case 18:
                objArr[1] = ProtectedSandApp.s("添\u0001");
                break;
            case 19:
                objArr[1] = ProtectedSandApp.s("淺\u0001");
                break;
        }
        switch (i4) {
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
                objArr[2] = ProtectedSandApp.s("渇\u0001");
                break;
            case 9:
                objArr[2] = ProtectedSandApp.s("渆\u0001");
                break;
            case 12:
                objArr[2] = ProtectedSandApp.s("清\u0001");
                break;
            case 14:
                objArr[2] = ProtectedSandApp.s("渄\u0001");
                break;
            case 16:
                objArr[2] = s6;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("渃\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean C() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.d H() {
        return null;
    }

    public void L0() {
        this.f76168o = new kotlin.reflect.jvm.internal.impl.types.m(this, this.f76169p, this.f76170q, this.f76171r);
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.d> it = h().iterator();
        while (it.hasNext()) {
            ((f) it.next()).h1(r());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.d> h() {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.d> emptySet = Collections.emptySet();
        if (emptySet == null) {
            G0(13);
        }
        return emptySet;
    }

    public void N0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var) {
        if (e0Var == null) {
            G0(6);
        }
        this.f76166m = e0Var;
    }

    public void O0(@fg.l List<f1> list) {
        if (list == null) {
            G0(14);
        }
        if (this.f76169p == null) {
            this.f76169p = new ArrayList(list);
        } else {
            throw new IllegalStateException(ProtectedSandApp.s("済\u0001") + getName());
        }
    }

    public void P0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (uVar == null) {
            G0(9);
        }
        this.f76167n = uVar;
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
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = this.f76164k;
        if (fVar == null) {
            G0(8);
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
            G0(5);
        }
        return b5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = this.f76167n;
        if (uVar == null) {
            G0(10);
        }
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public h1 j() {
        h1 h1Var = this.f76168o;
        if (h1Var == null) {
            G0(11);
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
            G0(16);
        }
        h.c cVar = h.c.f78002b;
        if (cVar == null) {
            G0(17);
        }
        return cVar;
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
        return this.f76165l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h o0() {
        h.c cVar = h.c.f78002b;
        if (cVar == null) {
            G0(18);
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
        List<f1> list = this.f76169p;
        if (list == null) {
            G0(15);
        }
        return list;
    }

    public String toString() {
        return j.l0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 u() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = this.f76166m;
        if (e0Var == null) {
            G0(7);
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
