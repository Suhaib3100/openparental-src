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
    private Context f7679c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f7680d;

    e(@q0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f7679c = context;
        this.f7680d = uri;
    }

    private static void w(@q0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e6) {
                throw e6;
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
        return b.a(this.f7679c, this.f7680d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return b.b(this.f7679c, this.f7680d);
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public a c(String str) {
        Uri x5 = x(this.f7679c, this.f7680d, "vnd.android.document/directory", str);
        if (x5 != null) {
            return new e(this, this.f7679c, x5);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public a d(String str, String str2) {
        Uri x5 = x(this.f7679c, this.f7680d, str, str2);
        if (x5 != null) {
            return new e(this, this.f7679c, x5);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f7679c.getContentResolver(), this.f7680d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return b.d(this.f7679c, this.f7680d);
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public String k() {
        return b.f(this.f7679c, this.f7680d);
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public String m() {
        return b.h(this.f7679c, this.f7680d);
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return this.f7680d;
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return b.i(this.f7679c, this.f7680d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return b.j(this.f7679c, this.f7680d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return b.k(this.f7679c, this.f7680d);
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return b.l(this.f7679c, this.f7680d);
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return b.m(this.f7679c, this.f7680d);
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        ContentResolver contentResolver = this.f7679c.getContentResolver();
        Uri uri = this.f7680d;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f7680d, cursor.getString(0)));
                }
            } catch (Exception e6) {
                e6.toString();
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i5 = 0; i5 < uriArr.length; i5++) {
                aVarArr[i5] = new e(this, this.f7679c, uriArr[i5]);
            }
            return aVarArr;
        } finally {
            w(cursor);
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.f7679c.getContentResolver(), this.f7680d, str);
            if (renameDocument != null) {
                this.f7680d = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
