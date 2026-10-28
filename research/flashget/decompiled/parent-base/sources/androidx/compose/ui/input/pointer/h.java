package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.e1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: InternalPointerEvent.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/h;", "", "Landroidx/collection/e1;", "Landroidx/compose/ui/input/pointer/b0;", "changes", "Landroidx/compose/ui/input/pointer/d0;", "pointerInputEvent", "<init>", "(Landroidx/collection/e1;Landroidx/compose/ui/input/pointer/d0;)V", "Landroidx/compose/ui/input/pointer/a0;", "pointerId", "", "e", "(J)Z", "a", "Landroidx/collection/e1;", "()Landroidx/collection/e1;", "b", "Landroidx/compose/ui/input/pointer/d0;", "c", "()Landroidx/compose/ui/input/pointer/d0;", "Z", "d", "()Z", "f", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nInternalPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,39:1\n116#2,2:40\n33#2,6:42\n118#2:48\n*S KotlinDebug\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n*L\n33#1:40,2\n33#1:42,6\n33#1:48\n*E\n"})
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final int f18758d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e1<b0> changes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0 pointerInputEvent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean suppressMovementConsumption;

    public h(@fg.l e1<b0> e1Var, @fg.l d0 d0Var) {
        this.changes = e1Var;
        this.pointerInputEvent = d0Var;
    }

    @fg.l
    public final e1<b0> a() {
        return this.changes;
    }

    @fg.l
    public final MotionEvent b() {
        return this.pointerInputEvent.getMotionEvent();
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final d0 getPointerInputEvent() {
        return this.pointerInputEvent;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final boolean e(long pointerId) {
        e0 e0Var;
        List<e0> b5 = this.pointerInputEvent.b();
        int size = b5.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                e0Var = null;
                break;
            }
            e0Var = b5.get(i4);
            if (a0.d(e0Var.p(), pointerId)) {
                break;
            }
            i4++;
        }
        e0 e0Var2 = e0Var;
        if (e0Var2 != null) {
            return e0Var2.q();
        }
        return false;
    }

    public final void f(boolean z4) {
        this.suppressMovementConsumption = z4;
    }
}
