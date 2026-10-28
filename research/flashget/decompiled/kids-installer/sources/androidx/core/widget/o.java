package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: ListViewCompat.java */
/* loaded from: classes.dex */
public final class o {

    /* compiled from: ListViewCompat.java */
    @x0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(ListView listView, int i5) {
            return listView.canScrollList(i5);
        }

        @androidx.annotation.u
        static void b(ListView listView, int i5) {
            listView.scrollListBy(i5);
        }
    }

    private o() {
    }

    public static boolean a(@o0 ListView listView, int i5) {
        return a.a(listView, i5);
    }

    public static void b(@o0 ListView listView, int i5) {
        a.b(listView, i5);
    }
}
