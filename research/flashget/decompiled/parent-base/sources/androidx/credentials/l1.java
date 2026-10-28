package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: GetPublicKeyCredentialOption.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aBC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/credentials/l1;", "Landroidx/credentials/o;", "", "requestJson", "", "clientDataHash", "", "Landroid/content/ComponentName;", "allowedProviders", "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "typePriorityCategory", "<init>", "(Ljava/lang/String;[BLjava/util/Set;Landroid/os/Bundle;Landroid/os/Bundle;I)V", "(Ljava/lang/String;[BLjava/util/Set;)V", "o", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "p", "[B", "j", "()[B", "q", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l1 extends o {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String requestJson;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final byte[] clientDataHash;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    public static final String f27743r = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    public static final String f27744s = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    public static final String f27745t = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION";

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: GetPublicKeyCredentialOption.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/credentials/l1$a;", "", "<init>", "()V", "", "requestJson", "", "clientDataHash", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;[B)Landroid/os/Bundle;", "data", "", "Landroid/content/ComponentName;", "allowedProviders", "candidateQueryData", "Landroidx/credentials/l1;", "a", "(Landroid/os/Bundle;Ljava/util/Set;Landroid/os/Bundle;)Landroidx/credentials/l1;", "BUNDLE_KEY_CLIENT_DATA_HASH", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.l1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final l1 a(@fg.l Bundle data, @fg.l Set<ComponentName> allowedProviders, @fg.l Bundle candidateQueryData) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlin.jvm.internal.l0.p(allowedProviders, "allowedProviders");
            kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                kotlin.jvm.internal.l0.m(string);
                return new l1(string, byteArray, allowedProviders, data, candidateQueryData, data.getInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100), null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        @fg.l
        @kd.n
        public final Bundle b(@fg.l String requestJson, @fg.m byte[] clientDataHash) {
            kotlin.jvm.internal.l0.p(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public l1(@fg.l String requestJson) {
        this(requestJson, null, null, 6, null);
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
    }

    @fg.l
    @kd.n
    public static final l1 i(@fg.l Bundle bundle, @fg.l Set<ComponentName> set, @fg.l Bundle bundle2) {
        return INSTANCE.a(bundle, set, bundle2);
    }

    @fg.l
    @kd.n
    public static final Bundle l(@fg.l String str, @fg.m byte[] bArr) {
        return INSTANCE.b(str, bArr);
    }

    @fg.m
    /* renamed from: j, reason: from getter */
    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final String getRequestJson() {
        return this.requestJson;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public l1(@fg.l String requestJson, @fg.m byte[] bArr) {
        this(requestJson, bArr, null, 4, null);
        kotlin.jvm.internal.l0.p(requestJson, "requestJson");
    }

    public /* synthetic */ l1(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i4, kotlin.jvm.internal.w wVar) {
        this(str, bArr, set, bundle, bundle2, i4);
    }

    public l1(String str, byte[] bArr, Set set, int i4, kotlin.jvm.internal.w wVar) {
        this(str, (i4 & 2) != 0 ? null : bArr, (i4 & 4) != 0 ? kotlin.collections.l0.f74939b : set);
    }

    /* synthetic */ l1(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i4, int i5, kotlin.jvm.internal.w wVar) {
        this(str, bArr, set, bundle, bundle2, (i5 & 32) != 0 ? 100 : i4);
    }

    private l1(String str, byte[] bArr, Set<ComponentName> set, Bundle bundle, Bundle bundle2, int i4) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, true, set, i4);
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (!j1.b.INSTANCE.a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kd.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l1(@fg.l java.lang.String r11, @fg.m byte[] r12, @fg.l java.util.Set<android.content.ComponentName> r13) {
        /*
            r10 = this;
            java.lang.String r0 = "requestJson"
            kotlin.jvm.internal.l0.p(r11, r0)
            java.lang.String r0 = "allowedProviders"
            kotlin.jvm.internal.l0.p(r13, r0)
            androidx.credentials.l1$a r0 = androidx.credentials.l1.INSTANCE
            android.os.Bundle r5 = r0.b(r11, r12)
            android.os.Bundle r6 = r0.b(r11, r12)
            r8 = 32
            r9 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.l1.<init>(java.lang.String, byte[], java.util.Set):void");
    }
}
