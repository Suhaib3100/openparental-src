package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.c1;
import androidx.databinding.library.baseAdapters.c;

/* compiled from: ViewBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:backgroundTint", method = "setBackgroundTintList", type = View.class), @androidx.databinding.g(attribute = "android:fadeScrollbars", method = "setScrollbarFadingEnabled", type = View.class), @androidx.databinding.g(attribute = "android:getOutline", method = "setOutlineProvider", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusForward", method = "setNextFocusForwardId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusLeft", method = "setNextFocusLeftId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusRight", method = "setNextFocusRightId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusUp", method = "setNextFocusUpId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusDown", method = "setNextFocusDownId", type = View.class), @androidx.databinding.g(attribute = "android:requiresFadingEdge", method = "setVerticalFadingEdgeEnabled", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarDefaultDelayBeforeFade", method = "setScrollBarDefaultDelayBeforeFade", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarFadeDuration", method = "setScrollBarFadeDuration", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarSize", method = "setScrollBarSize", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarStyle", method = "setScrollBarStyle", type = View.class), @androidx.databinding.g(attribute = "android:transformPivotX", method = "setPivotX", type = View.class), @androidx.databinding.g(attribute = "android:transformPivotY", method = "setPivotY", type = View.class), @androidx.databinding.g(attribute = "android:onDrag", method = "setOnDragListener", type = View.class), @androidx.databinding.g(attribute = "android:onClick", method = "setOnClickListener", type = View.class), @androidx.databinding.g(attribute = "android:onApplyWindowInsets", method = "setOnApplyWindowInsetsListener", type = View.class), @androidx.databinding.g(attribute = "android:onCreateContextMenu", method = "setOnCreateContextMenuListener", type = View.class), @androidx.databinding.g(attribute = "android:onFocusChange", method = "setOnFocusChangeListener", type = View.class), @androidx.databinding.g(attribute = "android:onGenericMotion", method = "setOnGenericMotionListener", type = View.class), @androidx.databinding.g(attribute = "android:onHover", method = "setOnHoverListener", type = View.class), @androidx.databinding.g(attribute = "android:onKey", method = "setOnKeyListener", type = View.class), @androidx.databinding.g(attribute = "android:onLongClick", method = "setOnLongClickListener", type = View.class), @androidx.databinding.g(attribute = "android:onSystemUiVisibilityChange", method = "setOnSystemUiVisibilityChangeListener", type = View.class), @androidx.databinding.g(attribute = "android:onTouch", method = "setOnTouchListener", type = View.class)})
/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6057a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6058b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6059c = 2;

    /* compiled from: ViewBindingAdapter.java */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ b f6060o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ c f6061p;

        a(b bVar, c cVar) {
            this.f6060o = bVar;
            this.f6061p = cVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b bVar = this.f6060o;
            if (bVar != null) {
                bVar.onViewAttachedToWindow(view);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            c cVar = this.f6061p;
            if (cVar != null) {
                cVar.onViewDetachedFromWindow(view);
            }
        }
    }

    /* compiled from: ViewBindingAdapter.java */
    @TargetApi(12)
    public interface b {
        void onViewAttachedToWindow(View view);
    }

    /* compiled from: ViewBindingAdapter.java */
    @TargetApi(12)
    public interface c {
        void onViewDetachedFromWindow(View view);
    }

    private static int a(float f6) {
        int i5 = (int) (0.5f + f6);
        if (i5 != 0) {
            return i5;
        }
        if (f6 == 0.0f) {
            return 0;
        }
        return f6 > 0.0f ? 1 : -1;
    }

    @androidx.databinding.d({"android:background"})
    public static void b(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @androidx.databinding.d({"android:onClickListener", "android:clickable"})
    public static void c(View view, View.OnClickListener onClickListener, boolean z5) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z5);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onViewDetachedFromWindow", "android:onViewAttachedToWindow"})
    public static void d(View view, c cVar, b bVar) {
        a aVar = (cVar == null && bVar == null) ? null : new a(bVar, cVar);
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) r.b(view, aVar, c.g.f6491g0);
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        if (aVar != null) {
            view.addOnAttachStateChangeListener(aVar);
        }
    }

    @androidx.databinding.d({"android:onClick", "android:clickable"})
    public static void e(View view, View.OnClickListener onClickListener, boolean z5) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z5);
    }

    @androidx.databinding.d({"android:onLayoutChange"})
    public static void f(View view, View.OnLayoutChangeListener onLayoutChangeListener, View.OnLayoutChangeListener onLayoutChangeListener2) {
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (onLayoutChangeListener2 != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener2);
        }
    }

    @androidx.databinding.d({"android:onLongClick", "android:longClickable"})
    public static void g(View view, View.OnLongClickListener onLongClickListener, boolean z5) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z5);
    }

    @androidx.databinding.d({"android:onLongClickListener", "android:longClickable"})
    public static void h(View view, View.OnLongClickListener onLongClickListener, boolean z5) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z5);
    }

    @androidx.databinding.d({"android:padding"})
    public static void i(View view, float f6) {
        int a6 = a(f6);
        view.setPadding(a6, a6, a6, a6);
    }

    @androidx.databinding.d({"android:paddingBottom"})
    public static void j(View view, float f6) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a(f6));
    }

    @androidx.databinding.d({"android:paddingEnd"})
    public static void k(View view, float f6) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), a(f6), view.getPaddingBottom());
    }

    @androidx.databinding.d({"android:paddingLeft"})
    public static void l(View view, float f6) {
        view.setPadding(a(f6), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    @androidx.databinding.d({"android:paddingRight"})
    public static void m(View view, float f6) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), a(f6), view.getPaddingBottom());
    }

    @androidx.databinding.d({"android:paddingStart"})
    public static void n(View view, float f6) {
        view.setPaddingRelative(a(f6), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    @androidx.databinding.d({"android:paddingTop"})
    public static void o(View view, float f6) {
        view.setPadding(view.getPaddingLeft(), a(f6), view.getPaddingRight(), view.getPaddingBottom());
    }

    @androidx.databinding.d({"android:requiresFadingEdge"})
    public static void p(View view, int i5) {
        boolean z5 = (i5 & 2) != 0;
        boolean z6 = (i5 & 1) != 0;
        view.setVerticalFadingEdgeEnabled(z5);
        view.setHorizontalFadingEdgeEnabled(z6);
    }
}
