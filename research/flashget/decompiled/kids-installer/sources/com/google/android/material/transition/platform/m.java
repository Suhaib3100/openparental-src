package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import n1.a;

/* compiled from: MaterialContainerTransformSharedElementCallback.java */
@x0(21)
/* loaded from: classes2.dex */
public class m extends SharedElementCallback {

    /* renamed from: f, reason: collision with root package name */
    @q0
    private static WeakReference<View> f14914f;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private Rect f14918d;

    /* renamed from: a, reason: collision with root package name */
    private boolean f14915a = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14916b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14917c = false;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private d f14919e = new e();

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    /* loaded from: classes3.dex */
    class a extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f14920a;

        a(Window window) {
            this.f14920a = window;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            m.i(this.f14920a);
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.h(this.f14920a);
        }
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    /* loaded from: classes3.dex */
    class b extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f14922a;

        b(Activity activity) {
            this.f14922a = activity;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (m.f14914f != null && (view = (View) m.f14914f.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = m.f14914f = null;
            }
            this.f14922a.finish();
            this.f14922a.overridePendingTransition(0, 0);
        }
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    /* loaded from: classes3.dex */
    class c extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f14924a;

        c(Window window) {
            this.f14924a = window;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.h(this.f14924a);
        }
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    public interface d {
        @q0
        com.google.android.material.shape.o a(@o0 View view);
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    /* loaded from: classes3.dex */
    public static class e implements d {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.transition.platform.m.d
        @q0
        public com.google.android.material.shape.o a(@o0 View view) {
            if (view instanceof com.google.android.material.shape.s) {
                return ((com.google.android.material.shape.s) view).l();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Window window) {
        window.getDecorView().getBackground().mutate().setColorFilter(androidx.core.graphics.o.a(0, androidx.core.graphics.p.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Window window) {
        window.getDecorView().getBackground().mutate().clearColorFilter();
    }

    private void m(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof l) {
            l lVar = (l) sharedElementEnterTransition;
            if (!this.f14917c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f14916b) {
                o(window, lVar);
                lVar.addListener(new a(window));
            }
        }
    }

    private void n(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof l) {
            l lVar = (l) sharedElementReturnTransition;
            lVar.h0(true);
            lVar.addListener(new b(activity));
            if (this.f14916b) {
                o(window, lVar);
                lVar.addListener(new c(window));
            }
        }
    }

    private static void o(Window window, l lVar) {
        if (lVar.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(lVar.getDuration());
        }
    }

    @q0
    public d e() {
        return this.f14919e;
    }

    public boolean f() {
        return this.f14917c;
    }

    public boolean g() {
        return this.f14916b;
    }

    public void j(@q0 d dVar) {
        this.f14919e = dVar;
    }

    public void k(boolean z5) {
        this.f14917c = z5;
    }

    public void l(boolean z5) {
        this.f14916b = z5;
    }

    @Override // android.app.SharedElementCallback
    @q0
    public Parcelable onCaptureSharedElementSnapshot(@o0 View view, @o0 Matrix matrix, @o0 RectF rectF) {
        f14914f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @q0
    public View onCreateSnapshotView(@o0 Context context, @q0 Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        com.google.android.material.shape.o a6;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = f14914f) != null && this.f14919e != null && (view = weakReference.get()) != null && (a6 = this.f14919e.a(view)) != null) {
            onCreateSnapshotView.setTag(a.h.f29703d3, a6);
        }
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@o0 List<String> list, @o0 Map<String, View> map) {
        View view;
        Activity a6;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (a6 = com.google.android.material.internal.b.a(view.getContext())) == null) {
            return;
        }
        Window window = a6.getWindow();
        if (this.f14915a) {
            m(window);
        } else {
            n(a6, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@o0 List<String> list, @o0 List<View> list2, @o0 List<View> list3) {
        if (!list2.isEmpty()) {
            View view = list2.get(0);
            int i5 = a.h.f29703d3;
            if (view.getTag(i5) instanceof View) {
                list2.get(0).setTag(i5, null);
            }
        }
        if (!this.f14915a && !list2.isEmpty()) {
            this.f14918d = v.k(list2.get(0));
        }
        this.f14915a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@o0 List<String> list, @o0 List<View> list2, @o0 List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(a.h.f29703d3, list3.get(0));
        }
        if (this.f14915a || list2.isEmpty() || this.f14918d == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f14918d.width(), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), View.MeasureSpec.makeMeasureSpec(this.f14918d.height(), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
        Rect rect = this.f14918d;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}
