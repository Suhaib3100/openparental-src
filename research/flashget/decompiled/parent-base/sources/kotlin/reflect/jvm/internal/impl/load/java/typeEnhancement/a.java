package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ce.v;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.load.java.y;

/* compiled from: AbstractSignatureParts.kt */
@r1({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1#2:229\n1#2:252\n1#2:275\n766#3:230\n857#3,2:231\n1726#3,3:233\n1747#3,3:236\n1747#3,3:239\n1603#3,9:242\n1855#3:251\n1856#3:253\n1612#3:254\n1726#3,3:255\n1549#3:258\n1620#3,3:259\n1747#3,3:262\n1603#3,9:265\n1855#3:274\n1856#3:276\n1612#3:277\n1855#3,2:278\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n*L\n156#1:252\n182#1:275\n89#1:230\n89#1:231,2\n153#1:233,3\n155#1:236,3\n156#1:239,3\n156#1:242,9\n156#1:251\n156#1:253\n156#1:254\n159#1:255,3\n169#1:258\n169#1:259,3\n177#1:262,3\n182#1:265,9\n182#1:274\n182#1:276\n182#1:277\n195#1:278,2\n*E\n"})
/* loaded from: classes7.dex */
public abstract class a<TAnnotation> {

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a, reason: collision with other inner class name */
    private static final class C1094a {

        /* renamed from: a, reason: collision with root package name */
        @fg.m
        private final ce.i f76697a;

        /* renamed from: b, reason: collision with root package name */
        @fg.m
        private final y f76698b;

        /* renamed from: c, reason: collision with root package name */
        @fg.m
        private final ce.o f76699c;

        public C1094a(@fg.m ce.i iVar, @fg.m y yVar, @fg.m ce.o oVar) {
            this.f76697a = iVar;
            this.f76698b = yVar;
            this.f76699c = oVar;
        }

        @fg.m
        public final y a() {
            return this.f76698b;
        }

        @fg.m
        public final ce.i b() {
            return this.f76697a;
        }

        @fg.m
        public final ce.o c() {
            return this.f76699c;
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    @r1({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts$computeIndexedQualifiers$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
    static final class b extends n0 implements ld.l<Integer, e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f76700b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e[] f76701c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, e[] eVarArr) {
            super(1);
            this.f76700b = qVar;
            this.f76701c = eVarArr;
        }

        @fg.l
        public final e a(int i4) {
            Map<Integer, e> a5;
            e eVar;
            q qVar = this.f76700b;
            if (qVar != null && (a5 = qVar.a()) != null && (eVar = a5.get(Integer.valueOf(i4))) != null) {
                return eVar;
            }
            e[] eVarArr = this.f76701c;
            if (i4 >= 0 && i4 <= kotlin.collections.l.we(eVarArr)) {
                return eVarArr[i4];
            }
            e.f76714e.getClass();
            return e.f76715f;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ e invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    static final class c extends n0 implements ld.l<TAnnotation, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<TAnnotation> f76702b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1094a f76703c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<TAnnotation> aVar, C1094a c1094a) {
            super(1);
            this.f76702b = aVar;
            this.f76703c = c1094a;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l TAnnotation tannotation) {
            l0.p(tannotation, ProtectedSandApp.s("犐\u0001"));
            return Boolean.valueOf(this.f76702b.h(tannotation, this.f76703c.b()));
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    @r1({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts$toIndexed$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n3433#2,7:229\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts$toIndexed$1$1\n*L\n209#1:229,7\n*E\n"})
    static final class d extends n0 implements ld.l<C1094a, Iterable<? extends C1094a>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<TAnnotation> f76704b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ce.q f76705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a<TAnnotation> aVar, ce.q qVar) {
            super(1);
            this.f76704b = aVar;
            this.f76705c = qVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterable<C1094a> invoke(@fg.l C1094a c1094a) {
            ce.i b5;
            ce.n L;
            List<ce.o> S;
            C1094a c1094a2;
            ce.i b6;
            l0.p(c1094a, ProtectedSandApp.s("犑\u0001"));
            if ((this.f76704b.u() && (b6 = c1094a.b()) != null && this.f76705c.l0(b6)) || (b5 = c1094a.b()) == null || (L = this.f76705c.L(b5)) == null || (S = this.f76705c.S(L)) == null) {
                return null;
            }
            List<ce.o> list = S;
            List<ce.m> q4 = this.f76705c.q(c1094a.b());
            ce.q qVar = this.f76705c;
            a<TAnnotation> aVar = this.f76704b;
            Iterator<T> it = list.iterator();
            Iterator<T> it2 = q4.iterator();
            ArrayList arrayList = new ArrayList(Math.min(w.b0(list, 10), w.b0(q4, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                ce.m mVar = (ce.m) it2.next();
                ce.o oVar = (ce.o) next;
                if (qVar.y(mVar)) {
                    c1094a2 = new C1094a(null, c1094a.a(), oVar);
                } else {
                    ce.i n02 = qVar.n0(mVar);
                    c1094a2 = new C1094a(n02, aVar.c(n02, c1094a.a()), oVar);
                }
                arrayList.add(c1094a2);
            }
            return arrayList;
        }
    }

    private final i B(i iVar, i iVar2) {
        return iVar == null ? iVar2 : iVar2 == null ? iVar : (!iVar.d() || iVar2.d()) ? (iVar.d() || !iVar2.d()) ? iVar.c().compareTo(iVar2.c()) < 0 ? iVar2 : iVar.c().compareTo(iVar2.c()) > 0 ? iVar : iVar2 : iVar : iVar2;
    }

    private final List<C1094a> C(ce.i iVar) {
        return f(new C1094a(iVar, c(iVar, n()), null), new d(this, v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y c(ce.i iVar, y yVar) {
        return i().c(yVar, j(iVar));
    }

    private final e d(ce.i iVar) {
        h hVar;
        h t4 = t(iVar);
        f fVar = null;
        if (t4 == null) {
            ce.i q4 = q(iVar);
            hVar = q4 != null ? t(q4) : null;
        } else {
            hVar = t4;
        }
        ce.q v4 = v();
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f75734a;
        if (cVar.l(s(v4.c0(iVar)))) {
            fVar = f.READ_ONLY;
        } else if (cVar.k(s(v4.V(iVar)))) {
            fVar = f.MUTABLE;
        }
        return new e(hVar, fVar, v().W(iVar) || A(iVar), hVar != t4);
    }

    private final e e(C1094a c1094a) {
        List list;
        i d5;
        i iVar;
        ce.i b5;
        ce.n L;
        if (c1094a.b() == null) {
            ce.q v4 = v();
            ce.o c5 = c1094a.c();
            if ((c5 != null ? v4.A(c5) : null) == v.IN) {
                e.f76714e.getClass();
                return e.f76715f;
            }
        }
        boolean z4 = false;
        boolean z5 = c1094a.c() == null;
        ce.i b6 = c1094a.b();
        if (b6 == null || (list = j(b6)) == null) {
            list = j0.f74919b;
        }
        ce.q v5 = v();
        ce.i b7 = c1094a.b();
        ce.o p02 = (b7 == null || (L = v5.L(b7)) == null) ? null : v5.p0(L);
        boolean z6 = m() == kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_PARAMETER_BOUNDS;
        if (z5) {
            if (z6 || !p() || (b5 = c1094a.b()) == null || !w(b5)) {
                list = w.z4(l(), list);
            } else {
                Iterable<TAnnotation> l4 = l();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : l4) {
                    if (!i().m(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                list = w.D4(arrayList, list);
            }
        }
        f e4 = i().e(list);
        i f4 = i().f(list, new c(this, c1094a));
        if (f4 != null) {
            h c6 = f4.c();
            if (f4.c() == h.NOT_NULL && p02 != null) {
                z4 = true;
            }
            return new e(c6, e4, z4, f4.d());
        }
        kotlin.reflect.jvm.internal.impl.load.java.b m4 = (z5 || z6) ? m() : kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_USE;
        y a5 = c1094a.a();
        kotlin.reflect.jvm.internal.impl.load.java.r a6 = a5 != null ? a5.a(m4) : null;
        i k4 = p02 != null ? k(p02) : null;
        if (k4 == null || (d5 = i.b(k4, h.NOT_NULL, false, 2, null)) == null) {
            d5 = a6 != null ? a6.d() : null;
        }
        boolean z7 = (k4 != null ? k4.c() : null) == h.NOT_NULL || !(p02 == null || a6 == null || !a6.c());
        ce.o c7 = c1094a.c();
        if (c7 == null || (iVar = k(c7)) == null) {
            iVar = null;
        } else if (iVar.c() == h.NULLABLE) {
            iVar = i.b(iVar, h.FORCE_FLEXIBILITY, false, 2, null);
        }
        i B = B(iVar, d5);
        h c10 = B != null ? B.c() : null;
        if (B != null && B.d()) {
            z4 = true;
        }
        return new e(c10, e4, z7, z4);
    }

    private final <T> List<T> f(T t4, ld.l<? super T, ? extends Iterable<? extends T>> lVar) {
        ArrayList arrayList = new ArrayList(1);
        g(t4, arrayList, lVar);
        return arrayList;
    }

    private final <T> void g(T t4, List<T> list, ld.l<? super T, ? extends Iterable<? extends T>> lVar) {
        list.add(t4);
        Iterable<? extends T> invoke = lVar.invoke(t4);
        if (invoke != null) {
            Iterator<? extends T> it = invoke.iterator();
            while (it.hasNext()) {
                g(it.next(), list, lVar);
            }
        }
    }

    private final i k(ce.o oVar) {
        List<ce.i> list;
        h hVar;
        ce.q v4 = v();
        if (!z(oVar)) {
            return null;
        }
        List<ce.i> v02 = v4.v0(oVar);
        List<ce.i> list2 = v02;
        boolean z4 = list2 instanceof Collection;
        if (!z4 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!v4.C0((ce.i) it.next())) {
                    if (!z4 || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (t((ce.i) it2.next()) != null) {
                                list = v02;
                                break;
                            }
                        }
                    }
                    if (!z4 || !list2.isEmpty()) {
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (q((ce.i) it3.next()) != null) {
                                list = new ArrayList<>();
                                Iterator<T> it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    ce.i q4 = q((ce.i) it4.next());
                                    if (q4 != null) {
                                        list.add(q4);
                                    }
                                }
                                List<ce.i> list3 = list;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator<T> it5 = list3.iterator();
                                    while (it5.hasNext()) {
                                        if (!v4.A0((ce.i) it5.next())) {
                                            hVar = h.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                hVar = h.NULLABLE;
                                return new i(hVar, list != v02);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private final h t(ce.i iVar) {
        ce.q v4 = v();
        if (v4.O(v4.c0(iVar))) {
            return h.NULLABLE;
        }
        if (v4.O(v4.V(iVar))) {
            return null;
        }
        return h.NOT_NULL;
    }

    public boolean A(@fg.l ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("犒\u0001"));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ld.l<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> b(@fg.l ce.i r10, @fg.l java.lang.Iterable<? extends ce.i> r11, @fg.m kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.q r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "犒\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r10, r0)
            java.lang.String r0 = "犓\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r11, r0)
            java.util.List r0 = r9.C(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.w.b0(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r2.next()
            ce.i r3 = (ce.i) r3
            java.util.List r3 = r9.C(r3)
            r1.add(r3)
            goto L25
        L39:
            boolean r2 = r9.r()
            r3 = 1
            if (r2 != 0) goto L70
            boolean r2 = r9.x()
            if (r2 == 0) goto L6b
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L54
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L54
            goto L6b
        L54:
            java.util.Iterator r11 = r11.iterator()
        L58:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r11.next()
            ce.i r2 = (ce.i) r2
            boolean r2 = r9.y(r10, r2)
            if (r2 != 0) goto L58
            goto L70
        L6b:
            int r10 = r0.size()
            goto L71
        L70:
            r10 = r3
        L71:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e[] r11 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e[r10]
            r2 = 0
            r4 = r2
        L75:
            if (r4 >= r10) goto Lcf
            java.lang.Object r5 = r0.get(r4)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a.C1094a) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r5 = r9.e(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L8a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.w.W2(r8, r4)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a.C1094a) r8
            if (r8 == 0) goto La9
            ce.i r8 = r8.b()
            if (r8 == 0) goto La9
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r8 = r9.d(r8)
            goto Laa
        La9:
            r8 = 0
        Laa:
            if (r8 == 0) goto L8a
            r6.add(r8)
            goto L8a
        Lb0:
            if (r4 != 0) goto Lba
            boolean r7 = r9.x()
            if (r7 == 0) goto Lba
            r7 = r3
            goto Lbb
        Lba:
            r7 = r2
        Lbb:
            if (r4 != 0) goto Lc5
            boolean r8 = r9.o()
            if (r8 == 0) goto Lc5
            r8 = r3
            goto Lc6
        Lc5:
            r8 = r2
        Lc6:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.s.a(r5, r6, r7, r8, r13)
            r11[r4] = r5
            int r4 = r4 + 1
            goto L75
        Lcf:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$b r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$b
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a.b(ce.i, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.q, boolean):ld.l");
    }

    public abstract boolean h(@fg.l TAnnotation tannotation, @fg.m ce.i iVar);

    @fg.l
    public abstract kotlin.reflect.jvm.internal.impl.load.java.a<TAnnotation> i();

    @fg.l
    public abstract Iterable<TAnnotation> j(@fg.l ce.i iVar);

    @fg.l
    public abstract Iterable<TAnnotation> l();

    @fg.l
    public abstract kotlin.reflect.jvm.internal.impl.load.java.b m();

    @fg.m
    public abstract y n();

    public abstract boolean o();

    public abstract boolean p();

    @fg.m
    public abstract ce.i q(@fg.l ce.i iVar);

    public boolean r() {
        return false;
    }

    @fg.m
    public abstract kotlin.reflect.jvm.internal.impl.name.d s(@fg.l ce.i iVar);

    public abstract boolean u();

    @fg.l
    public abstract ce.q v();

    public abstract boolean w(@fg.l ce.i iVar);

    public abstract boolean x();

    public abstract boolean y(@fg.l ce.i iVar, @fg.l ce.i iVar2);

    public abstract boolean z(@fg.l ce.o oVar);
}
