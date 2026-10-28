package androidx.compose.material3;

import android.R;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.material3.a7;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.t;
import androidx.view.C1442q1;
import androidx.view.C1446s1;
import androidx.view.C1463g;
import com.google.android.material.badge.BadgeDrawable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0010J\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0014¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0010J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00072\u0006\u0010%\u001a\u00020(¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;RA\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\u00162\u0011\u0010=\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010G\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u001e8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b/\u0010FR\u0014\u0010J\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Landroidx/compose/material3/a7;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroidx/compose/ui/platform/a6;", "Landroidx/compose/material3/y6;", "properties", "Lkotlin/Function0;", "Lkotlin/k2;", "onDismissRequest", "Landroid/view/View;", "composeView", "Ljava/util/UUID;", "saveId", "<init>", "(Landroidx/compose/material3/y6;Lld/a;Landroid/view/View;Ljava/util/UUID;)V", "B", "()V", "C", "e", "(Landroidx/compose/runtime/t;I)V", "Landroidx/compose/runtime/z;", "parent", "Landroidx/compose/runtime/i;", "content", "E", "(Landroidx/compose/runtime/z;Lld/p;)V", "G", "y", "Landroid/view/KeyEvent;", "event", "", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "onAttachedToWindow", "onDetachedFromWindow", "onGlobalLayout", "", "layoutDirection", "setLayoutDirection", "(I)V", "Landroidx/compose/ui/unit/w;", "H", "(Landroidx/compose/ui/unit/w;)V", "k", "Landroidx/compose/material3/y6;", "l", "Lld/a;", "m", "Landroid/view/View;", "", "n", "Ljava/lang/Object;", "backCallback", "Landroid/view/WindowManager;", "o", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager$LayoutParams;", "p", "Landroid/view/WindowManager$LayoutParams;", "params", "<set-?>", "q", "Landroidx/compose/runtime/k2;", "z", "()Lld/p;", "D", "(Lld/p;)V", "r", "Z", "()Z", "shouldCreateCompositionOnAttachedToWindow", "A", "()I", "displayWidth", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetWindow\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n81#2:703\n107#2,2:704\n1#3:706\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetWindow\n*L\n557#1:703\n557#1:704,2\n*E\n"})
/* loaded from: classes.dex */
final class a7 extends AbstractComposeView implements ViewTreeObserver.OnGlobalLayoutListener, androidx.compose.ui.platform.a6 {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y6 properties;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.a<kotlin.k2> onDismissRequest;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View composeView;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object backCallback;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final WindowManager windowManager;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final WindowManager.LayoutParams params;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 content;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/a7$a;", "", "<init>", "()V", "Lkotlin/Function0;", "Lkotlin/k2;", "onDismissRequest", "Landroid/window/OnBackInvokedCallback;", "b", "(Lld/a;)Landroid/window/OnBackInvokedCallback;", "Landroid/view/View;", "view", "backCallback", "d", "(Landroid/view/View;Ljava/lang/Object;)V", "e", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(33)
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f9783a = new a();

        private a() {
        }

        public static void a(ld.a aVar) {
            aVar.invoke();
        }

        @fg.l
        @androidx.annotation.u
        @kd.n
        public static final OnBackInvokedCallback b(@fg.l final ld.a<kotlin.k2> onDismissRequest) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.z6
                public final void onBackInvoked() {
                    a7.a.a(ld.a.this);
                }
            };
        }

        private static final void c(ld.a aVar) {
            aVar.invoke();
        }

        @androidx.annotation.u
        @kd.n
        public static final void d(@fg.l View view, @fg.m Object backCallback) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(backCallback instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) backCallback);
        }

        @androidx.annotation.u
        @kd.n
        public static final void e(@fg.l View view, @fg.m Object backCallback) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(backCallback instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) backCallback);
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9785c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4) {
            super(2);
            this.f9785c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a7.this.e(tVar, androidx.compose.runtime.g3.b(this.f9785c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9786a;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9786a = iArr;
        }
    }

    public a7(@fg.l y6 y6Var, @fg.l ld.a<kotlin.k2> aVar, @fg.l View view, @fg.l UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        boolean l4;
        boolean o4;
        androidx.compose.runtime.k2 g4;
        this.properties = y6Var;
        this.onDismissRequest = aVar;
        this.composeView = view;
        setId(R.id.content);
        C1442q1.b(this, C1442q1.a(view));
        C1446s1.b(this, C1446s1.a(view));
        C1463g.b(this, C1463g.a(view));
        setTag(t.b.H, "Popup:" + uuid);
        setClipChildren(false);
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = BadgeDrawable.f52616u;
        layoutParams.type = 1000;
        layoutParams.width = A();
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(t.c.f20447d));
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.flags = (layoutParams.flags & (-163841)) | 512;
        androidx.compose.ui.window.q securePolicy = y6Var.getSecurePolicy();
        l4 = b7.l(view);
        o4 = b7.o(securePolicy, l4);
        if (o4) {
            layoutParams.flags |= 8192;
        } else {
            layoutParams.flags &= -8193;
        }
        if (y6Var.getIsFocusable()) {
            layoutParams.flags &= -9;
        } else {
            layoutParams.flags |= 8;
        }
        this.params = layoutParams;
        h3.f11339a.getClass();
        g4 = androidx.compose.runtime.t4.g(h3.f11341c, null, 2, null);
        this.content = g4;
    }

    private final int A() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    private final void B() {
        if (!this.properties.getShouldDismissOnBackPress() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = a.b(this.onDismissRequest);
        }
        a.d(this, this.backCallback);
    }

    private final void C() {
        if (Build.VERSION.SDK_INT >= 33) {
            a.e(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void D(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
        this.content.setValue(pVar);
    }

    public static /* synthetic */ void F(a7 a7Var, androidx.compose.runtime.z zVar, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            zVar = null;
        }
        a7Var.E(zVar, pVar);
    }

    private final ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> z() {
        return (ld.p) this.content.getValue();
    }

    public final void E(@fg.m androidx.compose.runtime.z parent, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> content) {
        if (parent != null) {
            t(parent);
        }
        D(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void G() {
        this.windowManager.addView(this, this.params);
    }

    public final void H(@fg.l androidx.compose.ui.unit.w layoutDirection) {
        int i4 = c.f9786a[layoutDirection.ordinal()];
        int i5 = 1;
        if (i4 == 1) {
            i5 = 0;
        } else if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@fg.l KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (event.getKeyCode() == 4 && this.properties.getShouldDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                this.onDismissRequest.invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @androidx.compose.runtime.i
    public void e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-463309699);
        if ((i4 & 6) == 0) {
            i5 = (o4.S(this) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-463309699, i5, -1, "androidx.compose.material3.ModalBottomSheetWindow.Content (ModalBottomSheet.android.kt:562)");
            }
            if (androidx.compose.animation.r.a(0, z(), o4)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(i4));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: m, reason: from getter */
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        B();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void y() {
        C1442q1.b(this, null);
        C1463g.b(this, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(this);
    }
}
