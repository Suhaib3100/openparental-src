package com.tencent.liteav.beauty;

import android.graphics.Bitmap;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::manager")
/* loaded from: classes7.dex */
public class TXBeautyManagerImpl implements TXBeautyManager {
    private long mNativeBeautyManager;

    public TXBeautyManagerImpl(long j4) {
        this.mNativeBeautyManager = j4;
    }

    private static native void nativeDestroy(long j4);

    private static native void nativeEnableSharpnessEnhancement(long j4, boolean z4);

    private static native void nativeSetBeautyLevel(long j4, float f4);

    private static native void nativeSetBeautyStyle(long j4, int i4);

    private static native int nativeSetChinLevel(long j4, float f4);

    private static native int nativeSetEyeAngleLevel(long j4, float f4);

    private static native int nativeSetEyeDistanceLevel(long j4, float f4);

    private static native int nativeSetEyeLightenLevel(long j4, float f4);

    private static native int nativeSetEyeScaleLevel(long j4, float f4);

    private static native int nativeSetFaceBeautyLevel(long j4, float f4);

    private static native int nativeSetFaceNarrowLevel(long j4, float f4);

    private static native int nativeSetFaceShortLevel(long j4, float f4);

    private static native int nativeSetFaceSlimLevel(long j4, float f4);

    private static native int nativeSetFaceVLevel(long j4, float f4);

    private static native void nativeSetFilter(long j4, Bitmap bitmap);

    private static native void nativeSetFilterStrength(long j4, float f4);

    private static native int nativeSetForeheadLevel(long j4, float f4);

    private static native int nativeSetGreenScreenFile(long j4, String str);

    private static native int nativeSetLipsThicknessLevel(long j4, float f4);

    private static native void nativeSetMotionMute(long j4, boolean z4);

    private static native void nativeSetMotionTmpl(long j4, String str);

    private static native int nativeSetMouthShapeLevel(long j4, float f4);

    private static native int nativeSetNosePositionLevel(long j4, float f4);

    private static native int nativeSetNoseSlimLevel(long j4, float f4);

    private static native int nativeSetNoseWingLevel(long j4, float f4);

    private static native int nativeSetPounchRemoveLevel(long j4, float f4);

    private static native void nativeSetRuddyLevel(long j4, float f4);

    private static native int nativeSetSmileLinesRemoveLevel(long j4, float f4);

    private static native int nativeSetToothWhitenLevel(long j4, float f4);

    private static native void nativeSetWhitenessLevel(long j4, float f4);

    private static native int nativeSetWrinkleRemoveLevel(long j4, float f4);

    public void clear() {
        this.mNativeBeautyManager = 0L;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void enableSharpnessEnhancement(boolean z4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 != 0) {
            nativeEnableSharpnessEnhancement(j4, z4);
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        long j4 = this.mNativeBeautyManager;
        if (j4 != 0) {
            nativeDestroy(j4);
            this.mNativeBeautyManager = 0L;
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 != 0) {
            nativeSetBeautyLevel(j4, f4);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyStyle(int i4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 != 0) {
            nativeSetBeautyStyle(j4, i4);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setChinLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetChinLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeAngleLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetEyeAngleLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeDistanceLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetEyeDistanceLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeLightenLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetEyeLightenLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeScaleLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetEyeScaleLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceBeautyLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetFaceBeautyLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceNarrowLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetFaceNarrowLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceShortLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetFaceShortLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceSlimLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetFaceSlimLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceVLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetFaceVLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilter(Bitmap bitmap) {
        long j4 = this.mNativeBeautyManager;
        if (j4 != 0) {
            nativeSetFilter(j4, bitmap);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilterStrength(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 != 0) {
            nativeSetFilterStrength(j4, f4);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setForeheadLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetForeheadLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setGreenScreenFile(String str) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetGreenScreenFile(j4, str);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setLipsThicknessLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetLipsThicknessLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionMute(boolean z4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 != 0) {
            nativeSetMotionMute(j4, z4);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionTmpl(String str) {
        long j4 = this.mNativeBeautyManager;
        if (j4 != 0) {
            nativeSetMotionTmpl(j4, str);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setMouthShapeLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetMouthShapeLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNosePositionLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetNosePositionLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNoseSlimLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetNoseSlimLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNoseWingLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetNoseWingLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setPounchRemoveLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetPounchRemoveLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setRuddyLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 != 0) {
            nativeSetRuddyLevel(j4, f4);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setSmileLinesRemoveLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetSmileLinesRemoveLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setToothWhitenLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetToothWhitenLevel(j4, f4);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setWhitenessLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 != 0) {
            nativeSetWhitenessLevel(j4, f4);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setWrinkleRemoveLevel(float f4) {
        long j4 = this.mNativeBeautyManager;
        if (j4 == 0) {
            return 0;
        }
        nativeSetWrinkleRemoveLevel(j4, f4);
        return 0;
    }
}
