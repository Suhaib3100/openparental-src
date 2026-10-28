package com.tencent.liteav.videobase.frame;

import android.opengl.GLES20;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.k;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f72270a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f72271b = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f72272c = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f72273d = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: e, reason: collision with root package name */
    private int f72274e;

    /* renamed from: f, reason: collision with root package name */
    private int f72275f;

    /* renamed from: g, reason: collision with root package name */
    private final FloatBuffer f72276g;

    /* renamed from: h, reason: collision with root package name */
    private final FloatBuffer f72277h;

    /* renamed from: j, reason: collision with root package name */
    private GLConstants.GLScaleType f72279j;

    /* renamed from: n, reason: collision with root package name */
    private c f72283n;

    /* renamed from: i, reason: collision with root package name */
    private final com.tencent.liteav.videobase.a.a[] f72278i = new com.tencent.liteav.videobase.a.a[GLConstants.PixelFormatType.values().length];

    /* renamed from: k, reason: collision with root package name */
    private PixelFrame f72280k = null;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.liteav.videobase.b.a f72281l = null;

    /* renamed from: m, reason: collision with root package name */
    private com.tencent.liteav.videobase.a.a f72282m = null;

    /* renamed from: com.tencent.liteav.videobase.frame.h$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72284a;

        static {
            int[] iArr = new int[k.values().length];
            f72284a = iArr;
            try {
                iArr[k.f71940b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72284a[k.f71941c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72284a[k.f71942d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72284a[k.f71939a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public h(int i4, int i5) {
        this.f72274e = i4;
        this.f72275f = i5;
        float[] fArr = GLConstants.f72138d;
        this.f72276g = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        this.f72277h = OpenGlUtils.createTextureCoordsBuffer(k.f71939a, false, false);
    }

    private static float a(float f4) {
        return f4 == 0.0f ? 1.0f : 0.0f;
    }

    private void b() {
        PixelFrame pixelFrame = this.f72280k;
        if (pixelFrame == null) {
            return;
        }
        boolean z4 = pixelFrame.getRotation() == k.f71940b || this.f72280k.getRotation() == k.f71942d;
        float max = Math.max((this.f72274e * 1.0f) / this.f72280k.getWidth(), (this.f72275f * 1.0f) / this.f72280k.getHeight());
        float round = (Math.round(r2 * max) * 1.0f) / this.f72274e;
        float round2 = (Math.round(r5 * max) * 1.0f) / this.f72275f;
        float[] fArr = GLConstants.f72138d;
        float[] fArr2 = new float[8];
        if (this.f72280k.getPixelBufferType() == GLConstants.a.f72176c) {
            a(fArr2, this.f72280k.getRotation(), this.f72280k.isMirrorHorizontal(), this.f72280k.isMirrorVertical());
        } else {
            OpenGlUtils.initTextureCoordsBuffer(fArr2, this.f72280k.getRotation(), this.f72280k.isMirrorHorizontal(), this.f72280k.isMirrorVertical());
        }
        GLConstants.GLScaleType gLScaleType = this.f72279j;
        if (gLScaleType == GLConstants.GLScaleType.f72151a) {
            float f4 = (1.0f - (z4 ? 1.0f / round2 : 1.0f / round)) / 2.0f;
            float f5 = (1.0f - (z4 ? 1.0f / round : 1.0f / round2)) / 2.0f;
            fArr2[0] = a(fArr2[0], f4);
            fArr2[1] = a(fArr2[1], f5);
            fArr2[2] = a(fArr2[2], f4);
            fArr2[3] = a(fArr2[3], f5);
            fArr2[4] = a(fArr2[4], f4);
            fArr2[5] = a(fArr2[5], f5);
            fArr2[6] = a(fArr2[6], f4);
            fArr2[7] = a(fArr2[7], f5);
        } else if (gLScaleType == GLConstants.GLScaleType.f72152b) {
            fArr = new float[]{fArr[0] / round2, fArr[1] / round, fArr[2] / round2, fArr[3] / round, fArr[4] / round2, fArr[5] / round, fArr[6] / round2, fArr[7] / round};
        }
        this.f72276g.clear();
        this.f72276g.put(fArr).position(0);
        this.f72277h.clear();
        this.f72277h.put(fArr2).position(0);
    }

    private void c() {
        if (this.f72282m != null) {
            return;
        }
        com.tencent.liteav.videobase.a.a aVar = new com.tencent.liteav.videobase.a.a();
        this.f72282m = aVar;
        aVar.a();
    }

    private void d() {
        com.tencent.liteav.videobase.b.a aVar = this.f72281l;
        if (aVar != null) {
            aVar.c();
            this.f72281l = null;
        }
        com.tencent.liteav.videobase.a.a aVar2 = this.f72282m;
        if (aVar2 != null) {
            aVar2.c();
            this.f72282m = null;
        }
        c cVar = this.f72283n;
        if (cVar != null) {
            cVar.d();
            this.f72283n = null;
        }
        int i4 = 0;
        while (true) {
            com.tencent.liteav.videobase.a.a[] aVarArr = this.f72278i;
            if (i4 >= aVarArr.length) {
                LiteavLog.i(ProtectedSandApp.s("唧\u0001"), ProtectedSandApp.s("唨\u0001"));
                return;
            }
            com.tencent.liteav.videobase.a.a aVar3 = aVarArr[i4];
            if (aVar3 != null) {
                aVar3.c();
                this.f72278i[i4] = null;
            }
            i4++;
        }
    }

    private static float a(float f4, float f5) {
        return f4 == 0.0f ? f5 : 1.0f - f5;
    }

    public final void a(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType, d dVar) {
        if (pixelFrame != null && pixelFrame.isFrameDataValid()) {
            if (this.f72280k == null || a(pixelFrame, gLScaleType)) {
                this.f72279j = gLScaleType;
                this.f72280k = new PixelFrame(pixelFrame);
                d();
                b();
            }
            if (gLScaleType == GLConstants.GLScaleType.f72152b) {
                a(dVar);
            }
            if (this.f72280k.getPixelBufferType() == GLConstants.a.f72174a) {
                if (this.f72280k.getPixelFormatType() != GLConstants.PixelFormatType.f72161f) {
                    a(this.f72280k.getPixelFormatType(), dVar, pixelFrame.getBuffer(), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                    return;
                } else {
                    a(dVar, pixelFrame.getBuffer());
                    return;
                }
            }
            if (this.f72280k.getPixelBufferType() == GLConstants.a.f72177d) {
                if (this.f72280k.getPixelFormatType() != GLConstants.PixelFormatType.f72161f) {
                    a(this.f72280k.getPixelFormatType(), dVar, ByteBuffer.wrap(pixelFrame.getData()), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                    return;
                } else {
                    a(dVar, ByteBuffer.wrap(pixelFrame.getData()));
                    return;
                }
            }
            if (this.f72280k.getPixelBufferType() == GLConstants.a.f72176c) {
                a(dVar, pixelFrame.getTextureId(), pixelFrame.getMatrix());
                return;
            } else {
                if (this.f72280k.getPixelBufferType() == GLConstants.a.f72175b) {
                    a(dVar, pixelFrame.getTextureId());
                    return;
                }
                return;
            }
        }
        LiteavLog.w(ProtectedSandApp.s("唧\u0001"), ProtectedSandApp.s("唩\u0001"));
    }

    public final void a() {
        this.f72280k = null;
        d();
    }

    private boolean a(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        return (gLScaleType == this.f72279j && pixelFrame.getWidth() == this.f72280k.getWidth() && pixelFrame.getHeight() == this.f72280k.getHeight() && pixelFrame.getPixelBufferType() == this.f72280k.getPixelBufferType() && pixelFrame.getPixelFormatType() == this.f72280k.getPixelFormatType() && pixelFrame.isMirrorHorizontal() == this.f72280k.isMirrorHorizontal() && pixelFrame.isMirrorVertical() == this.f72280k.isMirrorVertical() && pixelFrame.getRotation() == this.f72280k.getRotation()) ? false : true;
    }

    private void a(d dVar, Buffer buffer) {
        int ordinal = GLConstants.PixelFormatType.f72161f.ordinal();
        com.tencent.liteav.videobase.a.a[] aVarArr = this.f72278i;
        if (aVarArr[ordinal] == null) {
            aVarArr[ordinal] = new com.tencent.liteav.videobase.b.b();
            this.f72278i[ordinal].a();
        }
        com.tencent.liteav.videobase.b.b bVar = (com.tencent.liteav.videobase.b.b) this.f72278i[ordinal];
        bVar.a(this.f72274e, this.f72275f);
        OpenGlUtils.glViewport(0, 0, this.f72274e, this.f72275f);
        if (this.f72280k.getRotation() != k.f71940b && this.f72280k.getRotation() != k.f71942d) {
            bVar.a(buffer, this.f72280k.getWidth(), this.f72280k.getHeight());
        } else {
            bVar.a(buffer, this.f72280k.getHeight(), this.f72280k.getWidth());
        }
        bVar.a(-1, dVar, this.f72276g, this.f72277h);
    }

    private void a(GLConstants.PixelFormatType pixelFormatType, d dVar, ByteBuffer byteBuffer, GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        int ordinal = pixelFormatType.ordinal();
        com.tencent.liteav.videobase.a.a[] aVarArr = this.f72278i;
        if (aVarArr[ordinal] == null) {
            if (pixelFormatType == GLConstants.PixelFormatType.f72156a) {
                aVarArr[ordinal] = new com.tencent.liteav.videobase.c.a(colorRange, colorSpace);
            } else if (pixelFormatType == GLConstants.PixelFormatType.f72158c) {
                aVarArr[ordinal] = new com.tencent.liteav.videobase.c.d();
            } else {
                aVarArr[ordinal] = new com.tencent.liteav.videobase.c.c();
            }
            this.f72278i[ordinal].a();
        }
        com.tencent.liteav.videobase.c.e eVar = (com.tencent.liteav.videobase.c.e) this.f72278i[ordinal];
        eVar.a(this.f72274e, this.f72275f);
        OpenGlUtils.glViewport(0, 0, this.f72274e, this.f72275f);
        if (this.f72280k.getRotation() != k.f71940b && this.f72280k.getRotation() != k.f71942d) {
            eVar.a(byteBuffer, this.f72280k.getWidth(), this.f72280k.getHeight());
        } else {
            eVar.a(byteBuffer, this.f72280k.getHeight(), this.f72280k.getWidth());
        }
        eVar.a(-1, dVar, this.f72276g, this.f72277h);
    }

    private void a(d dVar, int i4, float[] fArr) {
        if (this.f72281l == null) {
            com.tencent.liteav.videobase.b.a aVar = new com.tencent.liteav.videobase.b.a();
            this.f72281l = aVar;
            aVar.a();
        }
        OpenGlUtils.glViewport(0, 0, this.f72274e, this.f72275f);
        com.tencent.liteav.videobase.b.a aVar2 = this.f72281l;
        aVar2.f72127h = fArr;
        aVar2.a(this.f72274e, this.f72275f);
        this.f72281l.a(i4, dVar, this.f72276g, this.f72277h);
    }

    private void a(d dVar, int i4) {
        c();
        OpenGlUtils.glViewport(0, 0, this.f72274e, this.f72275f);
        this.f72282m.a(this.f72274e, this.f72275f);
        this.f72282m.a(i4, dVar, this.f72276g, this.f72277h);
    }

    private void a(d dVar) {
        if (this.f72283n == null) {
            c cVar = new c();
            this.f72283n = cVar;
            cVar.a();
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        if (dVar == null) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(16640);
            return;
        }
        this.f72283n.a(dVar.a());
        this.f72283n.b();
        GLES20.glClear(16640);
        OpenGlUtils.bindFramebuffer(36160, 0);
        this.f72283n.c();
    }

    private static void a(float[] fArr, k kVar, boolean z4, boolean z5) {
        float[] fArr2 = f72270a;
        if (kVar != null) {
            int i4 = AnonymousClass1.f72284a[kVar.ordinal()];
            if (i4 == 1) {
                fArr2 = f72271b;
            } else if (i4 == 2) {
                fArr2 = f72273d;
            } else if (i4 == 3) {
                fArr2 = f72272c;
            }
        }
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z4) {
            fArr[0] = a(fArr[0]);
            fArr[2] = a(fArr[2]);
            fArr[4] = a(fArr[4]);
            fArr[6] = a(fArr[6]);
        }
        if (z5) {
            fArr[1] = a(fArr[1]);
            fArr[3] = a(fArr[3]);
            fArr[5] = a(fArr[5]);
            fArr[7] = a(fArr[7]);
        }
    }
}
