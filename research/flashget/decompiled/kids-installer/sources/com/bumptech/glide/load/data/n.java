package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamLocalUriFetcher.java */
/* loaded from: classes3.dex */
public class n extends l<InputStream> {

    /* renamed from: s, reason: collision with root package name */
    private static final int f11110s = 1;

    /* renamed from: t, reason: collision with root package name */
    private static final int f11111t = 2;

    /* renamed from: u, reason: collision with root package name */
    private static final int f11112u = 3;

    /* renamed from: v, reason: collision with root package name */
    private static final int f11113v = 4;

    /* renamed from: w, reason: collision with root package name */
    private static final int f11114w = 5;

    /* renamed from: x, reason: collision with root package name */
    private static final UriMatcher f11115x;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f11115x = uriMatcher;
        String s5 = ProtectedSandApp.s("\u1c8e");
        uriMatcher.addURI(s5, ProtectedSandApp.s("\u1c8f"), 1);
        uriMatcher.addURI(s5, ProtectedSandApp.s("Ა"), 1);
        uriMatcher.addURI(s5, ProtectedSandApp.s("Ბ"), 2);
        uriMatcher.addURI(s5, ProtectedSandApp.s("Გ"), 3);
        uriMatcher.addURI(s5, ProtectedSandApp.s("Დ"), 4);
        uriMatcher.addURI(s5, ProtectedSandApp.s("Ე"), 5);
    }

    public n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private InputStream i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f11115x.match(uri);
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
        throw new FileNotFoundException(ProtectedSandApp.s("Ვ"));
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
        InputStream i5 = i(uri, contentResolver);
        if (i5 != null) {
            return i5;
        }
        throw new FileNotFoundException(ProtectedSandApp.s("Ზ") + uri);
    }
}
