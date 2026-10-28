package androidx.compose.ui.text.android;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextLayout.kt */
@kd.g
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/android/i1;", "", "", "packedValue", "b", "(J)J", "", "h", "(J)Ljava/lang/String;", "", "g", "(J)I", "other", "", "c", "(JLjava/lang/Object;)Z", "a", "J", "f", "topPadding", "e", "bottomPadding", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n+ 2 InlineClassUtils.kt\nandroidx/compose/ui/text/android/InlineClassUtilsKt\n*L\n1#1,1031:1\n32#2:1032\n39#2:1033\n*S KotlinDebug\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n*L\n890#1:1032\n893#1:1033\n*E\n"})
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    private /* synthetic */ i1(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ i1 a(long j4) {
        return new i1(j4);
    }

    public static long b(long j4) {
        return j4;
    }

    public static boolean c(long j4, Object obj) {
        return (obj instanceof i1) && j4 == ((i1) obj).packedValue;
    }

    public static final boolean d(long j4, long j5) {
        return j4 == j5;
    }

    public static final int e(long j4) {
        return (int) (j4 & 4294967295L);
    }

    public static final int f(long j4) {
        return (int) (j4 >> 32);
    }

    public static int g(long j4) {
        return Long.hashCode(j4);
    }

    public static String h(long j4) {
        return "VerticalPaddings(packedValue=" + j4 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.packedValue, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    /* renamed from: i, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return h(this.packedValue);
    }
}
