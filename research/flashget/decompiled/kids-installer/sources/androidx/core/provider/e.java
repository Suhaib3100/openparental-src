package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.core.provider.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: FontProvider.java */
/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<byte[]> f5012a = new Comparator() { // from class: androidx.core.provider.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g5;
            g5 = e.g((byte[]) obj, (byte[]) obj2);
            return g5;
        }
    };

    /* compiled from: FontProvider.java */
    @x0(16)
    static class a {
        private a() {
        }

        @u
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private e() {
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!Arrays.equals(list.get(i5), list2.get(i5))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(f fVar, Resources resources) {
        return fVar.b() != null ? fVar.b() : androidx.core.content.res.f.c(resources, fVar.c());
    }

    @o0
    static h.b e(@o0 Context context, @o0 f fVar, @q0 CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo f6 = f(context.getPackageManager(), fVar, context.getResources());
        return f6 == null ? new h.b(1, null) : new h.b(0, h(context, fVar, f6.authority, cancellationSignal));
    }

    @q0
    @m1
    static ProviderInfo f(@o0 PackageManager packageManager, @o0 f fVar, @q0 Resources resources) throws PackageManager.NameNotFoundException {
        String f6 = fVar.f();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(f6, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(androidx.constraintlayout.motion.widget.g.a("No package found for authority: ", f6));
        }
        if (!resolveContentProvider.packageName.equals(fVar.g())) {
            StringBuilder a6 = androidx.appcompat.view.g.a("Found content provider ", f6, ", but package was not ");
            a6.append(fVar.g());
            throw new PackageManager.NameNotFoundException(a6.toString());
        }
        List<byte[]> b6 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(b6, f5012a);
        List<List<byte[]>> d6 = d(fVar, resources);
        for (int i5 = 0; i5 < d6.size(); i5++) {
            ArrayList arrayList = new ArrayList(d6.get(i5));
            Collections.sort(arrayList, f5012a);
            if (c(b6, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            byte b6 = bArr[i5];
            byte b7 = bArr2[i5];
            if (b6 != b7) {
                return b6 - b7;
            }
        }
        return 0;
    }

    @o0
    @m1
    static h.c[] h(Context context, f fVar, String str, CancellationSignal cancellationSignal) {
        int i5;
        Uri withAppendedId;
        int i6;
        boolean z5;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i7 = 0;
            cursor = a.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{fVar.h()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i8 = columnIndex != -1 ? cursor.getInt(columnIndex) : i7;
                    int i9 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i7;
                    if (columnIndex3 == -1) {
                        i5 = i8;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i5 = i8;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i10 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i6 = i5;
                        z5 = false;
                    } else {
                        i6 = i5;
                        z5 = true;
                    }
                    arrayList2.add(h.c.a(withAppendedId, i9, i10, z5, i6));
                    i7 = 0;
                }
                arrayList = arrayList2;
            }
            return (h.c[]) arrayList.toArray(new h.c[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
