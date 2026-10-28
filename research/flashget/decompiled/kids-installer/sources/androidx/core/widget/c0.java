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
import androidx.annotation.x0;
import androidx.core.view.p1;
import java.util.Objects;

/* compiled from: TextViewOnReceiveContentListener.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class c0 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5887a = "ReceiveContent";

    /* compiled from: TextViewOnReceiveContentListener.java */
    @x0(16)
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        static CharSequence a(@o0 Context context, @o0 ClipData.Item item, int i5) {
            if ((i5 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    /* compiled from: TextViewOnReceiveContentListener.java */
    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        static CharSequence a(@o0 Context context, @o0 ClipData.Item item, int i5) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i5 & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    private static CharSequence b(@o0 Context context, @o0 ClipData.Item item, int i5) {
        return a.a(context, item, i5);
    }

    private static void c(@o0 Editable editable, @o0 CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.p1
    @q0
    public androidx.core.view.g a(@o0 View view, @o0 androidx.core.view.g gVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(gVar);
        }
        if (gVar.g() == 2) {
            return gVar;
        }
        ClipData c6 = gVar.c();
        int e6 = gVar.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z5 = false;
        for (int i5 = 0; i5 < c6.getItemCount(); i5++) {
            CharSequence a6 = a.a(context, c6.getItemAt(i5), e6);
            if (a6 != null) {
                if (z5) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), a6);
                } else {
                    c(editable, a6);
                    z5 = true;
                }
            }
        }
        return null;
    }
}
