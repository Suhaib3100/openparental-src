package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: AlphaInAnimation.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/chad/library/adapter/base/animation/AlphaInAnimation;", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "mFrom", "", "(F)V", "animators", "", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "(Landroid/view/View;)[Landroid/animation/Animator;", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes3.dex */
public final class AlphaInAnimation implements BaseAnimation {
    private static final float DEFAULT_ALPHA_FROM = 0.0f;
    private final float mFrom;

    @j
    public AlphaInAnimation() {
        this(0.0f, 1, null);
    }

    @Override // com.chad.library.adapter.base.animation.BaseAnimation
    @l
    public Animator[] animators(@l View view) {
        l0.q(view, ProtectedSandApp.s("ຳ"));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ProtectedSandApp.s("ິ"), this.mFrom, 1.0f);
        l0.h(ofFloat, ProtectedSandApp.s("ີ"));
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        return new Animator[]{ofFloat};
    }

    @j
    public AlphaInAnimation(float f4) {
        this.mFrom = f4;
    }

    public /* synthetic */ AlphaInAnimation(float f4, int i4, w wVar) {
        this((i4 & 1) != 0 ? 0.0f : f4);
    }
}
