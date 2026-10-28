package androidx.databinding.adapters;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.c1;

/* compiled from: ViewGroupBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @androidx.databinding.g(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @androidx.databinding.g(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
/* loaded from: classes.dex */
public class k0 {

    /* compiled from: ViewGroupBindingAdapter.java */
    class a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ f f6064o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ g f6065p;

        a(f fVar, g gVar) {
            this.f6064o = fVar;
            this.f6065p = gVar;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            f fVar = this.f6064o;
            if (fVar != null) {
                fVar.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            g gVar = this.f6065p;
            if (gVar != null) {
                gVar.onChildViewRemoved(view, view2);
            }
        }
    }

    /* compiled from: ViewGroupBindingAdapter.java */
    class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f6066a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f6067b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f6068c;

        b(e eVar, c cVar, d dVar) {
            this.f6066a = eVar;
            this.f6067b = cVar;
            this.f6068c = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = this.f6067b;
            if (cVar != null) {
                cVar.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            d dVar = this.f6068c;
            if (dVar != null) {
                dVar.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            e eVar = this.f6066a;
            if (eVar != null) {
                eVar.onAnimationStart(animation);
            }
        }
    }

    /* compiled from: ViewGroupBindingAdapter.java */
    public interface c {
        void onAnimationEnd(Animation animation);
    }

    /* compiled from: ViewGroupBindingAdapter.java */
    public interface d {
        void onAnimationRepeat(Animation animation);
    }

    /* compiled from: ViewGroupBindingAdapter.java */
    public interface e {
        void onAnimationStart(Animation animation);
    }

    /* compiled from: ViewGroupBindingAdapter.java */
    public interface f {
        void onChildViewAdded(View view, View view2);
    }

    /* compiled from: ViewGroupBindingAdapter.java */
    public interface g {
        void onChildViewRemoved(View view, View view2);
    }

    @androidx.databinding.d({"android:animateLayoutChanges"})
    @TargetApi(11)
    public static void a(ViewGroup viewGroup, boolean z5) {
        if (z5) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    public static void b(ViewGroup viewGroup, e eVar, c cVar, d dVar) {
        if (eVar == null && cVar == null && dVar == null) {
            viewGroup.setLayoutAnimationListener(null);
        } else {
            viewGroup.setLayoutAnimationListener(new b(eVar, cVar, dVar));
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    public static void c(ViewGroup viewGroup, f fVar, g gVar) {
        if (fVar == null && gVar == null) {
            viewGroup.setOnHierarchyChangeListener(null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new a(fVar, gVar));
        }
    }
}
