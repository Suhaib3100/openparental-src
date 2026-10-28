package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text2.input.o;
import androidx.compose.foundation.z0;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: TextFieldBuffer.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0005*\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\r\u001aL\u0010\u0017\u001a\u00020\u0005*\u00020\u000f26\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00050\u0010H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0018\u001aL\u0010\u0019\u001a\u00020\u0005*\u00020\u000f26\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00050\u0010H\u0087\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u0082\u0001\u0010\u001b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2`\u0010!\u001a\\\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00050\u001cH\u0080\b¢\u0006\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text2/input/o;", "", "index", "", "text", "Lkotlin/k2;", "e", "(Landroidx/compose/foundation/text2/input/o;ILjava/lang/String;)V", "start", "end", "a", "(Landroidx/compose/foundation/text2/input/o;II)V", "f", "(Landroidx/compose/foundation/text2/input/o;)V", "g", "Landroidx/compose/foundation/text2/input/o$a;", "Lkotlin/Function2;", "Landroidx/compose/ui/text/t0;", "Lkotlin/r0;", "name", "range", "originalRange", "block", "c", "(Landroidx/compose/foundation/text2/input/o$a;Lld/p;)V", "d", "", "b", "Lkotlin/Function4;", "aPrefixStart", "aSuffixStart", "bPrefixStart", "bSuffixStart", "onFound", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lld/r;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {
    @z0
    public static final void a(@fg.l o oVar, int i4, int i5) {
        oVar.s(i4, i5, "");
    }

    public static final void b(@fg.l CharSequence charSequence, @fg.l CharSequence charSequence2, @fg.l ld.r<? super Integer, ? super Integer, ? super Integer, ? super Integer, k2> rVar) {
        int i4;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i5 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i4 = 0;
        } else {
            int i6 = 0;
            i4 = 0;
            boolean z4 = false;
            while (true) {
                if (i5 == 0) {
                    if (charSequence.charAt(i6) == charSequence2.charAt(i4)) {
                        i6++;
                        i4++;
                    } else {
                        i5 = 1;
                    }
                }
                if (!z4) {
                    if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z4 = true;
                    }
                }
                if (i6 >= length || i4 >= length2 || (i5 != 0 && z4)) {
                    break;
                }
            }
            i5 = i6;
        }
        if (i5 < length || i4 < length2) {
            rVar.i(Integer.valueOf(i5), Integer.valueOf(length), Integer.valueOf(i4), Integer.valueOf(length2));
        }
    }

    @z0
    public static final void c(@fg.l o.a aVar, @fg.l ld.p<? super t0, ? super t0, k2> pVar) {
        for (int i4 = 0; i4 < aVar.a(); i4++) {
            pVar.invoke(t0.b(aVar.c(i4)), t0.b(aVar.b(i4)));
        }
    }

    @z0
    public static final void d(@fg.l o.a aVar, @fg.l ld.p<? super t0, ? super t0, k2> pVar) {
        for (int a5 = aVar.a() - 1; a5 >= 0; a5--) {
            pVar.invoke(t0.b(aVar.c(a5)), t0.b(aVar.b(a5)));
        }
    }

    @z0
    public static final void e(@fg.l o oVar, int i4, @fg.l String str) {
        oVar.s(i4, i4, str);
    }

    @z0
    public static final void f(@fg.l o oVar) {
        oVar.q(oVar.j());
    }

    @z0
    public static final void g(@fg.l o oVar) {
        oVar.y(u0.b(0, oVar.j()));
    }
}
