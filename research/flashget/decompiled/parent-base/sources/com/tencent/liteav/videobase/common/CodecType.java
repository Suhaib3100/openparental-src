package com.tencent.liteav.videobase.common;

/* loaded from: classes7.dex */
public enum CodecType {
    f72196a(-1),
    f72197b(0),
    f72198c(1),
    f72199d(2),
    f72200e(3);


    /* renamed from: f, reason: collision with root package name */
    private static final CodecType[] f72201f = values();
    public final int mValue;

    CodecType(int i4) {
        this.mValue = i4;
    }

    public static CodecType a(int i4) {
        for (CodecType codecType : f72201f) {
            if (i4 == codecType.mValue) {
                return codecType;
            }
        }
        return f72197b;
    }
}
