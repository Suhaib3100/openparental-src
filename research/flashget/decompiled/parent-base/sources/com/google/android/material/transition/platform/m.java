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
import s8.a;

/* compiled from: MaterialContainerTransformSharedElementCallback.java */
@x0(21)
/* loaded from: classes6.dex */
public class m extends SharedElementCallback {

    /* renamed from: f, reason: collision with root package name */
    @q0
    private static WeakReference<View> f54753f;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private Rect f54757d;

    /* renamed from: a, reason: collision with root package name */
    private boolean f54754a = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f54755b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f54756c = false;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private d f54758e = new e();

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    class a extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f54759a;

        a(Window window) {
            this.f54759a = window;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            m.i(this.f54759a);
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.h(this.f54759a);
        }
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    class b extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f54761a;

        b(Activity activity) {
            this.f54761a = activity;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (m.f54753f != null && (view = (View) m.f54753f.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = m.f54753f = null;
            }
            this.f54761a.finish();
            this.f54761a.overridePendingTransition(0, 0);
        }
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    class c extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f54763a;

        c(Window window) {
            this.f54763a = window;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.h(this.f54763a);
        }
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    public interface d {
        @q0
        com.google.android.material.shape.o a(@o0 View view);
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    public static class e implements d {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.transition.platform.m.d
        @q0
        public com.google.android.material.shape.o a(@o0 View view) {
            if (view instanceof com.google.android.material.shape.s) {
                return ((com.google.android.material.shape.s) view).e();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Window window) {
        window.getDecorView().getBackground().mutate().setColorFilter(androidx.core.graphics.d.a(0, androidx.core.graphics.e.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Window window) {
        window.getDecorView().getBackground().mutate().clearColorFilter();
    }

    private void m(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof l) {
            l lVar = (l) sharedElementEnterTransition;
            if (!this.f54756c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f54755b) {
                o(window, lVar);
                lVar.addListener(new a(window));
            }
        }
    }

    private void n(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof l) {
            l lVar = (l) sharedElementReturnTransition;
            lVar.c0(true);
            lVar.addListener(new b(activity));
            if (this.f54755b) {
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
        return this.f54758e;
    }

    public boolean f() {
        return this.f54756c;
    }

    public boolean g() {
        return this.f54755b;
    }

    public void j(@q0 d dVar) {
        this.f54758e = dVar;
    }

    public void k(boolean z4) {
        this.f54756c = z4;
    }

    public void l(boolean z4) {
        this.f54755b = z4;
    }

    @Override // android.app.SharedElementCallback
    @q0
    public Parcelable onCaptureSharedElementSnapshot(@o0 View view, @o0 Matrix matrix, @o0 RectF rectF) {
        f54753f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @q0
    public View onCreateSnapshotView(@o0 Context context, @q0 Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        com.google.android.material.shape.o a5;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = f54753f) != null && this.f54758e != null && (view = weakReference.get()) != null && (a5 = this.f54758e.a(view)) != null) {
            onCreateSnapshotView.setTag(a.h.f91000d3, a5);
        }
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@o0 List<String> list, @o0 Map<String, View> map) {
        View view;
        Activity a5;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (a5 = com.google.android.material.internal.b.a(view.getContext())) == null) {
            return;
        }
        Window window = a5.getWindow();
        if (this.f54754a) {
            m(window);
        } else {
            n(a5, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@o0 List<String> list, @o0 List<View> list2, @o0 List<View> list3) {
        if (!list2.isEmpty()) {
            View view = list2.get(0);
            int i4 = a.h.f91000d3;
            if (view.getTag(i4) instanceof View) {
                list2.get(0).setTag(i4, null);
            }
        }
        if (!this.f54754a && !list2.isEmpty()) {
            this.f54757d = v.k(list2.get(0));
        }
        this.f54754a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@o0 List<String> list, @o0 List<View> list2, @o0 List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(a.h.f91000d3, list3.get(0));
        }
        if (this.f54754a || list2.isEmpty() || this.f54757d == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f54757d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f54757d.height(), 1073741824));
        Rect rect = this.f54757d;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}
