package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* compiled from: CursorLoader.java */
/* loaded from: classes3.dex */
public class b extends a<Cursor> {

    /* renamed from: r, reason: collision with root package name */
    final c<Cursor>.a f8728r;

    /* renamed from: s, reason: collision with root package name */
    Uri f8729s;

    /* renamed from: t, reason: collision with root package name */
    String[] f8730t;

    /* renamed from: u, reason: collision with root package name */
    String f8731u;

    /* renamed from: v, reason: collision with root package name */
    String[] f8732v;

    /* renamed from: w, reason: collision with root package name */
    String f8733w;

    /* renamed from: x, reason: collision with root package name */
    Cursor f8734x;

    /* renamed from: y, reason: collision with root package name */
    androidx.core.os.c f8735y;

    public b(@o0 Context context) {
        super(context);
        this.f8728r = new c.a();
    }

    @Override // androidx.loader.content.a
    public void D() {
        synchronized (this) {
            androidx.core.os.c cVar = this.f8735y;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    @Override // androidx.loader.content.c
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (l()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f8734x;
        this.f8734x = cursor;
        if (m()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @q0
    public String[] O() {
        return this.f8730t;
    }

    @q0
    public String P() {
        return this.f8731u;
    }

    @q0
    public String[] Q() {
        return this.f8732v;
    }

    @q0
    public String R() {
        return this.f8733w;
    }

    @o0
    public Uri S() {
        return this.f8729s;
    }

    @Override // androidx.loader.content.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Cursor I() {
        synchronized (this) {
            if (H()) {
                throw new OperationCanceledException();
            }
            this.f8735y = new androidx.core.os.c();
        }
        try {
            Cursor a6 = androidx.core.content.b.a(i().getContentResolver(), this.f8729s, this.f8730t, this.f8731u, this.f8732v, this.f8733w, this.f8735y);
            if (a6 != null) {
                try {
                    a6.getCount();
                    a6.registerContentObserver(this.f8728r);
                } catch (RuntimeException e6) {
                    a6.close();
                    throw e6;
                }
            }
            synchronized (this) {
                this.f8735y = null;
            }
            return a6;
        } catch (Throwable th) {
            synchronized (this) {
                this.f8735y = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.a
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void J(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void V(@q0 String[] strArr) {
        this.f8730t = strArr;
    }

    public void W(@q0 String str) {
        this.f8731u = str;
    }

    public void X(@q0 String[] strArr) {
        this.f8732v = strArr;
    }

    public void Y(@q0 String str) {
        this.f8733w = str;
    }

    public void Z(@o0 Uri uri) {
        this.f8729s = uri;
    }

    @Override // androidx.loader.content.a, androidx.loader.content.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f8729s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f8730t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f8731u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f8732v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f8733w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f8734x);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f8743h);
    }

    @Override // androidx.loader.content.c
    protected void r() {
        t();
        Cursor cursor = this.f8734x;
        if (cursor != null && !cursor.isClosed()) {
            this.f8734x.close();
        }
        this.f8734x = null;
    }

    @Override // androidx.loader.content.c
    protected void s() {
        Cursor cursor = this.f8734x;
        if (cursor != null) {
            f(cursor);
        }
        if (A() || this.f8734x == null) {
            h();
        }
    }

    @Override // androidx.loader.content.c
    protected void t() {
        b();
    }

    public b(@o0 Context context, @o0 Uri uri, @q0 String[] strArr, @q0 String str, @q0 String[] strArr2, @q0 String str2) {
        super(context);
        this.f8728r = new c.a();
        this.f8729s = uri;
        this.f8730t = strArr;
        this.f8731u = str;
        this.f8732v = strArr2;
        this.f8733w = str2;
    }
}
