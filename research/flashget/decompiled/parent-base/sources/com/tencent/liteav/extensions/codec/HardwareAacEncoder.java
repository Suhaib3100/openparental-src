package com.tencent.liteav.extensions.codec;

import android.media.MediaFormat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.extensions.codec.AacMediaCodecWrapper;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class HardwareAacEncoder {

    /* renamed from: a, reason: collision with root package name */
    private final AacMediaCodecWrapper f71972a = new AacMediaCodecWrapper(AacMediaCodecWrapper.a.f71968a);

    public ByteBuffer encode(ByteBuffer byteBuffer) {
        return this.f71972a.processFrame(byteBuffer);
    }

    public boolean init(int i4, int i5, int i6) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(ProtectedSandApp.s("另\u0001"), i4, i5);
        createAudioFormat.setInteger(ProtectedSandApp.s("叧\u0001"), i6);
        createAudioFormat.setInteger(ProtectedSandApp.s("叨\u0001"), 2);
        return this.f71972a.a(createAudioFormat);
    }

    public void unInit() {
        this.f71972a.a();
    }
}
