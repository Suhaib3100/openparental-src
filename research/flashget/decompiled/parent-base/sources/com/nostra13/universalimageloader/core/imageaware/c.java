package com.nostra13.universalimageloader.core.imageaware;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.core.assist.e;
import com.nostra13.universalimageloader.core.assist.h;

/* compiled from: NonViewAware.java */
/* loaded from: classes6.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    protected final String f70508a;

    /* renamed from: b, reason: collision with root package name */
    protected final e f70509b;

    /* renamed from: c, reason: collision with root package name */
    protected final h f70510c;

    public c(e eVar, h hVar) {
        this(null, eVar, hVar);
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public int a() {
        return TextUtils.isEmpty(this.f70508a) ? super.hashCode() : this.f70508a.hashCode();
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public View b() {
        return null;
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public boolean c(Drawable drawable) {
        return true;
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public boolean d() {
        return false;
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public h e() {
        return this.f70510c;
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public boolean f(Bitmap bitmap) {
        return true;
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public int getHeight() {
        return this.f70509b.a();
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public int getWidth() {
        return this.f70509b.b();
    }

    public c(String str, e eVar, h hVar) {
        if (eVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("᪬\u0001"));
        }
        if (hVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("᪫\u0001"));
        }
        this.f70508a = str;
        this.f70509b = eVar;
        this.f70510c = hVar;
    }
}
