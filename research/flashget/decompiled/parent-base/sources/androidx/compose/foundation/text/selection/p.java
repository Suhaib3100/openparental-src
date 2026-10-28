package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.q;
import kotlin.Metadata;

/* compiled from: SelectionLayout.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010.R\u0011\u00101\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0011\u00103\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b2\u0010#R\u0011\u00106\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b&\u00105¨\u00067"}, d2 = {"Landroidx/compose/foundation/text/selection/p;", "", "", "selectableId", "", "slot", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "<init>", "(JIIIILandroidx/compose/ui/text/n0;)V", "other", "", "n", "(Landroidx/compose/foundation/text/selection/p;)Z", "offset", "Landroidx/compose/foundation/text/selection/q$a;", "a", "(I)Landroidx/compose/foundation/text/selection/q$a;", "start", "end", "Landroidx/compose/foundation/text/selection/q;", "m", "(II)Landroidx/compose/foundation/text/selection/q;", "", "toString", "()Ljava/lang/String;", "J", "h", "()J", "b", "I", "i", "()I", "c", "g", "d", "e", "f", "Landroidx/compose/ui/text/n0;", "k", "()Landroidx/compose/ui/text/n0;", "Landroidx/compose/ui/text/style/i;", "j", "()Landroidx/compose/ui/text/style/i;", "startRunDirection", "endRunDirection", "inputText", "l", "textLength", "Landroidx/compose/foundation/text/selection/e;", "()Landroidx/compose/foundation/text/selection/e;", "rawCrossStatus", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: g, reason: collision with root package name */
    public static final int f8081g = androidx.compose.ui.text.n0.f21188g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int slot;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int rawStartHandleOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int rawEndHandleOffset;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int rawPreviousHandleOffset;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.n0 textLayoutResult;

    public p(long j4, int i4, int i5, int i6, int i7, @fg.l androidx.compose.ui.text.n0 n0Var) {
        this.selectableId = j4;
        this.slot = i4;
        this.rawStartHandleOffset = i5;
        this.rawEndHandleOffset = i6;
        this.rawPreviousHandleOffset = i7;
        this.textLayoutResult = n0Var;
    }

    private final androidx.compose.ui.text.style.i b() {
        androidx.compose.ui.text.style.i b5;
        b5 = f0.b(this.textLayoutResult, this.rawEndHandleOffset);
        return b5;
    }

    private final androidx.compose.ui.text.style.i j() {
        androidx.compose.ui.text.style.i b5;
        b5 = f0.b(this.textLayoutResult, this.rawStartHandleOffset);
        return b5;
    }

    @fg.l
    public final q.a a(int offset) {
        androidx.compose.ui.text.style.i b5;
        b5 = f0.b(this.textLayoutResult, offset);
        return new q.a(b5, offset, this.selectableId);
    }

    @fg.l
    public final String c() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    @fg.l
    public final e d() {
        int i4 = this.rawStartHandleOffset;
        int i5 = this.rawEndHandleOffset;
        return i4 < i5 ? e.NOT_CROSSED : i4 > i5 ? e.CROSSED : e.COLLAPSED;
    }

    /* renamed from: e, reason: from getter */
    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    /* renamed from: f, reason: from getter */
    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    /* renamed from: g, reason: from getter */
    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    /* renamed from: h, reason: from getter */
    public final long getSelectableId() {
        return this.selectableId;
    }

    /* renamed from: i, reason: from getter */
    public final int getSlot() {
        return this.slot;
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final androidx.compose.ui.text.n0 getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public final int l() {
        return c().length();
    }

    @fg.l
    public final q m(int start, int end) {
        return new q(a(start), a(end), start > end);
    }

    public final boolean n(@fg.l p other) {
        return (this.selectableId == other.selectableId && this.rawStartHandleOffset == other.rawStartHandleOffset && this.rawEndHandleOffset == other.rawEndHandleOffset) ? false : true;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.selectableId);
        sb.append(", range=(");
        sb.append(this.rawStartHandleOffset);
        sb.append('-');
        sb.append(j());
        sb.append(',');
        sb.append(this.rawEndHandleOffset);
        sb.append('-');
        sb.append(b());
        sb.append("), prevOffset=");
        return androidx.view.e.a(sb, this.rawPreviousHandleOffset, ')');
    }
}
