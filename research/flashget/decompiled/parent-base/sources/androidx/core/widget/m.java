package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.o0;
import androidx.annotation.w0;

/* compiled from: ListViewCompat.java */
@Deprecated
/* loaded from: classes3.dex */
public final class m {
    private m() {
    }

    @w0(expression = "listView.canScrollList(direction)")
    @Deprecated
    public static boolean a(@o0 ListView listView, int i4) {
        return listView.canScrollList(i4);
    }

    @w0(expression = "listView.scrollListBy(y)")
    @Deprecated
    public static void b(@o0 ListView listView, int i4) {
        listView.scrollListBy(i4);
    }
}
