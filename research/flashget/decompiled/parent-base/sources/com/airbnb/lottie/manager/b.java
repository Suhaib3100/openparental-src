package com.airbnb.lottie.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.q0;
import com.airbnb.lottie.d;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.utils.f;
import com.airbnb.lottie.utils.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f38944e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f38945a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38946b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private d f38947c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, o0> f38948d;

    public b(Drawable.Callback callback, String str, d dVar, Map<String, o0> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f38946b = str;
        } else {
            this.f38946b = str.concat(ProtectedSandApp.s("Ě"));
        }
        if (callback instanceof View) {
            this.f38945a = ((View) callback).getContext();
            this.f38948d = map;
            e(dVar);
        } else {
            f.e(ProtectedSandApp.s("ě"));
            this.f38948d = new HashMap();
            this.f38945a = null;
        }
    }

    private Bitmap d(String str, @q0 Bitmap bitmap) {
        synchronized (f38944e) {
            this.f38948d.get(str).h(bitmap);
        }
        return bitmap;
    }

    @q0
    public Bitmap a(String str) {
        o0 o0Var = this.f38948d.get(str);
        if (o0Var == null) {
            return null;
        }
        Bitmap a5 = o0Var.a();
        if (a5 != null) {
            return a5;
        }
        d dVar = this.f38947c;
        if (dVar != null) {
            Bitmap a6 = dVar.a(o0Var);
            if (a6 != null) {
                d(str, a6);
            }
            return a6;
        }
        String c5 = o0Var.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (c5.startsWith(ProtectedSandApp.s("Ĝ")) && c5.indexOf(ProtectedSandApp.s("ĝ")) > 0) {
            try {
                byte[] decode = Base64.decode(c5.substring(c5.indexOf(44) + 1), 0);
                return d(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e4) {
                f.f(ProtectedSandApp.s("Ğ"), e4);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f38946b)) {
                throw new IllegalStateException(ProtectedSandApp.s("Ġ"));
            }
            try {
                return d(str, j.m(BitmapFactory.decodeStream(this.f38945a.getAssets().open(this.f38946b + c5), null, options), o0Var.f(), o0Var.d()));
            } catch (IllegalArgumentException e5) {
                f.f(ProtectedSandApp.s("ğ"), e5);
                return null;
            }
        } catch (IOException e6) {
            f.f(ProtectedSandApp.s("ġ"), e6);
            return null;
        }
    }

    @q0
    public o0 b(String str) {
        return this.f38948d.get(str);
    }

    public boolean c(Context context) {
        return (context == null && this.f38945a == null) || this.f38945a.equals(context);
    }

    public void e(@q0 d dVar) {
        this.f38947c = dVar;
    }

    @q0
    public Bitmap f(String str, @q0 Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap a5 = this.f38948d.get(str).a();
            d(str, bitmap);
            return a5;
        }
        o0 o0Var = this.f38948d.get(str);
        Bitmap a6 = o0Var.a();
        o0Var.h(null);
        return a6;
    }
}
