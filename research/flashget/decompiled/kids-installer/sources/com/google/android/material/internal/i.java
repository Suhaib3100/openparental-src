package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f13684a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @q0
    private b f13685b = null;

    /* renamed from: c, reason: collision with root package name */
    @q0
    ValueAnimator f13686c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f13687d = new a();

    /* compiled from: StateListAnimator.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            if (iVar.f13686c == animator) {
                iVar.f13686c = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int[] f13689a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f13690b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f13689a = iArr;
            this.f13690b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f13686c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13686c = null;
        }
    }

    private void e(@o0 b bVar) {
        ValueAnimator valueAnimator = bVar.f13690b;
        this.f13686c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f13687d);
        this.f13684a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f13686c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f13686c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f13684a.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f13684a.get(i5);
            if (StateSet.stateSetMatches(bVar.f13689a, iArr)) {
                break;
            } else {
                i5++;
            }
        }
        b bVar2 = this.f13685b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f13685b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}
