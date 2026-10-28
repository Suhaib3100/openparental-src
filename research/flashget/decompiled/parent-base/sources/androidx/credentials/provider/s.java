package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;

/* compiled from: BeginCreatePasswordCredentialRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/credentials/provider/s;", "Landroidx/credentials/provider/p;", "Landroidx/credentials/provider/a0;", "callingAppInfo", "Landroid/os/Bundle;", "candidateQueryData", "<init>", "(Landroidx/credentials/provider/a0;Landroid/os/Bundle;)V", "e", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s extends p {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: BeginCreatePasswordCredentialRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/credentials/provider/s$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "Landroidx/credentials/provider/a0;", "callingAppInfo", "Landroidx/credentials/provider/s;", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/a0;)Landroidx/credentials/provider/s;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.s$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final s a(@fg.l Bundle data, @fg.m a0 callingAppInfo) {
            kotlin.jvm.internal.l0.p(data, "data");
            try {
                return new s(callingAppInfo, data);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@fg.m a0 a0Var, @fg.l Bundle candidateQueryData) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", candidateQueryData, a0Var);
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
    }

    @fg.l
    @kd.n
    public static final s f(@fg.l Bundle bundle, @fg.m a0 a0Var) {
        return INSTANCE.a(bundle, a0Var);
    }
}
