package com.google.firebase.remoteconfig;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException(@o0 String str) {
        super(str);
    }

    public FirebaseRemoteConfigClientException(@o0 String str, @q0 Throwable th) {
        super(str, th);
    }

    public FirebaseRemoteConfigClientException(@o0 String str, @o0 FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
    }

    public FirebaseRemoteConfigClientException(@o0 String str, @q0 Throwable th, @o0 FirebaseRemoteConfigException.a aVar) {
        super(str, th, aVar);
    }
}
