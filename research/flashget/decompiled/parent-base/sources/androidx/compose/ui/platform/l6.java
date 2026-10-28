package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.t;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* compiled from: Wrapper.android.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a.\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a2\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/h0;", "container", "Landroidx/compose/runtime/z;", "parent", "Landroidx/compose/runtime/r3;", "a", "(Landroidx/compose/ui/node/h0;Landroidx/compose/runtime/z;)Landroidx/compose/runtime/r3;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "Landroidx/compose/runtime/y;", "c", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/z;Lld/p;)Landroidx/compose/runtime/y;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "b", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/z;Lld/p;)Landroidx/compose/runtime/y;", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l6 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final ViewGroup.LayoutParams f19981a = new ViewGroup.LayoutParams(-2, -2);

    @fg.l
    @androidx.annotation.l0
    public static final androidx.compose.runtime.r3 a(@fg.l androidx.compose.ui.node.h0 h0Var, @fg.l androidx.compose.runtime.z zVar) {
        return androidx.compose.runtime.c0.e(new androidx.compose.ui.node.f2(h0Var), zVar);
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    private static final androidx.compose.runtime.y b(AndroidComposeView androidComposeView, androidx.compose.runtime.z zVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
        if (y1.e()) {
            int i4 = t.b.K;
            if (androidComposeView.getTag(i4) == null) {
                androidComposeView.setTag(i4, Collections.newSetFromMap(new WeakHashMap()));
            }
        }
        androidx.compose.runtime.y a5 = androidx.compose.runtime.c0.a(new androidx.compose.ui.node.f2(androidComposeView.getRoot()), zVar);
        int i5 = t.b.L;
        Object tag = androidComposeView.getTag(i5);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, a5);
            androidComposeView.setTag(i5, wrappedComposition);
        }
        wrappedComposition.e(pVar);
        return wrappedComposition;
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final androidx.compose.runtime.y c(@fg.l AbstractComposeView abstractComposeView, @fg.l androidx.compose.runtime.z zVar, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
        s1.f20124a.b();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), zVar.getEffectCoroutineContext());
            abstractComposeView.addView(androidComposeView, f19981a);
        }
        return b(androidComposeView, zVar, pVar);
    }
}
