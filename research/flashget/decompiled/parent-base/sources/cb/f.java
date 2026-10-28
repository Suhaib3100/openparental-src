package cb;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import org.threeten.bp.q;
import org.threeten.bp.temporal.o;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t¢\u0006\u0004\b\u000b\u0010\f\"\u0015\u0010\u000f\u001a\u00020\t*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u0012\u001a\u00020\t*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0014\u001a\u00020\t*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lorg/threeten/bp/d;", "firstDayOfWeek", "", "c", "(Lorg/threeten/bp/d;)Ljava/util/List;", "Ljava/util/Locale;", "locale", "f", "(Ljava/util/Locale;)Lorg/threeten/bp/d;", "Lorg/threeten/bp/q;", "Lorg/threeten/bp/g;", "a", "(Lorg/threeten/bp/q;)Lorg/threeten/bp/g;", "j", "(Lorg/threeten/bp/g;)Lorg/threeten/bp/q;", "yearMonth", "h", "(Lorg/threeten/bp/q;)Lorg/threeten/bp/q;", "nextMonth", "i", "previousMonth", "Calendar-View_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class f {

    /* compiled from: Extensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<org.threeten.bp.d> f38610a = kotlin.enums.c.c(org.threeten.bp.d.values());
    }

    @l
    public static final org.threeten.bp.g a(@l q qVar) {
        l0.p(qVar, ProtectedSandApp.s("\uf0d7"));
        org.threeten.bp.g l4 = qVar.l(1);
        l0.o(l4, ProtectedSandApp.s("\uf0d8"));
        return l4;
    }

    @l
    @kd.j
    public static final List<org.threeten.bp.d> b() {
        return d(null, 1, null);
    }

    @l
    @kd.j
    public static final List<org.threeten.bp.d> c(@l org.threeten.bp.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("\uf0d9"));
        int ordinal = 7 - dVar.ordinal();
        kotlin.enums.a<org.threeten.bp.d> aVar = a.f38610a;
        return w.D4(w.K5(aVar, ordinal), w.d2(aVar, ordinal));
    }

    public static /* synthetic */ List d(org.threeten.bp.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            dVar = g(null, 1, null);
        }
        return c(dVar);
    }

    @l
    @kd.j
    public static final org.threeten.bp.d e() {
        return g(null, 1, null);
    }

    @l
    @kd.j
    public static final org.threeten.bp.d f(@l Locale locale) {
        l0.p(locale, ProtectedSandApp.s("\uf0da"));
        org.threeten.bp.d c5 = o.e(locale).c();
        l0.o(c5, ProtectedSandApp.s("\uf0db"));
        return c5;
    }

    public static /* synthetic */ org.threeten.bp.d g(Locale locale, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            locale = Locale.getDefault();
            l0.o(locale, ProtectedSandApp.s("\uf0dc"));
        }
        return f(locale);
    }

    @l
    public static final q h(@l q qVar) {
        l0.p(qVar, ProtectedSandApp.s("\uf0d7"));
        q V = qVar.V(1L);
        l0.o(V, ProtectedSandApp.s("\uf0dd"));
        return V;
    }

    @l
    public static final q i(@l q qVar) {
        l0.p(qVar, ProtectedSandApp.s("\uf0d7"));
        q E = qVar.E(1L);
        l0.o(E, ProtectedSandApp.s("\uf0de"));
        return E;
    }

    @l
    public static final q j(@l org.threeten.bp.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("\uf0d7"));
        q P = q.P(gVar.i0(), gVar.f0());
        l0.o(P, ProtectedSandApp.s("\uf0df"));
        return P;
    }
}
