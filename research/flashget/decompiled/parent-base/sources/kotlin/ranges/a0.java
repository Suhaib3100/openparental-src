package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.c1;
import kotlin.n2;
import kotlin.o2;

/* compiled from: ULongRange.kt */
@o2(markerClass = {kotlin.t.class})
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001!B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\u00020\u00038VX\u0097\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a\u0082\u0002\u0004\n\u0002\b!¨\u0006\""}, d2 = {"Lkotlin/ranges/a0;", "Lkotlin/ranges/y;", "Lkotlin/ranges/g;", "Lkotlin/a2;", "Lkotlin/ranges/r;", "start", "endInclusive", "<init>", "(JJLkotlin/jvm/internal/w;)V", "value", "", "q", "(J)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "r", "()J", "s", "()V", "endExclusive", "w", "v", "f", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c1(version = "1.5")
/* loaded from: classes7.dex */
public final class a0 extends y implements g<a2>, r<a2> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final a0 f75457g = new a0(-1, 0);

    /* compiled from: ULongRange.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/ranges/a0$a;", "", "<init>", "()V", "Lkotlin/ranges/a0;", "EMPTY", "Lkotlin/ranges/a0;", "a", "()Lkotlin/ranges/a0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.a0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final a0 a() {
            return a0.f75457g;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ a0(long j4, long j5, kotlin.jvm.internal.w wVar) {
        this(j4, j5);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void s() {
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(a2 a2Var) {
        return q(a2Var.getData());
    }

    @Override // kotlin.ranges.g
    public a2 c() {
        return a2.b(getFirst());
    }

    @Override // kotlin.ranges.y
    public boolean equals(@fg.m Object other) {
        if (other instanceof a0) {
            if (!isEmpty() || !((a0) other).isEmpty()) {
                a0 a0Var = (a0) other;
                if (getFirst() != a0Var.getFirst() || getLast() != a0Var.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    public a2 h() {
        return a2.b(getLast());
    }

    @Override // kotlin.ranges.y
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) (getFirst() ^ a2.h(getFirst() >>> 32))) * 31) + ((int) (getLast() ^ (getLast() >>> 32)));
    }

    @Override // kotlin.ranges.r
    public /* bridge */ /* synthetic */ a2 i() {
        return a2.b(r());
    }

    @Override // kotlin.ranges.y, kotlin.ranges.g
    public boolean isEmpty() {
        int compare;
        compare = Long.compare(getFirst() ^ Long.MIN_VALUE, getLast() ^ Long.MIN_VALUE);
        return compare > 0;
    }

    public boolean q(long value) {
        int compare;
        int compare2;
        compare = Long.compare(getFirst() ^ Long.MIN_VALUE, value ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(value ^ Long.MIN_VALUE, getLast() ^ Long.MIN_VALUE);
            if (compare2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public long r() {
        if (getLast() == -1) {
            throw new IllegalStateException(ProtectedSandApp.s("施\u0001"));
        }
        return a2.h(1 & 4294967295L) + getLast();
    }

    @Override // kotlin.ranges.y
    @fg.l
    public String toString() {
        return ((Object) a2.h0(getFirst())) + ProtectedSandApp.s("斾\u0001") + ((Object) n2.l(getLast(), 10));
    }

    public long v() {
        return getLast();
    }

    public long w() {
        return getFirst();
    }

    private a0(long j4, long j5) {
        super(j4, j5, 1L, null);
    }
}
