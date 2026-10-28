package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;

/* compiled from: ViewCompatShims.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19798a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19799b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19800c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f19801d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19802e = 8;

    /* compiled from: ViewCompatShims.java */
    @x0(26)
    static class a {
        private a() {
        }

        @u
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    /* compiled from: ViewCompatShims.java */
    @x0(29)
    private static class b {
        private b() {
        }

        @u
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* compiled from: ViewCompatShims.java */
    @x0(30)
    private static class c {
        private c() {
        }

        @u
        static void a(View view, int i4) {
            view.setImportantForContentCapture(i4);
        }
    }

    private e() {
    }

    @q0
    public static androidx.compose.ui.platform.coreshims.b a(@o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return androidx.compose.ui.platform.coreshims.b.b(a.a(view));
        }
        return null;
    }

    @q0
    public static d b(@o0 View view) {
        ContentCaptureSession a5;
        if (Build.VERSION.SDK_INT < 29 || (a5 = b.a(view)) == null) {
            return null;
        }
        return d.g(a5, view);
    }

    public static void c(@o0 View view, int i4) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i4);
        }
    }
}
