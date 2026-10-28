package com.google.firebase.remoteconfig;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.firebase.FirebaseException;

/* loaded from: classes6.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* renamed from: b, reason: collision with root package name */
    private final a f60377b;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        a(int i4) {
            this.value = i4;
        }

        public int value() {
            return this.value;
        }
    }

    public FirebaseRemoteConfigException(@o0 String str) {
        super(str);
        this.f60377b = a.UNKNOWN;
    }

    @o0
    public a a() {
        return this.f60377b;
    }

    public FirebaseRemoteConfigException(@o0 String str, @q0 Throwable th) {
        super(str, th);
        this.f60377b = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(@o0 String str, @o0 a aVar) {
        super(str);
        this.f60377b = aVar;
    }

    public FirebaseRemoteConfigException(@o0 String str, @q0 Throwable th, @o0 a aVar) {
        super(str, th);
        this.f60377b = aVar;
    }
}
