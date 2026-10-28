package androidx.compose.ui.input.pointer;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.m1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MotionEventAdapter.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!R \u0010(\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010/R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/input/pointer/i;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "Lkotlin/k2;", "a", "(Landroid/view/MotionEvent;)V", "j", "", "pointerId", "", "i", "(Landroid/view/MotionEvent;I)Z", "motionEventPointerId", "Landroidx/compose/ui/input/pointer/a0;", "f", "(I)J", "b", "Landroidx/compose/ui/input/pointer/r0;", "positionCalculator", "index", "pressed", "Landroidx/compose/ui/input/pointer/e0;", "d", "(Landroidx/compose/ui/input/pointer/r0;Landroid/view/MotionEvent;IZ)Landroidx/compose/ui/input/pointer/e0;", "Landroidx/compose/ui/input/pointer/d0;", "c", "(Landroid/view/MotionEvent;Landroidx/compose/ui/input/pointer/r0;)Landroidx/compose/ui/input/pointer/d0;", "e", "(I)V", "", "J", "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "g", "()Landroid/util/SparseLongArray;", "h", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "canHover", "", "Ljava/util/List;", "pointers", "I", "previousToolType", "previousSource", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final int f18765g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long nextId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final SparseBooleanArray canHover = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<e0> pointers = new ArrayList();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int previousToolType = -1;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int previousSource = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j4 = this.nextId;
                this.nextId = 1 + j4;
                sparseLongArray.put(pointerId, j4);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j5 = this.nextId;
            this.nextId = 1 + j5;
            sparseLongArray2.put(pointerId2, j5);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.canHover.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.canHover.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.ui.input.pointer.e0 d(androidx.compose.ui.input.pointer.r0 r32, android.view.MotionEvent r33, int r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.i.d(androidx.compose.ui.input.pointer.r0, android.view.MotionEvent, int, boolean):androidx.compose.ui.input.pointer.e0");
    }

    private final long f(int motionEventPointerId) {
        int indexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (indexOfKey >= 0) {
            return this.motionEventToComposePointerIdMap.valueAt(indexOfKey);
        }
        long j4 = this.nextId;
        this.nextId = 1 + j4;
        this.motionEventToComposePointerIdMap.put(motionEventPointerId, j4);
        return j4;
    }

    @m1
    public static /* synthetic */ void h() {
    }

    private final boolean i(MotionEvent motionEvent, int i4) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i5 = 0; i5 < pointerCount; i5++) {
            if (motionEvent.getPointerId(i5) == i4) {
                return true;
            }
        }
        return false;
    }

    private final void j(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.canHover.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.canHover.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int keyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!i(motionEvent, keyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.canHover.delete(keyAt);
                }
            }
        }
    }

    @fg.m
    public final d0 c(@fg.l MotionEvent motionEvent, @fg.l r0 positionCalculator) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.canHover.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z4 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z5 = actionMasked == 8;
        if (z4) {
            this.canHover.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i4 = 0;
        while (i4 < pointerCount) {
            this.pointers.add(d(positionCalculator, motionEvent, i4, (z4 || i4 == actionIndex || (z5 && motionEvent.getButtonState() == 0)) ? false : true));
            i4++;
        }
        j(motionEvent);
        return new d0(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void e(int pointerId) {
        this.canHover.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final SparseLongArray getMotionEventToComposePointerIdMap() {
        return this.motionEventToComposePointerIdMap;
    }
}
