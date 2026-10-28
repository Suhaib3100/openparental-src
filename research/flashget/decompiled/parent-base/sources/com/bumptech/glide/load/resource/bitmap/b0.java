package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: GranularRoundedCorners.java */
/* loaded from: classes3.dex */
public final class b0 extends i {

    /* renamed from: g, reason: collision with root package name */
    private static final String f44432g = ProtectedSandApp.s("\u098d");

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f44433h = ProtectedSandApp.s("\u098d").getBytes(com.bumptech.glide.load.f.f44241b);

    /* renamed from: c, reason: collision with root package name */
    private final float f44434c;

    /* renamed from: d, reason: collision with root package name */
    private final float f44435d;

    /* renamed from: e, reason: collision with root package name */
    private final float f44436e;

    /* renamed from: f, reason: collision with root package name */
    private final float f44437f;

    public b0(float f4, float f5, float f6, float f7) {
        this.f44434c = f4;
        this.f44435d = f5;
        this.f44436e = f6;
        this.f44437f = f7;
    }

    @Override // com.bumptech.glide.load.f
    public void b(@androidx.annotation.o0 MessageDigest messageDigest) {
        messageDigest.update(f44433h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f44434c).putFloat(this.f44435d).putFloat(this.f44436e).putFloat(this.f44437f).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.i
    protected Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5) {
        return m0.p(eVar, bitmap, this.f44434c, this.f44435d, this.f44436e, this.f44437f);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f44434c == b0Var.f44434c && this.f44435d == b0Var.f44435d && this.f44436e == b0Var.f44436e && this.f44437f == b0Var.f44437f;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return com.bumptech.glide.util.o.o(this.f44437f, com.bumptech.glide.util.o.o(this.f44436e, com.bumptech.glide.util.o.o(this.f44435d, com.bumptech.glide.util.o.q(-2013597734, com.bumptech.glide.util.o.n(this.f44434c)))));
    }
}
