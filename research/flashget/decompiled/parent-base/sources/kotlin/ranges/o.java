package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.o2;

/* compiled from: PrimitiveRanges.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001!B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a¨\u0006\""}, d2 = {"Lkotlin/ranges/o;", "Lkotlin/ranges/m;", "Lkotlin/ranges/g;", "", "Lkotlin/ranges/r;", "start", "endInclusive", "<init>", "(JJ)V", "value", "", "r", "(J)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "s", "()Ljava/lang/Long;", "v", "()V", "endExclusive", "x", "w", "f", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class o extends m implements g<Long>, r<Long> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final o f75491g = new o(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/ranges/o$a;", "", "<init>", "()V", "Lkotlin/ranges/o;", "EMPTY", "Lkotlin/ranges/o;", "a", "()Lkotlin/ranges/o;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.o$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final o a() {
            return o.f75491g;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public o(long j4, long j5) {
        super(j4, j5, 1L);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void v() {
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(Long l4) {
        return r(l4.longValue());
    }

    @Override // kotlin.ranges.m
    public boolean equals(@fg.m Object other) {
        if (other instanceof o) {
            if (!isEmpty() || !((o) other).isEmpty()) {
                o oVar = (o) other;
                if (getFirst() != oVar.getFirst() || getLast() != oVar.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.m
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
    }

    @Override // kotlin.ranges.m, kotlin.ranges.g
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    public boolean r(long value) {
        return getFirst() <= value && value <= getLast();
    }

    @Override // kotlin.ranges.r
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Long i() {
        if (getLast() != Long.MAX_VALUE) {
            return Long.valueOf(getLast() + 1);
        }
        throw new IllegalStateException(ProtectedSandApp.s("日\u0001"));
    }

    @Override // kotlin.ranges.m
    @fg.l
    public String toString() {
        return getFirst() + ProtectedSandApp.s("旦\u0001") + getLast();
    }

    @Override // kotlin.ranges.g
    @fg.l
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Long h() {
        return Long.valueOf(getLast());
    }

    @Override // kotlin.ranges.g
    @fg.l
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Long c() {
        return Long.valueOf(getFirst());
    }
}
