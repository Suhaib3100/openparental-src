package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.o0;
import androidx.compose.foundation.text.selection.l0;
import androidx.compose.foundation.text.selection.w;
import androidx.compose.foundation.text.selection.z;
import androidx.compose.ui.layout.u;
import androidx.compose.ui.q;
import i0.f;
import kotlin.Metadata;

/* compiled from: SelectionController.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/selection/l0;", "", "selectableId", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/u;", "layoutCoordinates", "Landroidx/compose/ui/q;", "b", "(Landroidx/compose/foundation/text/selection/l0;JLld/a;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bR(\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0006R(\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/text/modifiers/k$a", "Landroidx/compose/foundation/text/o0;", "Li0/f;", "point", "Lkotlin/k2;", "a", "(J)V", "c", "()V", "startPoint", "b", "delta", "d", "onStop", "onCancel", "J", "f", "()J", "h", "lastPosition", "e", "g", "dragTotalDistance", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements o0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long dragTotalDistance;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<u> f7780c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0 f7781d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f7782e;

        /* JADX WARN: Multi-variable type inference failed */
        a(ld.a<? extends u> aVar, l0 l0Var, long j4) {
            this.f7780c = aVar;
            this.f7781d = l0Var;
            this.f7782e = j4;
            f.Companion companion = i0.f.INSTANCE;
            companion.getClass();
            this.lastPosition = i0.f.f74147c;
            companion.getClass();
            this.dragTotalDistance = i0.f.f74147c;
        }

        @Override // androidx.compose.foundation.text.o0
        public void a(long point) {
        }

        @Override // androidx.compose.foundation.text.o0
        public void b(long startPoint) {
            u invoke = this.f7780c.invoke();
            if (invoke != null) {
                l0 l0Var = this.f7781d;
                if (!invoke.f()) {
                    return;
                }
                l0Var.i(invoke, startPoint, w.INSTANCE.o(), true);
                this.lastPosition = startPoint;
            }
            if (androidx.compose.foundation.text.selection.o0.b(this.f7781d, this.f7782e)) {
                i0.f.INSTANCE.getClass();
                this.dragTotalDistance = i0.f.f74147c;
            }
        }

        @Override // androidx.compose.foundation.text.o0
        public void c() {
        }

        @Override // androidx.compose.foundation.text.o0
        public void d(long delta) {
            u invoke = this.f7780c.invoke();
            if (invoke != null) {
                l0 l0Var = this.f7781d;
                long j4 = this.f7782e;
                if (invoke.f() && androidx.compose.foundation.text.selection.o0.b(l0Var, j4)) {
                    long v4 = i0.f.v(this.dragTotalDistance, delta);
                    this.dragTotalDistance = v4;
                    long v5 = i0.f.v(this.lastPosition, v4);
                    if (l0Var.f(invoke, v5, this.lastPosition, false, w.INSTANCE.l(), true)) {
                        this.lastPosition = v5;
                        i0.f.INSTANCE.getClass();
                        this.dragTotalDistance = i0.f.f74147c;
                    }
                }
            }
        }

        /* renamed from: e, reason: from getter */
        public final long getDragTotalDistance() {
            return this.dragTotalDistance;
        }

        /* renamed from: f, reason: from getter */
        public final long getLastPosition() {
            return this.lastPosition;
        }

        public final void g(long j4) {
            this.dragTotalDistance = j4;
        }

        public final void h(long j4) {
            this.lastPosition = j4;
        }

        @Override // androidx.compose.foundation.text.o0
        public void onCancel() {
            if (androidx.compose.foundation.text.selection.o0.b(this.f7781d, this.f7782e)) {
                this.f7781d.g();
            }
        }

        @Override // androidx.compose.foundation.text.o0
        public void onStop() {
            if (androidx.compose.foundation.text.selection.o0.b(this.f7781d, this.f7782e)) {
                this.f7781d.g();
            }
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/text/modifiers/k$b", "Landroidx/compose/foundation/text/selection/j;", "Li0/f;", "downPosition", "", "e", "(J)Z", "dragPosition", "b", "Landroidx/compose/foundation/text/selection/w;", "adjustment", "c", "(JLandroidx/compose/foundation/text/selection/w;)Z", "d", "Lkotlin/k2;", "a", "()V", "J", "f", "()J", "g", "(J)V", "lastPosition", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements androidx.compose.foundation.text.selection.j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<u> f7784b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0 f7785c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f7786d;

        /* JADX WARN: Multi-variable type inference failed */
        b(ld.a<? extends u> aVar, l0 l0Var, long j4) {
            this.f7784b = aVar;
            this.f7785c = l0Var;
            this.f7786d = j4;
            i0.f.INSTANCE.getClass();
            this.lastPosition = i0.f.f74147c;
        }

        @Override // androidx.compose.foundation.text.selection.j
        public void a() {
            this.f7785c.g();
        }

        @Override // androidx.compose.foundation.text.selection.j
        public boolean b(long dragPosition) {
            u invoke = this.f7784b.invoke();
            if (invoke == null) {
                return true;
            }
            l0 l0Var = this.f7785c;
            long j4 = this.f7786d;
            if (!invoke.f() || !androidx.compose.foundation.text.selection.o0.b(l0Var, j4)) {
                return false;
            }
            if (!l0Var.f(invoke, dragPosition, this.lastPosition, false, w.INSTANCE.m(), false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.j
        public boolean c(long downPosition, @fg.l w adjustment) {
            u invoke = this.f7784b.invoke();
            if (invoke == null) {
                return false;
            }
            l0 l0Var = this.f7785c;
            long j4 = this.f7786d;
            if (!invoke.f()) {
                return false;
            }
            l0Var.i(invoke, downPosition, adjustment, false);
            this.lastPosition = downPosition;
            return androidx.compose.foundation.text.selection.o0.b(l0Var, j4);
        }

        @Override // androidx.compose.foundation.text.selection.j
        public boolean d(long dragPosition, @fg.l w adjustment) {
            u invoke = this.f7784b.invoke();
            if (invoke == null) {
                return true;
            }
            l0 l0Var = this.f7785c;
            long j4 = this.f7786d;
            if (!invoke.f() || !androidx.compose.foundation.text.selection.o0.b(l0Var, j4)) {
                return false;
            }
            if (!l0Var.f(invoke, dragPosition, this.lastPosition, false, adjustment, false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.j
        public boolean e(long downPosition) {
            u invoke = this.f7784b.invoke();
            if (invoke == null) {
                return false;
            }
            l0 l0Var = this.f7785c;
            long j4 = this.f7786d;
            if (!invoke.f()) {
                return false;
            }
            if (l0Var.f(invoke, downPosition, this.lastPosition, false, w.INSTANCE.m(), false)) {
                this.lastPosition = downPosition;
            }
            return androidx.compose.foundation.text.selection.o0.b(l0Var, j4);
        }

        /* renamed from: f, reason: from getter */
        public final long getLastPosition() {
            return this.lastPosition;
        }

        public final void g(long j4) {
            this.lastPosition = j4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q b(l0 l0Var, long j4, ld.a<? extends u> aVar) {
        a aVar2 = new a(aVar, l0Var, j4);
        return z.h(q.INSTANCE, new b(aVar, l0Var, j4), aVar2);
    }
}
