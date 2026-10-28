package u0;

import androidx.compose.runtime.m1;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: Locale.kt */
@m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\n¨\u0006\u001c"}, d2 = {"Lu0/e;", "", "Lu0/g;", "platformLocale", "<init>", "(Lu0/g;)V", "", "languageTag", "(Ljava/lang/String;)V", "e", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "Lu0/g;", "b", "()Lu0/g;", "language", "d", "script", "c", "region", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    public static final int f92728c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final g platformLocale;

    /* compiled from: Locale.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lu0/e$a;", "", "<init>", "()V", "Lu0/e;", "a", "()Lu0/e;", "current", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.e$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final e a() {
            return i.a().b().f(0);
        }

        public Companion(w wVar) {
        }
    }

    public e(@l g gVar) {
        this.platformLocale = gVar;
    }

    @l
    public final String a() {
        return this.platformLocale.a();
    }

    @l
    /* renamed from: b, reason: from getter */
    public final g getPlatformLocale() {
        return this.platformLocale;
    }

    @l
    public final String c() {
        return this.platformLocale.getRegion();
    }

    @l
    public final String d() {
        return this.platformLocale.b();
    }

    @l
    public final String e() {
        return this.platformLocale.c();
    }

    public boolean equals(@m Object other) {
        if (other == null || !(other instanceof e)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return l0.g(this.platformLocale.c(), ((e) other).platformLocale.c());
    }

    public int hashCode() {
        return this.platformLocale.c().hashCode();
    }

    @l
    public String toString() {
        return this.platformLocale.c();
    }

    public e(@l String str) {
        this(i.a().a(str));
    }
}
