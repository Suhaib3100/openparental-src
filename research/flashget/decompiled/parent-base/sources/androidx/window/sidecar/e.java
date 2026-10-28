package androidx.window.sidecar;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowMetrics;
import androidx.annotation.x0;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ActivityCompatHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/window/layout/e;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "a", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "b", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@x0(30)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final e f35806a = new e();

    private e() {
    }

    @l
    public final Rect a(@l Activity activity) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        l0.p(activity, "activity");
        currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        l0.o(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    @l
    public final Rect b(@l Activity activity) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        l0.p(activity, "activity");
        maximumWindowMetrics = activity.getWindowManager().getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        l0.o(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
