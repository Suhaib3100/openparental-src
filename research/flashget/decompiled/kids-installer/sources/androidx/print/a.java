package androidx.print;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PrintHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    private static final int f8783h = 3500;

    /* renamed from: k, reason: collision with root package name */
    public static final int f8786k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f8787l = 2;

    /* renamed from: m, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f8788m = 1;

    /* renamed from: n, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f8789n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f8790o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f8791p = 2;

    /* renamed from: a, reason: collision with root package name */
    final Context f8792a;

    /* renamed from: b, reason: collision with root package name */
    BitmapFactory.Options f8793b = null;

    /* renamed from: c, reason: collision with root package name */
    final Object f8794c = new Object();

    /* renamed from: d, reason: collision with root package name */
    int f8795d = 2;

    /* renamed from: e, reason: collision with root package name */
    int f8796e = 2;

    /* renamed from: f, reason: collision with root package name */
    int f8797f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final String f8782g = "PrintHelper";

    /* renamed from: i, reason: collision with root package name */
    static final boolean f8784i = true;

    /* renamed from: j, reason: collision with root package name */
    static final boolean f8785j = true;

    /* compiled from: PrintHelper.java */
    /* renamed from: androidx.print.a$a, reason: collision with other inner class name */
    class AsyncTaskC0106a extends AsyncTask<Void, Void, Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f8798a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f8799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f8800c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f8801d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f8802e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptor f8803f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f8804g;

        AsyncTaskC0106a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i5, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f8798a = cancellationSignal;
            this.f8799b = printAttributes;
            this.f8800c = bitmap;
            this.f8801d = printAttributes2;
            this.f8802e = i5;
            this.f8803f = parcelFileDescriptor;
            this.f8804g = writeResultCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f8798a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(a.this.f8792a, this.f8799b);
                Bitmap a6 = a.a(this.f8800c, this.f8799b.getColorMode());
                if (this.f8798a.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page startPage = printedPdfDocument.startPage(1);
                    boolean z5 = a.f8785j;
                    if (z5) {
                        rectF = new RectF(startPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(a.this.f8792a, this.f8801d);
                        PdfDocument.Page startPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(startPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(startPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix d6 = a.d(a6.getWidth(), a6.getHeight(), rectF, this.f8802e);
                    if (!z5) {
                        d6.postTranslate(rectF.left, rectF.top);
                        startPage.getCanvas().clipRect(rectF);
                    }
                    startPage.getCanvas().drawBitmap(a6, d6, null);
                    printedPdfDocument.finishPage(startPage);
                    if (this.f8798a.isCanceled()) {
                        printedPdfDocument.close();
                        ParcelFileDescriptor parcelFileDescriptor = this.f8803f;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (a6 != this.f8800c) {
                            a6.recycle();
                        }
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f8803f.getFileDescriptor()));
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor2 = this.f8803f;
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (a6 != this.f8800c) {
                        a6.recycle();
                    }
                    return null;
                } finally {
                }
            } catch (Throwable th) {
                return th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Throwable th) {
            if (this.f8798a.isCanceled()) {
                this.f8804g.onWriteCancelled();
            } else if (th == null) {
                this.f8804g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                this.f8804g.onWriteFailed(null);
            }
        }
    }

    /* compiled from: PrintHelper.java */
    public interface b {
        void a();
    }

    /* compiled from: PrintHelper.java */
    @x0(19)
    private class c extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final String f8806a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8807b;

        /* renamed from: c, reason: collision with root package name */
        private final Bitmap f8808c;

        /* renamed from: d, reason: collision with root package name */
        private final b f8809d;

        /* renamed from: e, reason: collision with root package name */
        private PrintAttributes f8810e;

        c(String str, int i5, Bitmap bitmap, b bVar) {
            this.f8806a = str;
            this.f8807b = i5;
            this.f8808c = bitmap;
            this.f8809d = bVar;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            b bVar = this.f8809d;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f8810e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f8806a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f8810e, this.f8807b, this.f8808c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* compiled from: PrintHelper.java */
    @x0(19)
    private class d extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        final String f8812a;

        /* renamed from: b, reason: collision with root package name */
        final Uri f8813b;

        /* renamed from: c, reason: collision with root package name */
        final b f8814c;

        /* renamed from: d, reason: collision with root package name */
        final int f8815d;

        /* renamed from: e, reason: collision with root package name */
        PrintAttributes f8816e;

        /* renamed from: f, reason: collision with root package name */
        AsyncTask<Uri, Boolean, Bitmap> f8817f;

        /* renamed from: g, reason: collision with root package name */
        Bitmap f8818g = null;

        /* compiled from: PrintHelper.java */
        /* renamed from: androidx.print.a$d$a, reason: collision with other inner class name */
        class AsyncTaskC0107a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellationSignal f8820a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f8821b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f8822c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f8823d;

            /* compiled from: PrintHelper.java */
            /* renamed from: androidx.print.a$d$a$a, reason: collision with other inner class name */
            class C0108a implements CancellationSignal.OnCancelListener {
                C0108a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    d.this.a();
                    AsyncTaskC0107a.this.cancel(false);
                }
            }

            AsyncTaskC0107a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f8820a = cancellationSignal;
                this.f8821b = printAttributes;
                this.f8822c = printAttributes2;
                this.f8823d = layoutResultCallback;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    d dVar = d.this;
                    return a.this.i(dVar.f8813b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.f8823d.onLayoutCancelled();
                d.this.f8817f = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!a.f8784i || a.this.f8797f == 0)) {
                    synchronized (this) {
                        mediaSize = d.this.f8816e.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != a.g(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                d.this.f8818g = bitmap;
                if (bitmap != null) {
                    this.f8823d.onLayoutFinished(new PrintDocumentInfo.Builder(d.this.f8812a).setContentType(1).setPageCount(1).build(), true ^ this.f8821b.equals(this.f8822c));
                } else {
                    this.f8823d.onLayoutFailed(null);
                }
                d.this.f8817f = null;
            }

            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                this.f8820a.setOnCancelListener(new C0108a());
            }
        }

        d(String str, Uri uri, b bVar, int i5) {
            this.f8812a = str;
            this.f8813b = uri;
            this.f8814c = bVar;
            this.f8815d = i5;
        }

        void a() {
            synchronized (a.this.f8794c) {
                a aVar = a.this;
                if (aVar.f8793b != null) {
                    aVar.f8793b = null;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f8817f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            b bVar = this.f8814c;
            if (bVar != null) {
                bVar.a();
            }
            Bitmap bitmap = this.f8818g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f8818g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f8816e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f8818g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f8812a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f8817f = new AsyncTaskC0107a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f8816e, this.f8815d, this.f8818g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    public a(@o0 Context context) {
        this.f8792a = context;
    }

    static Bitmap a(Bitmap bitmap, int i5) {
        if (i5 != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @x0(19)
    private static PrintAttributes.Builder b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    static Matrix d(int i5, int i6, RectF rectF, int i7) {
        Matrix matrix = new Matrix();
        float f6 = i5;
        float width = rectF.width() / f6;
        float max = i7 == 2 ? Math.max(width, rectF.height() / i6) : Math.min(width, rectF.height() / i6);
        matrix.postScale(max, max);
        matrix.postTranslate((rectF.width() - (f6 * max)) / 2.0f, (rectF.height() - (i6 * max)) / 2.0f);
        return matrix;
    }

    static boolean g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    private Bitmap h(Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
        Context context;
        if (uri == null || (context = this.f8792a) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return decodeStream;
            } catch (Throwable th) {
                th = th;
                inputStream = openInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean q() {
        return true;
    }

    public int c() {
        return this.f8796e;
    }

    public int e() {
        int i5 = this.f8797f;
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }

    public int f() {
        return this.f8795d;
    }

    Bitmap i(Uri uri) throws FileNotFoundException {
        BitmapFactory.Options options;
        if (uri == null || this.f8792a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        h(uri, options2);
        int i5 = options2.outWidth;
        int i6 = options2.outHeight;
        if (i5 > 0 && i6 > 0) {
            int max = Math.max(i5, i6);
            int i7 = 1;
            while (max > f8783h) {
                max >>>= 1;
                i7 <<= 1;
            }
            if (i7 > 0 && Math.min(i5, i6) / i7 > 0) {
                synchronized (this.f8794c) {
                    options = new BitmapFactory.Options();
                    this.f8793b = options;
                    options.inMutable = true;
                    options.inSampleSize = i7;
                }
                try {
                    Bitmap h5 = h(uri, options);
                    synchronized (this.f8794c) {
                        this.f8793b = null;
                    }
                    return h5;
                } catch (Throwable th) {
                    synchronized (this.f8794c) {
                        this.f8793b = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public void j(@o0 String str, @o0 Bitmap bitmap) {
        k(str, bitmap, null);
    }

    public void k(@o0 String str, @o0 Bitmap bitmap, @q0 b bVar) {
        if (bitmap == null) {
            return;
        }
        ((PrintManager) this.f8792a.getSystemService("print")).print(str, new c(str, this.f8795d, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(g(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f8796e).build());
    }

    public void l(@o0 String str, @o0 Uri uri) throws FileNotFoundException {
        m(str, uri, null);
    }

    public void m(@o0 String str, @o0 Uri uri, @q0 b bVar) throws FileNotFoundException {
        d dVar = new d(str, uri, bVar, this.f8795d);
        PrintManager printManager = (PrintManager) this.f8792a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f8796e);
        int i5 = this.f8797f;
        if (i5 == 1 || i5 == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i5 == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, dVar, builder.build());
    }

    public void n(int i5) {
        this.f8796e = i5;
    }

    public void o(int i5) {
        this.f8797f = i5;
    }

    public void p(int i5) {
        this.f8795d = i5;
    }

    @x0(19)
    void r(PrintAttributes printAttributes, int i5, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new AsyncTaskC0106a(cancellationSignal, f8785j ? printAttributes : b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i5, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
