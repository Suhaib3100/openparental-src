package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.a0;
import androidx.compose.ui.text.b0;
import androidx.compose.ui.text.e;
import androidx.compose.ui.unit.b0;
import androidx.compose.ui.unit.z;
import androidx.emoji2.text.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import s0.j;

/* compiled from: PlaceholderExtensions.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0015\u001a\u00020\u000b*\u00020\u00108BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u001b\u001a\u00020\u000b*\u00020\u00168BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroid/text/Spannable;", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "Landroidx/compose/ui/unit/d;", "density", "Lkotlin/k2;", "f", "(Landroid/text/Spannable;Ljava/util/List;Landroidx/compose/ui/unit/d;)V", "placeholder", "", "start", "end", "e", "(Landroid/text/Spannable;Landroidx/compose/ui/text/a0;IILandroidx/compose/ui/unit/d;)V", "Landroidx/compose/ui/unit/z;", "a", "(J)I", "b", "(J)V", "spanUnit", "Landroidx/compose/ui/text/b0;", "c", "(I)I", "d", "(I)V", "spanVerticalAlign", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n33#2,6:94\n13579#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
/* loaded from: classes.dex */
public final class c {
    private static final int a(long j4) {
        long m4 = z.m(j4);
        b0.Companion companion = b0.INSTANCE;
        companion.getClass();
        if (b0.g(m4, b0.f21487d)) {
            return 0;
        }
        companion.getClass();
        return b0.g(m4, b0.f21488e) ? 1 : 2;
    }

    private static /* synthetic */ void b(long j4) {
    }

    private static final int c(int i4) {
        b0.Companion companion = androidx.compose.ui.text.b0.INSTANCE;
        companion.getClass();
        if (androidx.compose.ui.text.b0.k(i4, androidx.compose.ui.text.b0.f20596c)) {
            return 0;
        }
        companion.getClass();
        if (androidx.compose.ui.text.b0.k(i4, androidx.compose.ui.text.b0.f20597d)) {
            return 1;
        }
        companion.getClass();
        if (androidx.compose.ui.text.b0.k(i4, androidx.compose.ui.text.b0.f20598e)) {
            return 2;
        }
        companion.getClass();
        if (androidx.compose.ui.text.b0.k(i4, androidx.compose.ui.text.b0.f20599f)) {
            return 3;
        }
        companion.getClass();
        if (androidx.compose.ui.text.b0.k(i4, androidx.compose.ui.text.b0.f20600g)) {
            return 4;
        }
        companion.getClass();
        if (androidx.compose.ui.text.b0.k(i4, androidx.compose.ui.text.b0.f20601h)) {
            return 5;
        }
        companion.getClass();
        if (androidx.compose.ui.text.b0.k(i4, androidx.compose.ui.text.b0.f20602i)) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    private static /* synthetic */ void d(int i4) {
    }

    private static final void e(Spannable spannable, a0 a0Var, int i4, int i5, androidx.compose.ui.unit.d dVar) {
        for (Object obj : spannable.getSpans(i4, i5, l.class)) {
            spannable.removeSpan((l) obj);
        }
        d.u(spannable, new j(z.n(a0Var.getWidth()), a(a0Var.getWidth()), z.n(a0Var.getHeight()), a(a0Var.getHeight()), dVar.getDensity() * dVar.getFontScale(), c(a0Var.getPlaceholderVerticalAlign())), i4, i5);
    }

    public static final void f(@fg.l Spannable spannable, @fg.l List<e.b<a0>> list, @fg.l androidx.compose.ui.unit.d dVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            e.b<a0> bVar = list.get(i4);
            e(spannable, bVar.a(), bVar.getStart(), bVar.getEnd(), dVar);
        }
    }
}
