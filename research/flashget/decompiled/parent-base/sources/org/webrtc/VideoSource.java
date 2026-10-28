package org.webrtc;

import android.graphics.Bitmap;
import org.webrtc.VideoProcessor;

/* loaded from: classes9.dex */
public class VideoSource extends MediaSource {
    private final CapturerObserver capturerObserver;
    private boolean isCapturerRunning;
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    @androidx.annotation.q0
    private VideoProcessor videoProcessor;
    private final Object videoProcessorLock;

    public static class AspectRatio {
        public static final AspectRatio UNDEFINED = new AspectRatio(0, 0);
        public final int height;
        public final int width;

        public AspectRatio(int i4, int i5) {
            this.width = i4;
            this.height = i5;
        }
    }

    public VideoSource(long j4) {
        super(j4);
        this.videoProcessorLock = new Object();
        this.capturerObserver = new CapturerObserver() { // from class: org.webrtc.VideoSource.1
            @Override // org.webrtc.CapturerObserver
            public void onBitmapCaptured(Bitmap bitmap) {
            }

            @Override // org.webrtc.CapturerObserver
            public void onCapturerStarted(boolean z4) {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(z4);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        VideoSource.this.isCapturerRunning = z4;
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onCapturerStarted(z4);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onCapturerStopped() {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        VideoSource.this.isCapturerRunning = false;
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onCapturerStopped();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onFrameCaptured(VideoFrame videoFrame) {
                VideoProcessor.FrameAdaptationParameters adaptFrame = VideoSource.this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onFrameCaptured(videoFrame, adaptFrame);
                            return;
                        }
                        VideoFrame applyFrameAdaptationParameters = VideoProcessor.applyFrameAdaptationParameters(videoFrame, adaptFrame);
                        if (applyFrameAdaptationParameters != null) {
                            VideoSource.this.nativeAndroidVideoTrackSource.onFrameCaptured(applyFrameAdaptationParameters);
                            applyFrameAdaptationParameters.release();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$0(VideoFrame videoFrame) {
        this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$1(final VideoFrame videoFrame) {
        runWithReference(new Runnable() { // from class: org.webrtc.k1
            @Override // java.lang.Runnable
            public final void run() {
                VideoSource.this.lambda$setVideoProcessor$0(videoFrame);
            }
        });
    }

    public void adaptOutputFormat(int i4, int i5, int i6) {
        int max = Math.max(i4, i5);
        int min = Math.min(i4, i5);
        adaptOutputFormat(max, min, min, max, i6);
    }

    @Override // org.webrtc.MediaSource
    public void dispose() {
        setVideoProcessor(null);
        super.dispose();
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    public void setIsScreencast(boolean z4) {
        this.nativeAndroidVideoTrackSource.setIsScreencast(z4);
    }

    public void setVideoProcessor(@androidx.annotation.q0 VideoProcessor videoProcessor) {
        synchronized (this.videoProcessorLock) {
            try {
                VideoProcessor videoProcessor2 = this.videoProcessor;
                if (videoProcessor2 != null) {
                    videoProcessor2.setSink(null);
                    if (this.isCapturerRunning) {
                        this.videoProcessor.onCapturerStopped();
                    }
                }
                this.videoProcessor = videoProcessor;
                if (videoProcessor != null) {
                    videoProcessor.setSink(new VideoSink() { // from class: org.webrtc.l1
                        @Override // org.webrtc.VideoSink
                        public final void onFrame(VideoFrame videoFrame) {
                            VideoSource.this.lambda$setVideoProcessor$1(videoFrame);
                        }
                    });
                    if (this.isCapturerRunning) {
                        videoProcessor.onCapturerStarted(true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void adaptOutputFormat(int i4, int i5, int i6, int i7, int i10) {
        adaptOutputFormat(new AspectRatio(i4, i5), Integer.valueOf(i4 * i5), new AspectRatio(i6, i7), Integer.valueOf(i6 * i7), Integer.valueOf(i10));
    }

    public void adaptOutputFormat(AspectRatio aspectRatio, @androidx.annotation.q0 Integer num, AspectRatio aspectRatio2, @androidx.annotation.q0 Integer num2, @androidx.annotation.q0 Integer num3) {
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(aspectRatio, num, aspectRatio2, num2, num3);
    }
}
