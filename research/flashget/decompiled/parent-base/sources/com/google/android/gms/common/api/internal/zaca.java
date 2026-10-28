package com.google.android.gms.common.api.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public interface zaca {
    ConnectionResult zab();

    ConnectionResult zac(long j4, TimeUnit timeUnit);

    @q0
    ConnectionResult zad(@o0 Api api);

    BaseImplementation.ApiMethodImpl zae(@o0 BaseImplementation.ApiMethodImpl apiMethodImpl);

    BaseImplementation.ApiMethodImpl zaf(@o0 BaseImplementation.ApiMethodImpl apiMethodImpl);

    void zaq();

    void zar();

    void zas(String str, @q0 FileDescriptor fileDescriptor, PrintWriter printWriter, @q0 String[] strArr);

    void zat();

    void zau();

    boolean zaw();

    boolean zax();

    boolean zay(SignInConnectionListener signInConnectionListener);
}
