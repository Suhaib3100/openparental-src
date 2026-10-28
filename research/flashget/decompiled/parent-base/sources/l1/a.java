package l1;

import androidx.annotation.c1;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import l1.n;
import org.json.JSONObject;

/* compiled from: AuthenticatorAssertionResponse.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\"\u0010&\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010\u0017\"\u0004\b\u001b\u0010%R\"\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001a\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b \u0010(R\"\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001a\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b!\u0010(¨\u0006,"}, d2 = {"Ll1/a;", "Ll1/c;", "Ll1/k;", "requestOptions", "", "credentialId", "", "origin", "", "up", "uv", "be", "bs", "userHandle", "packageName", "clientDataHash", "<init>", "(Ll1/k;[BLjava/lang/String;ZZZZ[BLjava/lang/String;[B)V", "e", "()[B", "d", "Lorg/json/JSONObject;", "a", "()Lorg/json/JSONObject;", "Ll1/k;", "b", "[B", "c", "Ljava/lang/String;", "Z", "f", "g", "h", "i", "j", "k", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "clientJson", "l", "([B)V", "authenticatorData", "m", "signature", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k requestOptions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final byte[] credentialId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String origin;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean up;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean uv;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean be;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean bs;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private byte[] userHandle;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String packageName;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final byte[] clientDataHash;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private JSONObject clientJson;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private byte[] authenticatorData;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private byte[] signature;

    public a(@fg.l k requestOptions, @fg.l byte[] credentialId, @fg.l String origin, boolean z4, boolean z5, boolean z6, boolean z7, @fg.l byte[] userHandle, @fg.m String str, @fg.m byte[] bArr) {
        l0.p(requestOptions, "requestOptions");
        l0.p(credentialId, "credentialId");
        l0.p(origin, "origin");
        l0.p(userHandle, "userHandle");
        this.requestOptions = requestOptions;
        this.credentialId = credentialId;
        this.origin = origin;
        this.up = z4;
        this.uv = z5;
        this.be = z6;
        this.bs = z7;
        this.userHandle = userHandle;
        this.packageName = str;
        this.clientDataHash = bArr;
        JSONObject jSONObject = new JSONObject();
        this.clientJson = jSONObject;
        this.signature = new byte[0];
        jSONObject.put("type", "webauthn.get");
        this.clientJson.put("challenge", n.INSTANCE.c(requestOptions.getChallenge()));
        this.clientJson.put("origin", origin);
        if (str != null) {
            this.clientJson.put("androidPackageName", str);
        }
        this.authenticatorData = e();
    }

    @Override // l1.c
    @fg.l
    public JSONObject a() {
        String jSONObject = this.clientJson.toString();
        l0.o(jSONObject, "clientJson.toString()");
        byte[] bytes = jSONObject.getBytes(kotlin.text.f.UTF_8);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        JSONObject jSONObject2 = new JSONObject();
        if (this.clientDataHash == null) {
            jSONObject2.put("clientDataJSON", n.INSTANCE.c(bytes));
        }
        n.Companion companion = n.INSTANCE;
        jSONObject2.put("authenticatorData", companion.c(this.authenticatorData));
        jSONObject2.put("signature", companion.c(this.signature));
        jSONObject2.put("userHandle", companion.c(this.userHandle));
        return jSONObject2;
    }

    @Override // l1.c
    @fg.l
    /* renamed from: b, reason: from getter */
    public JSONObject getClientJson() {
        return this.clientJson;
    }

    @Override // l1.c
    public void c(@fg.l JSONObject jSONObject) {
        l0.p(jSONObject, "<set-?>");
        this.clientJson = jSONObject;
    }

    @fg.l
    public final byte[] d() {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bArr = this.clientDataHash;
        if (bArr == null) {
            String jSONObject = this.clientJson.toString();
            l0.o(jSONObject, "clientJson.toString()");
            byte[] bytes = jSONObject.getBytes(kotlin.text.f.UTF_8);
            l0.o(bytes, "this as java.lang.String).getBytes(charset)");
            bArr = messageDigest.digest(bytes);
            l0.o(bArr, "md.digest(clientJson.toString().toByteArray())");
        }
        return kotlin.collections.l.g3(this.authenticatorData, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final byte[] e() {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = this.requestOptions.getRpId().getBytes(kotlin.text.f.UTF_8);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] rpHash = messageDigest.digest(bytes);
        boolean z4 = this.up;
        boolean z5 = z4;
        if (this.uv) {
            z5 = (z4 ? 1 : 0) | 4;
        }
        boolean z6 = z5;
        if (this.be) {
            z6 = (z5 ? 1 : 0) | '\b';
        }
        int i4 = z6;
        if (this.bs) {
            i4 = (z6 ? 1 : 0) | 16;
        }
        l0.o(rpHash, "rpHash");
        return kotlin.collections.l.g3(kotlin.collections.l.g3(rpHash, new byte[]{(byte) i4}), new byte[]{0, 0, 0, 0});
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final byte[] getAuthenticatorData() {
        return this.authenticatorData;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final byte[] getSignature() {
        return this.signature;
    }

    public final void h(@fg.l byte[] bArr) {
        l0.p(bArr, "<set-?>");
        this.authenticatorData = bArr;
    }

    public final void i(@fg.l byte[] bArr) {
        l0.p(bArr, "<set-?>");
        this.signature = bArr;
    }

    public /* synthetic */ a(k kVar, byte[] bArr, String str, boolean z4, boolean z5, boolean z6, boolean z7, byte[] bArr2, String str2, byte[] bArr3, int i4, w wVar) {
        this(kVar, bArr, str, z4, z5, z6, z7, bArr2, (i4 & 256) != 0 ? null : str2, (i4 & 512) != 0 ? null : bArr3);
    }
}
