package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.os.OperationCanceledException;
import androidx.core.os.f;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* compiled from: CursorLoader.java */
/* loaded from: classes3.dex */
public class b extends a<Cursor> {

    /* renamed from: a, reason: collision with root package name */
    final c<Cursor>.a f30516a;

    /* renamed from: b, reason: collision with root package name */
    Uri f30517b;

    /* renamed from: c, reason: collision with root package name */
    String[] f30518c;

    /* renamed from: d, reason: collision with root package name */
    String f30519d;

    /* renamed from: e, reason: collision with root package name */
    String[] f30520e;

    /* renamed from: f, reason: collision with root package name */
    String f30521f;

    /* renamed from: g, reason: collision with root package name */
    Cursor f30522g;

    /* renamed from: h, reason: collision with root package name */
    f f30523h;

    public b(@o0 Context context) {
        super(context);
        this.f30516a = new c.a();
    }

    @Override // androidx.loader.content.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f30522g;
        this.f30522g = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @q0
    public String[] b() {
        return this.f30518c;
    }

    @q0
    public String c() {
        return this.f30519d;
    }

    @Override // androidx.loader.content.a
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                f fVar = this.f30523h;
                if (fVar != null) {
                    fVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @q0
    public String[] d() {
        return this.f30520e;
    }

    @Override // androidx.loader.content.a, androidx.loader.content.c
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f30517b);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f30518c));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f30519d);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f30520e));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f30521f);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f30522g);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.mContentChanged);
    }

    @q0
    public String e() {
        return this.f30521f;
    }

    @o0
    public Uri f() {
        return this.f30517b;
    }

    @Override // androidx.loader.content.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Cursor loadInBackground() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new OperationCanceledException();
            }
            this.f30523h = new f();
        }
        try {
            Cursor b5 = androidx.core.content.b.b(getContext().getContentResolver(), this.f30517b, this.f30518c, this.f30519d, this.f30520e, this.f30521f, this.f30523h);
            if (b5 != null) {
                try {
                    b5.getCount();
                    b5.registerContentObserver(this.f30516a);
                } catch (RuntimeException e4) {
                    b5.close();
                    throw e4;
                }
            }
            synchronized (this) {
                this.f30523h = null;
            }
            return b5;
        } catch (Throwable th) {
            synchronized (this) {
                this.f30523h = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onCanceled(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void i(@q0 String[] strArr) {
        this.f30518c = strArr;
    }

    public void j(@q0 String str) {
        this.f30519d = str;
    }

    public void k(@q0 String[] strArr) {
        this.f30520e = strArr;
    }

    public void l(@q0 String str) {
        this.f30521f = str;
    }

    public void m(@o0 Uri uri) {
        this.f30517b = uri;
    }

    @Override // androidx.loader.content.c
    protected void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.f30522g;
        if (cursor != null && !cursor.isClosed()) {
            this.f30522g.close();
        }
        this.f30522g = null;
    }

    @Override // androidx.loader.content.c
    protected void onStartLoading() {
        Cursor cursor = this.f30522g;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f30522g == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.c
    protected void onStopLoading() {
        cancelLoad();
    }

    public b(@o0 Context context, @o0 Uri uri, @q0 String[] strArr, @q0 String str, @q0 String[] strArr2, @q0 String str2) {
        super(context);
        this.f30516a = new c.a();
        this.f30517b = uri;
        this.f30518c = strArr;
        this.f30519d = str;
        this.f30520e = strArr2;
        this.f30521f = str2;
    }
}
