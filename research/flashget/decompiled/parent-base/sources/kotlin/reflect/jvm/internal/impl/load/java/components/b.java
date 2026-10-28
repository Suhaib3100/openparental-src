package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.o;

/* compiled from: JavaAnnotationMapper.kt */
@r1({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes7.dex */
public class b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.load.java.descriptors.g {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f76378f = {l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("濪\u0001"), ProtectedSandApp.s("濫\u0001")))};

    /* renamed from: a, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.name.c f76379a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final a1 f76380b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76381c;

    /* renamed from: d, reason: collision with root package name */
    @m
    private final wd.b f76382d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f76383e;

    /* compiled from: JavaAnnotationMapper.kt */
    static final class a extends n0 implements ld.a<p0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76384b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f76385c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, b bVar) {
            super(0);
            this.f76384b = gVar;
            this.f76385c = bVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke() {
            p0 r4 = this.f76384b.d().p().o(this.f76385c.g()).r();
            l0.o(r4, ProtectedSandApp.s("濩\u0001"));
            return r4;
        }
    }

    public b(@l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @m wd.a aVar, @l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        a1 a1Var;
        Collection<wd.b> c5;
        l0.p(gVar, ProtectedSandApp.s("濬\u0001"));
        l0.p(cVar, ProtectedSandApp.s("濭\u0001"));
        this.f76379a = cVar;
        if (aVar == null || (a1Var = gVar.a().t().a(aVar)) == null) {
            a1Var = a1.f75900a;
            l0.o(a1Var, ProtectedSandApp.s("濮\u0001"));
        }
        this.f76380b = a1Var;
        this.f76381c = gVar.e().h(new a(gVar, this));
        this.f76382d = (aVar == null || (c5 = aVar.c()) == null) ? null : (wd.b) w.E2(c5);
        boolean z4 = false;
        if (aVar != null && aVar.n()) {
            z4 = true;
        }
        this.f76383e = z4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @l
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        return z0.z();
    }

    @m
    protected final wd.b b() {
        return this.f76382d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 getType() {
        return (p0) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76381c, this, f76378f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @l
    public a1 f() {
        return this.f76380b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @l
    public kotlin.reflect.jvm.internal.impl.name.c g() {
        return this.f76379a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.g
    public boolean n() {
        return this.f76383e;
    }
}
