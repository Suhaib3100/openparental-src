package com.luck.picture.lib.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.basic.PictureContentResolver;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class BitmapUtils {
    private static final int ARGB_8888_MEMORY_BYTE = 4;
    private static final int MAX_BITMAP_SIZE = 104857600;

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

    public static int[] getMaxImageSize(int i4, int i5) {
        int i6 = -1;
        if (i4 == 0 && i5 == 0) {
            return new int[]{-1, -1};
        }
        int computeSize = computeSize(i4, i5);
        long totalMemory = getTotalMemory();
        boolean z4 = false;
        int i7 = computeSize;
        int i10 = -1;
        while (!z4) {
            i6 = i4 / i7;
            i10 = i5 / i7;
            if (i6 * i10 * 4 > totalMemory) {
                i7 *= 2;
            } else {
                z4 = true;
            }
        }
        return new int[]{i6, i10};
    }

    public static long getTotalMemory() {
        long j4 = Runtime.getRuntime().totalMemory();
        if (j4 > 104857600) {
            return 104857600L;
        }
        return j4;
    }

    public static int readPictureDegree(Context context, String str) {
        androidx.exifinterface.media.a aVar;
        InputStream inputStream = null;
        try {
            try {
                if (PictureMimeType.isContent(str)) {
                    inputStream = PictureContentResolver.openInputStream(context, Uri.parse(str));
                    aVar = new androidx.exifinterface.media.a(inputStream, 0);
                } else {
                    aVar = new androidx.exifinterface.media.a(str);
                }
                int l4 = aVar.l(ProtectedSandApp.s("ᛓ\u0001"), 1);
                if (l4 == 3) {
                    PictureFileUtils.close(inputStream);
                    return 180;
                }
                if (l4 == 6) {
                    PictureFileUtils.close(inputStream);
                    return 90;
                }
                if (l4 != 8) {
                    PictureFileUtils.close(inputStream);
                    return 0;
                }
                PictureFileUtils.close(inputStream);
                return 270;
            } catch (Exception e4) {
                e4.printStackTrace();
                PictureFileUtils.close(inputStream);
                return 0;
            }
        } catch (Throwable th) {
            PictureFileUtils.close(inputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void rotateImage(android.content.Context r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.utils.BitmapUtils.rotateImage(android.content.Context, java.lang.String):void");
    }

    public static Bitmap rotatingImage(Bitmap bitmap, int i4) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i4);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private static void saveBitmapFile(Bitmap bitmap, FileOutputStream fileOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
            PictureFileUtils.close(fileOutputStream);
            PictureFileUtils.close(byteArrayOutputStream);
        } catch (Exception e5) {
            e = e5;
            byteArrayOutputStream2 = byteArrayOutputStream;
            e.printStackTrace();
            PictureFileUtils.close(fileOutputStream);
            PictureFileUtils.close(byteArrayOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            PictureFileUtils.close(fileOutputStream);
            PictureFileUtils.close(byteArrayOutputStream2);
            throw th;
        }
    }
}
