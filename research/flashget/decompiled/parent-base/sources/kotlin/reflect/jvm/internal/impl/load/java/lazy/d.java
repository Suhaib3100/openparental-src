package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Iterator;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.sequences.p;

/* compiled from: LazyJavaAnnotations.kt */
/* loaded from: classes7.dex */
public final class d implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: b, reason: collision with root package name */
    @l
    private final g f76489b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final wd.d f76490c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f76491d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.storage.h<wd.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f76492e;

    /* compiled from: LazyJavaAnnotations.kt */
    static final class a extends n0 implements ld.l<wd.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {
        a() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c invoke(@l wd.a aVar) {
            l0.p(aVar, ProtectedSandApp.s("焭\u0001"));
            return kotlin.reflect.jvm.internal.impl.load.java.components.c.f76386a.e(aVar, d.this.f76489b, d.this.f76491d);
        }
    }

    public d(@l g gVar, @l wd.d dVar, boolean z4) {
        l0.p(gVar, ProtectedSandApp.s("焮\u0001"));
        l0.p(dVar, ProtectedSandApp.s("焯\u0001"));
        this.f76489b = gVar;
        this.f76490c = dVar;
        this.f76491d = z4;
        this.f76492e = gVar.a().u().b(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return this.f76490c.getAnnotations().isEmpty() && !this.f76490c.E();
    }

    @Override // java.lang.Iterable
    @l
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        return p.v0(p.n2(p.k1(w.A1(this.f76490c.getAnnotations()), this.f76492e), kotlin.reflect.jvm.internal.impl.load.java.components.c.f76386a.a(l.a.f75886y, this.f76490c, this.f76489b))).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @m
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c k(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c invoke;
        l0.p(cVar, ProtectedSandApp.s("焰\u0001"));
        wd.a k4 = this.f76490c.k(cVar);
        return (k4 == null || (invoke = this.f76492e.invoke(k4)) == null) ? kotlin.reflect.jvm.internal.impl.load.java.components.c.f76386a.a(cVar, this.f76490c, this.f76489b) : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean o3(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return g.b.b(this, cVar);
    }

    public /* synthetic */ d(g gVar, wd.d dVar, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(gVar, dVar, (i4 & 4) != 0 ? false : z4);
    }
}
