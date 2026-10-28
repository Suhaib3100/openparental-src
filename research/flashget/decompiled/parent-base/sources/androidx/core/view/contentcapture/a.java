package androidx.core.view.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.view.m2;
import androidx.core.view.x1;
import java.util.List;
import java.util.Objects;

/* compiled from: ContentCaptureSessionCompat.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f27088c = "TREAT_AS_VIEW_TREE_APPEARING";

    /* renamed from: d, reason: collision with root package name */
    private static final String f27089d = "TREAT_AS_VIEW_TREE_APPEARED";

    /* renamed from: a, reason: collision with root package name */
    private final Object f27090a;

    /* renamed from: b, reason: collision with root package name */
    private final View f27091b;

    /* compiled from: ContentCaptureSessionCompat.java */
    @x0(23)
    /* renamed from: androidx.core.view.contentcapture.a$a, reason: collision with other inner class name */
    private static class C0439a {
        private C0439a() {
        }

        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* compiled from: ContentCaptureSessionCompat.java */
    @x0(29)
    private static class b {
        private b() {
        }

        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j4) {
            return contentCaptureSession.newAutofillId(autofillId, j4);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j4) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j4);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* compiled from: ContentCaptureSessionCompat.java */
    @x0(34)
    private static class c {
        private c() {
        }

        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @x0(29)
    private a(@o0 ContentCaptureSession contentCaptureSession, @o0 View view) {
        this.f27090a = contentCaptureSession;
        this.f27091b = view;
    }

    @o0
    @x0(29)
    public static a g(@o0 ContentCaptureSession contentCaptureSession, @o0 View view) {
        return new a(contentCaptureSession, view);
    }

    @q0
    public AutofillId a(long j4) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession a5 = androidx.compose.ui.platform.coreshims.c.a(this.f27090a);
        g1.a M = x1.M(this.f27091b);
        Objects.requireNonNull(M);
        return b.a(a5, M.a(), j4);
    }

    @q0
    public m2 b(@o0 AutofillId autofillId, long j4) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m2.f(b.c(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), autofillId, j4));
        }
        return null;
    }

    public void c(@o0 AutofillId autofillId, @q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), autofillId, charSequence);
        }
    }

    public void d(@o0 List<ViewStructure> list) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            c.a(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), list);
            return;
        }
        if (i4 >= 29) {
            ViewStructure b5 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), this.f27091b);
            b5.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), b5);
            for (int i5 = 0; i5 < list.size(); i5++) {
                b.d(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), list.get(i5));
            }
            ViewStructure b6 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), this.f27091b);
            b6.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), b6);
        }
    }

    public void e(@o0 long[] jArr) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            ContentCaptureSession a5 = androidx.compose.ui.platform.coreshims.c.a(this.f27090a);
            g1.a M = x1.M(this.f27091b);
            Objects.requireNonNull(M);
            b.f(a5, M.a(), jArr);
            return;
        }
        if (i4 >= 29) {
            ViewStructure b5 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), this.f27091b);
            b5.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), b5);
            ContentCaptureSession a6 = androidx.compose.ui.platform.coreshims.c.a(this.f27090a);
            g1.a M2 = x1.M(this.f27091b);
            Objects.requireNonNull(M2);
            b.f(a6, M2.a(), jArr);
            ViewStructure b6 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), this.f27091b);
            b6.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f27090a), b6);
        }
    }

    @o0
    @x0(29)
    public ContentCaptureSession f() {
        return androidx.compose.ui.platform.coreshims.c.a(this.f27090a);
    }
}
