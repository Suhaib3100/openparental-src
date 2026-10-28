package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.e;
import androidx.core.view.x1;
import java.util.Objects;

/* compiled from: AppCompatReceiveContentHelper.java */
/* loaded from: classes.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1946a = "ReceiveContent";

    /* compiled from: AppCompatReceiveContentHelper.java */
    @androidx.annotation.x0(24)
    private static final class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(@androidx.annotation.o0 DragEvent dragEvent, @androidx.annotation.o0 TextView textView, @androidx.annotation.o0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                x1.s1(textView, new e.b(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @androidx.annotation.u
        static boolean b(@androidx.annotation.o0 DragEvent dragEvent, @androidx.annotation.o0 View view, @androidx.annotation.o0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            x1.s1(view, new e.b(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    private n() {
    }

    static boolean a(@androidx.annotation.o0 View view, @androidx.annotation.o0 DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && x1.k0(view) != null) {
            Activity c5 = c(view);
            if (c5 == null) {
                Objects.toString(view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.a(dragEvent, (TextView) view, c5) : a.b(dragEvent, view, c5);
            }
        }
        return false;
    }

    static boolean b(@androidx.annotation.o0 TextView textView, int i4) {
        if (Build.VERSION.SDK_INT >= 31 || x1.k0(textView) == null || !(i4 == 16908322 || i4 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            x1.s1(textView, new e.b(primaryClip, 1).d(i4 != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    @androidx.annotation.q0
    static Activity c(@androidx.annotation.o0 View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
