package cb;

import androidx.compose.runtime.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: WeekDay.kt */
@m1
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcb/i;", "Ljava/io/Serializable;", "Lorg/threeten/bp/g;", "date", "Lcb/j;", "position", "<init>", "(Lorg/threeten/bp/g;Lcb/j;)V", "a", "()Lorg/threeten/bp/g;", "b", "()Lcb/j;", "c", "(Lorg/threeten/bp/g;Lcb/j;)Lcb/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/threeten/bp/g;", "e", "Lcb/j;", "f", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class i implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final org.threeten.bp.g date;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final j position;

    public i(@l org.threeten.bp.g gVar, @l j jVar) {
        l0.p(gVar, ProtectedSandApp.s("\uf0e7"));
        l0.p(jVar, ProtectedSandApp.s("\uf0e8"));
        this.date = gVar;
        this.position = jVar;
    }

    public static /* synthetic */ i d(i iVar, org.threeten.bp.g gVar, j jVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = iVar.date;
        }
        if ((i4 & 2) != 0) {
            jVar = iVar.position;
        }
        return iVar.c(gVar, jVar);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final org.threeten.bp.g getDate() {
        return this.date;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final j getPosition() {
        return this.position;
    }

    @l
    public final i c(@l org.threeten.bp.g date, @l j position) {
        l0.p(date, ProtectedSandApp.s("\uf0e7"));
        l0.p(position, ProtectedSandApp.s("\uf0e8"));
        return new i(date, position);
    }

    @l
    public final org.threeten.bp.g e() {
        return this.date;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return l0.g(this.date, iVar.date) && this.position == iVar.position;
    }

    @l
    public final j f() {
        return this.position;
    }

    public int hashCode() {
        return this.position.hashCode() + (this.date.hashCode() * 31);
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("\uf0e9") + this.date + ProtectedSandApp.s("\uf0ea") + this.position + ProtectedSandApp.s("\uf0eb");
    }
}
