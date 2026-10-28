package androidx.credentials;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.credentials.b;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: CreatePublicKeyCredentialRequest.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00162\u00020\u0001:\u0001\u001bBS\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0011B?\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/credentials/h;", "Landroidx/credentials/b;", "", "requestJson", "", "clientDataHash", "", "isAutoSelectAllowed", "preferImmediatelyAvailableCredentials", "Landroidx/credentials/b$b;", "displayInfo", "origin", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "<init>", "(Ljava/lang/String;[BZZLandroidx/credentials/b$b;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V", "(Ljava/lang/String;[BZLjava/lang/String;Z)V", "preferDefaultProvider", "(Ljava/lang/String;[BZLjava/lang/String;Ljava/lang/String;Z)V", "l", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "m", "[B", "()[B", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends b {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String requestJson;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final byte[] clientDataHash;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    public static final String f27702p = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    public static final String f27703q = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST";

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    public static final String f27701o = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CreatePublicKeyCredentialRequest.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/credentials/h$a;", "", "<init>", "()V", "", "requestJson", "defaultProvider", "Landroidx/credentials/b$b;", "b", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/b$b;", "", "clientDataHash", "Landroid/os/Bundle;", "e", "(Ljava/lang/String;[B)Landroid/os/Bundle;", "d", "data", "origin", "candidateQueryData", "Landroidx/credentials/h;", "a", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/h;", "BUNDLE_KEY_CLIENT_DATA_HASH", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.h$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ b.C0444b c(Companion companion, String str, String str2, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                str2 = null;
            }
            return companion.b(str, str2);
        }

        public static /* synthetic */ Bundle f(Companion companion, String str, byte[] bArr, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                bArr = null;
            }
            return companion.e(str, bArr);
        }

        @fg.l
        @kd.n
        @androidx.annotation.x0(23)
        public final h a(@fg.l Bundle data, @fg.m String origin, @fg.l Bundle candidateQueryData) {
            b.C0444b c5;
            kotlin.jvm.internal.l0.p(data, "data");
            kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                kotlin.jvm.internal.l0.m(string);
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                boolean z4 = data.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
                try {
                    c5 = b.C0444b.INSTANCE.a(data);
                } catch (IllegalArgumentException unused) {
                    c5 = c(this, string, null, 2, null);
                }
                return new h(string, byteArray, data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), z4, c5, origin, data, candidateQueryData, null);
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }

        @fg.l
        @kd.n
        public final b.C0444b b(@fg.l String requestJson, @fg.m String defaultProvider) {
            kotlin.jvm.internal.l0.p(requestJson, "requestJson");
            try {
                JSONObject jSONObject = new JSONObject(requestJson).getJSONObject("user");
                String userName = jSONObject.getString("name");
                String string = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
                kotlin.jvm.internal.l0.o(userName, "userName");
                return new b.C0444b(userName, string, (Icon) null, defaultProvider);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.name must be defined in requestJson");
            }
        }

        @fg.l
        @kd.n
        public final Bundle d(@fg.l String requestJson, @fg.m byte[] clientDataHash) {
            kotlin.jvm.internal.l0.p(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        @fg.l
        @kd.n
        public final Bundle e(@fg.l String requestJson, @fg.m byte[] clientDataHash) {
            kotlin.jvm.internal.l0.p(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public h(@fg.l String requestJson) {
        this(requestJson, null, false, null, false, 30, null);
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
    }

    @fg.l
    @kd.n
    @androidx.annotation.x0(23)
    public static final h k(@fg.l Bundle bundle, @fg.m String str, @fg.l Bundle bundle2) {
        return INSTANCE.a(bundle, str, bundle2);
    }

    @fg.l
    @kd.n
    public static final b.C0444b m(@fg.l String str, @fg.m String str2) {
        return INSTANCE.b(str, str2);
    }

    @fg.l
    @kd.n
    public static final Bundle o(@fg.l String str, @fg.m byte[] bArr) {
        return INSTANCE.d(str, bArr);
    }

    @fg.l
    @kd.n
    public static final Bundle p(@fg.l String str, @fg.m byte[] bArr) {
        return INSTANCE.e(str, bArr);
    }

    @fg.m
    /* renamed from: l, reason: from getter */
    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final String getRequestJson() {
        return this.requestJson;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public h(@fg.l String requestJson, @fg.m byte[] bArr) {
        this(requestJson, bArr, false, null, false, 28, null);
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public h(@fg.l String requestJson, @fg.m byte[] bArr, boolean z4) {
        this(requestJson, bArr, z4, null, false, 24, null);
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public h(@fg.l String requestJson, @fg.m byte[] bArr, boolean z4, @fg.m String str) {
        this(requestJson, bArr, z4, str, false, 16, null);
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
    }

    public /* synthetic */ h(String str, byte[] bArr, boolean z4, boolean z5, b.C0444b c0444b, String str2, Bundle bundle, Bundle bundle2, kotlin.jvm.internal.w wVar) {
        this(str, bArr, z4, z5, c0444b, str2, bundle, bundle2);
    }

    /* synthetic */ h(String str, byte[] bArr, boolean z4, boolean z5, b.C0444b c0444b, String str2, Bundle bundle, Bundle bundle2, int i4, kotlin.jvm.internal.w wVar) {
        this(str, bArr, z4, z5, c0444b, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? INSTANCE.e(str, bArr) : bundle, (i4 & 128) != 0 ? INSTANCE.d(str, bArr) : bundle2);
    }

    private h(String str, byte[] bArr, boolean z4, boolean z5, b.C0444b c0444b, String str2, Bundle bundle, Bundle bundle2) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, z4, c0444b, str2, z5);
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (!j1.b.INSTANCE.a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    public /* synthetic */ h(String str, byte[] bArr, boolean z4, String str2, boolean z5, int i4, kotlin.jvm.internal.w wVar) {
        this(str, (i4 & 2) != 0 ? null : bArr, (i4 & 4) != 0 ? false : z4, (i4 & 8) != 0 ? null : str2, (i4 & 16) != 0 ? false : z5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public h(@fg.l String requestJson, @fg.m byte[] bArr, boolean z4, @fg.m String str, boolean z5) {
        this(requestJson, bArr, z5, z4, Companion.c(INSTANCE, requestJson, null, 2, null), str, null, null, 192, null);
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@fg.l String requestJson, @fg.m byte[] bArr, boolean z4, @fg.m String str, @fg.m String str2, boolean z5) {
        this(requestJson, bArr, z5, z4, INSTANCE.b(requestJson, str2), str, null, null, 192, null);
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
    }
}
