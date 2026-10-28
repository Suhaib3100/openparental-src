package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001c\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u001a\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001b¨\u0006/"}, d2 = {"Landroidx/compose/material3/TabIndicatorModifier;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/material3/ha;", "Landroidx/compose/runtime/b5;", "", "Landroidx/compose/material3/ka;", "tabPositionsState", "", "selectedTabIndex", "", "followContentSize", "<init>", "(Landroidx/compose/runtime/b5;IZ)V", "v", "()Landroidx/compose/material3/ha;", "node", "Lkotlin/k2;", "A", "(Landroidx/compose/material3/ha;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Landroidx/compose/runtime/b5;", "o", "()I", "r", "()Z", "s", "(Landroidx/compose/runtime/b5;IZ)Landroidx/compose/material3/TabIndicatorModifier;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/runtime/b5;", "z", "e", "I", "x", "f", "Z", "w", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TabIndicatorModifier extends androidx.compose.ui.node.y0<ha> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f9413g = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.b5<List<ka>> tabPositionsState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int selectedTabIndex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean followContentSize;

    /* JADX WARN: Multi-variable type inference failed */
    public TabIndicatorModifier(@fg.l androidx.compose.runtime.b5<? extends List<ka>> b5Var, int i4, boolean z4) {
        this.tabPositionsState = b5Var;
        this.selectedTabIndex = i4;
        this.followContentSize = z4;
    }

    public static TabIndicatorModifier u(TabIndicatorModifier tabIndicatorModifier, androidx.compose.runtime.b5 b5Var, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            b5Var = tabIndicatorModifier.tabPositionsState;
        }
        if ((i5 & 2) != 0) {
            i4 = tabIndicatorModifier.selectedTabIndex;
        }
        if ((i5 & 4) != 0) {
            z4 = tabIndicatorModifier.followContentSize;
        }
        tabIndicatorModifier.getClass();
        return new TabIndicatorModifier(b5Var, i4, z4);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l ha node) {
        node.D7(this.tabPositionsState);
        node.C7(this.selectedTabIndex);
        node.B7(this.followContentSize);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) other;
        return kotlin.jvm.internal.l0.g(this.tabPositionsState, tabIndicatorModifier.tabPositionsState) && this.selectedTabIndex == tabIndicatorModifier.selectedTabIndex && this.followContentSize == tabIndicatorModifier.followContentSize;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Boolean.hashCode(this.followContentSize) + androidx.compose.foundation.w1.a(this.selectedTabIndex, this.tabPositionsState.hashCode() * 31, 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
    }

    @fg.l
    public final androidx.compose.runtime.b5<List<ka>> n() {
        return this.tabPositionsState;
    }

    /* renamed from: o, reason: from getter */
    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    @fg.l
    public final TabIndicatorModifier s(@fg.l androidx.compose.runtime.b5<? extends List<ka>> tabPositionsState, int selectedTabIndex, boolean followContentSize) {
        return new TabIndicatorModifier(tabPositionsState, selectedTabIndex, followContentSize);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("TabIndicatorModifier(tabPositionsState=");
        sb.append(this.tabPositionsState);
        sb.append(", selectedTabIndex=");
        sb.append(this.selectedTabIndex);
        sb.append(", followContentSize=");
        return androidx.compose.animation.l.a(sb, this.followContentSize, ')');
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public ha i() {
        return new ha(this.tabPositionsState, this.selectedTabIndex, this.followContentSize);
    }

    public final boolean w() {
        return this.followContentSize;
    }

    public final int x() {
        return this.selectedTabIndex;
    }

    @fg.l
    public final androidx.compose.runtime.b5<List<ka>> z() {
        return this.tabPositionsState;
    }
}
