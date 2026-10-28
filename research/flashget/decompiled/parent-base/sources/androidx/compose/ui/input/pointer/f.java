package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@m1
@androidx.compose.ui.k
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R*\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "", "", "uptimeMillis", "Li0/f;", "position", "<init>", "(JJLkotlin/jvm/internal/w;)V", "originalEventPosition", "(JJJLkotlin/jvm/internal/w;)V", "", "toString", "()Ljava/lang/String;", "a", "J", "c", "()J", "b", "<set-?>", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final int f18745d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long uptimeMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long position;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long originalEventPosition;

    private f(long j4, long j5, long j6) {
        this(j4, j5);
        this.originalEventPosition = j6;
    }

    /* renamed from: a, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: b, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: c, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @fg.l
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) i0.f.y(this.position)) + ')';
    }

    public /* synthetic */ f(long j4, long j5, long j6, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6);
    }

    public /* synthetic */ f(long j4, long j5, kotlin.jvm.internal.w wVar) {
        this(j4, j5);
    }

    private f(long j4, long j5) {
        this.uptimeMillis = j4;
        this.position = j5;
        i0.f.INSTANCE.getClass();
        this.originalEventPosition = i0.f.f74147c;
    }
}
