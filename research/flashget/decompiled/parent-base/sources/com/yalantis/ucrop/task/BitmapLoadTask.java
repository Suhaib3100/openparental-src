package com.yalantis.ucrop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yalantis.ucrop.OkHttpClientStore;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.f0;
import okio.a0;
import okio.m0;
import okio.o;

/* loaded from: classes7.dex */
public class BitmapLoadTask extends AsyncTask<Void, Void, BitmapWorkerResult> {
    private static final String TAG = ProtectedSandApp.s("弇\u0001");
    private final BitmapLoadCallback mBitmapLoadCallback;
    private final WeakReference<Context> mContext;
    private Uri mInputUri;
    private Uri mOutputUri;
    private final int mRequiredHeight;
    private final int mRequiredWidth;

    public BitmapLoadTask(@o0 Context context, @o0 Uri uri, @q0 Uri uri2, int i4, int i5, BitmapLoadCallback bitmapLoadCallback) {
        this.mContext = new WeakReference<>(context);
        this.mInputUri = uri;
        this.mOutputUri = uri2;
        this.mRequiredWidth = i4;
        this.mRequiredHeight = i5;
        this.mBitmapLoadCallback = bitmapLoadCallback;
    }

    private void downloadFile(@o0 Uri uri, @q0 Uri uri2) throws NullPointerException, IOException {
        Closeable closeable;
        f0 f0Var;
        if (uri2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("廼\u0001"));
        }
        Context context = this.mContext.get();
        if (context == null) {
            throw new NullPointerException(ProtectedSandApp.s("廻\u0001"));
        }
        b0 client = OkHttpClientStore.INSTANCE.getClient();
        o oVar = null;
        try {
            f0 j4 = client.b(new d0.a().B(uri.toString()).b()).j();
            try {
                o source = j4.o().getSource();
                try {
                    OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri2);
                    if (openOutputStream == null) {
                        throw new NullPointerException(ProtectedSandApp.s("建\u0001"));
                    }
                    m0 h4 = a0.h(openOutputStream);
                    source.z3(h4);
                    BitmapLoadUtils.close(source);
                    BitmapLoadUtils.close(h4);
                    BitmapLoadUtils.close(j4.o());
                    client.getDispatcher().b();
                    this.mInputUri = this.mOutputUri;
                } catch (Throwable th) {
                    th = th;
                    f0Var = j4;
                    closeable = null;
                    oVar = source;
                    BitmapLoadUtils.close(oVar);
                    BitmapLoadUtils.close(closeable);
                    if (f0Var != null) {
                        BitmapLoadUtils.close(f0Var.o());
                    }
                    client.getDispatcher().b();
                    this.mInputUri = this.mOutputUri;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                f0Var = j4;
                closeable = null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            f0Var = null;
        }
    }

    private void processInputUri() throws NullPointerException, IOException {
        String scheme = this.mInputUri.getScheme();
        if (ProtectedSandApp.s("廽\u0001").equals(scheme) || ProtectedSandApp.s("廾\u0001").equals(scheme)) {
            downloadFile(this.mInputUri, this.mOutputUri);
        } else if (!ProtectedSandApp.s("廿\u0001").equals(scheme) && !ProtectedSandApp.s("开\u0001").equals(scheme)) {
            throw new IllegalArgumentException(c.a(ProtectedSandApp.s("弁\u0001"), scheme));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    @o0
    public BitmapWorkerResult doInBackground(Void... voidArr) {
        String s4;
        InputStream openInputStream;
        Context context = this.mContext.get();
        if (context == null) {
            return new BitmapWorkerResult(new NullPointerException(ProtectedSandApp.s("异\u0001")));
        }
        if (this.mInputUri == null) {
            return new BitmapWorkerResult(new NullPointerException(ProtectedSandApp.s("弃\u0001")));
        }
        try {
            processInputUri();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeStream(context.getContentResolver().openInputStream(this.mInputUri), null, options);
                options.inSampleSize = BitmapLoadUtils.computeSize(options.outWidth, options.outHeight);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            boolean z4 = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (true) {
                String s5 = ProtectedSandApp.s("弄\u0001");
                s4 = ProtectedSandApp.s("弅\u0001");
                if (z4) {
                    if (bitmap == null) {
                        return new BitmapWorkerResult(new IllegalArgumentException(s5 + this.mInputUri + s4));
                    }
                    int exifOrientation = BitmapLoadUtils.getExifOrientation(context, this.mInputUri);
                    int exifToDegrees = BitmapLoadUtils.exifToDegrees(exifOrientation);
                    int exifToTranslation = BitmapLoadUtils.exifToTranslation(exifOrientation);
                    ExifInfo exifInfo = new ExifInfo(exifOrientation, exifToDegrees, exifToTranslation);
                    Matrix matrix = new Matrix();
                    if (exifToDegrees != 0) {
                        matrix.preRotate(exifToDegrees);
                    }
                    if (exifToTranslation != 1) {
                        matrix.postScale(exifToTranslation, 1.0f);
                    }
                    return !matrix.isIdentity() ? new BitmapWorkerResult(BitmapLoadUtils.transformBitmap(bitmap, matrix), exifInfo) : new BitmapWorkerResult(bitmap, exifInfo);
                }
                try {
                    openInputStream = context.getContentResolver().openInputStream(this.mInputUri);
                    try {
                        bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                    } finally {
                        BitmapLoadUtils.close(openInputStream);
                    }
                } catch (IOException e5) {
                    return new BitmapWorkerResult(new IllegalArgumentException(s5 + this.mInputUri + s4, e5));
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                }
                if (options.outWidth == -1 || options.outHeight == -1) {
                    break;
                }
                BitmapLoadUtils.close(openInputStream);
                if (!BitmapLoadUtils.checkSize(bitmap, options)) {
                    z4 = true;
                }
            }
            return new BitmapWorkerResult(new IllegalArgumentException(ProtectedSandApp.s("弆\u0001") + this.mInputUri + s4));
        } catch (IOException | NullPointerException e6) {
            return new BitmapWorkerResult(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(@o0 BitmapWorkerResult bitmapWorkerResult) {
        Exception exc = bitmapWorkerResult.mBitmapWorkerException;
        if (exc == null) {
            this.mBitmapLoadCallback.onBitmapLoaded(bitmapWorkerResult.mBitmapResult, bitmapWorkerResult.mExifInfo, this.mInputUri, this.mOutputUri);
        } else {
            this.mBitmapLoadCallback.onFailure(exc);
        }
    }

    public static class BitmapWorkerResult {
        Bitmap mBitmapResult;
        Exception mBitmapWorkerException;
        ExifInfo mExifInfo;

        public BitmapWorkerResult(@o0 Bitmap bitmap, @o0 ExifInfo exifInfo) {
            this.mBitmapResult = bitmap;
            this.mExifInfo = exifInfo;
        }

        public BitmapWorkerResult(@o0 Exception exc) {
            this.mBitmapWorkerException = exc;
        }
    }
}
