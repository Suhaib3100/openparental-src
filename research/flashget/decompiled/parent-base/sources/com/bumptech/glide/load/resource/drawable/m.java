package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import com.bumptech.glide.load.engine.u;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: ResourceDrawableDecoder.java */
/* loaded from: classes3.dex */
public class m implements com.bumptech.glide.load.k<Uri, Drawable> {

    /* renamed from: d, reason: collision with root package name */
    private static final int f44585d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f44586e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f44587f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f44588g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f44589h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f44590i = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f44591a;

    /* renamed from: c, reason: collision with root package name */
    private static final String f44584c = ProtectedSandApp.s("ਆ");

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Resources.Theme> f44583b = com.bumptech.glide.load.h.f(ProtectedSandApp.s("ਇ"));

    public m(Context context) {
        this.f44591a = context.getApplicationContext();
    }

    @o0
    private Context d(Uri uri, @o0 String str) {
        if (str.equals(this.f44591a.getPackageName())) {
            return this.f44591a;
        }
        try {
            return this.f44591a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e4) {
            if (str.contains(this.f44591a.getPackageName())) {
                return this.f44591a;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ਈ") + uri, e4);
        }
    }

    @v
    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਉ") + uri, e4);
        }
    }

    @v
    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, ProtectedSandApp.s("ਆ"));
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ਊ") + uri);
    }

    @v
    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ਉ") + uri);
    }

    @Override // com.bumptech.glide.load.k
    @q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<Drawable> b(@o0 Uri uri, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException(ProtectedSandApp.s("\u0a0c") + uri + ProtectedSandApp.s("\u0a0d"));
        }
        Context d5 = d(uri, authority);
        int g4 = g(d5, uri);
        Resources.Theme theme = ((String) com.bumptech.glide.util.m.f(authority, ProtectedSandApp.s("\u0a0b"))).equals(this.f44591a.getPackageName()) ? (Resources.Theme) iVar.c(f44583b) : null;
        return l.d(theme == null ? i.b(this.f44591a, d5, g4) : i.a(this.f44591a, g4, theme));
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri, @o0 com.bumptech.glide.load.i iVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals(ProtectedSandApp.s("\u0a0e"));
    }
}
