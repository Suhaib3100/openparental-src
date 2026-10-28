package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

/* compiled from: WindowRecomposer.android.kt */
@androidx.compose.ui.l
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/h6;", "", "Landroid/view/View;", "windowRootView", "Landroidx/compose/runtime/i3;", "a", "(Landroid/view/View;)Landroidx/compose/runtime/i3;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface h6 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f19933a;

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/h6$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/h6;", "b", "Landroidx/compose/ui/platform/h6;", "c", "()Landroidx/compose/ui/platform/h6;", "d", "LifecycleAware", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.h6$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f19933a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final h6 LifecycleAware = new g6();

        private Companion() {
        }

        public static androidx.compose.runtime.i3 a(View view) {
            return WindowRecomposer_androidKt.c(view, null, null, 3, null);
        }

        private static final androidx.compose.runtime.i3 b(View view) {
            return WindowRecomposer_androidKt.c(view, null, null, 3, null);
        }

        public static /* synthetic */ void d() {
        }

        @fg.l
        public final h6 c() {
            return LifecycleAware;
        }
    }

    @fg.l
    androidx.compose.runtime.i3 a(@fg.l View windowRootView);
}
