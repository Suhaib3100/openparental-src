package top.zibin.luban;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Engine.java */
/* loaded from: classes9.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private g f91924a;

    /* renamed from: b, reason: collision with root package name */
    private File f91925b;

    /* renamed from: c, reason: collision with root package name */
    private int f91926c;

    /* renamed from: d, reason: collision with root package name */
    private int f91927d;

    /* renamed from: e, reason: collision with root package name */
    private int f91928e;

    /* renamed from: f, reason: collision with root package name */
    private int f91929f;

    /* renamed from: g, reason: collision with root package name */
    private int f91930g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f91931h;

    d(g gVar, File file, boolean z4) throws IOException {
        this.f91925b = file;
        this.f91924a = gVar;
        this.f91931h = z4;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeStream(gVar.open(), null, options);
        this.f91926c = options.outWidth;
        this.f91928e = options.outHeight;
    }

    private int b() {
        int i4 = this.f91926c;
        if (i4 % 2 == 1) {
            i4++;
        }
        this.f91926c = i4;
        int i5 = this.f91928e;
        if (i5 % 2 == 1) {
            i5++;
        }
        this.f91928e = i5;
        int max = Math.max(i4, i5);
        float min = Math.min(this.f91926c, this.f91928e) / max;
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
        if (max > 4990 && max < 10240) {
            return 4;
        }
        int i7 = max / 1280;
        if (i7 == 0) {
            return 1;
        }
        return i7;
    }

    private Bitmap d(Bitmap bitmap, int i4) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i4);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    File a() throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = b();
        Bitmap decodeStream = BitmapFactory.decodeStream(this.f91924a.open(), null, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b bVar = b.SINGLE;
        if (bVar.isJPG(this.f91924a.open())) {
            decodeStream = d(decodeStream, bVar.getOrientation(this.f91924a.open()));
        }
        decodeStream.compress(this.f91931h ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
        decodeStream.recycle();
        this.f91927d = options.outWidth;
        this.f91929f = options.outHeight;
        this.f91930g = byteArrayOutputStream.size();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f91925b);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return this.f91925b;
    }

    int[] c() {
        return new int[]{this.f91927d, this.f91929f, this.f91930g};
    }
}
