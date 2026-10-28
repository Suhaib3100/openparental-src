package com.tencent.liteav.extensions.codec;

import android.media.MediaFormat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.extensions.codec.AacMediaCodecWrapper;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class HardwareAacDecoder {

    /* renamed from: a, reason: collision with root package name */
    private final AacMediaCodecWrapper f71971a = new AacMediaCodecWrapper(AacMediaCodecWrapper.a.f71969b);

    public ByteBuffer decode(ByteBuffer byteBuffer) {
        return this.f71971a.processFrame(byteBuffer);
    }

    public int getCacheSize() {
        return this.f71971a.f71963b;
    }

    public int getOutputChannelCount() {
        MediaFormat mediaFormat = this.f71971a.f71962a;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger(ProtectedSandApp.s("叞\u0001"));
        } catch (Exception e4) {
            String valueOf = String.valueOf(e4);
            Log.e(ProtectedSandApp.s("叠\u0001"), ProtectedSandApp.s("叟\u0001").concat(valueOf), new Object[0]);
            return -1;
        }
    }

    public int getOutputSampleRate() {
        MediaFormat mediaFormat = this.f71971a.f71962a;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger(ProtectedSandApp.s("叡\u0001"));
        } catch (Exception e4) {
            String valueOf = String.valueOf(e4);
            Log.e(ProtectedSandApp.s("叠\u0001"), ProtectedSandApp.s("叢\u0001").concat(valueOf), new Object[0]);
            return -1;
        }
    }

    public boolean init(int i4, int i5, ByteBuffer byteBuffer) {
        String s4 = ProtectedSandApp.s("口\u0001");
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(s4, i4, i5);
        createAudioFormat.setString(ProtectedSandApp.s("古\u0001"), s4);
        createAudioFormat.setByteBuffer(ProtectedSandApp.s("句\u0001"), byteBuffer);
        return this.f71971a.a(createAudioFormat);
    }

    public void unInit() {
        this.f71971a.a();
    }
}
