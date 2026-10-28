package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.o2;
import kotlin.time.d;

/* compiled from: TimeSource.kt */
@o2(markerClass = {l.class})
@c1(version = "1.9")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0005\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/time/s;", "", "Lkotlin/time/r;", "a", "()Lkotlin/time/r;", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f79226a;

    /* compiled from: TimeSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/time/s$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.s$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f79226a = new Companion();

        private Companion() {
        }
    }

    /* compiled from: TimeSource.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lkotlin/time/s$b;", "Lkotlin/time/s$c;", "<init>", "()V", "Lkotlin/time/s$b$a;", "b", "()J", "", "toString", "()Ljava/lang/String;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final b f79227b = new b();

        private b() {
        }

        @Override // kotlin.time.s.c, kotlin.time.s
        public d a() {
            return a.d(p.f79222b.e());
        }

        public long b() {
            return p.f79222b.e();
        }

        @fg.l
        public String toString() {
            p.f79222b.getClass();
            return ProtectedSandApp.s("蕟\u0001");
        }

        /* compiled from: TimeSource.kt */
        @o2(markerClass = {l.class})
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006\""}, d2 = {"Lkotlin/time/s$b$a;", "Lkotlin/time/d;", "", "Lkotlin/time/ValueTimeMarkReading;", "reading", "g", "(J)J", "Lkotlin/time/e;", "h", "duration", "s", "(JJ)J", "p", "", "l", "(J)Z", "k", "other", "q", "(JLkotlin/time/d;)J", "n", "", "e", "(JJ)I", "", "t", "(J)Ljava/lang/String;", "m", "(J)I", "", "i", "(JLjava/lang/Object;)Z", "b", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @kd.g
        @c1(version = "1.9")
        public static final class a implements d {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final long reading;

            private /* synthetic */ a(long j4) {
                this.reading = j4;
            }

            public static final /* synthetic */ a d(long j4) {
                return new a(j4);
            }

            public static final int e(long j4, long j5) {
                long n4 = n(j4, j5);
                e.INSTANCE.getClass();
                return e.h(n4, e.f79210d);
            }

            public static int f(long j4, @fg.l d dVar) {
                l0.p(dVar, ProtectedSandApp.s("蕛\u0001"));
                return d.a.a(new a(j4), dVar);
            }

            public static long g(long j4) {
                return j4;
            }

            public static long h(long j4) {
                return p.f79222b.d(j4);
            }

            public static boolean i(long j4, Object obj) {
                return (obj instanceof a) && j4 == ((a) obj).reading;
            }

            public static final boolean j(long j4, long j5) {
                return j4 == j5;
            }

            public static boolean k(long j4) {
                return e.f0(p.f79222b.d(j4));
            }

            public static boolean l(long j4) {
                return !e.f0(p.f79222b.d(j4));
            }

            public static int m(long j4) {
                return Long.hashCode(j4);
            }

            public static final long n(long j4, long j5) {
                p.f79222b.getClass();
                return m.h(j4, j5, h.NANOSECONDS);
            }

            public static long p(long j4, long j5) {
                p pVar = p.f79222b;
                long A0 = e.A0(j5);
                pVar.getClass();
                return m.d(j4, h.NANOSECONDS, A0);
            }

            public static long q(long j4, @fg.l d dVar) {
                l0.p(dVar, ProtectedSandApp.s("蕛\u0001"));
                if (dVar instanceof a) {
                    return n(j4, ((a) dVar).reading);
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("蕜\u0001") + ((Object) t(j4)) + ProtectedSandApp.s("蕝\u0001") + dVar);
            }

            public static long s(long j4, long j5) {
                p.f79222b.getClass();
                return m.d(j4, h.NANOSECONDS, j5);
            }

            public static String t(long j4) {
                return ProtectedSandApp.s("蕞\u0001") + j4 + ')';
            }

            @Override // kotlin.time.d, kotlin.time.r
            public d D(long j4) {
                return new a(s(this.reading, j4));
            }

            @Override // kotlin.time.d, kotlin.time.r
            public d I(long j4) {
                return new a(p(this.reading, j4));
            }

            @Override // kotlin.time.r
            public long a() {
                return p.f79222b.d(this.reading);
            }

            @Override // kotlin.time.r
            public boolean b() {
                return l(this.reading);
            }

            @Override // kotlin.time.r
            public boolean c() {
                return k(this.reading);
            }

            @Override // java.lang.Comparable
            public int compareTo(d dVar) {
                return d.a.a(this, dVar);
            }

            @Override // kotlin.time.d
            public boolean equals(Object obj) {
                return i(this.reading, obj);
            }

            @Override // kotlin.time.d
            public int hashCode() {
                return Long.hashCode(this.reading);
            }

            public long o(long j4) {
                return p(this.reading, j4);
            }

            @Override // kotlin.time.d
            public long q0(@fg.l d dVar) {
                l0.p(dVar, ProtectedSandApp.s("蕛\u0001"));
                return q(this.reading, dVar);
            }

            public long r(long j4) {
                return s(this.reading, j4);
            }

            @Override // kotlin.time.d
            public int r3(@fg.l d dVar) {
                return d.a.a(this, dVar);
            }

            public String toString() {
                return t(this.reading);
            }

            /* renamed from: u, reason: from getter */
            public final /* synthetic */ long getReading() {
                return this.reading;
            }

            @Override // kotlin.time.r
            public r D(long j4) {
                return new a(s(this.reading, j4));
            }

            @Override // kotlin.time.r
            public r I(long j4) {
                return new a(p(this.reading, j4));
            }
        }

        @Override // kotlin.time.s
        public r a() {
            return a.d(p.f79222b.e());
        }
    }

    /* compiled from: TimeSource.kt */
    @o2(markerClass = {l.class})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/time/s$c;", "Lkotlin/time/s;", "Lkotlin/time/d;", "a", "()Lkotlin/time/d;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @c1(version = "1.9")
    public interface c extends s {
        @Override // kotlin.time.s
        @fg.l
        d a();
    }

    @fg.l
    r a();
}
