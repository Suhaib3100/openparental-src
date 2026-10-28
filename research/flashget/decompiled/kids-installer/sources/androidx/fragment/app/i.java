package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.r1;
import z.a;

/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
class i {
    private i() {
    }

    @androidx.annotation.a
    private static int a(Fragment fragment, boolean z5, boolean z6) {
        return z6 ? z5 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z5 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    static a b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Fragment fragment, boolean z5, boolean z6) {
        int nextTransition = fragment.getNextTransition();
        int a6 = a(fragment, z5, z6);
        boolean z7 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i5 = a.c.f34377c;
            if (viewGroup.getTag(i5) != null) {
                fragment.mContainer.setTag(i5, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z5, a6);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z5, a6);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (a6 == 0 && nextTransition != 0) {
            a6 = d(context, nextTransition, z5);
        }
        if (a6 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a6));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a6);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                    z7 = true;
                } catch (Resources.NotFoundException e6) {
                    throw e6;
                } catch (RuntimeException unused) {
                }
            }
            if (!z7) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, a6);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e7) {
                    if (equals) {
                        throw e7;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a6);
                    if (loadAnimation2 != null) {
                        return new a(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    @androidx.annotation.a
    private static int c(@androidx.annotation.o0 Context context, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i5});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @androidx.annotation.a
    private static int d(@androidx.annotation.o0 Context context, int i5, boolean z5) {
        if (i5 == 4097) {
            return z5 ? a.b.f34373e : a.b.f34374f;
        }
        if (i5 == 8194) {
            return z5 ? a.b.f34369a : a.b.f34370b;
        }
        if (i5 == 8197) {
            return z5 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i5 == 4099) {
            return z5 ? a.b.f34371c : a.b.f34372d;
        }
        if (i5 != 4100) {
            return -1;
        }
        return z5 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* compiled from: FragmentAnim.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f8284a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f8285b;

        a(Animation animation) {
            this.f8284a = animation;
            this.f8285b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f8284a = null;
            this.f8285b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim.java */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final ViewGroup f8286o;

        /* renamed from: p, reason: collision with root package name */
        private final View f8287p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f8288q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f8289r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f8290s;

        b(@androidx.annotation.o0 Animation animation, @androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 View view) {
            super(false);
            this.f8290s = true;
            this.f8286o = viewGroup;
            this.f8287p = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j5, @androidx.annotation.o0 Transformation transformation) {
            this.f8290s = true;
            if (this.f8288q) {
                return !this.f8289r;
            }
            if (!super.getTransformation(j5, transformation)) {
                this.f8288q = true;
                r1.a(this.f8286o, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8288q || !this.f8290s) {
                this.f8286o.endViewTransition(this.f8287p);
                this.f8289r = true;
            } else {
                this.f8290s = false;
                this.f8286o.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j5, @androidx.annotation.o0 Transformation transformation, float f6) {
            this.f8290s = true;
            if (this.f8288q) {
                return !this.f8289r;
            }
            if (!super.getTransformation(j5, transformation, f6)) {
                this.f8288q = true;
                r1.a(this.f8286o, this);
            }
            return true;
        }
    }
}
