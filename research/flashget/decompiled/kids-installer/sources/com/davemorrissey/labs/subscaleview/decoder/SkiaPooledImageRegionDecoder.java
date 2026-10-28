package com.davemorrissey.labs.subscaleview.decoder;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.solver.e;
import androidx.core.app.x;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.FileFilter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import org.apache.commons.io.j;

/* loaded from: classes3.dex */
public class SkiaPooledImageRegionDecoder implements ImageRegionDecoder {
    private static boolean debug;
    private final Bitmap.Config bitmapConfig;
    private Context context;
    private final ReadWriteLock decoderLock;
    private DecoderPool decoderPool;
    private long fileLength;
    private final Point imageDimensions;
    private final AtomicBoolean lazyInited;
    private Uri uri;
    private static final String RESOURCE_PREFIX = ProtectedSandApp.s("᷈");
    private static final String FILE_PREFIX = ProtectedSandApp.s("᷉");
    private static final String TAG = ProtectedSandApp.s("᷊");
    private static final String ASSET_PREFIX = ProtectedSandApp.s("᷋");

    /* loaded from: classes.dex */
    private static class DecoderPool {
        private final Semaphore available;
        private final Map<BitmapRegionDecoder, Boolean> decoders;

        private DecoderPool() {
            this.available = new Semaphore(0, true);
            this.decoders = new ConcurrentHashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BitmapRegionDecoder acquire() {
            this.available.acquireUninterruptibly();
            return getNextAvailable();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void add(BitmapRegionDecoder bitmapRegionDecoder) {
            this.decoders.put(bitmapRegionDecoder, Boolean.FALSE);
            this.available.release();
        }

        private synchronized BitmapRegionDecoder getNextAvailable() {
            for (Map.Entry<BitmapRegionDecoder, Boolean> entry : this.decoders.entrySet()) {
                if (!entry.getValue().booleanValue()) {
                    entry.setValue(Boolean.TRUE);
                    return entry.getKey();
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean isEmpty() {
            return this.decoders.isEmpty();
        }

        private synchronized boolean markAsUnused(BitmapRegionDecoder bitmapRegionDecoder) {
            for (Map.Entry<BitmapRegionDecoder, Boolean> entry : this.decoders.entrySet()) {
                if (bitmapRegionDecoder == entry.getKey()) {
                    if (!entry.getValue().booleanValue()) {
                        return false;
                    }
                    entry.setValue(Boolean.FALSE);
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void recycle() {
            while (!this.decoders.isEmpty()) {
                BitmapRegionDecoder acquire = acquire();
                acquire.recycle();
                this.decoders.remove(acquire);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release(BitmapRegionDecoder bitmapRegionDecoder) {
            if (markAsUnused(bitmapRegionDecoder)) {
                this.available.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized int size() {
            return this.decoders.size();
        }
    }

    @Keep
    public SkiaPooledImageRegionDecoder() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void debug(String str) {
    }

    private int getNumCoresOldPhones() {
        try {
            return new File(ProtectedSandApp.s("᷌")).listFiles(new FileFilter() { // from class: com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.1CpuFilter
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return Pattern.matches(ProtectedSandApp.s("ɺ"), file.getName());
                }
            }).length;
        } catch (Exception unused) {
            return 1;
        }
    }

    private int getNumberOfCores() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:3|(1:5)(1:36)|6|(2:8|(4:10|11|12|13))|(5:31|32|11|12|13)|35|11|12|13) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initialiseDecoder() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.initialiseDecoder():void");
    }

    private boolean isLowMemory() {
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService(ProtectedSandApp.s("᷒"));
        if (activityManager == null) {
            return true;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    private void lazyInit() {
        if (!this.lazyInited.compareAndSet(false, true) || this.fileLength >= Long.MAX_VALUE) {
            return;
        }
        debug(ProtectedSandApp.s("ᷓ"));
        new Thread() { // from class: com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (SkiaPooledImageRegionDecoder.this.decoderPool != null) {
                    SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = SkiaPooledImageRegionDecoder.this;
                    if (!skiaPooledImageRegionDecoder.allowAdditionalDecoder(skiaPooledImageRegionDecoder.decoderPool.size(), SkiaPooledImageRegionDecoder.this.fileLength)) {
                        return;
                    }
                    try {
                        if (SkiaPooledImageRegionDecoder.this.decoderPool != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            SkiaPooledImageRegionDecoder.this.debug(ProtectedSandApp.s("ɶ"));
                            SkiaPooledImageRegionDecoder.this.initialiseDecoder();
                            long currentTimeMillis2 = System.currentTimeMillis();
                            SkiaPooledImageRegionDecoder.this.debug(ProtectedSandApp.s("ɷ") + (currentTimeMillis2 - currentTimeMillis) + ProtectedSandApp.s("ɸ"));
                        }
                    } catch (Exception e6) {
                        SkiaPooledImageRegionDecoder.this.debug(ProtectedSandApp.s("ɹ") + e6.getMessage());
                    }
                }
            }
        }.start();
    }

    @Keep
    public static void setDebug(boolean z5) {
        debug = z5;
    }

    protected boolean allowAdditionalDecoder(int i5, long j5) {
        if (i5 >= 4) {
            debug(ProtectedSandApp.s("ᷔ"));
            return false;
        }
        long j6 = i5 * j5;
        if (j6 > 20971520) {
            debug(ProtectedSandApp.s("ᷕ"));
            return false;
        }
        if (i5 >= getNumberOfCores()) {
            debug(e.a(new StringBuilder(ProtectedSandApp.s("ᷖ")), getNumberOfCores(), ProtectedSandApp.s("ᷗ")));
            return false;
        }
        if (isLowMemory()) {
            debug(ProtectedSandApp.s("ᷘ"));
            return false;
        }
        StringBuilder a6 = x.a(ProtectedSandApp.s("ᷙ"), i5, ProtectedSandApp.s("ᷚ"));
        a6.append(j6 / j.f32011c);
        a6.append(ProtectedSandApp.s("ᷛ"));
        debug(a6.toString());
        return true;
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @o0
    public Bitmap decodeRegion(@o0 Rect rect, int i5) {
        debug(ProtectedSandApp.s("ᷜ") + rect + ProtectedSandApp.s("ᷝ") + Thread.currentThread().getName());
        if (rect.width() < this.imageDimensions.x || rect.height() < this.imageDimensions.y) {
            lazyInit();
        }
        this.decoderLock.readLock().lock();
        try {
            DecoderPool decoderPool = this.decoderPool;
            if (decoderPool != null) {
                BitmapRegionDecoder acquire = decoderPool.acquire();
                if (acquire != null) {
                    try {
                        if (!acquire.isRecycled()) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = i5;
                            options.inPreferredConfig = this.bitmapConfig;
                            Bitmap decodeRegion = acquire.decodeRegion(rect, options);
                            if (decodeRegion != null) {
                                return decodeRegion;
                            }
                            throw new RuntimeException(ProtectedSandApp.s("ᷞ"));
                        }
                    } finally {
                        this.decoderPool.release(acquire);
                    }
                }
                if (acquire != null) {
                }
            }
            throw new IllegalStateException(ProtectedSandApp.s("ᷟ"));
        } finally {
            this.decoderLock.readLock().unlock();
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @o0
    public Point init(Context context, @o0 Uri uri) throws Exception {
        this.context = context;
        this.uri = uri;
        initialiseDecoder();
        return this.imageDimensions;
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized boolean isReady() {
        boolean z5;
        DecoderPool decoderPool = this.decoderPool;
        if (decoderPool != null) {
            z5 = decoderPool.isEmpty() ? false : true;
        }
        return z5;
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized void recycle() {
        this.decoderLock.writeLock().lock();
        try {
            DecoderPool decoderPool = this.decoderPool;
            if (decoderPool != null) {
                decoderPool.recycle();
                this.decoderPool = null;
                this.context = null;
                this.uri = null;
            }
        } finally {
            this.decoderLock.writeLock().unlock();
        }
    }

    public SkiaPooledImageRegionDecoder(@q0 Bitmap.Config config) {
        this.decoderPool = new DecoderPool();
        this.decoderLock = new ReentrantReadWriteLock(true);
        this.fileLength = Long.MAX_VALUE;
        this.imageDimensions = new Point(0, 0);
        this.lazyInited = new AtomicBoolean(false);
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.bitmapConfig = config;
        } else if (preferredBitmapConfig != null) {
            this.bitmapConfig = preferredBitmapConfig;
        } else {
            this.bitmapConfig = Bitmap.Config.RGB_565;
        }
    }
}
