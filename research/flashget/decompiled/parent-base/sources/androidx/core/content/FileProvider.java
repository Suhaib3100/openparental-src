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
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class FileProvider extends ContentProvider {

    @androidx.annotation.b0("mLock")
    private String mAuthority;

    @q0
    @androidx.annotation.b0("mLock")
    private b mLocalPathStrategy;

    @o0
    private final Object mLock;
    private final int mResourceId;
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String ATTR_NAME = "name";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String ATTR_PATH = "path";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");

    @androidx.annotation.b0("sCache")
    private static final HashMap<String, b> sCache = new HashMap<>();

    @x0(21)
    static class a {
        private a() {
        }

        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    interface b {
        Uri a(File file);

        File b(Uri uri);
    }

    static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final String f25965a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap<String, File> f25966b = new HashMap<>();

        c(String str) {
            this.f25965a = str;
        }

        private boolean d(@o0 String str, @o0 String str2) {
            String removeTrailingSlash = FileProvider.removeTrailingSlash(str);
            String removeTrailingSlash2 = FileProvider.removeTrailingSlash(str2);
            if (!removeTrailingSlash.equals(removeTrailingSlash2)) {
                if (!removeTrailingSlash.startsWith(removeTrailingSlash2 + '/')) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.content.FileProvider.b
        public Uri a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f25966b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (d(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f25965a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException(g.a("Failed to resolve canonical path for ", file));
            }
        }

        @Override // androidx.core.content.FileProvider.b
        public File b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f25966b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException(g.a("Failed to resolve canonical path for ", file2));
            }
        }

        void c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f25966b.put(str, file.getCanonicalFile());
            } catch (IOException e4) {
                throw new IllegalArgumentException(g.a("Failed to resolve canonical path for ", file), e4);
            }
        }
    }

    public FileProvider() {
        this(0);
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static String[] copyOf(String[] strArr, int i4) {
        String[] strArr2 = new String[i4];
        System.arraycopy(strArr, 0, strArr2, 0, i4);
        return strArr2;
    }

    @m1
    static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, @q0 ProviderInfo providerInfo, int i4) {
        if (providerInfo == null) {
            throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a("Couldn't find meta-data for provider with authority ", str));
        }
        if (providerInfo.metaData == null && i4 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i4);
        }
        XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    @o0
    private b getLocalPathStrategy() {
        b bVar;
        synchronized (this.mLock) {
            try {
                androidx.core.util.r.e(this.mAuthority, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
                }
                bVar = this.mLocalPathStrategy;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private static b getPathStrategy(Context context, String str, int i4) {
        b bVar;
        HashMap<String, b> hashMap = sCache;
        synchronized (hashMap) {
            try {
                bVar = hashMap.get(str);
                if (bVar == null) {
                    try {
                        try {
                            bVar = parsePathStrategy(context, str, i4);
                            hashMap.put(str, bVar);
                        } catch (IOException e4) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
                        }
                    } catch (XmlPullParserException e5) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static Uri getUriForFile(@o0 Context context, @o0 String str, @o0 File file) {
        return getPathStrategy(context, str, 0).a(file);
    }

    private static int modeToMode(String str) {
        if ("r".equals(str)) {
            return ClientDefaults.MAX_MSG_SIZE;
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
        throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a("Invalid mode: ", str));
    }

    private static b parsePathStrategy(Context context, String str, int i4) throws IOException, XmlPullParserException {
        c cVar = new c(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i4);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = fileProviderPathsMetaData.getName();
                File file = null;
                String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = DEVICE_ROOT;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = d.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = d.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        file = externalMediaDirs[0];
                    }
                }
                if (file != null) {
                    cVar.c(attributeValue, buildPath(file, attributeValue2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static String removeTrailingSlash(@o0 String str) {
        return (str.length() <= 0 || str.charAt(str.length() - 1) != '/') ? str : f.a(str, 1, 0);
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.i
    public void attachInfo(@o0 Context context, @o0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.mLock) {
            this.mAuthority = str;
        }
        HashMap<String, b> hashMap = sCache;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@o0 Uri uri, @q0 String str, @q0 String[] strArr) {
        return getLocalPathStrategy().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @q0
    public String getType(@o0 Uri uri) {
        File b5 = getLocalPathStrategy().b(uri);
        int lastIndexOf = b5.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b5.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    @q0
    public String getTypeAnonymous(@o0 Uri uri) {
        return "application/octet-stream";
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
        return ParcelFileDescriptor.open(getLocalPathStrategy().b(uri), modeToMode(str));
    }

    @Override // android.content.ContentProvider
    @o0
    public Cursor query(@o0 Uri uri, @q0 String[] strArr, @q0 String str, @q0 String[] strArr2, @q0 String str2) {
        int i4;
        File b5 = getLocalPathStrategy().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i5 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i5] = "_display_name";
                i4 = i5 + 1;
                objArr[i5] = queryParameter == null ? b5.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i5] = "_size";
                i4 = i5 + 1;
                objArr[i5] = Long.valueOf(b5.length());
            }
            i5 = i4;
        }
        String[] copyOf = copyOf(strArr3, i5);
        Object[] copyOf2 = copyOf(objArr, i5);
        MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@o0 Uri uri, @o0 ContentValues contentValues, @q0 String str, @q0 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected FileProvider(@o1 int i4) {
        this.mLock = new Object();
        this.mResourceId = i4;
    }

    private static Object[] copyOf(Object[] objArr, int i4) {
        Object[] objArr2 = new Object[i4];
        System.arraycopy(objArr, 0, objArr2, 0, i4);
        return objArr2;
    }

    @o0
    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(@o0 Context context, @o0 String str, @o0 File file, @o0 String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter("displayName", str2).build();
    }
}
