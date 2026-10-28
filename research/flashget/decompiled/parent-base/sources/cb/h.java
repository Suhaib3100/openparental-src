package cb;

import androidx.compose.runtime.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;

/* compiled from: Week.kt */
@m1
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcb/h;", "Ljava/io/Serializable;", "", "Lcb/i;", "days", "<init>", "(Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "()Ljava/util/List;", "b", "(Ljava/util/List;)Lcb/h;", "Ljava/util/List;", "d", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class h implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<i> days;

    public h(@l List<i> list) {
        l0.p(list, ProtectedSandApp.s("\uf0e2"));
        this.days = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h c(h hVar, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = hVar.days;
        }
        return hVar.b(list);
    }

    @l
    public final List<i> a() {
        return this.days;
    }

    @l
    public final h b(@l List<i> days) {
        l0.p(days, ProtectedSandApp.s("\uf0e2"));
        return new h(days);
    }

    @l
    public final List<i> d() {
        return this.days;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!l0.g(h.class, other != null ? other.getClass() : null)) {
            return false;
        }
        l0.n(other, ProtectedSandApp.s("\uf0e3"));
        h hVar = (h) other;
        return l0.g(w.B2(this.days), w.B2(hVar.days)) && l0.g(w.p3(this.days), w.p3(hVar.days));
    }

    public int hashCode() {
        return ((i) w.p3(this.days)).hashCode() + (((i) w.B2(this.days)).hashCode() * 31);
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("\uf0e4") + w.B2(this.days) + ProtectedSandApp.s("\uf0e5") + w.p3(this.days) + ProtectedSandApp.s("\uf0e6");
    }
}
