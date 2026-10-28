package com.tencent.liteav.videobase.c;

import android.opengl.GLES20;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* loaded from: classes7.dex */
public abstract class e extends com.tencent.liteav.videobase.a.a {

    /* renamed from: i, reason: collision with root package name */
    protected final GLConstants.ColorSpace f72190i;

    /* renamed from: j, reason: collision with root package name */
    protected final GLConstants.ColorRange f72191j;

    /* renamed from: k, reason: collision with root package name */
    private int f72192k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f72193l;

    /* renamed from: m, reason: collision with root package name */
    private int f72194m;

    /* renamed from: n, reason: collision with root package name */
    private int f72195n;

    public e(String str, String str2, GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        super(str, str2);
        int[] iArr = new int[2];
        this.f72193l = iArr;
        this.f72194m = 0;
        this.f72195n = 0;
        Arrays.fill(iArr, -1);
        this.f72190i = colorSpace == GLConstants.ColorSpace.f72147a ? GLConstants.ColorSpace.f72148b : colorSpace;
        this.f72191j = colorRange == GLConstants.ColorRange.f72143a ? GLConstants.ColorRange.f72144b : colorRange;
    }

    private void f() {
        int i4 = 0;
        while (true) {
            int[] iArr = this.f72193l;
            if (i4 >= iArr.length) {
                return;
            }
            OpenGlUtils.deleteTexture(iArr[i4]);
            this.f72193l[i4] = -1;
            i4++;
        }
    }

    public final void a(ByteBuffer byteBuffer, int i4, int i5) {
        if (this.f72194m != i4 || this.f72195n != i5) {
            f();
            this.f72194m = i4;
            this.f72195n = i5;
        }
        OpenGlUtils.loadYuv420DataToTextures(byteBuffer, e(), i4, i5, this.f72193l);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void d() {
        f();
        super.d();
    }

    protected abstract int e();

    @Override // com.tencent.liteav.videobase.a.a
    public void a(com.tencent.liteav.videobase.frame.e eVar) {
        super.a(eVar);
        this.f72192k = GLES20.glGetUniformLocation(this.f72126g, ProtectedSandApp.s("咶\u0001"));
    }

    public e(String str, String str2) {
        this(str, str2, GLConstants.ColorRange.f72144b, GLConstants.ColorSpace.f72148b);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void a(int i4, com.tencent.liteav.videobase.frame.d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.a(this.f72193l[0], dVar, floatBuffer, floatBuffer2);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void a(int i4) {
        super.a(i4);
        GLES20.glActiveTexture(33985);
        OpenGlUtils.bindTexture(b(), this.f72193l[1]);
        GLES20.glUniform1i(this.f72192k, 1);
    }
}
