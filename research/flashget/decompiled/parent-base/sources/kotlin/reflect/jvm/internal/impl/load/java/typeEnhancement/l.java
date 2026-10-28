package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.o0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: signatureEnhancement.kt */
@r1({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1549#2:283\n1620#2,3:284\n1549#2:287\n1620#2,3:288\n1549#2:292\n1620#2,3:293\n1747#2,3:296\n1747#2,3:299\n1559#2:302\n1590#2,4:303\n1549#2:307\n1620#2,3:308\n1549#2:311\n1620#2,3:312\n1#3:291\n*S KotlinDebug\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n*L\n55#1:283\n55#1:284,3\n66#1:287\n66#1:288,3\n117#1:292\n117#1:293,3\n138#1:296,3\n144#1:299,3\n150#1:302\n150#1:303,4\n164#1:307\n164#1:308,3\n214#1:311\n214#1:312,3\n*E\n"})
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d f76763a;

    /* compiled from: signatureEnhancement.kt */
    static final class a extends n0 implements ld.l<w1, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76764b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(w1 w1Var) {
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = w1Var.O0().c();
            if (c5 == null) {
                return Boolean.FALSE;
            }
            kotlin.reflect.jvm.internal.impl.name.f name = c5.getName();
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f75734a;
            return Boolean.valueOf(l0.g(name, cVar.h().g()) && l0.g(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.h(c5), cVar.h()));
        }
    }

    /* compiled from: signatureEnhancement.kt */
    static final class b extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, h0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f76765b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("狷\u0001"));
            x0 S = bVar.S();
            l0.m(S);
            h0 type = S.getType();
            l0.o(type, ProtectedSandApp.s("狸\u0001"));
            return type;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    static final class c extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, h0> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f76766b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("狹\u0001"));
            h0 returnType = bVar.getReturnType();
            l0.m(returnType);
            return returnType;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    static final class d extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j1 f76767b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j1 j1Var) {
            super(1);
            this.f76767b = j1Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("狺\u0001"));
            h0 type = bVar.i().get(this.f76767b.getIndex()).getType();
            l0.o(type, ProtectedSandApp.s("狻\u0001"));
            return type;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    static final class e extends n0 implements ld.l<w1, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f76768b = new e(1);

        e() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l w1 w1Var) {
            l0.p(w1Var, ProtectedSandApp.s("狼\u0001"));
            return Boolean.valueOf(w1Var instanceof o0);
        }
    }

    public l(@fg.l kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("狽\u0001"));
        this.f76763a = dVar;
    }

    private final boolean a(h0 h0Var) {
        return t1.c(h0Var, a.f76764b);
    }

    private final h0 b(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z4, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, kotlin.reflect.jvm.internal.impl.load.java.b bVar2, q qVar, boolean z5, ld.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends h0> lVar) {
        n nVar = new n(aVar, z4, gVar, bVar2, false, 16, null);
        h0 invoke = lVar.invoke(bVar);
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> e4 = bVar.e();
        l0.o(e4, ProtectedSandApp.s("狾\u0001"));
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection = e4;
        ArrayList arrayList = new ArrayList(w.b0(collection, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar3 : collection) {
            l0.m(bVar3);
            arrayList.add(lVar.invoke(bVar3));
        }
        return c(nVar, invoke, arrayList, qVar, z5);
    }

    private final h0 c(n nVar, h0 h0Var, List<? extends h0> list, q qVar, boolean z4) {
        return this.f76763a.a(h0Var, nVar.b(h0Var, list, qVar, z4), nVar.u());
    }

    static /* synthetic */ h0 d(l lVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z4, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, kotlin.reflect.jvm.internal.impl.load.java.b bVar2, q qVar, boolean z5, ld.l lVar2, int i4, Object obj) {
        return lVar.b(bVar, aVar, z4, gVar, bVar2, qVar, (i4 & 32) != 0 ? false : z5, lVar2);
    }

    static /* synthetic */ h0 e(l lVar, n nVar, h0 h0Var, List list, q qVar, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            qVar = null;
        }
        q qVar2 = qVar;
        if ((i4 & 8) != 0) {
            z4 = false;
        }
        return lVar.c(nVar, h0Var, list, qVar2, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> D f(D r22, kotlin.reflect.jvm.internal.impl.load.java.lazy.g r23) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l.f(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.load.java.lazy.g):kotlin.reflect.jvm.internal.impl.descriptors.b");
    }

    private final h0 j(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, j1 j1Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, q qVar, boolean z4, ld.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends h0> lVar) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g h4;
        return b(bVar, j1Var, false, (j1Var == null || (h4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.h(gVar, j1Var.getAnnotations())) == null) ? gVar : h4, kotlin.reflect.jvm.internal.impl.load.java.b.VALUE_PARAMETER, qVar, z4, lVar);
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> kotlin.reflect.jvm.internal.impl.descriptors.annotations.g k(D d5, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h a5 = kotlin.reflect.jvm.internal.impl.descriptors.s.a(d5);
        if (a5 == null) {
            return d5.getAnnotations();
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar = a5 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f ? (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f) a5 : null;
        List<wd.a> R0 = fVar != null ? fVar.R0() : null;
        List<wd.a> list = R0;
        if (list == null || list.isEmpty()) {
            return d5.getAnnotations();
        }
        List<wd.a> list2 = R0;
        ArrayList arrayList = new ArrayList(w.b0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e(gVar, (wd.a) it.next(), true));
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.a(w.z4(d5.getAnnotations(), arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> g(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l Collection<? extends D> collection) {
        l0.p(gVar, ProtectedSandApp.s("猃\u0001"));
        l0.p(collection, ProtectedSandApp.s("猄\u0001"));
        Collection<? extends D> collection2 = collection;
        ArrayList arrayList = new ArrayList(w.b0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(f((kotlin.reflect.jvm.internal.impl.descriptors.b) it.next(), gVar));
        }
        return arrayList;
    }

    @fg.l
    public final h0 h(@fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        l0.p(h0Var, ProtectedSandApp.s("猅\u0001"));
        l0.p(gVar, ProtectedSandApp.s("猆\u0001"));
        h0 e4 = e(this, new n(null, false, gVar, kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_USE, true), h0Var, j0.f74919b, null, false, 12, null);
        return e4 == null ? h0Var : e4;
    }

    @fg.l
    public final List<h0> i(@fg.l f1 f1Var, @fg.l List<? extends h0> list, @fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        l0.p(f1Var, ProtectedSandApp.s("猇\u0001"));
        l0.p(list, ProtectedSandApp.s("猈\u0001"));
        l0.p(gVar, ProtectedSandApp.s("猆\u0001"));
        List<? extends h0> list2 = list;
        ArrayList arrayList = new ArrayList(w.b0(list2, 10));
        for (h0 h0Var : list2) {
            if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.b(h0Var, e.f76768b)) {
                h0 e4 = e(this, new n(f1Var, false, gVar, kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_PARAMETER_BOUNDS, false, 16, null), h0Var, j0.f74919b, null, false, 12, null);
                if (e4 != null) {
                    h0Var = e4;
                }
            }
            arrayList.add(h0Var);
        }
        return arrayList;
    }
}
