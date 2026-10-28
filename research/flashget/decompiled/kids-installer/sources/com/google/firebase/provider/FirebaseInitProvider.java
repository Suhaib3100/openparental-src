package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.g;
import com.google.firebase.r;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: r, reason: collision with root package name */
    @m1
    static final String f17705r = ProtectedSandApp.s("ᤆ");

    /* renamed from: o, reason: collision with root package name */
    private static final String f17702o = ProtectedSandApp.s("ᤇ");

    /* renamed from: p, reason: collision with root package name */
    @q0
    private static r f17703p = r.e();

    /* renamed from: q, reason: collision with root package name */
    @o0
    private static AtomicBoolean f17704q = new AtomicBoolean(false);

    private static void a(@o0 ProviderInfo providerInfo) {
        Preconditions.checkNotNull(providerInfo, ProtectedSandApp.s("ᤈ"));
        if (ProtectedSandApp.s("ᤉ").equals(providerInfo.authority)) {
            throw new IllegalStateException(ProtectedSandApp.s("ᤊ"));
        }
    }

    @q0
    public static r b() {
        return f17703p;
    }

    public static boolean c() {
        return f17704q.get();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@o0 Context context, @o0 ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

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
        try {
            f17704q.set(true);
            g.x(getContext());
            return false;
        } finally {
            f17704q.set(false);
        }
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
