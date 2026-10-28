package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.x0;
import androidx.core.view.v4;
import androidx.core.view.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.Typography;
import z.a;

/* compiled from: FragmentContainerView.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0011\b\u0016\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<B%\b\u0017\u0012\u0006\u0010:\u001a\u000209\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\b\u0002\u0010?\u001a\u00020\u001d¢\u0006\u0004\b;\u0010@B!\b\u0010\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\b;\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0017J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0017J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0014J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0016H\u0001J\"\u0010!\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001dH\u0016J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\u0019\u0010,\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u00106\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006D"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "v", "Lkotlin/m2;", "a", "Landroid/animation/LayoutTransition;", "transition", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "child", "", "drawingTime", "", "drawChild", "view", "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "c", "", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "removeViewAt", "removeViewInLayout", "removeView", "start", "count", "removeViews", "removeViewsInLayout", "removeAllViewsInLayout", "Landroidx/fragment/app/Fragment;", "F", "b", "()Landroidx/fragment/app/Fragment;", "", "o", "Ljava/util/List;", "disappearingFragmentChildren", "p", "transitioningFragmentViews", "q", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "r", "Z", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<View> disappearingFragmentChildren;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<View> transitioningFragmentViews;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private View.OnApplyWindowInsetsListener applyWindowInsetsListener;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean drawDisappearingViewsFirst;

    /* compiled from: FragmentContainerView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$a;", "", "Landroid/view/View$OnApplyWindowInsetsListener;", "onApplyWindowInsetsListener", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "a", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 6, 0})
    @x0(20)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f8054a = new a();

        private a() {
        }

        @d5.d
        public final WindowInsets a(@d5.d View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @d5.d View v5, @d5.d WindowInsets insets) {
            kotlin.jvm.internal.l0.p(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            kotlin.jvm.internal.l0.p(v5, "v");
            kotlin.jvm.internal.l0.p(insets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v5, insets);
            kotlin.jvm.internal.l0.o(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p3.j
    public FragmentContainerView(@d5.d Context context, @d5.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.l0.p(context, "context");
    }

    private final void a(View view) {
        if (this.transitioningFragmentViews.contains(view)) {
            this.disappearingFragmentChildren.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@d5.d View child, int i5, @d5.e ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.l0.p(child, "child");
        if (FragmentManager.Q0(child) != null) {
            super.addView(child, i5, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    public final <F extends Fragment> F b() {
        return (F) FragmentManager.u0(this).r0(getId());
    }

    @p3.i(name = "setDrawDisappearingViewsLast")
    public final void c(boolean z5) {
        this.drawDisappearingViewsFirst = z5;
    }

    @Override // android.view.ViewGroup, android.view.View
    @x0(20)
    @d5.d
    public WindowInsets dispatchApplyWindowInsets(@d5.d WindowInsets insets) {
        v4 g12;
        kotlin.jvm.internal.l0.p(insets, "insets");
        v4 K = v4.K(insets);
        kotlin.jvm.internal.l0.o(K, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f8054a;
            kotlin.jvm.internal.l0.m(onApplyWindowInsetsListener);
            g12 = v4.L(aVar.a(onApplyWindowInsetsListener, this, insets), null);
        } else {
            g12 = y1.g1(this, K);
        }
        kotlin.jvm.internal.l0.o(g12, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!g12.A()) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                y1.p(getChildAt(i5), g12);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@d5.d Canvas canvas) {
        kotlin.jvm.internal.l0.p(canvas, "canvas");
        if (this.drawDisappearingViewsFirst) {
            Iterator<T> it = this.disappearingFragmentChildren.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@d5.d Canvas canvas, @d5.d View child, long drawingTime) {
        kotlin.jvm.internal.l0.p(canvas, "canvas");
        kotlin.jvm.internal.l0.p(child, "child");
        if (this.drawDisappearingViewsFirst && (!this.disappearingFragmentChildren.isEmpty()) && this.disappearingFragmentChildren.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "view");
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    @x0(20)
    @d5.d
    public WindowInsets onApplyWindowInsets(@d5.d WindowInsets insets) {
        kotlin.jvm.internal.l0.p(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.l0.o(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i5) {
        View view = getChildAt(i5);
        kotlin.jvm.internal.l0.o(view, "view");
        a(view);
        super.removeViewAt(i5);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i5, int i6) {
        int i7 = i5 + i6;
        for (int i8 = i5; i8 < i7; i8++) {
            View view = getChildAt(i8);
            kotlin.jvm.internal.l0.o(view, "view");
            a(view);
        }
        super.removeViews(i5, i6);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i5, int i6) {
        int i7 = i5 + i6;
        for (int i8 = i5; i8 < i7; i8++) {
            View view = getChildAt(i8);
            kotlin.jvm.internal.l0.o(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i5, i6);
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@d5.e LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@d5.d View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.l0.p(listener, "listener");
        this.applyWindowInsetsListener = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "view");
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@d5.d Context context) {
        super(context);
        kotlin.jvm.internal.l0.p(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(context, attributeSet, (i6 & 4) != 0 ? 0 : i5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @p3.j
    public FragmentContainerView(@d5.d Context context, @d5.e AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        String str;
        kotlin.jvm.internal.l0.p(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = a.d.f34382e;
            kotlin.jvm.internal.l0.o(FragmentContainerView, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(a.d.f34383f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + Typography.f27126b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@d5.d Context context, @d5.d AttributeSet attrs, @d5.d FragmentManager fm) {
        super(context, attrs);
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(attrs, "attrs");
        kotlin.jvm.internal.l0.p(fm, "fm");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = a.d.f34382e;
        kotlin.jvm.internal.l0.o(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(a.d.f34383f) : classAttribute;
        String string = obtainStyledAttributes.getString(a.d.f34384g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment r02 = fm.r0(id);
        if (classAttribute != null && r02 == null) {
            if (id == -1) {
                throw new IllegalStateException(androidx.constraintlayout.solver.widgets.analyzer.e.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            Fragment a6 = fm.G0().a(context.getClassLoader(), classAttribute);
            kotlin.jvm.internal.l0.o(a6, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a6.onInflate(context, attrs, (Bundle) null);
            fm.u().M(true).f(this, a6, string).p();
        }
        fm.n1(this);
    }
}
