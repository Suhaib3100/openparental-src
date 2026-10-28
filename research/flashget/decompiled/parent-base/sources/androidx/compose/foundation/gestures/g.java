package androidx.compose.foundation.gestures;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidScrollable.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/g;", "Landroidx/compose/foundation/gestures/n0;", "<init>", "()V", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/input/pointer/p;", "event", "Landroidx/compose/ui/unit/u;", "bounds", "Li0/f;", "a", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/input/pointer/p;J)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,36:1\n256#2,3:37\n33#2,4:40\n259#2,2:44\n38#2:46\n261#2:47\n154#3:48\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n33#1:37,3\n33#1:40,4\n33#1:44,2\n33#1:46\n33#1:47\n33#1:48\n*E\n"})
/* loaded from: classes.dex */
final class g implements n0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final g f4027a = new g();

    private g() {
    }

    @Override // androidx.compose.foundation.gestures.n0
    public long a(@fg.l androidx.compose.ui.unit.d dVar, @fg.l androidx.compose.ui.input.pointer.p pVar, long j4) {
        List<androidx.compose.ui.input.pointer.b0> e4 = pVar.e();
        i0.f.INSTANCE.getClass();
        i0.f d5 = i0.f.d(i0.f.f74147c);
        int size = e4.size();
        for (int i4 = 0; i4 < size; i4++) {
            d5 = i0.f.d(i0.f.v(d5.getPackedValue(), e4.get(i4).getScrollDelta()));
        }
        return i0.f.x(d5.getPackedValue(), -dVar.v5(androidx.compose.ui.unit.h.g(64)));
    }
}
