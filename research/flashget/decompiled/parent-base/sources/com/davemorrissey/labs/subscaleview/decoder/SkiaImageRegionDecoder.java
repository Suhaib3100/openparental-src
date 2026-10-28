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
import com.flashget.parentalcontrol.ProtectedSandApp;
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
    private static final String RESOURCE_PREFIX = ProtectedSandApp.s("ᔇ");
    private static final String FILE_PREFIX = ProtectedSandApp.s("ᔊ");
    private static final String ASSET_PREFIX = ProtectedSandApp.s("ᔉ");

    @Keep
    public SkiaImageRegionDecoder() {
        this(null);
    }

    private Lock getDecodeLock() {
        return this.decoderLock.readLock();
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @o0
    public Bitmap decodeRegion(@o0 Rect rect, int i4) {
        getDecodeLock().lock();
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.decoder;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new IllegalStateException(ProtectedSandApp.s("ᔆ"));
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i4;
            options.inPreferredConfig = this.bitmapConfig;
            Bitmap decodeRegion = this.decoder.decodeRegion(rect, options);
            if (decodeRegion == null) {
                throw new RuntimeException(ProtectedSandApp.s("ᔅ"));
            }
            getDecodeLock().unlock();
            return decodeRegion;
        } catch (Throwable th) {
            getDecodeLock().unlock();
            throw th;
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @o0
    public Point init(Context context, @o0 Uri uri) throws Exception {
        int i4;
        String uri2 = uri.toString();
        if (uri2.startsWith(ProtectedSandApp.s("ᔇ"))) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size == 2) {
                String str = pathSegments.get(0);
                String s4 = ProtectedSandApp.s("ᔈ");
                if (str.equals(s4)) {
                    i4 = resources.getIdentifier(pathSegments.get(1), s4, authority);
                    this.decoder = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i4), false);
                }
            }
            if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                try {
                    i4 = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
                this.decoder = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i4), false);
            }
            i4 = 0;
            this.decoder = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i4), false);
        } else if (uri2.startsWith(ProtectedSandApp.s("ᔉ"))) {
            this.decoder = BitmapRegionDecoder.newInstance(context.getAssets().open(uri2.substring(22), 1), false);
        } else if (uri2.startsWith(ProtectedSandApp.s("ᔊ"))) {
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
        boolean z4;
        BitmapRegionDecoder bitmapRegionDecoder = this.decoder;
        if (bitmapRegionDecoder != null) {
            z4 = bitmapRegionDecoder.isRecycled() ? false : true;
        }
        return z4;
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
