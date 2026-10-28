package com.tencent.liteav.videobase.common;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.ConsumerChainTimestamp;
import com.tencent.liteav.videobase.utils.ProducerChainTimestamp;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class EncodedVideoFrame {
    private static final String TAG = ProtectedSandApp.s("哄\u0001");
    public ByteBuffer data;
    public long dts;
    public int height;
    public long pts;
    public int rotation;
    public MediaFormat videoFormat;
    public int width;
    public final ProducerChainTimestamp producerChainTimestamp = new ProducerChainTimestamp();
    public final ConsumerChainTimestamp consumerChainTimestamp = new ConsumerChainTimestamp();
    public long nativePtr = 0;
    public c nalType = c.f72209a;
    public d profileType = d.f72221a;
    public CodecType codecType = CodecType.f72197b;
    public long gopIndex = 0;
    public long gopFrameIndex = 0;
    public long frameIndex = 0;
    public long refFrameIndex = 0;
    public Integer svcInfo = null;
    public boolean isEosFrame = false;
    public b hdrType = b.f72204a;
    public MediaCodec.BufferInfo info = null;

    public static EncodedVideoFrame createEncodedVideoFrame(ByteBuffer byteBuffer, int i4, int i5, int i6, long j4, long j5, long j6, long j7, long j10, long j11, int i7, long j12, int i10, int i11, boolean z4, int i12, int i13) {
        EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
        encodedVideoFrame.data = byteBuffer;
        encodedVideoFrame.nativePtr = j12;
        encodedVideoFrame.nalType = c.a(i4);
        encodedVideoFrame.profileType = d.a(i5);
        encodedVideoFrame.codecType = CodecType.a(i7);
        encodedVideoFrame.rotation = i6;
        encodedVideoFrame.dts = j4;
        encodedVideoFrame.pts = j5;
        encodedVideoFrame.gopIndex = j6;
        encodedVideoFrame.gopFrameIndex = j7;
        encodedVideoFrame.frameIndex = j10;
        encodedVideoFrame.refFrameIndex = j11;
        encodedVideoFrame.info = null;
        encodedVideoFrame.width = i10;
        encodedVideoFrame.height = i11;
        if (z4) {
            encodedVideoFrame.svcInfo = Integer.valueOf(i12);
        } else {
            encodedVideoFrame.svcInfo = null;
        }
        encodedVideoFrame.hdrType = b.a(i13);
        return encodedVideoFrame;
    }

    private c getNalTypeFromH264NALHeader(ByteBuffer byteBuffer, int i4) {
        int i5 = byteBuffer.get(i4) & com.google.common.base.c.I;
        return i5 != 5 ? i5 != 6 ? i5 != 7 ? i5 != 8 ? c.f72209a : c.f72217i : c.f72216h : c.f72215g : c.f72210b;
    }

    private c getNalTypeFromH265NALHeader(ByteBuffer byteBuffer, int i4) {
        int i5 = (byteBuffer.get(i4) & 126) >> 1;
        if (i5 == 39) {
            return c.f72215g;
        }
        switch (i5) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return c.f72210b;
            default:
                switch (i5) {
                    case 32:
                        return c.f72218j;
                    case 33:
                        return c.f72216h;
                    case 34:
                        return c.f72217i;
                    default:
                        return c.f72209a;
                }
        }
    }

    public static int getNextNALHeaderPos(int i4, ByteBuffer byteBuffer) {
        while (true) {
            int i5 = i4 + 3;
            if (i5 >= byteBuffer.remaining()) {
                return -1;
            }
            if (byteBuffer.get(i4) == 0 && byteBuffer.get(i4 + 1) == 0 && byteBuffer.get(i4 + 2) == 0 && byteBuffer.get(i5) == 1) {
                return i4 + 4;
            }
            if (byteBuffer.get(i4) == 0 && byteBuffer.get(i4 + 1) == 0 && byteBuffer.get(i4 + 2) == 1) {
                return i5;
            }
            i4++;
        }
    }

    private native void nativeRelease(long j4);

    public static long resetEncodedVideoFrame(EncodedVideoFrame encodedVideoFrame) {
        long j4 = encodedVideoFrame.nativePtr;
        if (j4 == 0 || encodedVideoFrame.data == null) {
            return 0L;
        }
        encodedVideoFrame.data = null;
        encodedVideoFrame.nativePtr = 0L;
        return j4;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.nativePtr != 0) {
            LiteavLog.w(ProtectedSandApp.s("哄\u0001"), ProtectedSandApp.s("哅\u0001"));
            release();
        }
    }

    public boolean isH265() {
        return this.codecType == CodecType.f72198c;
    }

    public boolean isHDRFrame() {
        b bVar = this.hdrType;
        return (bVar == null || bVar == b.f72204a) ? false : true;
    }

    public boolean isIDRFrame() {
        c cVar = this.nalType;
        return cVar != null && cVar == c.f72210b;
    }

    public boolean isRPSEnable() {
        d dVar = this.profileType;
        return dVar == d.f72225e || dVar == d.f72226f || dVar == d.f72227g;
    }

    public boolean isSVCEnable() {
        return this.svcInfo != null;
    }

    public boolean isValidFrame() {
        ByteBuffer byteBuffer = this.data;
        return byteBuffer != null && byteBuffer.remaining() > 0 && this.nalType != null && this.codecType != null && this.width > 0 && this.height > 0;
    }

    public void release() {
        long j4 = this.nativePtr;
        if (j4 != 0) {
            nativeRelease(j4);
            this.nativePtr = 0L;
        }
    }

    public String toString() {
        return ProtectedSandApp.s("哆\u0001") + this.nalType + ProtectedSandApp.s("哇\u0001") + this.profileType + ProtectedSandApp.s("哈\u0001") + this.rotation + ProtectedSandApp.s("哉\u0001") + this.codecType + ProtectedSandApp.s("哊\u0001") + this.dts + ProtectedSandApp.s("哋\u0001") + this.pts + ProtectedSandApp.s("哌\u0001") + this.gopIndex + ProtectedSandApp.s("响\u0001") + this.gopFrameIndex + ProtectedSandApp.s("哎\u0001") + this.frameIndex;
    }

    public void updateNALTypeAccordingNALHeader() {
        if (this.data == null) {
            return;
        }
        c cVar = this.nalType;
        if (cVar != null && cVar != c.f72209a) {
            return;
        }
        int i4 = 0;
        while (true) {
            i4 = getNextNALHeaderPos(i4, this.data);
            if (i4 == -1 || i4 >= this.data.remaining()) {
                return;
            }
            c cVar2 = c.f72209a;
            c nalTypeFromH265NALHeader = isH265() ? getNalTypeFromH265NALHeader(this.data, i4) : getNalTypeFromH264NALHeader(this.data, i4);
            c cVar3 = this.nalType;
            if (cVar3 == null || cVar3 == cVar2 || nalTypeFromH265NALHeader == c.f72210b) {
                this.nalType = nalTypeFromH265NALHeader;
            }
            c cVar4 = this.nalType;
            if (cVar4 != c.f72216h && cVar4 != c.f72217i && cVar4 != c.f72218j && cVar4 != c.f72215g) {
                return;
            }
        }
    }
}
