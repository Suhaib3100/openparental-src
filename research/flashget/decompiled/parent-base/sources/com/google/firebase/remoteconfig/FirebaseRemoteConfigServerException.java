package com.google.firebase.remoteconfig;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* loaded from: classes6.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: c, reason: collision with root package name */
    private final int f60379c;

    public FirebaseRemoteConfigServerException(int i4, @o0 String str) {
        super(str);
        this.f60379c = i4;
    }

    public int b() {
        return this.f60379c;
    }

    public FirebaseRemoteConfigServerException(int i4, @o0 String str, @q0 Throwable th) {
        super(str, th);
        this.f60379c = i4;
    }

    public FirebaseRemoteConfigServerException(@o0 String str, @o0 FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f60379c = -1;
    }

    public FirebaseRemoteConfigServerException(int i4, @o0 String str, @o0 FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f60379c = i4;
    }

    public FirebaseRemoteConfigServerException(@o0 String str, @q0 Throwable th, @o0 FirebaseRemoteConfigException.a aVar) {
        super(str, th, aVar);
        this.f60379c = -1;
    }

    public FirebaseRemoteConfigServerException(int i4, @o0 String str, @q0 Throwable th, @o0 FirebaseRemoteConfigException.a aVar) {
        super(str, th, aVar);
        this.f60379c = i4;
    }
}
