package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: KotlinVersion.kt */
@c1(version = "1.1")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006 "}, d2 = {"Lkotlin/y;", "", "", "major", "minor", "patch", "<init>", "(III)V", "(II)V", "g", "(III)I", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "(Lkotlin/y;)I", "e", "(II)Z", "f", "(III)Z", "b", "I", "c", "d", "version", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class y implements Comparable<y> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f79242g = 255;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int major;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int patch;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final y f79243h = z.a();

    public y(int i4, int i5, int i6) {
        this.major = i4;
        this.minor = i5;
        this.patch = i6;
        this.version = g(i4, i5, i6);
    }

    private final int g(int major, int minor, int patch) {
        if (new kotlin.ranges.l(0, 255, 1).r(major) && new kotlin.ranges.l(0, 255, 1).r(minor) && new kotlin.ranges.l(0, 255, 1).r(patch)) {
            return (major << 16) + (minor << 8) + patch;
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("蕳\u0001") + major + '.' + minor + '.' + patch).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@fg.l y other) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("蕴\u0001"));
        return this.version - other.version;
    }

    /* renamed from: b, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    /* renamed from: c, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    /* renamed from: d, reason: from getter */
    public final int getPatch() {
        return this.patch;
    }

    public final boolean e(int major, int minor) {
        int i4 = this.major;
        return i4 > major || (i4 == major && this.minor >= minor);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        y yVar = other instanceof y ? (y) other : null;
        return yVar != null && this.version == yVar.version;
    }

    public final boolean f(int major, int minor, int patch) {
        int i4;
        int i5 = this.major;
        return i5 > major || (i5 == major && ((i4 = this.minor) > minor || (i4 == minor && this.patch >= patch)));
    }

    /* renamed from: hashCode, reason: from getter */
    public int getVersion() {
        return this.version;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    public y(int i4, int i5) {
        this(i4, i5, 0);
    }
}
