package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.d0;
import com.squareup.picasso.w;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContactsPhotoRequestHandler.java */
/* loaded from: classes6.dex */
class g extends d0 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f70860b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f70861c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f70862d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f70863e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final UriMatcher f70864f;

    /* renamed from: a, reason: collision with root package name */
    private final Context f70865a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f70864f = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    g(Context context) {
        this.f70865a = context;
    }

    private InputStream j(b0 b0Var) throws IOException {
        ContentResolver contentResolver = this.f70865a.getContentResolver();
        Uri uri = b0Var.f70750d;
        int match = f70864f.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.squareup.picasso.d0
    public boolean c(b0 b0Var) {
        Uri uri = b0Var.f70750d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f70864f.match(b0Var.f70750d) != -1;
    }

    @Override // com.squareup.picasso.d0
    public d0.a f(b0 b0Var, int i4) throws IOException {
        InputStream j4 = j(b0Var);
        if (j4 == null) {
            return null;
        }
        return new d0.a(okio.a0.m(j4), w.e.DISK);
    }
}
