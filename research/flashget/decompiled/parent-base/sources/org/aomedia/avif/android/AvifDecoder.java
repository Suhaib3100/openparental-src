package org.aomedia.avif.android;

import android.graphics.Bitmap;
import androidx.annotation.q0;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class AvifDecoder {
    private boolean alphaPresent;
    private long decoder;
    private int depth;
    private int frameCount;
    private double[] frameDurations;
    private int height;
    private int repetitionCount;
    private int width;

    public static class Info {
        public boolean alphaPresent;
        public int depth;
        public int height;
        public int width;
    }

    static {
        try {
            System.loadLibrary("avif_android");
        } catch (UnsatisfiedLinkError e4) {
            e4.printStackTrace();
        }
    }

    private AvifDecoder(ByteBuffer encoded, int threads) {
        this.decoder = createDecoder(encoded, encoded.remaining(), threads);
    }

    @q0
    public static AvifDecoder create(ByteBuffer encoded) {
        return create(encoded, 1);
    }

    private native long createDecoder(ByteBuffer encoded, int length, int threads);

    public static boolean decode(ByteBuffer encoded, int length, Bitmap bitmap) {
        return decode(encoded, length, bitmap, 0);
    }

    public static native boolean decode(ByteBuffer encoded, int length, Bitmap bitmap, int threads);

    private native void destroyDecoder(long decoder);

    public static native boolean getInfo(ByteBuffer encoded, int length, Info info);

    public static boolean isAvifImage(ByteBuffer buffer) {
        return isAvifImage(buffer, buffer.remaining());
    }

    private static native boolean isAvifImage(ByteBuffer encoded, int length);

    private native int nextFrame(long decoder, Bitmap bitmap);

    private native int nextFrameIndex(long decoder);

    private native int nthFrame(long decoder, int n4, Bitmap bitmap);

    public static native String resultToString(int result);

    public static native String versionString();

    public boolean getAlphaPresent() {
        return this.alphaPresent;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public double[] getFrameDurations() {
        return this.frameDurations;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRepetitionCount() {
        return this.repetitionCount;
    }

    public int getWidth() {
        return this.width;
    }

    public int nextFrame(Bitmap bitmap) {
        return nextFrame(this.decoder, bitmap);
    }

    public int nextFrameIndex() {
        return nextFrameIndex(this.decoder);
    }

    public int nthFrame(int n4, Bitmap bitmap) {
        return nthFrame(this.decoder, n4, bitmap);
    }

    public void release() {
        long j4 = this.decoder;
        if (j4 != 0) {
            destroyDecoder(j4);
        }
        this.decoder = 0L;
    }

    @q0
    public static AvifDecoder create(ByteBuffer encoded, int threads) {
        AvifDecoder avifDecoder = new AvifDecoder(encoded, threads);
        if (avifDecoder.decoder == 0) {
            return null;
        }
        return avifDecoder;
    }
}
