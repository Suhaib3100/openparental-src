package com.tencent.liteav.videobase.b;

import com.tencent.liteav.videobase.frame.d;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes7.dex */
public final class b extends com.tencent.liteav.videobase.a.a {

    /* renamed from: i, reason: collision with root package name */
    private int f72132i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f72133j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f72134k = -1;

    @Override // com.tencent.liteav.videobase.a.a
    public final void a(int i4, d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.a(this.f72134k, dVar, floatBuffer, floatBuffer2);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void d() {
        super.d();
        OpenGlUtils.deleteTexture(this.f72134k);
        this.f72134k = -1;
    }

    public final void a(Buffer buffer, int i4, int i5) {
        if (this.f72132i != i4 || this.f72133j != i5) {
            this.f72132i = i4;
            this.f72133j = i5;
            OpenGlUtils.deleteTexture(this.f72134k);
            this.f72134k = -1;
        }
        this.f72134k = OpenGlUtils.loadTexture(6408, buffer, i4, i5, this.f72134k);
    }
}
