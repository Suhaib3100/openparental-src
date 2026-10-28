package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: CalendarModel.kt */
@f5
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001a\u0010\t¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/q3;", "", "", "patternWithDelimiters", "", "delimiter", "<init>", "(Ljava/lang/String;C)V", "a", "()Ljava/lang/String;", "b", "()C", "c", "(Ljava/lang/String;C)Landroidx/compose/material3/q3;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "C", "e", "g", "patternWithoutDelimiters", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class q3 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f13645d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String patternWithDelimiters;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final char delimiter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String patternWithoutDelimiters;

    public q3(@fg.l String str, char c5) {
        this.patternWithDelimiters = str;
        this.delimiter = c5;
        this.patternWithoutDelimiters = kotlin.text.v.i2(str, String.valueOf(c5), "", false, 4, null);
    }

    public static q3 d(q3 q3Var, String str, char c5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = q3Var.patternWithDelimiters;
        }
        if ((i4 & 2) != 0) {
            c5 = q3Var.delimiter;
        }
        q3Var.getClass();
        return new q3(str, c5);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    /* renamed from: b, reason: from getter */
    public final char getDelimiter() {
        return this.delimiter;
    }

    @fg.l
    public final q3 c(@fg.l String patternWithDelimiters, char delimiter) {
        return new q3(patternWithDelimiters, delimiter);
    }

    public final char e() {
        return this.delimiter;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) other;
        return kotlin.jvm.internal.l0.g(this.patternWithDelimiters, q3Var.patternWithDelimiters) && this.delimiter == q3Var.delimiter;
    }

    @fg.l
    public final String f() {
        return this.patternWithDelimiters;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final String getPatternWithoutDelimiters() {
        return this.patternWithoutDelimiters;
    }

    public int hashCode() {
        return Character.hashCode(this.delimiter) + (this.patternWithDelimiters.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.patternWithDelimiters + ", delimiter=" + this.delimiter + ')';
    }
}
