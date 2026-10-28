package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamLocalUriFetcher.java */
/* loaded from: classes3.dex */
public class n extends l<InputStream> {

    /* renamed from: f, reason: collision with root package name */
    private static final int f43816f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f43817g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f43818h = 3;

    /* renamed from: i, reason: collision with root package name */
    private static final int f43819i = 4;

    /* renamed from: j, reason: collision with root package name */
    private static final int f43820j = 5;

    /* renamed from: k, reason: collision with root package name */
    private static final UriMatcher f43821k;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f43821k = uriMatcher;
        String s4 = ProtectedSandApp.s("ࢃ");
        uriMatcher.addURI(s4, ProtectedSandApp.s("ࢄ"), 1);
        uriMatcher.addURI(s4, ProtectedSandApp.s("ࢅ"), 1);
        uriMatcher.addURI(s4, ProtectedSandApp.s("ࢆ"), 2);
        uriMatcher.addURI(s4, ProtectedSandApp.s("ࢇ"), 3);
        uriMatcher.addURI(s4, ProtectedSandApp.s("࢈"), 4);
        uriMatcher.addURI(s4, ProtectedSandApp.s("ࢉ"), 5);
    }

    public n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private InputStream i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f43821k.match(uri);
        if (match != 1) {
            if (match == 3) {
                return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, lookupContact, true);
        }
        throw new FileNotFoundException(ProtectedSandApp.s("ࢊ"));
    }

    private InputStream j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.data.d
    @o0
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream i4 = i(uri, contentResolver);
        if (i4 != null) {
            return i4;
        }
        throw new FileNotFoundException(ProtectedSandApp.s("ࢋ") + uri);
    }
}
