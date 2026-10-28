package com.cby.txliteav.live;

import javax.microedition.khronos.egl.EGLContext;
import kotlin.Metadata;

/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\r\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/cby/txliteav/live/s;", "", "<init>", "()V", "", "a", "I", "c", "()I", "f", "(I)V", "textureId", "Ljavax/microedition/khronos/egl/EGLContext;", "b", "Ljavax/microedition/khronos/egl/EGLContext;", "()Ljavax/microedition/khronos/egl/EGLContext;", "d", "(Ljavax/microedition/khronos/egl/EGLContext;)V", "eglContext10", "Landroid/opengl/EGLContext;", "Landroid/opengl/EGLContext;", "()Landroid/opengl/EGLContext;", "e", "(Landroid/opengl/EGLContext;)V", "eglContext14", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int textureId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private EGLContext eglContext10;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private android.opengl.EGLContext eglContext14;

    @fg.m
    /* renamed from: a, reason: from getter */
    public final EGLContext getEglContext10() {
        return this.eglContext10;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final android.opengl.EGLContext getEglContext14() {
        return this.eglContext14;
    }

    /* renamed from: c, reason: from getter */
    public final int getTextureId() {
        return this.textureId;
    }

    public final void d(@fg.m EGLContext eGLContext) {
        this.eglContext10 = eGLContext;
    }

    public final void e(@fg.m android.opengl.EGLContext eGLContext) {
        this.eglContext14 = eGLContext;
    }

    public final void f(int i4) {
        this.textureId = i4;
    }
}
