package l1;

import androidx.annotation.c1;
import androidx.compose.animation.d1;
import androidx.compose.foundation.layout.f3;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: FidoDataTypes.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b¨\u0006\u001f"}, d2 = {"Ll1/d;", "", "", "authenticatorAttachment", "residentKey", "", "requireResidentKey", "userVerification", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "c", "()Z", "d", "e", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ll1/d;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "i", "Z", "h", "j", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String authenticatorAttachment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String residentKey;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean requireResidentKey;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String userVerification;

    public d(@fg.l String authenticatorAttachment, @fg.l String residentKey, boolean z4, @fg.l String userVerification) {
        l0.p(authenticatorAttachment, "authenticatorAttachment");
        l0.p(residentKey, "residentKey");
        l0.p(userVerification, "userVerification");
        this.authenticatorAttachment = authenticatorAttachment;
        this.residentKey = residentKey;
        this.requireResidentKey = z4;
        this.userVerification = userVerification;
    }

    public static /* synthetic */ d f(d dVar, String str, String str2, boolean z4, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = dVar.authenticatorAttachment;
        }
        if ((i4 & 2) != 0) {
            str2 = dVar.residentKey;
        }
        if ((i4 & 4) != 0) {
            z4 = dVar.requireResidentKey;
        }
        if ((i4 & 8) != 0) {
            str3 = dVar.userVerification;
        }
        return dVar.e(str, str2, z4, str3);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final String getResidentKey() {
        return this.residentKey;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getRequireResidentKey() {
        return this.requireResidentKey;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final String getUserVerification() {
        return this.userVerification;
    }

    @fg.l
    public final d e(@fg.l String authenticatorAttachment, @fg.l String residentKey, boolean requireResidentKey, @fg.l String userVerification) {
        l0.p(authenticatorAttachment, "authenticatorAttachment");
        l0.p(residentKey, "residentKey");
        l0.p(userVerification, "userVerification");
        return new d(authenticatorAttachment, residentKey, requireResidentKey, userVerification);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return l0.g(this.authenticatorAttachment, dVar.authenticatorAttachment) && l0.g(this.residentKey, dVar.residentKey) && this.requireResidentKey == dVar.requireResidentKey && l0.g(this.userVerification, dVar.userVerification);
    }

    @fg.l
    public final String g() {
        return this.authenticatorAttachment;
    }

    public final boolean h() {
        return this.requireResidentKey;
    }

    public int hashCode() {
        return this.userVerification.hashCode() + d1.a(this.requireResidentKey, androidx.compose.foundation.text.modifiers.n.a(this.residentKey, this.authenticatorAttachment.hashCode() * 31, 31), 31);
    }

    @fg.l
    public final String i() {
        return this.residentKey;
    }

    @fg.l
    public final String j() {
        return this.userVerification;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("AuthenticatorSelectionCriteria(authenticatorAttachment=");
        sb.append(this.authenticatorAttachment);
        sb.append(", residentKey=");
        sb.append(this.residentKey);
        sb.append(", requireResidentKey=");
        sb.append(this.requireResidentKey);
        sb.append(", userVerification=");
        return f3.a(sb, this.userVerification, ')');
    }

    public /* synthetic */ d(String str, String str2, boolean z4, String str3, int i4, w wVar) {
        this(str, str2, (i4 & 4) != 0 ? false : z4, (i4 & 8) != 0 ? "preferred" : str3);
    }
}
