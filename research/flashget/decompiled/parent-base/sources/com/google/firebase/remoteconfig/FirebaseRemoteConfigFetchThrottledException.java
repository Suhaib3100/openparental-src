package com.google.firebase.remoteconfig;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {

    /* renamed from: c, reason: collision with root package name */
    private final long f60378c;

    public FirebaseRemoteConfigFetchThrottledException(long j4) {
        this(ProtectedSandApp.s("̲\u0001"), j4);
    }

    public long b() {
        return this.f60378c;
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j4) {
        super(str);
        this.f60378c = j4;
    }
}
