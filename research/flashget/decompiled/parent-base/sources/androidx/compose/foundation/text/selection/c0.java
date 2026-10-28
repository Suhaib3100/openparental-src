package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: SelectionHandles.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\t\u0010\u0007\" \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Li0/f;", "position", "a", "(J)J", "Landroidx/compose/ui/unit/h;", "F", "c", "()F", "HandleWidth", "b", "HandleHeight", "Landroidx/compose/ui/semantics/y;", "Landroidx/compose/foundation/text/selection/b0;", "Landroidx/compose/ui/semantics/y;", "d", "()Landroidx/compose/ui/semantics/y;", "SelectionHandleInfoKey", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,93:1\n154#2:94\n154#2:95\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n*L\n27#1:94\n28#1:95\n*E\n"})
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f7936a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f7937b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.semantics.y<b0> f7938c = new androidx.compose.ui.semantics.y<>("SelectionHandleInfo", null, 2, null);

    static {
        float f4 = 25;
        f7936a = androidx.compose.ui.unit.h.g(f4);
        f7937b = f4;
    }

    public static final long a(long j4) {
        return i0.g.a(i0.f.p(j4), i0.f.r(j4) - 1.0f);
    }

    public static final float b() {
        return f7937b;
    }

    public static final float c() {
        return f7936a;
    }

    @fg.l
    public static final androidx.compose.ui.semantics.y<b0> d() {
        return f7938c;
    }
}
