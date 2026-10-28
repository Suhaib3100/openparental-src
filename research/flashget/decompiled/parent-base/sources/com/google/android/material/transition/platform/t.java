package com.google.android.material.transition.platform;

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
import androidx.annotation.x0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import s8.a;

/* compiled from: SlideDistanceProvider.java */
@x0(21)
/* loaded from: classes6.dex */
public final class t implements w {

    /* renamed from: c, reason: collision with root package name */
    private static final int f54794c = -1;

    /* renamed from: a, reason: collision with root package name */
    private int f54795a;

    /* renamed from: b, reason: collision with root package name */
    @u0
    private int f54796b = -1;

    /* compiled from: SlideDistanceProvider.java */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54797b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54798c;

        a(View view, float f4) {
            this.f54797b = view;
            this.f54798c = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54797b.setTranslationX(this.f54798c);
        }
    }

    /* compiled from: SlideDistanceProvider.java */
    static class b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54800c;

        b(View view, float f4) {
            this.f54799b = view;
            this.f54800c = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54799b.setTranslationY(this.f54800c);
        }
    }

    /* compiled from: SlideDistanceProvider.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public t(int i4) {
        this.f54795a = i4;
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
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf29a"), i4));
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
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf29a"), i4));
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
        int i4 = this.f54796b;
        return i4 != -1 ? i4 : context.getResources().getDimensionPixelSize(a.f.t6);
    }

    private static boolean j(View view) {
        return x1.c0(view) == 1;
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator a(@o0 ViewGroup viewGroup, @o0 View view) {
        return d(viewGroup, view, this.f54795a, h(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        return c(viewGroup, view, this.f54795a, h(view.getContext()));
    }

    @u0
    public int g() {
        return this.f54796b;
    }

    public int i() {
        return this.f54795a;
    }

    public void k(@u0 int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf29b"));
        }
        this.f54796b = i4;
    }

    public void l(int i4) {
        this.f54795a = i4;
    }
}
