package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.List;

/* compiled from: AnimatorSetCompat.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b {
    public static void a(@o0 AnimatorSet animatorSet, @o0 List<Animator> list) {
        int size = list.size();
        long j5 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Animator animator = list.get(i5);
            j5 = Math.max(j5, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j5);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
