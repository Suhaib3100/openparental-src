package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.android.volley.ParseError;
import com.android.volley.n;
import com.android.volley.q;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ImageRequest.java */
/* loaded from: classes3.dex */
public class r extends com.android.volley.n<Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final Bitmap.Config mDecodeConfig;

    @q0
    @androidx.annotation.b0("mLock")
    private q.b<Bitmap> mListener;
    private final Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ImageView.ScaleType mScaleType;

    public r(String str, q.b<Bitmap> bVar, int i4, int i5, ImageView.ScaleType scaleType, Bitmap.Config config, @q0 q.a aVar) {
        super(0, str, aVar);
        this.mLock = new Object();
        setRetryPolicy(new com.android.volley.g(1000, 2, 2.0f));
        this.mListener = bVar;
        this.mDecodeConfig = config;
        this.mMaxWidth = i4;
        this.mMaxHeight = i5;
        this.mScaleType = scaleType;
    }

    private com.android.volley.q<Bitmap> doParse(com.android.volley.l lVar) {
        Bitmap decodeByteArray;
        byte[] bArr = lVar.f40900b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            int resizedDimension = getResizedDimension(this.mMaxWidth, this.mMaxHeight, i4, i5, this.mScaleType);
            int resizedDimension2 = getResizedDimension(this.mMaxHeight, this.mMaxWidth, i5, i4, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i4, i5, resizedDimension, resizedDimension2);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > resizedDimension || decodeByteArray.getHeight() > resizedDimension2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, resizedDimension, resizedDimension2, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        return decodeByteArray == null ? com.android.volley.q.a(new ParseError(lVar)) : com.android.volley.q.c(decodeByteArray, m.e(lVar));
    }

    @m1
    static int findBestSampleSize(int i4, int i5, int i6, int i7) {
        double min = Math.min(i4 / i6, i5 / i7);
        float f4 = 1.0f;
        while (true) {
            float f5 = 2.0f * f4;
            if (f5 > min) {
                return (int) f4;
            }
            f4 = f5;
        }
    }

    private static int getResizedDimension(int i4, int i5, int i6, int i7, ImageView.ScaleType scaleType) {
        if (i4 == 0 && i5 == 0) {
            return i6;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i4 == 0 ? i6 : i4;
        }
        if (i4 == 0) {
            return (int) (i6 * (i5 / i7));
        }
        if (i5 == 0) {
            return i4;
        }
        double d5 = i7 / i6;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d6 = i5;
            return ((double) i4) * d5 < d6 ? (int) (d6 / d5) : i4;
        }
        double d7 = i5;
        return ((double) i4) * d5 > d7 ? (int) (d7 / d5) : i4;
    }

    @Override // com.android.volley.n
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.n
    public n.d getPriority() {
        return n.d.LOW;
    }

    @Override // com.android.volley.n
    protected com.android.volley.q<Bitmap> parseNetworkResponse(com.android.volley.l lVar) {
        com.android.volley.q<Bitmap> doParse;
        synchronized (sDecodeLock) {
            try {
                try {
                    doParse = doParse(lVar);
                } catch (OutOfMemoryError e4) {
                    com.android.volley.t.c(ProtectedSandApp.s("۳"), Integer.valueOf(lVar.f40900b.length), getUrl());
                    return com.android.volley.q.a(new ParseError(e4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return doParse;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.n
    public void deliverResponse(Bitmap bitmap) {
        q.b<Bitmap> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(bitmap);
        }
    }

    @Deprecated
    public r(String str, q.b<Bitmap> bVar, int i4, int i5, Bitmap.Config config, q.a aVar) {
        this(str, bVar, i4, i5, ImageView.ScaleType.CENTER_INSIDE, config, aVar);
    }
}
