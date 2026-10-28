package com.nostra13.universalimageloader.core.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.core.assist.e;
import com.nostra13.universalimageloader.core.download.b;
import com.nostra13.universalimageloader.utils.d;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: BaseImageDecoder.java */
/* loaded from: classes6.dex */
public class a implements com.nostra13.universalimageloader.core.decode.b {

    /* renamed from: b, reason: collision with root package name */
    protected static final String f70347b = ProtectedSandApp.s("ᩱ\u0001");

    /* renamed from: c, reason: collision with root package name */
    protected static final String f70348c = ProtectedSandApp.s("ᩬ\u0001");

    /* renamed from: d, reason: collision with root package name */
    protected static final String f70349d = ProtectedSandApp.s("ᩮ\u0001");

    /* renamed from: e, reason: collision with root package name */
    protected static final String f70350e = ProtectedSandApp.s("ᩭ\u0001");

    /* renamed from: f, reason: collision with root package name */
    protected static final String f70351f = ProtectedSandApp.s("ᩪ\u0001");

    /* renamed from: g, reason: collision with root package name */
    protected static final String f70352g = ProtectedSandApp.s("ᩫ\u0001");

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f70353a;

    /* compiled from: BaseImageDecoder.java */
    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public final e f70356a;

        /* renamed from: b, reason: collision with root package name */
        public final C0988a f70357b;

        protected b(e eVar, C0988a c0988a) {
            this.f70356a = eVar;
            this.f70357b = c0988a;
        }
    }

    public a(boolean z4) {
        this.f70353a = z4;
    }

    private boolean b(String str, String str2) {
        return ProtectedSandApp.s("ᩩ\u0001").equalsIgnoreCase(str2) && b.a.ofUri(str) == b.a.FILE;
    }

    @Override // com.nostra13.universalimageloader.core.decode.b
    public Bitmap a(c cVar) throws IOException {
        InputStream f4 = f(cVar);
        if (f4 == null) {
            d.c(ProtectedSandApp.s("ᩪ\u0001"), cVar.g());
            return null;
        }
        try {
            b e4 = e(f4, cVar);
            f4 = h(f4, cVar);
            Bitmap decodeStream = BitmapFactory.decodeStream(f4, null, g(e4.f70356a, cVar));
            if (decodeStream != null) {
                C0988a c0988a = e4.f70357b;
                return c(decodeStream, cVar, c0988a.f70354a, c0988a.f70355b);
            }
            d.c(ProtectedSandApp.s("ᩫ\u0001"), cVar.g());
            return decodeStream;
        } finally {
            com.nostra13.universalimageloader.utils.c.a(f4);
        }
    }

    protected Bitmap c(Bitmap bitmap, c cVar, int i4, boolean z4) {
        Matrix matrix = new Matrix();
        com.nostra13.universalimageloader.core.assist.d h4 = cVar.h();
        if (h4 == com.nostra13.universalimageloader.core.assist.d.EXACTLY || h4 == com.nostra13.universalimageloader.core.assist.d.EXACTLY_STRETCHED) {
            e eVar = new e(bitmap.getWidth(), bitmap.getHeight(), i4);
            float b5 = com.nostra13.universalimageloader.utils.b.b(eVar, cVar.k(), cVar.l(), h4 == com.nostra13.universalimageloader.core.assist.d.EXACTLY_STRETCHED);
            if (Float.compare(b5, 1.0f) != 0) {
                matrix.setScale(b5, b5);
                if (this.f70353a) {
                    d.a(ProtectedSandApp.s("ᩬ\u0001"), eVar, eVar.c(b5), Float.valueOf(b5), cVar.g());
                }
            }
        }
        if (z4) {
            matrix.postScale(-1.0f, 1.0f);
            if (this.f70353a) {
                d.a(ProtectedSandApp.s("ᩭ\u0001"), cVar.g());
            }
        }
        if (i4 != 0) {
            matrix.postRotate(i4);
            if (this.f70353a) {
                d.a(ProtectedSandApp.s("ᩮ\u0001"), Integer.valueOf(i4), cVar.g());
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    protected C0988a d(String str) {
        boolean z4;
        int i4;
        int i5 = 0;
        try {
            z4 = 1;
        } catch (IOException unused) {
            d.i(ProtectedSandApp.s("ᩰ\u0001"), str);
        }
        switch (new ExifInterface(b.a.FILE.crop(str)).getAttributeInt(ProtectedSandApp.s("ᩯ\u0001"), 1)) {
            case 1:
            default:
                z4 = 0;
                break;
            case 2:
                break;
            case 3:
                i4 = 180;
                z4 = i5;
                i5 = i4;
                break;
            case 4:
                i5 = 1;
                i4 = 180;
                z4 = i5;
                i5 = i4;
                break;
            case 5:
                i5 = 1;
                i4 = 270;
                z4 = i5;
                i5 = i4;
                break;
            case 6:
                i4 = 90;
                z4 = i5;
                i5 = i4;
                break;
            case 7:
                i5 = 1;
                i4 = 90;
                z4 = i5;
                i5 = i4;
                break;
            case 8:
                i4 = 270;
                z4 = i5;
                i5 = i4;
                break;
        }
        return new C0988a(i5, z4);
    }

    protected b e(InputStream inputStream, c cVar) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        String i4 = cVar.i();
        C0988a d5 = (cVar.m() && b(i4, options.outMimeType)) ? d(i4) : new C0988a();
        return new b(new e(options.outWidth, options.outHeight, d5.f70354a), d5);
    }

    protected InputStream f(c cVar) throws IOException {
        return cVar.e().a(cVar.i(), cVar.f());
    }

    protected BitmapFactory.Options g(e eVar, c cVar) {
        int a5;
        com.nostra13.universalimageloader.core.assist.d h4 = cVar.h();
        if (h4 == com.nostra13.universalimageloader.core.assist.d.NONE) {
            a5 = 1;
        } else if (h4 == com.nostra13.universalimageloader.core.assist.d.NONE_SAFE) {
            a5 = com.nostra13.universalimageloader.utils.b.c(eVar);
        } else {
            a5 = com.nostra13.universalimageloader.utils.b.a(eVar, cVar.k(), cVar.l(), h4 == com.nostra13.universalimageloader.core.assist.d.IN_SAMPLE_POWER_OF_2);
        }
        if (a5 > 1 && this.f70353a) {
            d.a(ProtectedSandApp.s("ᩱ\u0001"), eVar, eVar.d(a5), Integer.valueOf(a5), cVar.g());
        }
        BitmapFactory.Options d5 = cVar.d();
        d5.inSampleSize = a5;
        return d5;
    }

    protected InputStream h(InputStream inputStream, c cVar) throws IOException {
        if (inputStream.markSupported()) {
            try {
                inputStream.reset();
                return inputStream;
            } catch (IOException unused) {
            }
        }
        com.nostra13.universalimageloader.utils.c.a(inputStream);
        return f(cVar);
    }

    /* compiled from: BaseImageDecoder.java */
    /* renamed from: com.nostra13.universalimageloader.core.decode.a$a, reason: collision with other inner class name */
    protected static class C0988a {

        /* renamed from: a, reason: collision with root package name */
        public final int f70354a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f70355b;

        protected C0988a() {
            this.f70354a = 0;
            this.f70355b = false;
        }

        protected C0988a(int i4, boolean z4) {
            this.f70354a = i4;
            this.f70355b = z4;
        }
    }
}
