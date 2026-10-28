package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: RectListNode.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0017H&¢\u0006\u0004\b\u001b\u0010\u001cR0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\tR\u0018\u0010$\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/foundation/u2;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/s;", "Landroidx/compose/ui/node/h;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Li0/i;", "rect", "<init>", "(Lld/l;)V", "Landroid/graphics/Rect;", "newRect", "Lkotlin/k2;", "C7", "(Landroid/graphics/Rect;)V", "layoutCoordinates", "y7", "(Landroidx/compose/ui/layout/u;Li0/i;)Landroid/graphics/Rect;", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "j7", "()V", "Landroidx/compose/runtime/collection/g;", "z7", "()Landroidx/compose/runtime/collection/g;", "rects", "E7", "(Landroidx/compose/runtime/collection/g;)V", "p", "Lld/l;", "A7", "()Lld/l;", "D7", "q", "Landroid/graphics/Rect;", "androidRect", "Landroid/view/View;", "B7", "()Landroid/view/View;", "view", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRectListNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,99:1\n1#2:100\n728#3,2:101\n*S KotlinDebug\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n*L\n69#1:101,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class u2 extends q.d implements androidx.compose.ui.node.s, androidx.compose.ui.node.h {

    /* renamed from: r, reason: collision with root package name */
    public static final int f9103r = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super androidx.compose.ui.layout.u, i0.i> rect;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Rect androidRect;

    public u2(@fg.m ld.l<? super androidx.compose.ui.layout.u, i0.i> lVar) {
        this.rect = lVar;
    }

    private final void C7(Rect newRect) {
        androidx.compose.runtime.collection.g<Rect> z7 = z7();
        Rect rect = this.androidRect;
        if (rect != null) {
            z7.j0(rect);
        }
        if (newRect != null && !newRect.isEmpty()) {
            z7.b(newRect);
        }
        E7(z7);
        this.androidRect = newRect;
    }

    private final Rect y7(androidx.compose.ui.layout.u layoutCoordinates, i0.i rect) {
        androidx.compose.ui.layout.u d5 = androidx.compose.ui.layout.v.d(layoutCoordinates);
        long E = d5.E(layoutCoordinates, rect.E());
        long E2 = d5.E(layoutCoordinates, rect.F());
        long E3 = d5.E(layoutCoordinates, rect.m());
        long E4 = d5.E(layoutCoordinates, rect.n());
        return new Rect(kotlin.math.b.L0(kotlin.comparisons.a.l0(i0.f.p(E), i0.f.p(E2), i0.f.p(E3), i0.f.p(E4))), kotlin.math.b.L0(kotlin.comparisons.a.l0(i0.f.r(E), i0.f.r(E2), i0.f.r(E3), i0.f.r(E4))), kotlin.math.b.L0(kotlin.comparisons.a.Q(i0.f.p(E), i0.f.p(E2), i0.f.p(E3), i0.f.p(E4))), kotlin.math.b.L0(kotlin.comparisons.a.Q(i0.f.r(E), i0.f.r(E2), i0.f.r(E3), i0.f.r(E4))));
    }

    @fg.m
    public ld.l<androidx.compose.ui.layout.u, i0.i> A7() {
        return this.rect;
    }

    @fg.l
    protected final View B7() {
        return (View) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.o0.k());
    }

    public void D7(@fg.m ld.l<? super androidx.compose.ui.layout.u, i0.i> lVar) {
        this.rect = lVar;
    }

    public abstract void E7(@fg.l androidx.compose.runtime.collection.g<Rect> rects);

    @Override // androidx.compose.ui.node.s
    public void W(@fg.l androidx.compose.ui.layout.u coordinates) {
        Rect y7;
        if (A7() == null) {
            i0.i b5 = androidx.compose.ui.layout.v.b(coordinates);
            y7 = new Rect(kotlin.math.b.L0(b5.t()), kotlin.math.b.L0(b5.getTop()), kotlin.math.b.L0(b5.x()), kotlin.math.b.L0(b5.j()));
        } else {
            ld.l<androidx.compose.ui.layout.u, i0.i> A7 = A7();
            kotlin.jvm.internal.l0.m(A7);
            y7 = y7(coordinates, A7.invoke(coordinates));
        }
        C7(y7);
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        C7(null);
    }

    @fg.l
    public abstract androidx.compose.runtime.collection.g<Rect> z7();
}
