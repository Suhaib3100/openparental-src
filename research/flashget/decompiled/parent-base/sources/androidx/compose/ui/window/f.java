package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.x;
import androidx.compose.runtime.z;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#RA\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00101\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00103\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00168\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b+\u0010.R\u0014\u00106\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00105¨\u00069"}, d2 = {"Landroidx/compose/ui/window/f;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/h;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "Landroidx/compose/runtime/z;", "parent", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "C", "(Landroidx/compose/runtime/z;Lld/p;)V", "", "widthMeasureSpec", "heightMeasureSpec", "q", "(II)V", "", "changed", "left", "top", "right", "bottom", "p", "(ZIIII)V", "e", "(Landroidx/compose/runtime/t;I)V", "k", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "<set-?>", "l", "Landroidx/compose/runtime/k2;", "y", "()Lld/p;", "D", "(Lld/p;)V", "m", "Z", "B", "()Z", "E", "(Z)V", "usePlatformDefaultWidth", "n", "shouldCreateCompositionOnAttachedToWindow", "A", "()I", "displayWidth", "z", "displayHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,466:1\n81#2:467\n107#2,2:468\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n216#1:467\n216#1:468,2\n*E\n"})
/* loaded from: classes.dex */
final class f extends AbstractComposeView implements h {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Window window;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 content;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean usePlatformDefaultWidth;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends n0 implements ld.p<t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21716c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4) {
            super(2);
            this.f21716c = i4;
        }

        public final void a(@fg.m t tVar, int i4) {
            f.this.e(tVar, g3.b(this.f21716c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    public f(@fg.l Context context, @fg.l Window window) {
        super(context, null, 0, 6, null);
        k2 g4;
        this.window = window;
        d.f21705a.getClass();
        g4 = t4.g(d.f21706b, null, 2, null);
        this.content = g4;
    }

    private final int A() {
        return kotlin.math.b.L0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void D(ld.p<? super t, ? super Integer, kotlin.k2> pVar) {
        this.content.setValue(pVar);
    }

    private final ld.p<t, Integer, kotlin.k2> y() {
        return (ld.p) this.content.getValue();
    }

    private final int z() {
        return kotlin.math.b.L0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* renamed from: B, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public final void C(@fg.l z parent, @fg.l ld.p<? super t, ? super Integer, kotlin.k2> content) {
        t(parent);
        D(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        h();
    }

    public final void E(boolean z4) {
        this.usePlatformDefaultWidth = z4;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @androidx.compose.runtime.i
    public void e(@fg.m t tVar, int i4) {
        t o4 = tVar.o(1735448596);
        if (x.b0()) {
            x.r0(1735448596, i4, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:268)");
        }
        if (androidx.compose.animation.r.a(0, y(), o4)) {
            x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(i4));
        }
    }

    @Override // androidx.compose.ui.window.h
    @fg.l
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: m, reason: from getter */
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void p(boolean changed, int left, int top2, int right, int bottom) {
        View childAt;
        super.p(changed, left, top2, right, bottom);
        if (this.usePlatformDefaultWidth || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.window.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void q(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.usePlatformDefaultWidth) {
            super.q(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.q(View.MeasureSpec.makeMeasureSpec(A(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(z(), Integer.MIN_VALUE));
        }
    }
}
