package top.zibin.luban;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Uri2PathUtil.java */
/* loaded from: classes9.dex */
public class m {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "Ꚁ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r8 == 0) goto L30
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r9 == 0) goto L30
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r8.close()
            return r9
        L2b:
            r9 = move-exception
            r7 = r8
            goto L41
        L2e:
            r9 = move-exception
            goto L3a
        L30:
            if (r8 == 0) goto L40
        L32:
            r8.close()
            goto L40
        L36:
            r9 = move-exception
            goto L41
        L38:
            r9 = move-exception
            r8 = r7
        L3a:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r8 == 0) goto L40
            goto L32
        L40:
            return r7
        L41:
            if (r7 == 0) goto L46
            r7.close()
        L46:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: top.zibin.luban.m.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String b(Context context, Uri uri) {
        return c(context, uri);
    }

    @TargetApi(19)
    private static String c(Context context, Uri uri) {
        if (DocumentsContract.isDocumentUri(context, uri)) {
            boolean g4 = g(uri);
            String s4 = ProtectedSandApp.s("ꚁ\u0001");
            if (g4) {
                String[] split = DocumentsContract.getDocumentId(uri).split(s4);
                if (ProtectedSandApp.s("Ꚃ\u0001").equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + ProtectedSandApp.s("ꚃ\u0001") + split[1];
                }
            } else {
                if (f(uri)) {
                    return a(context, ContentUris.withAppendedId(Uri.parse(ProtectedSandApp.s("Ꚅ\u0001")), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if (h(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(s4);
                    String str = split2[0];
                    return a(context, ProtectedSandApp.s("ꚅ\u0001").equals(str) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : ProtectedSandApp.s("Ꚇ\u0001").equals(str) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : ProtectedSandApp.s("ꚇ\u0001").equals(str) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Files.getContentUri(ProtectedSandApp.s("Ꚉ\u0001")), ProtectedSandApp.s("ꚉ\u0001"), new String[]{split2[1]});
                }
            }
        } else {
            if (ProtectedSandApp.s("Ꚋ\u0001").equalsIgnoreCase(uri.getScheme())) {
                return a(context, uri, null, null);
            }
            if (ProtectedSandApp.s("ꚋ\u0001").equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    @SuppressLint({"Range"})
    private static String d(Context context, Uri uri) {
        String[] strArr = {ProtectedSandApp.s("Ꚁ\u0001")};
        Cursor loadInBackground = new androidx.loader.content.b(context, uri, strArr, null, null, null).loadInBackground();
        if (loadInBackground == null) {
            return null;
        }
        loadInBackground.moveToFirst();
        String string = loadInBackground.getString(loadInBackground.getColumnIndex(strArr[0]));
        loadInBackground.close();
        return string;
    }

    @SuppressLint({"Range"})
    private static String e(Context context, Uri uri) {
        String[] strArr = {ProtectedSandApp.s("Ꚁ\u0001")};
        Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
        if (query == null || !query.moveToFirst()) {
            return null;
        }
        String string = query.getString(query.getColumnIndex(strArr[0]));
        query.close();
        return string;
    }

    public static boolean f(Uri uri) {
        return ProtectedSandApp.s("Ꚍ\u0001").equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return ProtectedSandApp.s("ꚍ\u0001").equals(uri.getAuthority());
    }

    public static boolean h(Uri uri) {
        return ProtectedSandApp.s("Ꚏ\u0001").equals(uri.getAuthority());
    }
}
