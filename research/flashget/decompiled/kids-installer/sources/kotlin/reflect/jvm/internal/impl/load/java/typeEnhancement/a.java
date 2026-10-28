package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.java.y;

/* compiled from: AbstractSignatureParts.kt */
/* loaded from: classes5.dex */
public abstract class a<TAnnotation> {

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a, reason: collision with other inner class name */
    private static final class C0290a {

        /* renamed from: a, reason: collision with root package name */
        @d5.e
        private final h4.i f24822a;

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        private final y f24823b;

        /* renamed from: c, reason: collision with root package name */
        @d5.e
        private final h4.p f24824c;

        public C0290a(@d5.e h4.i iVar, @d5.e y yVar, @d5.e h4.p pVar) {
            this.f24822a = iVar;
            this.f24823b = yVar;
            this.f24824c = pVar;
        }

        @d5.e
        public final y a() {
            return this.f24823b;
        }

        @d5.e
        public final h4.i b() {
            return this.f24822a;
        }

        @d5.e
        public final h4.p c() {
            return this.f24824c;
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<Integer, e> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q f24825p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ e[] f24826q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, e[] eVarArr) {
            super(1);
            this.f24825p = qVar;
            this.f24826q = eVarArr;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ e N(Integer num) {
            return a(num.intValue());
        }

        @d5.d
        public final e a(int i5) {
            int we;
            Map<Integer, e> a6;
            e eVar;
            q qVar = this.f24825p;
            if (qVar != null && (a6 = qVar.a()) != null && (eVar = a6.get(Integer.valueOf(i5))) != null) {
                return eVar;
            }
            e[] eVarArr = this.f24826q;
            if (i5 >= 0) {
                we = t.we(eVarArr);
                if (i5 <= we) {
                    return eVarArr[i5];
                }
            }
            e.f24838e.getClass();
            return e.f24839f;
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<TAnnotation, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ a<TAnnotation> f24827p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<TAnnotation> aVar) {
            super(1);
            this.f24827p = aVar;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d TAnnotation tannotation) {
            l0.p(tannotation, ProtectedSandApp.s("薋"));
            return Boolean.valueOf(this.f24827p.r(tannotation));
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q3.l<C0290a, Iterable<? extends C0290a>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ a<TAnnotation> f24828p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ h4.r f24829q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a<TAnnotation> aVar, h4.r rVar) {
            super(1);
            this.f24828p = aVar;
            this.f24829q = rVar;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterable<C0290a> N(@d5.d C0290a c0290a) {
            h4.o E;
            List<h4.p> h02;
            int b02;
            int b03;
            C0290a c0290a2;
            h4.g z5;
            l0.p(c0290a, ProtectedSandApp.s("薌"));
            if (this.f24828p.u()) {
                h4.i b6 = c0290a.b();
                if (((b6 == null || (z5 = this.f24829q.z(b6)) == null) ? null : this.f24829q.D0(z5)) != null) {
                    return null;
                }
            }
            h4.i b7 = c0290a.b();
            if (b7 == null || (E = this.f24829q.E(b7)) == null || (h02 = this.f24829q.h0(E)) == null) {
                return null;
            }
            List<h4.n> F0 = this.f24829q.F0(c0290a.b());
            h4.r rVar = this.f24829q;
            a<TAnnotation> aVar = this.f24828p;
            Iterator<T> it = h02.iterator();
            Iterator<T> it2 = F0.iterator();
            b02 = b0.b0(h02, 10);
            b03 = b0.b0(F0, 10);
            ArrayList arrayList = new ArrayList(Math.min(b02, b03));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                h4.n nVar = (h4.n) it2.next();
                h4.p pVar = (h4.p) next;
                if (rVar.o(nVar)) {
                    c0290a2 = new C0290a(null, c0290a.a(), pVar);
                } else {
                    h4.i r5 = rVar.r(nVar);
                    c0290a2 = new C0290a(r5, aVar.c(r5, c0290a.a()), pVar);
                }
                arrayList.add(c0290a2);
            }
            return arrayList;
        }
    }

