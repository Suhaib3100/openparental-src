package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.core.view.g;
import androidx.core.view.inputmethod.i;
import androidx.core.view.y1;
import java.util.Objects;

/* compiled from: AppCompatReceiveContentHelper.java */
/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1253a = "ReceiveContent";

    /* renamed from: b, reason: collision with root package name */
    private static final String f1254b = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* compiled from: AppCompatReceiveContentHelper.java */
    /* loaded from: classes2.dex */
    class a implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1255a;

        a(View view) {
            this.f1255a = view;
        }

        @Override // androidx.core.view.inputmethod.i.d
        public boolean a(androidx.core.view.inputmethod.p pVar, int i5, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i5 & 1) != 0) {
                try {
                    pVar.e();
                    InputContentInfo inputContentInfo = (InputContentInfo) pVar.f();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                } catch (Exception unused) {
                    return false;
                }
            }
            return y1.m1(this.f1255a, new g.b(new ClipData(pVar.b(), new ClipData.Item(pVar.a())), 2).e(pVar.c()).c(bundle).a()) == null;
        }
    }

    /* compiled from: AppCompatReceiveContentHelper.java */
    @androidx.annotation.x0(24)
    private static final class b {
        private b() {
        }

        static boolean a(@androidx.annotation.o0 DragEvent dragEvent, @androidx.annotation.o0 TextView textView, @androidx.annotation.o0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                y1.m1(textView, new g.b(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean b(@androidx.annotation.o0 DragEvent dragEvent, @androidx.annotation.o0 View view, @androidx.annotation.o0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            y1.m1(view, new g.b(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    private j() {
    }

    @androidx.annotation.o0
    static i.d a(@androidx.annotation.o0 View view) {
        return new a(view);
    }

    static boolean b(@androidx.annotation.o0 View view, @androidx.annotation.o0 DragEvent dragEvent) {
        if (dragEvent.getLocalState() == null && y1.h0(view) != null) {
            Activity d6 = d(view);
            if (d6 == null) {
                Objects.toString(view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? b.a(dragEvent, (TextView) view, d6) : b.b(dragEvent, view, d6);
            }
        }
        return false;
    }

    static boolean c(@androidx.annotation.o0 TextView textView, int i5) {
        if ((i5 != 16908322 && i5 != 16908337) || y1.h0(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            y1.m1(textView, new g.b(primaryClip, 1).d(i5 != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    @androidx.annotation.q0
    static Activity d(@androidx.annotation.o0 View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
