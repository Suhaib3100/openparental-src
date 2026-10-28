package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\nR$\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\f\"\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\f¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/h0;", "Landroidx/compose/material3/g0;", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "<set-?>", "b", "Landroidx/compose/runtime/h2;", "e", "()F", "g", "(F)V", "heightOffsetLimit", "c", "d", "contentOffset", "Landroidx/compose/runtime/h2;", "_heightOffset", "newOffset", "f", "heightOffset", "a", "collapsedFraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@f5
@kotlin.jvm.internal.r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarStateImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,2283:1\n76#2:2284\n109#2,2:2285\n76#2:2287\n109#2,2:2288\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarStateImpl\n*L\n1471#1:2284\n1471#1:2285,2\n1482#1:2287\n1482#1:2288,2\n*E\n"})
/* loaded from: classes.dex */
final class h0 implements g0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 heightOffsetLimit;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 contentOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.h2 _heightOffset;

    public h0(float f4, float f5, float f6) {
        this.heightOffsetLimit = androidx.compose.runtime.b.b(f4);
        this.contentOffset = androidx.compose.runtime.b.b(f6);
        this._heightOffset = androidx.compose.runtime.b.b(f5);
    }

    @Override // androidx.compose.material3.g0
    public float a() {
        if (this.heightOffsetLimit.b() == 0.0f) {
            return 0.0f;
        }
        return this._heightOffset.b() / this.heightOffsetLimit.b();
    }

    @Override // androidx.compose.material3.g0
    public float b() {
        return this._heightOffset.b();
    }

    @Override // androidx.compose.material3.g0
    public float c() {
        return this.contentOffset.b();
    }

    @Override // androidx.compose.material3.g0
    public void d(float f4) {
        this.contentOffset.E(f4);
    }

    @Override // androidx.compose.material3.g0
    public float e() {
        return this.heightOffsetLimit.b();
    }

    @Override // androidx.compose.material3.g0
    public void f(float f4) {
        this._heightOffset.E(kotlin.ranges.s.H(f4, this.heightOffsetLimit.b(), 0.0f));
    }

    @Override // androidx.compose.material3.g0
    public void g(float f4) {
        this.heightOffsetLimit.E(f4);
    }
}
