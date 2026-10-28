package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionMode.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0004H ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014j\u0002\b\u0016j\u0002\b\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/selection/k0;", "", "<init>", "(Ljava/lang/String;I)V", "Li0/i;", "Li0/f;", "offset", "", "containsInclusive-Uv8p0NA", "(Li0/i;J)Z", "containsInclusive", "position", "bounds", "", "compare-3MmeM6k$foundation_release", "(JLi0/i;)I", "compare", "start", "end", "isSelected-2x9bVx0$foundation_release", "(Li0/i;JJ)Z", "isSelected", "Vertical", "Horizontal", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class k0 {
    private static final /* synthetic */ k0[] $VALUES = $values();
    public static final k0 Horizontal;
    public static final k0 Vertical;

    /* compiled from: SelectionMode.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0001\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/selection/k0$a;", "Landroidx/compose/foundation/text/selection/k0;", "Li0/f;", "position", "Li0/i;", "bounds", "", "compare-3MmeM6k$foundation_release", "(JLi0/i;)I", "compare", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class a extends k0 {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // androidx.compose.foundation.text.selection.k0
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo1compare3MmeM6k$foundation_release(long position, @fg.l i0.i bounds) {
            if (i0.d(bounds, position)) {
                return 0;
            }
            if (i0.f.p(position) < bounds.t()) {
                return -1;
            }
            return (i0.f.r(position) >= bounds.getTop() || i0.f.p(position) >= bounds.x()) ? 1 : -1;
        }
    }

    /* compiled from: SelectionMode.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0001\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/selection/k0$b;", "Landroidx/compose/foundation/text/selection/k0;", "Li0/f;", "position", "Li0/i;", "bounds", "", "compare-3MmeM6k$foundation_release", "(JLi0/i;)I", "compare", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class b extends k0 {
        b(String str, int i4) {
            super(str, i4, null);
        }

        @Override // androidx.compose.foundation.text.selection.k0
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo1compare3MmeM6k$foundation_release(long position, @fg.l i0.i bounds) {
            if (i0.d(bounds, position)) {
                return 0;
            }
            if (i0.f.r(position) < bounds.getTop()) {
                return -1;
            }
            return (i0.f.p(position) >= bounds.t() || i0.f.r(position) >= bounds.j()) ? 1 : -1;
        }
    }

    private static final /* synthetic */ k0[] $values() {
        return new k0[]{Vertical, Horizontal};
    }

    static {
        kotlin.jvm.internal.w wVar = null;
        Vertical = new b("Vertical", 0, wVar);
        Horizontal = new a("Horizontal", 1, wVar);
    }

    public /* synthetic */ k0(String str, int i4, kotlin.jvm.internal.w wVar) {
        this(str, i4);
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m0containsInclusiveUv8p0NA(i0.i iVar, long j4) {
        float t4 = iVar.t();
        float x4 = iVar.x();
        float p4 = i0.f.p(j4);
        if (t4 <= p4 && p4 <= x4) {
            float top2 = iVar.getTop();
            float j5 = iVar.j();
            float r4 = i0.f.r(j4);
            if (top2 <= r4 && r4 <= j5) {
                return true;
            }
        }
        return false;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }

    /* renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo1compare3MmeM6k$foundation_release(long position, @fg.l i0.i bounds);

    /* renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m2isSelected2x9bVx0$foundation_release(@fg.l i0.i bounds, long start, long end) {
        if (m0containsInclusiveUv8p0NA(bounds, start) || m0containsInclusiveUv8p0NA(bounds, end)) {
            return true;
        }
        return (mo1compare3MmeM6k$foundation_release(start, bounds) > 0) ^ (mo1compare3MmeM6k$foundation_release(end, bounds) > 0);
    }

    private k0(String str, int i4) {
    }
}
