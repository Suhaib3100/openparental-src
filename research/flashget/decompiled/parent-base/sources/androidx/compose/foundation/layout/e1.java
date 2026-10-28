package androidx.compose.foundation.layout;

import androidx.compose.runtime.t4;
import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@d0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\rR+\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/layout/e1;", "Landroidx/compose/foundation/layout/n2;", "initialInsets", "<init>", "(Landroidx/compose/foundation/layout/n2;)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "", "d", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;)I", "a", "(Landroidx/compose/ui/unit/d;)I", "b", "c", "<set-?>", "Landroidx/compose/runtime/k2;", "e", "()Landroidx/compose/foundation/layout/n2;", "f", "insets", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@kotlin.jvm.internal.r1({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,748:1\n81#2:749\n107#2,2:750\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n*L\n83#1:749\n83#1:750,2\n*E\n"})
/* loaded from: classes.dex */
public final class e1 implements n2 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f4998c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 insets;

    public e1() {
        this(null, 1, null);
    }

    @Override // androidx.compose.foundation.layout.n2
    public int a(@fg.l androidx.compose.ui.unit.d density) {
        return e().a(density);
    }

    @Override // androidx.compose.foundation.layout.n2
    public int b(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        return e().b(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.n2
    public int c(@fg.l androidx.compose.ui.unit.d density) {
        return e().c(density);
    }

    @Override // androidx.compose.foundation.layout.n2
    public int d(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        return e().d(density, layoutDirection);
    }

    @fg.l
    public final n2 e() {
        return (n2) this.insets.getValue();
    }

    public final void f(@fg.l n2 n2Var) {
        this.insets.setValue(n2Var);
    }

    public e1(@fg.l n2 n2Var) {
        androidx.compose.runtime.k2 g4;
        g4 = t4.g(n2Var, null, 2, null);
        this.insets = g4;
    }

    public e1(n2 n2Var, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? new g0(0, 0, 0, 0) : n2Var);
    }
}
