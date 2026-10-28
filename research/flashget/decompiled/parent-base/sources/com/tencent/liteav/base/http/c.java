package com.tencent.liteav.base.http;

/* loaded from: classes7.dex */
final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final HttpClientAndroid f71877a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f71878b;

    private c(HttpClientAndroid httpClientAndroid, Long l4) {
        this.f71877a = httpClientAndroid;
        this.f71878b = l4;
    }

    public static Runnable a(HttpClientAndroid httpClientAndroid, Long l4) {
        return new c(httpClientAndroid, l4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpClientAndroid.lambda$resumeRepeatDownload$2(this.f71877a, this.f71878b);
    }
}
