package com.airbnb.lottie.parser;

import java.io.IOException;

/* compiled from: FloatParser.java */
/* loaded from: classes3.dex */
public class l implements n0<Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final l f39235a = new l();

    private l() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float a(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        return Float.valueOf(s.g(cVar) * f4);
    }
}
