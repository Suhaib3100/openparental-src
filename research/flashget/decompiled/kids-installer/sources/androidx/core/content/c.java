package androidx.core.content;

import android.content.ContentValues;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.l0;
import kotlin.text.Typography;

/* compiled from: ContentValues.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lkotlin/q0;", "", "", "pairs", "Landroid/content/ContentValues;", "a", "([Lkotlin/q0;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class c {
    @d5.d
    public static final ContentValues a(@d5.d Pair<String, ? extends Object>... pairs) {
        l0.p(pairs, "pairs");
        ContentValues contentValues = new ContentValues(pairs.length);
        int length = pairs.length;
        int i5 = 0;
        while (i5 < length) {
            Pair<String, ? extends Object> pair = pairs[i5];
            i5++;
            String a6 = pair.a();
            Object b6 = pair.b();
            if (b6 == null) {
                contentValues.putNull(a6);
            } else if (b6 instanceof String) {
                contentValues.put(a6, (String) b6);
            } else if (b6 instanceof Integer) {
                contentValues.put(a6, (Integer) b6);
            } else if (b6 instanceof Long) {
                contentValues.put(a6, (Long) b6);
            } else if (b6 instanceof Boolean) {
                contentValues.put(a6, (Boolean) b6);
            } else if (b6 instanceof Float) {
                contentValues.put(a6, (Float) b6);
            } else if (b6 instanceof Double) {
                contentValues.put(a6, (Double) b6);
            } else if (b6 instanceof byte[]) {
                contentValues.put(a6, (byte[]) b6);
            } else if (b6 instanceof Byte) {
                contentValues.put(a6, (Byte) b6);
            } else {
                if (!(b6 instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + ((Object) b6.getClass().getCanonicalName()) + " for key \"" + a6 + Typography.f27126b);
                }
                contentValues.put(a6, (Short) b6);
            }
        }
        return contentValues;
    }
}
