package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class FaceRect {
    private int height;
    private int width;

    /* renamed from: x, reason: collision with root package name */
    private int f72495x;

    /* renamed from: y, reason: collision with root package name */
    private int f72496y;

    public FaceRect(int i4, int i5, int i6, int i7) {
        this.f72495x = i4;
        this.f72496y = i5;
        this.width = i6;
        this.height = i7;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getX() {
        return this.f72495x;
    }

    public int getY() {
        return this.f72496y;
    }
}
