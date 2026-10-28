package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: PagerAdapter.java */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f35564c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f35565d = -2;

    /* renamed from: a, reason: collision with root package name */
    private final DataSetObservable f35566a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f35567b;

    @Deprecated
    public void b(@o0 View view, int i4, @o0 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void e(@o0 ViewGroup viewGroup, int i4, @o0 Object obj) {
        b(viewGroup, i4, obj);
    }

    @Deprecated
    public void f(@o0 View view) {
    }

    public void g(@o0 ViewGroup viewGroup) {
        f(viewGroup);
    }

    public abstract int h();

    public int i(@o0 Object obj) {
        return -1;
    }

    @q0
    public CharSequence j(int i4) {
        return null;
    }

    public float k(int i4) {
        return 1.0f;
    }

    @o0
    @Deprecated
    public Object l(@o0 View view, int i4) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @o0
    public Object m(@o0 ViewGroup viewGroup, int i4) {
        return l(viewGroup, i4);
    }

    public abstract boolean n(@o0 View view, @o0 Object obj);

    public void o() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f35567b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f35566a.notifyChanged();
    }

    public void p(@o0 DataSetObserver dataSetObserver) {
        this.f35566a.registerObserver(dataSetObserver);
    }

    public void q(@q0 Parcelable parcelable, @q0 ClassLoader classLoader) {
    }

    @q0
    public Parcelable r() {
        return null;
    }

    @Deprecated
    public void s(@o0 View view, int i4, @o0 Object obj) {
    }

    public void t(@o0 ViewGroup viewGroup, int i4, @o0 Object obj) {
        s(viewGroup, i4, obj);
    }

    void u(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f35567b = dataSetObserver;
        }
    }

    @Deprecated
    public void v(@o0 View view) {
    }

    public void w(@o0 ViewGroup viewGroup) {
        v(viewGroup);
    }

    public void x(@o0 DataSetObserver dataSetObserver) {
        this.f35566a.unregisterObserver(dataSetObserver);
    }
}
