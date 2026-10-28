package org.webrtc;

import android.content.Context;
import android.os.SystemClock;
import androidx.collection.q2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

/* loaded from: classes9.dex */
public class FileVideoCapturer implements VideoCapturer {
    private static final String TAG = ProtectedSandApp.s("ꐤ\u0001");
    private static final Logger logger = Logger.getLogger(ProtectedSandApp.s("ꐤ\u0001"));
    private CapturerObserver capturerObserver;
    private final VideoReader videoReader;
    private final Timer timer = new Timer();
    private final TimerTask tickTask = new TimerTask() { // from class: org.webrtc.FileVideoCapturer.1
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            FileVideoCapturer.this.tick();
        }
    };

    private interface VideoReader {
        void close();

        VideoFrame getNextFrame();
    }

    private static class VideoReaderY4M implements VideoReader {
        private final int frameHeight;
        private final int frameWidth;
        private final RandomAccessFile mediaFile;
        private final FileChannel mediaFileChannel;
        private final long videoStart;
        private static final String TAG = "VideoReaderY4M";
        private static final String Y4M_FRAME_DELIMETER = "FRAME";
        private static final Logger logger = Logger.getLogger("VideoReaderY4M");
        private static final int FRAME_DELIMETER_LENGTH = 6;

        public VideoReaderY4M(String str) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            this.mediaFile = randomAccessFile;
            this.mediaFileChannel = randomAccessFile.getChannel();
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = this.mediaFile.read();
                if (read == -1) {
                    throw new RuntimeException(androidx.constraintlayout.core.motion.key.c.a("Found end of file before end of header for file: ", str));
                }
                if (read == 10) {
                    this.videoStart = this.mediaFileChannel.position();
                    String str2 = "";
                    int i4 = 0;
                    int i5 = 0;
                    for (String str3 : sb.toString().split("[ ]")) {
                        char charAt = str3.charAt(0);
                        if (charAt == 'C') {
                            str2 = str3.substring(1);
                        } else if (charAt == 'H') {
                            i5 = Integer.parseInt(str3.substring(1));
                        } else if (charAt == 'W') {
                            i4 = Integer.parseInt(str3.substring(1));
                        }
                    }
                    Logger logger2 = logger;
                    logger2.debug("Color space: " + str2);
                    if (!str2.equals("420") && !str2.equals("420mpeg2")) {
                        throw new IllegalArgumentException("Does not support any other color space than I420 or I420mpeg2");
                    }
                    if (i4 % 2 == 1 || i5 % 2 == 1) {
                        throw new IllegalArgumentException("Does not support odd width or height");
                    }
                    this.frameWidth = i4;
                    this.frameHeight = i5;
                    logger2.debug(q2.a("frame dim: (", i4, ", ", i5, ")"));
                    return;
                }
                sb.append((char) read);
            }
        }

        @Override // org.webrtc.FileVideoCapturer.VideoReader
        public void close() {
            try {
                this.mediaFile.close();
            } catch (IOException e4) {
                logger.error("Problem closing file", e4);
            }
        }

        @Override // org.webrtc.FileVideoCapturer.VideoReader
        public VideoFrame getNextFrame() {
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            JavaI420Buffer allocate = JavaI420Buffer.allocate(this.frameWidth, this.frameHeight);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            allocate.getStrideY();
            allocate.getStrideU();
            allocate.getStrideV();
            try {
                int i4 = FRAME_DELIMETER_LENGTH;
                ByteBuffer allocate2 = ByteBuffer.allocate(i4);
                if (this.mediaFileChannel.read(allocate2) < i4) {
                    this.mediaFileChannel.position(this.videoStart);
                    if (this.mediaFileChannel.read(allocate2) < i4) {
                        throw new RuntimeException("Error looping video");
                    }
                }
                String str = new String(allocate2.array(), Charset.forName("US-ASCII"));
                if (str.equals("FRAME\n")) {
                    this.mediaFileChannel.read(dataY);
                    this.mediaFileChannel.read(dataU);
                    this.mediaFileChannel.read(dataV);
                    return new VideoFrame(allocate, 0, nanos);
                }
                throw new RuntimeException("Frames should be delimited by FRAME plus newline, found delimter was: '" + str + "'");
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public FileVideoCapturer(String str) throws IOException {
        try {
            this.videoReader = new VideoReaderY4M(str);
        } catch (IOException e4) {
            com.codebutler.android_websockets.c.a(ProtectedSandApp.s("ꐥ\u0001"), str, logger);
            throw e4;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i4, int i5, int i6) {
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        this.videoReader.close();
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // org.webrtc.VideoCapturer
    public void pauseCapture(boolean z4) {
    }

    @Override // org.webrtc.VideoCapturer
    public boolean startCapture(int i4, int i5, int i6) {
        this.timer.schedule(this.tickTask, 0L, 1000 / i6);
        return true;
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() throws InterruptedException {
        this.timer.cancel();
    }

    public void tick() {
        VideoFrame nextFrame = this.videoReader.getNextFrame();
        this.capturerObserver.onFrameCaptured(nextFrame);
        nextFrame.release();
    }
}
