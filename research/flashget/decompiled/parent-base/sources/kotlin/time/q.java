package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.r1;
import kotlin.o2;

/* compiled from: TimeSources.kt */
@o2(markerClass = {l.class})
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\bR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/time/q;", "Lkotlin/time/b;", "<init>", "()V", "Lkotlin/time/e;", "duration", "Lkotlin/k2;", "g", "(J)V", "", "f", "()J", "h", "d", "J", "reading", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c1(version = "1.9")
@r1({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
/* loaded from: classes7.dex */
public final class q extends b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long reading;

    public q() {
        super(h.NANOSECONDS);
        a();
    }

    private final void g(long duration) {
        throw new IllegalStateException(ProtectedSandApp.s("蕙\u0001") + this.reading + k.h(getUnit()) + ProtectedSandApp.s("蕚\u0001") + ((Object) e.w0(duration)) + '.');
    }

    @Override // kotlin.time.b
    /* renamed from: f, reason: from getter */
    protected long getReading() {
        return this.reading;
    }

    public final void h(long duration) {
        long t02 = e.t0(duration, getUnit());
        if (((t02 - 1) | 1) != Long.MAX_VALUE) {
            long j4 = this.reading;
            long j5 = j4 + t02;
            if ((t02 ^ j4) >= 0 && (j4 ^ j5) < 0) {
                g(duration);
            }
            this.reading = j5;
            return;
        }
        long l4 = e.l(duration, 2);
        if ((1 | (e.t0(l4, getUnit()) - 1)) == Long.MAX_VALUE) {
            g(duration);
            return;
        }
        long j6 = this.reading;
        try {
            h(l4);
            h(e.h0(duration, l4));
        } catch (IllegalStateException e4) {
            this.reading = j6;
            throw e4;
        }
    }
}
