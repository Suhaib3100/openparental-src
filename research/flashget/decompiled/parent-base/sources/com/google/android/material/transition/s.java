package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import s8.a;

/* compiled from: SlideDistanceProvider.java */
/* loaded from: classes6.dex */
public final class s implements v {

    /* renamed from: c, reason: collision with root package name */
    private static final int f54825c = -1;

    /* renamed from: a, reason: collision with root package name */
    private int f54826a;

    /* renamed from: b, reason: collision with root package name */
    @u0
    private int f54827b = -1;

    /* compiled from: SlideDistanceProvider.java */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54828b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54829c;

        a(View view, float f4) {
            this.f54828b = view;
            this.f54829c = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54828b.setTranslationX(this.f54829c);
        }
    }

    /* compiled from: SlideDistanceProvider.java */
    static class b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54830b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54831c;

        b(View view, float f4) {
            this.f54830b = view;
            this.f54831c = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54830b.setTranslationY(this.f54831c);
        }
    }

    /* compiled from: SlideDistanceProvider.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public s(int i4) {
        this.f54826a = i4;
    }

    private static Animator c(View view, View view2, int i4, @u0 int i5) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i4 == 3) {
            return e(view2, i5 + translationX, translationX, translationX);
        }
        if (i4 == 5) {
            return e(view2, translationX - i5, translationX, translationX);
        }
        if (i4 == 48) {
            return f(view2, translationY - i5, translationY, translationY);
        }
        if (i4 == 80) {
            return f(view2, i5 + translationY, translationY, translationY);
        }
        if (i4 == 8388611) {
            return e(view2, j(view) ? i5 + translationX : translationX - i5, translationX, translationX);
        }
        if (i4 == 8388613) {
            return e(view2, j(view) ? translationX - i5 : i5 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf2a8"), i4));
    }

    private static Animator d(View view, View view2, int i4, @u0 int i5) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i4 == 3) {
            return e(view2, translationX, translationX - i5, translationX);
        }
        if (i4 == 5) {
            return e(view2, translationX, i5 + translationX, translationX);
        }
        if (i4 == 48) {
            return f(view2, translationY, i5 + translationY, translationY);
        }
        if (i4 == 80) {
            return f(view2, translationY, translationY - i5, translationY);
        }
        if (i4 == 8388611) {
            return e(view2, translationX, j(view) ? translationX - i5 : i5 + translationX, translationX);
        }
        if (i4 == 8388613) {
            return e(view2, translationX, j(view) ? i5 + translationX : translationX - i5, translationX);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf2a8"), i4));
    }

    private static Animator e(View view, float f4, float f5, float f6) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f4, f5));
        ofPropertyValuesHolder.addListener(new a(view, f6));
        return ofPropertyValuesHolder;
    }

    private static Animator f(View view, float f4, float f5, float f6) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f4, f5));
        ofPropertyValuesHolder.addListener(new b(view, f6));
        return ofPropertyValuesHolder;
    }

    private int h(Context context) {
        int i4 = this.f54827b;
        return i4 != -1 ? i4 : context.getResources().getDimensionPixelSize(a.f.t6);
    }

    private static boolean j(View view) {
        return x1.c0(view) == 1;
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator a(@o0 ViewGroup viewGroup, @o0 View view) {
        return d(viewGroup, view, this.f54826a, h(view.getContext()));
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        return c(viewGroup, view, this.f54826a, h(view.getContext()));
    }

    @u0
    public int g() {
        return this.f54827b;
    }

    public int i() {
        return this.f54826a;
    }

    public void k(@u0 int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf2a9"));
        }
        this.f54827b = i4;
    }

    public void l(int i4) {
        this.f54826a = i4;
    }
}
