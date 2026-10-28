package androidx.credentials.provider;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ProviderGetCredentialRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/credentials/provider/e2;", "", "", "Landroidx/credentials/o;", "credentialOptions", "Landroidx/credentials/provider/a0;", "callingAppInfo", "<init>", "(Ljava/util/List;Landroidx/credentials/provider/a0;)V", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Landroidx/credentials/provider/a0;", "()Landroidx/credentials/provider/a0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<androidx.credentials.o> credentialOptions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a0 callingAppInfo;

    /* compiled from: ProviderGetCredentialRequest.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/e2$a;", "", "<init>", "()V", "", "Landroidx/credentials/o;", "options", "Landroidx/credentials/provider/a0;", "callingAppInfo", "Landroidx/credentials/provider/e2;", "a", "(Ljava/util/List;Landroidx/credentials/provider/a0;)Landroidx/credentials/provider/e2;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.e2$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final e2 a(@fg.l List<? extends androidx.credentials.o> options, @fg.l a0 callingAppInfo) {
            kotlin.jvm.internal.l0.p(options, "options");
            kotlin.jvm.internal.l0.p(callingAppInfo, "callingAppInfo");
            return new e2(options, callingAppInfo);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e2(@fg.l List<? extends androidx.credentials.o> credentialOptions, @fg.l a0 callingAppInfo) {
        kotlin.jvm.internal.l0.p(credentialOptions, "credentialOptions");
        kotlin.jvm.internal.l0.p(callingAppInfo, "callingAppInfo");
        this.credentialOptions = credentialOptions;
        this.callingAppInfo = callingAppInfo;
    }

    @fg.l
    @kd.n
    public static final e2 a(@fg.l List<? extends androidx.credentials.o> list, @fg.l a0 a0Var) {
        return INSTANCE.a(list, a0Var);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final a0 getCallingAppInfo() {
        return this.callingAppInfo;
    }

    @fg.l
    public final List<androidx.credentials.o> c() {
        return this.credentialOptions;
    }
}
