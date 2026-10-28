package androidx.compose.ui.layout;

import kotlin.Metadata;

/* compiled from: Layout.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/layout/h;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/p;", "measurable", "Landroidx/compose/ui/layout/r;", "minMax", "Landroidx/compose/ui/layout/s;", "widthHeight", "<init>", "(Landroidx/compose/ui/layout/p;Landroidx/compose/ui/layout/r;Landroidx/compose/ui/layout/s;)V", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/i1;", "m0", "(J)Landroidx/compose/ui/layout/i1;", "", "height", "k0", "(I)I", "l0", "width", "Z", "t", "b", "Landroidx/compose/ui/layout/p;", "()Landroidx/compose/ui/layout/p;", "c", "Landroidx/compose/ui/layout/r;", "d", "Landroidx/compose/ui/layout/s;", "", "a", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements l0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f19003e = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p measurable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r minMax;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s widthHeight;

    public h(@fg.l p pVar, @fg.l r rVar, @fg.l s sVar) {
        this.measurable = pVar;
        this.minMax = rVar;
        this.widthHeight = sVar;
    }

    @Override // androidx.compose.ui.layout.p
    public int Z(int width) {
        return this.measurable.Z(width);
    }

    @Override // androidx.compose.ui.layout.p
    @fg.m
    public Object a() {
        return this.measurable.a();
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final p getMeasurable() {
        return this.measurable;
    }

    @Override // androidx.compose.ui.layout.p
    public int k0(int height) {
        return this.measurable.k0(height);
    }

    @Override // androidx.compose.ui.layout.p
    public int l0(int height) {
        return this.measurable.l0(height);
    }

    @Override // androidx.compose.ui.layout.l0
    @fg.l
    public i1 m0(long constraints) {
        s sVar = this.widthHeight;
        s sVar2 = s.Width;
        int i4 = a0.f18904a;
        if (sVar == sVar2) {
            int l02 = this.minMax == r.Max ? this.measurable.l0(androidx.compose.ui.unit.b.o(constraints)) : this.measurable.k0(androidx.compose.ui.unit.b.o(constraints));
            if (androidx.compose.ui.unit.b.i(constraints)) {
                i4 = androidx.compose.ui.unit.b.o(constraints);
            }
            return new k(l02, i4);
        }
        int t4 = this.minMax == r.Max ? this.measurable.t(androidx.compose.ui.unit.b.p(constraints)) : this.measurable.Z(androidx.compose.ui.unit.b.p(constraints));
        if (androidx.compose.ui.unit.b.j(constraints)) {
            i4 = androidx.compose.ui.unit.b.p(constraints);
        }
        return new k(i4, t4);
    }

    @Override // androidx.compose.ui.layout.p
    public int t(int width) {
        return this.measurable.t(width);
    }
}
