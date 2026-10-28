package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: EnumEntrySyntheticClassDescriptor.java */
/* loaded from: classes7.dex */
public class n extends g {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f76054o = false;

    /* renamed from: k, reason: collision with root package name */
    private final h1 f76055k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f76056l;

    /* renamed from: m, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> f76057m;

    /* renamed from: n, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f76058n;

    /* compiled from: EnumEntrySyntheticClassDescriptor.java */
    private class a extends kotlin.reflect.jvm.internal.impl.resolve.scopes.i {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f76059f = false;

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> f76060b;

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends u0>> f76061c;

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> f76062d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f76063e;

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.n$a$a, reason: collision with other inner class name */
        class C1082a implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f76064b;

            C1082a(n nVar) {
                this.f76064b = nVar;
            }

            @Override // ld.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends z0> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        class b implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends u0>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f76066b;

            b(n nVar) {
                this.f76066b = nVar;
            }

            @Override // ld.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends u0> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return a.this.o(fVar);
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        class c implements ld.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f76068b;

            c(n nVar) {
                this.f76068b = nVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> invoke() {
                return a.this.m();
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        class d extends kotlin.reflect.jvm.internal.impl.resolve.j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f76070a;

            d(Set set) {
                this.f76070a = set;
            }

            private static /* synthetic */ void f(int i4) {
                Object[] objArr = new Object[3];
                if (i4 == 1) {
                    objArr[0] = ProtectedSandApp.s("洷\u0001");
                } else if (i4 != 2) {
                    objArr[0] = ProtectedSandApp.s("洵\u0001");
                } else {
                    objArr[0] = ProtectedSandApp.s("洶\u0001");
                }
                objArr[1] = ProtectedSandApp.s("洸\u0001");
                if (i4 == 1 || i4 == 2) {
                    objArr[2] = ProtectedSandApp.s("洺\u0001");
                } else {
                    objArr[2] = ProtectedSandApp.s("洹\u0001");
                }
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("活\u0001"), objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.k
            public void a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
                if (bVar == null) {
                    f(0);
                }
                kotlin.reflect.jvm.internal.impl.resolve.l.K(bVar, null);
                this.f76070a.add(bVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.j
            protected void e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
                if (bVar == null) {
                    f(1);
                }
                if (bVar2 == null) {
                    f(2);
                }
            }
        }

        public a(@fg.l n nVar, kotlin.reflect.jvm.internal.impl.storage.n nVar2) {
            if (nVar2 == null) {
                i(0);
            }
            this.f76063e = nVar;
            this.f76060b = nVar2.e(new C1082a(nVar));
            this.f76061c = nVar2.e(new b(nVar));
            this.f76062d = nVar2.h(new c(nVar));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0111 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0072  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void i(int r13) {
            /*
                Method dump skipped, instructions count: 438
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.n.a.i(int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @fg.l
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> m() {
            HashSet hashSet = new HashSet();
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : (Set) this.f76063e.f76057m.invoke()) {
                ud.d dVar = ud.d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(a(fVar, dVar));
                hashSet.addAll(b(fVar, dVar));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @fg.l
        public Collection<? extends z0> n(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                i(8);
            }
            return q(fVar, p().a(fVar, ud.d.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @fg.l
        public Collection<? extends u0> o(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                i(4);
            }
            return q(fVar, p().b(fVar, ud.d.FOR_NON_TRACKED_SCOPE));
        }

        @fg.l
        private kotlin.reflect.jvm.internal.impl.resolve.scopes.h p() {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h q4 = this.f76063e.j().j().iterator().next().q();
            if (q4 == null) {
                i(9);
            }
            return q4;
        }

        @fg.l
        private <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<? extends D> q(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Collection<? extends D> collection) {
            if (fVar == null) {
                i(10);
            }
            if (collection == null) {
                i(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            kotlin.reflect.jvm.internal.impl.resolve.l.f77929f.v(fVar, collection, Collections.emptySet(), this.f76063e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @fg.l
        public Collection<? extends z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            if (fVar == null) {
                i(5);
            }
            if (bVar == null) {
                i(6);
            }
            Collection<? extends z0> invoke = this.f76060b.invoke(fVar);
            if (invoke == null) {
                i(7);
            }
            return invoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @fg.l
        public Collection<? extends u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            if (fVar == null) {
                i(1);
            }
            if (bVar == null) {
                i(2);
            }
            Collection<? extends u0> invoke = this.f76061c.invoke(fVar);
            if (invoke == null) {
                i(3);
            }
            return invoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> set = (Set) this.f76063e.f76057m.invoke();
            if (set == null) {
                i(17);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> set = (Set) this.f76063e.f76057m.invoke();
            if (set == null) {
                i(19);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @fg.l
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
            if (dVar == null) {
                i(13);
            }
            if (lVar == null) {
                i(14);
            }
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> invoke = this.f76062d.invoke();
            if (invoke == null) {
                i(15);
            }
            return invoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                i(18);
            }
            return emptySet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private n(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> iVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l a1 a1Var) {
        super(nVar, eVar, fVar, a1Var, false);
        if (nVar == null) {
            G0(6);
        }
        if (eVar == null) {
            G0(7);
        }
        if (h0Var == null) {
            G0(8);
        }
        if (fVar == null) {
            G0(9);
        }
        if (iVar == null) {
            G0(10);
        }
        if (gVar == null) {
            G0(11);
        }
        if (a1Var == null) {
            G0(12);
        }
        this.f76058n = gVar;
        this.f76055k = new kotlin.reflect.jvm.internal.impl.types.m(this, Collections.emptyList(), Collections.singleton(h0Var), nVar);
        this.f76056l = new a(this, nVar);
        this.f76057m = iVar;
    }

    private static /* synthetic */ void G0(int i4) {
        String s4;
        int i5;
        switch (i4) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                s4 = ProtectedSandApp.s("浔\u0001");
                break;
            default:
                s4 = ProtectedSandApp.s("浓\u0001");
                break;
        }
        switch (i4) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("浕\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("浞\u0001");
                break;
            case 2:
            case 9:
                objArr[0] = ProtectedSandApp.s("浝\u0001");
                break;
            case 3:
            case 10:
                objArr[0] = ProtectedSandApp.s("浜\u0001");
                break;
            case 4:
            case 11:
                objArr[0] = ProtectedSandApp.s("浛\u0001");
                break;
            case 5:
            case 12:
                objArr[0] = ProtectedSandApp.s("浚\u0001");
                break;
            case 6:
            default:
                objArr[0] = ProtectedSandApp.s("浖\u0001");
                break;
            case 7:
                objArr[0] = ProtectedSandApp.s("浙\u0001");
                break;
            case 8:
                objArr[0] = ProtectedSandApp.s("浘\u0001");
                break;
            case 13:
                objArr[0] = ProtectedSandApp.s("浗\u0001");
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = s5;
                break;
        }
        String s6 = ProtectedSandApp.s("浟\u0001");
        switch (i4) {
            case 14:
                objArr[1] = s6;
                break;
            case 15:
                objArr[1] = ProtectedSandApp.s("浨\u0001");
                break;
            case 16:
                objArr[1] = ProtectedSandApp.s("浧\u0001");
                break;
            case 17:
                objArr[1] = ProtectedSandApp.s("浦\u0001");
                break;
            case 18:
                objArr[1] = ProtectedSandApp.s("浥\u0001");
                break;
            case 19:
                objArr[1] = ProtectedSandApp.s("浤\u0001");
                break;
            case 20:
                objArr[1] = ProtectedSandApp.s("浣\u0001");
                break;
            case 21:
                objArr[1] = ProtectedSandApp.s("浢\u0001");
                break;
            case 22:
                objArr[1] = ProtectedSandApp.s("浡\u0001");
                break;
            case 23:
                objArr[1] = ProtectedSandApp.s("浠\u0001");
                break;
            default:
                objArr[1] = s5;
                break;
        }
        switch (i4) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = ProtectedSandApp.s("浪\u0001");
                break;
            case 13:
                objArr[2] = s6;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = ProtectedSandApp.s("浩\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @fg.l
    public static n M0(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> iVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l a1 a1Var) {
        if (nVar == null) {
            G0(0);
        }
        if (eVar == null) {
            G0(1);
        }
        if (fVar == null) {
            G0(2);
        }
        if (iVar == null) {
            G0(3);
        }
        if (gVar == null) {
            G0(4);
        }
        if (a1Var == null) {
            G0(5);
        }
        return new n(nVar, eVar, eVar.r(), fVar, iVar, gVar, a1Var);
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
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY;
        if (fVar == null) {
            G0(18);
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
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = this.f76058n;
        if (gVar == null) {
            G0(21);
        }
        return gVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f76290e;
        if (uVar == null) {
            G0(20);
        }
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> h() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            G0(16);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public h1 j() {
        h1 h1Var = this.f76055k;
        if (h1Var == null) {
            G0(17);
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
            G0(13);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = this.f76056l;
        if (hVar == null) {
            G0(14);
        }
        return hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> m() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            G0(23);
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
            G0(15);
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
            G0(22);
        }
        return emptyList;
    }

    public String toString() {
        return ProtectedSandApp.s("浫\u0001") + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 u() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
        if (e0Var == null) {
            G0(19);
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
