package androidx.documentfile.provider;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: DocumentsContractApi19.java */
@x0(19)
/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7674a = "DocumentFile";

    /* renamed from: b, reason: collision with root package name */
    private static final int f7675b = 512;

    private b() {
    }

    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(g(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String g5 = g(context, uri);
        int n5 = n(context, uri, "flags", 0);
        if (TextUtils.isEmpty(g5)) {
            return false;
        }
        if ((n5 & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(g5) || (n5 & 8) == 0) {
            return (TextUtils.isEmpty(g5) || (n5 & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void c(@q0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursor.getCount() > 0;
        } catch (Exception e6) {
            e6.toString();
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
        String g5 = g(context, uri);
        if ("vnd.android.document/directory".equals(g5)) {
            return null;
        }
        return g5;
    }

    public static boolean i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(g(context, uri));
    }

    public static boolean j(Context context, Uri uri) {
        String g5 = g(context, uri);
        return ("vnd.android.document/directory".equals(g5) || TextUtils.isEmpty(g5)) ? false : true;
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

    private static int n(Context context, Uri uri, String str, int i5) {
        return (int) o(context, uri, str, i5);
    }

    private static long o(Context context, Uri uri, String str, long j5) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? j5 : cursor.getLong(0);
        } catch (Exception e6) {
            e6.toString();
            return j5;
        } finally {
            c(cursor);
        }
    }

    @q0
    private static String p(Context context, Uri uri, String str, @q0 String str2) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? str2 : cursor.getString(0);
        } catch (Exception e6) {
            e6.toString();
            return str2;
        } finally {
            c(cursor);
        }
    }
}
