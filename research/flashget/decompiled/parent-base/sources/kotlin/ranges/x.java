package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.o2;
import kotlin.w1;

/* compiled from: UIntRange.kt */
@o2(markerClass = {kotlin.t.class})
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001 B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u00020\u00038VX\u0097\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015\u0082\u0002\u0004\n\u0002\b!¨\u0006!"}, d2 = {"Lkotlin/ranges/x;", "Lkotlin/ranges/v;", "Lkotlin/ranges/g;", "Lkotlin/w1;", "Lkotlin/ranges/r;", "start", "endInclusive", "<init>", "(IILkotlin/jvm/internal/w;)V", "value", "", "q", "(I)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "r", "s", "()V", "endExclusive", "w", "v", "f", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c1(version = "1.5")
/* loaded from: classes7.dex */
public final class x extends v implements g<w1>, r<w1> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final x f75505g = new x(-1, 0);

    /* compiled from: UIntRange.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/ranges/x$a;", "", "<init>", "()V", "Lkotlin/ranges/x;", "EMPTY", "Lkotlin/ranges/x;", "a", "()Lkotlin/ranges/x;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.x$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final x a() {
            return x.f75505g;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ x(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this(i4, i5);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void s() {
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(w1 w1Var) {
        return q(w1Var.getData());
    }

    @Override // kotlin.ranges.g
    public w1 c() {
        return w1.b(getFirst());
    }

    @Override // kotlin.ranges.v
    public boolean equals(@fg.m Object other) {
        if (other instanceof x) {
            if (!isEmpty() || !((x) other).isEmpty()) {
                x xVar = (x) other;
                if (getFirst() != xVar.getFirst() || getLast() != xVar.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    public w1 h() {
        return w1.b(getLast());
    }

    @Override // kotlin.ranges.v
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // kotlin.ranges.r
    public /* bridge */ /* synthetic */ w1 i() {
        return w1.b(r());
    }

    @Override // kotlin.ranges.v, kotlin.ranges.g
    public boolean isEmpty() {
        int compare;
        compare = Integer.compare(getFirst() ^ Integer.MIN_VALUE, getLast() ^ Integer.MIN_VALUE);
        return compare > 0;
    }

    public boolean q(int value) {
        int compare;
        int compare2;
        compare = Integer.compare(getFirst() ^ Integer.MIN_VALUE, value ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(value ^ Integer.MIN_VALUE, getLast() ^ Integer.MIN_VALUE);
            if (compare2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public int r() {
        if (getLast() != -1) {
            return w1.h(getLast() + 1);
        }
        throw new IllegalStateException(ProtectedSandApp.s("旾\u0001"));
    }

    @Override // kotlin.ranges.v
    @fg.l
    public String toString() {
        return ((Object) w1.h0(getFirst())) + ProtectedSandApp.s("旿\u0001") + ((Object) w1.h0(getLast()));
    }

    public int v() {
        return getLast();
    }

    public int w() {
        return getFirst();
    }

    private x(int i4, int i5) {
        super(i4, i5, 1, null);
    }
}
