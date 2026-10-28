package androidx.view;

import android.window.BackEvent;
import androidx.annotation.u;
import androidx.annotation.x0;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: BackEventCompat.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/activity/d;", "", "<init>", "()V", "", "touchX", "touchY", "progress", "", "swipeEdge", "Landroid/window/BackEvent;", "a", "(FFFI)Landroid/window/BackEvent;", "backEvent", "b", "(Landroid/window/BackEvent;)F", "d", "e", "c", "(Landroid/window/BackEvent;)I", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(34)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final d f524a = new d();

    private d() {
    }

    @l
    @u
    public final BackEvent a(float touchX, float touchY, float progress, int swipeEdge) {
        return new BackEvent(touchX, touchY, progress, swipeEdge);
    }

    @u
    public final float b(@l BackEvent backEvent) {
        l0.p(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    @u
    public final int c(@l BackEvent backEvent) {
        l0.p(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    @u
    public final float d(@l BackEvent backEvent) {
        l0.p(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    @u
    public final float e(@l BackEvent backEvent) {
        l0.p(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
