package com.tencent.liteav.audio.musicdecoder;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

@JNINamespace("liteav::audio")
/* loaded from: classes7.dex */
public class MediaCodecBridge {
    private static final String TAG = ProtectedSandApp.s("儲\u0001");
    private static final long TIMEOUT_MS = 400;
    private final Context mContext = ContextUtils.getApplicationContext();
    private boolean mDecodeEOS;
    private MediaFormat mFormat;
    private long mLongestDurationUs;
    private MediaCodec mMediaCodec;
    private MediaExtractor mMediaExtractor;
    private String mMime;
    private int mRawDataSize;
    private int mTrackCount;
    private int mTrackIndex;

    private ByteBuffer dequeueOutputBuffer() {
        String s4 = ProtectedSandApp.s("儲\u0001");
        if (this.mDecodeEOS) {
            return null;
        }
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(TIMEOUT_MS));
            if (dequeueOutputBuffer == -1) {
                return null;
            }
            if (dequeueOutputBuffer == -3) {
                Log.i(s4, ProtectedSandApp.s("儳\u0001"), new Object[0]);
                return null;
            }
            if (dequeueOutputBuffer == -2) {
                this.mFormat = this.mMediaCodec.getOutputFormat();
                Log.i(s4, ProtectedSandApp.s("儴\u0001") + this.mFormat, new Object[0]);
                return null;
            }
            if (dequeueOutputBuffer < 0) {
                Log.e(s4, ProtectedSandApp.s("儵\u0001").concat(String.valueOf(dequeueOutputBuffer)), new Object[0]);
                return null;
            }
            if ((bufferInfo.flags & 4) != 0) {
                Log.i(s4, ProtectedSandApp.s("儶\u0001"), new Object[0]);
                this.mDecodeEOS = true;
                return null;
            }
            ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.mMediaCodec.getOutputBuffer(dequeueOutputBuffer) : this.mMediaCodec.getOutputBuffers()[dequeueOutputBuffer];
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
            allocateDirect.put(outputBuffer);
            this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            return allocateDirect;
        } catch (Throwable th) {
            Log.e(s4, b.a(th, new StringBuilder(ProtectedSandApp.s("儷\u0001"))), th);
            return null;
        }
    }

    private ByteBuffer drainData() {
        for (int i4 = 0; i4 < 3; i4++) {
            ByteBuffer dequeueOutputBuffer = dequeueOutputBuffer();
            if (dequeueOutputBuffer != null) {
                return dequeueOutputBuffer;
            }
        }
        return null;
    }

    private long getDuration(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return -1L;
        }
        try {
            return mediaFormat.getLong(ProtectedSandApp.s("儸\u0001"));
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("儲\u0001"), b.a(th, new StringBuilder(ProtectedSandApp.s("儹\u0001"))), new Object[0]);
            return -1L;
        }
    }

    private boolean initMediaCodec() {
        if (!TextUtils.isEmpty(this.mMime) && this.mFormat != null) {
            try {
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(this.mMime);
                this.mMediaCodec = createDecoderByType;
                createDecoderByType.configure(this.mFormat, (Surface) null, (MediaCrypto) null, 0);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                this.mMediaCodec = null;
            }
        }
        return false;
    }

    private boolean initMediaExtractor(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.mDecodeEOS = false;
        try {
            this.mMediaExtractor = new MediaExtractor();
            if (!setDataSource(str)) {
                return false;
            }
            this.mTrackCount = this.mMediaExtractor.getTrackCount();
            for (int i4 = 0; i4 < this.mTrackCount; i4++) {
                MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i4);
                String string = trackFormat.getString(ProtectedSandApp.s("儺\u0001"));
                if (!TextUtils.isEmpty(string) && string.startsWith(ProtectedSandApp.s("儻\u0001"))) {
                    long duration = getDuration(trackFormat);
                    if (this.mLongestDurationUs < duration) {
                        this.mLongestDurationUs = duration;
                    }
                }
            }
            int i5 = this.mTrackIndex;
            if (i5 != 0) {
                return selectTrack(i5);
            }
            for (int i6 = 0; i6 < this.mTrackCount; i6++) {
                if (selectTrack(i6)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("儲\u0001"), b.a(th, new StringBuilder(ProtectedSandApp.s("儼\u0001"))), th);
            this.mMediaExtractor = null;
            this.mFormat = null;
            this.mMime = null;
            return false;
        }
    }

    private boolean selectTrack(int i4) {
        try {
            MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i4);
            String string = trackFormat.getString(ProtectedSandApp.s("儺\u0001"));
            if (TextUtils.isEmpty(string) || !string.startsWith(ProtectedSandApp.s("儻\u0001"))) {
                return false;
            }
            this.mMediaExtractor.selectTrack(i4);
            this.mTrackIndex = i4;
            this.mFormat = trackFormat;
            this.mMime = string;
            return true;
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("儲\u0001"), b.a(th, new StringBuilder(ProtectedSandApp.s("儽\u0001"))), th);
            return false;
        }
    }

    private boolean setDataSource(String str) {
        String valueOf = String.valueOf(str);
        String s4 = ProtectedSandApp.s("儲\u0001");
        Log.i(s4, ProtectedSandApp.s("儾\u0001").concat(valueOf), new Object[0]);
        if (str.startsWith(ProtectedSandApp.s("儿\u0001"))) {
            try {
                if (this.mContext != null && this.mMediaExtractor != null) {
                    this.mMediaExtractor.setDataSource(this.mContext.getContentResolver().openFileDescriptor(Uri.parse(str), ProtectedSandApp.s("兀\u0001")).getFileDescriptor());
                    return true;
                }
            } catch (Throwable th) {
                Log.e(s4, b.a(th, new StringBuilder(ProtectedSandApp.s("允\u0001"))), th);
                return false;
            }
        }
        this.mMediaExtractor.setDataSource(str);
        return true;
    }

    public long getLongestDuration() {
        return this.mLongestDurationUs;
    }

    public MediaFormat getOutputFormat() {
        return this.mFormat;
    }

    public int getTotalRawDataSize() {
        return this.mRawDataSize;
    }

    public int getTrackCount() {
        return this.mTrackCount;
    }

    public boolean initAndStart(String str) {
        if (this.mMediaCodec != null || !initMediaExtractor(str) || !initMediaCodec()) {
            return false;
        }
        try {
            this.mMediaCodec.start();
            return true;
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("儲\u0001"), b.a(th, new StringBuilder(ProtectedSandApp.s("兂\u0001"))), th);
            return false;
        }
    }

    public boolean isDecodeEnd() {
        return this.mDecodeEOS;
    }

    public ByteBuffer processFrame() {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec == null) {
            return null;
        }
        try {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(TIMEOUT_MS);
            if (dequeueInputBuffer < 0) {
                return null;
            }
            ByteBuffer byteBuffer = this.mMediaCodec.getInputBuffers()[dequeueInputBuffer];
            int readSampleData = byteBuffer != null ? this.mMediaExtractor.readSampleData(byteBuffer, 0) : -1;
            if (readSampleData <= 0) {
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            } else {
                this.mRawDataSize += readSampleData;
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mMediaExtractor.getSampleTime(), 0);
                this.mMediaExtractor.advance();
            }
            return drainData();
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("儲\u0001"), b.a(th, new StringBuilder(ProtectedSandApp.s("元\u0001"))), th);
            return null;
        }
    }

    public boolean seekTo(long j4) {
        MediaExtractor mediaExtractor;
        if (this.mMediaCodec == null || (mediaExtractor = this.mMediaExtractor) == null || j4 > this.mLongestDurationUs) {
            return false;
        }
        try {
            mediaExtractor.seekTo(j4, 2);
            return true;
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("儲\u0001"), b.a(th, new StringBuilder(ProtectedSandApp.s("兄\u0001"))), th);
            return false;
        }
    }

    public void setMusicTrack(int i4) {
        String s4 = ProtectedSandApp.s("儲\u0001");
        int i5 = this.mTrackIndex;
        if (i5 == i4) {
            return;
        }
        try {
            this.mMediaExtractor.unselectTrack(i5);
            if (selectTrack(i4)) {
                try {
                    MediaCodec mediaCodec = this.mMediaCodec;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                        this.mMediaCodec.release();
                        this.mMediaCodec = null;
                    }
                    if (initMediaCodec()) {
                        try {
                            this.mMediaCodec.start();
                        } catch (Throwable th) {
                            Log.e(s4, b.a(th, new StringBuilder(ProtectedSandApp.s("兂\u0001"))), th);
                        }
                    }
                } catch (Throwable th2) {
                    Log.e(s4, b.a(th2, new StringBuilder(ProtectedSandApp.s("充\u0001"))), th2);
                }
            }
        } catch (Throwable th3) {
            Log.e(s4, b.a(th3, new StringBuilder(ProtectedSandApp.s("兆\u0001"))), th3);
        }
    }

    public void stop() {
        MediaExtractor mediaExtractor = this.mMediaExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mMediaExtractor = null;
        }
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mMediaCodec.release();
            this.mMediaCodec = null;
        }
        this.mDecodeEOS = false;
    }
}
