package org.webrtc;

import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private int mDensity;
    private boolean mIsScreenShare;
    private VideoQualityMode mMode;
    private int rotation;
    private final long timestampNs;

    public interface Buffer extends RefCounted {
        @CalledByNative("Buffer")
        Buffer cropAndScale(int i4, int i5, int i6, int i7, int i10, int i11);

        @CalledByNative("Buffer")
        default int getBufferType() {
            return 0;
        }

        @CalledByNative("Buffer")
        int getHeight();

        @CalledByNative("Buffer")
        int getWidth();

        @Override // org.webrtc.RefCounted
        @CalledByNative("Buffer")
        void release();

        @Override // org.webrtc.RefCounted
        @CalledByNative("Buffer")
        void retain();

        @androidx.annotation.q0
        @CalledByNative("Buffer")
        I420Buffer toI420();

        @CalledByNative("Buffer")
        I420Buffer toI420WithoutRetain();
    }

    public interface I420Buffer extends Buffer {
        @Override // org.webrtc.VideoFrame.Buffer
        default int getBufferType() {
            return 1;
        }

        @CalledByNative("I420Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I420Buffer")
        int getStrideU();

        @CalledByNative("I420Buffer")
        int getStrideV();

        @CalledByNative("I420Buffer")
        int getStrideY();
    }

    public interface TextureBuffer extends Buffer {

        public enum Type {
            OES(36197),
            RGB(3553);

            private final int glTarget;

            Type(int i4) {
                this.glTarget = i4;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        default TextureBuffer applyTransformMatrix(Matrix matrix, int i4, int i5) {
            throw new UnsupportedOperationException("Not implemented");
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();
    }

    public enum VideoQualityMode {
        MODE_RESOLUTION,
        MODE_AUTO_LIMIT_MIN_LEN,
        MODE_FAST
    }

    @CalledByNative
    public VideoFrame(Buffer buffer, int i4, long j4) {
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        }
        if (i4 % 90 != 0) {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        this.buffer = buffer;
        this.rotation = i4;
        this.timestampNs = j4;
        this.mMode = VideoQualityMode.MODE_FAST;
    }

    @CalledByNative
    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getDPI() {
        return this.mDensity;
    }

    public int getRotatedHeight() {
        return this.rotation % 180 == 0 ? this.buffer.getHeight() : this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        return this.rotation % 180 == 0 ? this.buffer.getWidth() : this.buffer.getHeight();
    }

    @CalledByNative
    public int getRotation() {
        return this.rotation;
    }

    @CalledByNative
    public long getTimestampNs() {
        return this.timestampNs;
    }

    public VideoQualityMode getVideoMode() {
        return this.mMode;
    }

    public boolean isScreenShare() {
        return this.mIsScreenShare;
    }

    @Override // org.webrtc.RefCounted
    @CalledByNative
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    public void setDPI(int i4) {
        this.mDensity = i4;
    }

    public void setIsScreenShare(boolean z4) {
        this.mIsScreenShare = z4;
    }

    public void setRotation(int i4) {
        this.rotation = i4;
    }

    public void setVideoQualityMode(VideoQualityMode videoQualityMode) {
        this.mMode = videoQualityMode;
    }
}
