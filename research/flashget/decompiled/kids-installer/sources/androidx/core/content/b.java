package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: ContentResolverCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: ContentResolverCompat.java */
    @x0(16)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    private b() {
    }

    @q0
    public static Cursor a(@o0 ContentResolver contentResolver, @o0 Uri uri, @q0 String[] strArr, @q0 String str, @q0 String[] strArr2, @q0 String str2, @q0 androidx.core.os.c cVar) {
        Object b6;
        if (cVar != null) {
            try {
                b6 = cVar.b();
            } catch (Exception e6) {
                if (e6 instanceof OperationCanceledException) {
                    throw new androidx.core.os.OperationCanceledException();
                }
                throw e6;
            }
        } else {
            b6 = null;
        }
        return a.a(contentResolver, uri, strArr, str, strArr2, str2, (CancellationSignal) b6);
    }
}
