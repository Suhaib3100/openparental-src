package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.v1;

/* compiled from: signatureEnhancement.kt */
@r1({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1#2:283\n*E\n"})
/* loaded from: classes7.dex */
final class n extends a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {

    /* renamed from: a, reason: collision with root package name */
    @fg.m
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a f76776a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f76777b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76778c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.b f76779d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f76780e;

    public n(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z4, @fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.load.java.b bVar, boolean z5) {
        l0.p(gVar, ProtectedSandApp.s("猑\u0001"));
        l0.p(bVar, ProtectedSandApp.s("猒\u0001"));
        this.f76776a = aVar;
        this.f76777b = z4;
        this.f76778c = gVar;
        this.f76779d = bVar;
        this.f76780e = z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean A(@fg.l ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("猓\u0001"));
        return ((h0) iVar).R0() instanceof g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean h(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, @fg.m ce.i iVar) {
        l0.p(cVar, ProtectedSandApp.s("猓\u0001"));
        return ((cVar instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.g) && ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.g) cVar).n()) || ((cVar instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e) && !p() && (((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e) cVar).k() || this.f76779d == kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_PARAMETER_BOUNDS)) || (iVar != null && kotlin.reflect.jvm.internal.impl.builtins.h.q0((h0) iVar) && i().m(cVar) && !this.f76778c.a().q().d());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @fg.l
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.load.java.d i() {
        return this.f76778c.a().a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @fg.m
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public h0 q(@fg.l ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("猓\u0001"));
        return v1.a((h0) iVar);
    }

    @fg.l
    public ce.s G() {
        return kotlin.reflect.jvm.internal.impl.types.checker.q.f78377a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @fg.l
    public Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> j(@fg.l ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("猓\u0001"));
        return ((h0) iVar).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @fg.l
    public Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> l() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.f76776a;
        return (aVar == null || (annotations = aVar.getAnnotations()) == null) ? j0.f74919b : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.load.java.b m() {
        return this.f76779d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @fg.m
    public y n() {
        return this.f76778c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean o() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.f76776a;
        return (aVar instanceof j1) && ((j1) aVar).x0() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean p() {
        return this.f76778c.a().q().c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @fg.m
    public kotlin.reflect.jvm.internal.impl.name.d s(@fg.l ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("猓\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.e f4 = t1.f((h0) iVar);
        if (f4 != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.f.m(f4);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean u() {
        return this.f76780e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public ce.q v() {
        return kotlin.reflect.jvm.internal.impl.types.checker.q.f78377a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean w(@fg.l ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("猓\u0001"));
        return kotlin.reflect.jvm.internal.impl.builtins.h.e0((h0) iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean x() {
        return this.f76777b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean y(@fg.l ce.i iVar, @fg.l ce.i iVar2) {
        l0.p(iVar, ProtectedSandApp.s("猓\u0001"));
        l0.p(iVar2, ProtectedSandApp.s("猔\u0001"));
        return this.f76778c.a().k().b((h0) iVar, (h0) iVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean z(@fg.l ce.o oVar) {
        l0.p(oVar, ProtectedSandApp.s("猓\u0001"));
        return oVar instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n;
    }

    public /* synthetic */ n(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z4, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, kotlin.reflect.jvm.internal.impl.load.java.b bVar, boolean z5, int i4, w wVar) {
        this(aVar, z4, gVar, bVar, (i4 & 16) != 0 ? false : z5);
    }
}
