package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SlideInRightAnimation.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/chad/library/adapter/base/animation/SlideInRightAnimation;", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "()V", "animators", "", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "(Landroid/view/View;)[Landroid/animation/Animator;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes3.dex */
public final class SlideInRightAnimation implements BaseAnimation {
    @Override // com.chad.library.adapter.base.animation.BaseAnimation
    @l
    public Animator[] animators(@l View view) {
        l0.q(view, ProtectedSandApp.s("ເ"));
        l0.h(view.getRootView(), ProtectedSandApp.s("ແ"));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ProtectedSandApp.s("ໂ"), r0.getWidth(), 0.0f);
        l0.h(ofFloat, ProtectedSandApp.s("ໃ"));
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.8f));
        return new Animator[]{ofFloat};
    }
}
