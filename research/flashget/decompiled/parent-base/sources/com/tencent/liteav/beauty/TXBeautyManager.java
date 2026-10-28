package com.tencent.liteav.beauty;

import android.graphics.Bitmap;

/* loaded from: classes7.dex */
public interface TXBeautyManager {
    public static final int TXBeautyStyleNature = 1;
    public static final int TXBeautyStylePitu = 2;
    public static final int TXBeautyStyleSmooth = 0;

    void enableSharpnessEnhancement(boolean z4);

    void setBeautyLevel(float f4);

    void setBeautyStyle(int i4);

    int setChinLevel(float f4);

    int setEyeAngleLevel(float f4);

    int setEyeDistanceLevel(float f4);

    int setEyeLightenLevel(float f4);

    int setEyeScaleLevel(float f4);

    int setFaceBeautyLevel(float f4);

    int setFaceNarrowLevel(float f4);

    int setFaceShortLevel(float f4);

    int setFaceSlimLevel(float f4);

    int setFaceVLevel(float f4);

    void setFilter(Bitmap bitmap);

    void setFilterStrength(float f4);

    int setForeheadLevel(float f4);

    int setGreenScreenFile(String str);

    int setLipsThicknessLevel(float f4);

    void setMotionMute(boolean z4);

    void setMotionTmpl(String str);

    int setMouthShapeLevel(float f4);

    int setNosePositionLevel(float f4);

    int setNoseSlimLevel(float f4);

    int setNoseWingLevel(float f4);

    int setPounchRemoveLevel(float f4);

    void setRuddyLevel(float f4);

    int setSmileLinesRemoveLevel(float f4);

    int setToothWhitenLevel(float f4);

    void setWhitenessLevel(float f4);

    int setWrinkleRemoveLevel(float f4);
}
