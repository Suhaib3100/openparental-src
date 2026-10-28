package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;

/* loaded from: classes9.dex */
public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    /* renamed from: org.webrtc.RendererCommon$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[ScalingType.values().length];
            $SwitchMap$org$webrtc$RendererCommon$ScalingType = iArr;
            try {
                iArr[ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface GlDrawer {
        void drawOes(int i4, float[] fArr, int i5, int i6, int i7, int i10, int i11, int i12);

        void drawRgb(int i4, float[] fArr, int i5, int i6, int i7, int i10, int i11, int i12);

        void drawYuv(int[] iArr, float[] fArr, int i4, int i5, int i6, int i7, int i10, int i11);

        void release();
    }

    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i4, int i5, int i6);
    }

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    public static class VideoLayoutMeasure {
        private float visibleFractionMatchOrientation;
        private float visibleFractionMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
        }

        public Point measure(int i4, int i5, int i6, int i7) {
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i4);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i5);
            if (i6 == 0 || i7 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f4 = i6 / i7;
            Point displaySize = RendererCommon.getDisplaySize(((f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1)) > 0) == (((float) defaultSize) / ((float) defaultSize2) > 1.0f) ? this.visibleFractionMatchOrientation : this.visibleFractionMismatchOrientation, f4, defaultSize, defaultSize2);
            if (View.MeasureSpec.getMode(i4) == 1073741824) {
                displaySize.x = defaultSize;
            }
            if (View.MeasureSpec.getMode(i5) == 1073741824) {
                displaySize.y = defaultSize2;
            }
            return displaySize;
        }

        public void setScalingType(ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }

        public void setVisibleFraction(float f4, float f5) {
            this.visibleFractionMatchOrientation = f4;
            this.visibleFractionMismatchOrientation = f5;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType2);
        }
    }

    private static void adjustOrigin(float[] fArr) {
        float f4 = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f4;
        float f5 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f5;
        fArr[12] = f4 + 0.5f;
        fArr[13] = f5 + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int i4 = AnonymousClass1.$SwitchMap$org$webrtc$RendererCommon$ScalingType[scalingType.ordinal()];
        if (i4 == 1) {
            return 1.0f;
        }
        if (i4 == 2) {
            return 0.0f;
        }
        if (i4 == 3) {
            return BALANCED_VISIBLE_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    public static Point getDisplaySize(ScalingType scalingType, float f4, int i4, int i5) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f4, i4, i5);
    }

    public static float[] getLayoutMatrix(boolean z4, float f4, float f5) {
        float f6;
        float f7;
        if (f5 > f4) {
            f7 = f4 / f5;
            f6 = 1.0f;
        } else {
            f6 = f5 / f4;
            f7 = 1.0f;
        }
        if (z4) {
            f6 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f6, f7, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(float f4, float f5, int i4, int i5) {
        return (f4 == 0.0f || f5 == 0.0f) ? new Point(i4, i5) : new Point(Math.min(i4, Math.round((i5 / f4) * f5)), Math.min(i5, Math.round((i4 / f4) / f5)));
    }
}
