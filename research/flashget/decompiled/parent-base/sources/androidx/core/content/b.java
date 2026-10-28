package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: ContentResolverCompat.java */
/* loaded from: classes3.dex */
public final class b {
    private b() {
    }

    @q0
    public static Cursor a(@o0 ContentResolver contentResolver, @o0 Uri uri, @q0 String[] strArr, @q0 String str, @q0 String[] strArr2, @q0 String str2, @q0 CancellationSignal cancellationSignal) {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (Exception e4) {
            if (e4 instanceof OperationCanceledException) {
                throw new androidx.core.os.OperationCanceledException();
            }
            throw e4;
        }
    }

    @q0
    @Deprecated
    public static Cursor b(@o0 ContentResolver contentResolver, @o0 Uri uri, @q0 String[] strArr, @q0 String str, @q0 String[] strArr2, @q0 String str2, @q0 androidx.core.os.f fVar) {
        return a(contentResolver, uri, strArr, str, strArr2, str2, fVar != null ? (CancellationSignal) fVar.b() : null);
    }
}
