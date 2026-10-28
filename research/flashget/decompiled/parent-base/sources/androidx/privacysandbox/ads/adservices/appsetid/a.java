package androidx.privacysandbox.ads.adservices.appsetid;

import androidx.fragment.app.k0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: AppSetId.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/a;", "", "", "id", "", "scope", "<init>", "(Ljava/lang/String;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "I", "c", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAppSetId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetId.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f32575d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f32576e = 2;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int scope;

    public a(@l String id2, int i4) {
        l0.p(id2, "id");
        this.id = id2;
        this.scope = i4;
        if (i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final int getScope() {
        return this.scope;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return l0.g(this.id, aVar.id) && this.scope == aVar.scope;
    }

    public int hashCode() {
        return Integer.hashCode(this.scope) + (this.id.hashCode() * 31);
    }

    @l
    public String toString() {
        return k0.a(new StringBuilder("AppSetId: id="), this.id, ", scope=", this.scope == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
