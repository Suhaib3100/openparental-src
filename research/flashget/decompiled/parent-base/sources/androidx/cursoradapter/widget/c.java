package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes3.dex */
public abstract class c extends a {

    /* renamed from: m, reason: collision with root package name */
    private int f28317m;

    /* renamed from: n, reason: collision with root package name */
    private int f28318n;

    /* renamed from: o, reason: collision with root package name */
    private LayoutInflater f28319o;

    @Deprecated
    public c(Context context, int i4, Cursor cursor) {
        super(context, cursor);
        this.f28318n = i4;
        this.f28317m = i4;
        this.f28319o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f28319o.inflate(this.f28318n, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.a
    public View j(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f28319o.inflate(this.f28317m, viewGroup, false);
    }

    public void n(int i4) {
        this.f28318n = i4;
    }

    public void o(int i4) {
        this.f28317m = i4;
    }

    @Deprecated
    public c(Context context, int i4, Cursor cursor, boolean z4) {
        super(context, cursor, z4);
        this.f28318n = i4;
        this.f28317m = i4;
        this.f28319o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i4, Cursor cursor, int i5) {
        super(context, cursor, i5);
        this.f28318n = i4;
        this.f28317m = i4;
        this.f28319o = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
