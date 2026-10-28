package com.google.firebase.remoteconfig;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: p, reason: collision with root package name */
    private final int f17861p;

    public FirebaseRemoteConfigServerException(int i5, @o0 String str) {
        super(str);
        this.f17861p = i5;
    }

    public int b() {
        return this.f17861p;
    }

    public FirebaseRemoteConfigServerException(int i5, @o0 String str, @q0 Throwable th) {
        super(str, th);
        this.f17861p = i5;
    }

    public FirebaseRemoteConfigServerException(@o0 String str, @Nonnull FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f17861p = -1;
    }

    public FirebaseRemoteConfigServerException(int i5, @o0 String str, @Nonnull FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f17861p = i5;
    }

    public FirebaseRemoteConfigServerException(@o0 String str, @q0 Throwable th, @o0 FirebaseRemoteConfigException.a aVar) {
        super(str, th, aVar);
        this.f17861p = -1;
    }

    public FirebaseRemoteConfigServerException(int i5, @o0 String str, @q0 Throwable th, @o0 FirebaseRemoteConfigException.a aVar) {
        super(str, th, aVar);
        this.f17861p = i5;
    }
}
