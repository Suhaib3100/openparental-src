package androidx.compose.ui.text.style;

import androidx.compose.foundation.layout.f3;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: TextDecoration.kt */
@m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/k;", "", "", "mask", "<init>", "(I)V", "decoration", "f", "(Landroidx/compose/ui/text/style/k;)Landroidx/compose/ui/text/style/k;", "other", "", "d", "(Landroidx/compose/ui/text/style/k;)Z", "", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "e", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21363c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final k f21364d = new k(0);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final k f21365e = new k(1);

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final k f21366f = new k(2);

    /* compiled from: TextDecoration.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/k$a;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/style/k;", "decorations", "a", "(Ljava/util/List;)Landroidx/compose/ui/text/style/k;", "None", "Landroidx/compose/ui/text/style/k;", "d", "()Landroidx/compose/ui/text/style/k;", "e", "Underline", "f", "g", "LineThrough", "b", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,111:1\n256#2,3:112\n33#2,4:115\n259#2,2:119\n38#2:121\n261#2:122\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n57#1:112,3\n57#1:115,4\n57#1:119,2\n57#1:121\n57#1:122\n*E\n"})
    /* renamed from: androidx.compose.ui.text.style.k$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void c() {
        }

        @x4
        public static /* synthetic */ void e() {
        }

        @x4
        public static /* synthetic */ void g() {
        }

        @fg.l
        public final k a(@fg.l List<k> decorations) {
            Integer num = 0;
            int size = decorations.size();
            for (int i4 = 0; i4 < size; i4++) {
                num = Integer.valueOf(num.intValue() | decorations.get(i4).getMask());
            }
            return new k(num.intValue());
        }

        @fg.l
        public final k b() {
            return k.f21366f;
        }

        @fg.l
        public final k d() {
            return k.f21364d;
        }

        @fg.l
        public final k f() {
            return k.f21365e;
        }

        public Companion(w wVar) {
        }
    }

    public k(int i4) {
        this.mask = i4;
    }

    public final boolean d(@fg.l k other) {
        int i4 = this.mask;
        return (other.mask | i4) == i4;
    }

    /* renamed from: e, reason: from getter */
    public final int getMask() {
        return this.mask;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof k) && this.mask == ((k) other).mask;
    }

    @fg.l
    public final k f(@fg.l k decoration) {
        return new k(decoration.mask | this.mask);
    }

    public int hashCode() {
        return this.mask;
    }

    @fg.l
    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & f21365e.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & f21366f.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return f3.a(new StringBuilder("TextDecoration["), androidx.compose.ui.util.c.q(arrayList, ", ", null, null, 0, null, null, 62, null), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
