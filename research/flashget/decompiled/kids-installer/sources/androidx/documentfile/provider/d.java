package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: SingleDocumentFile.java */
@x0(19)
/* loaded from: classes3.dex */
class d extends a {

    /* renamed from: c, reason: collision with root package name */
    private Context f7677c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f7678d;

    d(@q0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f7677c = context;
        this.f7678d = uri;
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return b.a(this.f7677c, this.f7678d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return b.b(this.f7677c, this.f7678d);
    }

    @Override // androidx.documentfile.provider.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f7677c.getContentResolver(), this.f7678d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return b.d(this.f7677c, this.f7678d);
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public String k() {
        return b.f(this.f7677c, this.f7678d);
    }

    @Override // androidx.documentfile.provider.a
    @q0
    public String m() {
        return b.h(this.f7677c, this.f7678d);
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return this.f7678d;
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return b.i(this.f7677c, this.f7678d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return b.j(this.f7677c, this.f7678d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return b.k(this.f7677c, this.f7678d);
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return b.l(this.f7677c, this.f7678d);
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return b.m(this.f7677c, this.f7678d);
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        throw new UnsupportedOperationException();
    }
}
