package androidx.credentials.provider;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.SigningInfo;
import android.credentials.CredentialOption;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CreateCredentialRequest;
import android.service.credentials.GetCredentialRequest;
import androidx.credentials.b;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.o;
import androidx.credentials.provider.b2;
import androidx.credentials.provider.e2;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.Metadata;

/* compiled from: PendingIntentHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/b2;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(34)
/* loaded from: classes3.dex */
public final class b2 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f27999b = "PendingIntentHandler";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: PendingIntentHandler.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/credentials/provider/b2$a;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroidx/credentials/provider/d2;", "c", "(Landroid/content/Intent;)Landroidx/credentials/provider/d2;", "Landroidx/credentials/provider/v;", "b", "(Landroid/content/Intent;)Landroidx/credentials/provider/v;", "Landroidx/credentials/c;", "response", "Lkotlin/k2;", "h", "(Landroid/content/Intent;Landroidx/credentials/c;)V", "Landroidx/credentials/provider/e2;", "d", "(Landroid/content/Intent;)Landroidx/credentials/provider/e2;", "Landroidx/credentials/i1;", "j", "(Landroid/content/Intent;Landroidx/credentials/i1;)V", "Landroidx/credentials/provider/w;", "f", "(Landroid/content/Intent;Landroidx/credentials/provider/w;)V", "Landroidx/credentials/exceptions/GetCredentialException;", "exception", "i", "(Landroid/content/Intent;Landroidx/credentials/exceptions/GetCredentialException;)V", "Landroidx/credentials/exceptions/CreateCredentialException;", "g", "(Landroid/content/Intent;Landroidx/credentials/exceptions/CreateCredentialException;)V", "", "TAG", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nPendingIntentHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PendingIntentHandler.kt\nandroidx/credentials/provider/PendingIntentHandler$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
    /* renamed from: androidx.credentials.provider.b2$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: PendingIntentHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/credentials/CredentialOption;", "kotlin.jvm.PlatformType", "option", "Landroidx/credentials/o;", "a", "(Landroid/credentials/CredentialOption;)Landroidx/credentials/o;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.b2$a$a, reason: collision with other inner class name */
        static final class C0452a extends kotlin.jvm.internal.n0 implements ld.l<CredentialOption, androidx.credentials.o> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0452a f28000b = new C0452a(1);

            C0452a() {
                super(1);
            }

            public final androidx.credentials.o a(CredentialOption credentialOption) {
                String type;
                Bundle credentialRetrievalData;
                Bundle candidateQueryData;
                boolean isSystemProviderRequired;
                Set<ComponentName> allowedProviders;
                o.Companion companion = androidx.credentials.o.INSTANCE;
                type = credentialOption.getType();
                kotlin.jvm.internal.l0.o(type, "option.type");
                credentialRetrievalData = credentialOption.getCredentialRetrievalData();
                kotlin.jvm.internal.l0.o(credentialRetrievalData, "option.credentialRetrievalData");
                candidateQueryData = credentialOption.getCandidateQueryData();
                kotlin.jvm.internal.l0.o(candidateQueryData, "option.candidateQueryData");
                isSystemProviderRequired = credentialOption.isSystemProviderRequired();
                allowedProviders = credentialOption.getAllowedProviders();
                kotlin.jvm.internal.l0.o(allowedProviders, "option.allowedProviders");
                return companion.a(type, credentialRetrievalData, candidateQueryData, isSystemProviderRequired, allowedProviders);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ androidx.credentials.o invoke(CredentialOption credentialOption) {
                return a(a2.a(credentialOption));
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.o e(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return (androidx.credentials.o) tmp0.invoke(obj);
        }

        @fg.m
        @kd.n
        public final v b(@fg.l Intent intent) {
            Object parcelableExtra;
            kotlin.jvm.internal.l0.p(intent, "intent");
            parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST", r1.a());
            BeginGetCredentialRequest a5 = s1.a(parcelableExtra);
            if (a5 != null) {
                return androidx.credentials.provider.utils.h1.INSTANCE.p(a5);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.m
        @kd.n
        public final d2 c(@fg.l Intent intent) {
            Object parcelableExtra;
            String type;
            Bundle data;
            Bundle data2;
            CallingAppInfo callingAppInfo;
            String origin;
            CallingAppInfo callingAppInfo2;
            String packageName;
            CallingAppInfo callingAppInfo3;
            SigningInfo signingInfo;
            CallingAppInfo callingAppInfo4;
            String origin2;
            kotlin.jvm.internal.l0.p(intent, "intent");
            parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST", t1.a());
            CreateCredentialRequest a5 = c1.a(parcelableExtra);
            if (a5 == 0) {
                return (d2) a5;
            }
            try {
                b.Companion companion = androidx.credentials.b.INSTANCE;
                type = a5.getType();
                kotlin.jvm.internal.l0.o(type, "frameworkReq.type");
                data = a5.getData();
                kotlin.jvm.internal.l0.o(data, "frameworkReq.data");
                data2 = a5.getData();
                kotlin.jvm.internal.l0.o(data2, "frameworkReq.data");
                callingAppInfo = a5.getCallingAppInfo();
                origin = callingAppInfo.getOrigin();
                androidx.credentials.b b5 = companion.b(type, data, data2, false, origin);
                callingAppInfo2 = a5.getCallingAppInfo();
                packageName = callingAppInfo2.getPackageName();
                kotlin.jvm.internal.l0.o(packageName, "frameworkReq.callingAppInfo.packageName");
                callingAppInfo3 = a5.getCallingAppInfo();
                signingInfo = callingAppInfo3.getSigningInfo();
                kotlin.jvm.internal.l0.o(signingInfo, "frameworkReq.callingAppInfo.signingInfo");
                callingAppInfo4 = a5.getCallingAppInfo();
                origin2 = callingAppInfo4.getOrigin();
                return new d2(b5, new a0(packageName, signingInfo, origin2));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @fg.m
        @kd.n
        public final e2 d(@fg.l Intent intent) {
            Object parcelableExtra;
            List credentialOptions;
            CallingAppInfo callingAppInfo;
            String packageName;
            CallingAppInfo callingAppInfo2;
            SigningInfo signingInfo;
            CallingAppInfo callingAppInfo3;
            String origin;
            kotlin.jvm.internal.l0.p(intent, "intent");
            parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST", a1.a());
            GetCredentialRequest a5 = m1.a(parcelableExtra);
            if (a5 == null) {
                return null;
            }
            e2.Companion companion = e2.INSTANCE;
            credentialOptions = a5.getCredentialOptions();
            Stream stream = credentialOptions.stream();
            final C0452a c0452a = C0452a.f28000b;
            Object collect = stream.map(new Function() { // from class: androidx.credentials.provider.u1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    androidx.credentials.o e4;
                    e4 = b2.Companion.e(ld.l.this, obj);
                    return e4;
                }
            }).collect(Collectors.toList());
            kotlin.jvm.internal.l0.o(collect, "frameworkReq.credentialO…lect(Collectors.toList())");
            callingAppInfo = a5.getCallingAppInfo();
            packageName = callingAppInfo.getPackageName();
            kotlin.jvm.internal.l0.o(packageName, "frameworkReq.callingAppInfo.packageName");
            callingAppInfo2 = a5.getCallingAppInfo();
            signingInfo = callingAppInfo2.getSigningInfo();
            kotlin.jvm.internal.l0.o(signingInfo, "frameworkReq.callingAppInfo.signingInfo");
            callingAppInfo3 = a5.getCallingAppInfo();
            origin = callingAppInfo3.getOrigin();
            return companion.a((List) collect, new a0(packageName, signingInfo, origin));
        }

        @kd.n
        public final void f(@fg.l Intent intent, @fg.l w response) {
            kotlin.jvm.internal.l0.p(intent, "intent");
            kotlin.jvm.internal.l0.p(response, "response");
            intent.putExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", androidx.credentials.provider.utils.h1.INSTANCE.n(response));
        }

        @kd.n
        public final void g(@fg.l Intent intent, @fg.l CreateCredentialException exception) {
            kotlin.jvm.internal.l0.p(intent, "intent");
            kotlin.jvm.internal.l0.p(exception, "exception");
            l0.a();
            intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", k0.a(exception.getType(), exception.getMessage()));
        }

        @kd.n
        public final void h(@fg.l Intent intent, @fg.l androidx.credentials.c response) {
            kotlin.jvm.internal.l0.p(intent, "intent");
            kotlin.jvm.internal.l0.p(response, "response");
            k1.a();
            intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", j1.a(response.getData()));
        }

        @kd.n
        public final void i(@fg.l Intent intent, @fg.l GetCredentialException exception) {
            kotlin.jvm.internal.l0.p(intent, "intent");
            kotlin.jvm.internal.l0.p(exception, "exception");
            n0.a();
            intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", m0.a(exception.getType(), exception.getMessage()));
        }

        @kd.n
        public final void j(@fg.l Intent intent, @fg.l androidx.credentials.i1 response) {
            kotlin.jvm.internal.l0.p(intent, "intent");
            kotlin.jvm.internal.l0.p(response, "response");
            h1.a();
            i1.a();
            intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", g1.a(f1.a(response.getCredential().getType(), response.getCredential().getData())));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @fg.m
    @kd.n
    public static final v a(@fg.l Intent intent) {
        return INSTANCE.b(intent);
    }

    @fg.m
    @kd.n
    public static final d2 b(@fg.l Intent intent) {
        return INSTANCE.c(intent);
    }

    @fg.m
    @kd.n
    public static final e2 c(@fg.l Intent intent) {
        return INSTANCE.d(intent);
    }

    @kd.n
    public static final void d(@fg.l Intent intent, @fg.l w wVar) {
        INSTANCE.f(intent, wVar);
    }

    @kd.n
    public static final void e(@fg.l Intent intent, @fg.l CreateCredentialException createCredentialException) {
        INSTANCE.g(intent, createCredentialException);
    }

    @kd.n
    public static final void f(@fg.l Intent intent, @fg.l androidx.credentials.c cVar) {
        INSTANCE.h(intent, cVar);
    }

    @kd.n
    public static final void g(@fg.l Intent intent, @fg.l GetCredentialException getCredentialException) {
        INSTANCE.i(intent, getCredentialException);
    }

    @kd.n
    public static final void h(@fg.l Intent intent, @fg.l androidx.credentials.i1 i1Var) {
        INSTANCE.j(intent, i1Var);
    }
}
