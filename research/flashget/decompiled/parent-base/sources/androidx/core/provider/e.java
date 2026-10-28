package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.os.Trace;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.collection.g1;
import androidx.core.provider.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: FontProvider.java */
/* loaded from: classes3.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private static final g1<d, ProviderInfo> f26569a = new g1<>(2);

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<byte[]> f26570b = new androidx.core.provider.d();

    /* compiled from: FontProvider.java */
    private interface a {
        static a a(Context context, Uri uri) {
            return new c(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* compiled from: FontProvider.java */
    private static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f26571a;

        b(Context context, Uri uri) {
            this.f26571a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.core.provider.e.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f26571a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // androidx.core.provider.e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f26571a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    /* compiled from: FontProvider.java */
    @x0(24)
    private static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f26572a;

        c(Context context, Uri uri) {
            this.f26572a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.core.provider.e.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f26572a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // androidx.core.provider.e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f26572a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* compiled from: FontProvider.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        String f26573a;

        /* renamed from: b, reason: collision with root package name */
        String f26574b;

        /* renamed from: c, reason: collision with root package name */
        List<List<byte[]>> f26575c;

        d(String str, String str2, List<List<byte[]>> list) {
            this.f26573a = str;
            this.f26574b = str2;
            this.f26575c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Objects.equals(this.f26573a, dVar.f26573a) && Objects.equals(this.f26574b, dVar.f26574b) && Objects.equals(this.f26575c, dVar.f26575c);
        }

        public int hashCode() {
            return Objects.hash(this.f26573a, this.f26574b, this.f26575c);
        }
    }

    private e() {
    }

    @m1
    static void b() {
        f26569a.evictAll();
    }

    private static List<byte[]> c(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean d(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!Arrays.equals(list.get(i4), list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> e(g gVar, Resources resources) {
        return gVar.b() != null ? gVar.b() : androidx.core.content.res.f.c(resources, gVar.c());
    }

    @o0
    static q.b f(@o0 Context context, @o0 List<g> list, @q0 CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        androidx.tracing.b.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                g gVar = list.get(i4);
                ProviderInfo g4 = g(context.getPackageManager(), gVar, context.getResources());
                if (g4 == null) {
                    q.b bVar = new q.b(1, (q.c[]) null);
                    Trace.endSection();
                    return bVar;
                }
                arrayList.add(i(context, gVar, g4.authority, cancellationSignal));
            }
            q.b bVar2 = new q.b(0, arrayList);
            Trace.endSection();
            return bVar2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @q0
    @m1
    static ProviderInfo g(@o0 PackageManager packageManager, @o0 g gVar, @q0 Resources resources) throws PackageManager.NameNotFoundException {
        androidx.tracing.b.c("FontProvider.getProvider");
        try {
            List<List<byte[]>> e4 = e(gVar, resources);
            d dVar = new d(gVar.f(), gVar.g(), e4);
            ProviderInfo providerInfo = f26569a.get(dVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String f4 = gVar.f();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(f4, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + f4);
            }
            if (!resolveContentProvider.packageName.equals(gVar.g())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + f4 + ", but package was not " + gVar.g());
            }
            List<byte[]> c5 = c(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(c5, f26570b);
            for (int i4 = 0; i4 < e4.size(); i4++) {
                ArrayList arrayList = new ArrayList(e4.get(i4));
                Collections.sort(arrayList, f26570b);
                if (d(c5, arrayList)) {
                    f26569a.put(dVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b5 = bArr[i4];
            byte b6 = bArr2[i4];
            if (b5 != b6) {
                return b5 - b6;
            }
        }
        return 0;
    }

    @o0
    @m1
    static q.c[] i(Context context, g gVar, String str, CancellationSignal cancellationSignal) {
        androidx.tracing.b.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            c cVar = new c(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                androidx.tracing.b.c("ContentQueryWrapper.query");
                try {
                    cursor = cVar.b(build, strArr, "query = ?", new String[]{gVar.h()}, null, cancellationSignal);
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i4 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new q.c(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i4));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    cVar.close();
                    return (q.c[]) arrayList.toArray(new q.c[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                cVar.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
