package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.e1;
import java.util.Objects;

/* compiled from: TextViewOnReceiveContentListener.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class s implements e1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f27614a = "ReceiveContent";

    private static CharSequence b(@o0 Context context, @o0 ClipData.Item item, int i4) {
        if ((i4 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence coerceToText = item.coerceToText(context);
        return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
    }

    private static void c(@o0 Editable editable, @o0 CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.e1
    @q0
    public androidx.core.view.e a(@o0 View view, @o0 androidx.core.view.e eVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(eVar);
        }
        if (eVar.g() == 2) {
            return eVar;
        }
        ClipData c5 = eVar.c();
        int e4 = eVar.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z4 = false;
        for (int i4 = 0; i4 < c5.getItemCount(); i4++) {
            CharSequence b5 = b(context, c5.getItemAt(i4), e4);
            if (b5 != null) {
                if (z4) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b5);
                } else {
                    c(editable, b5);
                    z4 = true;
                }
            }
        }
        return null;
    }
}
