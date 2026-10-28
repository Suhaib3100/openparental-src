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
import androidx.compose.material3.f4;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PrintHelper.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    private static final int f32506h = 3500;

    /* renamed from: k, reason: collision with root package name */
    public static final int f32509k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f32510l = 2;

    /* renamed from: m, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f32511m = 1;

    /* renamed from: n, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f32512n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f32513o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f32514p = 2;

    /* renamed from: a, reason: collision with root package name */
    final Context f32515a;

    /* renamed from: b, reason: collision with root package name */
    BitmapFactory.Options f32516b = null;

    /* renamed from: c, reason: collision with root package name */
    final Object f32517c = new Object();

    /* renamed from: d, reason: collision with root package name */
    int f32518d = 2;

    /* renamed from: e, reason: collision with root package name */
    int f32519e = 2;

    /* renamed from: f, reason: collision with root package name */
    int f32520f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final String f32505g = "PrintHelper";

    /* renamed from: i, reason: collision with root package name */
    static final boolean f32507i = true;

    /* renamed from: j, reason: collision with root package name */
    static final boolean f32508j = true;

    /* compiled from: PrintHelper.java */
    /* renamed from: androidx.print.a$a, reason: collision with other inner class name */
    class AsyncTaskC0568a extends AsyncTask<Void, Void, Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f32521a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f32522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f32523c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f32524d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f32525e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptor f32526f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f32527g;

        AsyncTaskC0568a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i4, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f32521a = cancellationSignal;
            this.f32522b = printAttributes;
            this.f32523c = bitmap;
            this.f32524d = printAttributes2;
            this.f32525e = i4;
            this.f32526f = parcelFileDescriptor;
            this.f32527g = writeResultCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f32521a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(a.this.f32515a, this.f32522b);
                Bitmap a5 = a.a(this.f32523c, this.f32522b.getColorMode());
                if (this.f32521a.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page startPage = printedPdfDocument.startPage(1);
                    boolean z4 = a.f32508j;
                    if (z4) {
                        rectF = new RectF(startPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(a.this.f32515a, this.f32524d);
                        PdfDocument.Page startPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(startPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(startPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix d5 = a.d(a5.getWidth(), a5.getHeight(), rectF, this.f32525e);
                    if (!z4) {
                        d5.postTranslate(rectF.left, rectF.top);
                        startPage.getCanvas().clipRect(rectF);
                    }
                    startPage.getCanvas().drawBitmap(a5, d5, null);
                    printedPdfDocument.finishPage(startPage);
                    if (this.f32521a.isCanceled()) {
                        printedPdfDocument.close();
                        ParcelFileDescriptor parcelFileDescriptor = this.f32526f;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (a5 != this.f32523c) {
                            a5.recycle();
                        }
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f32526f.getFileDescriptor()));
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor2 = this.f32526f;
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (a5 != this.f32523c) {
                        a5.recycle();
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
            if (this.f32521a.isCanceled()) {
                this.f32527g.onWriteCancelled();
            } else if (th == null) {
                this.f32527g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                this.f32527g.onWriteFailed(null);
            }
        }
    }

    /* compiled from: PrintHelper.java */
    public interface b {
        void onFinish();
    }

    /* compiled from: PrintHelper.java */
    @x0(19)
    private class c extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final String f32529a;

        /* renamed from: b, reason: collision with root package name */
        private final int f32530b;

        /* renamed from: c, reason: collision with root package name */
        private final Bitmap f32531c;

        /* renamed from: d, reason: collision with root package name */
        private final b f32532d;

        /* renamed from: e, reason: collision with root package name */
        private PrintAttributes f32533e;

        c(String str, int i4, Bitmap bitmap, b bVar) {
            this.f32529a = str;
            this.f32530b = i4;
            this.f32531c = bitmap;
            this.f32532d = bVar;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            b bVar = this.f32532d;
            if (bVar != null) {
                bVar.onFinish();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f32533e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f32529a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f32533e, this.f32530b, this.f32531c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* compiled from: PrintHelper.java */
    @x0(19)
    private class d extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        final String f32535a;

        /* renamed from: b, reason: collision with root package name */
        final Uri f32536b;

        /* renamed from: c, reason: collision with root package name */
        final b f32537c;

        /* renamed from: d, reason: collision with root package name */
        final int f32538d;

        /* renamed from: e, reason: collision with root package name */
        PrintAttributes f32539e;

        /* renamed from: f, reason: collision with root package name */
        AsyncTask<Uri, Boolean, Bitmap> f32540f;

        /* renamed from: g, reason: collision with root package name */
        Bitmap f32541g = null;

        /* compiled from: PrintHelper.java */
        /* renamed from: androidx.print.a$d$a, reason: collision with other inner class name */
        class AsyncTaskC0569a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellationSignal f32543a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f32544b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f32545c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f32546d;

            /* compiled from: PrintHelper.java */
            /* renamed from: androidx.print.a$d$a$a, reason: collision with other inner class name */
            class C0570a implements CancellationSignal.OnCancelListener {
                C0570a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    d.this.a();
                    AsyncTaskC0569a.this.cancel(false);
                }
            }

            AsyncTaskC0569a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f32543a = cancellationSignal;
                this.f32544b = printAttributes;
                this.f32545c = printAttributes2;
                this.f32546d = layoutResultCallback;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    d dVar = d.this;
                    return a.this.i(dVar.f32536b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.f32546d.onLayoutCancelled();
                d.this.f32540f = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!a.f32507i || a.this.f32520f == 0)) {
                    synchronized (this) {
                        mediaSize = d.this.f32539e.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != a.g(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                d.this.f32541g = bitmap;
                if (bitmap != null) {
                    this.f32546d.onLayoutFinished(new PrintDocumentInfo.Builder(d.this.f32535a).setContentType(1).setPageCount(1).build(), true ^ this.f32544b.equals(this.f32545c));
                } else {
                    this.f32546d.onLayoutFailed(null);
                }
                d.this.f32540f = null;
            }

            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                this.f32543a.setOnCancelListener(new C0570a());
            }
        }

        d(String str, Uri uri, b bVar, int i4) {
            this.f32535a = str;
            this.f32536b = uri;
            this.f32537c = bVar;
            this.f32538d = i4;
        }

        void a() {
            synchronized (a.this.f32517c) {
                try {
                    a aVar = a.this;
                    if (aVar.f32516b != null) {
                        aVar.f32516b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f32540f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            b bVar = this.f32537c;
            if (bVar != null) {
                bVar.onFinish();
            }
            Bitmap bitmap = this.f32541g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f32541g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f32539e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f32541g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f32535a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f32540f = new AsyncTaskC0569a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f32539e, this.f32538d, this.f32541g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    public a(@o0 Context context) {
        this.f32515a = context;
    }

    static Bitmap a(Bitmap bitmap, int i4) {
        if (i4 != 1) {
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

    static Matrix d(int i4, int i5, RectF rectF, int i6) {
        Matrix matrix = new Matrix();
        float f4 = i4;
        float width = rectF.width() / f4;
        float max = i6 == 2 ? Math.max(width, rectF.height() / i5) : Math.min(width, rectF.height() / i5);
        matrix.postScale(max, max);
        matrix.postTranslate(f4.a(f4, max, rectF.width(), 2.0f), f4.a(i5, max, rectF.height(), 2.0f));
        return matrix;
    }

    static boolean g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    private Bitmap h(Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
        Context context;
        if (uri == null || (context = this.f32515a) == null) {
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
        return this.f32519e;
    }

    public int e() {
        int i4 = this.f32520f;
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public int f() {
        return this.f32518d;
    }

    Bitmap i(Uri uri) throws FileNotFoundException {
        BitmapFactory.Options options;
        if (uri == null || this.f32515a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        h(uri, options2);
        int i4 = options2.outWidth;
        int i5 = options2.outHeight;
        if (i4 > 0 && i5 > 0) {
            int max = Math.max(i4, i5);
            int i6 = 1;
            while (max > f32506h) {
                max >>>= 1;
                i6 <<= 1;
            }
            if (i6 > 0 && Math.min(i4, i5) / i6 > 0) {
                synchronized (this.f32517c) {
                    options = new BitmapFactory.Options();
                    this.f32516b = options;
                    options.inMutable = true;
                    options.inSampleSize = i6;
                }
                try {
                    Bitmap h4 = h(uri, options);
                    synchronized (this.f32517c) {
                        this.f32516b = null;
                    }
                    return h4;
                } catch (Throwable th) {
                    synchronized (this.f32517c) {
                        this.f32516b = null;
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
        ((PrintManager) this.f32515a.getSystemService("print")).print(str, new c(str, this.f32518d, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(g(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f32519e).build());
    }

    public void l(@o0 String str, @o0 Uri uri) throws FileNotFoundException {
        m(str, uri, null);
    }

    public void m(@o0 String str, @o0 Uri uri, @q0 b bVar) throws FileNotFoundException {
        d dVar = new d(str, uri, bVar, this.f32518d);
        PrintManager printManager = (PrintManager) this.f32515a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f32519e);
        int i4 = this.f32520f;
        if (i4 == 1 || i4 == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i4 == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, dVar, builder.build());
    }

    public void n(int i4) {
        this.f32519e = i4;
    }

    public void o(int i4) {
        this.f32520f = i4;
    }

    public void p(int i4) {
        this.f32518d = i4;
    }

    @x0(19)
    void r(PrintAttributes printAttributes, int i4, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new AsyncTaskC0568a(cancellationSignal, f32508j ? printAttributes : b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i4, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
