package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;

/* compiled from: BeginGetPublicKeyCredentialOption.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\r\u0018\u0000 \u00112\u00020\u0001:\u0001\u0013B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/credentials/provider/z;", "Landroidx/credentials/provider/u;", "Landroid/os/Bundle;", "candidateQueryData", "", "id", "requestJson", "", "clientDataHash", "<init>", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;[B)V", "e", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "f", "[B", "g", "()[B", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z extends u {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String requestJson;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final byte[] clientDataHash;

    /* compiled from: BeginGetPublicKeyCredentialOption.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/z$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "", "id", "Landroidx/credentials/provider/z;", "a", "(Landroid/os/Bundle;Ljava/lang/String;)Landroidx/credentials/provider/z;", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.z$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final z a(@fg.l Bundle data, @fg.l String id2) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlin.jvm.internal.l0.p(id2, "id");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                kotlin.jvm.internal.l0.m(string);
                return new z(data, id2, string, byteArray);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        @fg.l
        @kd.n
        public final z b(@fg.l Bundle data, @fg.l String id2) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlin.jvm.internal.l0.p(id2, "id");
            return new z(data, id2, "{\"dummy_key\":\"dummy_value\"}", null, 8, null);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public z(@fg.l Bundle candidateQueryData, @fg.l String id2, @fg.l String requestJson) {
        this(candidateQueryData, id2, requestJson, null, 8, null);
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(id2, "id");
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
    }

    @fg.l
    @kd.n
    public static final z e(@fg.l Bundle bundle, @fg.l String str) {
        return INSTANCE.a(bundle, str);
    }

    @fg.l
    @kd.n
    public static final z f(@fg.l Bundle bundle, @fg.l String str) {
        return INSTANCE.b(bundle, str);
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

    public /* synthetic */ z(Bundle bundle, String str, String str2, byte[] bArr, int i4, kotlin.jvm.internal.w wVar) {
        this(bundle, str, str2, (i4 & 8) != 0 ? null : bArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kd.j
    public z(@fg.l Bundle candidateQueryData, @fg.l String id2, @fg.l String requestJson, @fg.m byte[] bArr) {
        super(id2, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", candidateQueryData);
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(id2, "id");
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
        this.requestJson = requestJson;
        this.clientDataHash = bArr;
        if (!androidx.credentials.provider.utils.p1.INSTANCE.a(requestJson)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }
}
