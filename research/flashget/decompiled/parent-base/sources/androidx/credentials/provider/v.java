package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialRequest;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeginGetCredentialRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000b2\u00020\u0001:\u0002\t\rB#\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/credentials/provider/v;", "", "", "Landroidx/credentials/provider/u;", "beginGetCredentialOptions", "Landroidx/credentials/provider/a0;", "callingAppInfo", "<init>", "(Ljava/util/List;Landroidx/credentials/provider/a0;)V", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Landroidx/credentials/provider/a0;", "d", "()Landroidx/credentials/provider/a0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<u> beginGetCredentialOptions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final a0 callingAppInfo;

    /* compiled from: BeginGetCredentialRequest.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/credentials/provider/v$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/v;", "request", "Lkotlin/k2;", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/v;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/v;", "", "Ljava/lang/String;", "REQUEST_KEY", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    private static final class a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginGetCredentialRequest";

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f28200a = new a();

        private a() {
        }

        @androidx.annotation.u
        @kd.n
        public static final void a(@fg.l Bundle bundle, @fg.l v request) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            kotlin.jvm.internal.l0.p(request, "request");
            bundle.putParcelable("androidx.credentials.provider.BeginGetCredentialRequest", androidx.credentials.provider.utils.h1.INSTANCE.l(request));
        }

        @androidx.annotation.u
        @fg.m
        @kd.n
        public static final v b(@fg.l Bundle bundle) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            BeginGetCredentialRequest beginGetCredentialRequest = (BeginGetCredentialRequest) bundle.getParcelable("androidx.credentials.provider.BeginGetCredentialRequest", BeginGetCredentialRequest.class);
            if (beginGetCredentialRequest != null) {
                return androidx.credentials.provider.utils.h1.INSTANCE.p(beginGetCredentialRequest);
            }
            return null;
        }
    }

    /* compiled from: BeginGetCredentialRequest.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/v$b;", "", "<init>", "()V", "Landroidx/credentials/provider/v;", "request", "Landroid/os/Bundle;", "a", "(Landroidx/credentials/provider/v;)Landroid/os/Bundle;", "bundle", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/v;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.v$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final Bundle a(@fg.l v request) {
            kotlin.jvm.internal.l0.p(request, "request");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                a.a(bundle, request);
            }
            return bundle;
        }

        @fg.m
        @kd.n
        public final v b(@fg.l Bundle bundle) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            if (Build.VERSION.SDK_INT >= 34) {
                return a.b(bundle);
            }
            return null;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @kd.j
    public v(@fg.l List<? extends u> beginGetCredentialOptions) {
        this(beginGetCredentialOptions, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.l0.p(beginGetCredentialOptions, "beginGetCredentialOptions");
    }

    @fg.l
    @kd.n
    public static final Bundle a(@fg.l v vVar) {
        return INSTANCE.a(vVar);
    }

    @fg.m
    @kd.n
    public static final v b(@fg.l Bundle bundle) {
        return INSTANCE.b(bundle);
    }

    @fg.l
    public final List<u> c() {
        return this.beginGetCredentialOptions;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final a0 getCallingAppInfo() {
        return this.callingAppInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kd.j
    public v(@fg.l List<? extends u> beginGetCredentialOptions, @fg.m a0 a0Var) {
        kotlin.jvm.internal.l0.p(beginGetCredentialOptions, "beginGetCredentialOptions");
        this.beginGetCredentialOptions = beginGetCredentialOptions;
        this.callingAppInfo = a0Var;
    }

    public /* synthetic */ v(List list, a0 a0Var, int i4, kotlin.jvm.internal.w wVar) {
        this(list, (i4 & 2) != 0 ? null : a0Var);
    }
}
