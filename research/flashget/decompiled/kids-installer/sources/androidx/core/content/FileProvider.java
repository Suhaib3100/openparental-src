package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.o1;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: o, reason: collision with root package name */
    private b f4524o;

    /* renamed from: p, reason: collision with root package name */
    private int f4525p;
    private static final String A = "path";
    private static final String B = "displayName";

    /* renamed from: r, reason: collision with root package name */
    private static final String f4515r = "android.support.FILE_PROVIDER_PATHS";

    /* renamed from: s, reason: collision with root package name */
    private static final String f4516s = "root-path";

    /* renamed from: t, reason: collision with root package name */
    private static final String f4517t = "files-path";

    /* renamed from: u, reason: collision with root package name */
    private static final String f4518u = "cache-path";

    /* renamed from: v, reason: collision with root package name */
    private static final String f4519v = "external-path";

    /* renamed from: w, reason: collision with root package name */
    private static final String f4520w = "external-files-path";

    /* renamed from: x, reason: collision with root package name */
    private static final String f4521x = "external-cache-path";

    /* renamed from: y, reason: collision with root package name */
    private static final String f4522y = "external-media-path";

    /* renamed from: z, reason: collision with root package name */
    private static final String f4523z = "name";

    /* renamed from: q, reason: collision with root package name */
    private static final String[] f4514q = {"_display_name", "_size"};
    private static final File C = new File("/");

    @b0("sCache")
    private static final HashMap<String, b> D = new HashMap<>();

    @x0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    interface b {
        File a(Uri uri);

        Uri b(File file);
    }

    /* loaded from: classes3.dex */
    static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final String f4526a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap<String, File> f4527b = new HashMap<>();

        c(String str) {
            this.f4526a = str;
        }

        @Override // androidx.core.content.FileProvider.b
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f4527b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.FileProvider.b
        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f4527b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f4526a).encodedPath(Uri.encode(entry.getKey()) + org.apache.commons.io.n.f32060b + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        void c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f4527b.put(str, file.getCanonicalFile());
            } catch (IOException e6) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e6);
            }
        }
    }

    public FileProvider() {
        this.f4525p = 0;
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] b(Object[] objArr, int i5) {
        Object[] objArr2 = new Object[i5];
        System.arraycopy(objArr, 0, objArr2, 0, i5);
        return objArr2;
    }

    private static String[] c(String[] strArr, int i5) {
        String[] strArr2 = new String[i5];
        System.arraycopy(strArr, 0, strArr2, 0, i5);
        return strArr2;
    }

    @m1
    static XmlResourceParser d(Context context, String str, @q0 ProviderInfo providerInfo, int i5) {
        if (providerInfo == null) {
            throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a("Couldn't find meta-data for provider with authority ", str));
        }
        if (providerInfo.metaData == null && i5 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i5);
        }
        XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private static b e(Context context, String str, int i5) {
        b bVar;
        HashMap<String, b> hashMap = D;
        synchronized (hashMap) {
            bVar = hashMap.get(str);
            if (bVar == null) {
                try {
                    try {
                        bVar = i(context, str, i5);
                        hashMap.put(str, bVar);
                    } catch (XmlPullParserException e6) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e6);
                    }
                } catch (IOException e7) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
                }
            }
        }
        return bVar;
    }

    public static Uri f(@o0 Context context, @o0 String str, @o0 File file) {
        return e(context, str, 0).b(file);
    }

    @o0
    @SuppressLint({"StreamFiles"})
    public static Uri g(@o0 Context context, @o0 String str, @o0 File file, @o0 String str2) {
        return f(context, str, file).buildUpon().appendQueryParameter("displayName", str2).build();
    }

    private static int h(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a("Invalid mode: ", str));
    }

    private static b i(Context context, String str, int i5) throws IOException, XmlPullParserException {
        c cVar = new c(str);
        XmlResourceParser d6 = d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i5);
        while (true) {
            int next = d6.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = d6.getName();
                File file = null;
                String attributeValue = d6.getAttributeValue(null, "name");
                String attributeValue2 = d6.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = C;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] k5 = d.k(context, null);
                    if (k5.length > 0) {
                        file = k5[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] j5 = d.j(context);
                    if (j5.length > 0) {
                        file = j5[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a6 = a.a(context);
                    if (a6.length > 0) {
                        file = a6[0];
                    }
                }
                if (file != null) {
                    cVar.c(attributeValue, a(file, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@o0 Context context, @o0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, b> hashMap = D;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        this.f4524o = e(context, str, this.f4525p);
    }

    @Override // android.content.ContentProvider
    public int delete(@o0 Uri uri, @q0 String str, @q0 String[] strArr) {
        return this.f4524o.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @q0
    public String getType(@o0 Uri uri) {
        File a6 = this.f4524o.a(uri);
        int lastIndexOf = a6.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a6.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@o0 Uri uri, @o0 ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@o0 Uri uri, @o0 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f4524o.a(uri), h(str));
    }

    @Override // android.content.ContentProvider
    @o0
    public Cursor query(@o0 Uri uri, @q0 String[] strArr, @q0 String str, @q0 String[] strArr2, @q0 String str2) {
        int i5;
        File a6 = this.f4524o.a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f4514q;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i6 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i6] = "_display_name";
                i5 = i6 + 1;
                objArr[i6] = queryParameter == null ? a6.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i6] = "_size";
                i5 = i6 + 1;
                objArr[i6] = Long.valueOf(a6.length());
            }
            i6 = i5;
        }
        String[] c6 = c(strArr3, i6);
        Object[] b6 = b(objArr, i6);
        MatrixCursor matrixCursor = new MatrixCursor(c6, 1);
        matrixCursor.addRow(b6);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@o0 Uri uri, @o0 ContentValues contentValues, @q0 String str, @q0 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected FileProvider(@o1 int i5) {
        this.f4525p = i5;
    }
}
