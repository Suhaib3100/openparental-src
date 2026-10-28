package androidx.compose.foundation.text.selection;

import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SelectionLayout.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001\u001dB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0014\u0010,\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010#R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102R\u0014\u00106\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u00102R\u0014\u00107\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u00102R\u0014\u00108\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u00102¨\u00069"}, d2 = {"Landroidx/compose/foundation/text/selection/q0;", "Landroidx/compose/foundation/text/selection/d0;", "", "isStartHandle", "", "startSlot", "endSlot", "Landroidx/compose/foundation/text/selection/q;", "previousSelection", "Landroidx/compose/foundation/text/selection/p;", "info", "<init>", "(ZIILandroidx/compose/foundation/text/selection/q;Landroidx/compose/foundation/text/selection/p;)V", "Lkotlin/Function1;", "Lkotlin/k2;", "block", "k", "(Lld/l;)V", "other", "i", "(Landroidx/compose/foundation/text/selection/d0;)Z", "selection", "", "", "h", "(Landroidx/compose/foundation/text/selection/q;)Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "b", "I", "m", "()I", "c", "e", "d", "Landroidx/compose/foundation/text/selection/q;", "g", "()Landroidx/compose/foundation/text/selection/q;", "Landroidx/compose/foundation/text/selection/p;", "getSize", "size", "Landroidx/compose/foundation/text/selection/e;", "f", "()Landroidx/compose/foundation/text/selection/e;", "crossStatus", "l", "()Landroidx/compose/foundation/text/selection/p;", "startInfo", "j", "endInfo", "currentInfo", "firstInfo", "lastInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class q0 implements d0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f8103g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final long f8104h = 1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isStartHandle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startSlot;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int endSlot;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final q previousSelection;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p info;

    public q0(boolean z4, int i4, int i5, @fg.m q qVar, @fg.l p pVar) {
        this.isStartHandle = z4;
        this.startSlot = i4;
        this.endSlot = i5;
        this.previousSelection = qVar;
        this.info = pVar;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    /* renamed from: a, reason: from getter */
    public boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    /* renamed from: b, reason: from getter */
    public p getInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public p c() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public p d() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    /* renamed from: e, reason: from getter */
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public e f() {
        return this.info.d();
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.m
    /* renamed from: g, reason: from getter */
    public q getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    public int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public Map<Long, q> h(@fg.l q selection) {
        if ((selection.g() && selection.h().g() >= selection.f().g()) || (!selection.g() && selection.h().g() <= selection.f().g())) {
            return kotlin.collections.z0.k(new kotlin.q0(Long.valueOf(this.info.getSelectableId()), selection));
        }
        throw new IllegalStateException(("unexpectedly miss-crossed selection: " + selection).toString());
    }

    @Override // androidx.compose.foundation.text.selection.d0
    public boolean i(@fg.m d0 other) {
        if (this.previousSelection != null && other != null && (other instanceof q0)) {
            q0 q0Var = (q0) other;
            if (this.isStartHandle == q0Var.isStartHandle && !this.info.n(q0Var.info)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public p j() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    public void k(@fg.l ld.l<? super p, k2> block) {
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public p l() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    /* renamed from: m, reason: from getter */
    public int getStartSlot() {
        return this.startSlot;
    }

    @fg.l
    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.isStartHandle + ", crossed=" + this.info.d() + ", info=\n\t" + this.info + ')';
    }
}
