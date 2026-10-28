package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.q0;
import com.airbnb.lottie.model.i;
import com.airbnb.lottie.utils.f;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f38941d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.c f38942e;

    /* renamed from: a, reason: collision with root package name */
    private final i<String> f38938a = new i<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<i<String>, Typeface> f38939b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f38940c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private String f38943f = ProtectedSandApp.s("ĕ");

    public a(Drawable.Callback callback, @q0 com.airbnb.lottie.c cVar) {
        this.f38942e = cVar;
        if (callback instanceof View) {
            this.f38941d = ((View) callback).getContext().getAssets();
        } else {
            f.e(ProtectedSandApp.s("Ė"));
            this.f38941d = null;
        }
    }

    private Typeface a(String str) {
        String b5;
        Typeface typeface = this.f38940c.get(str);
        if (typeface != null) {
            return typeface;
        }
        com.airbnb.lottie.c cVar = this.f38942e;
        Typeface a5 = cVar != null ? cVar.a(str) : null;
        com.airbnb.lottie.c cVar2 = this.f38942e;
        if (cVar2 != null && a5 == null && (b5 = cVar2.b(str)) != null) {
            a5 = Typeface.createFromAsset(this.f38941d, b5);
        }
        if (a5 == null) {
            a5 = Typeface.createFromAsset(this.f38941d, ProtectedSandApp.s("ė") + str + this.f38943f);
        }
        this.f38940c.put(str, a5);
        return a5;
    }

    private Typeface e(Typeface typeface, String str) {
        boolean contains = str.contains(ProtectedSandApp.s("Ę"));
        boolean contains2 = str.contains(ProtectedSandApp.s("ę"));
        int i4 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i4 ? typeface : Typeface.create(typeface, i4);
    }

    public Typeface b(String str, String str2) {
        this.f38938a.b(str, str2);
        Typeface typeface = this.f38939b.get(this.f38938a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e4 = e(a(str), str2);
        this.f38939b.put(this.f38938a, e4);
        return e4;
    }

    public void c(String str) {
        this.f38943f = str;
    }

    public void d(@q0 com.airbnb.lottie.c cVar) {
        this.f38942e = cVar;
    }
}
