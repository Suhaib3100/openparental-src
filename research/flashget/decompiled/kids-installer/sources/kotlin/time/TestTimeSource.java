package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TimeSources.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
/* renamed from: kotlin.time.q, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class TestTimeSource extends AbstractLongTimeSource {

    /* renamed from: d, reason: collision with root package name */
    private long f27211d;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        a();
    }

    private final void g(long j5) {
        throw new IllegalStateException(ProtectedSandApp.s("逸") + this.f27211d + k.h(getF27188b()) + ProtectedSandApp.s("逹") + ((Object) Duration.A0(j5)) + org.apache.commons.io.k.f32026a);
    }

    @Override // kotlin.time.AbstractLongTimeSource
    /* renamed from: f, reason: from getter */
    protected long getF27211d() {
        return this.f27211d;
    }

    public final void h(long j5) {
        long x02 = Duration.x0(j5, getF27188b());
        if (!(((x02 - 1) | 1) == Long.MAX_VALUE)) {
            long j6 = this.f27211d;
            long j7 = j6 + x02;
            if ((x02 ^ j6) >= 0 && (j6 ^ j7) < 0) {
                g(j5);
            }
            this.f27211d = j7;
            return;
        }
        long v5 = Duration.v(j5, 2);
        if ((1 | (Duration.x0(v5, getF27188b()) - 1)) == Long.MAX_VALUE) {
            g(j5);
            return;
        }
        long j8 = this.f27211d;
        try {
            h(v5);
            h(Duration.m0(j5, v5));
        } catch (IllegalStateException e6) {
            this.f27211d = j8;
            throw e6;
        }
    }
}
