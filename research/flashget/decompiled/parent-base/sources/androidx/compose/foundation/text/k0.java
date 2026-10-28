package androidx.compose.foundation.text;

import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: StringHelpers.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "index", "b", "(Ljava/lang/String;I)I", "a", "Landroidx/emoji2/text/g;", "c", "()Landroidx/emoji2/text/g;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes.dex */
public final class k0 {
    public static final int a(@fg.l String str, int i4) {
        androidx.emoji2.text.g c5 = c();
        Integer num = null;
        if (c5 != null) {
            Integer valueOf = Integer.valueOf(c5.e(str, i4));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i4);
    }

    public static final int b(@fg.l String str, int i4) {
        androidx.emoji2.text.g c5 = c();
        Integer num = null;
        if (c5 != null) {
            Integer valueOf = Integer.valueOf(c5.h(str, Math.max(0, i4 - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i4);
    }

    private static final androidx.emoji2.text.g c() {
        if (!androidx.emoji2.text.g.q()) {
            return null;
        }
        androidx.emoji2.text.g c5 = androidx.emoji2.text.g.c();
        if (c5.i() == 1) {
            return c5;
        }
        return null;
    }
}
