package androidx.compose.foundation;

import android.os.Build;
import kotlin.Metadata;

/* compiled from: SystemGestureExclusion.android.kt */
@kd.i(name = "SystemGestureExclusionKt")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a(\u0010\t\u001a\u00020\u00002\u0016\b\b\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0083\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/q;", "b", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Li0/i;", "exclusion", "c", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "a", "(Lld/l;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSystemGestureExclusion.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n1#1,111:1\n66#1:112\n66#1:113\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n42#1:112\n59#1:113\n*E\n"})
/* loaded from: classes.dex */
public final class a3 {
    @androidx.annotation.x0(29)
    private static final androidx.compose.ui.q a(ld.l<? super androidx.compose.ui.layout.u, i0.i> lVar) {
        return new ExcludeFromSystemGestureElement(lVar);
    }

    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar) {
        return Build.VERSION.SDK_INT < 29 ? qVar : qVar.w3(new ExcludeFromSystemGestureElement(null));
    }

    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.layout.u, i0.i> lVar) {
        return Build.VERSION.SDK_INT < 29 ? qVar : qVar.w3(new ExcludeFromSystemGestureElement(lVar));
    }
}
