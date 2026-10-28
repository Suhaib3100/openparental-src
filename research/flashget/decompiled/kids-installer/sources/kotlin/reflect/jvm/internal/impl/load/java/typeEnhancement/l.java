package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.o0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d f24887a;

    /* compiled from: signatureEnhancement.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<w1, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24888p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(w1 w1Var) {
            kotlin.reflect.jvm.internal.impl.descriptors.h b6 = w1Var.U0().b();
            if (b6 == null) {
                return Boolean.FALSE;
            }
            kotlin.reflect.jvm.internal.impl.name.f name = b6.getName();
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f23942a;
            return Boolean.valueOf(l0.g(name, cVar.h().g()) && l0.g(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.h(b6), cVar.h()));
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, h0> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f24889p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("薺"));
            x0 t02 = bVar.t0();
            l0.m(t02);
            h0 type = t02.getType();
            l0.o(type, ProtectedSandApp.s("薻"));
            return type;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, h0> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f24890p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("薼"));
            h0 i5 = bVar.i();
            l0.m(i5);
            return i5;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, h0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ j1 f24891p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j1 j1Var) {
            super(1);
            this.f24891p = j1Var;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("薽"));
            h0 type = bVar.n().get(this.f24891p.getIndex()).getType();
            l0.o(type, ProtectedSandApp.s("薾"));
            return type;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q3.l<w1, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final e f24892p = new e();

        e() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d w1 w1Var) {
            l0.p(w1Var, ProtectedSandApp.s("薿"));
            return Boolean.valueOf(w1Var instanceof o0);
        }
    }

    public l(@d5.d kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("䬪"));
        this.f24887a = dVar;
    }

    private final boolean a(h0 h0Var) {
        return t1.c(h0Var, a.f24888p);
    }

    private final h0 b(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z5, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, kotlin.reflect.jvm.internal.impl.load.java.b bVar2, q qVar, boolean z6, q3.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends h0> lVar) {
        int b02;
        n nVar = new n(aVar, z5, gVar, bVar2, false, 16, null);
        h0 N = lVar.N(bVar);
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> g5 = bVar.g();
        l0.o(g5, ProtectedSandApp.s("䬫"));
        b02 = b0.b0(g5, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar3 : g5) {
            l0.o(bVar3, ProtectedSandApp.s("䬬"));
            arrayList.add(lVar.N(bVar3));
        }
        return c(nVar, N, arrayList, qVar, z6);
    }

    private final h0 c(n nVar, h0 h0Var, List<? extends h0> list, q qVar, boolean z5) {
        return this.f24887a.a(h0Var, nVar.b(h0Var, list, qVar, z5), nVar.u());
    }

    static /* synthetic */ h0 d(l lVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z5, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, kotlin.reflect.jvm.internal.impl.load.java.b bVar2, q qVar, boolean z6, q3.l lVar2, int i5, Object obj) {
        return lVar.b(bVar, aVar, z5, gVar, bVar2, qVar, (i5 & 32) != 0 ? false : z6, lVar2);
    }

    static /* synthetic */ h0 e(l lVar, n nVar, h0 h0Var, List list, q qVar, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            qVar = null;
        }
        q qVar2 = qVar;
        if ((i5 & 8) != 0) {
            z5 = false;
        }
        return lVar.c(nVar, h0Var, list, qVar2, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> D f(D r21, kotlin.reflect.jvm.internal.impl.load.java.lazy.g r22) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l.f(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.load.java.lazy.g):kotlin.reflect.jvm.internal.impl.descriptors.b");
    }

    private final h0 j(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, j1 j1Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, q qVar, boolean z5, q3.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends h0> lVar) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g h5;
        return b(bVar, j1Var, false, (j1Var == null || (h5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.h(gVar, j1Var.getAnnotations())) == null) ? gVar : h5, kotlin.reflect.jvm.internal.impl.load.java.b.VALUE_PARAMETER, qVar, z5, lVar);
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> kotlin.reflect.jvm.internal.impl.descriptors.annotations.g k(D d6, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        int b02;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> z42;
        kotlin.reflect.jvm.internal.impl.descriptors.h a6 = kotlin.reflect.jvm.internal.impl.descriptors.s.a(d6);
        if (a6 == null) {
            return d6.getAnnotations();
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar = a6 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f ? (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f) a6 : null;
        List<b4.a> X0 = fVar != null ? fVar.X0() : null;
        if (X0 == null || X0.isEmpty()) {
            return d6.getAnnotations();
        }
        b02 = b0.b0(X0, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = X0.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e(gVar, (b4.a) it.next(), true));
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
        z42 = j0.z4(d6.getAnnotations(), arrayList);
        return aVar.a(z42);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> g(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d Collection<? extends D> collection) {
        int b02;
        l0.p(gVar, ProtectedSandApp.s("䬳"));
        l0.p(collection, ProtectedSandApp.s("䬴"));
        b02 = b0.b0(collection, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(f((kotlin.reflect.jvm.internal.impl.descriptors.b) it.next(), gVar));
        }
        return arrayList;
    }

    @d5.d
    public final h0 h(@d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        l0.p(h0Var, ProtectedSandApp.s("䬵"));
        l0.p(gVar, ProtectedSandApp.s("䬶"));
        h0 e6 = e(this, new n(null, false, gVar, kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_USE, true), h0Var, EmptyList.f23167o, null, false, 12, null);
        return e6 == null ? h0Var : e6;
    }

    @d5.d
    public final List<h0> i(@d5.d f1 f1Var, @d5.d List<? extends h0> list, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        int b02;
        h0 e6;
        l0.p(f1Var, ProtectedSandApp.s("䬷"));
        l0.p(list, ProtectedSandApp.s("䬸"));
        l0.p(gVar, ProtectedSandApp.s("䬹"));
        b02 = b0.b0(list, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (h0 h0Var : list) {
            if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.b(h0Var, e.f24892p) && (e6 = e(this, new n(f1Var, false, gVar, kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_PARAMETER_BOUNDS, false, 16, null), h0Var, EmptyList.f23167o, null, false, 12, null)) != null) {
                h0Var = e6;
            }
            arrayList.add(h0Var);
        }
        return arrayList;
    }
}
