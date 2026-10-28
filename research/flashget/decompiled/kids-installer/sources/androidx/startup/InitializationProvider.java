package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;

@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public final class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(@o0 Uri uri, @q0 String str, @q0 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @q0
    public String getType(@o0 Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @q0
    public Uri insert(@o0 Uri uri, @q0 ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new StartupException("Context cannot be null");
        }
        a.c(context).a();
        return true;
    }

    @Override // android.content.ContentProvider
    @q0
    public Cursor query(@o0 Uri uri, @q0 String[] strArr, @q0 String str, @q0 String[] strArr2, @q0 String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public int update(@o0 Uri uri, @q0 ContentValues contentValues, @q0 String str, @q0 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