    private final i B(i iVar, i iVar2) {
        return iVar == null ? iVar2 : iVar2 == null ? iVar : (!iVar.d() || iVar2.d()) ? (iVar.d() || !iVar2.d()) ? iVar.c().compareTo(iVar2.c()) < 0 ? iVar2 : iVar.c().compareTo(iVar2.c()) > 0 ? iVar : iVar2 : iVar : iVar2;
    }

    private final List<C0290a> C(h4.i iVar) {
        return f(new C0290a(iVar, c(iVar, m()), null), new d(this, v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y c(h4.i iVar, y yVar) {
        return h().c(yVar, i(iVar));
    }

    private final e d(h4.i iVar) {
        h hVar;
        h t5 = t(iVar);
        f fVar = null;
        if (t5 == null) {
            h4.i p5 = p(iVar);
            hVar = p5 != null ? t(p5) : null;
        } else {
            hVar = t5;
        }
        h4.r v5 = v();
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f23942a;
        if (cVar.l(s(v5.t0(iVar)))) {
            fVar = f.READ_ONLY;
        } else if (cVar.k(s(v5.u(iVar)))) {
            fVar = f.MUTABLE;
        }
        return new e(hVar, fVar, v().o0(iVar) || A(iVar), hVar != t5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x012b, code lost:
    
        if ((r0 != null && r0.c()) != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e e(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a.C0290a r12) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a.e(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e");
    }

    private final <T> List<T> f(T t5, q3.l<? super T, ? extends Iterable<? extends T>> lVar) {
        ArrayList arrayList = new ArrayList(1);
        g(t5, arrayList, lVar);
        return arrayList;
    }

    private final <T> void g(T t5, List<T> list, q3.l<? super T, ? extends Iterable<? extends T>> lVar) {
        list.add(t5);
        Iterable<? extends T> N = lVar.N(t5);
        if (N != null) {
            Iterator<? extends T> it = N.iterator();
            while (it.hasNext()) {
                g(it.next(), list, lVar);
            }
        }
    }

    private final i j(h4.p pVar) {
        boolean z5;
        boolean z6;
        boolean z7;
        List<h4.i> arrayList;
        boolean z8;
        h4.r v5 = v();
        i iVar = null;
        if (!z(pVar)) {
            return null;
        }
        List<h4.i> Z = v5.Z(pVar);
        boolean z9 = Z instanceof Collection;
        if (!z9 || !Z.isEmpty()) {
            Iterator<T> it = Z.iterator();
            while (it.hasNext()) {
                if (!v5.S((h4.i) it.next())) {
                    z5 = false;
                    break;
                }
            }
        }
        z5 = true;
        if (z5) {
            return null;
        }
        if (!z9 || !Z.isEmpty()) {
            Iterator<T> it2 = Z.iterator();
            while (it2.hasNext()) {
                if (t((h4.i) it2.next()) != null) {
                    z6 = true;
                    break;
                }
            }
        }
        z6 = false;
        if (!z6) {
            if (!z9 || !Z.isEmpty()) {
                Iterator<T> it3 = Z.iterator();
                while (it3.hasNext()) {
                    if (p((h4.i) it3.next()) != null) {
                        z7 = true;
                        break;
                    }
                }
            }
            z7 = false;
            if (z7) {
                arrayList = new ArrayList<>();
                Iterator<T> it4 = Z.iterator();
                while (it4.hasNext()) {
                    h4.i p5 = p((h4.i) it4.next());
                    if (p5 != null) {
                        arrayList.add(p5);
                    }
                }
            }
            return iVar;
        }
        arrayList = Z;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                if (!v5.M((h4.i) it5.next())) {
                    z8 = false;
                    break;
                }
            }
        }
        z8 = true;
        iVar = new i(z8 ? h.NULLABLE : h.NOT_NULL, arrayList != Z);
        return iVar;
    }

    private final h t(h4.i iVar) {
        h4.r v5 = v();
        if (v5.y(v5.t0(iVar))) {
            return h.NULLABLE;
        }
        if (v5.y(v5.u(iVar))) {
            return null;
        }
        return h.NOT_NULL;
    }

    public boolean A(@d5.d h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("䫮"));
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (r10 != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0078  */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q3.l<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> b(@d5.d h4.i r10, @d5.d java.lang.Iterable<? extends h4.i> r11, @d5.e kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.q r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "䫯"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r10, r0)
            java.lang.String r0 = "䫰"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r11, r0)
            java.util.List r0 = r9.C(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.y.b0(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r2.next()
            h4.i r3 = (h4.i) r3
            java.util.List r3 = r9.C(r3)
            r1.add(r3)
            goto L25
        L39:
            boolean r2 = r9.q()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L73
            boolean r2 = r9.x()
            if (r2 == 0) goto L71
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L56
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L56
        L54:
            r10 = r3
            goto L6e
        L56:
            java.util.Iterator r11 = r11.iterator()
        L5a:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r11.next()
            h4.i r2 = (h4.i) r2
            boolean r2 = r9.y(r10, r2)
            r2 = r2 ^ r4
            if (r2 == 0) goto L5a
            r10 = r4
        L6e:
            if (r10 == 0) goto L71
            goto L73
        L71:
            r10 = r3
            goto L74
        L73:
            r10 = r4
        L74:
            if (r10 == 0) goto L78
            r10 = r4
            goto L7c
        L78:
            int r10 = r0.size()
        L7c:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e[] r11 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e[r10]
            r2 = r3
        L7f:
            if (r2 >= r10) goto Ld9
            java.lang.Object r5 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a.C0290a) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r5 = r9.e(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L94:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lba
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.y.W2(r8, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a.C0290a) r8
            if (r8 == 0) goto Lb3
            h4.i r8 = r8.b()
            if (r8 == 0) goto Lb3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r8 = r9.d(r8)
            goto Lb4
        Lb3:
            r8 = 0
        Lb4:
            if (r8 == 0) goto L94
            r6.add(r8)
            goto L94
        Lba:
            if (r2 != 0) goto Lc4
            boolean r7 = r9.x()
            if (r7 == 0) goto Lc4
            r7 = r4
            goto Lc5
        Lc4:
            r7 = r3
        Lc5:
            if (r2 != 0) goto Lcf
            boolean r8 = r9.n()
            if (r8 == 0) goto Lcf
            r8 = r4
            goto Ld0
        Lcf:
            r8 = r3
        Ld0:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.s.a(r5, r6, r7, r8, r13)
            r11[r2] = r5
            int r2 = r2 + 1
            goto L7f
        Ld9:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$b r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$b
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a.b(h4.i, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.q, boolean):q3.l");
    }

    @d5.d
    public abstract kotlin.reflect.jvm.internal.impl.load.java.a<TAnnotation> h();

    @d5.d
    public abstract Iterable<TAnnotation> i(@d5.d h4.i iVar);

    @d5.d
    public abstract Iterable<TAnnotation> k();

    @d5.d
    public abstract kotlin.reflect.jvm.internal.impl.load.java.b l();

    @d5.e
    public abstract y m();

    public abstract boolean n();

    public abstract boolean o();

    @d5.e
    public abstract h4.i p(@d5.d h4.i iVar);

    public boolean q() {
        return false;
    }

    public abstract boolean r(@d5.d TAnnotation tannotation);

    @d5.e
    public abstract kotlin.reflect.jvm.internal.impl.name.d s(@d5.d h4.i iVar);

    public abstract boolean u();

    @d5.d
    public abstract h4.r v();

    public abstract boolean w(@d5.d h4.i iVar);

    public abstract boolean x();

    public abstract boolean y(@d5.d h4.i iVar, @d5.d h4.i iVar2);

    public abstract boolean z(@d5.d h4.p pVar);
}
