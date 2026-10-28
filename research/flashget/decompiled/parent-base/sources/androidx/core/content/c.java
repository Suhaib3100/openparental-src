package androidx.core.content;

import android.content.ContentValues;
import kotlin.Metadata;
import kotlin.q0;

/* compiled from: ContentValues.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lkotlin/q0;", "", "", "pairs", "Landroid/content/ContentValues;", "a", "([Lkotlin/q0;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {
    @fg.l
    public static final ContentValues a(@fg.l q0<String, ? extends Object>... q0VarArr) {
        ContentValues contentValues = new ContentValues(q0VarArr.length);
        for (q0<String, ? extends Object> q0Var : q0VarArr) {
            String a5 = q0Var.a();
            Object b5 = q0Var.b();
            if (b5 == null) {
                contentValues.putNull(a5);
            } else if (b5 instanceof String) {
                contentValues.put(a5, (String) b5);
            } else if (b5 instanceof Integer) {
                contentValues.put(a5, (Integer) b5);
            } else if (b5 instanceof Long) {
                contentValues.put(a5, (Long) b5);
            } else if (b5 instanceof Boolean) {
                contentValues.put(a5, (Boolean) b5);
            } else if (b5 instanceof Float) {
                contentValues.put(a5, (Float) b5);
            } else if (b5 instanceof Double) {
                contentValues.put(a5, (Double) b5);
            } else if (b5 instanceof byte[]) {
                contentValues.put(a5, (byte[]) b5);
            } else if (b5 instanceof Byte) {
                contentValues.put(a5, (Byte) b5);
            } else {
                if (!(b5 instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + b5.getClass().getCanonicalName() + " for key \"" + a5 + kotlin.text.m0.quote);
                }
                contentValues.put(a5, (Short) b5);
            }
        }
        return contentValues;
    }
}
