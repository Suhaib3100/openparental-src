package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: EmojiExclusions.java */
/* loaded from: classes3.dex */
class j {

    /* compiled from: EmojiExclusions.java */
    @x0(34)
    private static class a {
        private a() {
        }

        @androidx.annotation.u
        @o0
        static Set<int[]> a() {
            return b.a();
        }
    }

    /* compiled from: EmojiExclusions.java */
    private static class b {
        private b() {
        }

        @o0
        @SuppressLint({"BanUncheckedReflection"})
        static Set<int[]> a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set<int[]> set = (Set) invoke;
                Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    private j() {
    }

    @o0
    static Set<int[]> a() {
        return Build.VERSION.SDK_INT >= 34 ? a.a() : b.a();
    }
}
