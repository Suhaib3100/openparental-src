package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.runtime.z;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.a6;
import androidx.compose.ui.t;
import androidx.compose.ui.unit.w;
import androidx.core.view.n2;
import androidx.view.C1442q1;
import androidx.view.C1446s1;
import androidx.view.C1463g;
import androidx.view.c0;
import androidx.view.e0;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010!R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\u0002028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/ui/window/i;", "Landroidx/activity/o;", "Landroidx/compose/ui/platform/a6;", "Lkotlin/Function0;", "Lkotlin/k2;", "onDismissRequest", "Landroidx/compose/ui/window/g;", "properties", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Lld/a;Landroidx/compose/ui/window/g;Landroid/view/View;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;Ljava/util/UUID;)V", "o", "(Landroidx/compose/ui/unit/w;)V", "Landroidx/compose/ui/window/q;", "securePolicy", "p", "(Landroidx/compose/ui/window/q;)V", "Landroidx/compose/runtime/z;", "parentComposition", "Landroidx/compose/runtime/i;", "children", "n", "(Landroidx/compose/runtime/z;Lld/p;)V", "q", "(Lld/a;Landroidx/compose/ui/window/g;Landroidx/compose/ui/unit/w;)V", "m", "()V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "e", "Lld/a;", "f", "Landroidx/compose/ui/window/g;", "g", "Landroid/view/View;", "Landroidx/compose/ui/window/f;", "h", "Landroidx/compose/ui/window/f;", "dialogLayout", "Landroidx/compose/ui/unit/h;", "i", "F", "maxSupportedElevation", "", "j", "I", "defaultSoftInputMode", "Landroidx/compose/ui/platform/AbstractComposeView;", "c", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,466:1\n154#2:467\n1#3:468\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n*L\n302#1:467\n*E\n"})
/* loaded from: classes.dex */
final class i extends androidx.view.o implements a6 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.a<k2> onDismissRequest;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private g properties;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View composeView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f dialogLayout;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int defaultSoftInputMode;

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/i$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "Lkotlin/k2;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@fg.l View view, @fg.l Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/c0;", "Lkotlin/k2;", "a", "(Landroidx/activity/c0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<c0, k2> {
        b() {
            super(1);
        }

        public final void a(@fg.l c0 c0Var) {
            if (i.this.properties.getDismissOnBackPress()) {
                i.this.onDismissRequest.invoke();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(c0 c0Var) {
            a(c0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21730a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21730a = iArr;
        }
    }

    public i(@fg.l ld.a<k2> aVar, @fg.l g gVar, @fg.l View view, @fg.l w wVar, @fg.l androidx.compose.ui.unit.d dVar, @fg.l UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || gVar.getDecorFitsSystemWindows()) ? t.d.f20461a : t.d.f20463c), 0, 2, null);
        this.onDismissRequest = aVar;
        this.properties = gVar;
        this.composeView = view;
        float g4 = androidx.compose.ui.unit.h.g(8);
        this.maxSupportedElevation = g4;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.defaultSoftInputMode = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        n2.c(window, this.properties.getDecorFitsSystemWindows());
        f fVar = new f(getContext(), window);
        fVar.setTag(t.b.H, "Dialog:" + uuid);
        fVar.setClipChildren(false);
        fVar.setElevation(dVar.v5(g4));
        fVar.setOutlineProvider(new a());
        this.dialogLayout = fVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            j(viewGroup);
        }
        setContentView(fVar);
        C1442q1.b(fVar, C1442q1.a(view));
        C1446s1.b(fVar, C1446s1.a(view));
        C1463g.b(fVar, C1463g.a(view));
        q(this.onDismissRequest, this.properties, wVar);
        e0.b(getOnBackPressedDispatcher(), this, false, new b(), 2, null);
    }

    private static final void j(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof f) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                j(viewGroup2);
            }
        }
    }

    private final void o(w layoutDirection) {
        f fVar = this.dialogLayout;
        int i4 = c.f21730a[layoutDirection.ordinal()];
        int i5 = 1;
        if (i4 == 1) {
            i5 = 0;
        } else if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        fVar.setLayoutDirection(i5);
    }

    private final void p(q securePolicy) {
        boolean a5 = r.a(securePolicy, androidx.compose.ui.window.c.i(this.composeView));
        Window window = getWindow();
        l0.m(window);
        window.setFlags(a5 ? 8192 : -8193, 8192);
    }

    @Override // androidx.compose.ui.platform.a6
    @fg.l
    public AbstractComposeView c() {
        return this.dialogLayout;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void m() {
        this.dialogLayout.i();
    }

    public final void n(@fg.l z parentComposition, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> children) {
        this.dialogLayout.C(parentComposition, children);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@fg.l MotionEvent event) {
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent && this.properties.getDismissOnClickOutside()) {
            this.onDismissRequest.invoke();
        }
        return onTouchEvent;
    }

    public final void q(@fg.l ld.a<k2> onDismissRequest, @fg.l g properties, @fg.l w layoutDirection) {
        Window window;
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        p(properties.getSecurePolicy());
        o(layoutDirection);
        if (properties.getUsePlatformDefaultWidth() && !this.dialogLayout.getUsePlatformDefaultWidth() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.dialogLayout.E(properties.getUsePlatformDefaultWidth());
        if (Build.VERSION.SDK_INT < 31) {
            if (properties.getDecorFitsSystemWindows()) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.defaultSoftInputMode);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
        }
    }
}
