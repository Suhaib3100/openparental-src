package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: LayoutNodeLayoutDelegate.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a@\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\bH\u0082\b¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/h0;", "", "a", "(Landroidx/compose/ui/node/h0;)Z", "Landroidx/compose/ui/layout/l0;", "T", "Landroidx/compose/runtime/collection/g;", "destination", "Lkotlin/Function1;", "transform", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/node/h0;Landroidx/compose/runtime/collection/g;Lld/l;)V", "", "Ljava/lang/String;", "MeasuredTwiceErrorMessage", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1781:1\n199#2:1782\n476#3,11:1783\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n1699#1:1782\n1699#1:1783,11\n*E\n"})
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f19442a = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final boolean a(@fg.l h0 h0Var) {
        if (h0Var.getLookaheadRoot() != null) {
            h0 B0 = h0Var.B0();
            if ((B0 != null ? B0.getLookaheadRoot() : null) == null || h0Var.getLayoutDelegate().getDetachedFromParentLookaheadPass()) {
                return true;
            }
        }
        return false;
    }

    private static final <T extends androidx.compose.ui.layout.l0> void b(h0 h0Var, androidx.compose.runtime.collection.g<T> gVar, ld.l<? super h0, ? extends T> lVar) {
        androidx.compose.runtime.collection.g<h0> H0 = h0Var.H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            int i4 = 0;
            do {
                h0 h0Var2 = L[i4];
                if (gVar.getSize() <= i4) {
                    gVar.b(lVar.invoke(h0Var2));
                } else {
                    gVar.s0(i4, lVar.invoke(h0Var2));
                }
                i4++;
            } while (i4 < size);
        }
        gVar.p0(h0Var.Y().size(), gVar.getSize());
    }
}
