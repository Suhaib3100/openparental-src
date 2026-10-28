package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: ResourceDrawableDecoder.java */
/* loaded from: classes3.dex */
public class e implements k<Uri, Drawable> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f11806b = ProtectedSandApp.s("ᵻ");

    /* renamed from: c, reason: collision with root package name */
    private static final int f11807c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f11808d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f11809e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f11810f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f11811g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f11812h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f11813a;

    public e(Context context) {
        this.f11813a = context.getApplicationContext();
    }

    @o0
    private Context d(Uri uri, String str) {
        if (str.equals(this.f11813a.getPackageName())) {
            return this.f11813a;
        }
        try {
            return this.f11813a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e6) {
            if (str.contains(this.f11813a.getPackageName())) {
                return this.f11813a;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ᵵ") + uri, e6);
        }
    }

    @v
    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e6) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᵶ") + uri, e6);
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
            identifier = Resources.getSystem().getIdentifier(str2, str, ProtectedSandApp.s("ᵷ"));
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᵸ") + uri);
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
        throw new IllegalArgumentException(ProtectedSandApp.s("ᵹ") + uri);
    }

    @Override // com.bumptech.glide.load.k
    @q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<Drawable> b(@o0 Uri uri, int i5, int i6, @o0 i iVar) {
        Context d6 = d(uri, uri.getAuthority());
        return d.e(a.b(this.f11813a, d6, g(d6, uri)));
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri, @o0 i iVar) {
        return uri.getScheme().equals(ProtectedSandApp.s("ᵺ"));
    }
}
