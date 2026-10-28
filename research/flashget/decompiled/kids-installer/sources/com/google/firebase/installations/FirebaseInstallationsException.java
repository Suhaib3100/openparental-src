package com.google.firebase.installations;

import androidx.annotation.o0;
import com.google.firebase.FirebaseException;

/* loaded from: classes3.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final a f16674o;

    /* loaded from: classes2.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(@o0 a aVar) {
        this.f16674o = aVar;
    }

    @o0
    public a a() {
        return this.f16674o;
    }

    public FirebaseInstallationsException(@o0 String str, @o0 a aVar) {
        super(str);
        this.f16674o = aVar;
    }

    public FirebaseInstallationsException(@o0 String str, @o0 a aVar, @o0 Throwable th) {
        super(str, th);
        this.f16674o = aVar;
    }
}
