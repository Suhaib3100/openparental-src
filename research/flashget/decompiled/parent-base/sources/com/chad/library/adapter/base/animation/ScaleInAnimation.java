package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: ScaleInAnimation.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/chad/library/adapter/base/animation/ScaleInAnimation;", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "mFrom", "", "(F)V", "animators", "", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "(Landroid/view/View;)[Landroid/animation/Animator;", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes3.dex */
public final class ScaleInAnimation implements BaseAnimation {
    private static final float DEFAULT_SCALE_FROM = 0.5f;
    private final float mFrom;

    @j
    public ScaleInAnimation() {
        this(0.0f, 1, null);
    }

    @Override // com.chad.library.adapter.base.animation.BaseAnimation
    @l
    public Animator[] animators(@l View view) {
        l0.q(view, ProtectedSandApp.s("ຶ"));
        float[] fArr = {this.mFrom, 1.0f};
        String s4 = ProtectedSandApp.s("ື");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, s4, fArr);
        l0.h(ofFloat, s4);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        float[] fArr2 = {this.mFrom, 1.0f};
        String s5 = ProtectedSandApp.s("ຸ");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, s5, fArr2);
        l0.h(ofFloat2, s5);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        return new Animator[]{ofFloat, ofFloat2};
    }

    @j
    public ScaleInAnimation(float f4) {
        this.mFrom = f4;
    }

    public /* synthetic */ ScaleInAnimation(float f4, int i4, w wVar) {
        this((i4 & 1) != 0 ? 0.5f : f4);
    }
}
