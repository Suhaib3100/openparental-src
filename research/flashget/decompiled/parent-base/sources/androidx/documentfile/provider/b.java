package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: DocumentsContractApi19.java */
@x0(19)
/* loaded from: classes3.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29134a = "DocumentFile";

    /* renamed from: b, reason: collision with root package name */
    private static final int f29135b = 512;

    private b() {
    }

    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(g(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String g4 = g(context, uri);
        int o4 = (int) o(context, uri, "flags", 0);
        if (TextUtils.isEmpty(g4)) {
            return false;
        }
        if ((o4 & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(g4) || (o4 & 8) == 0) {
            return (TextUtils.isEmpty(g4) || (o4 & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void c(@q0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursor.getCount() > 0;
        } catch (Exception e4) {
            e4.toString();
            return false;
        } finally {
            c(cursor);
        }
    }

    public static long e(Context context, Uri uri) {
        return o(context, uri, "flags", 0L);
    }

    @q0
    public static String f(Context context, Uri uri) {
        return p(context, uri, "_display_name", null);
    }

    @q0
    private static String g(Context context, Uri uri) {
        return p(context, uri, "mime_type", null);
    }

    @q0
    public static String h(Context context, Uri uri) {
        String g4 = g(context, uri);
        if ("vnd.android.document/directory".equals(g4)) {
            return null;
        }
        return g4;
    }

    public static boolean i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(g(context, uri));
    }

    public static boolean j(Context context, Uri uri) {
        String g4 = g(context, uri);
        return ("vnd.android.document/directory".equals(g4) || TextUtils.isEmpty(g4)) ? false : true;
    }

    public static boolean k(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (e(context, uri) & 512) != 0;
    }

    public static long l(Context context, Uri uri) {
        return o(context, uri, "last_modified", 0L);
    }

    public static long m(Context context, Uri uri) {
        return o(context, uri, "_size", 0L);
    }

    private static int n(Context context, Uri uri, String str, int i4) {
        return (int) o(context, uri, str, i4);
    }

    private static long o(Context context, Uri uri, String str, long j4) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? j4 : cursor.getLong(0);
        } catch (Exception e4) {
            e4.toString();
            return j4;
        } finally {
            c(cursor);
        }
    }

    @q0
    private static String p(Context context, Uri uri, String str, @q0 String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? str2 : cursor.getString(0);
        } catch (Exception e4) {
            e4.toString();
            return str2;
        } finally {
            c(cursor);
        }
    }
}
