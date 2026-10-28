package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ParcelUtils.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f35453a = "a";

    private c() {
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static <T extends g> T a(InputStream inputStream) {
        return (T) new f(inputStream, null).g0();
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static <T extends g> T b(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @q0
    public static <T extends g> T c(@o0 Bundle bundle, @o0 String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(c.class.getClassLoader());
            return (T) b(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @q0
    public static <T extends g> List<T> d(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(c.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(b((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void e(@o0 Bundle bundle, @o0 String str, @q0 g gVar) {
        if (gVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", new ParcelImpl(gVar));
        bundle.putParcelable(str, bundle2);
    }

    public static void f(@o0 Bundle bundle, @o0 String str, @o0 List<? extends g> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<? extends g> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ParcelImpl(it.next()));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static void g(g gVar, OutputStream outputStream) {
        f fVar = new f(null, outputStream);
        fVar.l1(gVar);
        fVar.a();
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static Parcelable h(g gVar) {
        return new ParcelImpl(gVar);
    }
}
