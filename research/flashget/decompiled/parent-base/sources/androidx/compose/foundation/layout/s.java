package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: BoxWithConstraints.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u000b*\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0013R\u001a\u0010(\u001a\u00020%8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020%8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010'R\u001a\u0010+\u001a\u00020%8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b*\u0010'R\u001a\u0010-\u001a\u00020%8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b,\u0010'\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/foundation/layout/s;", "Landroidx/compose/foundation/layout/r;", "Landroidx/compose/foundation/layout/o;", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/b;", "constraints", "<init>", "(Landroidx/compose/ui/unit/d;JLkotlin/jvm/internal/w;)V", "h", "()Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/q;", "Landroidx/compose/ui/c;", "alignment", "c", "(Landroidx/compose/ui/q;Landroidx/compose/ui/c;)Landroidx/compose/ui/q;", "e", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "i", "()J", "j", "(Landroidx/compose/ui/unit/d;J)Landroidx/compose/foundation/layout/s;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/unit/d;", "b", "J", "Landroidx/compose/ui/unit/h;", "f", "()F", "minWidth", "maxWidth", "g", "minHeight", "d", "maxHeight", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class s implements r, o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d density;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p f5309c;

    public /* synthetic */ s(androidx.compose.ui.unit.d dVar, long j4, kotlin.jvm.internal.w wVar) {
        this(dVar, j4);
    }

    /* renamed from: h, reason: from getter */
    private final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    public static s k(s sVar, androidx.compose.ui.unit.d dVar, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            dVar = sVar.density;
        }
        if ((i4 & 2) != 0) {
            j4 = sVar.constraints;
        }
        sVar.getClass();
        return new s(dVar, j4);
    }

    @Override // androidx.compose.foundation.layout.r
    public float a() {
        androidx.compose.ui.unit.d dVar = this.density;
        if (androidx.compose.ui.unit.b.j(this.constraints)) {
            return dVar.R(androidx.compose.ui.unit.b.p(this.constraints));
        }
        androidx.compose.ui.unit.h.INSTANCE.getClass();
        return androidx.compose.ui.unit.h.f21500e;
    }

    @Override // androidx.compose.foundation.layout.r
    /* renamed from: b, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.o
    @x4
    @fg.l
    public androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.ui.c cVar) {
        return this.f5309c.c(qVar, cVar);
    }

    @Override // androidx.compose.foundation.layout.r
    public float d() {
        androidx.compose.ui.unit.d dVar = this.density;
        if (androidx.compose.ui.unit.b.i(this.constraints)) {
            return dVar.R(androidx.compose.ui.unit.b.o(this.constraints));
        }
        androidx.compose.ui.unit.h.INSTANCE.getClass();
        return androidx.compose.ui.unit.h.f21500e;
    }

    @Override // androidx.compose.foundation.layout.o
    @x4
    @fg.l
    public androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar) {
        return this.f5309c.e(qVar);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return kotlin.jvm.internal.l0.g(this.density, sVar.density) && androidx.compose.ui.unit.b.g(this.constraints, sVar.constraints);
    }

    @Override // androidx.compose.foundation.layout.r
    public float f() {
        return this.density.R(androidx.compose.ui.unit.b.r(this.constraints));
    }

    @Override // androidx.compose.foundation.layout.r
    public float g() {
        return this.density.R(androidx.compose.ui.unit.b.q(this.constraints));
    }

    public int hashCode() {
        return androidx.compose.ui.unit.b.t(this.constraints) + (this.density.hashCode() * 31);
    }

    public final long i() {
        return this.constraints;
    }

    @fg.l
    public final s j(@fg.l androidx.compose.ui.unit.d density, long constraints) {
        return new s(density, constraints);
    }

    @fg.l
    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) androidx.compose.ui.unit.b.w(this.constraints)) + ')';
    }

    private s(androidx.compose.ui.unit.d dVar, long j4) {
        this.density = dVar;
        this.constraints = j4;
        this.f5309c = p.f5235a;
    }
}
