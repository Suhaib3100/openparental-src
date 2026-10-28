package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class n extends g {
    static final /* synthetic */ boolean B = false;
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g A;

    /* renamed from: x, reason: collision with root package name */
    private final h1 f24226x;

    /* renamed from: y, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f24227y;

    /* renamed from: z, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> f24228z;

    /* compiled from: EnumEntrySyntheticClassDescriptor.java */
    private class a extends kotlin.reflect.jvm.internal.impl.resolve.scopes.i {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f24229f = false;

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> f24230b;

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends u0>> f24231c;

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> f24232d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f24233e;

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.n$a$a, reason: collision with other inner class name */
        class C0278a implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ n f24234o;

            C0278a(n nVar) {
                this.f24234o = nVar;
            }

            @Override // q3.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends z0> N(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        class b implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends u0>> {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ n f24236o;

            b(n nVar) {
                this.f24236o = nVar;
            }

            @Override // q3.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends u0> N(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return a.this.o(fVar);
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        class c implements q3.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ n f24238o;

            c(n nVar) {
                this.f24238o = nVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> n() {
                return a.this.m();
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        class d extends kotlin.reflect.jvm.internal.impl.resolve.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f24240a;

            d(Set set) {
                this.f24240a = set;
            }

            private static /* synthetic */ void f(int i5) {
                Object[] objArr = new Object[3];
                if (i5 == 1) {
                    objArr[0] = ProtectedSandApp.s("芙");
                } else if (i5 != 2) {
                    objArr[0] = ProtectedSandApp.s("芗");
                } else {
                    objArr[0] = ProtectedSandApp.s("芘");
                }
                objArr[1] = ProtectedSandApp.s("芚");
                if (i5 == 1 || i5 == 2) {
                    objArr[2] = ProtectedSandApp.s("芜");
                } else {
                    objArr[2] = ProtectedSandApp.s("芛");
                }
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("芝"), objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.j
            public void a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
                if (bVar == null) {
                    f(0);
                }
                kotlin.reflect.jvm.internal.impl.resolve.k.K(bVar, null);
                this.f24240a.add(bVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.i
            protected void e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
                if (bVar == null) {
                    f(1);
                }
                if (bVar2 == null) {
                    f(2);
                }
            }
        }

        public a(@d5.d n nVar, kotlin.reflect.jvm.internal.impl.storage.n nVar2) {
            if (nVar2 == null) {
                i(0);
            }
            this.f24233e = nVar;
            this.f24230b = nVar2.g(new C0278a(nVar));
            this.f24231c = nVar2.g(new b(nVar));
            this.f24232d = nVar2.d(new c(nVar));
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
        @d5.d
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> m() {
            HashSet hashSet = new HashSet();
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : (Set) this.f24233e.f24228z.n()) {
                z3.d dVar = z3.d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(a(fVar, dVar));
                hashSet.addAll(d(fVar, dVar));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @d5.d
        public Collection<? extends z0> n(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                i(8);
            }
            return q(fVar, p().a(fVar, z3.d.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @d5.d
        public Collection<? extends u0> o(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                i(4);
            }
            return q(fVar, p().d(fVar, z3.d.FOR_NON_TRACKED_SCOPE));
        }

        @d5.d
        private kotlin.reflect.jvm.internal.impl.resolve.scopes.h p() {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h C = this.f24233e.m().m().iterator().next().C();
            if (C == null) {
                i(9);
            }
            return C;
        }

        @d5.d
        private <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<? extends D> q(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Collection<? extends D> collection) {
            if (fVar == null) {
                i(10);
            }
            if (collection == null) {
                i(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            kotlin.reflect.jvm.internal.impl.resolve.k.f25946f.v(fVar, collection, Collections.emptySet(), this.f24233e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @d5.d
        public Collection<? extends z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            if (fVar == null) {
                i(5);
            }
            if (bVar == null) {
                i(6);
            }
            Collection<? extends z0> N = this.f24230b.N(fVar);
            if (N == null) {
                i(7);
            }
            return N;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> set = (Set) this.f24233e.f24228z.n();
            if (set == null) {
                i(17);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> set = (Set) this.f24233e.f24228z.n();
            if (set == null) {
                i(19);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @d5.d
        public Collection<? extends u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            if (fVar == null) {
                i(1);
            }
            if (bVar == null) {
                i(2);
            }
            Collection<? extends u0> N = this.f24231c.N(fVar);
            if (N == null) {
                i(3);
            }
            return N;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                i(18);
            }
            return emptySet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @d5.d
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
            if (dVar == null) {
                i(13);
            }
            if (lVar == null) {
                i(14);
            }
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> n5 = this.f24232d.n();
            if (n5 == null) {
                i(15);
            }
            return n5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private n(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> iVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d a1 a1Var) {
        super(nVar, eVar, fVar, a1Var, false);
        if (nVar == null) {
            H0(6);
        }
        if (eVar == null) {
            H0(7);
        }
        if (h0Var == null) {
            H0(8);
        }
        if (fVar == null) {
            H0(9);
        }
        if (iVar == null) {
            H0(10);
        }
        if (gVar == null) {
            H0(11);
        }
        if (a1Var == null) {
            H0(12);
        }
        this.A = gVar;
        this.f24226x = new kotlin.reflect.jvm.internal.impl.types.m(this, Collections.emptyList(), Collections.singleton(h0Var), nVar);
        this.f24227y = new a(this, nVar);
        this.f24228z = iVar;
    }

    private static /* synthetic */ void H0(int i5) {
        String s5;
        int i6;
        switch (i5) {
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
                s5 = ProtectedSandApp.s("芶");
                break;
            default:
                s5 = ProtectedSandApp.s("芵");
                break;
        }
        switch (i5) {
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
                i6 = 2;
                break;
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("芷");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("苀");
                break;
            case 2:
            case 9:
                objArr[0] = ProtectedSandApp.s("芿");
                break;
            case 3:
            case 10:
                objArr[0] = ProtectedSandApp.s("芾");
                break;
            case 4:
            case 11:
                objArr[0] = ProtectedSandApp.s("芽");
                break;
            case 5:
            case 12:
                objArr[0] = ProtectedSandApp.s("芼");
                break;
            case 6:
            default:
                objArr[0] = ProtectedSandApp.s("芸");
                break;
            case 7:
                objArr[0] = ProtectedSandApp.s("芻");
                break;
            case 8:
                objArr[0] = ProtectedSandApp.s("芺");
                break;
            case 13:
                objArr[0] = ProtectedSandApp.s("芹");
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
                objArr[0] = s6;
                break;
        }
        String s7 = ProtectedSandApp.s("苁");
        switch (i5) {
            case 14:
                objArr[1] = s7;
                break;
            case 15:
                objArr[1] = ProtectedSandApp.s("苊");
                break;
            case 16:
                objArr[1] = ProtectedSandApp.s("苉");
                break;
            case 17:
                objArr[1] = ProtectedSandApp.s("苈");
                break;
            case 18:
                objArr[1] = ProtectedSandApp.s("苇");
                break;
            case 19:
                objArr[1] = ProtectedSandApp.s("苆");
                break;
            case 20:
                objArr[1] = ProtectedSandApp.s("苅");
                break;
            case 21:
                objArr[1] = ProtectedSandApp.s("苄");
                break;
            case 22:
                objArr[1] = ProtectedSandApp.s("苃");
                break;
            case 23:
                objArr[1] = ProtectedSandApp.s("苂");
                break;
            default:
                objArr[1] = s6;
                break;
        }
        switch (i5) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = ProtectedSandApp.s("苌");
                break;
            case 13:
                objArr[2] = s7;
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
                objArr[2] = ProtectedSandApp.s("苋");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
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

    @d5.d
    public static n S0(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> iVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d a1 a1Var) {
        if (nVar == null) {
            H0(0);
        }
        if (eVar == null) {
            H0(1);
        }
        if (fVar == null) {
            H0(2);
        }
        if (iVar == null) {
            H0(3);
        }
        if (gVar == null) {
            H0(4);
        }
        if (a1Var == null) {
            H0(5);
        }
        return new n(nVar, eVar, eVar.E(), fVar, iVar, gVar, a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @d5.d
    public List<f1> G() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            H0(22);
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h S(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            H0(13);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = this.f24227y;
        if (hVar == null) {
            H0(14);
        }
        return hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        return false;
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
            H0(15);
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
            H0(20);
        }
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = this.A;
        if (gVar == null) {
            H0(21);
        }
        return gVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.f j() {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY;
        if (fVar == null) {
            H0(18);
        }
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> l() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            H0(16);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public h1 m() {
        h1 h1Var = this.f24226x;
        if (h1Var == null) {
            H0(17);
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
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
        if (e0Var == null) {
            H0(19);
        }
        return e0Var;
    }

    public String toString() {
        return ProtectedSandApp.s("苍") + getName();
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
            H0(23);
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
