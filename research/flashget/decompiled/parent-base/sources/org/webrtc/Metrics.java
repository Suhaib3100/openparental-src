package org.webrtc;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class Metrics {
    private static final String TAG = "Metrics";
    public final Map<String, HistogramInfo> map = new HashMap();

    public static class HistogramInfo {
        public final int bucketCount;
        public final int max;
        public final int min;
        public final Map<Integer, Integer> samples = new HashMap();

        @CalledByNative("HistogramInfo")
        public HistogramInfo(int i4, int i5, int i6) {
            this.min = i4;
            this.max = i5;
            this.bucketCount = i6;
        }

        @CalledByNative("HistogramInfo")
        public void addSample(int i4, int i5) {
            this.samples.put(Integer.valueOf(i4), Integer.valueOf(i5));
        }
    }

    @CalledByNative
    Metrics() {
    }

    @CalledByNative
    private void add(String str, HistogramInfo histogramInfo) {
        this.map.put(str, histogramInfo);
    }

    public static void enable() {
        nativeEnable();
    }

    public static Metrics getAndReset() {
        return nativeGetAndReset();
    }

    private static native void nativeEnable();

    private static native Metrics nativeGetAndReset();
}
