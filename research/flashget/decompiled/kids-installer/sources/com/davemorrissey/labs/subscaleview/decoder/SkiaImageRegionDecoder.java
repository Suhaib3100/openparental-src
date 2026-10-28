package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public class SkiaImageRegionDecoder implements ImageRegionDecoder {
    private final Bitmap.Config bitmapConfig;
    private BitmapRegionDecoder decoder;
    private final ReadWriteLock decoderLock;
    private static final String RESOURCE_PREFIX = ProtectedSandApp.s("᷅");
    private static final String FILE_PREFIX = ProtectedSandApp.s("᷆");
    private static final String ASSET_PREFIX = ProtectedSandApp.s("᷇");

    @Keep
    public SkiaImageRegionDecoder() {
        this(null);
    }

    private Lock getDecodeLock() {
        return this.decoderLock.readLock();
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @o0
    public Bitmap decodeRegion(@o0 Rect rect, int i5) {
        getDecodeLock().lock();
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.decoder;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new IllegalStateException(ProtectedSandApp.s("᷀"));
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i5;
            options.inPreferredConfig = this.bitmapConfig;
            Bitmap decodeRegion = this.decoder.decodeRegion(rect, options);
            if (decodeRegion != null) {
                return decodeRegion;
            }
            throw new RuntimeException(ProtectedSandApp.s("ᶿ"));
        } finally {
            getDecodeLock().unlock();
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @o0
    public Point init(Context context, @o0 Uri uri) throws Exception {
        int i5;
        String uri2 = uri.toString();
        if (uri2.startsWith(ProtectedSandApp.s("᷁"))) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size == 2) {
                String str = pathSegments.get(0);
                String s5 = ProtectedSandApp.s("᷂");
                if (str.equals(s5)) {
                    i5 = resources.getIdentifier(pathSegments.get(1), s5, authority);
                    this.decoder = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i5), false);
                }
            }
            if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                try {
                    i5 = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
                this.decoder = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i5), false);
            }
            i5 = 0;
            this.decoder = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i5), false);
        } else if (uri2.startsWith(ProtectedSandApp.s("᷃"))) {
            this.decoder = BitmapRegionDecoder.newInstance(context.getAssets().open(uri2.substring(22), 1), false);
        } else if (uri2.startsWith(ProtectedSandApp.s("᷄"))) {
            this.decoder = BitmapRegionDecoder.newInstance(uri2.substring(7), false);
        } else {
            InputStream inputStream = null;
            try {
                inputStream = context.getContentResolver().openInputStream(uri);
                this.decoder = BitmapRegionDecoder.newInstance(inputStream, false);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        }
        return new Point(this.decoder.getWidth(), this.decoder.getHeight());
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized boolean isReady() {
        boolean z5;
        BitmapRegionDecoder bitmapRegionDecoder = this.decoder;
        if (bitmapRegionDecoder != null) {
            z5 = bitmapRegionDecoder.isRecycled() ? false : true;
        }
        return z5;
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized void recycle() {
        this.decoderLock.writeLock().lock();
        try {
            this.decoder.recycle();
            this.decoder = null;
        } finally {
            this.decoderLock.writeLock().unlock();
        }
    }

    public SkiaImageRegionDecoder(@q0 Bitmap.Config config) {
        this.decoderLock = new ReentrantReadWriteLock(true);
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
