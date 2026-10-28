package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.IntIterator;
import kotlin.collections.p1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: NotFoundClasses.kt */
/* loaded from: classes5.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.n f24325a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final h0 f24326b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.c, l0> f24327c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<a, e> f24328d;

    /* compiled from: NotFoundClasses.kt */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.name.b f24329a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final List<Integer> f24330b;

        public a(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d List<Integer> list) {
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("䟴"));
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("䟵"));
            this.f24329a = bVar;
            this.f24330b = list;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return this.f24329a;
        }

        @d5.d
        public final List<Integer> b() {
            return this.f24330b;
        }

        public boolean equals(@d5.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l0.g(this.f24329a, aVar.f24329a) && kotlin.jvm.internal.l0.g(this.f24330b, aVar.f24330b);
        }

        public int hashCode() {
            return this.f24330b.hashCode() + (this.f24329a.hashCode() * 31);
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("䟶") + this.f24329a + ProtectedSandApp.s("䟷") + this.f24330b + ')';
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes6.dex */
    public static final class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.g {

        /* renamed from: x, reason: collision with root package name */
        private final boolean f24331x;

        /* renamed from: y, reason: collision with root package name */
        @d5.d
        private final List<f1> f24332y;

        /* renamed from: z, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.types.m f24333z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d m mVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z5, int i5) {
            super(nVar, mVar, fVar, a1.f24103a, false);
            IntRange W1;
            int b02;
            Set f6;
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("茷"));
            kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("茸"));
            kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("茹"));
            this.f24331x = z5;
            W1 = kotlin.ranges.u.W1(0, i5);
            b02 = kotlin.collections.b0.b0(W1, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.Y0(this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), false, x1.INVARIANT, kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("茺") + nextInt), nextInt, nVar));
            }
            this.f24332y = arrayList;
            List<f1> d6 = g1.d(this);
            f6 = p1.f(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(this).A().i());
            this.f24333z = new kotlin.reflect.jvm.internal.impl.types.m(this, d6, f6, nVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
        @d5.d
        public List<f1> G() {
            return this.f24332y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        @d5.e
        public h1<kotlin.reflect.jvm.internal.impl.types.p0> G0() {
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

        @d5.d
        public h.c R0() {
            return h.c.f26018b;
        }

        @d5.d
        public kotlin.reflect.jvm.internal.impl.types.m S0() {
            return this.f24333z;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
        @d5.d
        /* renamed from: T0, reason: merged with bridge method [inline-methods] */
        public h.c S(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("茻"));
            return h.c.f26018b;
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
        public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z() {
            return h.c.f26018b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        @d5.e
        public e b0() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
        @d5.d
        public u c() {
            u uVar = t.f24440e;
            kotlin.jvm.internal.l0.o(uVar, ProtectedSandApp.s("茼"));
            return uVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
        @d5.d
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        @d5.d
        public f j() {
            return f.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        @d5.d
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> l() {
            return EmptySet.f23181o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
        public kotlin.reflect.jvm.internal.impl.types.h1 m() {
            return this.f24333z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public boolean p() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g, kotlin.reflect.jvm.internal.impl.descriptors.d0
        public boolean q() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
        @d5.d
        public e0 r() {
            return e0.FINAL;
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("茽") + getName() + ProtectedSandApp.s("茾");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public boolean u() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        @d5.d
        public Collection<e> w() {
            return EmptyList.f23167o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public boolean x() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
        public boolean y() {
            return this.f24331x;
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<a, e> {
        c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
        
            if (r1 != null) goto L10;
         */
        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.k0.a r9) {
            /*
                r8 = this;
                java.lang.String r0 = "茿"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r9, r0)
                kotlin.reflect.jvm.internal.impl.name.b r0 = r9.a()
                java.util.List r9 = r9.b()
                boolean r1 = r0.k()
                if (r1 != 0) goto L72
                kotlin.reflect.jvm.internal.impl.name.b r1 = r0.g()
                if (r1 == 0) goto L2b
                kotlin.reflect.jvm.internal.impl.descriptors.k0 r2 = kotlin.reflect.jvm.internal.impl.descriptors.k0.this
                r3 = 1
                java.util.List r3 = kotlin.collections.y.c2(r9, r3)
                kotlin.reflect.jvm.internal.impl.descriptors.e r1 = r2.d(r1, r3)
                if (r1 == 0) goto L2b
                goto L44
            L2b:
                kotlin.reflect.jvm.internal.impl.descriptors.k0 r1 = kotlin.reflect.jvm.internal.impl.descriptors.k0.this
                kotlin.reflect.jvm.internal.impl.storage.g r1 = kotlin.reflect.jvm.internal.impl.descriptors.k0.b(r1)
                kotlin.reflect.jvm.internal.impl.name.c r2 = r0.h()
                java.lang.String r3 = "荀"
                java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
                kotlin.jvm.internal.l0.o(r2, r3)
                java.lang.Object r1 = r1.N(r2)
                kotlin.reflect.jvm.internal.impl.descriptors.g r1 = (kotlin.reflect.jvm.internal.impl.descriptors.g) r1
            L44:
                r4 = r1
                boolean r6 = r0.l()
                kotlin.reflect.jvm.internal.impl.descriptors.k0$b r1 = new kotlin.reflect.jvm.internal.impl.descriptors.k0$b
                kotlin.reflect.jvm.internal.impl.descriptors.k0 r2 = kotlin.reflect.jvm.internal.impl.descriptors.k0.this
                kotlin.reflect.jvm.internal.impl.storage.n r3 = kotlin.reflect.jvm.internal.impl.descriptors.k0.c(r2)
                kotlin.reflect.jvm.internal.impl.name.f r5 = r0.j()
                java.lang.String r0 = "荁"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r5, r0)
                java.lang.Object r9 = kotlin.collections.y.G2(r9)
                java.lang.Integer r9 = (java.lang.Integer) r9
                if (r9 == 0) goto L6b
                int r9 = r9.intValue()
                goto L6c
            L6b:
                r9 = 0
            L6c:
                r7 = r9
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L72:
                java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "荂"
                java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.k0.c.N(kotlin.reflect.jvm.internal.impl.descriptors.k0$a):kotlin.reflect.jvm.internal.impl.descriptors.e");
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.c, l0> {
        d() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 N(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("荃"));
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.m(k0.this.f24326b, cVar);
        }
    }

    public k0(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("䟸"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("䟹"));
        this.f24325a = nVar;
        this.f24326b = h0Var;
        this.f24327c = nVar.g(new d());
        this.f24328d = nVar.g(new c());
    }

    @d5.d
    public final e d(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d List<Integer> list) {
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("䟺"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("䟻"));
        return this.f24328d.N(new a(bVar, list));
    }
}
