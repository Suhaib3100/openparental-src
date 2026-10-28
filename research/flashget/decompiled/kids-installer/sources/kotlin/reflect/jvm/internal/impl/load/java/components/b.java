package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.f1;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes6.dex */
public class b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.load.java.descriptors.g {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f24524f = {l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("萇"), ProtectedSandApp.s("萈")))};

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.c f24525a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final a1 f24526b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24527c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private final b4.b f24528d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24529e;

    /* compiled from: JavaAnnotationMapper.kt */
    static final class a extends Lambda implements q3.a<p0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24530p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ b f24531q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, b bVar) {
            super(0);
            this.f24530p = gVar;
            this.f24531q = bVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 n() {
            p0 E = this.f24530p.d().A().o(this.f24531q.f()).E();
            l0.o(E, ProtectedSandApp.s("萆"));
            return E;
        }
    }

    public b(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.e b4.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        a1 a1Var;
        b4.b bVar;
        Collection<b4.b> g5;
        Object E2;
        l0.p(gVar, ProtectedSandApp.s("萉"));
        l0.p(cVar, ProtectedSandApp.s("萊"));
        this.f24525a = cVar;
        if (aVar == null || (a1Var = gVar.a().t().a(aVar)) == null) {
            a1Var = a1.f24103a;
            l0.o(a1Var, ProtectedSandApp.s("萋"));
        }
        this.f24526b = a1Var;
        this.f24527c = gVar.e().d(new a(gVar, this));
        if (aVar == null || (g5 = aVar.g()) == null) {
            bVar = null;
        } else {
            E2 = j0.E2(g5);
            bVar = (b4.b) E2;
        }
        this.f24528d = bVar;
        boolean z5 = false;
        if (aVar != null && aVar.j()) {
            z5 = true;
        }
        this.f24529e = z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> z5;
        z5 = f1.z();
        return z5;
    }

    @d5.e
    protected final b4.b b() {
        return this.f24528d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 getType() {
        return (p0) m.a(this.f24527c, this, f24524f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.c f() {
        return this.f24525a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.g
    public boolean j() {
        return this.f24529e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public a1 k() {
        return this.f24526b;
    }
}
