package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.q;
import i0.f;
import kotlin.Metadata;

/* compiled from: MultiWidgetSelectionDelegate.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010%J\u001d\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001eH\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00101R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00101R\u0018\u00103\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00102R\u0016\u00105\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00104R\u0018\u00107\u001a\u00020\u001e*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u00106\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/foundation/text/selection/l;", "Landroidx/compose/foundation/text/selection/o;", "", "selectableId", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/u;", "coordinatesCallback", "Landroidx/compose/ui/text/n0;", "layoutResultCallback", "<init>", "(JLld/a;Lld/a;)V", "Landroidx/compose/foundation/text/selection/e0;", "builder", "Lkotlin/k2;", "l", "(Landroidx/compose/foundation/text/selection/e0;)V", "Landroidx/compose/foundation/text/selection/q;", "k", "()Landroidx/compose/foundation/text/selection/q;", "selection", "", "isStartHandle", "Li0/f;", "g", "(Landroidx/compose/foundation/text/selection/q;Z)J", "f", "()Landroidx/compose/ui/layout/u;", "Landroidx/compose/ui/text/e;", "b", "()Landroidx/compose/ui/text/e;", "", "offset", "Li0/i;", "e", "(I)Li0/i;", "", "d", "(I)F", "c", "i", "Landroidx/compose/ui/text/t0;", "m", "(I)J", "h", "()I", "a", "J", "j", "()J", "Lld/a;", "Landroidx/compose/ui/text/n0;", "_previousTextLayoutResult", "I", "_previousLastVisibleOffset", "(Landroidx/compose/ui/text/n0;)I", "lastVisibleOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements o {

    /* renamed from: f, reason: collision with root package name */
    public static final int f8050f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<androidx.compose.ui.layout.u> coordinatesCallback;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<androidx.compose.ui.text.n0> layoutResultCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.n0 _previousTextLayoutResult;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int _previousLastVisibleOffset = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public l(long j4, @fg.l ld.a<? extends androidx.compose.ui.layout.u> aVar, @fg.l ld.a<androidx.compose.ui.text.n0> aVar2) {
        this.selectableId = j4;
        this.coordinatesCallback = aVar;
        this.layoutResultCallback = aVar2;
    }

    private final synchronized int a(androidx.compose.ui.text.n0 n0Var) {
        int n4;
        try {
            if (this._previousTextLayoutResult != n0Var) {
                if (n0Var.f() && !n0Var.getMultiParagraph().getDidExceedMaxLines()) {
                    n4 = n0Var.r(androidx.compose.ui.unit.u.j(n0Var.getSize()));
                    int n5 = n0Var.n() - 1;
                    if (n4 > n5) {
                        n4 = n5;
                    }
                    while (n4 >= 0 && n0Var.v(n4) >= ((int) (n0Var.getSize() & 4294967295L))) {
                        n4--;
                    }
                    if (n4 < 0) {
                        n4 = 0;
                    }
                    this._previousLastVisibleOffset = n0Var.o(n4, true);
                    this._previousTextLayoutResult = n0Var;
                }
                n4 = n0Var.n() - 1;
                this._previousLastVisibleOffset = n0Var.o(n4, true);
                this._previousTextLayoutResult = n0Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this._previousLastVisibleOffset;
    }

    @Override // androidx.compose.foundation.text.selection.o
    @fg.l
    public androidx.compose.ui.text.e b() {
        androidx.compose.ui.text.n0 invoke = this.layoutResultCallback.invoke();
        return invoke == null ? new androidx.compose.ui.text.e("", null, null, 6, null) : invoke.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.o
    public float c(int offset) {
        int q4;
        androidx.compose.ui.text.n0 invoke = this.layoutResultCallback.invoke();
        if (invoke != null && (q4 = invoke.q(offset)) < invoke.n()) {
            return invoke.t(q4);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.o
    public float d(int offset) {
        int q4;
        androidx.compose.ui.text.n0 invoke = this.layoutResultCallback.invoke();
        if (invoke != null && (q4 = invoke.q(offset)) < invoke.n()) {
            return invoke.s(q4);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.o
    @fg.l
    public i0.i e(int offset) {
        androidx.compose.ui.text.n0 invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            i0.i.INSTANCE.getClass();
            return i0.i.f74153g;
        }
        int length = invoke.getLayoutInput().getText().length();
        if (length >= 1) {
            return invoke.d(kotlin.ranges.s.I(offset, 0, length - 1));
        }
        i0.i.INSTANCE.getClass();
        return i0.i.f74153g;
    }

    @Override // androidx.compose.foundation.text.selection.o
    @fg.m
    public androidx.compose.ui.layout.u f() {
        androidx.compose.ui.layout.u invoke = this.coordinatesCallback.invoke();
        if (invoke == null || !invoke.f()) {
            return null;
        }
        return invoke;
    }

    @Override // androidx.compose.foundation.text.selection.o
    public long g(@fg.l q selection, boolean isStartHandle) {
        if ((isStartHandle && selection.h().h() != this.selectableId) || (!isStartHandle && selection.f().h() != this.selectableId)) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        if (f() == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        androidx.compose.ui.text.n0 invoke = this.layoutResultCallback.invoke();
        if (invoke != null) {
            return z0.b(invoke, kotlin.ranges.s.I((isStartHandle ? selection.h() : selection.f()).g(), 0, a(invoke)), isStartHandle, selection.g());
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74149e;
    }

    @Override // androidx.compose.foundation.text.selection.o
    public int h() {
        androidx.compose.ui.text.n0 invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return 0;
        }
        return a(invoke);
    }

    @Override // androidx.compose.foundation.text.selection.o
    public float i(int offset) {
        int q4;
        androidx.compose.ui.text.n0 invoke = this.layoutResultCallback.invoke();
        if (invoke == null || (q4 = invoke.q(offset)) >= invoke.n()) {
            return -1.0f;
        }
        float v4 = invoke.v(q4);
        return ((invoke.m(q4) - v4) / 2) + v4;
    }

    @Override // androidx.compose.foundation.text.selection.o
    /* renamed from: j, reason: from getter */
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.o
    @fg.m
    public q k() {
        androidx.compose.ui.text.n0 invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return null;
        }
        int length = invoke.getLayoutInput().getText().length();
        return new q(new q.a(invoke.c(0), 0, this.selectableId), new q.a(invoke.c(Math.max(length - 1, 0)), length, this.selectableId), false);
    }

    @Override // androidx.compose.foundation.text.selection.o
    public void l(@fg.l e0 builder) {
        androidx.compose.ui.text.n0 invoke;
        long u4;
        androidx.compose.ui.layout.u f4 = f();
        if (f4 == null || (invoke = this.layoutResultCallback.invoke()) == null) {
            return;
        }
        androidx.compose.ui.layout.u containerCoordinates = builder.getContainerCoordinates();
        f.Companion companion = i0.f.INSTANCE;
        companion.getClass();
        long E = containerCoordinates.E(f4, i0.f.f74147c);
        long u5 = i0.f.u(builder.getCurrentPosition(), E);
        if (i0.g.f(builder.getPreviousHandlePosition())) {
            companion.getClass();
            u4 = i0.f.f74149e;
        } else {
            u4 = i0.f.u(builder.getPreviousHandlePosition(), E);
        }
        m.a(builder, invoke, u5, u4, this.selectableId);
    }

    @Override // androidx.compose.foundation.text.selection.o
    public long m(int offset) {
        androidx.compose.ui.text.n0 invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            androidx.compose.ui.text.t0.INSTANCE.getClass();
            return androidx.compose.ui.text.t0.f21417c;
        }
        int a5 = a(invoke);
        if (a5 < 1) {
            androidx.compose.ui.text.t0.INSTANCE.getClass();
            return androidx.compose.ui.text.t0.f21417c;
        }
        int q4 = invoke.q(kotlin.ranges.s.I(offset, 0, a5 - 1));
        return androidx.compose.ui.text.u0.b(invoke.u(q4), invoke.o(q4, true));
    }
}
