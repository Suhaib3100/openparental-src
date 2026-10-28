package cb;

import androidx.compose.runtime.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CalendarDay.kt */
@m1
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcb/a;", "Ljava/io/Serializable;", "Lorg/threeten/bp/g;", "date", "Lcb/d;", "position", "<init>", "(Lorg/threeten/bp/g;Lcb/d;)V", "a", "()Lorg/threeten/bp/g;", "b", "()Lcb/d;", "c", "(Lorg/threeten/bp/g;Lcb/d;)Lcb/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/threeten/bp/g;", "e", "Lcb/d;", "f", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class a implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final org.threeten.bp.g date;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final d position;

    public a(@l org.threeten.bp.g gVar, @l d dVar) {
        l0.p(gVar, ProtectedSandApp.s("\uf0c1"));
        l0.p(dVar, ProtectedSandApp.s("\uf0c2"));
        this.date = gVar;
        this.position = dVar;
    }

    public static /* synthetic */ a d(a aVar, org.threeten.bp.g gVar, d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = aVar.date;
        }
        if ((i4 & 2) != 0) {
            dVar = aVar.position;
        }
        return aVar.c(gVar, dVar);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final org.threeten.bp.g getDate() {
        return this.date;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final d getPosition() {
        return this.position;
    }

    @l
    public final a c(@l org.threeten.bp.g date, @l d position) {
        l0.p(date, ProtectedSandApp.s("\uf0c1"));
        l0.p(position, ProtectedSandApp.s("\uf0c2"));
        return new a(date, position);
    }

    @l
    public final org.threeten.bp.g e() {
        return this.date;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return l0.g(this.date, aVar.date) && this.position == aVar.position;
    }

    @l
    public final d f() {
        return this.position;
    }

    public int hashCode() {
        return this.position.hashCode() + (this.date.hashCode() * 31);
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("\uf0c3") + this.date + ProtectedSandApp.s("\uf0c4") + this.position + ProtectedSandApp.s("\uf0c5");
    }
}
