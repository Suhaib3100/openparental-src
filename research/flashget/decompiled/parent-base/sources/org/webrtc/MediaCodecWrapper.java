package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
interface MediaCodecWrapper {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i4);

    Surface createInputSurface();

    int dequeueInputBuffer(long j4);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j4);

    void flush();

    ByteBuffer getInputBuffer(int i4);

    MediaFormat getInputFormat();

    ByteBuffer getOutputBuffer(int i4);

    MediaFormat getOutputFormat();

    void queueInputBuffer(int i4, int i5, int i6, long j4, int i7);

    void release();

    void releaseOutputBuffer(int i4, boolean z4);

    void setParameters(Bundle bundle);

    void start();

    void stop();
}
