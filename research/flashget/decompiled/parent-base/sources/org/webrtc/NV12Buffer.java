package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* loaded from: classes9.dex */
public class NV12Buffer implements VideoFrame.Buffer {
    private final ByteBuffer buffer;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int sliceHeight;
    private final int stride;
    private final int width;

    public NV12Buffer(int i4, int i5, int i6, int i7, ByteBuffer byteBuffer, @androidx.annotation.q0 Runnable runnable) {
        this.width = i4;
        this.height = i5;
        this.stride = i6;
        this.sliceHeight = i7;
        this.buffer = byteBuffer;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i4, int i5, int i6, int i7, int i10, int i11, ByteBuffer byteBuffer, int i12, int i13, int i14, int i15, ByteBuffer byteBuffer2, int i16, ByteBuffer byteBuffer3, int i17, ByteBuffer byteBuffer4, int i18);

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i4, int i5, int i6, int i7, int i10, int i11) {
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i10, i11);
        nativeCropAndScale(i4, i5, i6, i7, i10, i11, this.buffer, this.width, this.height, this.stride, this.sliceHeight, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        return allocate;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i4 = this.width;
        int i5 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i4, i5, i4, i5);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420WithoutRetain() {
        int i4 = this.width;
        int i5 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i4, i5, i4, i5);
    }
}
