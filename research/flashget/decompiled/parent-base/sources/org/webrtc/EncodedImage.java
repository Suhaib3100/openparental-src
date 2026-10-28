package org.webrtc;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class EncodedImage implements RefCounted {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;

    @androidx.annotation.q0
    public final Integer qp;
    private final RefCountDelegate refCountDelegate;
    public final int rotation;

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;

        @androidx.annotation.q0
        private Integer qp;

        @androidx.annotation.q0
        private Runnable releaseCallback;
        private int rotation;

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.releaseCallback, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.qp);
        }

        public Builder setBuffer(ByteBuffer byteBuffer, @androidx.annotation.q0 Runnable runnable) {
            this.buffer = byteBuffer;
            this.releaseCallback = runnable;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j4) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j4);
            return this;
        }

        public Builder setCaptureTimeNs(long j4) {
            this.captureTimeNs = j4;
            return this;
        }

        public Builder setEncodedHeight(int i4) {
            this.encodedHeight = i4;
            return this;
        }

        public Builder setEncodedWidth(int i4) {
            this.encodedWidth = i4;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(@androidx.annotation.q0 Integer num) {
            this.qp = num;
            return this;
        }

        public Builder setRotation(int i4) {
            this.rotation = i4;
            return this;
        }

        private Builder() {
        }
    }

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);

        private final int nativeIndex;

        FrameType(int i4) {
            this.nativeIndex = i4;
        }

        @CalledByNative("FrameType")
        static FrameType fromNativeIndex(int i4) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i4) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a("Unknown native frame type: ", i4));
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @CalledByNative
    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    @CalledByNative
    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    @CalledByNative
    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    @CalledByNative
    private int getFrameType() {
        return this.frameType.getNative();
    }

    @androidx.annotation.q0
    @CalledByNative
    private Integer getQp() {
        return this.qp;
    }

    @CalledByNative
    private int getRotation() {
        return this.rotation;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @CalledByNative
    private EncodedImage(ByteBuffer byteBuffer, @androidx.annotation.q0 Runnable runnable, int i4, int i5, long j4, FrameType frameType, int i6, @androidx.annotation.q0 Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i4;
        this.encodedHeight = i5;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j4);
        this.captureTimeNs = j4;
        this.frameType = frameType;
        this.rotation = i6;
        this.qp = num;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
