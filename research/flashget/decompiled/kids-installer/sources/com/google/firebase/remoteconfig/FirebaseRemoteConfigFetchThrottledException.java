package com.google.firebase.remoteconfig;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {

    /* renamed from: p, reason: collision with root package name */
    private final long f17860p;

    public FirebaseRemoteConfigFetchThrottledException(long j5) {
        this(ProtectedSandApp.s("⬟"), j5);
    }

    public long b() {
        return this.f17860p;
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j5) {
        super(str);
        this.f17860p = j5;
    }
}
