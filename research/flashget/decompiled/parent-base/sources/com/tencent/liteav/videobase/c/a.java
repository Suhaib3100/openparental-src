package com.tencent.liteav.videobase.c;

import android.opengl.GLES20;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.videobase.base.GLConstants;

/* loaded from: classes7.dex */
public final class a extends e {

    /* renamed from: k, reason: collision with root package name */
    private static final float[] f72180k = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.3918f, 2.0172f, 1.596f, -0.813f, 0.0f};

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f72181l = {1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f72182m = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.2132f, 2.1124f, 1.7927f, -0.5329f, 0.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final float[] f72183n = {1.0f, 1.0f, 1.0f, 0.0f, -0.1873f, 1.8556f, 1.5748f, -0.4681f, 0.0f};

    /* renamed from: o, reason: collision with root package name */
    private static final float[] f72184o = {-0.0627451f, -0.5019608f, -0.5019608f};

    /* renamed from: p, reason: collision with root package name */
    private static final float[] f72185p = {0.0f, -0.5019608f, -0.5019608f};

    /* renamed from: q, reason: collision with root package name */
    private int f72186q;

    /* renamed from: r, reason: collision with root package name */
    private int f72187r;

    /* renamed from: com.tencent.liteav.videobase.c.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72188a;

        static {
            int[] iArr = new int[GLConstants.ColorRange.values().length];
            f72188a = iArr;
            try {
                iArr[GLConstants.ColorRange.f72145c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72188a[GLConstants.ColorRange.f72143a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72188a[GLConstants.ColorRange.f72144b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public a(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        super(ProtectedSandApp.s("咷\u0001"), ProtectedSandApp.s("咸\u0001"), colorRange, colorSpace);
    }

    @Override // com.tencent.liteav.videobase.c.e, com.tencent.liteav.videobase.a.a
    public final void a(com.tencent.liteav.videobase.frame.e eVar) {
        super.a(eVar);
        this.f72186q = GLES20.glGetUniformLocation(this.f72126g, ProtectedSandApp.s("咹\u0001"));
        this.f72187r = GLES20.glGetUniformLocation(this.f72126g, ProtectedSandApp.s("咺\u0001"));
        Runnable a5 = b.a(this);
        com.tencent.liteav.videobase.utils.a aVar = this.f72120a;
        synchronized (aVar.f72286a) {
            aVar.f72286a.add(a5);
        }
    }

    @Override // com.tencent.liteav.videobase.c.e
    protected final int e() {
        return 6409;
    }

    static /* synthetic */ void a(a aVar) {
        float[] fArr;
        float[] fArr2;
        GLES20.glUseProgram(aVar.f72126g);
        int i4 = aVar.f72187r;
        if (AnonymousClass1.f72188a[aVar.f72191j.ordinal()] != 1) {
            fArr = f72184o;
        } else {
            fArr = f72185p;
        }
        GLES20.glUniform3fv(i4, 1, fArr, 0);
        int i5 = aVar.f72186q;
        GLConstants.ColorSpace colorSpace = aVar.f72190i;
        if (colorSpace == null || colorSpace == GLConstants.ColorSpace.f72147a) {
            colorSpace = GLConstants.ColorSpace.f72148b;
        }
        GLConstants.ColorRange colorRange = aVar.f72191j;
        if (colorRange == null || colorRange == GLConstants.ColorRange.f72143a) {
            colorRange = GLConstants.ColorRange.f72144b;
        }
        if (colorSpace == GLConstants.ColorSpace.f72148b) {
            if (colorRange != GLConstants.ColorRange.f72144b && colorRange == GLConstants.ColorRange.f72145c) {
                fArr2 = f72181l;
            }
            fArr2 = f72180k;
        } else {
            if (colorSpace == GLConstants.ColorSpace.f72149c) {
                if (colorRange == GLConstants.ColorRange.f72144b) {
                    fArr2 = f72182m;
                } else if (colorRange == GLConstants.ColorRange.f72145c) {
                    fArr2 = f72183n;
                }
            }
            fArr2 = f72180k;
        }
        GLES20.glUniformMatrix3fv(i5, 1, false, fArr2, 0);
    }
}
