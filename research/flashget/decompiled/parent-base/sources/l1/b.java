package l1;

import androidx.annotation.c1;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AuthenticatorAttestationResponse.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\"\u0010&\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010\u0017\"\u0004\b\u001b\u0010%R\"\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001a\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010(¨\u0006*"}, d2 = {"Ll1/b;", "Ll1/c;", "Ll1/h;", "requestOptions", "", "credentialId", "credentialPublicKey", "", "origin", "", "up", "uv", "be", "bs", "packageName", "clientDataHash", "<init>", "(Ll1/h;[B[BLjava/lang/String;ZZZZLjava/lang/String;[B)V", "d", "()[B", "e", "Lorg/json/JSONObject;", "a", "()Lorg/json/JSONObject;", "Ll1/h;", "b", "[B", "c", "Ljava/lang/String;", "Z", "f", "g", "h", "i", "j", "k", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "clientJson", "l", "([B)V", "attestationObject", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h requestOptions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final byte[] credentialId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final byte[] credentialPublicKey;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String origin;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean up;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean uv;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean be;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean bs;

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
    private byte[] attestationObject;

    public b(@fg.l h requestOptions, @fg.l byte[] credentialId, @fg.l byte[] credentialPublicKey, @fg.l String origin, boolean z4, boolean z5, boolean z6, boolean z7, @fg.m String str, @fg.m byte[] bArr) {
        l0.p(requestOptions, "requestOptions");
        l0.p(credentialId, "credentialId");
        l0.p(credentialPublicKey, "credentialPublicKey");
        l0.p(origin, "origin");
        this.requestOptions = requestOptions;
        this.credentialId = credentialId;
        this.credentialPublicKey = credentialPublicKey;
        this.origin = origin;
        this.up = z4;
        this.uv = z5;
        this.be = z6;
        this.bs = z7;
        this.packageName = str;
        this.clientDataHash = bArr;
        JSONObject jSONObject = new JSONObject();
        this.clientJson = jSONObject;
        jSONObject.put("type", "webauthn.create");
        this.clientJson.put("challenge", n.INSTANCE.c(requestOptions.getChallenge()));
        this.clientJson.put("origin", origin);
        if (str != null) {
            this.clientJson.put("androidPackageName", str);
        }
        this.attestationObject = e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v7 */
    private final byte[] d() {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = this.requestOptions.getRp().e().getBytes(kotlin.text.f.UTF_8);
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
        ?? r5 = z6;
        if (this.bs) {
            r5 = (z6 ? 1 : 0) | 16;
        }
        int i4 = r5 | 64;
        byte[] bArr = new byte[16];
        for (int i5 = 0; i5 < 16; i5++) {
            bArr[i5] = 0;
        }
        byte[] bArr2 = this.credentialId;
        byte[] bArr3 = {(byte) (bArr2.length >> 8), (byte) bArr2.length};
        l0.o(rpHash, "rpHash");
        return kotlin.collections.l.g3(kotlin.collections.l.g3(kotlin.collections.l.g3(kotlin.collections.l.g3(kotlin.collections.l.g3(kotlin.collections.l.g3(rpHash, new byte[]{(byte) i4}), new byte[]{0, 0, 0, 0}), bArr), bArr3), this.credentialId), this.credentialPublicKey);
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
        jSONObject2.put("attestationObject", n.INSTANCE.c(this.attestationObject));
        jSONObject2.put("transports", new JSONArray((Collection) w.O("internal", "hybrid")));
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
    public final byte[] e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fmt", "none");
        linkedHashMap.put("attStmt", z0.z());
        linkedHashMap.put("authData", d());
        return new f().d(linkedHashMap);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final byte[] getAttestationObject() {
        return this.attestationObject;
    }

    public final void g(@fg.l byte[] bArr) {
        l0.p(bArr, "<set-?>");
        this.attestationObject = bArr;
    }

    public /* synthetic */ b(h hVar, byte[] bArr, byte[] bArr2, String str, boolean z4, boolean z5, boolean z6, boolean z7, String str2, byte[] bArr3, int i4, kotlin.jvm.internal.w wVar) {
        this(hVar, bArr, bArr2, str, z4, z5, z6, z7, (i4 & 256) != 0 ? null : str2, (i4 & 512) != 0 ? null : bArr3);
    }
}
