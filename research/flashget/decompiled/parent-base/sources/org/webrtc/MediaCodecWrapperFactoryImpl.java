package org.webrtc;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    private static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i4) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i4);
        }

        @Override // org.webrtc.MediaCodecWrapper
        @TargetApi(18)
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public int dequeueInputBuffer(long j4) {
            return this.mediaCodec.dequeueInputBuffer(j4);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j4) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j4);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public ByteBuffer getInputBuffer(int i4) {
            return this.mediaCodec.getInputBuffer(i4);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public MediaFormat getInputFormat() {
            return this.mediaCodec.getInputFormat();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public ByteBuffer getOutputBuffer(int i4) {
            return this.mediaCodec.getOutputBuffer(i4);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void queueInputBuffer(int i4, int i5, int i6, long j4, int i7) {
            this.mediaCodec.queueInputBuffer(i4, i5, i6, j4, i7);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void releaseOutputBuffer(int i4, boolean z4) {
            this.mediaCodec.releaseOutputBuffer(i4, z4);
        }

        @Override // org.webrtc.MediaCodecWrapper
        @TargetApi(19)
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }
    }

    MediaCodecWrapperFactoryImpl() {
    }

    @Override // org.webrtc.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String str) throws IOException {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
