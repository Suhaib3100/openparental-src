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
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f53479a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @q0
    private b f53480b = null;

    /* renamed from: c, reason: collision with root package name */
    @q0
    ValueAnimator f53481c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f53482d = new a();

    /* compiled from: StateListAnimator.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            if (iVar.f53481c == animator) {
                iVar.f53481c = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int[] f53484a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f53485b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f53484a = iArr;
            this.f53485b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f53481c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f53481c = null;
        }
    }

    private void e(@o0 b bVar) {
        ValueAnimator valueAnimator = bVar.f53485b;
        this.f53481c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f53482d);
        this.f53479a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f53481c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f53481c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f53479a.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f53479a.get(i4);
            if (StateSet.stateSetMatches(bVar.f53484a, iArr)) {
                break;
            } else {
                i4++;
            }
        }
        b bVar2 = this.f53480b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f53480b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}
