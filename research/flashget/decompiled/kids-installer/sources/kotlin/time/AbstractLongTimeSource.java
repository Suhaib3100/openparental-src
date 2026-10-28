package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;

/* compiled from: TimeSources.kt */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "zero", "", "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "read", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* renamed from: kotlin.time.b, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public abstract class AbstractLongTimeSource implements TimeSource.c {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final DurationUnit f27188b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Lazy f27189c;

    /* compiled from: TimeSources.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", "offset", "Lkotlin/time/Duration;", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "equals", "", "other", "", "hashCode", "", "minus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    /* renamed from: kotlin.time.b$a */
    private static final class a implements ComparableTimeMark {

        /* renamed from: o, reason: collision with root package name */
        private final long f27190o;

        /* renamed from: p, reason: collision with root package name */
        @d5.d
        private final AbstractLongTimeSource f27191p;

        /* renamed from: q, reason: collision with root package name */
        private final long f27192q;

        public /* synthetic */ a(long j5, AbstractLongTimeSource abstractLongTimeSource, long j6, w wVar) {
            this(j5, abstractLongTimeSource, j6);
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
            if ((other instanceof a) && l0.g(this.f27191p, ((a) other).f27191p)) {
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
            return Duration.m0(m.h(this.f27191p.c(), this.f27190o, this.f27191p.getF27188b()), this.f27192q);
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return Long.hashCode(this.f27190o) + (Duration.f0(this.f27192q) * 37);
        }

        @Override // kotlin.time.ComparableTimeMark
        public long i(@d5.d ComparableTimeMark comparableTimeMark) {
            l0.p(comparableTimeMark, ProtectedSandApp.s("逰"));
            if (comparableTimeMark instanceof a) {
                a aVar = (a) comparableTimeMark;
                if (l0.g(this.f27191p, aVar.f27191p)) {
                    return Duration.n0(m.h(this.f27190o, aVar.f27190o, this.f27191p.getF27188b()), Duration.m0(this.f27192q, aVar.f27192q));
                }
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("週") + this + ProtectedSandApp.s("進") + comparableTimeMark);
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
            return ProtectedSandApp.s("逳") + this.f27190o + k.h(this.f27191p.getF27188b()) + ProtectedSandApp.s("逴") + ((Object) Duration.A0(this.f27192q)) + ProtectedSandApp.s("逵") + this.f27191p + ')';
        }

        private a(long j5, AbstractLongTimeSource abstractLongTimeSource, long j6) {
            l0.p(abstractLongTimeSource, ProtectedSandApp.s("逯"));
            this.f27190o = j5;
            this.f27191p = abstractLongTimeSource;
            this.f27192q = j6;
        }

        @Override // kotlin.time.TimeMark
        public TimeMark c(long j5) {
            return ComparableTimeMark.a.d(this, j5);
        }

        @Override // kotlin.time.TimeMark
        @d5.d
        public ComparableTimeMark d(long j5) {
            int V;
            DurationUnit f27188b = this.f27191p.getF27188b();
            if (Duration.j0(j5)) {
                long d6 = m.d(this.f27190o, f27188b, j5);
                AbstractLongTimeSource abstractLongTimeSource = this.f27191p;
                Duration.f27196p.getClass();
                return new a(d6, abstractLongTimeSource, Duration.f27197q);
            }
            long D0 = Duration.D0(j5, f27188b);
            long n02 = Duration.n0(Duration.m0(j5, D0), this.f27192q);
            long d7 = m.d(this.f27190o, f27188b, D0);
            long D02 = Duration.D0(n02, f27188b);
            long d8 = m.d(d7, f27188b, D02);
            long m02 = Duration.m0(n02, D02);
            long U = Duration.U(m02);
            if (d8 != 0 && U != 0 && (d8 ^ U) < 0) {
                V = kotlin.math.d.V(U);
                long m03 = g.m0(V, f27188b);
                d8 = m.d(d8, f27188b, m03);
                m02 = Duration.m0(m02, m03);
            }
            if ((1 | (d8 - 1)) == Long.MAX_VALUE) {
                Duration.f27196p.getClass();
                m02 = Duration.f27197q;
            }
            return new a(d8, this.f27191p, m02);
        }
    }

    /* compiled from: TimeSources.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.b$b */
    static final class b extends Lambda implements q3.a<Long> {
        b() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long n() {
            return Long.valueOf(AbstractLongTimeSource.this.f());
        }
    }

    public AbstractLongTimeSource(@d5.d DurationUnit durationUnit) {
        Lazy c6;
        l0.p(durationUnit, ProtectedSandApp.s("逶"));
        this.f27188b = durationUnit;
        c6 = d0.c(new b());
        this.f27189c = c6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long c() {
        return f() - e();
    }

    private final long e() {
        return ((Number) this.f27189c.getValue()).longValue();
    }

    @d5.d
    /* renamed from: d, reason: from getter */
    protected final DurationUnit getF27188b() {
        return this.f27188b;
    }

    protected abstract long f();

    @Override // kotlin.time.TimeSource
    @d5.d
    public ComparableTimeMark a() {
        long c6 = c();
        Duration.f27196p.getClass();
        return new a(c6, this, Duration.f27197q, null);
    }
}
