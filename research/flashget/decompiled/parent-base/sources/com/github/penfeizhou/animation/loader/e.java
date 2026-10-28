package com.github.penfeizhou.animation.loader;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ResourceStreamLoader.java */
/* loaded from: classes5.dex */
public class e extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50856a;

    /* renamed from: b, reason: collision with root package name */
    private final int f50857b;

    public e(Context context, int i4) {
        this.f50856a = context.getApplicationContext();
        this.f50857b = i4;
    }

    @Override // com.github.penfeizhou.animation.loader.f
    protected InputStream b() throws IOException {
        return this.f50856a.getResources().openRawResource(this.f50857b);
    }
}
