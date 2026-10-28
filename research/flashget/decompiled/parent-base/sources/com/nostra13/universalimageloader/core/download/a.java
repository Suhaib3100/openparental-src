package com.nostra13.universalimageloader.core.download;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.core.download.b;
import com.nostra13.universalimageloader.utils.c;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: BaseImageDownloader.java */
/* loaded from: classes6.dex */
public class a implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f70390d = 5000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f70391e = 20000;

    /* renamed from: f, reason: collision with root package name */
    protected static final int f70392f = 32768;

    /* renamed from: h, reason: collision with root package name */
    protected static final int f70394h = 5;

    /* renamed from: a, reason: collision with root package name */
    protected final Context f70397a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f70398b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f70399c;

    /* renamed from: g, reason: collision with root package name */
    protected static final String f70393g = ProtectedSandApp.s("᩶\u0001");

    /* renamed from: i, reason: collision with root package name */
    protected static final String f70395i = ProtectedSandApp.s("᩷\u0001");

    /* renamed from: j, reason: collision with root package name */
    private static final String f70396j = ProtectedSandApp.s("᩺\u0001");

    /* compiled from: BaseImageDownloader.java */
    /* renamed from: com.nostra13.universalimageloader.core.download.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0989a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70400a;

        static {
            int[] iArr = new int[b.a.values().length];
            f70400a = iArr;
            try {
                iArr[b.a.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70400a[b.a.HTTPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70400a[b.a.FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70400a[b.a.CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70400a[b.a.ASSETS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70400a[b.a.DRAWABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70400a[b.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public a(Context context) {
        this(context, 5000, 20000);
    }

    @TargetApi(8)
    private InputStream j(String str) {
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 2);
        if (createVideoThumbnail == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createVideoThumbnail.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    private boolean k(Uri uri) {
        String type = this.f70397a.getContentResolver().getType(uri);
        return type != null && type.startsWith(ProtectedSandApp.s("᩵\u0001"));
    }

    private boolean l(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Uri.encode(str)));
        return mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith(ProtectedSandApp.s("᩵\u0001"));
    }

    @Override // com.nostra13.universalimageloader.core.download.b
    public InputStream a(String str, Object obj) throws IOException {
        switch (C0989a.f70400a[b.a.ofUri(str).ordinal()]) {
            case 1:
            case 2:
                return h(str, obj);
            case 3:
                return g(str, obj);
            case 4:
                return e(str, obj);
            case 5:
                return d(str, obj);
            case 6:
                return f(str, obj);
            default:
                return i(str, obj);
        }
    }

    protected HttpURLConnection b(String str, Object obj) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Uri.encode(str, ProtectedSandApp.s("᩶\u0001"))).openConnection();
        httpURLConnection.setConnectTimeout(this.f70398b);
        httpURLConnection.setReadTimeout(this.f70399c);
        return httpURLConnection;
    }

    @TargetApi(14)
    protected InputStream c(Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(this.f70397a.getContentResolver(), uri, true);
    }

    protected InputStream d(String str, Object obj) throws IOException {
        return this.f70397a.getAssets().open(b.a.ASSETS.crop(str));
    }

    protected InputStream e(String str, Object obj) throws FileNotFoundException {
        ContentResolver contentResolver = this.f70397a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (k(parse)) {
            Bitmap thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, Long.valueOf(parse.getLastPathSegment()).longValue(), 1, null);
            if (thumbnail != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                thumbnail.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        } else if (str.startsWith(ProtectedSandApp.s("᩷\u0001"))) {
            return c(parse);
        }
        return contentResolver.openInputStream(parse);
    }

    protected InputStream f(String str, Object obj) {
        return this.f70397a.getResources().openRawResource(Integer.parseInt(b.a.DRAWABLE.crop(str)));
    }

    protected InputStream g(String str, Object obj) throws IOException {
        String crop = b.a.FILE.crop(str);
        return l(str) ? j(crop) : new com.nostra13.universalimageloader.core.assist.a(new BufferedInputStream(new FileInputStream(crop), 32768), (int) new File(crop).length());
    }

    protected InputStream h(String str, Object obj) throws IOException {
        HttpURLConnection b5 = b(str, obj);
        for (int i4 = 0; b5.getResponseCode() / 100 == 3 && i4 < 5; i4++) {
            b5 = b(b5.getHeaderField(ProtectedSandApp.s("᩸\u0001")), obj);
        }
        try {
            InputStream inputStream = b5.getInputStream();
            if (m(b5)) {
                return new com.nostra13.universalimageloader.core.assist.a(new BufferedInputStream(inputStream, 32768), b5.getContentLength());
            }
            c.a(inputStream);
            throw new IOException(ProtectedSandApp.s("᩹\u0001") + b5.getResponseCode());
        } catch (IOException e4) {
            c.d(b5.getErrorStream());
            throw e4;
        }
    }

    protected InputStream i(String str, Object obj) throws IOException {
        throw new UnsupportedOperationException(String.format(ProtectedSandApp.s("᩺\u0001"), str));
    }

    protected boolean m(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getResponseCode() == 200;
    }

    public a(Context context, int i4, int i5) {
        this.f70397a = context.getApplicationContext();
        this.f70398b = i4;
        this.f70399c = i5;
    }
}
