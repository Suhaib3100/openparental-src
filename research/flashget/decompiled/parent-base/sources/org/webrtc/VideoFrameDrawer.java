package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

/* loaded from: classes9.dex */
public class VideoFrameDrawer {
    public static final String TAG = "VideoFrameDrawer";
    private static final Logger logger = Logger.getLogger("VideoFrameDrawer");
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    @androidx.annotation.q0
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private int renderWidth;
    private final float[] dstPoints = new float[6];
    private final Point renderSize = new Point();
    private final YuvUploader yuvUploader = new YuvUploader();
    private final Matrix renderMatrix = new Matrix();

    /* renamed from: org.webrtc.VideoFrameDrawer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class YuvUploader {

        @androidx.annotation.q0
        private ByteBuffer copyBuffer;

        @androidx.annotation.q0
        private int[] yuvTextures;

        @androidx.annotation.q0
        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        @androidx.annotation.q0
        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        @androidx.annotation.q0
        public int[] uploadYuvData(int i4, int i5, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i6 = i4 / 2;
            int[] iArr2 = {i4, i6, i6};
            int i7 = i5 / 2;
            int[] iArr3 = {i5, i7, i7};
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                if (i12 > i13) {
                    i10 = Math.max(i10, i13 * iArr3[i11]);
                }
            }
            if (i10 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i10)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i10);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i14 = 0; i14 < 3; i14++) {
                    this.yuvTextures[i14] = GlUtil.generateTexture(3553);
                }
            }
            for (int i15 = 0; i15 < 3; i15++) {
                GLES20.glActiveTexture(33984 + i15);
                GLES20.glBindTexture(3553, this.yuvTextures[i15]);
                int i16 = iArr[i15];
                int i17 = iArr2[i15];
                if (i16 == i17) {
                    byteBuffer = byteBufferArr[i15];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i15], i16, this.copyBuffer, i17, i17, iArr3[i15]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i15], iArr3[i15], 0, 6409, 5121, byteBuffer);
            }
            return this.yuvTextures;
        }

        private YuvUploader() {
        }
    }

    private void calculateTransformedRenderSize(int i4, int i5, @androidx.annotation.q0 Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i4;
            this.renderHeight = i5;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i6 = 0; i6 < 3; i6++) {
            float[] fArr = this.dstPoints;
            int i7 = i6 * 2;
            fArr[i7] = fArr[i7] * i4;
            int i10 = i7 + 1;
            fArr[i10] = fArr[i10] * i5;
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f4, float f5, float f6, float f7) {
        return (int) Math.round(Math.hypot(f6 - f4, f7 - f5));
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i4, int i5, int i6, int i7, int i10, int i11) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i12 = AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i12 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i4, i5, i6, i7, i10, i11);
        } else {
            if (i12 != 2) {
                throw new RuntimeException("Unknown texture type.");
            }
            glDrawer.drawRgb(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i4, i5, i6, i7, i10, i11);
        }
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    public VideoFrame.Buffer prepareBufferForViewportSize(VideoFrame.Buffer buffer, int i4, int i5) {
        buffer.retain();
        return buffer;
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, @androidx.annotation.q0 Matrix matrix, int i4, int i5, int i6, int i7) {
        calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
        if (this.renderWidth > 0 && this.renderHeight > 0) {
            boolean z4 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!z4) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate(videoFrame.getRotation());
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (z4) {
                this.lastI420Frame = null;
                drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i4, i5, i6, i7);
                return;
            }
            if (videoFrame != this.lastI420Frame) {
                this.lastI420Frame = videoFrame;
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                this.yuvUploader.uploadFromBuffer(i420);
                i420.release();
            }
            glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i4, i5, i6, i7);
            return;
        }
        logger.warn("Illegal frame size: " + this.renderWidth + "x" + this.renderHeight);
    }
}
