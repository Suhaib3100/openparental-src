package com.tencent.liteav.videobase.a;

import android.opengl.GLES20;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.frame.c;
import com.tencent.liteav.videobase.frame.d;
import com.tencent.liteav.videobase.frame.e;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final float[] f72118i = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f72119j = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    protected final com.tencent.liteav.videobase.utils.a f72120a;

    /* renamed from: b, reason: collision with root package name */
    protected final Size f72121b;

    /* renamed from: c, reason: collision with root package name */
    protected int f72122c;

    /* renamed from: d, reason: collision with root package name */
    protected int f72123d;

    /* renamed from: e, reason: collision with root package name */
    protected int f72124e;

    /* renamed from: f, reason: collision with root package name */
    protected e f72125f;

    /* renamed from: g, reason: collision with root package name */
    public int f72126g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f72127h;

    /* renamed from: k, reason: collision with root package name */
    private final com.tencent.liteav.videobase.utils.e f72128k;

    /* renamed from: l, reason: collision with root package name */
    private int f72129l;

    /* renamed from: m, reason: collision with root package name */
    private final c f72130m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f72131n;

    public a() {
        this(ProtectedSandApp.s("咊\u0001"), ProtectedSandApp.s("咋\u0001"));
    }

    protected void a(int i4) {
    }

    public int b() {
        return 3553;
    }

    public final void c() {
        if (this.f72131n) {
            this.f72120a.a();
            d();
            this.f72131n = false;
            this.f72130m.d();
            int i4 = this.f72126g;
            if (i4 != -1) {
                GLES20.glDeleteProgram(i4);
                this.f72126g = -1;
            }
            LiteavLog.d(ProtectedSandApp.s("咔\u0001"), ProtectedSandApp.s("咖\u0001"), this, Integer.valueOf(f72119j.decrementAndGet()));
        }
    }

    protected void d() {
    }

    public a(String str, String str2) {
        this.f72121b = new Size(-1, -1);
        this.f72126g = -1;
        this.f72130m = new c();
        this.f72120a = new com.tencent.liteav.videobase.utils.a();
        this.f72128k = new com.tencent.liteav.videobase.utils.e(str, str2);
    }

    public final void a() {
        if (this.f72131n) {
            return;
        }
        this.f72130m.a();
        com.tencent.liteav.videobase.utils.e eVar = this.f72128k;
        int a5 = com.tencent.liteav.videobase.utils.e.a(eVar.f72317a, 35633);
        int i4 = -1;
        String s4 = ProtectedSandApp.s("和\u0001");
        if (a5 == 0) {
            LiteavLog.e(s4, ProtectedSandApp.s("咍\u0001"));
        } else {
            int a6 = com.tencent.liteav.videobase.utils.e.a(eVar.f72318b, 35632);
            if (a6 == 0) {
                LiteavLog.e(s4, ProtectedSandApp.s("咎\u0001"));
                GLES20.glDeleteShader(a5);
            } else {
                int glCreateProgram = GLES20.glCreateProgram();
                GLES20.glAttachShader(glCreateProgram, a5);
                GLES20.glAttachShader(glCreateProgram, a6);
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    LiteavLog.e(s4, ProtectedSandApp.s("咏\u0001") + iArr[0]);
                    GLES20.glDeleteShader(a5);
                    GLES20.glDeleteShader(a6);
                    GLES20.glDeleteProgram(glCreateProgram);
                } else {
                    GLES20.glDeleteShader(a5);
                    GLES20.glDeleteShader(a6);
                    i4 = glCreateProgram;
                }
            }
        }
        this.f72126g = i4;
        this.f72122c = GLES20.glGetAttribLocation(i4, ProtectedSandApp.s("咐\u0001"));
        this.f72123d = GLES20.glGetUniformLocation(this.f72126g, ProtectedSandApp.s("咑\u0001"));
        this.f72124e = GLES20.glGetAttribLocation(this.f72126g, ProtectedSandApp.s("咒\u0001"));
        this.f72129l = GLES20.glGetUniformLocation(this.f72126g, ProtectedSandApp.s("咓\u0001"));
        a((e) null);
        this.f72131n = true;
        LiteavLog.d(ProtectedSandApp.s("咔\u0001"), ProtectedSandApp.s("咕\u0001"), this, Integer.valueOf(f72119j.incrementAndGet()));
    }

    public final void a(int i4, int i5) {
        Size size = this.f72121b;
        size.width = i4;
        size.height = i5;
    }

    public void a(int i4, d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.f72131n) {
            GLES20.glUseProgram(this.f72126g);
            this.f72120a.a();
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.f72122c, 2, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f72122c);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.f72124e, 2, 5126, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.f72124e);
            if (i4 != -1) {
                GLES20.glActiveTexture(33984);
                OpenGlUtils.bindTexture(b(), i4);
                GLES20.glUniform1i(this.f72123d, 0);
            }
            if (dVar != null) {
                this.f72130m.a(dVar.a());
                this.f72130m.b();
            } else {
                OpenGlUtils.bindFramebuffer(36160, 0);
            }
            float[] fArr = this.f72127h;
            if (fArr == null) {
                fArr = f72118i;
            }
            GLES20.glUniformMatrix4fv(this.f72129l, 1, false, fArr, 0);
            a(i4);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f72122c);
            GLES20.glDisableVertexAttribArray(this.f72124e);
            GLES20.glActiveTexture(33984);
            OpenGlUtils.bindTexture(b(), 0);
            if (dVar != null) {
                OpenGlUtils.bindFramebuffer(36160, 0);
                this.f72130m.c();
            }
        }
    }

    protected void a(e eVar) {
        this.f72125f = eVar;
    }
}
