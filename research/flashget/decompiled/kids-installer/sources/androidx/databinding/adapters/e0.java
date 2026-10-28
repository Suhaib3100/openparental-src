package androidx.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import androidx.annotation.c1;
import java.util.regex.Pattern;

/* compiled from: TableLayoutBindingAdapter.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f6040a = Pattern.compile("\\s*,\\s*");

    /* renamed from: b, reason: collision with root package name */
    private static final int f6041b = 20;

    private static SparseBooleanArray a(CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (String str : f6040a.split(charSequence)) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    sparseBooleanArray.put(parseInt, true);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }

    @androidx.databinding.d({"android:collapseColumns"})
    public static void b(TableLayout tableLayout, CharSequence charSequence) {
        SparseBooleanArray a6 = a(charSequence);
        for (int i5 = 0; i5 < 20; i5++) {
            boolean z5 = a6.get(i5, false);
            if (z5 != tableLayout.isColumnCollapsed(i5)) {
                tableLayout.setColumnCollapsed(i5, z5);
            }
        }
    }

    @androidx.databinding.d({"android:shrinkColumns"})
    public static void c(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setShrinkAllColumns(true);
            return;
        }
        tableLayout.setShrinkAllColumns(false);
        SparseBooleanArray a6 = a(charSequence);
        int size = a6.size();
        for (int i5 = 0; i5 < size; i5++) {
            int keyAt = a6.keyAt(i5);
            boolean valueAt = a6.valueAt(i5);
            if (valueAt) {
                tableLayout.setColumnShrinkable(keyAt, valueAt);
            }
        }
    }

    @androidx.databinding.d({"android:stretchColumns"})
    public static void d(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setStretchAllColumns(true);
            return;
        }
        tableLayout.setStretchAllColumns(false);
        SparseBooleanArray a6 = a(charSequence);
        int size = a6.size();
        for (int i5 = 0; i5 < size; i5++) {
            int keyAt = a6.keyAt(i5);
            boolean valueAt = a6.valueAt(i5);
            if (valueAt) {
                tableLayout.setColumnStretchable(keyAt, valueAt);
            }
        }
    }
}
