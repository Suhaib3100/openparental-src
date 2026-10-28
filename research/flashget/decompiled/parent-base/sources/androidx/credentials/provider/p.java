package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import kotlin.Metadata;

/* compiled from: BeginCreateCredentialRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 \u00102\u00020\u0001:\u0002\n\u000eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/credentials/provider/p;", "", "", "type", "Landroid/os/Bundle;", "candidateQueryData", "Landroidx/credentials/provider/a0;", "callingAppInfo", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroidx/credentials/provider/a0;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "c", "Landroidx/credentials/provider/a0;", "()Landroidx/credentials/provider/a0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Bundle candidateQueryData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final a0 callingAppInfo;

    /* compiled from: BeginCreateCredentialRequest.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/credentials/provider/p$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/p;", "request", "Lkotlin/k2;", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/p;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/p;", "", "Ljava/lang/String;", "REQUEST_KEY", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    private static final class a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginCreateCredentialRequest";

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f28102a = new a();

        private a() {
        }

        @androidx.annotation.u
        @kd.n
        public static final void a(@fg.l Bundle bundle, @fg.l p request) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            kotlin.jvm.internal.l0.p(request, "request");
            bundle.putParcelable("androidx.credentials.provider.BeginCreateCredentialRequest", androidx.credentials.provider.utils.w.INSTANCE.d(request));
        }

        @androidx.annotation.u
        @fg.m
        @kd.n
        public static final p b(@fg.l Bundle bundle) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            BeginCreateCredentialRequest beginCreateCredentialRequest = (BeginCreateCredentialRequest) bundle.getParcelable("androidx.credentials.provider.BeginCreateCredentialRequest", BeginCreateCredentialRequest.class);
            if (beginCreateCredentialRequest != null) {
                return androidx.credentials.provider.utils.w.INSTANCE.f(beginCreateCredentialRequest);
            }
            return null;
        }
    }

    /* compiled from: BeginCreateCredentialRequest.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/p$b;", "", "<init>", "()V", "Landroidx/credentials/provider/p;", "request", "Landroid/os/Bundle;", "a", "(Landroidx/credentials/provider/p;)Landroid/os/Bundle;", "bundle", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/p;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.p$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final Bundle a(@fg.l p request) {
            kotlin.jvm.internal.l0.p(request, "request");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                a.a(bundle, request);
            }
            return bundle;
        }

        @fg.m
        @kd.n
        public final p b(@fg.l Bundle bundle) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            if (Build.VERSION.SDK_INT >= 34) {
                return a.b(bundle);
            }
            return null;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public p(@fg.l String type, @fg.l Bundle candidateQueryData, @fg.m a0 a0Var) {
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        this.type = type;
        this.candidateQueryData = candidateQueryData;
        this.callingAppInfo = a0Var;
    }

    @fg.l
    @kd.n
    public static final Bundle a(@fg.l p pVar) {
        return INSTANCE.a(pVar);
    }

    @fg.m
    @kd.n
    public static final p b(@fg.l Bundle bundle) {
        return INSTANCE.b(bundle);
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final a0 getCallingAppInfo() {
        return this.callingAppInfo;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
