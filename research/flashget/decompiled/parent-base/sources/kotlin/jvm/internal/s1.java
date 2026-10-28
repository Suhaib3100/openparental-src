package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: SpreadBuilder.java */
/* loaded from: classes7.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Object> f75370a;

    public s1(int i4) {
        this.f75370a = new ArrayList<>(i4);
    }

    public void a(Object obj) {
        this.f75370a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f75370a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f75370a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f75370a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f75370a.add(it.next());
            }
            return;
        }
        if (!(obj instanceof Iterator)) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("擿\u0001") + obj.getClass());
        }
        Iterator it2 = (Iterator) obj;
        while (it2.hasNext()) {
            this.f75370a.add(it2.next());
        }
    }

    public int c() {
        return this.f75370a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f75370a.toArray(objArr);
    }
}
