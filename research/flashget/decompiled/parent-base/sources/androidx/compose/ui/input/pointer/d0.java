package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PointerInputEvent.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/d0;", "", "", "uptime", "", "Landroidx/compose/ui/input/pointer/e0;", "pointers", "Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "a", "J", "c", "()J", "b", "Ljava/util/List;", "()Ljava/util/List;", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f18726d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long uptime;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<e0> pointers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final MotionEvent motionEvent;

    public d0(long j4, @fg.l List<e0> list, @fg.l MotionEvent motionEvent) {
        this.uptime = j4;
        this.pointers = list;
        this.motionEvent = motionEvent;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    @fg.l
    public final List<e0> b() {
        return this.pointers;
    }

    /* renamed from: c, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }
}
