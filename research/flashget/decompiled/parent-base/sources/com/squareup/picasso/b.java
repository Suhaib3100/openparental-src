package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.d0;
import com.squareup.picasso.w;
import java.io.IOException;

/* compiled from: AssetRequestHandler.java */
/* loaded from: classes6.dex */
class b extends d0 {

    /* renamed from: d, reason: collision with root package name */
    protected static final String f70741d = "android_asset";

    /* renamed from: e, reason: collision with root package name */
    private static final int f70742e = 22;

    /* renamed from: a, reason: collision with root package name */
    private final Context f70743a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f70744b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private AssetManager f70745c;

    b(Context context) {
        this.f70743a = context;
    }

    static String j(b0 b0Var) {
        return b0Var.f70750d.toString().substring(f70742e);
    }

    @Override // com.squareup.picasso.d0
    public boolean c(b0 b0Var) {
        Uri uri = b0Var.f70750d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.d0
    public d0.a f(b0 b0Var, int i4) throws IOException {
        if (this.f70745c == null) {
            synchronized (this.f70744b) {
                try {
                    if (this.f70745c == null) {
                        this.f70745c = this.f70743a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new d0.a(okio.a0.m(this.f70745c.open(j(b0Var))), w.e.DISK);
    }
}
