package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: PointerInteropUtils.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/p;", "Li0/f;", "offset", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lkotlin/k2;", "block", "d", "(Landroidx/compose/ui/input/pointer/p;JLld/l;)V", "c", "", "nowMillis", "a", "(JLld/l;)V", "", "cancel", "e", "(Landroidx/compose/ui/input/pointer/p;JLld/l;Z)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o0 {
    public static final void a(long j4, @fg.l ld.l<? super MotionEvent, k2> lVar) {
        MotionEvent obtain = MotionEvent.obtain(j4, j4, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        lVar.invoke(obtain);
        obtain.recycle();
    }

    public static /* synthetic */ void b(long j4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = SystemClock.uptimeMillis();
        }
        a(j4, lVar);
    }

    public static final void c(@fg.l p pVar, long j4, @fg.l ld.l<? super MotionEvent, k2> lVar) {
        e(pVar, j4, lVar, true);
    }

    public static final void d(@fg.l p pVar, long j4, @fg.l ld.l<? super MotionEvent, k2> lVar) {
        e(pVar, j4, lVar, false);
    }

    private static final void e(p pVar, long j4, ld.l<? super MotionEvent, k2> lVar, boolean z4) {
        MotionEvent h4 = pVar.h();
        if (h4 == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = h4.getAction();
        if (z4) {
            h4.setAction(3);
        }
        h4.offsetLocation(-i0.f.p(j4), -i0.f.r(j4));
        lVar.invoke(h4);
        h4.offsetLocation(i0.f.p(j4), i0.f.r(j4));
        h4.setAction(action);
    }
}
