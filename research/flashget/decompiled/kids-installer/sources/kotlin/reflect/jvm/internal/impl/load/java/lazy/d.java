package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.sequences.Sequence;
import kotlin.sequences.v;
import q3.l;

/* compiled from: LazyJavaAnnotations.kt */
/* loaded from: classes6.dex */
public final class d implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final g f24630o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final b4.d f24631p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f24632q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<b4.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f24633r;

    /* compiled from: LazyJavaAnnotations.kt */
    static final class a extends Lambda implements l<b4.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {
        a() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c N(@d5.d b4.a aVar) {
            l0.p(aVar, ProtectedSandApp.s("葢"));
            return kotlin.reflect.jvm.internal.impl.load.java.components.c.f24532a.e(aVar, d.this.f24630o, d.this.f24632q);
        }
    }

    public d(@d5.d g gVar, @d5.d b4.d dVar, boolean z5) {
        l0.p(gVar, ProtectedSandApp.s("董"));
        l0.p(dVar, ProtectedSandApp.s("葤"));
        this.f24630o = gVar;
        this.f24631p = dVar;
        this.f24632q = z5;
        this.f24633r = gVar.a().u().i(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean O0(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c N;
        l0.p(cVar, ProtectedSandApp.s("葥"));
        b4.a e6 = this.f24631p.e(cVar);
        return (e6 == null || (N = this.f24633r.N(e6)) == null) ? kotlin.reflect.jvm.internal.impl.load.java.components.c.f24532a.a(cVar, this.f24631p, this.f24630o) : N;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return this.f24631p.getAnnotations().isEmpty() && !this.f24631p.o();
    }

    @Override // java.lang.Iterable
    @d5.d
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        Sequence A1;
        Sequence k12;
        Sequence n22;
        Sequence v02;
        A1 = j0.A1(this.f24631p.getAnnotations());
        k12 = v.k1(A1, this.f24633r);
        n22 = v.n2(k12, kotlin.reflect.jvm.internal.impl.load.java.components.c.f24532a.a(l.a.f24089y, this.f24631p, this.f24630o));
        v02 = v.v0(n22);
        return v02.iterator();
    }

    public /* synthetic */ d(g gVar, b4.d dVar, boolean z5, int i5, w wVar) {
        this(gVar, dVar, (i5 & 4) != 0 ? false : z5);
    }
}
