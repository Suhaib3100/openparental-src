package androidx.compose.foundation;

import android.os.Build;
import kotlin.Metadata;

/* compiled from: PreferKeepClear.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a(\u0010\n\u001a\u00020\u00002\u0016\b\b\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0083\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Li0/i;", "rectProvider", "b", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "rect", "c", "(Lld/l;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPreferKeepClear.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClear_androidKt\n*L\n1#1,112:1\n67#1:113\n67#1:114\n*S KotlinDebug\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClear_androidKt\n*L\n41#1:113\n60#1:114\n*E\n"})
/* loaded from: classes.dex */
public final class r2 {
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar) {
        return Build.VERSION.SDK_INT < 33 ? qVar : qVar.w3(new PreferKeepClearElement(null));
    }

    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.layout.u, i0.i> lVar) {
        return Build.VERSION.SDK_INT < 33 ? qVar : qVar.w3(new PreferKeepClearElement(lVar));
    }

    @androidx.annotation.x0(33)
    private static final androidx.compose.ui.q c(ld.l<? super androidx.compose.ui.layout.u, i0.i> lVar) {
        return new PreferKeepClearElement(lVar);
    }
}
