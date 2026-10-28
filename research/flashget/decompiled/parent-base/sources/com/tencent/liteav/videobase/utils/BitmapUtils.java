package com.tencent.liteav.videobase.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ExifInterface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class BitmapUtils {
    public static Bitmap createBitmap(Bitmap bitmap, Matrix matrix, boolean z4) {
        if (bitmap == null) {
            return null;
        }
        bitmap.getConfig();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        try {
            if (!z4) {
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, paint);
            return createBitmap;
        } catch (Throwable th) {
            LiteavLog.e(ProtectedSandApp.s("唪\u0001"), ProtectedSandApp.s("唫\u0001"), th);
            return null;
        }
    }

    public static Bitmap createBitmapFromBuffer(ByteBuffer byteBuffer, int i4, int i5) {
        try {
            byteBuffer.position(0);
            Bitmap createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer);
            return createBitmap;
        } catch (Throwable th) {
            LiteavLog.e(ProtectedSandApp.s("唪\u0001"), ProtectedSandApp.s("唫\u0001"), th);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Bitmap createBitmapFromFile(String str, int i4, int i5) {
        int i6;
        try {
            int i7 = 1;
            int i10 = 0;
            switch (new ExifInterface(str).getAttributeInt(ProtectedSandApp.s("唬\u0001"), 1)) {
                case 1:
                    i7 = 0;
                    i6 = i10;
                    i10 = i7;
                    break;
                case 2:
                    i6 = i10;
                    i10 = i7;
                    break;
                case 3:
                    i7 = 0;
                    i10 = 180;
                    i6 = i10;
                    i10 = i7;
                    break;
                case 4:
                    i10 = 180;
                    i6 = i10;
                    i10 = i7;
                    break;
                case 5:
                    i10 = 270;
                    i6 = i10;
                    i10 = i7;
                    break;
                case 6:
                    i7 = 0;
                    i10 = 90;
                    i6 = i10;
                    i10 = i7;
                    break;
                case 7:
                    i10 = 90;
                    i6 = i10;
                    i10 = i7;
                    break;
                case 8:
                    i7 = 0;
                    i10 = 270;
                    i6 = i10;
                    i10 = i7;
                    break;
                default:
                    i6 = 0;
                    break;
            }
            Matrix matrix = new Matrix();
            if (i10 != 0) {
                matrix.postScale(-1.0f, 1.0f);
            }
            if (i6 != 0) {
                matrix.postRotate(i6);
            }
            Bitmap loadBitmapFile = loadBitmapFile(str, i4, i5, i6);
            return Bitmap.createBitmap(loadBitmapFile, 0, 0, loadBitmapFile.getWidth(), loadBitmapFile.getHeight(), matrix, true);
        } catch (Throwable th) {
            LiteavLog.e(ProtectedSandApp.s("唪\u0001"), ProtectedSandApp.s("唭\u0001").concat(String.valueOf(str)), th);
            return null;
        }
    }

    private static Bitmap loadBitmapFile(String str, int i4, int i5, int i6) throws Throwable {
        if (i4 <= 0 || i5 <= 0) {
            return BitmapFactory.decodeFile(str);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i7 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        boolean z4 = i6 == 90 || i6 == 270;
        int i10 = z4 ? options.outHeight : options.outWidth;
        int i11 = z4 ? options.outWidth : options.outHeight;
        if (i10 > i4 || i11 > i5) {
            int i12 = i10 / ((i4 / 2) + 1);
            int i13 = i11 / ((i5 / 2) + 1);
            i7 = i13 > i12 ? i12 : i13;
        }
        options.inSampleSize = i7;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static void saveBitmapToFile(Bitmap bitmap, String str) {
        FileOutputStream fileOutputStream;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            com.tencent.liteav.base.util.e.a(fileOutputStream);
        } catch (Exception e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            LiteavLog.e(ProtectedSandApp.s("唪\u0001"), ProtectedSandApp.s("售\u0001"), e);
            com.tencent.liteav.base.util.e.a(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            com.tencent.liteav.base.util.e.a(fileOutputStream2);
            throw th;
        }
    }
}
