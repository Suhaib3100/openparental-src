package com.google.firebase.remoteconfig;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.firebase.FirebaseException;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* renamed from: o, reason: collision with root package name */
    private final a f17859o;

    /* loaded from: classes2.dex */
    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        a(int i5) {
            this.value = i5;
        }

        public int value() {
            return this.value;
        }
    }

    public FirebaseRemoteConfigException(@o0 String str) {
        super(str);
        this.f17859o = a.UNKNOWN;
    }

    @o0
    public a a() {
        return this.f17859o;
    }

    public FirebaseRemoteConfigException(@o0 String str, @q0 Throwable th) {
        super(str, th);
        this.f17859o = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(@o0 String str, @o0 a aVar) {
        super(str);
        this.f17859o = aVar;
    }

    public FirebaseRemoteConfigException(@o0 String str, @q0 Throwable th, @o0 a aVar) {
        super(str, th);
        this.f17859o = aVar;
    }
}
