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
import androidx.core.view.j3;
import androidx.core.view.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import v1.a;

/* compiled from: FragmentContainerView.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020'2\u0006\u0010!\u001a\u00020 2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010\u0012J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010\u0012J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020'H\u0001¢\u0006\u0004\b.\u0010/J)\u00103\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00102\u0006\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u0012J\u0017\u00108\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0012J\u001f\u0010;\u001a\u00020\u00102\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00102\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u00020\u0010H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00028\u0000\"\n\b\u0000\u0010A*\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000e0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010-\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "Landroid/view/View;", "v", "Lkotlin/k2;", "a", "(Landroid/view/View;)V", "Landroid/animation/LayoutTransition;", "transition", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "c", "(Z)V", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "removeViewAt", "(I)V", "removeViewInLayout", "removeView", "start", "count", "removeViews", "(II)V", "removeViewsInLayout", "removeAllViewsInLayout", "()V", "Landroidx/fragment/app/Fragment;", "F", "b", "()Landroidx/fragment/app/Fragment;", "", "Ljava/util/List;", "disappearingFragmentChildren", "transitioningFragmentViews", "d", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "e", "Z", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<View> disappearingFragmentChildren;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<View> transitioningFragmentViews;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private View.OnApplyWindowInsetsListener applyWindowInsetsListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean drawDisappearingViewsFirst;

    /* compiled from: FragmentContainerView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$a;", "", "<init>", "()V", "Landroid/view/View$OnApplyWindowInsetsListener;", "onApplyWindowInsetsListener", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "a", "(Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @androidx.annotation.x0(20)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f29778a = new a();

        private a() {
        }

        @fg.l
        public final WindowInsets a(@fg.l View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @fg.l View v4, @fg.l WindowInsets insets) {
            kotlin.jvm.internal.l0.p(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            kotlin.jvm.internal.l0.p(v4, "v");
            kotlin.jvm.internal.l0.p(insets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v4, insets);
            kotlin.jvm.internal.l0.o(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public FragmentContainerView(@fg.l Context context, @fg.m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.l0.p(context, "context");
    }

    private final void a(View v4) {
        if (this.transitioningFragmentViews.contains(v4)) {
            this.disappearingFragmentChildren.add(v4);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@fg.l View child, int index, @fg.m ViewGroup.LayoutParams params) {
        kotlin.jvm.internal.l0.p(child, "child");
        if (FragmentManager.Q0(child) != null) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    public final <F extends Fragment> F b() {
        return (F) FragmentManager.u0(this).r0(getId());
    }

    @kd.i(name = "setDrawDisappearingViewsLast")
    public final void c(boolean drawDisappearingViewsFirst) {
        this.drawDisappearingViewsFirst = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup, android.view.View
    @fg.l
    @androidx.annotation.x0(20)
    public WindowInsets dispatchApplyWindowInsets(@fg.l WindowInsets insets) {
        j3 k12;
        kotlin.jvm.internal.l0.p(insets, "insets");
        j3 K = j3.K(insets);
        kotlin.jvm.internal.l0.o(K, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f29778a;
            kotlin.jvm.internal.l0.m(onApplyWindowInsetsListener);
            k12 = j3.L(aVar.a(onApplyWindowInsetsListener, this, insets), null);
        } else {
            k12 = x1.k1(this, K);
        }
        kotlin.jvm.internal.l0.o(k12, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!k12.A()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                x1.p(getChildAt(i4), k12);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@fg.l Canvas canvas) {
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
    protected boolean drawChild(@fg.l Canvas canvas, @fg.l View child, long drawingTime) {
        kotlin.jvm.internal.l0.p(canvas, "canvas");
        kotlin.jvm.internal.l0.p(child, "child");
        if (this.drawDisappearingViewsFirst && !this.disappearingFragmentChildren.isEmpty() && this.disappearingFragmentChildren.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@fg.l View view) {
        kotlin.jvm.internal.l0.p(view, "view");
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    @fg.l
    @androidx.annotation.x0(20)
    public WindowInsets onApplyWindowInsets(@fg.l WindowInsets insets) {
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
    public void removeView(@fg.l View view) {
        kotlin.jvm.internal.l0.p(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        View view = getChildAt(index);
        kotlin.jvm.internal.l0.o(view, "view");
        a(view);
        super.removeViewAt(index);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@fg.l View view) {
        kotlin.jvm.internal.l0.p(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int start, int count) {
        int i4 = start + count;
        for (int i5 = start; i5 < i4; i5++) {
            View view = getChildAt(i5);
            kotlin.jvm.internal.l0.o(view, "view");
            a(view);
        }
        super.removeViews(start, count);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int start, int count) {
        int i4 = start + count;
        for (int i5 = start; i5 < i4; i5++) {
            View view = getChildAt(i5);
            kotlin.jvm.internal.l0.o(view, "view");
            a(view);
        }
        super.removeViewsInLayout(start, count);
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@fg.m LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@fg.l View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.l0.p(listener, "listener");
        this.applyWindowInsetsListener = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@fg.l View view) {
        kotlin.jvm.internal.l0.p(view, "view");
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@fg.l Context context) {
        super(context);
        kotlin.jvm.internal.l0.p(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i4, int i5, kotlin.jvm.internal.w wVar) {
        this(context, attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kd.j
    public FragmentContainerView(@fg.l Context context, @fg.m AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        String str;
        kotlin.jvm.internal.l0.p(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = a.d.f92826e;
            kotlin.jvm.internal.l0.o(FragmentContainerView, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(a.d.f92827f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + kotlin.text.m0.quote);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@fg.l Context context, @fg.l AttributeSet attrs, @fg.l FragmentManager fm) {
        super(context, attrs);
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(attrs, "attrs");
        kotlin.jvm.internal.l0.p(fm, "fm");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = a.d.f92826e;
        kotlin.jvm.internal.l0.o(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(a.d.f92827f) : classAttribute;
        String string = obtainStyledAttributes.getString(a.d.f92828g);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment r02 = fm.r0(id2);
        if (classAttribute != null && r02 == null) {
            if (id2 == -1) {
                throw new IllegalStateException(android.support.v4.media.d.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            Fragment instantiate = fm.G0().instantiate(context.getClassLoader(), classAttribute);
            kotlin.jvm.internal.l0.o(instantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            instantiate.onInflate(context, attrs, (Bundle) null);
            fm.u().R(true).k(this, instantiate, string).u();
        }
        fm.o1(this);
    }
}
