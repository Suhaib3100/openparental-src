package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/material3/ClockDialModifier;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/material3/y2;", "Landroidx/compose/material3/db;", "state", "", "autoSwitchToMinute", "<init>", "(Landroidx/compose/material3/db;Z)V", "n", "()Landroidx/compose/material3/db;", "o", "()Z", "u", "()Landroidx/compose/material3/y2;", "node", "Lkotlin/k2;", "v", "(Landroidx/compose/material3/y2;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "r", "(Landroidx/compose/material3/db;Z)Landroidx/compose/material3/ClockDialModifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/material3/db;", "e", "Z", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClockDialModifier extends androidx.compose.ui.node.y0<y2> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f9404f = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final db state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean autoSwitchToMinute;

    public ClockDialModifier(@fg.l db dbVar, boolean z4) {
        this.state = dbVar;
        this.autoSwitchToMinute = z4;
    }

    /* renamed from: n, reason: from getter */
    private final db getState() {
        return this.state;
    }

    /* renamed from: o, reason: from getter */
    private final boolean getAutoSwitchToMinute() {
        return this.autoSwitchToMinute;
    }

    public static ClockDialModifier s(ClockDialModifier clockDialModifier, db dbVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            dbVar = clockDialModifier.state;
        }
        if ((i4 & 2) != 0) {
            z4 = clockDialModifier.autoSwitchToMinute;
        }
        clockDialModifier.getClass();
        return new ClockDialModifier(dbVar, z4);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) other;
        return kotlin.jvm.internal.l0.g(this.state, clockDialModifier.state) && this.autoSwitchToMinute == clockDialModifier.autoSwitchToMinute;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Boolean.hashCode(this.autoSwitchToMinute) + (this.state.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
    }

    @fg.l
    public final ClockDialModifier r(@fg.l db state, boolean autoSwitchToMinute) {
        return new ClockDialModifier(state, autoSwitchToMinute);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("ClockDialModifier(state=");
        sb.append(this.state);
        sb.append(", autoSwitchToMinute=");
        return androidx.compose.animation.l.a(sb, this.autoSwitchToMinute, ')');
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public y2 i() {
        return new y2(this.state, this.autoSwitchToMinute);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l y2 node) {
        node.R7(this.state, this.autoSwitchToMinute);
    }
}
