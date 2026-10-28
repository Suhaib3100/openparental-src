package androidx.window.core;

import fg.l;
import fg.m;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kd.n;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.text.v;

/* compiled from: Version.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006$"}, d2 = {"Landroidx/window/core/i;", "", "", "major", "minor", "patch", "", "description", "<init>", "(IIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "other", "e", "(Landroidx/window/core/i;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "I", "h", "c", "i", "d", "j", "Ljava/lang/String;", "g", "Ljava/math/BigInteger;", "f", "Lkotlin/b0;", "()Ljava/math/BigInteger;", "bigInteger", "a", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements Comparable<i> {

    /* renamed from: j, reason: collision with root package name */
    @l
    private static final i f35706j;

    /* renamed from: k, reason: collision with root package name */
    @l
    private static final i f35707k;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int major;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int patch;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 bigInteger;

    /* renamed from: l, reason: collision with root package name */
    @l
    private static final String f35708l = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: h, reason: collision with root package name */
    @l
    private static final i f35704h = new i(0, 0, 0, "");

    /* renamed from: i, reason: collision with root package name */
    @l
    private static final i f35705i = new i(0, 1, 0, "");

    /* compiled from: Version.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/window/core/i$a;", "", "<init>", "()V", "", "versionString", "Landroidx/window/core/i;", "e", "(Ljava/lang/String;)Landroidx/window/core/i;", "UNKNOWN", "Landroidx/window/core/i;", "b", "()Landroidx/window/core/i;", "VERSION_0_1", "c", "VERSION_1_0", "d", "CURRENT", "a", "VERSION_PATTERN_STRING", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.window.core.i$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final i a() {
            return i.f35707k;
        }

        @l
        public final i b() {
            return i.f35704h;
        }

        @l
        public final i c() {
            return i.f35705i;
        }

        @l
        public final i d() {
            return i.f35706j;
        }

        @m
        @n
        public final i e(@m String versionString) {
            if (versionString == null || v.S1(versionString)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(versionString);
            if (!matcher.matches()) {
                return null;
            }
            String group = matcher.group(1);
            Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
            if (valueOf == null) {
                return null;
            }
            int intValue = valueOf.intValue();
            String group2 = matcher.group(2);
            Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
            if (valueOf2 == null) {
                return null;
            }
            int intValue2 = valueOf2.intValue();
            String group3 = matcher.group(3);
            Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
            if (valueOf3 == null) {
                return null;
            }
            int intValue3 = valueOf3.intValue();
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            l0.o(description, "description");
            return new i(intValue, intValue2, intValue3, description, null);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: Version.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "a", "()Ljava/math/BigInteger;"}, k = 3, mv = {1, 6, 0})
    static final class b extends n0 implements ld.a<BigInteger> {
        b() {
            super(0);
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(i.this.getMajor()).shiftLeft(32).or(BigInteger.valueOf(i.this.getMinor())).shiftLeft(32).or(BigInteger.valueOf(i.this.getPatch()));
        }
    }

    static {
        i iVar = new i(1, 0, 0, "");
        f35706j = iVar;
        f35707k = iVar;
    }

    public /* synthetic */ i(int i4, int i5, int i6, String str, w wVar) {
        this(i4, i5, i6, str);
    }

    private final BigInteger f() {
        Object value = this.bigInteger.getValue();
        l0.o(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @m
    @n
    public static final i k(@m String str) {
        return INSTANCE.e(str);
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(@l i other) {
        l0.p(other, "other");
        return f().compareTo(other.f());
    }

    public boolean equals(@m Object other) {
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return this.major == iVar.major && this.minor == iVar.minor && this.patch == iVar.patch;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: h, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    /* renamed from: i, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    /* renamed from: j, reason: from getter */
    public final int getPatch() {
        return this.patch;
    }

    @l
    public String toString() {
        String C = !v.S1(this.description) ? l0.C("-", this.description) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        return android.support.v4.media.b.a(sb, this.patch, C);
    }

    private i(int i4, int i5, int i6, String str) {
        this.major = i4;
        this.minor = i5;
        this.patch = i6;
        this.description = str;
        this.bigInteger = c0.c(new b());
    }
}
