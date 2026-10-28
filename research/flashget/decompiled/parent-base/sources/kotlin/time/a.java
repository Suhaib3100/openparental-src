package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.time.d;
import kotlin.time.r;
import kotlin.time.s;

/* compiled from: TimeSources.kt */
@kotlin.k(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/time/a;", "Lkotlin/time/s$c;", "Lkotlin/time/h;", "unit", "<init>", "(Lkotlin/time/h;)V", "", "c", "()D", "Lkotlin/time/d;", "a", "()Lkotlin/time/d;", "b", "Lkotlin/time/h;", "()Lkotlin/time/h;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@l
@c1(version = "1.3")
/* loaded from: classes7.dex */
public abstract class a implements s.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h unit;

    /* compiled from: TimeSources.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b!¨\u0006!"}, d2 = {"Lkotlin/time/a$a;", "Lkotlin/time/d;", "", "startedAt", "Lkotlin/time/a;", "timeSource", "Lkotlin/time/e;", "offset", "<init>", "(DLkotlin/time/a;JLkotlin/jvm/internal/w;)V", "a", "()J", "duration", "D", "(J)Lkotlin/time/d;", "other", "q0", "(Lkotlin/time/d;)J", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "c", "Lkotlin/time/a;", "d", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    private static final class C1213a implements d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final double startedAt;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final a timeSource;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final long offset;

        public /* synthetic */ C1213a(double d5, a aVar, long j4, w wVar) {
            this(d5, aVar, j4);
        }

        @Override // kotlin.time.d, kotlin.time.r
        @fg.l
        public d I(long j4) {
            return d.a.d(this, j4);
        }

        @Override // kotlin.time.r
        public long a() {
            return e.h0(g.l0(this.timeSource.c() - this.startedAt, this.timeSource.getUnit()), this.offset);
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
            if ((other instanceof C1213a) && l0.g(this.timeSource, ((C1213a) other).timeSource)) {
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
            return Long.hashCode(e.i0(g.l0(this.startedAt, this.timeSource.getUnit()), this.offset));
        }

        @Override // kotlin.time.d
        public long q0(@fg.l d other) {
            l0.p(other, ProtectedSandApp.s("蔃\u0001"));
            if (other instanceof C1213a) {
                C1213a c1213a = (C1213a) other;
                if (l0.g(this.timeSource, c1213a.timeSource)) {
                    if (e.n(this.offset, c1213a.offset) && e.e0(this.offset)) {
                        e.INSTANCE.getClass();
                        return e.f79210d;
                    }
                    long h02 = e.h0(this.offset, c1213a.offset);
                    long l02 = g.l0(this.startedAt - c1213a.startedAt, this.timeSource.getUnit());
                    if (!e.n(l02, e.A0(h02))) {
                        return e.i0(l02, h02);
                    }
                    e.INSTANCE.getClass();
                    return e.f79210d;
                }
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("蔄\u0001") + this + ProtectedSandApp.s("蔅\u0001") + other);
        }

        @Override // kotlin.time.d
        public int r3(@fg.l d dVar) {
            return d.a.a(this, dVar);
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("蔆\u0001") + this.startedAt + k.h(this.timeSource.getUnit()) + ProtectedSandApp.s("蔇\u0001") + ((Object) e.w0(this.offset)) + ProtectedSandApp.s("蔈\u0001") + this.timeSource + ')';
        }

        private C1213a(double d5, a aVar, long j4) {
            l0.p(aVar, ProtectedSandApp.s("蔂\u0001"));
            this.startedAt = d5;
            this.timeSource = aVar;
            this.offset = j4;
        }

        @Override // kotlin.time.r
        @fg.l
        public d D(long duration) {
            return new C1213a(this.startedAt, this.timeSource, e.i0(this.offset, duration));
        }

        @Override // kotlin.time.r
        public r I(long j4) {
            return d.a.d(this, j4);
        }
    }

    public a(@fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蔉\u0001"));
        this.unit = hVar;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    protected final h getUnit() {
        return this.unit;
    }

    protected abstract double c();

    @Override // kotlin.time.s
    @fg.l
    public d a() {
        double c5 = c();
        e.INSTANCE.getClass();
        return new C1213a(c5, this, e.f79210d, null);
    }
}
