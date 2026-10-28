package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import h4.t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.v1;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes5.dex */
final class n extends a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a f24900a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24901b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24902c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.b f24903d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24904e;

    public /* synthetic */ n(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z5, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, kotlin.reflect.jvm.internal.impl.load.java.b bVar, boolean z6, int i5, w wVar) {
        this(aVar, z5, gVar, bVar, (i5 & 16) != 0 ? false : z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean A(@d5.d h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("䭇"));
        return ((h0) iVar).X0() instanceof g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @d5.d
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.load.java.d h() {
        return this.f24902c.a().a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @d5.e
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public h0 p(@d5.d h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("䭈"));
        return v1.a((h0) iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean r(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䭉"));
        return ((cVar instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.g) && ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.g) cVar).j()) || ((cVar instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e) && !o() && (((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e) cVar).l() || this.f24903d == kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_PARAMETER_BOUNDS));
    }

    @d5.d
    public t G() {
        return kotlin.reflect.jvm.internal.impl.types.checker.q.f26369a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @d5.d
    public Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i(@d5.d h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("䭊"));
        return ((h0) iVar).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @d5.d
    public Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> k() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.f24900a;
        return (aVar == null || (annotations = aVar.getAnnotations()) == null) ? EmptyList.f23167o : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.load.java.b l() {
        return this.f24903d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @d5.e
    public y m() {
        return this.f24902c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean n() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.f24900a;
        return (aVar instanceof j1) && ((j1) aVar).s0() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean o() {
        return this.f24902c.a().q().c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @d5.e
    public kotlin.reflect.jvm.internal.impl.name.d s(@d5.d h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("䭋"));
        kotlin.reflect.jvm.internal.impl.descriptors.e f6 = t1.f((h0) iVar);
        if (f6 != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.e.m(f6);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean u() {
        return this.f24904e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public h4.r v() {
        return kotlin.reflect.jvm.internal.impl.types.checker.q.f26369a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean w(@d5.d h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("䭌"));
        return kotlin.reflect.jvm.internal.impl.builtins.h.e0((h0) iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean x() {
        return this.f24901b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean y(@d5.d h4.i iVar, @d5.d h4.i iVar2) {
        l0.p(iVar, ProtectedSandApp.s("䭍"));
        l0.p(iVar2, ProtectedSandApp.s("䭎"));
        return this.f24902c.a().k().b((h0) iVar, (h0) iVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public boolean z(@d5.d h4.p pVar) {
        l0.p(pVar, ProtectedSandApp.s("䭏"));
        return pVar instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n;
    }

    public n(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.load.java.b bVar, boolean z6) {
        l0.p(gVar, ProtectedSandApp.s("䭅"));
        l0.p(bVar, ProtectedSandApp.s("䭆"));
        this.f24900a = aVar;
        this.f24901b = z5;
        this.f24902c = gVar;
        this.f24903d = bVar;
        this.f24904e = z6;
    }
}
