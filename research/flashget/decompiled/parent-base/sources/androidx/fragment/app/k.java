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
import androidx.core.view.g1;
import v1.a;

/* compiled from: FragmentAnim.java */
/* loaded from: classes3.dex */
class k {
    private k() {
    }

    @androidx.annotation.a
    private static int a(Fragment fragment, boolean z4, boolean z5) {
        return z5 ? z4 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z4 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    static a b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Fragment fragment, boolean z4, boolean z5) {
        int nextTransition = fragment.getNextTransition();
        int a5 = a(fragment, z4, z5);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i4 = a.c.f92821c;
            if (viewGroup.getTag(i4) != null) {
                fragment.mContainer.setTag(i4, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z4, a5);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z4, a5);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (a5 == 0 && nextTransition != 0) {
            a5 = d(context, nextTransition, z4);
        }
        if (a5 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a5));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a5);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e4) {
                    throw e4;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, a5);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e5) {
                if (equals) {
                    throw e5;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a5);
                if (loadAnimation2 != null) {
                    return new a(loadAnimation2);
                }
            }
        }
        return null;
    }

    @androidx.annotation.a
    private static int c(@androidx.annotation.o0 Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i4});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @androidx.annotation.a
    private static int d(@androidx.annotation.o0 Context context, int i4, boolean z4) {
        if (i4 == 4097) {
            return z4 ? a.b.f92817e : a.b.f92818f;
        }
        if (i4 == 8194) {
            return z4 ? a.b.f92813a : a.b.f92814b;
        }
        if (i4 == 8197) {
            return z4 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i4 == 4099) {
            return z4 ? a.b.f92815c : a.b.f92816d;
        }
        if (i4 != 4100) {
            return -1;
        }
        return z4 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* compiled from: FragmentAnim.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f29977a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f29978b;

        a(Animation animation) {
            this.f29977a = animation;
            this.f29978b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f29977a = null;
            this.f29978b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim.java */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final ViewGroup f29979b;

        /* renamed from: c, reason: collision with root package name */
        private final View f29980c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f29981d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f29982e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f29983f;

        b(@androidx.annotation.o0 Animation animation, @androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 View view) {
            super(false);
            this.f29983f = true;
            this.f29979b = viewGroup;
            this.f29980c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j4, @androidx.annotation.o0 Transformation transformation) {
            this.f29983f = true;
            if (this.f29981d) {
                return !this.f29982e;
            }
            if (!super.getTransformation(j4, transformation)) {
                this.f29981d = true;
                g1.a(this.f29979b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29981d || !this.f29983f) {
                this.f29979b.endViewTransition(this.f29980c);
                this.f29982e = true;
            } else {
                this.f29983f = false;
                this.f29979b.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j4, @androidx.annotation.o0 Transformation transformation, float f4) {
            this.f29983f = true;
            if (this.f29981d) {
                return !this.f29982e;
            }
            if (!super.getTransformation(j4, transformation, f4)) {
                this.f29981d = true;
                g1.a(this.f29979b, this);
            }
            return true;
        }
    }
}
