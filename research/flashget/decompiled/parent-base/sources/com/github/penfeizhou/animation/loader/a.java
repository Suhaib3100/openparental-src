package com.github.penfeizhou.animation.loader;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: AssetStreamLoader.java */
/* loaded from: classes5.dex */
public class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50852a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50853b;

    public a(Context context, String str) {
        this.f50852a = context.getApplicationContext();
        this.f50853b = str;
    }

    @Override // com.github.penfeizhou.animation.loader.f
    protected InputStream b() throws IOException {
        return this.f50852a.getAssets().open(this.f50853b);
    }
}
