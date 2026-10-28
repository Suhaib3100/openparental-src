package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/d;", "", "<init>", "()V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "node", "", "", "data", "Lkotlin/k2;", "a", "(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(26)
/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final d f19804a = new d();

    private d() {
    }

    @androidx.annotation.u
    @androidx.annotation.x0(26)
    public final void a(@fg.l AccessibilityNodeInfo node, @fg.l List<String> data) {
        node.setAvailableExtraData(data);
    }
}
