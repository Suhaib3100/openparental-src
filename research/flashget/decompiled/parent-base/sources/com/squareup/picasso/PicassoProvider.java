package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;

@c1({c1.a.LIBRARY})
/* loaded from: classes6.dex */
public final class PicassoProvider extends ContentProvider {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    static Context f70717b;

    @Override // android.content.ContentProvider
    public int delete(@o0 Uri uri, @q0 String str, @q0 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @q0
    public String getType(@o0 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @q0
    public Uri insert(@o0 Uri uri, @q0 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        f70717b = getContext();
        return true;
    }

    @Override // android.content.ContentProvider
    @q0
    public Cursor query(@o0 Uri uri, @q0 String[] strArr, @q0 String str, @q0 String[] strArr2, @q0 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@o0 Uri uri, @q0 ContentValues contentValues, @q0 String str, @q0 String[] strArr) {
        return 0;
    }
}
