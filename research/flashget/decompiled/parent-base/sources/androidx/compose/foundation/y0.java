package androidx.compose.foundation;

import android.graphics.Rect;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SystemGestureExclusion.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/y0;", "Landroidx/compose/foundation/u2;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Li0/i;", "rect", "<init>", "(Lld/l;)V", "Landroidx/compose/runtime/collection/g;", "Landroid/graphics/Rect;", "z7", "()Landroidx/compose/runtime/collection/g;", "rects", "Lkotlin/k2;", "E7", "(Landroidx/compose/runtime/collection/g;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(29)
@kotlin.jvm.internal.r1({"SMAP\nSystemGestureExclusion.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,111:1\n1208#2:112\n1187#2,2:113\n138#3:115\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n*L\n103#1:112\n103#1:113,2\n104#1:115\n*E\n"})
/* loaded from: classes.dex */
final class y0 extends u2 {
    public y0(@fg.m ld.l<? super androidx.compose.ui.layout.u, i0.i> lVar) {
        super(lVar);
    }

    @Override // androidx.compose.foundation.u2
    public void E7(@fg.l androidx.compose.runtime.collection.g<Rect> rects) {
        B7().setSystemGestureExclusionRects(rects.l());
    }

    @Override // androidx.compose.foundation.u2
    @fg.l
    public androidx.compose.runtime.collection.g<Rect> z7() {
        List<? extends Rect> systemGestureExclusionRects;
        androidx.compose.runtime.collection.g<Rect> gVar = new androidx.compose.runtime.collection.g<>(new Rect[16], 0);
        systemGestureExclusionRects = B7().getSystemGestureExclusionRects();
        gVar.f(gVar.getSize(), systemGestureExclusionRects);
        return gVar;
    }
}
