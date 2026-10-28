package com.yalantis.ucrop.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.WindowManager;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.task.BitmapLoadTask;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class BitmapLoadUtils {
    private static final int MAX_BITMAP_SIZE = 104857600;
    private static final String CONTENT_SCHEME = ProtectedSandApp.s("弉\u0001");
    private static final String TAG = ProtectedSandApp.s("弊\u0001");

    @Deprecated
    public static int calculateInSampleSize(@o0 BitmapFactory.Options options, int i4, int i5) {
        int i6 = options.outHeight;
        int i7 = options.outWidth;
        int i10 = 1;
        if (i6 > i5 || i7 > i4) {
            while (true) {
                if (i6 / i10 <= i5 && i7 / i10 <= i4) {
                    break;
                }
                i10 *= 2;
            }
        }
        return i10;
    }

    public static int calculateMaxBitmapSize(@o0 Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("弈\u0001"));
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int sqrt = (int) Math.sqrt(Math.pow(point.y, 2.0d) + Math.pow(point.x, 2.0d));
        Canvas canvas = new Canvas();
        int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = Math.min(sqrt, min);
        }
        int maxTextureSize = EglUtils.getMaxTextureSize();
        return maxTextureSize > 0 ? Math.min(sqrt, maxTextureSize) : sqrt;
    }

    public static boolean checkSize(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= getTotalMemory()) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    public static void close(@q0 Closeable closeable) {
        if (closeable == null || !(closeable instanceof Closeable)) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static int computeSize(int i4, int i5) {
        if (i4 % 2 == 1) {
            i4++;
        }
        if (i5 % 2 == 1) {
            i5++;
        }
        int max = Math.max(i4, i5);
        float min = Math.min(i4, i5) / max;
        if (min > 1.0f || min <= 0.5625d) {
            double d5 = min;
            if (d5 > 0.5625d || d5 <= 0.5d) {
                return (int) Math.ceil(max / (1280.0d / d5));
            }
            int i6 = max / 1280;
            if (i6 == 0) {
                return 1;
            }
            return i6;
        }
        if (max < 1664) {
            return 1;
        }
        if (max < 4990) {
            return 2;
        }
        if (max <= 4990 || max >= 10240) {
            return max / 1280;
        }
        return 4;
    }

    public static void decodeBitmapInBackground(@o0 Context context, @o0 Uri uri, @q0 Uri uri2, int i4, int i5, BitmapLoadCallback bitmapLoadCallback) {
        new BitmapLoadTask(context, uri, uri2, i4, i5, bitmapLoadCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static int exifToDegrees(int i4) {
        switch (i4) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int exifToTranslation(int i4) {
        return (i4 == 2 || i4 == 7 || i4 == 4 || i4 == 5) ? -1 : 1;
    }

    public static int getExifOrientation(@o0 Context context, @o0 Uri uri) {
        int i4 = 0;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return 0;
            }
            i4 = new ImageHeaderParser(openInputStream).getOrientation();
            close(openInputStream);
            return i4;
        } catch (IOException unused) {
            uri.toString();
            return i4;
        }
    }

    public static int[] getMaxImageSize(Context context, Uri uri) {
        if (FileUtils.isHasHttp(uri.toString())) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
            options.inSampleSize = computeSize(options.outWidth, options.outHeight);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        options.inJustDecodeBounds = false;
        boolean z4 = false;
        Bitmap bitmap = null;
        while (!z4) {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                    close(openInputStream);
                    if (!checkSize(bitmap, options)) {
                        z4 = true;
                    }
                } catch (Throwable th) {
                    close(openInputStream);
                    throw th;
                }
            } catch (IOException unused) {
            } catch (OutOfMemoryError unused2) {
                options.inSampleSize *= 2;
            }
        }
        return bitmap == null ? new int[]{0, 0} : new int[]{bitmap.getWidth(), bitmap.getHeight()};
    }

    public static long getTotalMemory() {
        long j4 = Runtime.getRuntime().totalMemory();
        if (j4 > 104857600) {
            return 104857600L;
        }
        return j4;
    }

    public static boolean hasContentScheme(Uri uri) {
        return uri != null && ProtectedSandApp.s("弉\u0001").equals(uri.getScheme());
    }

    public static Bitmap transformBitmap(@o0 Bitmap bitmap, @o0 Matrix matrix) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return !bitmap.sameAs(createBitmap) ? createBitmap : bitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }
}
