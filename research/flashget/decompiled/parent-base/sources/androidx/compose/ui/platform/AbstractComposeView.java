package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.i3;
import androidx.compose.ui.platform.o5;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: ComposeView.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH'¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0010¢\u0006\u0004\b#\u0010\"J7\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0004¢\u0006\u0004\b*\u0010+J7\u0010,\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0010¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\n2\u0006\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J!\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00109J)\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010<J#\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010?J+\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010@J+\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0014¢\u0006\u0004\bA\u0010BJ3\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010C\u001a\u00020$H\u0014¢\u0006\u0004\bA\u0010DJ\u000f\u0010E\u001a\u00020$H\u0016¢\u0006\u0004\bE\u00101R\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR(\u0010P\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010J8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR(\u0010W\u001a\u0004\u0018\u00010\r2\b\u0010K\u001a\u0004\u0018\u00010\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010U\"\u0004\bV\u0010\u0015R$\u0010[\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000e\u0010Y\u0012\u0004\bZ\u0010\fR0\u0010`\u001a\u00020$2\u0006\u0010K\u001a\u00020$8F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\\\u0012\u0004\b_\u0010\f\u001a\u0004\b]\u00101\"\u0004\b^\u00103R\u0016\u0010a\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\\R\u0016\u0010b\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\\R\u0018\u0010e\u001a\u00020$*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020$8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bf\u00101R\u0011\u0010i\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bh\u00101¨\u0006j"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/k2;", "g", "()V", "Landroidx/compose/runtime/z;", "f", "(Landroidx/compose/runtime/z;)Landroidx/compose/runtime/z;", "s", "()Landroidx/compose/runtime/z;", "j", "parent", "t", "(Landroidx/compose/runtime/z;)V", "Landroidx/compose/ui/platform/o5;", "strategy", "x", "(Landroidx/compose/ui/platform/o5;)V", "e", "(Landroidx/compose/runtime/t;I)V", "h", "i", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "q", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "p", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "c", "Landroid/os/IBinder;", "v", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "Landroidx/compose/runtime/y;", "d", "Landroidx/compose/runtime/y;", "composition", "Landroidx/compose/runtime/z;", "u", "parentContext", "Lkotlin/Function0;", "Lld/a;", "k", "disposeViewCompositionStrategy", "Z", "n", "w", "o", "showLayoutBounds", "creatingComposition", "isTransitionGroupSet", "r", "(Landroidx/compose/runtime/z;)Z", "isAlive", "m", "shouldCreateCompositionOnAttachedToWindow", "l", "hasComposition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeView.android.kt\nandroidx/compose/ui/platform/AbstractComposeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,448:1\n1#2:449\n*E\n"})
/* loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {

    /* renamed from: j, reason: collision with root package name */
    public static final int f19545j = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private WeakReference<androidx.compose.runtime.z> cachedViewTreeCompositionContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private IBinder previousAttachedWindowToken;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.y composition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.z parentContext;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<kotlin.k2> disposeViewCompositionStrategy;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean showLayoutBounds;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean creatingComposition;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isTransitionGroupSet;

    /* compiled from: ComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {
        a() {
            super(2);
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-656146368, i4, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:251)");
            }
            AbstractComposeView.this.e(tVar, 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @kd.j
    public AbstractComposeView(@fg.l Context context) {
        this(context, null, 0, 6, null);
    }

    private final androidx.compose.runtime.z f(androidx.compose.runtime.z zVar) {
        androidx.compose.runtime.z zVar2 = r(zVar) ? zVar : null;
        if (zVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(zVar2);
        }
        return zVar;
    }

    private final void g() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void j() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = l6.c(this, s(), new androidx.compose.runtime.internal.b(-656146368, true, new a()));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private static /* synthetic */ void k() {
    }

    @androidx.compose.ui.l
    public static /* synthetic */ void o() {
    }

    private final boolean r(androidx.compose.runtime.z zVar) {
        return !(zVar instanceof androidx.compose.runtime.i3) || ((androidx.compose.runtime.i3) zVar).v0().getValue().compareTo(i3.e.ShuttingDown) > 0;
    }

    private final androidx.compose.runtime.z s() {
        androidx.compose.runtime.z zVar;
        androidx.compose.runtime.z zVar2 = this.parentContext;
        if (zVar2 != null) {
            return zVar2;
        }
        androidx.compose.runtime.z d5 = WindowRecomposer_androidKt.d(this);
        androidx.compose.runtime.z zVar3 = null;
        androidx.compose.runtime.z f4 = d5 != null ? f(d5) : null;
        if (f4 != null) {
            return f4;
        }
        WeakReference<androidx.compose.runtime.z> weakReference = this.cachedViewTreeCompositionContext;
        if (weakReference != null && (zVar = weakReference.get()) != null && r(zVar)) {
            zVar3 = zVar;
        }
        androidx.compose.runtime.z zVar4 = zVar3;
        return zVar4 == null ? f(WindowRecomposer_androidKt.h(this)) : zVar4;
    }

    private final void u(androidx.compose.runtime.z zVar) {
        if (this.parentContext != zVar) {
            this.parentContext = zVar;
            if (zVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            androidx.compose.runtime.y yVar = this.composition;
            if (yVar != null) {
                yVar.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    j();
                }
            }
        }
    }

    private final void v(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@fg.m View child) {
        g();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(@fg.m View child, int index, @fg.m ViewGroup.LayoutParams params) {
        g();
        return super.addViewInLayout(child, index, params);
    }

    @androidx.compose.ui.v
    @androidx.compose.runtime.i
    public abstract void e(@fg.m androidx.compose.runtime.t tVar, int i4);

    public final void h() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        j();
    }

    public final void i() {
        androidx.compose.runtime.y yVar = this.composition;
        if (yVar != null) {
            yVar.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    public final boolean l() {
        return this.composition != null;
    }

    protected boolean m() {
        return true;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(getWindowToken());
        if (m()) {
            j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int left, int top2, int right, int bottom) {
        p(changed, left, top2, right, bottom);
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        j();
        q(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(layoutDirection);
    }

    public void p(boolean changed, int left, int top2, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top2) - getPaddingBottom());
        }
    }

    public void q(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(@fg.m androidx.compose.runtime.z parent) {
        u(parent);
    }

    public final void w(boolean z4) {
        this.showLayoutBounds = z4;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.p1) childAt).B(z4);
        }
    }

    public final void x(@fg.l o5 strategy) {
        ld.a<kotlin.k2> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @kd.j
    public AbstractComposeView(@fg.l Context context, @fg.m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i4, int i5, kotlin.jvm.internal.w wVar) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    @Override // android.view.ViewGroup
    public void addView(@fg.m View child, int index) {
        g();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(@fg.m View child, int index, @fg.m ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        g();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    @kd.j
    public AbstractComposeView(@fg.l Context context, @fg.m AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        setClipChildren(false);
        setClipToPadding(false);
        o5.INSTANCE.getClass();
        this.disposeViewCompositionStrategy = o5.c.f20061b.a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(@fg.m View child, int width, int height) {
        g();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@fg.m View child, @fg.m ViewGroup.LayoutParams params) {
        g();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(@fg.m View child, int index, @fg.m ViewGroup.LayoutParams params) {
        g();
        super.addView(child, index, params);
    }
}
