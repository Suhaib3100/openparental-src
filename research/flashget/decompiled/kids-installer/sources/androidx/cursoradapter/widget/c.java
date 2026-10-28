package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes3.dex */
public abstract class c extends a {
    private int A;
    private LayoutInflater B;

    /* renamed from: z, reason: collision with root package name */
    private int f5937z;

    @Deprecated
    public c(Context context, int i5, Cursor cursor) {
        super(context, cursor);
        this.A = i5;
        this.f5937z = i5;
        this.B = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.B.inflate(this.A, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.B.inflate(this.f5937z, viewGroup, false);
    }

    public void m(int i5) {
        this.A = i5;
    }

    public void n(int i5) {
        this.f5937z = i5;
    }

    @Deprecated
    public c(Context context, int i5, Cursor cursor, boolean z5) {
        super(context, cursor, z5);
        this.A = i5;
        this.f5937z = i5;
        this.B = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i5, Cursor cursor, int i6) {
        super(context, cursor, i6);
        this.A = i5;
        this.f5937z = i5;
        this.B = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
