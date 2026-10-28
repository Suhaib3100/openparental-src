package com.tencent.liteav.audio.musicdecoder;

import android.media.MediaFormat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("liteav::audio")
/* loaded from: classes7.dex */
public class MusicResourceDecoderAndroid {
    private static final String TAG = ProtectedSandApp.s("光\u0001");
    private String mPath;
    private int mTrackIndex = 0;
    private final MediaCodecBridge mDecoder = new MediaCodecBridge();

    public ByteBuffer decode() {
        return this.mDecoder.processFrame();
    }

    public int getBitrate() {
        MediaFormat outputFormat = this.mDecoder.getOutputFormat();
        if (outputFormat == null) {
            return -1;
        }
        try {
            return outputFormat.getInteger(ProtectedSandApp.s("兇\u0001"));
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("光\u0001"), b.a(th, new StringBuilder(ProtectedSandApp.s("先\u0001"))), new Object[0]);
            return -1;
        }
    }

    public int getChannelCount() {
        MediaFormat outputFormat = this.mDecoder.getOutputFormat();
        if (outputFormat == null) {
            return -1;
        }
        try {
            return outputFormat.getInteger(ProtectedSandApp.s("兊\u0001"));
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("光\u0001"), b.a(th, new StringBuilder(ProtectedSandApp.s("克\u0001"))), new Object[0]);
            return -1;
        }
    }

    public long getDuration() {
        return (this.mDecoder.getLongestDuration() + 500) / 1000;
    }

    public int getSampleRate() {
        MediaFormat outputFormat = this.mDecoder.getOutputFormat();
        if (outputFormat == null) {
            return -1;
        }
        try {
            return outputFormat.getInteger(ProtectedSandApp.s("兌\u0001"));
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("光\u0001"), b.a(th, new StringBuilder(ProtectedSandApp.s("免\u0001"))), new Object[0]);
            return -1;
        }
    }

    public int getTotalRawDataSize() {
        return this.mDecoder.getTotalRawDataSize();
    }

    public int getTrackCount() {
        return this.mDecoder.getTrackCount();
    }

    public boolean isDecodeEnd() {
        return this.mDecoder.isDecodeEnd();
    }

    public boolean seekTo(long j4) {
        if (this.mDecoder.isDecodeEnd()) {
            this.mDecoder.stop();
            this.mDecoder.initAndStart(this.mPath);
            this.mDecoder.setMusicTrack(this.mTrackIndex);
        }
        return this.mDecoder.seekTo(j4 * 1000);
    }

    public void setMusicTrack(int i4) {
        this.mTrackIndex = i4;
        this.mDecoder.setMusicTrack(i4);
    }

    public boolean start(String str) {
        this.mPath = str;
        return this.mDecoder.initAndStart(str);
    }

    public void stop() {
        this.mDecoder.stop();
    }
}
