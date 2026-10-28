package l1;

import androidx.annotation.c1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import l1.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PublicKeyCredentialCreationOptions.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0019\u0010!\"\u0004\b+\u0010,R\"\u00103\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010/\u001a\u0004\b\r\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00104\u001a\u0004\b\u0007\u00105\"\u0004\b6\u0010\u0005¨\u00068"}, d2 = {"Ll1/h;", "", "", "requestJson", "<init>", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "a", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "json", "Ll1/l;", "b", "Ll1/l;", "g", "()Ll1/l;", "rp", "Ll1/m;", "c", "Ll1/m;", "i", "()Ll1/m;", "user", "", "d", "[B", "()[B", "challenge", "", "Ll1/j;", "Ljava/util/List;", "f", "()Ljava/util/List;", "pubKeyCredParams", "", "J", "h", "()J", "m", "(J)V", "timeout", "Ll1/i;", "l", "(Ljava/util/List;)V", "excludeCredentials", "Ll1/d;", "Ll1/d;", "()Ll1/d;", "k", "(Ll1/d;)V", "authenticatorSelection", "Ljava/lang/String;", "()Ljava/lang/String;", "j", "attestation", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final JSONObject json;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l rp;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m user;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final byte[] challenge;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<j> pubKeyCredParams;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long timeout;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<i> excludeCredentials;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private d authenticatorSelection;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private String attestation;

    public h(@fg.l String requestJson) {
        l0.p(requestJson, "requestJson");
        JSONObject jSONObject = new JSONObject(requestJson);
        this.json = jSONObject;
        String challengeString = jSONObject.getString("challenge");
        n.Companion companion = n.INSTANCE;
        l0.o(challengeString, "challengeString");
        this.challenge = companion.b(challengeString);
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String string = jSONObject2.getString("name");
        l0.o(string, "rpJson.getString(\"name\")");
        String string2 = jSONObject2.getString("id");
        l0.o(string2, "rpJson.getString(\"id\")");
        this.rp = new l(string, string2);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        String string3 = jSONObject3.getString("id");
        l0.o(string3, "rpUser.getString(\"id\")");
        byte[] b5 = companion.b(string3);
        String string4 = jSONObject3.getString("name");
        l0.o(string4, "rpUser.getString(\"name\")");
        String string5 = jSONObject3.getString("displayName");
        l0.o(string5, "rpUser.getString(\"displayName\")");
        this.user = new m(string4, b5, string5);
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
            String string6 = jSONObject4.getString("type");
            l0.o(string6, "e.getString(\"type\")");
            arrayList.add(new j(string6, jSONObject4.getLong("alg")));
        }
        List<j> V5 = w.V5(arrayList);
        this.pubKeyCredParams = V5;
        this.timeout = this.json.optLong("timeout", 0L);
        this.excludeCredentials = j0.f74919b;
        this.authenticatorSelection = new d("platform", "required", false, null, 12, null);
        String optString = this.json.optString("attestation", "none");
        l0.o(optString, "json.optString(\"attestation\", \"none\")");
        this.attestation = optString;
        Objects.toString(this.rp);
        Objects.toString(this.user);
        Objects.toString(V5);
        Objects.toString(this.excludeCredentials);
        Objects.toString(this.authenticatorSelection);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getAttestation() {
        return this.attestation;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final d getAuthenticatorSelection() {
        return this.authenticatorSelection;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final byte[] getChallenge() {
        return this.challenge;
    }

    @fg.l
    public final List<i> d() {
        return this.excludeCredentials;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final JSONObject getJson() {
        return this.json;
    }

    @fg.l
    public final List<j> f() {
        return this.pubKeyCredParams;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final l getRp() {
        return this.rp;
    }

    /* renamed from: h, reason: from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final m getUser() {
        return this.user;
    }

    public final void j(@fg.l String str) {
        l0.p(str, "<set-?>");
        this.attestation = str;
    }

    public final void k(@fg.l d dVar) {
        l0.p(dVar, "<set-?>");
        this.authenticatorSelection = dVar;
    }

    public final void l(@fg.l List<i> list) {
        l0.p(list, "<set-?>");
        this.excludeCredentials = list;
    }

    public final void m(long j4) {
        this.timeout = j4;
    }
}
