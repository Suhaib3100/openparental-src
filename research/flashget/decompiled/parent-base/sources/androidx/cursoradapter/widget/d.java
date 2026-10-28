package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.c1;

/* compiled from: SimpleCursorAdapter.java */
/* loaded from: classes3.dex */
public class d extends c {

    /* renamed from: p, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected int[] f28320p;

    /* renamed from: q, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected int[] f28321q;

    /* renamed from: r, reason: collision with root package name */
    private int f28322r;

    /* renamed from: s, reason: collision with root package name */
    private a f28323s;

    /* renamed from: t, reason: collision with root package name */
    private b f28324t;

    /* renamed from: u, reason: collision with root package name */
    String[] f28325u;

    /* compiled from: SimpleCursorAdapter.java */
    public interface a {
        CharSequence a(Cursor cursor);
    }

    /* compiled from: SimpleCursorAdapter.java */
    public interface b {
        boolean a(View view, Cursor cursor, int i4);
    }

    @Deprecated
    public d(Context context, int i4, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i4, cursor);
        this.f28322r = -1;
        this.f28321q = iArr;
        this.f28325u = strArr;
        q(cursor, strArr);
    }

    private void q(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f28320p = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f28320p;
        if (iArr == null || iArr.length != length) {
            this.f28320p = new int[length];
        }
        for (int i4 = 0; i4 < length; i4++) {
            this.f28320p[i4] = cursor.getColumnIndexOrThrow(strArr[i4]);
        }
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public CharSequence a(Cursor cursor) {
        a aVar = this.f28323s;
        if (aVar != null) {
            return aVar.a(cursor);
        }
        int i4 = this.f28322r;
        return i4 > -1 ? cursor.getString(i4) : super.a(cursor);
    }

    @Override // androidx.cursoradapter.widget.a
    public void e(View view, Context context, Cursor cursor) {
        b bVar = this.f28324t;
        int[] iArr = this.f28321q;
        int length = iArr.length;
        int[] iArr2 = this.f28320p;
        for (int i4 = 0; i4 < length; i4++) {
            View findViewById = view.findViewById(iArr[i4]);
            if (findViewById != null) {
                if (bVar != null ? bVar.a(findViewById, cursor, iArr2[i4]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i4]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        y((TextView) findViewById, string);
                    } else {
                        if (!(findViewById instanceof ImageView)) {
                            throw new IllegalStateException(findViewById.getClass().getName().concat(" is not a  view that can be bounds by this SimpleCursorAdapter"));
                        }
                        x((ImageView) findViewById, string);
                    }
                }
            }
        }
    }

    @Override // androidx.cursoradapter.widget.a
    public Cursor m(Cursor cursor) {
        q(cursor, this.f28325u);
        return super.m(cursor);
    }

    public void p(Cursor cursor, String[] strArr, int[] iArr) {
        this.f28325u = strArr;
        this.f28321q = iArr;
        q(cursor, strArr);
        super.b(cursor);
    }

    public a r() {
        return this.f28323s;
    }

    public int s() {
        return this.f28322r;
    }

    public b t() {
        return this.f28324t;
    }

    public void u(a aVar) {
        this.f28323s = aVar;
    }

    public void v(int i4) {
        this.f28322r = i4;
    }

    public void w(b bVar) {
        this.f28324t = bVar;
    }

    public void x(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void y(TextView textView, String str) {
        textView.setText(str);
    }

    public d(Context context, int i4, Cursor cursor, String[] strArr, int[] iArr, int i5) {
        super(context, i4, cursor, i5);
        this.f28322r = -1;
        this.f28321q = iArr;
        this.f28325u = strArr;
        q(cursor, strArr);
    }
}
