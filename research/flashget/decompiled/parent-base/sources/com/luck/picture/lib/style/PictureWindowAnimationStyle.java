package com.luck.picture.lib.style;

import androidx.annotation.a;
import com.luck.picture.lib.R;

/* loaded from: classes6.dex */
public class PictureWindowAnimationStyle {

    @a
    public int activityEnterAnimation;

    @a
    public int activityExitAnimation;

    @a
    public int activityPreviewEnterAnimation;

    @a
    public int activityPreviewExitAnimation;

    public PictureWindowAnimationStyle() {
    }

    public static PictureWindowAnimationStyle ofDefaultWindowAnimationStyle() {
        return new PictureWindowAnimationStyle(R.anim.ps_anim_enter, R.anim.ps_anim_exit);
    }

    public int getActivityEnterAnimation() {
        return this.activityEnterAnimation;
    }

    public int getActivityExitAnimation() {
        return this.activityExitAnimation;
    }

    public int getActivityPreviewEnterAnimation() {
        return this.activityPreviewEnterAnimation;
    }

    public int getActivityPreviewExitAnimation() {
        return this.activityPreviewExitAnimation;
    }

    public void setActivityEnterAnimation(int i4) {
        this.activityEnterAnimation = i4;
    }

    public void setActivityExitAnimation(int i4) {
        this.activityExitAnimation = i4;
    }

    public void setActivityPreviewEnterAnimation(int i4) {
        this.activityPreviewEnterAnimation = i4;
    }

    public void setActivityPreviewExitAnimation(int i4) {
        this.activityPreviewExitAnimation = i4;
    }

    public PictureWindowAnimationStyle(@a int i4, @a int i5) {
        this.activityEnterAnimation = i4;
        this.activityExitAnimation = i5;
        this.activityPreviewEnterAnimation = i4;
        this.activityPreviewExitAnimation = i5;
    }
}
