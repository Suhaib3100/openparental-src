package androidx.compose.foundation.gestures;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/h0;", "Landroidx/compose/ui/modifier/j;", "Landroidx/compose/ui/q$d;", "", "enabled", "<init>", "(Z)V", "p", "Z", "y7", "()Z", "z7", "Landroidx/compose/ui/modifier/i;", "q", "Landroidx/compose/ui/modifier/i;", "modifierLocalMap", "A1", "()Landroidx/compose/ui/modifier/i;", "providedValues", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h0 extends q.d implements androidx.compose.ui.modifier.j {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.modifier.i modifierLocalMap = androidx.compose.ui.modifier.k.c(new kotlin.q0(t0.h(), Boolean.TRUE));

    public h0(boolean z4) {
        this.enabled = z4;
    }

    @Override // androidx.compose.ui.modifier.j
    @fg.l
    /* renamed from: A1 */
    public androidx.compose.ui.modifier.i getProvidedValues() {
        return this.enabled ? this.modifierLocalMap : androidx.compose.ui.modifier.b.f19127b;
    }

    /* renamed from: y7, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void z7(boolean z4) {
        this.enabled = z4;
    }
}
