package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.ArrayList;

/* compiled from: TreeDocumentFile.java */
@x0(21)
/* loaded from: classes3.dex */
class e extends a {

    /* renamed from: c, reason: collision with root package name */
    private Context f29139c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f29140d;

    e(@q0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f29139c = context;
        this.f29140d = uri;
    }

    private static void w(@q0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    @q0
    private static Uri x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return b.a(this.f29139c, this.f29140d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return b.b(this.f29139c, this.f29140d);
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public a c(String str) {
        Uri x4 = x(this.f29139c, this.f29140d, "vnd.android.document/directory", str);
        if (x4 != null) {
            return new e(this, this.f29139c, x4);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public a d(String str, String str2) {
        Uri x4 = x(this.f29139c, this.f29140d, str, str2);
        if (x4 != null) {
            return new e(this, this.f29139c, x4);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f29139c.getContentResolver(), this.f29140d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return b.d(this.f29139c, this.f29140d);
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public String k() {
        return b.f(this.f29139c, this.f29140d);
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public String m() {
        return b.h(this.f29139c, this.f29140d);
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return this.f29140d;
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return b.i(this.f29139c, this.f29140d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return b.j(this.f29139c, this.f29140d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return b.k(this.f29139c, this.f29140d);
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return b.l(this.f29139c, this.f29140d);
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return b.m(this.f29139c, this.f29140d);
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        ContentResolver contentResolver = this.f29139c.getContentResolver();
        Uri uri = this.f29140d;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f29140d, cursor.getString(0)));
                }
            } catch (Exception e4) {
                e4.toString();
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i4 = 0; i4 < uriArr.length; i4++) {
                aVarArr[i4] = new e(this, this.f29139c, uriArr[i4]);
            }
            return aVarArr;
        } finally {
            w(cursor);
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.f29139c.getContentResolver(), this.f29140d, str);
            if (renameDocument != null) {
                this.f29140d = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
