package com.tencent.liteav.base.http;

import com.tencent.liteav.base.http.HttpClientAndroid;

/* loaded from: classes7.dex */
final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final HttpClientAndroid f71882a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpClientAndroid.f f71883b;

    /* renamed from: c, reason: collision with root package name */
    private final long f71884c;

    private f(HttpClientAndroid httpClientAndroid, HttpClientAndroid.f fVar, long j4) {
        this.f71882a = httpClientAndroid;
        this.f71883b = fVar;
        this.f71884c = j4;
    }

    public static Runnable a(HttpClientAndroid httpClientAndroid, HttpClientAndroid.f fVar, long j4) {
        return new f(httpClientAndroid, fVar, j4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpClientAndroid.lambda$doReadData$5(this.f71882a, this.f71883b, this.f71884c);
    }
}
