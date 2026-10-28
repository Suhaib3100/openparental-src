package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.l0;
import kotlin.time.ComparableTimeMark;

/* compiled from: TimeSource.kt */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "WithComparableMarks", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* renamed from: kotlin.time.s, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public interface TimeSource {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final a f27212a = a.f27213a;

    /* compiled from: TimeSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.s$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27213a = new a();

        private a() {
        }
    }

    /* compiled from: TimeSource.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.s$b */
    /* loaded from: classes6.dex */
    public static final class b implements c {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final b f27214b = new b();

        private b() {
        }

        @Override // kotlin.time.TimeSource.c, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark a() {
            return a.l(b());
        }

        public long b() {
            return MonotonicTimeSource.f27209b.e();
        }

        @d5.d
        public String toString() {
            MonotonicTimeSource.f27209b.getClass();
            return ProtectedSandApp.s("遀");
        }

        /* compiled from: TimeSource.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004\u0082\u0002\u0004\n\u0002\b!¨\u0006)"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "compareTo", "", "other", "compareTo-6eNON_k", "(JJ)I", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "(J)Z", "hasPassedNow", "hasPassedNow-impl", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "duration", "minus-LRDsOJo", "(JJ)J", "minus-6eNON_k", "plus", "plus-LRDsOJo", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SinceKotlin(version = "1.9")
        @WasExperimental(markerClass = {ExperimentalTime.class})
        @p3.g
        /* renamed from: kotlin.time.s$b$a */
        public static final class a implements ComparableTimeMark {

            /* renamed from: o, reason: collision with root package name */
            private final long f27215o;

            private /* synthetic */ a(long j5) {
                this.f27215o = j5;
            }

            public static long A(long j5, @d5.d ComparableTimeMark comparableTimeMark) {
                l0.p(comparableTimeMark, ProtectedSandApp.s("逺"));
                if (comparableTimeMark instanceof a) {
                    return x(j5, ((a) comparableTimeMark).f27215o);
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("逻") + ((Object) D(j5)) + ProtectedSandApp.s("逼") + comparableTimeMark);
            }

            public static long C(long j5, long j6) {
                return MonotonicTimeSource.f27209b.b(j5, j6);
            }

            public static String D(long j5) {
                return ProtectedSandApp.s("逽") + j5 + ')';
            }

            public static final /* synthetic */ a l(long j5) {
                return new a(j5);
            }

            public static final int o(long j5, long j6) {
                long x5 = x(j5, j6);
                Duration.f27196p.getClass();
                return Duration.r(x5, Duration.f27197q);
            }

            public static int p(long j5, @d5.d ComparableTimeMark comparableTimeMark) {
                l0.p(comparableTimeMark, ProtectedSandApp.s("逾"));
                return ComparableTimeMark.a.a(new a(j5), comparableTimeMark);
            }

            public static long q(long j5) {
                return j5;
            }

            public static long r(long j5) {
                return MonotonicTimeSource.f27209b.d(j5);
            }

            public static boolean s(long j5, Object obj) {
                return (obj instanceof a) && j5 == ((a) obj).f27215o;
            }

            public static final boolean t(long j5, long j6) {
                return j5 == j6;
            }

            public static boolean u(long j5) {
                return Duration.k0(r(j5));
            }

            public static boolean v(long j5) {
                return !Duration.k0(r(j5));
            }

            public static int w(long j5) {
                return Long.hashCode(j5);
            }

            public static final long x(long j5, long j6) {
                return MonotonicTimeSource.f27209b.c(j5, j6);
            }

            public static long z(long j5, long j6) {
                return MonotonicTimeSource.f27209b.b(j5, Duration.E0(j6));
            }

            public long B(long j5) {
                return C(this.f27215o, j5);
            }

            /* renamed from: E, reason: from getter */
            public final /* synthetic */ long getF27215o() {
                return this.f27215o;
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            public /* synthetic */ ComparableTimeMark c(long j5) {
                return new a(y(j5));
            }

            @Override // java.lang.Comparable
            public int compareTo(ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.a.a(this, comparableTimeMark);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            public /* synthetic */ ComparableTimeMark d(long j5) {
                return new a(B(j5));
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(Object obj) {
                return s(this.f27215o, obj);
            }

            @Override // kotlin.time.TimeMark
            public boolean g() {
                return v(this.f27215o);
            }

            @Override // kotlin.time.TimeMark
            public long h() {
                return r(this.f27215o);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return Long.hashCode(this.f27215o);
            }

            @Override // kotlin.time.ComparableTimeMark
            public long i(@d5.d ComparableTimeMark comparableTimeMark) {
                l0.p(comparableTimeMark, ProtectedSandApp.s("逿"));
                return A(this.f27215o, comparableTimeMark);
            }

            @Override // kotlin.time.TimeMark
            public boolean j() {
                return u(this.f27215o);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int m(@d5.d ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.a.a(this, comparableTimeMark);
            }

            public String toString() {
                return D(this.f27215o);
            }

            public long y(long j5) {
                return z(this.f27215o, j5);
            }

            @Override // kotlin.time.TimeMark
            public /* synthetic */ TimeMark c(long j5) {
                return new a(y(j5));
            }

            @Override // kotlin.time.TimeMark
            public /* synthetic */ TimeMark d(long j5) {
                return new a(B(j5));
            }
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark a() {
            return a.l(b());
        }
    }

    /* compiled from: TimeSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    /* renamed from: kotlin.time.s$c */
    public interface c extends TimeSource {
        @Override // kotlin.time.TimeSource
        @d5.d
        ComparableTimeMark a();
    }

    @d5.d
    TimeMark a();
}
