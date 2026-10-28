package androidx.databinding.adapters;

import android.widget.ExpandableListView;
import androidx.annotation.c1;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:onChildClick", method = "setOnChildClickListener", type = ExpandableListView.class), @BindingMethod(attribute = "android:onGroupClick", method = "setOnGroupClickListener", type = ExpandableListView.class), @BindingMethod(attribute = "android:onGroupCollapse", method = "setOnGroupCollapseListener", type = ExpandableListView.class), @BindingMethod(attribute = "android:onGroupExpand", method = "setOnGroupExpandListener", type = ExpandableListView.class)})
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class ExpandableListViewBindingAdapter {
}
