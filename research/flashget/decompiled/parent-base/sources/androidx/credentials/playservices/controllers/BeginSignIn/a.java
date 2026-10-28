package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import androidx.credentials.h1;
import androidx.credentials.k1;
import androidx.credentials.l1;
import androidx.credentials.o;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.k;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: BeginSignInControllerUtility.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/a;", "", "<init>", "()V", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    private static final long f27815c = 231815000;

    /* renamed from: d, reason: collision with root package name */
    private static final long f27816d = 241217000;

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final String f27814b = "BeginSignInUtility";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: BeginSignInControllerUtility.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)J", "curAuthVersion", "", "d", "(J)Z", "Lr8/a;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "b", "(Lr8/a;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "Landroidx/credentials/h1;", "request", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "a", "(Landroidx/credentials/h1;Landroid/content/Context;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "AUTH_MIN_VERSION_JSON_PARSING", "J", "AUTH_MIN_VERSION_PREFER_IMME_CRED", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.BeginSignIn.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions b(r8.a option) {
            BeginSignInRequest.GoogleIdTokenRequestOptions.Builder supported = BeginSignInRequest.GoogleIdTokenRequestOptions.builder().setFilterByAuthorizedAccounts(option.getF89752q()).setNonce(option.getF89751p()).setRequestVerifiedPhoneNumber(option.getF89755t()).setServerClientId(option.getF89750o()).setSupported(true);
            l0.o(supported, "builder()\n              …      .setSupported(true)");
            if (option.getF89753r() != null) {
                String f89753r = option.getF89753r();
                l0.m(f89753r);
                supported.associateLinkedAccounts(f89753r, option.l());
            }
            BeginSignInRequest.GoogleIdTokenRequestOptions build = supported.build();
            l0.o(build, "idTokenOption.build()");
            return build;
        }

        private final long c(Context context) {
            l0.o(context.getPackageManager(), "context.packageManager");
            return r3.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean d(long curAuthVersion) {
            return curAuthVersion < a.f27815c;
        }

        @l
        public final BeginSignInRequest a(@l h1 request, @l Context context) {
            l0.p(request, "request");
            l0.p(context, "context");
            BeginSignInRequest.Builder builder = new BeginSignInRequest.Builder();
            long c5 = c(context);
            boolean z4 = false;
            boolean z5 = false;
            for (o oVar : request.b()) {
                if (oVar instanceof k1) {
                    builder.setPasswordRequestOptions(new BeginSignInRequest.PasswordRequestOptions.Builder().setSupported(true).build());
                    if (!z4 && !oVar.getIsAutoSelectAllowed()) {
                        z4 = false;
                    }
                    z4 = true;
                } else if ((oVar instanceof l1) && !z5) {
                    if (d(c5)) {
                        builder.setPasskeysSignInRequestOptions(k.INSTANCE.i((l1) oVar));
                    } else {
                        builder.setPasskeyJsonSignInRequestOptions(k.INSTANCE.h((l1) oVar));
                    }
                    z5 = true;
                } else if (oVar instanceof r8.a) {
                    r8.a aVar = (r8.a) oVar;
                    builder.setGoogleIdTokenRequestOptions(b(aVar));
                    if (!z4 && !aVar.getF89756u()) {
                        z4 = false;
                    }
                    z4 = true;
                }
            }
            if (c5 > a.f27816d) {
                builder.setPreferImmediatelyAvailableCredentials(request.getPreferImmediatelyAvailableCredentials());
            }
            BeginSignInRequest build = builder.setAutoSelectEnabled(z4).build();
            l0.o(build, "requestBuilder.setAutoSe…abled(autoSelect).build()");
            return build;
        }

        public Companion(w wVar) {
        }
    }
}
