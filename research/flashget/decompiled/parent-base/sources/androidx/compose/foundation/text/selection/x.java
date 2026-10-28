package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.q;
import kotlin.Metadata;

/* compiled from: SelectionAdjustment.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a#\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\t*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0011\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a#\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!¨\u0006$²\u0006\f\u0010\"\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/d0;", "Landroidx/compose/foundation/text/selection/p;", "info", "Landroidx/compose/foundation/text/selection/q$a;", "previousSelectionAnchor", "l", "(Landroidx/compose/foundation/text/selection/d0;Landroidx/compose/foundation/text/selection/p;Landroidx/compose/foundation/text/selection/q$a;)Landroidx/compose/foundation/text/selection/q$a;", "", "currentRawOffset", "", "isStart", "j", "(Landroidx/compose/foundation/text/selection/p;IZ)Z", "currentLine", "currentOffset", "otherOffset", "crossed", "k", "(Landroidx/compose/foundation/text/selection/p;IIIZZ)Landroidx/compose/foundation/text/selection/q$a;", "layout", "Landroidx/compose/foundation/text/selection/c;", "boundaryFunction", "Landroidx/compose/foundation/text/selection/q;", "e", "(Landroidx/compose/foundation/text/selection/d0;Landroidx/compose/foundation/text/selection/c;)Landroidx/compose/foundation/text/selection/q;", "slot", "f", "(Landroidx/compose/foundation/text/selection/p;ZZILandroidx/compose/foundation/text/selection/c;)Landroidx/compose/foundation/text/selection/q$a;", "h", "(Landroidx/compose/foundation/text/selection/q;Landroidx/compose/foundation/text/selection/d0;)Landroidx/compose/foundation/text/selection/q;", "i", "newOffset", "g", "(Landroidx/compose/foundation/text/selection/q$a;Landroidx/compose/foundation/text/selection/p;I)Landroidx/compose/foundation/text/selection/q$a;", "currentRawLine", "anchorSnappedToWordBoundary", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {

    /* compiled from: SelectionAdjustment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/q$a;", "a", "()Landroidx/compose/foundation/text/selection/q$a;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<q.a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f8175b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8176c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8177d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0 f8178e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.b0<Integer> f8179f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, int i4, int i5, d0 d0Var, kotlin.b0<Integer> b0Var) {
            super(0);
            this.f8175b = pVar;
            this.f8176c = i4;
            this.f8177d = i5;
            this.f8178e = d0Var;
            this.f8179f = b0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q.a invoke() {
            return x.k(this.f8175b, x.m(this.f8179f), this.f8176c, this.f8177d, this.f8178e.getIsStartHandle(), this.f8178e.f() == e.CROSSED);
        }
    }

    /* compiled from: SelectionAdjustment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f8180b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8181c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p pVar, int i4) {
            super(0);
            this.f8180b = pVar;
            this.f8181c = i4;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f8180b.getTextLayoutResult().q(this.f8181c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q e(d0 d0Var, c cVar) {
        boolean z4 = d0Var.f() == e.CROSSED;
        return new q(f(d0Var.l(), z4, true, d0Var.getStartSlot(), cVar), f(d0Var.j(), z4, false, d0Var.getEndSlot(), cVar), z4);
    }

    private static final q.a f(p pVar, boolean z4, boolean z5, int i4, c cVar) {
        int rawStartHandleOffset = z5 ? pVar.getRawStartHandleOffset() : pVar.getRawEndHandleOffset();
        if (i4 != pVar.getSlot()) {
            return pVar.a(rawStartHandleOffset);
        }
        long a5 = cVar.a(pVar, rawStartHandleOffset);
        return pVar.a(z4 ^ z5 ? androidx.compose.ui.text.t0.n(a5) : androidx.compose.ui.text.t0.i(a5));
    }

    private static final q.a g(q.a aVar, p pVar, int i4) {
        return q.a.e(aVar, pVar.getTextLayoutResult().c(i4), i4, 0L, 4, null);
    }

    @fg.l
    public static final q h(@fg.l q qVar, @fg.l d0 d0Var) {
        if (f0.d(qVar, d0Var)) {
            return (d0Var.getSize() > 1 || d0Var.getPreviousSelection() == null || d0Var.c().c().length() == 0) ? qVar : i(qVar, d0Var);
        }
        return qVar;
    }

    private static final q i(q qVar, d0 d0Var) {
        p c5 = d0Var.c();
        String c6 = c5.c();
        int rawStartHandleOffset = c5.getRawStartHandleOffset();
        int length = c6.length();
        if (rawStartHandleOffset == 0) {
            int a5 = androidx.compose.foundation.text.k0.a(c6, 0);
            return d0Var.getIsStartHandle() ? q.e(qVar, g(qVar.h(), c5, a5), null, true, 2, null) : q.e(qVar, null, g(qVar.f(), c5, a5), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int b5 = androidx.compose.foundation.text.k0.b(c6, length);
            return d0Var.getIsStartHandle() ? q.e(qVar, g(qVar.h(), c5, b5), null, false, 2, null) : q.e(qVar, null, g(qVar.f(), c5, b5), true, 1, null);
        }
        q previousSelection = d0Var.getPreviousSelection();
        boolean z4 = previousSelection != null && previousSelection.g();
        int b6 = d0Var.getIsStartHandle() ^ z4 ? androidx.compose.foundation.text.k0.b(c6, rawStartHandleOffset) : androidx.compose.foundation.text.k0.a(c6, rawStartHandleOffset);
        return d0Var.getIsStartHandle() ? q.e(qVar, g(qVar.h(), c5, b6), null, z4, 2, null) : q.e(qVar, null, g(qVar.f(), c5, b6), z4, 1, null);
    }

    private static final boolean j(p pVar, int i4, boolean z4) {
        if (pVar.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i4 == pVar.getRawPreviousHandleOffset()) {
            return false;
        }
        if (z4 ^ (pVar.d() == e.CROSSED)) {
            if (i4 < pVar.getRawPreviousHandleOffset()) {
                return true;
            }
        } else if (i4 > pVar.getRawPreviousHandleOffset()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q.a k(p pVar, int i4, int i5, int i6, boolean z4, boolean z5) {
        long C = pVar.getTextLayoutResult().C(i5);
        int u4 = pVar.getTextLayoutResult().q(androidx.compose.ui.text.t0.n(C)) == i4 ? (int) (C >> 32) : i4 >= pVar.getTextLayoutResult().n() ? pVar.getTextLayoutResult().u(pVar.getTextLayoutResult().n() - 1) : pVar.getTextLayoutResult().u(i4);
        int i7 = (int) (C & 4294967295L);
        if (pVar.getTextLayoutResult().q(i7) != i4) {
            i7 = i4 >= pVar.getTextLayoutResult().n() ? androidx.compose.ui.text.n0.p(pVar.getTextLayoutResult(), pVar.getTextLayoutResult().n() - 1, false, 2, null) : androidx.compose.ui.text.n0.p(pVar.getTextLayoutResult(), i4, false, 2, null);
        }
        if (u4 == i6) {
            return pVar.a(i7);
        }
        if (i7 == i6) {
            return pVar.a(u4);
        }
        if (!(z4 ^ z5) ? i5 >= u4 : i5 > i7) {
            u4 = i7;
        }
        return pVar.a(u4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q.a l(d0 d0Var, p pVar, q.a aVar) {
        int rawStartHandleOffset = d0Var.getIsStartHandle() ? pVar.getRawStartHandleOffset() : pVar.getRawEndHandleOffset();
        if ((d0Var.getIsStartHandle() ? d0Var.getStartSlot() : d0Var.getEndSlot()) != pVar.getSlot()) {
            return pVar.a(rawStartHandleOffset);
        }
        kotlin.f0 f0Var = kotlin.f0.NONE;
        kotlin.b0 b5 = kotlin.c0.b(f0Var, new b(pVar, rawStartHandleOffset));
        kotlin.b0 b6 = kotlin.c0.b(f0Var, new a(pVar, rawStartHandleOffset, d0Var.getIsStartHandle() ? pVar.getRawEndHandleOffset() : pVar.getRawStartHandleOffset(), d0Var, b5));
        if (pVar.getSelectableId() != aVar.h()) {
            return (q.a) b6.getValue();
        }
        int rawPreviousHandleOffset = pVar.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return aVar;
        }
        if (m(b5) != pVar.getTextLayoutResult().q(rawPreviousHandleOffset)) {
            return (q.a) b6.getValue();
        }
        int g4 = aVar.g();
        long C = pVar.getTextLayoutResult().C(g4);
        return !j(pVar, rawStartHandleOffset, d0Var.getIsStartHandle()) ? pVar.a(rawStartHandleOffset) : (g4 == androidx.compose.ui.text.t0.n(C) || g4 == ((int) (C & 4294967295L))) ? (q.a) b6.getValue() : pVar.a(rawStartHandleOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(kotlin.b0<Integer> b0Var) {
        return b0Var.getValue().intValue();
    }

    private static final q.a n(kotlin.b0<q.a> b0Var) {
        return b0Var.getValue();
    }
}
