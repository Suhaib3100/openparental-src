package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.io.FileNotFoundException;

/* compiled from: DocumentsContractCompat.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26567a = "tree";

    /* compiled from: DocumentsContractCompat.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f26568a = 512;

        private a() {
        }
    }

    /* compiled from: DocumentsContractCompat.java */
    @x0(21)
    private static class b {
        private b() {
        }

        static Uri a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        static Uri b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        static Uri c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        public static Uri d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        static Uri e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        static String f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        static Uri g(@o0 ContentResolver contentResolver, @o0 Uri uri, @o0 String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    /* compiled from: DocumentsContractCompat.java */
    @x0(24)
    /* renamed from: androidx.core.provider.c$c, reason: collision with other inner class name */
    private static class C0425c {
        private C0425c() {
        }

        static boolean a(@o0 Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        static boolean b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    private c() {
    }

    @q0
    public static Uri a(@o0 String str, @q0 String str2) {
        return DocumentsContract.buildChildDocumentsUri(str, str2);
    }

    @q0
    public static Uri b(@o0 Uri uri, @o0 String str) {
        return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
    }

    @q0
    public static Uri c(@o0 String str, @o0 String str2) {
        return DocumentsContract.buildDocumentUri(str, str2);
    }

    @q0
    public static Uri d(@o0 Uri uri, @o0 String str) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, str);
    }

    @q0
    public static Uri e(@o0 String str, @o0 String str2) {
        return DocumentsContract.buildTreeDocumentUri(str, str2);
    }

    @q0
    public static Uri f(@o0 ContentResolver contentResolver, @o0 Uri uri, @o0 String str, @o0 String str2) throws FileNotFoundException {
        return DocumentsContract.createDocument(contentResolver, uri, str, str2);
    }

    @q0
    public static String g(@o0 Uri uri) {
        return DocumentsContract.getDocumentId(uri);
    }

    @q0
    public static String h(@o0 Uri uri) {
        return DocumentsContract.getTreeDocumentId(uri);
    }

    public static boolean i(@o0 Context context, @q0 Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public static boolean j(@o0 Uri uri) {
        return DocumentsContract.isTreeUri(uri);
    }

    public static boolean k(@o0 ContentResolver contentResolver, @o0 Uri uri, @o0 Uri uri2) throws FileNotFoundException {
        return DocumentsContract.removeDocument(contentResolver, uri, uri2);
    }

    @q0
    public static Uri l(@o0 ContentResolver contentResolver, @o0 Uri uri, @o0 String str) throws FileNotFoundException {
        return DocumentsContract.renameDocument(contentResolver, uri, str);
    }
}
