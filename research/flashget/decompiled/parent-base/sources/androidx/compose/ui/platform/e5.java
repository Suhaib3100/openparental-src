package androidx.compose.ui.platform;

import android.graphics.Rect;
import kotlin.Metadata;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/e5;", "", "Landroidx/compose/ui/semantics/p;", "semanticsNode", "Landroid/graphics/Rect;", "adjustedBounds", "<init>", "(Landroidx/compose/ui/semantics/p;Landroid/graphics/Rect;)V", "a", "Landroidx/compose/ui/semantics/p;", "b", "()Landroidx/compose/ui/semantics/p;", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e5 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19829c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.semantics.p semanticsNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Rect adjustedBounds;

    public e5(@fg.l androidx.compose.ui.semantics.p pVar, @fg.l Rect rect) {
        this.semanticsNode = pVar;
        this.adjustedBounds = rect;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.semantics.p getSemanticsNode() {
        return this.semanticsNode;
    }
}
