package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* loaded from: classes9.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i4, int i5, ByteBuffer byteBuffer, int i6, ByteBuffer byteBuffer2, int i7, ByteBuffer byteBuffer3, int i10, @androidx.annotation.q0 Runnable runnable) {
        this.width = i4;
        this.height = i5;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i6;
        this.strideU = i7;
        this.strideV = i10;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i4, int i5) {
        int i6 = (i5 + 1) / 2;
        int i7 = (i4 + 1) / 2;
        int i10 = i4 * i5;
        int i11 = i7 * i6;
        int i12 = i10 + i11;
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i7 * 2 * i6) + i10);
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i10);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i10);
        nativeAllocateByteBuffer.limit(i12);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i12);
        nativeAllocateByteBuffer.limit(i12 + i11);
        return new JavaI420Buffer(i4, i5, slice, i4, slice2, i7, nativeAllocateByteBuffer.slice(), i7, new Runnable() { // from class: org.webrtc.f0
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
            }
        });
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i4, int i5, int i6) {
        byteBuffer.capacity();
    }

    public static VideoFrame.Buffer cropAndScaleI420(final VideoFrame.I420Buffer i420Buffer, int i4, int i5, int i6, int i7, int i10, int i11) {
        if (i6 == i10 && i7 == i11) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            dataY.position((i420Buffer.getStrideY() * i5) + i4);
            int i12 = i4 / 2;
            int i13 = i5 / 2;
            dataU.position((i420Buffer.getStrideU() * i13) + i12);
            dataV.position((i420Buffer.getStrideV() * i13) + i12);
            i420Buffer.retain();
            return wrap(i10, i11, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new Runnable() { // from class: org.webrtc.e0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFrame.I420Buffer.this.release();
                }
            });
        }
        JavaI420Buffer allocate = allocate(i10, i11);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i4, i5, i6, i7, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i10, i11);
        return allocate;
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, int i7, int i10, int i11, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17);

    public static JavaI420Buffer wrap(int i4, int i5, ByteBuffer byteBuffer, int i6, ByteBuffer byteBuffer2, int i7, ByteBuffer byteBuffer3, int i10, @androidx.annotation.q0 Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        ByteBuffer slice = byteBuffer.slice();
        ByteBuffer slice2 = byteBuffer2.slice();
        ByteBuffer slice3 = byteBuffer3.slice();
        int i11 = (i4 + 1) / 2;
        int i12 = (i5 + 1) / 2;
        checkCapacity(slice, i4, i5, i6);
        checkCapacity(slice2, i11, i12, i7);
        checkCapacity(slice3, i11, i12, i10);
        return new JavaI420Buffer(i4, i5, slice, i6, slice2, i7, slice3, i10, runnable);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i4, int i5, int i6, int i7, int i10, int i11) {
        return cropAndScaleI420(this, i4, i5, i6, i7, i10, i11);
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
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
        retain();
        return this;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420WithoutRetain() {
        return this;
    }
}
