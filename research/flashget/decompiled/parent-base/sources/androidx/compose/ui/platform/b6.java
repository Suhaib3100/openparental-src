package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

/* compiled from: ViewRootForTest.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/b6;", "Landroidx/compose/ui/node/x1;", "Lkotlin/k2;", "o", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "", "i", "()Z", "isLifecycleInResumedState", "p", "hasPendingMeasureOrLayout", "f0", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.m1
/* loaded from: classes.dex */
public interface b6 extends androidx.compose.ui.node.x1 {

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f19780a;

    /* compiled from: ViewRootForTest.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R6\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/b6$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/b6;", "Lkotlin/k2;", "b", "Lld/l;", "a", "()Lld/l;", "c", "(Lld/l;)V", "onViewCreatedCallback", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.b6$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f19780a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private static ld.l<? super b6, kotlin.k2> onViewCreatedCallback;

        private Companion() {
        }

        @androidx.annotation.m1
        public static /* synthetic */ void b() {
        }

        @fg.m
        public final ld.l<b6, kotlin.k2> a() {
            return onViewCreatedCallback;
        }

        public final void c(@fg.m ld.l<? super b6, kotlin.k2> lVar) {
            onViewCreatedCallback = lVar;
        }
    }

    @fg.l
    View getView();

    boolean i();

    void o();

    boolean p();
}
