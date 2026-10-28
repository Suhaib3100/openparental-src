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

    @c1({c1.a.LIBRARY_GROUP})
    protected int[] C;

    @c1({c1.a.LIBRARY_GROUP})
    protected int[] D;
    private int E;
    private a F;
    private b G;
    String[] H;

    /* compiled from: SimpleCursorAdapter.java */
    /* loaded from: classes.dex */
    public interface a {
        CharSequence convertToString(Cursor cursor);
    }

    /* compiled from: SimpleCursorAdapter.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean setViewValue(View view, Cursor cursor, int i5);
    }

    @Deprecated
    public d(Context context, int i5, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i5, cursor);
        this.E = -1;
        this.D = iArr;
        this.H = strArr;
        p(cursor, strArr);
    }

    private void p(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.C = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.C;
        if (iArr == null || iArr.length != length) {
            this.C = new int[length];
        }
        for (int i5 = 0; i5 < length; i5++) {
            this.C[i5] = cursor.getColumnIndexOrThrow(strArr[i5]);
        }
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public CharSequence convertToString(Cursor cursor) {
        a aVar = this.F;
        if (aVar != null) {
            return aVar.convertToString(cursor);
        }
        int i5 = this.E;
        return i5 > -1 ? cursor.getString(i5) : super.convertToString(cursor);
    }

    @Override // androidx.cursoradapter.widget.a
    public void d(View view, Context context, Cursor cursor) {
        b bVar = this.G;
        int[] iArr = this.D;
        int length = iArr.length;
        int[] iArr2 = this.C;
        for (int i5 = 0; i5 < length; i5++) {
            View findViewById = view.findViewById(iArr[i5]);
            if (findViewById != null) {
                if (bVar != null ? bVar.setViewValue(findViewById, cursor, iArr2[i5]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i5]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        x((TextView) findViewById, string);
                    } else {
                        if (!(findViewById instanceof ImageView)) {
                            throw new IllegalStateException(findViewById.getClass().getName().concat(" is not a  view that can be bounds by this SimpleCursorAdapter"));
                        }
                        w((ImageView) findViewById, string);
                    }
                }
            }
        }
    }

    @Override // androidx.cursoradapter.widget.a
    public Cursor l(Cursor cursor) {
        p(cursor, this.H);
        return super.l(cursor);
    }

    public void o(Cursor cursor, String[] strArr, int[] iArr) {
        this.H = strArr;
        this.D = iArr;
        p(cursor, strArr);
        super.a(cursor);
    }

    public a q() {
        return this.F;
    }

    public int r() {
        return this.E;
    }

    public b s() {
        return this.G;
    }

    public void t(a aVar) {
        this.F = aVar;
    }

    public void u(int i5) {
        this.E = i5;
    }

    public void v(b bVar) {
        this.G = bVar;
    }

    public void w(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void x(TextView textView, String str) {
        textView.setText(str);
    }

    public d(Context context, int i5, Cursor cursor, String[] strArr, int[] iArr, int i6) {
        super(context, i5, cursor, i6);
        this.E = -1;
        this.D = iArr;
        this.H = strArr;
        p(cursor, strArr);
    }
}
