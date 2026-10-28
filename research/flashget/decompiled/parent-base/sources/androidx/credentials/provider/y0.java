package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.service.credentials.BeginGetCredentialResponse;
import kotlin.Metadata;

/* compiled from: IntentHandlerConverters.kt */
@kd.i(name = "IntentHandlerConverters")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/content/Intent;", "Landroid/credentials/CreateCredentialException;", "c", "(Landroid/content/Intent;)Landroid/credentials/CreateCredentialException;", "Landroid/credentials/GetCredentialException;", "d", "(Landroid/content/Intent;)Landroid/credentials/GetCredentialException;", "Landroidx/credentials/provider/w;", "a", "(Landroid/content/Intent;)Landroidx/credentials/provider/w;", "Landroid/credentials/GetCredentialResponse;", "e", "(Landroid/content/Intent;)Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/CreateCredentialResponse;", "b", "(Landroid/content/Intent;)Landroid/credentials/CreateCredentialResponse;", "credentials_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes3.dex */
public final class y0 {
    @fg.m
    @androidx.annotation.x0(34)
    public static final w a(@fg.l Intent intent) {
        Object parcelableExtra;
        kotlin.jvm.internal.l0.p(intent, "<this>");
        if (!intent.hasExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", t0.a());
        BeginGetCredentialResponse a5 = u0.a(parcelableExtra);
        if (a5 == null) {
            return null;
        }
        return androidx.credentials.provider.utils.h1.INSTANCE.q(a5);
    }

    @fg.m
    @androidx.annotation.x0(34)
    public static final CreateCredentialResponse b(@fg.l Intent intent) {
        Object parcelableExtra;
        kotlin.jvm.internal.l0.p(intent, "<this>");
        if (!intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", x0.a());
        return androidx.credentials.b1.a(parcelableExtra);
    }

    @fg.m
    @androidx.annotation.x0(34)
    public static final CreateCredentialException c(@fg.l Intent intent) {
        Object parcelableExtra;
        kotlin.jvm.internal.l0.p(intent, "<this>");
        if (!intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", v0.a());
        return androidx.credentials.z0.a(parcelableExtra);
    }

    @fg.m
    @androidx.annotation.x0(34)
    public static final GetCredentialException d(@fg.l Intent intent) {
        Object parcelableExtra;
        kotlin.jvm.internal.l0.p(intent, "<this>");
        if (!intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", w0.a());
        return androidx.credentials.d1.a(parcelableExtra);
    }

    @fg.m
    @androidx.annotation.x0(34)
    public static final GetCredentialResponse e(@fg.l Intent intent) {
        Object parcelableExtra;
        kotlin.jvm.internal.l0.p(intent, "<this>");
        if (!intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", r0.a());
        return androidx.credentials.c1.a(parcelableExtra);
    }
}
