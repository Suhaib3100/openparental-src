package m0;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.unit.c0;
import androidx.compose.ui.unit.d0;
import fg.l;
import i0.f;
import kotlin.Metadata;

/* compiled from: VelocityTracker.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0003R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R(\u0010\u001a\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lm0/d;", "", "<init>", "()V", "", "timeMillis", "Li0/f;", "position", "Lkotlin/k2;", "a", "(JJ)V", "Landroidx/compose/ui/unit/c0;", "b", "()J", "maximumVelocity", "c", "(J)J", "f", "Lm0/c;", "Lm0/c;", "xVelocityTracker", "yVelocityTracker", "J", "d", "g", "(J)V", "currentPointerPositionAccumulator", "e", "h", "lastMoveEventTimeStamp", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f81480e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final c xVelocityTracker = new c(false, null, 3, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final c yVelocityTracker = new c(false, null, 3, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long currentPointerPositionAccumulator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long lastMoveEventTimeStamp;

    public d() {
        f.INSTANCE.getClass();
        this.currentPointerPositionAccumulator = f.f74147c;
    }

    public final void a(long timeMillis, long position) {
        this.xVelocityTracker.a(timeMillis, f.p(position));
        this.yVelocityTracker.a(timeMillis, f.r(position));
    }

    public final long b() {
        return c(d0.a(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long c(long maximumVelocity) {
        if (c0.l(maximumVelocity) > 0.0f && c0.n(maximumVelocity) > 0.0f) {
            return d0.a(this.xVelocityTracker.d(c0.l(maximumVelocity)), this.yVelocityTracker.d(c0.n(maximumVelocity)));
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + ((Object) c0.t(maximumVelocity))).toString());
    }

    /* renamed from: d, reason: from getter */
    public final long getCurrentPointerPositionAccumulator() {
        return this.currentPointerPositionAccumulator;
    }

    /* renamed from: e, reason: from getter */
    public final long getLastMoveEventTimeStamp() {
        return this.lastMoveEventTimeStamp;
    }

    public final void f() {
        this.xVelocityTracker.f();
        this.yVelocityTracker.f();
        this.lastMoveEventTimeStamp = 0L;
    }

    public final void g(long j4) {
        this.currentPointerPositionAccumulator = j4;
    }

    public final void h(long j4) {
        this.lastMoveEventTimeStamp = j4;
    }
}
