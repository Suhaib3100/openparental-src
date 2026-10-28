package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;

/* compiled from: BeginCreatePublicKeyCredentialRequest.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00152\u00020\u0001:\u0001\u0017B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/credentials/provider/t;", "Landroidx/credentials/provider/p;", "", "requestJson", "Landroidx/credentials/provider/a0;", "callingAppInfo", "Landroid/os/Bundle;", "candidateQueryData", "", "clientDataHash", "<init>", "(Ljava/lang/String;Landroidx/credentials/provider/a0;Landroid/os/Bundle;[B)V", "Lkotlin/k2;", "i", "(Landroid/os/Bundle;Ljava/lang/String;)V", "e", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "f", "[B", "g", "()[B", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t extends p {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String requestJson;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final byte[] clientDataHash;

    /* compiled from: BeginCreatePublicKeyCredentialRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/t$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "Landroidx/credentials/provider/a0;", "callingAppInfo", "Landroidx/credentials/provider/t;", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/a0;)Landroidx/credentials/provider/t;", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.t$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        @androidx.annotation.m1
        public final t a(@fg.l Bundle data, @fg.m a0 callingAppInfo) {
            kotlin.jvm.internal.l0.p(data, "data");
            return b(data, callingAppInfo);
        }

        @fg.l
        public final t b(@fg.l Bundle data, @fg.m a0 callingAppInfo) {
            kotlin.jvm.internal.l0.p(data, "data");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                kotlin.jvm.internal.l0.m(string);
                return new t(string, callingAppInfo, data, byteArray);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public t(@fg.l String requestJson, @fg.m a0 a0Var, @fg.l Bundle candidateQueryData) {
        this(requestJson, a0Var, candidateQueryData, null, 8, null);
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
    }

    @fg.l
    @kd.n
    @androidx.annotation.m1
    public static final t f(@fg.l Bundle bundle, @fg.m a0 a0Var) {
        return INSTANCE.a(bundle, a0Var);
    }

    private final void i(Bundle candidateQueryData, String requestJson) {
        candidateQueryData.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
    }

    @fg.m
    /* renamed from: g, reason: from getter */
    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final String getRequestJson() {
        return this.requestJson;
    }

    public /* synthetic */ t(String str, a0 a0Var, Bundle bundle, byte[] bArr, int i4, kotlin.jvm.internal.w wVar) {
        this(str, a0Var, bundle, (i4 & 8) != 0 ? null : bArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kd.j
    public t(@fg.l String requestJson, @fg.m a0 a0Var, @fg.l Bundle candidateQueryData, @fg.m byte[] bArr) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", candidateQueryData, a0Var);
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        this.requestJson = requestJson;
        this.clientDataHash = bArr;
        if (androidx.credentials.provider.utils.p1.INSTANCE.a(requestJson)) {
            i(candidateQueryData, requestJson);
            return;
        }
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}
