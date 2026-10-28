package com.google.android.gms.common.api.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public interface zaca {
    ConnectionResult zab();

    ConnectionResult zac(long j5, TimeUnit timeUnit);

    @q0
    ConnectionResult zad(@o0 Api<?> api);

    <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zae(@o0 T t5);

    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaf(@o0 T t5);

    void zaq();

    void zar();

    void zas(String str, @q0 FileDescriptor fileDescriptor, PrintWriter printWriter, @q0 String[] strArr);

    void zat();

    void zau();

    boolean zaw();

    boolean zax();

    boolean zay(SignInConnectionListener signInConnectionListener);
}
