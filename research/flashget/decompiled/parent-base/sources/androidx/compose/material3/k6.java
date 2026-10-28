package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;

/* compiled from: TouchExplorationStateProvider.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fR+\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\nR+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/k6;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroidx/compose/runtime/b5;", "", "<init>", "()V", "it", "Lkotlin/k2;", "onAccessibilityStateChanged", "(Z)V", "onTouchExplorationStateChanged", "Landroid/view/accessibility/AccessibilityManager;", "am", "m", "(Landroid/view/accessibility/AccessibilityManager;)V", "y", "<set-?>", "b", "Landroidx/compose/runtime/k2;", "a", "()Z", "q", "accessibilityEnabled", "c", "i", "s", "touchExplorationEnabled", "l", "()Ljava/lang/Boolean;", "value", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/Listener\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,108:1\n81#2:109\n107#2,2:110\n81#2:112\n107#2,2:113\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/Listener\n*L\n81#1:109\n81#1:110,2\n82#1:112\n82#1:113,2\n*E\n"})
/* loaded from: classes.dex */
final class k6 implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, androidx.compose.runtime.b5<Boolean> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 accessibilityEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 touchExplorationEnabled;

    public k6() {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        Boolean bool = Boolean.FALSE;
        g4 = androidx.compose.runtime.t4.g(bool, null, 2, null);
        this.accessibilityEnabled = g4;
        g5 = androidx.compose.runtime.t4.g(bool, null, 2, null);
        this.touchExplorationEnabled = g5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean a() {
        return ((Boolean) this.accessibilityEnabled.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i() {
        return ((Boolean) this.touchExplorationEnabled.getValue()).booleanValue();
    }

    private final void q(boolean z4) {
        this.accessibilityEnabled.setValue(Boolean.valueOf(z4));
    }

    private final void s(boolean z4) {
        this.touchExplorationEnabled.setValue(Boolean.valueOf(z4));
    }

    @Override // androidx.compose.runtime.b5
    @fg.l
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean getValue() {
        return Boolean.valueOf(a() && i());
    }

    public final void m(@fg.l AccessibilityManager am) {
        q(am.isEnabled());
        s(am.isTouchExplorationEnabled());
        am.addTouchExplorationStateChangeListener(this);
        am.addAccessibilityStateChangeListener(this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean it) {
        q(it);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean it) {
        s(it);
    }

    public final void y(@fg.l AccessibilityManager am) {
        am.removeTouchExplorationStateChangeListener(this);
        am.removeAccessibilityStateChangeListener(this);
    }
}
