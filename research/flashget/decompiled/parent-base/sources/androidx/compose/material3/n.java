package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SearchBar.android.kt */
@androidx.compose.runtime.x4
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/n;", "Landroidx/compose/foundation/layout/l1;", "Landroidx/compose/runtime/b5;", "", "animationProgress", "Landroidx/compose/ui/unit/h;", "topPadding", "<init>", "(Landroidx/compose/runtime/b5;Landroidx/compose/runtime/b5;)V", "d", "()F", "a", "Landroidx/compose/ui/unit/w;", "layoutDirection", "b", "(Landroidx/compose/ui/unit/w;)F", "c", "Landroidx/compose/runtime/b5;", "e", "()Landroidx/compose/runtime/b5;", "f", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/AnimatedPaddingValues\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,741:1\n88#2:742\n88#2:743\n154#3:744\n154#3:745\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/AnimatedPaddingValues\n*L\n693#1:742\n694#1:743\n696#1:744\n697#1:745\n*E\n"})
/* loaded from: classes.dex */
final class n implements androidx.compose.foundation.layout.l1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.b5<Float> animationProgress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.b5<androidx.compose.ui.unit.h> topPadding;

    public n(@fg.l androidx.compose.runtime.b5<Float> b5Var, @fg.l androidx.compose.runtime.b5<androidx.compose.ui.unit.h> b5Var2) {
        this.animationProgress = b5Var;
        this.topPadding = b5Var2;
    }

    @Override // androidx.compose.foundation.layout.l1
    /* renamed from: a */
    public float getBottom() {
        return androidx.compose.ui.unit.h.g(this.animationProgress.getValue().floatValue() * l8.n());
    }

    @Override // androidx.compose.foundation.layout.l1
    public float b(@fg.l androidx.compose.ui.unit.w layoutDirection) {
        return androidx.compose.ui.unit.h.g(0);
    }

    @Override // androidx.compose.foundation.layout.l1
    public float c(@fg.l androidx.compose.ui.unit.w layoutDirection) {
        return androidx.compose.ui.unit.h.g(0);
    }

    @Override // androidx.compose.foundation.layout.l1
    /* renamed from: d */
    public float getTop() {
        return this.animationProgress.getValue().floatValue() * this.topPadding.getValue().u();
    }

    @fg.l
    public final androidx.compose.runtime.b5<Float> e() {
        return this.animationProgress;
    }

    @fg.l
    public final androidx.compose.runtime.b5<androidx.compose.ui.unit.h> f() {
        return this.topPadding;
    }
}
