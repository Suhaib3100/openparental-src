package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.o2;
import kotlin.time.d;
import kotlin.time.r;
import kotlin.time.s;

/* compiled from: TimeSources.kt */
@o2(markerClass = {l.class})
@c1(version = "1.9")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H$¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0014"}, d2 = {"Lkotlin/time/b;", "Lkotlin/time/s$c;", "Lkotlin/time/h;", "unit", "<init>", "(Lkotlin/time/h;)V", "", "c", "()J", "f", "Lkotlin/time/d;", "a", "()Lkotlin/time/d;", "b", "Lkotlin/time/h;", "d", "()Lkotlin/time/h;", "Lkotlin/b0;", "e", "zero", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class b implements s.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h unit;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b0 zero;

    /* compiled from: TimeSources.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010\u001d\u0082\u0002\u0004\n\u0002\b!¨\u0006!"}, d2 = {"Lkotlin/time/b$a;", "Lkotlin/time/d;", "", "startedAt", "Lkotlin/time/b;", "timeSource", "Lkotlin/time/e;", "offset", "<init>", "(JLkotlin/time/b;JLkotlin/jvm/internal/w;)V", "a", "()J", "duration", "D", "(J)Lkotlin/time/d;", "other", "q0", "(Lkotlin/time/d;)J", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "J", "c", "Lkotlin/time/b;", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    private static final class a implements d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long startedAt;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b timeSource;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final long offset;

        public /* synthetic */ a(long j4, b bVar, long j5, w wVar) {
            this(j4, bVar, j5);
        }

        @Override // kotlin.time.d, kotlin.time.r
        @fg.l
        public d I(long j4) {
            return d.a.d(this, j4);
        }

        @Override // kotlin.time.r
        public long a() {
            return e.h0(m.h(this.timeSource.c(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.r
        public boolean b() {
            return r.a.b(this);
        }

        @Override // kotlin.time.r
        public boolean c() {
            return r.a.a(this);
        }

        @Override // java.lang.Comparable
        public int compareTo(d dVar) {
            return d.a.a(this, dVar);
        }

        @Override // kotlin.time.d
        public boolean equals(@fg.m Object other) {
            if ((other instanceof a) && l0.g(this.timeSource, ((a) other).timeSource)) {
                long q02 = q0((d) other);
                e.INSTANCE.getClass();
                if (e.n(q02, e.f79210d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.time.d
        public int hashCode() {
            return Long.hashCode(this.startedAt) + (e.a0(this.offset) * 37);
        }

        @Override // kotlin.time.d
        public long q0(@fg.l d other) {
            l0.p(other, ProtectedSandApp.s("蔋\u0001"));
            if (other instanceof a) {
                a aVar = (a) other;
                if (l0.g(this.timeSource, aVar.timeSource)) {
                    return e.i0(m.h(this.startedAt, aVar.startedAt, this.timeSource.getUnit()), e.h0(this.offset, aVar.offset));
                }
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("蔌\u0001") + this + ProtectedSandApp.s("蔍\u0001") + other);
        }

        @Override // kotlin.time.d
        public int r3(@fg.l d dVar) {
            return d.a.a(this, dVar);
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("蔎\u0001") + this.startedAt + k.h(this.timeSource.getUnit()) + ProtectedSandApp.s("蔏\u0001") + ((Object) e.w0(this.offset)) + ProtectedSandApp.s("蔐\u0001") + this.timeSource + ')';
        }

        private a(long j4, b bVar, long j5) {
            l0.p(bVar, ProtectedSandApp.s("蔊\u0001"));
            this.startedAt = j4;
            this.timeSource = bVar;
            this.offset = j5;
        }

        @Override // kotlin.time.r
        @fg.l
        public d D(long duration) {
            h unit = this.timeSource.getUnit();
            if (e.e0(duration)) {
                long d5 = m.d(this.startedAt, unit, duration);
                b bVar = this.timeSource;
                e.INSTANCE.getClass();
                return new a(d5, bVar, e.f79210d);
            }
            long z02 = e.z0(duration, unit);
            long i02 = e.i0(e.h0(duration, z02), this.offset);
            long d6 = m.d(this.startedAt, unit, z02);
            long z03 = e.z0(i02, unit);
            long d7 = m.d(d6, unit, z03);
            long h02 = e.h0(i02, z03);
            long P = e.P(h02);
            if (d7 != 0 && P != 0 && (d7 ^ P) < 0) {
                long m02 = g.m0(kotlin.math.b.V(P), unit);
                d7 = m.d(d7, unit, m02);
                h02 = e.h0(h02, m02);
            }
            if ((1 | (d7 - 1)) == Long.MAX_VALUE) {
                e.INSTANCE.getClass();
                h02 = e.f79210d;
            }
            return new a(d7, this.timeSource, h02);
        }

        @Override // kotlin.time.r
        public r I(long j4) {
            return d.a.d(this, j4);
        }
    }

    /* compiled from: TimeSources.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.time.b$b, reason: collision with other inner class name */
    static final class C1214b extends n0 implements ld.a<Long> {
        C1214b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(b.this.f());
        }
    }

    public b(@fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蔑\u0001"));
        this.unit = hVar;
        this.zero = c0.c(new C1214b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long c() {
        return f() - e();
    }

    private final long e() {
        return ((Number) this.zero.getValue()).longValue();
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    protected final h getUnit() {
        return this.unit;
    }

    protected abstract long f();

    @Override // kotlin.time.s
    @fg.l
    public d a() {
        long c5 = c();
        e.INSTANCE.getClass();
        return new a(c5, this, e.f79210d, null);
    }
}
