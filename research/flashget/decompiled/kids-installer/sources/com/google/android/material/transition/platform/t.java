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
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import n1.a;

/* compiled from: SlideDistanceProvider.java */
@x0(21)
/* loaded from: classes3.dex */
public final class t implements w {

    /* renamed from: c, reason: collision with root package name */
    private static final int f14955c = -1;

    /* renamed from: a, reason: collision with root package name */
    private int f14956a;

    /* renamed from: b, reason: collision with root package name */
    @u0
    private int f14957b = -1;

    /* compiled from: SlideDistanceProvider.java */
    /* loaded from: classes2.dex */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14958a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14959b;

        a(View view, float f6) {
            this.f14958a = view;
            this.f14959b = f6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14958a.setTranslationX(this.f14959b);
        }
    }

    /* compiled from: SlideDistanceProvider.java */
    /* loaded from: classes2.dex */
    static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14960a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14961b;

        b(View view, float f6) {
            this.f14960a = view;
            this.f14961b = f6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14960a.setTranslationY(this.f14961b);
        }
    }

    /* compiled from: SlideDistanceProvider.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
    }

    public t(int i5) {
        this.f14956a = i5;
    }

    private static Animator c(View view, View view2, int i5, @u0 int i6) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i5 == 3) {
            return e(view2, i6 + translationX, translationX, translationX);
        }
        if (i5 == 5) {
            return e(view2, translationX - i6, translationX, translationX);
        }
        if (i5 == 48) {
            return f(view2, translationY - i6, translationY, translationY);
        }
        if (i5 == 80) {
            return f(view2, i6 + translationY, translationY, translationY);
        }
        if (i5 == 8388611) {
            return e(view2, j(view) ? i6 + translationX : translationX - i6, translationX, translationX);
        }
        if (i5 == 8388613) {
            return e(view2, j(view) ? translationX - i6 : i6 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("❮"), i5));
    }

    private static Animator d(View view, View view2, int i5, @u0 int i6) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i5 == 3) {
            return e(view2, translationX, translationX - i6, translationX);
        }
        if (i5 == 5) {
            return e(view2, translationX, i6 + translationX, translationX);
        }
        if (i5 == 48) {
            return f(view2, translationY, i6 + translationY, translationY);
        }
        if (i5 == 80) {
            return f(view2, translationY, translationY - i6, translationY);
        }
        if (i5 == 8388611) {
            return e(view2, translationX, j(view) ? translationX - i6 : i6 + translationX, translationX);
        }
        if (i5 == 8388613) {
            return e(view2, translationX, j(view) ? i6 + translationX : translationX - i6, translationX);
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("❯"), i5));
    }

    private static Animator e(View view, float f6, float f7, float f8) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f6, f7));
        ofPropertyValuesHolder.addListener(new a(view, f8));
        return ofPropertyValuesHolder;
    }

    private static Animator f(View view, float f6, float f7, float f8) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f7));
        ofPropertyValuesHolder.addListener(new b(view, f8));
        return ofPropertyValuesHolder;
    }

    private int h(Context context) {
        int i5 = this.f14957b;
        return i5 != -1 ? i5 : context.getResources().getDimensionPixelSize(a.f.t6);
    }

    private static boolean j(View view) {
        return y1.Z(view) == 1;
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator a(@o0 ViewGroup viewGroup, @o0 View view) {
        return c(viewGroup, view, this.f14956a, h(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        return d(viewGroup, view, this.f14956a, h(view.getContext()));
    }

    @u0
    public int g() {
        return this.f14957b;
    }

    public int i() {
        return this.f14956a;
    }

    public void k(@u0 int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("❰"));
        }
        this.f14957b = i5;
    }

    public void l(int i5) {
        this.f14956a = i5;
    }
}
