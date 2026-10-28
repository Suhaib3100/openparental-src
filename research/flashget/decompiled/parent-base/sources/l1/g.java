package l1;

import androidx.annotation.c1;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import org.json.JSONObject;

/* compiled from: FidoPublicKeyCredential.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\f\u0010\u000b¨\u0006\u0014"}, d2 = {"Ll1/g;", "", "", "rawId", "Ll1/c;", "response", "", "authenticatorAttachment", "<init>", "([BLl1/c;Ljava/lang/String;)V", "d", "()Ljava/lang/String;", "a", "[B", "b", "()[B", "Ll1/c;", "c", "()Ll1/c;", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final byte[] rawId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c response;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String authenticatorAttachment;

    public g(@fg.l byte[] rawId, @fg.l c response, @fg.l String authenticatorAttachment) {
        l0.p(rawId, "rawId");
        l0.p(response, "response");
        l0.p(authenticatorAttachment, "authenticatorAttachment");
        this.rawId = rawId;
        this.response = response;
        this.authenticatorAttachment = authenticatorAttachment;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final byte[] getRawId() {
        return this.rawId;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final c getResponse() {
        return this.response;
    }

    @fg.l
    public final String d() {
        String c5 = n.INSTANCE.c(this.rawId);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", c5);
        jSONObject.put("rawId", c5);
        jSONObject.put("type", "public-key");
        jSONObject.put("authenticatorAttachment", this.authenticatorAttachment);
        jSONObject.put("response", this.response.a());
        jSONObject.put("clientExtensionResults", new JSONObject());
        String jSONObject2 = jSONObject.toString();
        l0.o(jSONObject2, "ret.toString()");
        return jSONObject2;
    }
}
