package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;

/* compiled from: AndroidAccessibilityManager.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/e;", "Landroidx/compose/ui/platform/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "originalTimeoutMillis", "", "containsIcons", "containsText", "containsControls", "b", "(JZZZ)J", "Landroid/view/accessibility/AccessibilityManager;", "a", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final a f19811b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f19812c = 8;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f19813d = 1;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f19814e = 2;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f19815f = 4;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AccessibilityManager accessibilityManager;

    /* compiled from: AndroidAccessibilityManager.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/e$a;", "", "<init>", "()V", "", "FlagContentControls", "I", "FlagContentIcons", "FlagContentText", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public e(@fg.l Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.b
    public long b(long originalTimeoutMillis, boolean containsIcons, boolean containsText, boolean containsControls) {
        int i4 = containsIcons;
        if (originalTimeoutMillis >= 2147483647L) {
            return originalTimeoutMillis;
        }
        if (containsText) {
            i4 = (containsIcons ? 1 : 0) | 2;
        }
        if (containsControls) {
            i4 = (i4 == true ? 1 : 0) | 4;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a5 = a1.f19764a.a(this.accessibilityManager, (int) originalTimeoutMillis, i4);
            if (a5 != Integer.MAX_VALUE) {
                return a5;
            }
        } else if (!containsControls || !this.accessibilityManager.isTouchExplorationEnabled()) {
            return originalTimeoutMillis;
        }
        return Long.MAX_VALUE;
    }
}
