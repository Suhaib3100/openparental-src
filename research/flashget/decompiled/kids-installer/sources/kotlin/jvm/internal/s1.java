package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: SpreadBuilder.java */
/* loaded from: classes5.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Object> f23621a;

    public s1(int i5) {
        this.f23621a = new ArrayList<>(i5);
    }

    public void a(Object obj) {
        this.f23621a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f23621a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f23621a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f23621a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f23621a.add(it.next());
            }
            return;
        }
        if (!(obj instanceof Iterator)) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("䅷") + obj.getClass());
        }
        Iterator it2 = (Iterator) obj;
        while (it2.hasNext()) {
            this.f23621a.add(it2.next());
        }
    }

    public int c() {
        return this.f23621a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f23621a.toArray(objArr);
    }
}
