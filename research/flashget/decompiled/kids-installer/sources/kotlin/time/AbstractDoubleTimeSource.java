package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;

/* compiled from: TimeSources.kt */
@Deprecated(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "markNow", "Lkotlin/time/ComparableTimeMark;", "read", "", "DoubleTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalTime
@SinceKotlin(version = "1.3")
/* renamed from: kotlin.time.a, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public abstract class AbstractDoubleTimeSource implements TimeSource.c {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final DurationUnit f27184b;

    /* compiled from: TimeSources.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractDoubleTimeSource;", "offset", "Lkotlin/time/Duration;", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "equals", "", "other", "", "hashCode", "", "minus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.a$a */
    private static final class a implements ComparableTimeMark {

        /* renamed from: o, reason: collision with root package name */
        private final double f27185o;

        /* renamed from: p, reason: collision with root package name */
        @d5.d
        private final AbstractDoubleTimeSource f27186p;

        /* renamed from: q, reason: collision with root package name */
        private final long f27187q;

        public /* synthetic */ a(double d6, AbstractDoubleTimeSource abstractDoubleTimeSource, long j5, w wVar) {
            this(d6, abstractDoubleTimeSource, j5);
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        @d5.d
        public ComparableTimeMark c(long j5) {
            return ComparableTimeMark.a.d(this, j5);
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.a.a(this, comparableTimeMark);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(@d5.e Object other) {
            if ((other instanceof a) && l0.g(this.f27186p, ((a) other).f27186p)) {
                long i5 = i((ComparableTimeMark) other);
                Duration.f27196p.getClass();
                if (Duration.x(i5, Duration.f27197q)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.time.TimeMark
        public boolean g() {
            return TimeMark.a.b(this);
        }

        @Override // kotlin.time.TimeMark
        public long h() {
            return Duration.m0(g.l0(this.f27186p.c() - this.f27185o, this.f27186p.getF27184b()), this.f27187q);
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return Long.hashCode(Duration.n0(g.l0(this.f27185o, this.f27186p.getF27184b()), this.f27187q));
        }

        @Override // kotlin.time.ComparableTimeMark
        public long i(@d5.d ComparableTimeMark comparableTimeMark) {
            l0.p(comparableTimeMark, ProtectedSandApp.s("逨"));
            if (comparableTimeMark instanceof a) {
                a aVar = (a) comparableTimeMark;
                if (l0.g(this.f27186p, aVar.f27186p)) {
                    if (Duration.x(this.f27187q, aVar.f27187q) && Duration.j0(this.f27187q)) {
                        Duration.f27196p.getClass();
                        return Duration.f27197q;
                    }
                    long m02 = Duration.m0(this.f27187q, aVar.f27187q);
                    long l02 = g.l0(this.f27185o - aVar.f27185o, this.f27186p.getF27184b());
                    if (!Duration.x(l02, Duration.E0(m02))) {
                        return Duration.n0(l02, m02);
                    }
                    Duration.f27196p.getClass();
                    return Duration.f27197q;
                }
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("逩") + this + ProtectedSandApp.s("逪") + comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        public boolean j() {
            return TimeMark.a.a(this);
        }

        @Override // kotlin.time.ComparableTimeMark
        public int m(@d5.d ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.a.a(this, comparableTimeMark);
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("逫") + this.f27185o + k.h(this.f27186p.getF27184b()) + ProtectedSandApp.s("逬") + ((Object) Duration.A0(this.f27187q)) + ProtectedSandApp.s("逭") + this.f27186p + ')';
        }

        private a(double d6, AbstractDoubleTimeSource abstractDoubleTimeSource, long j5) {
            l0.p(abstractDoubleTimeSource, ProtectedSandApp.s("逧"));
            this.f27185o = d6;
            this.f27186p = abstractDoubleTimeSource;
            this.f27187q = j5;
        }

        @Override // kotlin.time.TimeMark
        public TimeMark c(long j5) {
            return ComparableTimeMark.a.d(this, j5);
        }

        @Override // kotlin.time.TimeMark
        @d5.d
        public ComparableTimeMark d(long j5) {
            return new a(this.f27185o, this.f27186p, Duration.n0(this.f27187q, j5));
        }
    }

    public AbstractDoubleTimeSource(@d5.d DurationUnit durationUnit) {
        l0.p(durationUnit, ProtectedSandApp.s("逮"));
        this.f27184b = durationUnit;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    protected final DurationUnit getF27184b() {
        return this.f27184b;
    }

    protected abstract double c();

    @Override // kotlin.time.TimeSource
    @d5.d
    public ComparableTimeMark a() {
        double c6 = c();
        Duration.f27196p.getClass();
        return new a(c6, this, Duration.f27197q, null);
    }
}
