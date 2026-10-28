package com.tencent.liteav.base.http;

/* loaded from: classes7.dex */
final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final HttpClientAndroid f71879a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71880b;

    private d(HttpClientAndroid httpClientAndroid, long j4) {
        this.f71879a = httpClientAndroid;
        this.f71880b = j4;
    }

    public static Runnable a(HttpClientAndroid httpClientAndroid, long j4) {
        return new d(httpClientAndroid, j4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpClientAndroid.lambda$resumeRepeatDownload$3(this.f71879a, this.f71880b);
    }
}
