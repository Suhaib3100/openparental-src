package l1;

import androidx.annotation.c1;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import l1.n;
import org.json.JSONObject;

/* compiled from: PublicKeyCredentialRequestOptions.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"Ll1/k;", "", "", "requestJson", "<init>", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "a", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "json", "", "[B", "()[B", "challenge", "", "c", "J", "d", "()J", "timeout", "Ljava/lang/String;", "()Ljava/lang/String;", "rpId", "e", "userVerification", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final JSONObject json;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final byte[] challenge;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long timeout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String rpId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String userVerification;

    public k(@fg.l String requestJson) {
        l0.p(requestJson, "requestJson");
        JSONObject jSONObject = new JSONObject(requestJson);
        this.json = jSONObject;
        String challengeString = jSONObject.getString("challenge");
        n.Companion companion = n.INSTANCE;
        l0.o(challengeString, "challengeString");
        this.challenge = companion.b(challengeString);
        this.timeout = jSONObject.optLong("timeout", 0L);
        String optString = jSONObject.optString("rpId", "");
        l0.o(optString, "json.optString(\"rpId\", \"\")");
        this.rpId = optString;
        String optString2 = jSONObject.optString("userVerification", "preferred");
        l0.o(optString2, "json.optString(\"userVerification\", \"preferred\")");
        this.userVerification = optString2;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final byte[] getChallenge() {
        return this.challenge;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final JSONObject getJson() {
        return this.json;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final String getRpId() {
        return this.rpId;
    }

    /* renamed from: d, reason: from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final String getUserVerification() {
        return this.userVerification;
    }
}
