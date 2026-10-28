package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.o2;

/* compiled from: PrimitiveRanges.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001!B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a¨\u0006\""}, d2 = {"Lkotlin/ranges/c;", "Lkotlin/ranges/a;", "Lkotlin/ranges/g;", "", "Lkotlin/ranges/r;", "start", "endInclusive", "<init>", "(CC)V", "value", "", "r", "(C)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "s", "()Ljava/lang/Character;", "v", "()V", "endExclusive", "x", "w", "f", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c extends a implements g<Character>, r<Character> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final c f75463g = new c(1, 0, 1);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/ranges/c$a;", "", "<init>", "()V", "Lkotlin/ranges/c;", "EMPTY", "Lkotlin/ranges/c;", "a", "()Lkotlin/ranges/c;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final c a() {
            return c.f75463g;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public c(char c5, char c6) {
        super(c5, c6, 1);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void v() {
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(Character ch) {
        return r(ch.charValue());
    }

    @Override // kotlin.ranges.a
    public boolean equals(@fg.m Object other) {
        if (other instanceof c) {
            if (!isEmpty() || !((c) other).isEmpty()) {
                c cVar = (c) other;
                if (getFirst() != cVar.getFirst() || getLast() != cVar.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // kotlin.ranges.a, kotlin.ranges.g
    public boolean isEmpty() {
        return l0.t(getFirst(), getLast()) > 0;
    }

    public boolean r(char value) {
        return l0.t(getFirst(), value) <= 0 && l0.t(value, getLast()) <= 0;
    }

    @Override // kotlin.ranges.r
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Character i() {
        if (getLast() != 65535) {
            return Character.valueOf((char) (getLast() + 1));
        }
        throw new IllegalStateException(ProtectedSandApp.s("旍\u0001"));
    }

    @Override // kotlin.ranges.a
    @fg.l
    public String toString() {
        return getFirst() + ProtectedSandApp.s("旎\u0001") + getLast();
    }

    @Override // kotlin.ranges.g
    @fg.l
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Character h() {
        return Character.valueOf(getLast());
    }

    @Override // kotlin.ranges.g
    @fg.l
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Character c() {
        return Character.valueOf(getFirst());
    }
}
