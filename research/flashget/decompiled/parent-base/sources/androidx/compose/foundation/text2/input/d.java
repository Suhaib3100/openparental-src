package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text2.input.c;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CodepointTransformation.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text2/input/c$a;", "", "character", "Landroidx/compose/foundation/text2/input/c;", "a", "(Landroidx/compose/foundation/text2/input/c$a;C)Landroidx/compose/foundation/text2/input/c;", "Landroidx/compose/foundation/text2/input/q;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/internal/r;", "offsetMappingCalculator", "", "b", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/c;Landroidx/compose/foundation/text2/input/internal/r;)Ljava/lang/CharSequence;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    @x4
    @fg.l
    @z0
    public static final c a(@fg.l c.Companion companion, char c5) {
        return new k(c5);
    }

    @fg.l
    public static final CharSequence b(@fg.l q qVar, @fg.l c cVar, @fg.l androidx.compose.foundation.text2.input.internal.r rVar) {
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        boolean z4 = false;
        int i5 = 0;
        while (i4 < qVar.length()) {
            int codePointAt = Character.codePointAt(qVar, i4);
            int a5 = cVar.a(i5, codePointAt);
            int charCount = Character.charCount(codePointAt);
            if (a5 != codePointAt) {
                rVar.e(sb.length(), sb.length() + charCount, Character.charCount(a5));
                z4 = true;
            }
            sb.appendCodePoint(a5);
            i4 += charCount;
            i5++;
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return z4 ? sb2 : qVar;
    }
}
