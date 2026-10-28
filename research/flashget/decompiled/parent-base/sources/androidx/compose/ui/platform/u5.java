package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import kotlin.Metadata;

/* compiled from: ViewLayerContainer.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/u5;", "Landroidx/compose/ui/platform/q1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/k2;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "dispatchGetDisplayList", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u5 extends q1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20185d = 0;

    public u5(@fg.l Context context) {
        super(context);
    }

    @Override // androidx.compose.ui.platform.q1, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@fg.l Canvas canvas) {
    }

    protected final void dispatchGetDisplayList() {
    }
}
